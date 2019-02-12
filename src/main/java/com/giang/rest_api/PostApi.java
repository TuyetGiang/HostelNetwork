package com.giang.rest_api;

import com.giang.service.dto.PostDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequestMapping("/posts")
public interface PostApi {
    @ApiOperation(tags = {"POST"}, value = "Get all posts", response = PostDTO.class)
    @GetMapping("")
    ResponseEntity<List<PostDTO>> getAll();

    @ApiOperation(tags = {"POST"}, value = "Block/Unblock a post", response = PostDTO.class)
    @PutMapping("/{id}")
    ResponseEntity<PostDTO> blockPost(@PathVariable("id") Integer id,
                                      @RequestParam("status") Boolean status);

    @ApiOperation(tags = {"POST"}, value = "Get all posts between start time and end time", response = PostDTO.class)
    @GetMapping("/times")
    ResponseEntity<List<PostDTO>> getPostByTime(@RequestParam("start") LocalDateTime startDateTime,
                                                @RequestParam("end") LocalDateTime endDateTime);




}
