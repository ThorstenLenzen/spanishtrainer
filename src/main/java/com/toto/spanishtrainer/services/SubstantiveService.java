package com.toto.spanishtrainer.services;

import com.toto.spanishtrainer.modelConversion.SubstantiveConverter;
import com.toto.spanishtrainer.persistenceModel.Substantive;
import com.toto.spanishtrainer.repositories.SubstantiveRepository;
import com.toto.spanishtrainer.serviceModel.SubstantiveForCreate;
import com.toto.spanishtrainer.serviceModel.SubstantiveForDisplay;
import com.toto.spanishtrainer.serviceModel.SubstantiveForUpdate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SubstantiveService {
    private final SubstantiveRepository _repository;
    private final SubstantiveConverter _converter;

    public List<SubstantiveForDisplay> getAllSubstantives(){
        List<Substantive> entities = _repository.findAll();
        return _converter.toSubstantiveForDisplay(entities);
    }

    public SubstantiveForDisplay getById(UUID id) {
        Optional<Substantive> entity = _repository.findById(id);
        return _converter.toSubstantiveForDisplay(entity.get());
    }

    public SubstantiveForDisplay create (SubstantiveForCreate dto) {
        Substantive entity = _converter.toSubstantive(dto);
        _repository.insert(entity);
        return _converter.toSubstantiveForDisplay(entity);
    }

    public SubstantiveForDisplay update (SubstantiveForUpdate dto, UUID id) {
        Substantive entity = _converter.toSubstantive(dto, id);
        _repository.save(entity);
        return _converter.toSubstantiveForDisplay(entity);
    }
}
