import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

 private JLabel Label1, Label2;
 private JScrollPane scroll;
 private JTextArea Texto;
 private JRadioButton check1, check2;
 private ButtonGroup bg;
 private JButton aceptar, negar;

 public Licencia(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);

  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  Label1 = new JLabel("TERMINOS Y CONDICIONES");
  Label1.setBounds(230,20,300,40);
  Label1.setFont(new Font("Andale mono", 1, 16));
  Label1.setForeground(new Color(0,0,0));
  add(Label1);

  Texto = new JTextArea();
  Texto.setEditable(false);
  Texto.setFont(new Font("Andale mono", 1, 14));
  Texto.setText("\n\n          TERMINOS Y CONDICIONES" + 
                "\n               A. PROHIBIDA LA VENTA O DISTRIBUCION DEL PRODUCTO SIN AUTORIZACION" +
                "\n               B. PROHIBIDA LA COMERCIALIZACION O ALTERACION DEL CODIGO FUENTE" + 
                "\n               C. EL CREADOR NO ES RESPONSABLE DEL MAL USO QUE SE LE PUEDA DAR AL PRODUCTO" +
                "\n\n              LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED LE DE A ESTE SOFTWARE" + 
                "\n               (LA EMPRESA Y EL CREADOR) NO SE HACEN RESPONSABLES DE LAS CONSECUENCIAS QUE CONLLEVEN EL MAL" +
                "\n               USO DEL SOFTWARE. SI ESTA DE ACUERDO CON LOS TERMINOS SELECCIONE LA CASILLA (ACEPTO), SI ESTA " +
                "\n               EN DESACUERDO, SELECCIONES (NO ACEPTO)");
  scroll = new JScrollPane(Texto);
  scroll.setBounds(20,80,650,300);
  add(scroll);

  ImageIcon imagen = new ImageIcon("images/coca-cola.png");

  Label2 = new JLabel(imagen);
  Label2.setBounds(420,400,230,100);
  add(Label2);

  bg = new ButtonGroup();

  check1 = new JRadioButton("ACEPTO");
  check1.setBounds(20,390,100,30);
  bg.add(check1);
  check1.addChangeListener(this);
  add(check1);

  check2 = new JRadioButton("NO ACEPTO");
  check2.setBounds(140,390,100,30);
  bg.add(check2);
  check2.addChangeListener(this);
  add(check2);

  aceptar = new JButton("CONTINUAR");
  aceptar.setBounds(20,440,150,30);
  aceptar.addActionListener(this);
  aceptar.setEnabled(false);
  add(aceptar);

  negar = new JButton("SALIR");
  negar.setBounds(200,440,150,30);
  negar.addActionListener(this);
  negar.setEnabled(false);
  add(negar);

 }

 public void actionPerformed(ActionEvent a){

 if(a.getSource() == negar){
  System.exit(0);
 } 
 if(a.getSource() == aceptar){

  Principal ventana = new Principal();
  ventana.setBounds(0,0,700,600);
  ventana.setVisible(true);
  ventana.setLocationRelativeTo(null);
  ventana.setResizable(false);
  this.setVisible(false);
 }
}

 public void stateChanged(ChangeEvent b){

 if(check2.isSelected() == true){
  negar.setEnabled(true);
 }
 if(check1.isSelected() == true){
   aceptar.setEnabled(true);
  }

 if(check2.isSelected() == false){
  negar.setEnabled(false);
 }
 if(check1.isSelected() == false){
   aceptar.setEnabled(false);
  }
}

 public static void main(String args[]){
  Licencia Window = new Licencia();
  Window.setBounds(0,0,700,550);
  Window.setVisible(true);
  Window.setLocationRelativeTo(null);
  Window.setResizable(false);
 }
}