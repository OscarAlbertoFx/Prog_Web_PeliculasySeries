/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jair_
 */
@Named(value = "imagesView")
@RequestScoped
public class ImagesView
{

    /**
     * Creates a new instance of ImagesView
     */
    public ImagesView()
    {
    }
    
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            images.add("peli"+i+".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
