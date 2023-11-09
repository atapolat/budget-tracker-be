package com.pinsoft.budgettrackerbe.repositories;

import com.pinsoft.budgettrackerbe.entities.concretes.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{
}
