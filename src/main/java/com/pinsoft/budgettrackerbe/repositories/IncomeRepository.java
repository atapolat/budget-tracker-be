package com.pinsoft.budgettrackerbe.repositories;

import com.pinsoft.budgettrackerbe.entities.concretes.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Integer> {
}
