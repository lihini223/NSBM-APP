/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Rajatha
 */
public class ImagedEvent extends Event{
    String imgPath;
    
    JLabel lblImg = null;
    
    public ImagedEvent(String title, String venue, String dateTime, String details, String imgPath){
        super(title, venue, dateTime, details);
        
        this.imgPath = imgPath;
        
        //initializeEvent();
        
        initializeImage();
    }
    
    //@Override
    //public void initializeEvent(){
        
    //}
    
    public void initializeImage(){
        lblImg = new JLabel();
        lblImg.setIcon(new ImageIcon(getClass().getResource(imgPath)));
        
        super.add(lblImg);
    }
}
