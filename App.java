
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {

    public static void main(String[] args) throws Exception {
        JFrame ventana = new JFrame("Primera ventana");//Se crea la ventana
        ventana.setSize(500, 500);//Tamaño de laS ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salir de la ventana
        ventana.getContentPane().setBackground(Color.black);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));

        JLabel etiqueta1 = new JLabel("Ingrese el primer numero ");
        JTextField campo1 = new JTextField();
        etiqueta1.setForeground(Color.white);
        campo1.setBackground(Color.gray);
        campo1.setPreferredSize(new Dimension(50, 30));

        JLabel etiqueta2 = new JLabel("Ingrese el segundo numero");
        JTextField campo2 = new JTextField();
        campo2.setBackground(Color.gray);
        etiqueta2.setForeground(Color.white);
        campo2.setPreferredSize(new Dimension(50, 20));

        JButton Sumar = new JButton("Sumar");//crear un boton
        Sumar.setBackground(Color.ORANGE);
        Sumar.setMargin(new Insets(5, 18, 5, 18));

        JButton Restar = new JButton("Restar");
        Restar.setMargin(new Insets(5, 18, 5, 18));
        Restar.setBackground(Color.ORANGE);

        JButton Multiplicar = new JButton("Multiplicar");
        Multiplicar.setBackground(Color.ORANGE);
        Multiplicar.setMargin(new Insets(5, 7, 5, 7));

        JButton Dividir = new JButton("Dividir");
        Dividir.setBackground(Color.ORANGE);
        Dividir.setMargin(new Insets(5, 19, 5, 19));

        JLabel resultado = new JLabel("Resultado:");
        resultado.setForeground(Color.white);
        Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int etiqueta1 = Integer.parseInt(campo1.getText());
                    int etiqueta2 = Integer.parseInt(campo2.getText());
                    int suma = etiqueta1 + etiqueta2;
                    resultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    resultado.setText("Ingrese solo numeros");
                }
            }
        });
        Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int etiqueta1 = Integer.parseInt(campo1.getText());
                    int etiqueta2 = Integer.parseInt(campo2.getText());
                    int resta = etiqueta1 - etiqueta2;
                    resultado.setText("Resultado: " + resta);
                } catch (NumberFormatException ex) {
                    resultado.setText("Ingrese solo numeros");
                }
            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int etiqueta1 = Integer.parseInt(campo1.getText());
                    int etiqueta2 = Integer.parseInt(campo2.getText());
                    int multiplicacion = etiqueta1 * etiqueta2;
                    resultado.setText("Resultado: " + multiplicacion);
                } catch (NumberFormatException ex) {
                    resultado.setText("Ingrese solo numeros");
                }
            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double etiqueta1 = Integer.parseInt(campo1.getText());
                    double etiqueta2 = Integer.parseInt(campo2.getText());
                    if (etiqueta2 == 0) {
                        resultado.setText("La division entre 0 no esta definida");
                    } else {
                        double dividir = etiqueta1 / etiqueta2;
                        resultado.setText("Resultado: " + dividir);
                    }
                } catch (NumberFormatException ex) {
                    resultado.setText("Ingrese solo numeros");
                }
            }
        });
        ventana.setSize(200, 300);
        ventana.add(etiqueta1);
        ventana.add(campo1);
        ventana.add(etiqueta2);
        ventana.add(campo2);
        ventana.add(Sumar);
        ventana.add(Restar);
        ventana.add(Multiplicar);
        ventana.add(Dividir);
        ventana.add(resultado);
        ventana.setVisible(true);
    }
}
