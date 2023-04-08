/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ayosu
 */
@Controller
public class HomeControler {
    @GetMapping("/")
   public String Home(){
       
       // cambia la ruta return"redirect:/inicio/index";
       //no cambia la ruta
       return"forward:/inicio/index";
   }
}
