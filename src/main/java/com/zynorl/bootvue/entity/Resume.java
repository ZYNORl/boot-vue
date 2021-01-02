package com.zynorl.bootvue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "resume")
@Setter
@Getter
@EqualsAndHashCode
public class Resume {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer stuid;
    @Column
    private String date;
    @Column
    private Integer position_id;
    public Resume() {
    }

    public Resume(Integer id, Integer stuid, String date, Integer position_id) {
        this.id = id;
        this.stuid = stuid;
        this.date = date;
        this.position_id = position_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"stuid\":")
                .append(stuid);
        sb.append(",\"date\":\"")
                .append(date).append('\"');
        sb.append(",\"position_id\":")
                .append(position_id);
        sb.append('}');
        return sb.toString();
    }
}
