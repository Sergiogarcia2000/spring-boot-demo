package com.example.demo.user.model;

import com.example.demo.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Integer age;
}
