package com.eis.insurance.service;

import com.eis.insurance.model.dto.PolicyDTO;
import java.util.List;

/**
 * @author andrey.semenov
 */
public interface InsuranceService {

  void savePolicy(PolicyDTO policyDTO);

  List<PolicyDTO> getPolicyList();
}
