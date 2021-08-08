package com.archetype.project.controller;

import com.archetype.project.bean.ResponseInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Think
 * @date: 2021/8/8
 */
@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @ApiOperation(value = "测试接口", httpMethod = "GET", notes = "测试接口", tags = "测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseInfo test(HttpServletRequest request, HttpServletResponse response,
                             @RequestParam("postDate") String postDate) {
        LOGGER.info("输入的postDate为{}", postDate);
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setData(postDate);
        return responseInfo;
    }

}
