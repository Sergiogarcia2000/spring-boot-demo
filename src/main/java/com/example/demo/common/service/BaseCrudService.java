package com.example.demo.common.service;

import com.example.demo.common.exceptions.NotFoundException;
import com.example.demo.common.exceptions.RepositoryException;
import com.example.demo.common.model.BaseEntity;
import com.example.demo.common.repository.BaseRepository;

import java.util.List;

public class BaseCrudService<T extends BaseEntity, I, R extends BaseRepository<T, I>> implements CrudService<T, I> {

    private final R repository;

    public BaseCrudService(R repository) {
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        try {
            repository.save(entity);
        } catch (Exception e) {
            throw new RepositoryException();
        }
        return null;
    }

    @Override
    public T findById(I id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public List<T> findAllByIds(Iterable<I> ids) {
        return repository.findAllById(ids);
    }

    @Override
    public T update(T entity) {
        findById((I) entity.getId());
        return repository.save(entity);
    }

    @Override
    public void deleteById(I id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public void delete(T entity) {
        findById((I) entity.getId());
        repository.delete(entity);
    }

}
