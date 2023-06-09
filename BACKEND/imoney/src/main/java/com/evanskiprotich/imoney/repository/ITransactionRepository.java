package com.evanskiprotich.imoney.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evanskiprotich.imoney.entity.ITransactionEntity;

@Repository
public interface ITransactionRepository extends JpaRepository<ITransactionEntity, Long> {
    public List<ITransactionEntity> findAllBySenderAccount(Long senderAccount);
}