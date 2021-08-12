package com.eis.insurance.model.dto;

import com.eis.insurance.model.Client;
import java.util.stream.Collectors;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class ClientDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private List<InsuredObjectDTO> insuredObjects = new ArrayList<>();

    public ClientDTO(Client client){

        this.id = client.getId();

        this.firstName = client.getFirstName();

        this.lastName = client.getLastName();

        this.phone = client.getPhone();

        this.email = client.getEmail();

        client.getInsuredObjects().forEach(e -> this.insuredObjects.add(new InsuredObjectDTO(e)));
    }

    public Client getClient(){

        Client client = new Client();

        client.setEmail(this.email);

        client.setFirstName(this.firstName);

        client.setLastName(this.lastName);

        client.setPhone(this.phone);

        client.setInsuredObjects(this.insuredObjects.stream().map(InsuredObjectDTO::getInsuredObject).collect(Collectors.toList()));

        return client;
    }
}
