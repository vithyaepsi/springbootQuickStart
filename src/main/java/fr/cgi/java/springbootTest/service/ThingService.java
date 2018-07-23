/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.service;

import fr.cgi.java.springbootTest.repository.ThingRepository;
import fr.cgi.java.springbootTest.model.level1.Thing;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vithya.voeuk
 */
@Service
public class ThingService implements IThingService {
    @Autowired
    private ThingRepository repository;

    @Override
    public List<Thing> findByName(String name) {

        List<Thing> countries = (List<Thing>) repository.findAll();
        return countries;
    }

    @Override
    public void create(Thing t) {
        repository.save(t);
    }

    @Override
    public void update(Thing t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Thing t) {
        repository.delete(t);
    }
    
    
}
