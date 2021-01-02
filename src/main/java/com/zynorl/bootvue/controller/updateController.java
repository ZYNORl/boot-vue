package com.zynorl.bootvue.controller;

import com.zynorl.bootvue.entity.House;
import com.zynorl.bootvue.entity.Resume;
import com.zynorl.bootvue.entity.Student;
import com.zynorl.bootvue.repository.HouseRepository;
import com.zynorl.bootvue.repository.LoginRepository;
import com.zynorl.bootvue.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class updateController {

    @Autowired
    private LoginRepository loginRepository;
    public Student stu = new Student();

    @CrossOrigin
    @RequestMapping("/loginTest")
    public String login(HttpServletRequest request, HttpSession session){
        String telephone = request.getParameter("telephone");
        String psword = request.getParameter("psword");
        stu = loginRepository.findByTelephoneAndPsword(telephone,psword);
        System.out.println(stu.getId());
        String str = "";
        if(stu!=null){
            session.setAttribute("stuLogin",stu);
            str = "index";
        }else{
            str = "login";
        }
        return str;
    }

    @Autowired
    private HouseRepository houseRepository;
    @CrossOrigin
    @PostMapping("/SingleFile/upload")
    public String SingleFileUpLoad(@RequestParam("myfile") MultipartFile file, Model model) {

        //判断文件是否为空
        if (file.isEmpty()) {
            model.addAttribute("result_singlefile", "文件为空");
            return "index";
        }

        //创建输入输出流
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            //指定上传的位置为 d:/upload/
//            String path = "D:\\VUEwork\\vue_project\\boot-vue\\src\\main\\resources\\static\\file\\";
           // String path = ".\\src\\main\\resources\\static\\file\\";
            String path = "file/upload";

            //获取文件的输入流
            inputStream = file.getInputStream();
            //获取上传时的文件名
            String fileName = file.getOriginalFilename();
            String houseUrl="http://zynorl.top:89/file/"+fileName;
            //注意是路径+文件名
            File targetFile = new File(path + fileName);

            //如果之前的 String path = "d:/upload/" 没有在最后加 / ，那就要在 path 后面 + "/"

            //判断文件父目录是否存在
            if (!targetFile.getParentFile().exists()) {
                //不存在就创建一个
                targetFile.getParentFile().mkdir();
            }
            House re = new House();
            re.setUrl(houseUrl);
            re.setStuid(stu.getId());
            houseRepository.save(re);

            System.out.println(houseUrl);


            //获取文件的输出流
            outputStream = new FileOutputStream(targetFile);
            //最后使用资源访问器FileCopyUtils的copy方法拷贝文件
            FileCopyUtils.copy(inputStream, outputStream);
            /*参数是通过源码
                public static int copy(InputStream in, OutputStream out) throws IOException {
                    ......
                }
           而得知的*/

            //告诉页面上传成功了
            model.addAttribute("result_singlefile", "上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            //出现异常，则告诉页面失败
            model.addAttribute("result_singlefile", "上传失败");
        } finally {
            //无论成功与否，都有关闭输入输出流
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "index";
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/findurlbystuoid")
    List<House> findurlbystuoid(){return houseRepository.findByStuid(stu.getId());}

    @Autowired
    private ResumeRepository resumeRepository;
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/findbyownerid")
    List<Resume> findByOwner_id(){return resumeRepository.findByStuid(stu.getId());}

    @CrossOrigin
    @GetMapping("deleteurl")
    public void delete(Integer id){
        houseRepository.deleteById(id);
    }
}
