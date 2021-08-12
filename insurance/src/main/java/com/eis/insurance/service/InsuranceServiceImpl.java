package com.eis.insurance.service;

import com.eis.insurance.model.dto.PolicyDTO;
import com.eis.insurance.repository.PolicyRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andrey.semenov
 */
@Service
public class InsuranceServiceImpl implements InsuranceService {

  @Autowired
  PolicyRepository policyRepository;

  @Override
  public void savePolicy(PolicyDTO policyDTO) {
    policyRepository.save(policyDTO.getPolicy());
  }

  @Override
  public List<PolicyDTO> getPolicyList() {
    return policyRepository.findAll().stream().map(PolicyDTO::new).collect(Collectors.toList());
  }
}
