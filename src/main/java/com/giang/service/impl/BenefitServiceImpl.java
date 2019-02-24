package com.giang.service.impl;

import com.giang.repository.BenefitRepository;
import com.giang.repository.entity.Benefit;
import com.giang.service.BenefitService;
import com.giang.service.dto.BenefitDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BenefitServiceImpl implements BenefitService {

    private final BenefitRepository benefitRepository;

    public BenefitServiceImpl(BenefitRepository benefitRepository) {
        this.benefitRepository = benefitRepository;
    }

    @Override
    public List<BenefitDTO> getAll() {
        return benefitRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public BenefitDTO getABenefit(Integer id) {
        Benefit benefit = benefitRepository.findOneById(id);
        Optional.ofNullable(benefit).orElseThrow(EntityNotFoundException::new);
        return mapToDto(benefit);
    }

    @Override
    public Boolean deleteBenefit(Integer id) {
        Benefit benefit = benefitRepository.findOneById(id);
        Optional.ofNullable(benefit).orElseThrow(EntityNotFoundException::new);
        benefitRepository.delete(benefit);
        return true;
    }

    @Override
    public BenefitDTO insertBenefit(BenefitDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        Benefit benefit = benefitRepository.saveAndFlush(modelMapper.map(dto, Benefit.class));

        return mapToDto(benefit);
    }

    @Override
    public BenefitDTO changeNameBenefit(Integer id, String benefitName) {
        Benefit benefit = benefitRepository.findOneById(id);
        Optional.ofNullable(benefit).orElseThrow(EntityNotFoundException::new);
        benefit.setBenefitName(benefitName);
        benefit = benefitRepository.saveAndFlush(benefit);
        return mapToDto(benefit);
    }

    private BenefitDTO mapToDto(Benefit entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, BenefitDTO.class);
    }
}
