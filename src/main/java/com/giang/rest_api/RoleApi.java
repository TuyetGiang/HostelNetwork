package com.giang.rest_api;

import com.giang.service.dto.RoleDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RequestMapping("role")
public interface RoleApi {
    @ApiOperation(tags = "ROLE", value = "Create new role", response = RoleDTO.class)
    @PostMapping("")
    ResponseEntity<RoleDTO> insert(@RequestBody RoleDTO dto);

    @ApiOperation(tags = "ROLE", value = "Delete a role", response = RoleDTO.class)
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> delete(@PathVariable("id") Integer id);


    @ApiOperation(tags = "ROLE", value = "Update a role", response = RoleDTO.class)
    @PutMapping("/{id}")
    ResponseEntity<RoleDTO> update(@PathVariable("id") Integer id,
                                   @RequestParam("key") String key,
                                   @RequestParam("value") Object value);

    @ApiOperation(tags = "ROLE", value = "Get all role", response = RoleDTO.class)
    @GetMapping("")
    ResponseEntity<List<RoleDTO>> getAll();

    @ApiOperation(tags = "ROLE", value = "Get a role", response = RoleDTO.class)
    @GetMapping("/{id}")
    ResponseEntity<RoleDTO> getrole(@PathVariable("id") Integer id);
}
