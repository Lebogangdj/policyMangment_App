/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.Impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import livhuwani.rambuda.policy_app.domain.Person;
import livhuwani.rambuda.policy_app.domain.Policy;
import livhuwani.rambuda.policy_app.domain.PolicyQuote;
import livhuwani.rambuda.policy_app.repository.PolicyQuoteRepository;
import livhuwani.rambuda.policy_app.services.crud.PolicyQuoteCrudService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */

@Service
public class PolicyQuoteCrudServiceImpl implements PolicyQuoteCrudService
{
    @Autowired
    private PolicyQuoteRepository policyQuoteRepository;
    
    @Override
    public PolicyQuote createPolicyQuotes(Person person, Policy policy) 
    {
        PolicyQuote quote = new PolicyQuote();
        quote.setId(Long.MAX_VALUE+1);
        quote.setPerson(person);
        quote.setPolicy(policy);
        quote.setQuoteAmount(BigDecimal.valueOf(3200));
        quote.setQuoteStatus(Boolean.TRUE);
        quote.setQuoteDate(DateTime.now());
        
        PolicyQuote savedQuote = policyQuoteRepository.saveAndFlush(quote);
        return savedQuote;
    }

    @Override
    public List<PolicyQuote> getAllPolicyQuotes(Person person) 
    {
        List<PolicyQuote> quotes = new ArrayList<>();
        List<PolicyQuote> allQuotes= policyQuoteRepository.findAll();
        
        for(PolicyQuote quote : allQuotes)
        {
            if(quote.getPerson() == person)
            {
                quotes.add(quote);
            }
        }
        return quotes;
    }
}
