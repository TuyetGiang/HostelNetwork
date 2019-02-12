package com.giang.rest_api.impl;

import com.giang.rest_api.PostApi;
import com.giang.service.dto.PostDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class PostController implements PostApi {
    @Override
    public ResponseEntity<List<PostDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<PostDTO> blockPost(Integer id, Boolean status) {
        return null;
    }

    @Override
    public ResponseEntity<List<PostDTO>> getPostByTime(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return null;
    }
}
