package com.example.budgetapp.dao;

import com.example.budgetapp.model.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepo extends CrudRepository<Report, Integer > {

}
