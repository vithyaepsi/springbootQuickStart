/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.model.level2;

import fr.cgi.java.springbootTest.model.level1.Thing;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author vithya.voeuk
 */
@Entity
public abstract class Living extends Thing implements Serializable{
    
    protected Date birthDate;

    public Living(String name) {
        super(name);
    }
    
    public Living(String name, Date birthDate) {
        super(name);
        this.birthDate = birthDate;
    }

    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
