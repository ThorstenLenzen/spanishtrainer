package com.toto.spanishtrainer.serviceModel;

import lombok.Data;

import java.util.UUID;

@Data
public class SubstantiveForDisplay {
    private UUID id;
    private String german;
    private String spanish;
    private Integer correctAnswers;
    private Integer wrongAnswers;
}
