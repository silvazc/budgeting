package com.example.budgetapp.controller;

import com.example.budgetapp.dao.ReportRepo;
import com.example.budgetapp.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {
    @Autowired
    ReportRepo repo;

    @RequestMapping("newReport")
    public String newReport(Report r) {
        repo.save(r);
        return "reportCreated.html";
    }
}
