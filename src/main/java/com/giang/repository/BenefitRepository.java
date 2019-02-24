package com.giang.repository;

import com.giang.repository.entity.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Long> {
    @Query("SELECT b FROM Benefit b WHERE b.id = ?1")
    Benefit findOneById(Integer id);


}
