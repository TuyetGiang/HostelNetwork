package com.giang.repository;

import com.giang.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.fullname LIKE ?1")
    List<User> findAllByFullName(String fullName);

    @Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
    User findByUsernameAndPassword(String username, String password);


    @Query("UPDATE User u SET u.isBlocked = ?2 WHERE u.id = ?1")
    @Modifying
    void updateStatusUser(Integer id, Boolean status);


    @Query("SELECT u FROM User u WHERE u.id LIKE ?1")
    User findById(Integer id);

    @Query("SELECT u FROM User u WHERE u.registDate >= ?1 AND u.registDate <= ?2")
    List<User> findUserByTime(LocalDate from, LocalDate to);

    @Query("UPDATE User u SET u.amount = ?2 WHERE u.id = ?1")
    @Modifying
    void updateMoney(Integer id, Double money);

    @Query("UPDATE User u SET u.password = ?2 WHERE u.id = ?1")
    @Modifying
    void updatePassword(Integer id, String newPassword);
}
