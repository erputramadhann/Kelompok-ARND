package com.itdp.arnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itdp.arnd.entity.BankBalances;

public interface BalanceRepository extends JpaRepository<BankBalances, Integer> {
    BankBalances findByBankUserIdAndCurrencyId(Integer bankUserId, Integer currencyId);
}
