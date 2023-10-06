package ejemplosdeuso;

import javax.swing.*;
 
public class ExJPanelyJTabbebPane{

    public static void main(String[] args) {
 
        JFrame v = new JFrame("Nueva Ventana");
        v.setDefaultCloseOperation(3);
        v.setVisible(true);
        v.setTitle("Ejemplo JPanel y JTabbedPane");
        v.setBounds(100, 100, 500, 500);
 
        //Creamos el conjunto de pestañas
        JTabbedPane pestañas=new JTabbedPane();
 
        //Creamos el panel y lo añadimos a las pestañas
        JPanel panel1=new JPanel();
 
        //Componentes del panel1
        JLabel et_p1=new JLabel("Estas en el panel 1");
        panel1.add(et_p1);
 
        //Añadimos un nombre de la pestaña y el panel
        pestañas.addTab("Panel 1", panel1);
 
        //Realizamos lo mismo con el resto
        JPanel panel2=new JPanel();
        pestañas.addTab("Panel 2", panel2);
 
        //Componentes del panel2
        JLabel et_p2=new JLabel("Estas en el panel 2");
        panel2.add(et_p2);
 
        JPanel panel3=new JPanel();
 
        //Componentes del panel3
        JLabel et_p3=new JLabel("Estas en el panel 3");
        panel3.add(et_p3);
 
        pestañas.addTab("Panel 3", panel3);
 
        JPanel panel4=new JPanel();
 
        //Componentes del panel4
        JLabel et_p4=new JLabel("Estas en el panel 4");
        panel4.add(et_p4);
 
        pestañas.addTab("Panel 4", panel4);
        
        //Agregar al JFrame
        v.getContentPane().add(pestañas);
    }
}