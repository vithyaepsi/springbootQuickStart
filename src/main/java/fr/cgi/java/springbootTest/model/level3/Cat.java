/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.model.level3;

import fr.cgi.java.springbootTest.model.level2.Living;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author vithya.voeuk
 */
@Entity
public class Cat extends Living implements Serializable {

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }
    
    @Override
    public String toString() {
        return "I am a cat and my name is "+this.name;
    }
}
