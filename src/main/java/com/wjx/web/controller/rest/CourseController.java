package com.wjx.web.controller.rest;

import com.wjx.mybatis.pojo.Course;
import com.wjx.web.common.ExtendController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController
@RequestMapping(value = "course")
public class CourseController extends ExtendController<Course> {
}
