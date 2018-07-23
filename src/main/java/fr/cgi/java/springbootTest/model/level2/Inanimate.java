/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.model.level2;

import fr.cgi.java.springbootTest.model.level1.Thing;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author vithya.voeuk
 */
@Entity
public abstract class Inanimate extends Thing implements Serializable {
    
    public Inanimate(String name) {
        super(name);
    }

    
    
}
