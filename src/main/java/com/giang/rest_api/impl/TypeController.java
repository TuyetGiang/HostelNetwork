package com.giang.rest_api.impl;

import com.giang.rest_api.TypeApi;
import com.giang.service.TypeService;
import com.giang.service.dto.TypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController implements TypeApi {

    @Autowired
    TypeService typeService;

    @Override
    public ResponseEntity<TypeDTO> insert(@RequestBody TypeDTO dto) {
        return ResponseEntity.ok(typeService.createNew(dto));
    }

    @Override
    public ResponseEntity<Boolean> delete(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(typeService.deleteType(id));
    }

    @Override
    public ResponseEntity<TypeDTO> changeTypeName(@PathVariable("id") Integer id,
                                                  @RequestParam("name") String name) {
        return ResponseEntity.ok(typeService.changeName(id, name));
    }

    @Override
    public ResponseEntity<List<TypeDTO>> getAll() {
        return ResponseEntity.ok(typeService.getAll());
    }

    @Override
    public ResponseEntity<TypeDTO> getType(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(typeService.findById(id));
    }
}
