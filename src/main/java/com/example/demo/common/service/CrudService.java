package com.example.demo.common.service;

import java.util.List;

public interface CrudService<T, I> {

    T create(T entity);

    T findById(I id);

    List<T> findAll();

    List<T> findAllByIds(Iterable<I> ids);

    T update(T entity);

    void deleteById(I id);

    void delete(T entity);

}
