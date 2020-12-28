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
    private String name;
    @Column
    private String address;
    @Column
    private Integer owner_id;
    @Column
    private String date;

    public Resume() {
    }

    public Resume(Integer id, String name, String address, Integer owner_id, String date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.owner_id = owner_id;
        this.date = date;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append(",\"owner_id\":")
                .append(owner_id);
        sb.append(",\"date\":\"")
                .append(date).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
