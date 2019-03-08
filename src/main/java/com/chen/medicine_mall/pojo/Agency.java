package com.chen.medicine_mall.pojo;

public class Agency {
    private String ano;

    private String aname;

    private String asex;

    private String aphone;

    private String aremark;

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

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAremark() {
        return aremark;
    }

    public void setAremark(String aremark) {
        this.aremark = aremark == null ? null : aremark.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    @Override
    public String toString() {
        return "Agency{" +
                "ano='" + ano + '\'' +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", aphone='" + aphone + '\'' +
                ", aremark='" + aremark + '\'' +
                ", apassword='" + apassword + '\'' +
                '}';
    }
}