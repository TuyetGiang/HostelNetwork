package com.giang.service.impl;

import com.giang.repository.TypeRepository;
import com.giang.repository.entity.Type;
import com.giang.service.TypeService;
import com.giang.service.dto.TypeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<TypeDTO> getAll() {
        return typeRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public TypeDTO findById(Integer id) {
        Type type = typeRepository.findById(id);
        return mapToDto(type);
    }

    @Override
    public TypeDTO createNew(TypeDTO newType) {
        ModelMapper modelMapper = new ModelMapper();
        Type type = modelMapper.map(newType, Type.class);
        type = typeRepository.saveAndFlush(type);
        return mapToDto(type);
    }

    @Override
    public TypeDTO changeName(Integer id, String name) {
        Type type = typeRepository.findById(id);
        Optional.ofNullable(type).orElseThrow(EntityNotFoundException::new);

        type.setTypeName(name);
        type = typeRepository.saveAndFlush(type);
        return mapToDto(type);
    }

    @Override
    public Boolean deleteType(Integer id) {
        Type type = typeRepository.findById(id);
        Optional.ofNullable(type).orElseThrow(EntityNotFoundException::new);
        typeRepository.delete(type);
        return true;
    }

    private TypeDTO mapToDto(Type entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, TypeDTO.class);
    }
}
