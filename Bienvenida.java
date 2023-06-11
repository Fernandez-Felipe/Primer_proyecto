import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{

 private JTextField usuario;
 private JLabel Label1 , Label2, Label3, Label4;
 private JButton boton;
 
 public static String Nombre = "";

 public Bienvenida(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  getContentPane().setBackground(new Color(255,0,0));
  setTitle("Bienvenido");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  ImageIcon imagen = new ImageIcon("images/logo-coca.png");

  Label1 = new JLabel(imagen);
  Label1.setBounds(20,25,300,70);
  add(Label1);

  Label2 = new JLabel("Sistema de control vacacional");
  Label2.setBounds(50,100,300,50);
  Label2.setFont(new Font("Andale Mono", 1, 16));
  Label2.setForeground(new Color(255,255,255));
  add(Label2);

  Label3 = new JLabel("Ingrese su nombre");
  Label3.setBounds(90,180,150,30);
  Label3.setFont(new Font("Andale Mono", 1, 16));
  Label3.setForeground(new Color(255,255,255));
  add(Label3);

  usuario = new JTextField();
  usuario.setBounds(70,240,180,30);
  add(usuario);

  boton = new JButton("Ingresar");
  boton.setBounds(110,295,100,30);
  boton.addActionListener(this);
  add(boton);

  Label4 = new JLabel("©2023 the Coca-Cola company");
  Label4.setBounds(45,360,300,30);
  Label4.setFont(new Font("Andale mono", 1, 16));
  Label4.setForeground(new Color(255,255,255));
  add(Label4);
 }
 public void actionPerformed(ActionEvent a){
  if(a.getSource() == boton){

   Nombre = usuario.getText().trim();
   
   if(Nombre.equals("")){
    JOptionPane.showMessageDialog(null, "INGRESE SU NOMBRE.");
   }
   else{
    Licencia Window = new Licencia();
    Window.setBounds(0,0,700,550);
    Window.setVisible(true);
    Window.setLocationRelativeTo(null);
    Window.setResizable(false);
    this.setVisible(false);
   }
  }
 }

 public static void main(String args[]){
  Bienvenida ventana = new Bienvenida();
  ventana.setBounds(0,0,350,450);
  ventana.setVisible(true);
  ventana.setLocationRelativeTo(null);
  ventana.setResizable(false);
 }
}
