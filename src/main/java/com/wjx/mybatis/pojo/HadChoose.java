package com.wjx.mybatis.pojo;

import javax.persistence.Id;

public class HadChoose {
    @Id
    private Long id;

    private String course;

    private String teacher;

    private String student;

    private Boolean ispass;

    private String courseDepartment;

    private String courseTime;

    private String courseLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    public Boolean getIspass() {
        return ispass;
    }

    public void setIspass(Boolean ispass) {
        this.ispass = ispass;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment == null ? null : courseDepartment.trim();
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation == null ? null : courseLocation.trim();
    }
}