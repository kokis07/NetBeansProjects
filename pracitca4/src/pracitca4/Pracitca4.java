/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracitca4;

import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class Pracitca4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al lenguaje java");
        int Valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor"));
        
        
        String tuColor = JOptionPane.showInputDialog("Cuál es tu color favorito?");

JOptionPane.showMessageDialog(null, "Tu color favorito es " + tuColor,

"Color", JOptionPane.PLAIN_MESSAGE);

        


int yesNoResponse = JOptionPane.showConfirmDialog(null, "hace calor?", "si o no", JOptionPane.YES_NO_OPTION);


if(yesNoResponse == JOptionPane.YES_OPTION){
    JOptionPane.showMessageDialog(null, "debemos prender la refrigeracion.", "solucion", JOptionPane.WARNING_MESSAGE );
}else{
      JOptionPane.showMessageDialog(null, "vamos por un cafe.", "solucion", JOptionPane.INFORMATION_MESSAGE );
}


Object[] botones = {"RES", "POLLO", "TRIPA"};
int tacos = JOptionPane.showOptionDialog(null, "De que fueron los tacos?", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
JOptionPane.showMessageDialog(null, "Los tacos fueron de " + botones[tacos], "Tacos", JOptionPane.WARNING_MESSAGE);


Object[] posiblesValores = {"primero", "segundo", "tercero"};

Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione un lugar.", "Lugares", JOptionPane.INFORMATION_MESSAGE, null, posiblesValores, posiblesValores[1]);

String opcion = selectedValue.toString();
JOptionPane.showMessageDialog(null, "Escogiste: " + opcion, "Resultado", JOptionPane.INFORMATION_MESSAGE);

Integer[] posiblesNumeros = {1, new Integer(2), new Integer(3)};
Integer numeroSeleccionado = (Integer) JOptionPane.showInputDialog(null, "Cual es tu numero de la suerte?", "Numeros de suerte", JOptionPane.INFORMATION_MESSAGE, null, posiblesNumeros, posiblesNumeros[0]);
JOptionPane.showMessageDialog(null, "Tu numero de la suerte es: " + numeroSeleccionado, "Felicidades!", JOptionPane.INFORMATION_MESSAGE);      
        
    }
    
}
