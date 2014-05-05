/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.crud;

import java.util.List;
import livhuwani.rambuda.policy_app.domain.BusinessInterest;
import livhuwani.rambuda.policy_app.domain.ChildMaintenance;
import livhuwani.rambuda.policy_app.domain.InsuranceDetails;
import livhuwani.rambuda.policy_app.domain.Investment;
import livhuwani.rambuda.policy_app.domain.Policy;
import livhuwani.rambuda.policy_app.domain.PolicyType;

/**
 *
 * @author E939964
 */
public interface PolicyCrudService
{
    public Policy createBusinessPolicy(BusinessInterest type);
    
    public List<Policy> getAllBusinessPolicy(PolicyType type);
    
    public Policy createInsurancePolicy(InsuranceDetails type);
    
    public List<Policy> getAllInsurancePolicy(PolicyType type);
    
    public Policy createInvestmentPolicy(Investment type);
    
    public List<Policy> getAllIvestmentPolicy(PolicyType type);
    
    public Policy createChildMaintenancePolicy(ChildMaintenance type);
    
    public List<Policy> getAllMaintenancePolicy(PolicyType type);
    
}
