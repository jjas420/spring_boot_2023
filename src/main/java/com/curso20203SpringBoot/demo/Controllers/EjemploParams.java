/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Controllers;

import jakarta.servlet.http.HttpServletRequest;
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
    //un parametro
    @GetMapping("/String")
    public String Params(@RequestParam(name="texto" ,required=false, defaultValue="no se ingresaron parametros")String texto,Model m){
        m.addAttribute("resultado","el texto enviado es : "+ texto);
        
        
        
      return "Params/Ver";  
    }
    
    //varios parametros
      @GetMapping("/mix-Params")
    public String Params(@RequestParam String texto,@RequestParam int numero,Model m){
        
        m.addAttribute("resultado","el texto enviado es : '"+ texto+"' el numero envia es :'"+ numero+"'");
        
        
        
      return "Params/Ver";  
    }
    
    //httserple
      @GetMapping("/mix-Paramss")
    public String Params(HttpServletRequest request, Model m){
        String texto=request.getParameter("texto");
        Integer  numero=null;
        try{
            numero=Integer.valueOf(request.getParameter("numero"));
            
            
        }
        catch(NumberFormatException e){
            numero=0;
        
    }
        
        
        
        
        
        m.addAttribute("resultado","el texto enviado es : '"+ texto+"' el numero envia es :'"+ numero+"'");
        
        
        
      return "Params/Ver";  
    }
    
    
}
