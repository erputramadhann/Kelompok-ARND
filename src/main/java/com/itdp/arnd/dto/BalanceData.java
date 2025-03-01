package com.itdp.arnd.dto;

import java.util.List;

public class BalanceData {
    private int id;
    private String name;
    private String accountNumber;
    private List<FormatBalance> balances;
    private String updatedAt;

    public BalanceData(Integer id, String name, String accountNumber, List<FormatBalance> balances, String updatedAt) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balances = balances;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<FormatBalance> getBalances() {
        return balances;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
