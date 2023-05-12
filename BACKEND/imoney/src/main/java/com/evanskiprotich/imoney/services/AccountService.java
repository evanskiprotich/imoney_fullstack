package com.evanskiprotich.imoney.services;

import java.util.Optional;

import javax.validation.Valid;

import com.evanskiprotich.imoney.entity.AccountEntity;

public interface AccountService {

    AccountEntity saveAccount(@Valid AccountEntity accountEntity);

    AccountEntity getAccountById(Long accountNumber);
}