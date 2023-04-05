/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ayosu
 */
@Controller
@RequestMapping("/params")
public class EjemploParams {
    @GetMapping("/")
    public String Index(){
        return "Params/index";
    }
    
    @GetMapping("/String")
    public String Params(@RequestParam(name="texto" ,required=false)String texto,Model m){
        m.addAttribute("resultado","el texto enviado es : "+ texto);
        
        
        
      return "Params/Ver";  
    }
    
    
}
