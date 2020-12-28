package com.zynorl.bootvue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "t_check")
@Setter
@Getter
@EqualsAndHashCode

public class Check {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer admire_id;

    @Column
    private String date;

    @Column
    private String last_date;

    @Column
    private Integer status;

    @Column
    private Integer stuid;

    @Column
    private Integer compid;

    public Check() {
    }

    public Check(Integer id, Integer admire_id, String date, String last_date, Integer status, Integer stuid, Integer compid) {
        this.id = id;
        this.admire_id = admire_id;
        this.date = date;
        this.last_date = last_date;
        this.status = status;
        this.stuid = stuid;
        this.compid = compid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdmire_id() {
        return admire_id;
    }

    public void setAdmire_id(Integer admire_id) {
        this.admire_id = admire_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLast_date() {
        return last_date;
    }

    public void setLast_date(String last_date) {
        this.last_date = last_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCompid() {
        return compid;
    }

    public void setCompid(Integer compid) {
        this.compid = compid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"admire_id\":")
                .append(admire_id);
        sb.append(",\"date\":\"")
                .append(date).append('\"');
        sb.append(",\"last_date\":\"")
                .append(last_date).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append(",\"stuid\":")
                .append(stuid);
        sb.append(",\"compid\":")
                .append(compid);
        sb.append('}');
        return sb.toString();
    }
}
