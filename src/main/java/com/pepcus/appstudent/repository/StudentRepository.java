package com.pepcus.appstudent.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.pepcus.appstudent.entity.Student;

/**
 * Repository for student entity
 * 
 * @author Shubham Solanki
 * @since 12-02-2018
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

    public Student findByIdAndSecretKey(Integer id, String secretKey);

    public List<Student> findByIdIn(List<Integer> ids);

    @Query(value = "update Student s set s.printStatus='N' where s.printStatus='Y'")
    @Transactional
    @Modifying
    public void resetPrintStatus();

    public List<Integer> findIdByIdIn(List<Integer> ids);
}
