package com.giang.rest_api.impl;

import com.giang.rest_api.RoleApi;
import com.giang.service.dto.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController implements RoleApi {
    @Override
    public ResponseEntity<RoleDTO> insert(@RequestBody RoleDTO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<RoleDTO> update(@PathVariable("id") Integer id,
                                          @RequestParam("key") String key,
                                          @RequestParam("value") Object value) {
        return null;
    }

    @Override
    public ResponseEntity<List<RoleDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<RoleDTO> getrole(@PathVariable("id") Integer id) {
        return null;
    }
}
