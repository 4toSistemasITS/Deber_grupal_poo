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
public class Hospital extends Procesos{
    public String nombre;
    public int id;
    public String direccion;
    public String telefono;

    public Hospital() {
    }

    public Hospital(String nombre, int id, String direccion, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String inf_hospital(){
        String fecha;
        String inf_h;
        Procesos p= new Procesos();
        nombre="Isidro Ayora";
        id=123;
        direccion="av.Nueva loja entre Riobanban e Ibarra";
        telefono="0985089837";
        fecha= p.dar_cita();
        inf_h=nombre+"\n"+"ID: "+id+"\n"+"Dirección: "+direccion+"\n"+"Telefono: "+telefono+"\n"+"Cita programada para: "+fecha;
        return inf_h;
        
    }
}
