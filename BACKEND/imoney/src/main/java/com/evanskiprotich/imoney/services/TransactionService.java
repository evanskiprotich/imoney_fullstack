package com.evanskiprotich.imoney.services;

import java.util.List;

import javax.validation.Valid;

import com.evanskiprotich.imoney.dto.AccessTokenResponse;
import com.evanskiprotich.imoney.dto.B2CData;
import com.evanskiprotich.imoney.dto.C2BData;
import com.evanskiprotich.imoney.dto.CommonSyncResponse;
import com.evanskiprotich.imoney.dto.InternalB2CTransactionRequest;
import com.evanskiprotich.imoney.dto.RegisterUrlResponse;
import com.evanskiprotich.imoney.dto.SimulateTransactionRequest;
import com.evanskiprotich.imoney.dto.SimulateTransactionResponse;
import com.evanskiprotich.imoney.entity.B2cEntity;
import com.evanskiprotich.imoney.entity.C2bEntity;
import com.evanskiprotich.imoney.entity.ITransactionEntity;
import com.evanskiprotich.imoney.entity.TransactionEntity;

public interface TransactionService {

    TransactionEntity saveTransaction(@Valid TransactionEntity transactionEntity);

    List<TransactionEntity> fetchTransactionList();

    List<TransactionEntity> fetchTransactionsByAccountNumber(String merchant, int accountNumber);

    ITransactionEntity saveITransaction(@Valid ITransactionEntity iTransactionEntity);

    List<ITransactionEntity> fetchTransactionsBySender(Long senderAccount);

    TransactionEntity fetchTransactionByAccountNumber(int accountNumber);

    AccessTokenResponse getAccessToken();

    RegisterUrlResponse registerUrl();

    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);

    SimulateTransactionResponse createC2BTransaction(C2BData c2Bdata);

    List<C2bEntity> fetchC2bTransactionsByReceiver(Long receiverAccountNumber);

    CommonSyncResponse performB2CTransaction(InternalB2CTransactionRequest internalB2CTransactionRequest);

    CommonSyncResponse createB2CTransaction(B2CData b2CData);

    List<B2cEntity> fetchB2cTransactionsBySender(Long senderAccount);
}