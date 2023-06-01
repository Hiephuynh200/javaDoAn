package com.example.doan.Enitty.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "quyen")
public class Quyen {
    @Id
    @Column(name = "MaQuyen")
    private Long maQuyen;

    @Column(name = "TenQuyen")
    private String tenQuyen;

    @OneToMany(mappedBy = "quyen", cascade = CascadeType.ALL)
    private Set<User> users = new HashSet<>();

}
