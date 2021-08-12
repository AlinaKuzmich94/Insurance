package com.eis.insurance.model.dto;

import com.eis.insurance.model.CoverageOptionEnum;
import com.eis.insurance.model.Policy;
import lombok.Data;
import java.time.Instant;

@Data
public class PolicyDTO {

    private Long id;

    private Instant beginning;

    private Instant end;

    private CoverageOptionEnum type;

    private InsuredObjectDTO insuredObject;

    public PolicyDTO(Policy policy){

        this.id = policy.getId();

        this.beginning = policy.getBeginning();

        this.end = policy.getEnd();

        this.type = policy.getType();

        this.insuredObject = new InsuredObjectDTO(policy.getInsuredObject());
    }

    public Policy getPolicy(){

        Policy policy = new Policy();

        policy.setBeginning(this.getBeginning());

        policy.setEnd(this.getEnd());

        policy.setType(this.getType());

        policy.setInsuredObject(this.getInsuredObject().getInsuredObject());

        return policy;
    }
}
