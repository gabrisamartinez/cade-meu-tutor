package br.univille.cademeututor.modelVO;

public class UserVO {
    private long id;
    private String name;
    private String password;
    private String confirmPassword;
    private String email;
    private String federalIdentification;
    private String cellphone;
    private Boolean isOng;
    
    public UserVO(String name, String email, String password, String confirmPassword, String federalIdentification, String cellphone, Boolean isOng) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.federalIdentification = federalIdentification;
        this.cellphone = cellphone;
        this.isOng = isOng;
    }
    
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public Boolean getIsOng() {
        return isOng;
    }

    public void setIsOng(Boolean isOng) {
        this.isOng = isOng;
    }
}
