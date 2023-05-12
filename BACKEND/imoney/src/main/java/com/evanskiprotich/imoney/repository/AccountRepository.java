package com.evanskiprotich.imoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evanskiprotich.imoney.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
    boolean existsById(Long id);

    AccountEntity getByAccountId(Long accountId);
}