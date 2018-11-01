/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author tigre
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }
    
}
