package com.wjx.web.controller.rest;

import com.wjx.mybatis.pojo.Student;
import com.wjx.web.common.ExtendController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController extends ExtendController<Student> {
}
