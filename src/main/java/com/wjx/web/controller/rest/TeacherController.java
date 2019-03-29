package com.wjx.web.controller.rest;

import com.wjx.mybatis.pojo.Teacher;
import com.wjx.web.common.ExtendController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends ExtendController<Teacher> {
}
