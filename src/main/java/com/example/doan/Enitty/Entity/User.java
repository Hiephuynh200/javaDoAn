package com.example.doan.Enitty.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "MaUser")
    private Long maUser;

    @Column(name = "TenUser")
    private String tenUser;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Email")
    private String email;

    @ManyToOne
    @JoinColumn(name="maQuyen")
    private Quyen quyen;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<GioHang> gioHangs = new HashSet<>();
}
