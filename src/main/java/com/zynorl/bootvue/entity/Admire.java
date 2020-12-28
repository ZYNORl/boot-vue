package com.zynorl.bootvue.entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "admire")
@Setter
@Getter
@EqualsAndHashCode

public class Admire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String sf_id;

    @Column
    private String name;

    @Column
    private String telephone;

    @Column
    private String email;

    @Column
    private String psword;
    public Admire(){}

    public Admire(Integer id, String sf_id, String name, String telephone, String email, String psword) {
        this.id = id;
        this.sf_id = sf_id;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.psword = psword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSf_id() {
        return sf_id;
    }

    public void setSf_id(String sf_id) {
        this.sf_id = sf_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"sf_id\":\"")
                .append(sf_id).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"telephone\":\"")
                .append(telephone).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"psword\":\"")
                .append(psword).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
