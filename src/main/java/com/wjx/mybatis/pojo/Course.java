package com.wjx.mybatis.pojo;


import javax.persistence.*;

@Table(name = "course")
public class Course {
    @Id
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_department")
    private String courseDepartment;

    @Column(name = "course_time")
    private String courseTime;

    @Column(name = "course_location")
    private String courseLocation;

    @Column(name = "course_teacher")
    private String courseTeacher;

    @Column(name = "course_credit")
    private Float courseCredit;

    @Column(name = "course_mixnumber")
    private Integer courseMixnumber;

    @Column(name = "course_isFull")
    private Boolean courseIsfull;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }


    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return course_name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * @return course_department
     */
    public String getCourseDepartment() {
        return courseDepartment;
    }

    /**
     * @param courseDepartment
     */
    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment == null ? null : courseDepartment.trim();
    }

    /**
     * @return course_time
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * @param courseTime
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }

    /**
     * @return course_location
     */
    public String getCourseLocation() {
        return courseLocation;
    }

    /**
     * @param courseLocation
     */
    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation == null ? null : courseLocation.trim();
    }

    /**
     * @return course_teacher
     */
    public String getCourseTeacher() {
        return courseTeacher;
    }

    /**
     * @param courseTeacher
     */
    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher == null ? null : courseTeacher.trim();
    }

    /**
     * @return course_credit
     */
    public Float getCourseCredit() {
        return courseCredit;
    }

    /**
     * @param courseCredit
     */
    public void setCourseCredit(Float courseCredit) {
        this.courseCredit = courseCredit;
    }

    /**
     * @return course_mixnumber
     */
    public Integer getCourseMixnumber() {
        return courseMixnumber;
    }

    /**
     * @param courseMixnumber
     */
    public void setCourseMixnumber(Integer courseMixnumber) {
        this.courseMixnumber = courseMixnumber;
    }

    /**
     * @return course_isfull
     */
    public Boolean getCourseIsfull() {
        return courseIsfull;
    }

    /**
     * @param courseIsfull
     */
    public void setCourseIsfull(Boolean courseIsfull) {
        this.courseIsfull = courseIsfull;
    }
}