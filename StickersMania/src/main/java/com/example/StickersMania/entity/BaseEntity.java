package com.example.StickersMania.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {


    @Column(name = "created_at", nullable = false,updatable = false)
    @CreatedDate
    @CreationTimestamp
    private Instant createdAt;

    @Column(name = "created_by", nullable = false, length = 20,updatable = false)
    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "updated_at",insertable = false)
    private Instant updatedAt;

    @Column(name = "updated_by", length = 20,insertable = false)
    @LastModifiedBy
    private String updatedBy;
}
