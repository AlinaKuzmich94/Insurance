package com.eis.insurance.repository;

import com.eis.insurance.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuredObjectRepository extends JpaRepository<Policy, Long> {

}
