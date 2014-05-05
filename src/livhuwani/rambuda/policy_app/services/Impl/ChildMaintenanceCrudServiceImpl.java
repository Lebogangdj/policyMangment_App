/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.Impl;

import java.math.BigDecimal;
import livhuwani.rambuda.policy_app.domain.ChildMaintenance;
import livhuwani.rambuda.policy_app.repository.ChildMaintenanceRepository;
import livhuwani.rambuda.policy_app.services.crud.ChildMaintenanceCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */

@Service
public class ChildMaintenanceCrudServiceImpl implements ChildMaintenanceCrudService
{
    @Autowired
    private ChildMaintenanceRepository childMaintenanceRepository;
    
    @Override
    public ChildMaintenance createChildMaintenance() 
    {
        ChildMaintenance newChildMaintenance = new ChildMaintenance();
        newChildMaintenance.setId(Long.MAX_VALUE+1);
        newChildMaintenance.setAnnualIncreasePercentage(50);
        newChildMaintenance.setCashValue(BigDecimal.valueOf(2500));
        newChildMaintenance.setTerm(60);
        
        ChildMaintenance savedChildMaintenance = childMaintenanceRepository.saveAndFlush(newChildMaintenance);
        return savedChildMaintenance;
    }
}
