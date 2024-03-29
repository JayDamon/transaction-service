package com.factotum.transactionservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Financial transactions
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("transaction")
public class Transaction implements Serializable {

    @Id
    @Column("transaction_id")
    private UUID id;

    @Column("account_id")
    private UUID accountId;

    @Column("budget_id")
    private UUID budgetId;

    @Column("transaction_category_id")
    private UUID transactionCategory;

    @Column("transaction_type_id")
    private UUID transactionType;

    @Column("recurring_transaction_id")
    private UUID recurringTransaction;

    @Column("transaction_date")
    private LocalDate date;

    @Column("description")
    private String description;

    @Column("amount")
    private BigDecimal amount;

    @Column("tenant_id")
    private String tenantId;
}
