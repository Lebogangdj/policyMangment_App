/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.repository;

import livhuwani.rambuda.policy_app.domain.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DeeJayMD
 */

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long>
{
    
}
