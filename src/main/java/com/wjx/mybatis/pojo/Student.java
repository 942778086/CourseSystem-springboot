package com.wjx.mybatis.pojo;

import javax.persistence.Id;

public class Student {
    @Id
    private Long id;

    private String studentPassword;

    private String studentDepartment;

    private String studentName;

    private String studentClass;

    private String studentCourse1;

    private String studentCourse2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment == null ? null : studentDepartment.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    public String getStudentCourse1() {
        return studentCourse1;
    }

    public void setStudentCourse1(String studentCourse1) {
        this.studentCourse1 = studentCourse1 == null ? null : studentCourse1.trim();
    }

    public String getStudentCourse2() {
        return studentCourse2;
    }

    public void setStudentCourse2(String studentCourse2) {
        this.studentCourse2 = studentCourse2 == null ? null : studentCourse2.trim();
    }
}