/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Rajatha
 */
public class Event extends JPanel{
    String title;
    String venue;
    String dateTime;
    String details;
    
    JLabel lblTitle = null;
    JLabel lblVenue = null;
    JLabel lblDateTime = null;
    JLabel lblDetails = null;
    
    JPanel pnlDetails = null;
    
    public Event(String title, String venue, String dateTime, String details){
        this.title = title;
        this.venue = venue;
        this.dateTime = dateTime;
        this.details = details;
        
        initializeEvent();
    }
    
    public void initializeEvent(){
        setBackground(Color.white);
        javax.swing.border.Border border = javax.swing.BorderFactory.createLineBorder(Color.black);
        setBorder(border);
        
        pnlDetails = new JPanel();
        pnlDetails.setLayout(new BoxLayout(pnlDetails, BoxLayout.Y_AXIS));
        pnlDetails.setPreferredSize(new Dimension(300, 200));
        pnlDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        lblTitle = new JLabel("Title: " + title, JLabel.CENTER);
        lblTitle.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pnlDetails.add(lblTitle);
        
        lblVenue = new JLabel("Venue: " + venue, JLabel.CENTER);
        lblVenue.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pnlDetails.add(lblVenue);
        
        lblDetails = new JLabel("<html> Details: " + details + "</html>", JLabel.CENTER);
        lblDetails.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pnlDetails.add(lblDetails);
        
        add(pnlDetails); // add details panel to main panel
    }
}
