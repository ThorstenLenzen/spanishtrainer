package com.toto.spanishtrainer.controllers;

import com.toto.spanishtrainer.serviceModel.SubstantiveForCreate;
import com.toto.spanishtrainer.serviceModel.SubstantiveForDisplay;
import com.toto.spanishtrainer.serviceModel.SubstantiveForUpdate;
import com.toto.spanishtrainer.services.SubstantiveService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public SubstantiveForDisplay getById(@PathVariable long id){
        return null;
    }

    @PostMapping()
    public SubstantiveForDisplay post(@RequestBody SubstantiveForCreate substantive){
        return null;
    }

    @PutMapping("{id}")
    public SubstantiveForDisplay put(@RequestBody SubstantiveForUpdate substantive){
        return null;
    }
}
