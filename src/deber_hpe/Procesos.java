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
public class Procesos implements Interfaz{

    @Override
    public String dar_cita() {
        String fecha;
        fecha= JOptionPane.showInputDialog("Ingresar la fecha de la cita: ");
        return fecha;
    }

    @Override
    public String pedir_Cita() {
        String Nombre;
        Nombre=JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        String Apellido;
        Apellido=JOptionPane.showInputDialog("Ingrese el apellido del paciente:");
        String Cedula;
        Cedula=JOptionPane.showInputDialog("Ingrese la cedula del paciente:");
        String Historia;
        Historia=JOptionPane.showInputDialog("Ingrese el número de historia del paciente:");
        String inf;
        inf="Nombre: "+Nombre+"\n"+"Apellido: "+Apellido+"\n"+"Cédula: "+Cedula+"\n"+"N°Historia: "+Historia;
        return inf;
    }

    @Override
    public String atender_Paciente() {
        String sintomas;
        sintomas=JOptionPane.showInputDialog("Ingrese los sintomas:");
        String medicamento;
        medicamento=JOptionPane.showInputDialog("Ingrese los medicamentos:");
        String diagnostico;
        diagnostico="Sintomas: "+sintomas+"\n"+"Receta: "+medicamento;
        return diagnostico;
    }
    
}
