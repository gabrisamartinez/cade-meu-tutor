package br.univille.cademeututor.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.univille.cademeututor.enums.Resources;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 1000)
    private String name;
    
    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String password;

    @Column(length = 14)
    private String federalIdentification;

    @Column(length = 10)
    private String cellphone;

    @Column(length = 03)
    private Resources resources;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFederalIdentification() {
        return federalIdentification;
    }

    public void setFederalIdentification(String federalIdentification) {
        this.federalIdentification = federalIdentification;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }
}