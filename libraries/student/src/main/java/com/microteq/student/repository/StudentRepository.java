package com.microteq.student.repository;

import com.microteq.student.entity.student.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);

    @Modifying
    @Query("DELETE FROM Student e WHERE e.studentId = :studentId")
    void deleteByStudentId(@Param("studentId") String studentId);

    @Override
    Page<Student> findAll(Pageable pageable);

    @Query("SELECT s, a.balance FROM Student s JOIN StudentAccount a ON s.studentId = a.studentId WHERE s.studentId = :studentId")
    List<Object[]> findStudentAndAccountBalanceByStudentId(@Param("studentId") String studentId);

    @Query("SELECT s, a.balance FROM Student s JOIN StudentAccount a ON s.studentId = a.studentId")
    Page<Object[]> findAllStudentsAndAccountBalances(Pageable pageable);

    boolean existsByStudentId(String studentId);
}
