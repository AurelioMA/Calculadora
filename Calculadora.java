import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos
import java.awt.*;
public class Calculadora extends JFrame {
    float num1;
    float num2;
    String operador;
    JButton btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero;
    JButton btnMas, btnMenos, btnMultiplicacion, btnDivision, btnEliminar, btnPunto, btnIgual;
    JLabel lblEtiqueta;
    JTextField txt;
    public Calculadora(){
      initComponents();
    }
     
    private void initComponents(){   
      setSize(300,370); //Tamanio de la ventana
      setTitle("CALCULADORA"); //Titulo de la ventana
      setLocationRelativeTo(null);//Centrar la ventana
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//Terminar por completo la ejecucion
      
      //Crear los componentes
      lblEtiqueta = new JLabel("Calculadora");
      lblEtiqueta.setBounds(110,10,70,20);
      txt = new JTextField();
      txt.setBounds(40, 35, 200, 30);
      txt.setEditable(false);
      
      //Botones
      btnUno = new JButton("1");
      //                x   y  anc larg
      btnUno.setBounds(30, 90, 45, 30);
      
      btnDos = new JButton("2");
      btnDos.setBounds(90, 90, 45, 30);
      
      btnTres = new JButton("3");
      btnTres.setBounds(150, 90, 45, 30);
      
      btnMas = new JButton("+");
      btnMas.setBounds(210, 90, 45, 30);
      
      btnCuatro = new JButton("4");
      btnCuatro.setBounds(30, 140, 45, 30);
      
      btnCinco = new JButton("5");
      btnCinco.setBounds(90, 140, 45, 30);
      
      btnSeis = new JButton("6");
      btnSeis.setBounds(150, 140, 45, 30);
      
      btnMenos = new JButton("-");
      btnMenos.setBounds(210, 140, 45, 30);
      
      btnSiete = new JButton("7");
      btnSiete.setBounds(30, 190, 45, 30);
      
      btnOcho = new JButton("8");
      btnOcho.setBounds(90, 190, 45, 30);
      
      btnNueve = new JButton("9");
      btnNueve.setBounds(150, 190, 45, 30);
      
      btnMultiplicacion = new JButton("*");
      btnMultiplicacion.setBounds(210, 190, 45, 30);
      
      btnCero = new JButton("0");
      btnCero.setBounds(30, 240, 45, 30);
      
      btnPunto = new JButton(".");
      btnPunto.setBounds(90, 240, 45, 30);
      
      btnIgual = new JButton("=");
      btnIgual.setBounds(150, 240, 45, 30);
            
      btnDivision = new JButton("/");
      btnDivision.setBounds(210, 240, 45, 30);
      
      btnEliminar = new JButton("DEL");
      btnEliminar.setBounds(120, 290, 60, 30);
      
      //Acciones
      btnUno.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"1");
          }
      });
      
      btnDos.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"2");
          }
      });
      
      btnTres.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"3");
          }
      });
      btnCuatro.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"4");
          }
      });
      btnCinco.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"5");
          }
      });
      btnSeis.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"6");
          }
      });
      btnSiete.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"7");
          }
      });
      btnOcho.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"8");
          }
      });
      btnNueve.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"9");
          }
      });
      btnCero.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"0");
          }
      });
      btnEliminar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText("");
          }
      });
      btnPunto.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+".");
          }
      });

      btnMas.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             num1 = Float.parseFloat(txt.getText());
             operador = "+";
             txt.setText("");
          }
      });
      btnMenos.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             num1 = Float.parseFloat(txt.getText());
             operador = "-";
             txt.setText("");
          }
      });
      btnMultiplicacion.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             num1 = Float.parseFloat(txt.getText());
             operador = "*";
             txt.setText("");
          }
      });
      btnDivision.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             num1 = Float.parseFloat(txt.getText());
             operador = "/";
             txt.setText("");
          }
      });
      btnIgual.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             num2 = Float.parseFloat(txt.getText());
             switch (operador) {
                case "*": txt.setText(Float.toString(num1 * num2));break;
                case "+": txt.setText(Float.toString(num1 + num2));break;
                case "-": txt.setText(Float.toString(num1 - num2));break;
                case "/": txt.setText(Float.toString(num1 / num2));break;
             }
          }
      });
      
      
      //Crear un contenedor
      JPanel panel = new JPanel()
      
      panel.setLayout(null);//Desactiva el disenio predeterminado
      panel.add(txt);
      panel.add(lblEtiqueta);
      panel.add(btnUno);
      panel.add(btnDos);
      panel.add(btnTres);
      panel.add(btnMas);
      panel.add(btnCuatro);
      panel.add(btnCinco);
      panel.add(btnSeis);
      panel.add(btnMenos);
      panel.add(btnSiete);
      panel.add(btnOcho);
      panel.add(btnNueve);
      panel.add(btnMultiplicacion);
      panel.add(btnCero);
      panel.add(btnPunto);
      panel.add(btnDivision);
      panel.add(btnIgual);
      panel.add(btnEliminar);
      
      //Agregar a la ventana
      setContentPane(panel);
      setVisible(true); 
   }
} 
