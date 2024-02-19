package com.example.demo.common.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

    //@Serial
    //private static long serial = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    @CreatedDate
    private Date createdAt;
    @Column(updatable = false)
    @CreatedBy
    private String createdBy;
    @Column
    @LastModifiedDate
    private Date modifiedAt;
    @Column
    @LastModifiedBy
    private String modifiedBy;

}
