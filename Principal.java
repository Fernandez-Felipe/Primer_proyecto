import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

 private JMenuBar menubar;
 private JMenu opciones, calcular, AcercaDe, colores;
 private JLabel Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8, Label9, Label10;
 private JTextField nombre1, apellido1, apellido2;
 private JComboBox departamento, antiguedad;
 private JTextArea texto;
 private JScrollPane scroll;
 private JMenuItem nuevo, salir, rojo, negro, morado, Vacaciones, creador;

 public Principal(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  setTitle("Pantalla principal");

  ImageIcon imagen = new ImageIcon("images/logo-coca.png");

  getContentPane().setBackground(new Color(255,0,0));

  menubar = new JMenuBar();
  menubar.setBackground(new Color(255,0,0));
  setJMenuBar(menubar);

  opciones = new JMenu("Opciones");
  opciones.setFont(new Font("Andale mono", 1, 13));
  opciones.setForeground(new Color(255,255,255));
  opciones.setBackground(new Color(255,0,0));
  menubar.add(opciones);

  colores = new JMenu("Color de fondo");
  colores.setFont(new Font("Andale mono", 1, 13));
  colores.setForeground(new Color(255,0,0));
  opciones.add(colores);

  nuevo = new JMenuItem("Nuevo");
  nuevo.addActionListener(this);
  nuevo.setFont(new Font("Andale mono", 1, 13));
  nuevo.setForeground(new Color(255,0,0));
  opciones.add(nuevo);

  salir = new JMenuItem("Salir");
  salir.addActionListener(this);
  salir.setForeground(new Color(255,0,0));
  salir.setFont(new Font("Andale mono", 1, 13));
  opciones.add(salir);

  rojo = new JMenuItem("rojo");
  rojo.addActionListener(this);
  rojo.setFont(new Font("Andale mono", 1, 13));
  rojo.setForeground(new Color(255,0,0));
  colores.add(rojo);  

  negro = new JMenuItem("Negro");
  negro.addActionListener(this);
  negro.setFont(new Font("Andale mono", 1, 13));
  negro.setForeground(new Color(255,0,0));
  colores.add(negro); 

  morado = new JMenuItem("Morado");
  morado.addActionListener(this);
  morado.setFont(new Font("Andale mono", 1, 13));
  morado.setForeground(new Color(255,0,0));
  colores.add(morado); 

  calcular = new JMenu("Calcular");
  calcular.setFont(new Font("Andale mono", 1, 13));
  calcular.setForeground(new Color(255,255,255));
  menubar.add(calcular);

  Vacaciones = new JMenuItem("Vacaciones");
  Vacaciones.addActionListener(this);
  Vacaciones.setForeground(new Color(255,0,0));
  Vacaciones.setFont(new Font("Andale mono", 1, 13));
  calcular.add(Vacaciones);

  AcercaDe = new JMenu("Acerca de");
  AcercaDe.setFont(new Font("Andale mono", 1, 13));
  AcercaDe.setForeground(new Color(255,255,255));
  menubar.add(AcercaDe);
  creador = new JMenuItem("Del creador");
  creador.addActionListener(this);
  creador.setForeground(new Color(255,0,0));
  creador.setFont(new Font("Andale mono", 1, 13));
  AcercaDe.add(creador);

  Label1 = new JLabel(imagen);
  Label1.setBounds(10,10,250,80);
  add(Label1);

  Label2 = new JLabel("BIENVENIDO");
  Label2.setBounds(300,25,200,50);
  Label2.setFont(new Font("Andale mono", 1, 26));
  Label2.setForeground(new Color(255,255,255));
  add(Label2);

  Label3 = new JLabel("Datos del trabajador para el calculo de vacaciones");
  Label3.setBounds(60,130,550,50);
  Label3.setFont(new Font("Andale mono", 1, 22));
  Label3.setForeground(new Color(255,255,255));
  add(Label3);

  Label4 = new JLabel("Nombre completo:");
  Label4.setBounds(20,210,120,30);
  Label4.setForeground(new Color(255,255,255));
  add(Label4);

  nombre1 = new JTextField();
  nombre1.setBounds(20,240,170,30);
  add(nombre1);

  Label5 = new JLabel("Apellido paterno:");
  Label5.setBounds(20,280,120,30);
  Label5.setForeground(new Color(255,255,255));
  add(Label5);

  apellido1 = new JTextField();
  apellido1.setBounds(20,310,170,30);
  add(apellido1);

  Label6 = new JLabel("Apellido materno:");
  Label6.setBounds(20,350,120,30);
  Label6.setForeground(new Color(255,255,255));
  add(Label6);

  apellido2 = new JTextField();
  apellido2.setBounds(20,380,170,30);
  add(apellido2);

  Label7 = new JLabel("Departamento");
  Label7.setBounds(210,210,130,30);
  Label7.setForeground(new Color(255,255,255));
  add(Label7);

  departamento = new JComboBox();
  departamento.setBounds(210,240,150,30);
  add(departamento);
  departamento.addItem("");
  departamento.addItem("Atencion al cliente");
  departamento.addItem("Logistica");
  departamento.addItem("Gerencia");
  
  Label8 = new JLabel("Años de servicio");
  Label8.setBounds(210,280,130,30);
  Label8.setForeground(new Color(255,255,255));
  add(Label8);

  antiguedad = new JComboBox();
  antiguedad.setBounds(210,310,150,30);
  add(antiguedad);
  antiguedad.addItem("");
  antiguedad.addItem("1");
  antiguedad.addItem("De 2 a 6");
  antiguedad.addItem("Mayor a 6");

  Label9 = new JLabel("Resultado del calculo");
  Label9.setBounds(210,350,150,30);
  Label9.setForeground(new Color(255,255,255));
  add(Label9);

  texto = new JTextArea();
  texto.setBackground(new Color(224,224,224));
  texto.setText("\n      Calculando...");
  scroll = new JScrollPane(texto);
  scroll.setBounds(210,380,420,90);
  add(scroll);

  Label10 = new JLabel("©2023 the coca-cola Company | Todos los derechos reservados");
  Label10.setBounds(140,490,400,30);
  Label10.setFont(new Font("Andale mono", 1, 13));
  Label10.setForeground(new Color(255,255,255));
  add(Label10);
 }

 public void actionPerformed(ActionEvent a){

  String antg = "", depto = "", Nombre = "", Apellido1 = "", Apellido2 = "", Años = "";
  int vacaciones = 0;

  Nombre = nombre1.getText().trim();
  Apellido1 = apellido1.getText().trim();
  Apellido2 = apellido2.getText().trim();



  depto = departamento.getSelectedItem().toString();  
  Años = antiguedad.getSelectedItem().toString();

  if(depto.equals("Atencion al cliente")){
   if(Años.equals("1")){
    vacaciones = 6;
   }
   if(Años.equals("De 2 a 6")){
    vacaciones = 12;
   }
   if(Años.equals("Mayor a 6")){
    vacaciones = 20;
   }
  }

  if(depto.equals("Logistica")){
   if(Años.equals("1")){
    vacaciones = 7;
   }
   if(Años.equals("De 2 a 6")){
    vacaciones = 14;
   }
   if(Años.equals("Mayor a 6")){
    vacaciones = 22;
   }
  }
 
  if(depto.equals("Gerencia")){
   if(Años.equals("1")){
    vacaciones = 10;
   }
   if(Años.equals("De 2 a 6")){
    vacaciones = 17;
   }
   if(Años.equals("Mayor a 6")){
    vacaciones = 30;
   }
  }

  if(a.getSource() == Vacaciones){
   if(depto.equals("") || Años.equals("") || Nombre.equals("") || Apellido1.equals("") || Apellido2.equals("")){
    JOptionPane.showMessageDialog(null, "Debe completar todas las casillas");
   }else{
    texto.setText("\n Hola " + Nombre + " " + Apellido1 + " " + Apellido2 + " \n le corresponden " + vacaciones + " dias de vacaciones.");
   }
  }

  if(a.getSource() == creador){
   JOptionPane.showMessageDialog(null, "Creado por un tal Felipe");
  }

  if(a.getSource() == nuevo){
   nombre1.setText("");
   apellido1.setText("");
   apellido2.setText("");
   departamento.setSelectedItem("");
   antiguedad.setSelectedItem("");
   texto.setText("\n      Calculando...");
  }

  if(a.getSource() == salir){
   System.exit(0);
  }  
  if(a.getSource() == rojo){
   getContentPane().setBackground(new Color(255,0,0));
   menubar.setBackground(new Color(255,0,0));
  }  
  if(a.getSource() == negro){
   getContentPane().setBackground(new Color(0,0,0));
   menubar.setBackground(new Color(0,0,0));
  } 
  if(a.getSource() == morado){
   getContentPane().setBackground(new Color(200,100,200));
   menubar.setBackground(new Color(200,100,200));
  }   
 }

 public static void main(String args[]){
  Principal ventana = new Principal();
  ventana.setBounds(0,0,700,600);
  ventana.setVisible(true);
  ventana.setLocationRelativeTo(null);
  ventana.setResizable(false);
 }
}