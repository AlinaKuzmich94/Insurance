package com.eis.insurance.model;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@NoArgsConstructor
@Data
@Entity
public class Policy implements Serializable {

    @Id
    private Long id;

    @NotNull
    private Instant beginning;

    @NotNull
    private Instant end;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CoverageOptionEnum type;

    @NotNull
    @ManyToOne
    private  InsuredObject insuredObject;

}

