package com.example.demo.common.mapper;
import java.util.List;

public interface DtoEntityMapper<D, E> {

    D toDto(E entity);
    E toEntity(D dto);

    List<D> toDtoList(List<E> entityList);
    List<E> toEntityList(List<D> dtoList);
}
