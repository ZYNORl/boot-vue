package com.zynorl.bootvue.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "t_position")
@Setter
@Getter
@EqualsAndHashCode
public class Position {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pid;
    @ManyToOne
    @JoinColumn(name="cid")
    private Company company;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer maxp;
    @Column
    private String salary;
    @Column
    private String address;
    @Column
    private Integer type;
    @Column
    private  String edu_bk;
    @Column
    private String lablel;
    @Column
    private Integer status;
    @Column
    private String pu_data;

    public String getPu_data() {
        return pu_data;
    }

    public void setPu_data(String pu_data) {
        this.pu_data = pu_data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxp() {
        return maxp;
    }

    public void setMax(Integer maxp) {
        this.maxp = maxp;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEdu_bk() {
        return edu_bk;
    }

    public void setEdu_bk(String edu_bk) {
        this.edu_bk = edu_bk;
    }

    public String getLablel() {
        return lablel;
    }

    public void setLable(String lablel) {
        this.lablel = lablel;
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
        sb.append("\"pid\":")
                .append(pid);
        sb.append(",\"company\":\"")
                .append(company.getName()).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"maxp\":")
                .append(maxp);
        sb.append(",\"salary\":\"")
                .append(salary).append('\"');
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append(",\"type\":")
                .append(type);
        sb.append(",\"edu_bk\":\"")
                .append(edu_bk).append('\"');
        sb.append(",\"lablel\":\"")
                .append(lablel).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append(",\"pu_data\":\"")
                .append(pu_data).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
