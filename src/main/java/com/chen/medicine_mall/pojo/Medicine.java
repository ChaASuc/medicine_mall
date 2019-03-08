package com.chen.medicine_mall.pojo;

public class Medicine {
    private String mno;

    private String mname;

    private String mmode;

    private String mefficacy;

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
        return "Medicine{" +
                "mno='" + mno + '\'' +
                ", mname='" + mname + '\'' +
                ", mmode='" + mmode + '\'' +
                ", mefficacy='" + mefficacy + '\'' +
                '}';
    }
}