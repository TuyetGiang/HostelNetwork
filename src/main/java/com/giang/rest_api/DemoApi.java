package com.giang.rest_api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/demo")
public interface DemoApi {

    @ApiOperation(tags = {"DEMO"}, notes = "", value = "demo")
    @GetMapping("")
    ResponseEntity<String> demo();
}
