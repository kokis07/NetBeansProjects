/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab;

import java.awt.Graphics; //Libreria para acceder a graphics.
import java.awt.Color;
import javax.swing.JPanel; //Libreria para llamar el JPanel.
import javax.swing.ImageIcon; //Libreria para las imagenes.

/**
 *
 * @author luis_
 */
public class Maze extends JPanel {
      //codigo de la imagen
ImageIcon pared = new ImageIcon(new ImageIcon(getClass().getResource("/imagene/laberinto.jpg")).getImage());

    //codigo de la imagen
ImageIcon camino = new ImageIcon(new ImageIcon(getClass().getResource("/imagene/huella.jpg")).getImage());

    private final int TRIED = 3;
    private final int PATH = 7;
    private int [] [] grid = {{1,1,0,0,1,1,1},
                              {1,1,1,0,0,0,0},              
                              {1,0,0,0,1,1,1},
                               {1,1,1,1,1,1,1}};
    
    public boolean traverse(int row, int colum){
        boolean done = false;
        if(valid(row,colum)){
            grid[row][colum]=TRIED;
            if(row==grid.length-1 && colum == grid[0].length-1){
                done = true;
            }else {
                done = traverse(row + 1, colum);
                if (!done){
                    done = traverse(row, colum + 1);
                }
                if(!done){
                    done = traverse(row - 1, colum);
                }
                if(!done){
                    done = traverse(row, colum - 1);
                }
            }
            if (done){
                grid[row][colum]=PATH;
            }
        }
        return done;
    }
    private boolean valid(int row, int colum){
        boolean result = false;
        if (row >= 0 && row < grid.length && colum >= 0 && colum < grid[row].length)
        {
            if (grid[row][colum] == 1){
                return true;
            }
        }
        return result;
    }
    public String toString(){
        String result = "\n";
        for(int row = 0; row < grid.length; row ++){
            for (int colum = 0; colum < grid[row].length; colum++){
                result += grid[row][colum] + "";
            }
            result += "\n";
        }
    return result;    
    }
    public void paintComponent(Graphics g) {
	//codigo para dibujar las imagenes 
        String result = "\n"; //Salto de linea
        for (int row = 0; row < grid.length; row++) {
            for (int colum = 0; colum < grid[row].length; colum++) {
                result += grid[row][colum] + "";//conbierte el valor a cadena, sin las comillas no se puede.
                if(grid[row][colum]==0){
                    g.drawImage(pared.getImage(), colum * 80, row * 80, 80, 80, this);
                }
                if (grid[row][colum] ==1){
                    g.drawImage(camino.getImage(), colum * 80, row * 80, 80, 80, this);
                }
            }
        }
    }
}
