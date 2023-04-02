import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class App {

    public static void main(String[] args){
        Controller control = new Controller();
        VendaPizza P = new VendaPizza("Peperoni", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);    P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        P = new VendaPizza("Calabresa", 25, 43.50);
        control.adicionaPizza(P);
        P = new VendaPizza("Camarão", 30, 70.5);
        control.adicionaPizza(P);
        System.out.println( control.toString());
        System.out.println("Valor total de vendas: " +control.calculoPizzasVendidas() );
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(1000,1000); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(500, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JTextArea miJText = new JTextArea(control.toString());
        

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(" O valor total de vendas é = "+control.calculoPizzasVendidas() + "\n O valor líquido é = "+control.calculoValorLiquido()); 
        

        // conecta los componentes JLabel y JTextField en JPanel
        miJPanel.add(miJText);
        miJPanel.add(miJTextArea);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }


    public  static void inicializa(){
    Controller control = new Controller();
    VendaPizza P = new VendaPizza("Peperoni", 25, 43.50);
    control.adicionaPizza(P);
    P = new VendaPizza("Calabresa", 25, 43.50);
    control.adicionaPizza(P);
    P = new VendaPizza("Camarão", 30, 70.5);
    control.adicionaPizza(P);
    
    System.out.println( control.toString());
    System.out.println("Valor total de vendas: " +control.calculoPizzasVendidas() );

    }

}