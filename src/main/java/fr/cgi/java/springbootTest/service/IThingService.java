/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.service;

import fr.cgi.java.springbootTest.model.level1.Thing;
import java.util.List;

/**
 *
 * @author vithya.voeuk
 */
public interface IThingService {
    public List<Thing> findByName(String name);
    
    public void create(Thing t);
    public void update(Thing t);
    public void delete(Thing t);
    
    
}
