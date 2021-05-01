package com.example.LogisticDemo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractRestController<T, R extends JpaRepository<T, ?>> {
    protected R repo;

    public AbstractRestController(R repo) {
        this.repo = repo;
    }

    @GetMapping
    public Page<T> list(@PageableDefault Pageable pageble){
        return repo.findAll(pageble);
    }

    @GetMapping("{id}")
    public T getOne(@PathVariable("id") T obj){
        return obj;
    }

    @PostMapping
    public T add(@RequestBody T obj){
        return repo.save(obj);
    }

    @PutMapping("{id}")
    public T update(@PathVariable("id") T dbObj, @RequestBody T obj){
        BeanUtils.copyProperties(obj, dbObj);

        return repo.save(dbObj);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") T dbObj){
        repo.delete(dbObj);
    }
}























