package com.pinsoft.budgettrackerbe.business.concretes;

import com.pinsoft.budgettrackerbe.business.abstracts.IncomeService;
import com.pinsoft.budgettrackerbe.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllExpensesResponse;
import com.pinsoft.budgettrackerbe.business.responses.GetAllIncomeResponse;
import com.pinsoft.budgettrackerbe.entities.concretes.Expense;
import com.pinsoft.budgettrackerbe.entities.concretes.Income;
import com.pinsoft.budgettrackerbe.mappers.ModelMapperService;
import com.pinsoft.budgettrackerbe.repositories.IncomeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class IncomeManager implements IncomeService {

    private IncomeRepository incomeRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllIncomeResponse> getAll() {

        List<Income> incomes = null;
        List<GetAllIncomeResponse> incomesResponse = incomes.stream()
                .map(income -> this.modelMapperService.forResponse()
                        .map(income, GetAllIncomeResponse.class)).collect(Collectors.toList());
        return incomesResponse;
    }

    @Override
    public void add(CreateIncomeRequest createIncomeRequest) {
        Income income = this.modelMapperService.forRequest().map(createIncomeRequest, Income.class);
        this.incomeRepository.save(income);
    }

    @Override
    public void update(UpdateIncomeRequest updateIncomeRequest) {
        Income income = this.modelMapperService.forRequest().map(updateIncomeRequest, Income.class);
        this.incomeRepository.save(income);
    }

    @Override
    public void delete(int id) {
        this.incomeRepository.deleteById(id);
    }
}
