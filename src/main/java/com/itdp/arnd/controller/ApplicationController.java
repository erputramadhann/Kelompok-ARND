package com.itdp.arnd.controller;

import com.itdp.arnd.dto.GetCurrency;
import com.itdp.arnd.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itdp.arnd.dto.ApiResponse;
import com.itdp.arnd.dto.BalanceData;
import com.itdp.arnd.dto.ReqCreateTransaction;
// import com.itdp.arnd.entity.BankUsers;
import com.itdp.arnd.entity.Transactions;
import com.itdp.arnd.service.GetBalanceService;
import com.itdp.arnd.service.TransactionService;
import com.itdp.arnd.utils.ResponseUtil;

import java.util.List;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    TransactionService transactionService;
    
    @Autowired
    GetBalanceService getBalanceService;

    @Autowired
    RateService rateService;

    @PostMapping("/createTransaction")
    public ResponseEntity<ApiResponse<Transactions>> createTransaction (@RequestBody ReqCreateTransaction request) {
        Transactions transaction = transactionService.createTransaction(request);
        return ResponseEntity.ok(ResponseUtil.success("success do transaction", transaction)); 
    }

    @GetMapping("/getBalance")
    public ResponseEntity<ApiResponse<BalanceData>> getBalance(@RequestParam String bank_user_id) {
        BalanceData response = getBalanceService.getBalance(bank_user_id);
        return ResponseEntity.ok(ResponseUtil.success("Balance retrieved successfully", response));
    }

    @GetMapping("/getRates")
    public ResponseEntity<ApiResponse<List<GetCurrency>>> getRate(){
        List<GetCurrency> currency = rateService.getRate();

        return ResponseEntity.ok(ResponseUtil.success("currency retrieved successfully", currency));
    }
    
}
