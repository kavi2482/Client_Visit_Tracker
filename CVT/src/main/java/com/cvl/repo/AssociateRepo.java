package com.cvl.repo;

import com.cvl.bean.Associate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepo extends JpaRepository<Associate,Integer> {
}
