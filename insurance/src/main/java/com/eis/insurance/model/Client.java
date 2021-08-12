package com.eis.insurance.model;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Data
@Entity
public class Client implements Serializable {

    @Id
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String phone;

    private String email;
//
    @OneToMany(mappedBy="client")
    private List<InsuredObject> insuredObjects = new ArrayList<>();
}

