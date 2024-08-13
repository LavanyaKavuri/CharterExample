package org.example.repository;

import org.example.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction,Long> {
    public List<Transaction> findAllByCustomerId(Long customerId);

    public List<Transaction> findAllByCustomerIdAndTransactionDateBetween(Long customerId, Timestamp from, Timestamp to);
}
