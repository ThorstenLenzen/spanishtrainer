package com.toto.spanishtrainer.services;

import com.toto.spanishtrainer.modelConversion.SubstantiveConverter;
import com.toto.spanishtrainer.persistenceModel.Substantive;
import com.toto.spanishtrainer.repositories.SubstantiveRepository;
import com.toto.spanishtrainer.serviceModel.SubstantiveForDisplay;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubstantiveService {
    private final SubstantiveRepository _repository;
    private final SubstantiveConverter _converter;

    public List<SubstantiveForDisplay> getAllSubstantives(){
        List<Substantive> entities = _repository.findAll();
        return _converter.toSubstantiveForDisplay(entities);
    }

}
