package com.uber.app.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Users users;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransaction> transactions;
}
