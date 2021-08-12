package com.eis.insurance.model.dto;

import com.eis.insurance.model.Client;
import com.eis.insurance.model.CoverageOptionEnum;
import com.eis.insurance.model.InsuredObject;
import java.util.stream.Collectors;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class InsuredObjectDTO {

    private Long id;

    private String privateCode;

    private CoverageOptionEnum type;

    private ClientDTO client;

    private List<PolicyDTO> policies = new ArrayList<>();

    public InsuredObjectDTO(InsuredObject insuredObject){

        this.id = insuredObject.getId();

        this.privateCode = insuredObject.getPrivateCode();

        this.type = insuredObject.getType();

        this.client = new ClientDTO(insuredObject.getClient());

        insuredObject.getPolicies().forEach(e -> this.policies.add(new PolicyDTO(e)));

    }

    public InsuredObject getInsuredObject(){

        InsuredObject insuredObject = new InsuredObject();

        insuredObject.setPrivateCode(this.privateCode);

        insuredObject.setType(this.type);

        insuredObject.setClient(this.client.getClient());

        insuredObject.setPolicies(this.policies.stream().map(PolicyDTO::getPolicy).collect(Collectors.toList()));

        return insuredObject;
    }
}
