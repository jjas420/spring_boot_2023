/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 *
 * @author ayosu
 */
@Configuration
@PropertySources({
    @PropertySource("classpath:texto.properties")
    
})
public class textoPropetiesConfig {
    
    
}
