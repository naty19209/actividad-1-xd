/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
/**
 *
 * @author Alumno
 */
public class JavaApplication20 extends JFrame {

    private JTextArea TextArea = new JTextArea();
    private ButtonGroup botongrupo1 = new ButtonGroup();
    private JRadioButton Radio1 =  new JRadioButton();
    private JRadioButton Radio2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2 = new JCheckBox();

    public JavaApplication20(){
        
        
        setTitle("Preguntas"); // Título de la ventana
        setSize(550, 300); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminar la ejecución al cerrar la ventana
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); // Layout de la ventana
    }
    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        
      JavaApplication20 Ventana = new JavaApplication20();
      
      JPanel panel = new JPanel();
        panel.setLayout(null);
        
       // Ventana.getContentPane().add(Panel1);
      
      
        
    }
    
    
}
