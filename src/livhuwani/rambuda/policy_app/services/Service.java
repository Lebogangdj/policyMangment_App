/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package livhuwani.rambuda.policy_app.services;

import java.util.List;

/**
 *
 * @author DeejayMD
 */
public interface Service<S, ID> 
{

    public S find(ID id);

    public S persist(S entity);

    public S merge(S entity);

    public void remove(S entity);

    public List<S> findAll();
}
