package com.giang.rest_api.impl;

import com.giang.rest_api.TypeApi;
import com.giang.service.dto.TypeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController  implements TypeApi {
    @Override
    public ResponseEntity<TypeDTO> insert(TypeDTO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<TypeDTO> update(Integer id, String key, Object value) {
        return null;
    }

    @Override
    public ResponseEntity<List<TypeDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<TypeDTO> getTYPE(Integer id) {
        return null;
    }
}
