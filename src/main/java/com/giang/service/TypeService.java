package com.giang.service;

import com.giang.service.dto.TypeDTO;

import java.util.List;

public interface TypeService {
    List<TypeDTO> getAll();

    TypeDTO findById(Integer id);

    TypeDTO createNew(TypeDTO newType);

    TypeDTO changeName(Integer id, String name);

    Boolean deleteType(Integer id);
}
