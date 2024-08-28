package com.cvl.repo;

import com.cvl.bean.ClientVisitDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientVisitDetailsRepository extends JpaRepository<ClientVisitDetails,String> {
}