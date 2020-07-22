/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String apellido;
    private int salario;
    
    
    public Empleado(){}

    
    public Empleado(int id, String nombre,String apellido, int salario){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

        public int getId(){
         return id;   
        }
        public void setId(int id){
            this.id=id;
        }
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public void setApellido(String apellido){
            this.apellido=apellido;
        }
        public int getSalario(){
            return salario;   
        }
       public void setSalario(int salario){
           this.salario=salario;
       }
       
      /*
        public boolean validar(int id){
            for (Empleado empleado :listaEmpleados)
            {
                
                if(empleado.getId()==id){
                    return true;
                }
            }
            return false;         
        }
        */
        
        
    @Override
        public String toString(){
          return " Id:" + getId() + " Nombre:" + getNombre() + " Apellido:" + getApellido() + " salario:" + getSalario();
      }
}
    

