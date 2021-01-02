package com.zynorl.bootvue.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="student")
@Setter
@Getter
@EqualsAndHashCode
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String sex;
    @Column
    private String photo;
    @Column
    private String birthday;
    @Column
    private String sf_id;
    @Column
    private String year_of_enrollment;
    @Column
    private String year_of_graduation;
    @Column
    private String collage;
    @Column
    private String major;
    @Column
    private String stu_number;
    @Column
    private String telephone;
    @Column
    private String email;
    @Column
    private String psword;
    @Column
    private  Integer status;
    public Student(){}

    public Student(Integer id, String name, String sex, String photo, String birthday, String sf_id, String year_of_enrollment, String year_of_graduation, String collage, String major, String stu_number, String telephone, String email, String psword, Integer status) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.photo = photo;
        this.birthday = birthday;
        this.sf_id = sf_id;
        this.year_of_enrollment = year_of_enrollment;
        this.year_of_graduation = year_of_graduation;
        this.collage = collage;
        this.major = major;
        this.stu_number = stu_number;
        this.telephone = telephone;
        this.email = email;
        this.psword = psword;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSf_id() {
        return sf_id;
    }

    public void setSf_id(String sf_id) {
        this.sf_id = sf_id;
    }

    public String getYear_of_enrollment() {
        return year_of_enrollment;
    }

    public void setYear_of_enrollment(String year_of_enrollment) {
        this.year_of_enrollment = year_of_enrollment;
    }

    public String getYear_of_graduation() {
        return year_of_graduation;
    }

    public void setYear_of_graduation(String year_of_graduation) {
        this.year_of_graduation = year_of_graduation;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStu_number() {
        return stu_number;
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsword() {
        return psword;
    }

    public void setPsword(String psword) {
        this.psword = psword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"sex\":\"")
                .append(sex).append('\"');
        sb.append(",\"photo\":\"")
                .append(photo).append('\"');
        sb.append(",\"birthday\":\"")
                .append(birthday).append('\"');
        sb.append(",\"sf_id\":\"")
                .append(sf_id).append('\"');
        sb.append(",\"year_of_enrollment\":\"")
                .append(year_of_enrollment).append('\"');
        sb.append(",\"year_of_graduation\":\"")
                .append(year_of_graduation).append('\"');
        sb.append(",\"collage\":\"")
                .append(collage).append('\"');
        sb.append(",\"major\":\"")
                .append(major).append('\"');
        sb.append(",\"stu_number\":\"")
                .append(stu_number).append('\"');
        sb.append(",\"telephone\":\"")
                .append(telephone).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"psword\":\"")
                .append(psword).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append('}');
        return sb.toString();
    }
}
