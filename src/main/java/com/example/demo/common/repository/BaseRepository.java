package com.example.demo.common.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T, I> {

    Optional<T> findById(I id);

    List<T> findAll();

    List<T> findAllById(Iterable<I> ids);

    T save(T entity);

    void deleteById(I id);

    void delete(T entity);

}
