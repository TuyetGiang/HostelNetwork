package com.giang.service;

import com.giang.service.dto.BenefitDTO;

import java.util.List;

public interface BenefitService {
    List<BenefitDTO> getAll();
    BenefitDTO getABenefit(Integer id);
    Boolean deleteBenefit(Integer id);
    BenefitDTO insertBenefit(BenefitDTO dto);
    BenefitDTO changeNameBenefit(Integer id, String benefitName);
}
