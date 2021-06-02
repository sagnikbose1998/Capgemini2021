package com.capgemini.studentlist;

public class Student {

//    Data members
    private int sid;
    private String sname;

//    Constructor
    public Student(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }

//    Getters
    public int getSid() { return sid; }
    public String getSname() { return sname; }

//    Setters
    public void setSname(String sname) { this.sname = sname; }
}

