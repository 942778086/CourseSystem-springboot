package com.wjx.web.controller.rest;

import com.wjx.mybatis.pojo.HadChoose;
import com.wjx.web.common.ExtendController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RequestMapping("/hadChoose")
@RestController
public class HadChooseController extends ExtendController<HadChoose> {
}
