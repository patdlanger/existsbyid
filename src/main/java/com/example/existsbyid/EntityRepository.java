package com.example.existsbyid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntityRepository extends JpaRepository<TestEntity, Long> {

}
