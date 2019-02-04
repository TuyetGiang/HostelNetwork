package com.giang.rest_api.impl;

import com.giang.rest_api.DemoApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoApi {
    @Override
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Demo api succesfu1");
    }
}
