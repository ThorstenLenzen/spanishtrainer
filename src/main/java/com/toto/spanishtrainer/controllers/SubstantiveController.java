package com.toto.spanishtrainer.controllers;

import com.toto.spanishtrainer.serviceModel.SubstantiveForCreate;
import com.toto.spanishtrainer.serviceModel.SubstantiveForDisplay;
import com.toto.spanishtrainer.serviceModel.SubstantiveForUpdate;
import com.toto.spanishtrainer.services.SubstantiveService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("api/substantives")
public class SubstantiveController {
    private final SubstantiveService _service;

    @GetMapping()
    public List<SubstantiveForDisplay> getAll(){
        return _service.getAllSubstantives();
    }

    @GetMapping("{id}")
    public SubstantiveForDisplay getById(@PathVariable UUID id){
        return _service.getById(id);
    }

    @PostMapping()
    public SubstantiveForDisplay post(@RequestBody SubstantiveForCreate substantive){
        return _service.create(substantive);
    }

    @PutMapping("{id}")
    public SubstantiveForDisplay put(@RequestBody SubstantiveForUpdate substantive, @PathVariable UUID id){
        return _service.update(substantive, id);
    }
}
