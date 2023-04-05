package com.example.existsbyid;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EntityRepositoryImpl extends SimpleJpaRepository<TestEntity, Long> implements EntityRepository {

  public EntityRepositoryImpl(
      EntityManager em) {
    super(TestEntity.class, em);
  }
}
