package com.chen.medicine_mall.pojo;

public class Admin {
    private String ano;

    private String aname;

    private String asex;

    private Integer aage;

    private String acaddress;

    private String acphone;

    private String apassword;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano == null ? null : ano.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex == null ? null : asex.trim();
    }

    public Integer getAage() {
        return aage;
    }

    public void setAage(Integer aage) {
        this.aage = aage;
    }

    public String getAcaddress() {
        return acaddress;
    }

    public void setAcaddress(String acaddress) {
        this.acaddress = acaddress == null ? null : acaddress.trim();
    }

    public String getAcphone() {
        return acphone;
    }

    public void setAcphone(String acphone) {
        this.acphone = acphone == null ? null : acphone.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ano='" + ano + '\'' +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", aage=" + aage +
                ", acaddress='" + acaddress + '\'' +
                ", acphone='" + acphone + '\'' +
                ", apassword='" + apassword + '\'' +
                '}';
    }
}