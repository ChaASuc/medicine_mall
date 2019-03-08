package com.chen.medicine_mall.pojo;

import java.sql.Date;

public class Client {
    private String cno;

    private String cname;

    private String csex;

    private Integer cage;

    private String caddress;

    private String cphone;

    private String csymptom;


    private Date cdate;

    private String cpassword;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public Integer getCage() {
        return cage;
    }

    public void setCage(Integer cage) {
        this.cage = cage;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getCsymptom() {
        return csymptom;
    }

    public void setCsymptom(String csymptom) {
        this.csymptom = csymptom == null ? null : csymptom.trim();
    }


    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword == null ? null : cpassword.trim();
    }

    @Override
    public String toString() {
        return "Client{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", csex='" + csex + '\'' +
                ", cage=" + cage +
                ", caddress='" + caddress + '\'' +
                ", cphone='" + cphone + '\'' +
                ", csymptom='" + csymptom + '\'' +
                ", cdate=" + cdate +
                ", cpassword='" + cpassword + '\'' +
                '}';
    }

}