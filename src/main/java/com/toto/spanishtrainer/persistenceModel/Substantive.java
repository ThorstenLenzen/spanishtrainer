package com.toto.spanishtrainer.persistenceModel;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document
public class Substantive {
    @Id
    private UUID id;
    private String german;
    private String spanish;
    private Integer correctAnswers;
    private Integer wrongAnswers;
}
