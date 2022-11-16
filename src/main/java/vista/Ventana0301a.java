/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ochoa
 */
public class Ventana0301a extends JFrame{
   
    private java.util.List<JPanel> jPanelList;
    public Ventana0301a(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setLocation(200, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList =new ArrayList<>();
        this.setLayout(new FlowLayout());
    }
    public void iniciarComponente(){
        var jPanel1 = new JPanel();
        jPanel1.setBackground(Color.red);
        jPanel1.setOpaque(true);
        var jPanel2 = new JPanel();
        jPanel2.setBackground(Color.blue);
        var jPanel3 = new JPanel();
        jPanel3.setBackground(Color.green);
        this.jPanelList.add(jPanel1);
        this.jPanelList.add(jPanel2);
        this.jPanelList.add(jPanel3);
        this.getContentPane().add(this.jPanelList.get(0));
        this.getContentPane().add(this.jPanelList.get(1));
        this.getContentPane().add(this.jPanelList.get(2));
        
    
        
        
    }

   
    
}
