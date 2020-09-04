package com.jszipcoders.moneymanager.entities;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNTENTITY")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    private AccountType type;

    @OneToOne
    @JoinColumn(name = "userId")
    private UserEntity accountOwner;
    private Double balance;
    private final Integer routingNumber = 394058927;

    public AccountEntity() {
        this(null, null, null, null);
    }

    public AccountEntity(Long accountNumber, AccountType type, UserEntity accountOwner, Double balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public UserEntity getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(UserEntity accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getRoutingNumber() {
        return routingNumber;
    }
}
