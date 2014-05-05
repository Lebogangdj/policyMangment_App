/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.crud;

import java.util.List;
import livhuwani.rambuda.policy_app.domain.Person;
import livhuwani.rambuda.policy_app.domain.Policy;
import livhuwani.rambuda.policy_app.domain.PolicyQuote;

/**
 *
 * @author DeejayMD
 */
public interface PolicyQuoteCrudService
{
    public PolicyQuote createPolicyQuotes(Person person, Policy policy);
    
    public List<PolicyQuote> getAllPolicyQuotes(Person person);
}
