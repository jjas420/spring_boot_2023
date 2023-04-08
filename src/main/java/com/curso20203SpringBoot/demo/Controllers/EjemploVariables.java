/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ayosu
 */
@Controller
@RequestMapping("/variables")
public class EjemploVariables {
    @GetMapping("/")
    public String Index(){
       

        
        return "variables/index";
    }
    
    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model m){
        m.addAttribute("titulo","parametro (@PathVariable)");
         m.addAttribute("resultado","resultado '"+texto+"' ");

        
        return "variables/ver";
    
    }
    
      @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto,@PathVariable Integer numero, Model m){
        m.addAttribute("titulo","parametro (@PathVariable)");
         m.addAttribute("resultado","resultado '"+texto+"' numero enviado "+"'"+numero+"'");

        
        return "variables/ver";
    
    }
        
        
        
    
    
}
