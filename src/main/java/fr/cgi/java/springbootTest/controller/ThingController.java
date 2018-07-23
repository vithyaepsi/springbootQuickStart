/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cgi.java.springbootTest.controller;

import fr.cgi.java.springbootTest.model.level1.Thing;
import fr.cgi.java.springbootTest.model.level3.Cat;
import fr.cgi.java.springbootTest.model.level3.Stone;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author vithya.voeuk
 */
@Controller
public class ThingController {
    
    @GetMapping("/thing")
    public String index(@RequestParam(name="type", required=false, defaultValue="cat") String type,
            @RequestParam(name="name", required=false, defaultValue="Gérard") String name,
            Model model){
        
        Thing thing;
        if(type.equals("cat") ){
            thing = new Cat(name.toString(), new Date() );
        }
        else{
            thing = new Stone(name.toString());
        }
        
        model.addAttribute("thing", thing);
        
        return "thingIndex";
    }
            
}
