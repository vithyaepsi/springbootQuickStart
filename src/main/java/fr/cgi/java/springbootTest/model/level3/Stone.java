/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.model.level3;

import fr.cgi.java.springbootTest.model.level2.Inanimate;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author vithya.voeuk
 */
@Entity
public class Stone extends Inanimate implements Serializable {

    public Stone(String name) {
        super(name);
    }
    
    @Override
    public String toString(){
        return "I am a stone and my name is "+this.name;
    }
}
