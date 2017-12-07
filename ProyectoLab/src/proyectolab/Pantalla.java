/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab;

import javax.swing.JFrame;

/**
 *
 * @author luis_
 */
public class Pantalla extends JFrame{
    public Pantalla(){
        add(new Maze());
        setSize(500,400);
        setVisible(true);
    }
    
}
