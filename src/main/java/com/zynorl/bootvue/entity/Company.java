package com.zynorl.bootvue.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="t_company")
@Setter
@Getter
@EqualsAndHashCode
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer cid;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Position> positionList;
    @Column
    private String name;
    @Column
    private String company_id;
    @Column
    private String logo;
    @Column
    private String description;
    @Column
    private String address;
    @Column
    private String legal_person;
    @Column
    private String telephone;
    @Column
    private String email;
    @Column
    private String paword;
    @Column
    private Integer status;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegal_person() {
        return legal_person;
    }

    public void setLegal_person(String legal_person) {
        this.legal_person = legal_person;
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

    public String getPaword() {
        return paword;
    }

    public void setPaword(String paword) {
        this.paword = paword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"cid\":")
                .append(cid);
        sb.append(",\"positionList\":")
                .append(positionList);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"company_id\":\"")
                .append(company_id).append('\"');
        sb.append(",\"logo\":\"")
                .append(logo).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append(",\"legal_person\":\"")
                .append(legal_person).append('\"');
        sb.append(",\"telephone\":\"")
                .append(telephone).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"paword\":\"")
                .append(paword).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append('}');
        return sb.toString();
    }
}
