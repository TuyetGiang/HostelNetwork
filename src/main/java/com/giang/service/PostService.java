package com.giang.service;

import com.giang.service.dto.PostDTO;

import java.time.LocalDate;
import java.util.List;

public interface PostService {
    List<PostDTO> getAll();
    PostDTO updateStatus(Integer id, Boolean status);
    List<PostDTO> getPostByTimes(LocalDate from, LocalDate to);
}
