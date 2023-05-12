package br.senai.sp;

import javax.swing.JOptionPane;

public class VerificaTriangulo {
    public static void main(String[] args) {
        
    	
        String ladoA = JOptionPane.showInputDialog("Digite o valor do lado A:");
        String ladoB = JOptionPane.showInputDialog("Digite o valor do lado B:");
        String ladoC = JOptionPane.showInputDialog("Digite o valor do lado C:");
        
       
        double a = Double.parseDouble(ladoA);
        double b = Double.parseDouble(ladoB);
        double c = Double.parseDouble(ladoC);
        
      
        	if (a < b + c && b < a + c && c < a + b) {
           
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "O triângulo é equilátero.");
            } else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");
            } else {
                JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os valores informados não formam um triângulo.");
        }
  
       
    }
}

