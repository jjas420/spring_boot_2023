/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Controllers;

import com.curso20203SpringBoot.demo.Models.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




/**
 *
 * @author ayosu
 */
 @Controller
 @RequestMapping({"/inicio","/"})
public class IndexController {
     
     @RequestMapping(value={"/index","/home","/"},method=RequestMethod.GET)
     /* ejemplo con model
     public String index(Model m){
         m.addAttribute("titulo", "hola Spring Jonathan");
         
         return "index";
     }
     */
     
     
     /*
     
     public String index(Map m){
         m.put("titulo", "hola Spring Jonathan");
         
         return "index";
     }
     */  
     //ModelAndView ejemplo 
     public ModelAndView index(ModelAndView mv){
         
         mv.addObject("titulo", "hola Spring Jonathan");
         
         mv.setViewName("index");
         return mv;
     }
     
     
      //@RequestMapping(value={"/sa"},method=RequestMethod.GET)
     
     @RequestMapping("/perfil")
     public String Perfil(Model m){
         Usuario usuario= new Usuario();
         usuario.setNombre_completo("Jonathan Ayona");
         
         usuario.setUsuario("jjas420");
                m.addAttribute("usuario",usuario );
                m.addAttribute("titulo", "perfil del usuario:".concat(usuario.getNombre_completo()));

         
         return "perfil";
     }
     
     @RequestMapping("/lista")
     public String lista(Model m){
         List <Usuario> usuarios= new ArrayList<>();
          m.addAttribute("titulo","lista De usuarios" );
         m.addAttribute("ListaUsuarios",usuarios);


         
         
         
         
         return "lista";
     }
     
     
     
     
     
    
}
