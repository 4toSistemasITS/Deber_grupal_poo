/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_hpe;

import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class Deber_hpe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion;
        //System.out.println("Ingrese una opción de hospital: \n"+"1)Hospital del IEES\n"+"2)Hospital Isidro Ayora");
        Hospital h1= new Hospital();
        opcion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción para programar una cita\n"+"1)Hospital Isidro Ayora"));
        switch(opcion){
            case 1:
                String Hospital1;
                String Paciente1;
                String Doctor1;
                Hospital1=h1.inf_hospital();
                Paciente pa=new Paciente();
                Paciente1=pa.infor_Paciente();
                Doctor d=new Doctor();
                Doctor1= d.inf_Doctor();
                JOptionPane.showMessageDialog(null,Hospital1+"\nINFORMACIÓN DEL PACIENTE\n"+
                        Paciente1+"\n"+Doctor1);
                break;
            case 2:
                String Hospital;
                String Paciente;
                String Doctor;
                Hospital=h1.inf_hospital2();
                Paciente pa2=new Paciente();
                Paciente=pa2.infor_Paciente();
                Doctor d2=new Doctor();
                Doctor= d2.inf_Doctor();
                JOptionPane.showMessageDialog(null,Hospital+"\nINFORMACIÓN DEL PACIENTE\n"+
                        Paciente+"\n"+Doctor);
                break;
        }
    }
    
}
