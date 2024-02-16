package com.example.demo.common.mapper;
import java.util.List;

public interface SimpleDtoEntityMapper<S, E> {

    S toSimpleDto(E entity);

    List<S> toSimpleDtoList(List<E> entityList);
}
