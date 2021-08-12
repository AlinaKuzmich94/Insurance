package com.eis.insurance.controllers;

import com.eis.insurance.model.dto.PolicyDTO;
import com.eis.insurance.service.InsuranceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @Autowired
    InsuranceService insuranceService;

    @PostMapping(path = "save")
    public @ResponseBody
    void savePolicy(PolicyDTO policyDTO) {

        insuranceService.savePolicy(policyDTO);
    }

    @GetMapping(path = "all")
    public @ResponseBody
    List<PolicyDTO> policyAll() {

        return insuranceService.getPolicyList();
    }

    @GetMapping(path = "index")
    public String index() {

        System.out.println("index");

        return "index";
    }
}
