/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rajatha
 */
public class EventTest extends JPanel{
    JLabel lblTitle = null;
    JLabel lblVenue = null;
    JLabel lblDetails = null;
    JPanel pnlEvent = null;
    JLabel lblImg = null;
    
    String title;
    String venue;
    String details;
    String path;
    
    public EventTest(String title, String venue, String details, String path){
        this.title = title;
        this.venue = venue;
        this.details = details;
        this.path = path;
        
        initializeEvent();
    }
    
    public void initializeEvent(){
        setBackground(Color.red);
        javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
        setBorder(blackline);
        
        pnlEvent = new JPanel();
        pnlEvent.setLayout(new BoxLayout(pnlEvent, BoxLayout.Y_AXIS));
        pnlEvent.setPreferredSize(new Dimension(300, 200));
        pnlEvent.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        lblTitle = new JLabel("Title: " + title);
        pnlEvent.add(lblTitle);
        lblVenue = new JLabel("Venue: " + venue);
        pnlEvent.add(lblVenue);
        lblDetails = new JLabel("<html> Details: " + details + "</html>");
        //lblDetails.setPreferredSize(new Dimension(100, 100));
        pnlEvent.add(lblDetails);
        
        lblImg = new JLabel();
        lblImg.setIcon(new ImageIcon(getClass().getResource(path)));
        
        add(lblImg);
        add(pnlEvent);
    }
}
