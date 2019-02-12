package com.giang.rest_api;

import com.giang.service.dto.ApartmentDTO;
import com.giang.service.dto.PostDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequestMapping("apartments")
public interface ApartmentApi {
    @ApiOperation(tags = {"APARTMENT"}, value = "Get all aprtments", response = ApartmentDTO.class)
    @GetMapping("")
    ResponseEntity<List<ApartmentDTO>> getAll();

    @ApiOperation(tags = {"APARTMENT"}, value = "Block/Unblock an apartment", response = ApartmentDTO.class)
    @PutMapping("/{id}")
    ResponseEntity<PostDTO> blockPost(@PathVariable("id") Integer id,
                                      @RequestParam("status") Boolean status);

    @ApiOperation(tags = {"APARTMENT"}, value = "Get all apartments be created between start time and end time", response = ApartmentDTO.class)
    @GetMapping("/times")
    ResponseEntity<List<PostDTO>> getPostByTime(@RequestParam("start") LocalDateTime startDateTime,
                                                @RequestParam("end") LocalDateTime endDateTime);

}
