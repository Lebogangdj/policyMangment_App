/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.Impl;

import livhuwani.rambuda.policy_app.domain.Investment;
import livhuwani.rambuda.policy_app.repository.InvestmentRepository;
import livhuwani.rambuda.policy_app.services.crud.InvestmentCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */

@Service
public class InvestmentCrudServiceImpl implements InvestmentCrudService
{
    @Autowired
    private InvestmentRepository investmentRepository;

    @Override
    public Investment createInvestment() 
    {
        Investment newInvestment = new Investment();
        newInvestment.setId(Long.MAX_VALUE+1);
        newInvestment.setInstitutionName("JSE");
        newInvestment.setInvestmentType("Shares Investment");
        newInvestment.setNumber("2");
        
        Investment savedInvestment = investmentRepository.saveAndFlush(newInvestment);
        return savedInvestment;
    }
}
