package com.eis.insurance.model;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Data
@Entity
public class InsuredObject implements Serializable {

    @Id
    private Long id;

    @NotNull
    private String privateCode;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CoverageOptionEnum type;

    @NotNull
    @ManyToOne
    private  Client client;

    @OneToMany(mappedBy="insuredObject")
    private List<Policy> policies = new ArrayList<>();

}

