package com.giang.rest_api;

import com.giang.service.dto.TypeDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RequestMapping("types")
public interface TypeApi {
    @ApiOperation(tags = "TYPE", value = "Create new a TYPE", response = TypeDTO.class)
    @PostMapping("")
    ResponseEntity<TypeDTO> insert(@RequestBody TypeDTO dto);

    @ApiOperation(tags = "TYPE", value = "Delete a TYPE", response = TypeDTO.class)
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> delete(@PathVariable("id") Integer id);


    @ApiOperation(tags = "TYPE", value = "Update a TYPE", response = TypeDTO.class)
    @PutMapping("/{id}")
    ResponseEntity<TypeDTO> update(@PathVariable("id") Integer id,
                                   @RequestParam("key") String key,
                                   @RequestParam("value") Object value);

    @ApiOperation(tags = "TYPE", value = "Get all TYPEs", response = TypeDTO.class)
    @GetMapping("")
    ResponseEntity<List<TypeDTO>> getAll();

    @ApiOperation(tags = "TYPE", value = "Get a TYPE", response = TypeDTO.class)
    @GetMapping("/{id}")
    ResponseEntity<TypeDTO> getTYPE(@PathVariable("id") Integer id);


}
