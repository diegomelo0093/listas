/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String apellido;
    private double salario;
    public Scanner leer=new Scanner(System.in);
    
    public Empleado(){}

    
    public Empleado(int id, String nombre,String apellido, double salario){
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
        public double getSalario(){
            return salario;   
        }
       public void setSalario(double salario){
           this.salario=salario;
       }

       
        
    @Override
        public String toString(){
          return " Id:" + getId() + " Nombre:" + getNombre() + " Apellido:" + getApellido() + " salario:" + getSalario();
      }
        @Override
    public int hashCode(){
        return Objects.hash(id,nombre,apellido,salario);
    }
    @Override
    public boolean equals(Object object) {

        if(object == this)
            return true;

        if(!(object instanceof Empleado)){
            return false;
        }

        Empleado empleado = (Empleado) object;

        return empleado.getId() == id &&
                Objects.equals(empleado.getNombre(), nombre)&&
               Objects.equals(empleado.getApellido(), apellido) &&
               Objects.equals(empleado.getSalario(), salario);
    }
}
    

