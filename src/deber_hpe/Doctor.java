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
public class Doctor extends Procesos{
    public String nombre_d, apellido_d;
    public int targeta;

    public Doctor() {
    }

    public Doctor(String nombre_d, String apellido_d, String cedula, int targeta) {
        this.nombre_d = nombre_d;
        this.apellido_d = apellido_d;
        this.targeta = targeta;
    }

    public String getNombre_d() {
        return nombre_d;
    }

    public void setNombre_d(String nombre_d) {
        this.nombre_d = nombre_d;
    }

    public String getApellido_d() {
        return apellido_d;
    }

    public void setApellido_d(String apellido_d) {
        this.apellido_d = apellido_d;
    }

    public int getTargeta() {
        return targeta;
    }

    public void setTargeta(int targeta) {
        this.targeta = targeta;
    }
    public String inf_Doctor(){
       Procesos P= new Procesos();
       String Doctor;
       String diagnostico;
        nombre_d=  JOptionPane.showInputDialog("Ingrese el nombre del Doctor:");
        apellido_d= JOptionPane.showInputDialog("Ingrese el apellido del Doctor");
        targeta= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el N° tarjeta"));
        diagnostico=P.atender_Paciente();
        Doctor="INFORMACIÓN DEL DOCTOR\n"+"Nombre: "+nombre_d+"\n"+"Apellido: "+apellido_d+"\n"
                +"N° de terjeta: "+targeta+"\n"+"DIAGNOSTICO \n"+ diagnostico;
        return Doctor;
    }
    
}
