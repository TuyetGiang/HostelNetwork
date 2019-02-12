package com.giang.rest_api.impl;

import com.giang.rest_api.ApartmentApi;
import com.giang.service.dto.ApartmentDTO;
import com.giang.service.dto.PostDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ApartmentController implements ApartmentApi {
    @Override
    public ResponseEntity<List<ApartmentDTO>> getAll() {
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
