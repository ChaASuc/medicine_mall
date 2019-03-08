package com.chen.medicine_mall.pojo;

import java.sql.Date;

public class Sum {
    private String cno;

    private String cname;

    private String csex;

    private Integer cage;

    private String caddress;

    private String cphone;

    private String csymptom;

    private Date cdate;

    private String ano;

    private String aname;

    private String asex;

    private String aphone;

    private String aremark;

    private String mno;

    private String mname;

    private String mmode;

    private String mefficacy;

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

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno == null ? null : mno.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMmode() {
        return mmode;
    }

    public void setMmode(String mmode) {
        this.mmode = mmode == null ? null : mmode.trim();
    }

    public String getMefficacy() {
        return mefficacy;
    }

    public void setMefficacy(String mefficacy) {
        this.mefficacy = mefficacy == null ? null : mefficacy.trim();
    }

    @Override
    public String toString() {
        return "Sum{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", csex='" + csex + '\'' +
                ", cage=" + cage +
                ", caddress='" + caddress + '\'' +
                ", cphone='" + cphone + '\'' +
                ", csymptom='" + csymptom + '\'' +
                ", cdate=" + cdate +
                ", ano='" + ano + '\'' +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", aphone='" + aphone + '\'' +
                ", aremark='" + aremark + '\'' +
                ", mno='" + mno + '\'' +
                ", mname='" + mname + '\'' +
                ", mmode='" + mmode + '\'' +
                ", mefficacy='" + mefficacy + '\'' +
                '}';
    }
}