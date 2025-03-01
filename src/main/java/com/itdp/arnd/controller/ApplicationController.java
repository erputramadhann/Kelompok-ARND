package com.itdp.arnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itdp.arnd.dto.ApiResponse;
import com.itdp.arnd.dto.ReqCreateTransaction;
import com.itdp.arnd.entity.Transactions;
import com.itdp.arnd.service.TransactionService;
import com.itdp.arnd.utils.ResponseUtil;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/createTransaction")
    public ResponseEntity<ApiResponse<Transactions>> createTransaction (@RequestBody ReqCreateTransaction request) {
        Transactions transaction = transactionService.createTransaction(request);
        return ResponseEntity.ok(ResponseUtil.success("success do transaction", transaction));
    }
    
}
