package com.giang.rest_api.impl;

import com.giang.rest_api.PostApi;
import com.giang.service.PostService;
import com.giang.service.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PostController implements PostApi {

    @Autowired
    PostService postService;

    @Override
    public ResponseEntity<List<PostDTO>> getAll() {
        return ResponseEntity.ok(postService.getAll());
    }

    @Override
    public ResponseEntity<PostDTO> blockPost(@PathVariable("id") Integer id,
                                             @RequestParam("status") Boolean status) {
        return ResponseEntity.ok(postService.updateStatus(id, status));
    }

    @Override
    public ResponseEntity<List<PostDTO>> getPostByTime(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                                       @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return ResponseEntity.ok(postService.getPostByTimes(from, to));
    }
}
