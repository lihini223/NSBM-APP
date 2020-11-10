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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rajatha
 */
public class EventPanel extends JPanel {
    JLabel lblTitle = null;
    JLabel lblVenue = null;
    JLabel lblDetails = null;
    JPanel pnlDetails = null;
    JLabel lblImg = null;
    
    String title;
    String venue;
    String details;
    String path;
    
    public EventPanel(String title, String venue, String details, String path){
        this.title = title;
        this.venue = venue;
        this.details = details;
        this.path = path;
        
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
        //lblTitle.setPreferredSize(new Dimension(300, 20));
        pnlDetails.add(lblTitle);
        
        lblVenue = new JLabel("Venue: " + venue, JLabel.CENTER);
        lblVenue.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pnlDetails.add(lblVenue);
        
        lblDetails = new JLabel("<html> Details: " + details + "</html>", JLabel.CENTER);
        //lblDetails.setPreferredSize(new Dimension(100, 100));
        lblDetails.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        pnlDetails.add(lblDetails);
        
        lblImg = new JLabel();
        lblImg.setIcon(new ImageIcon(getClass().getResource(path)));
        
        add(lblImg);
        add(pnlDetails);
    }
}
