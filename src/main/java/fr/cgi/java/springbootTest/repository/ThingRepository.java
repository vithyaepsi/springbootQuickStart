/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.repository;

import org.springframework.data.repository.CrudRepository;
import fr.cgi.java.springbootTest.model.level1.Thing;
import java.util.List;

/**
 *
 * @author vithya.voeuk
 */
public interface ThingRepository extends CrudRepository<Thing, Long> {
    
    List<Thing> findByName(String name);
    
}
