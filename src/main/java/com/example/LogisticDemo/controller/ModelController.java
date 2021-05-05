package com.example.LogisticDemo.controller;

import com.example.LogisticDemo.domain.Model;
import com.example.LogisticDemo.repo.ModelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo> {
    public ModelController(ModelRepo repo) {
        super(repo);
    }
}
