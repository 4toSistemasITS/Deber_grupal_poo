/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_hpe;

/**
 *
 * @author Valeria
 */
public class Paciente extends Procesos{

    public String infor_Paciente(){
       Procesos p= new Procesos();
       String paciente;
       paciente=p.pedir_Cita();
       return paciente;
    }
}
