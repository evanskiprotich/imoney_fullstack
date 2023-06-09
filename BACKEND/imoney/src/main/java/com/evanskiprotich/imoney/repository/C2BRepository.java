package com.evanskiprotich.imoney.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evanskiprotich.imoney.entity.C2bEntity;

@Repository
public interface C2BRepository extends JpaRepository<C2bEntity, Long>{
    public List<C2bEntity> findAllByReceiverAccountNumber(Long ReceiverAccountNumber);
}