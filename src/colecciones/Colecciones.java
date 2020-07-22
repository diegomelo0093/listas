/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//

package colecciones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author diego
 */
public class Colecciones {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner st=new Scanner(System.in);
        List<Empleado> listaEmpleados = new ArrayList<>();
        Empleado e=new Empleado();
        int ids;
        int menu = 0;
    while(menu!=5)
      {
            System.out.println("Bienvenido al menu estas son las opciones\n"
            + "1 Para agregar un empleado\n"
            +"2 Para Eliminar un empleados\n"
            +"3 Para actualizar un empleado\n"
            +"4 Para mostrar todos los empleados\n"
            +"5 Para salir\n");
            menu=leer.nextInt();
        switch (menu)
        {
            case 1: 
                menu=1;//agregar datos

                boolean correcto = false;
                do{
                System.out.print("\nIngrese el ID: ");
                ids=leer.nextInt();  
                for(int i = 0; i < listaEmpleados.size(); i++){
                  Empleado empleado=listaEmpleados.get(i);
                  if(empleado.getId()==ids){  
                      correcto=true;
                      break;
                  }else{
                      correcto=false;
                  }
                }
                }
                while(correcto==true);
                
                System.out.print("Ingrese el NOMBRE: ");
                leer.nextLine();
                String name=leer.nextLine();
                System.out.print("Ingrese el APELLIDO: ");
                String lastname=leer.nextLine();
                System.out.print("Ingrese el SALARIO:  ");
                int money=leer.nextInt();
                Empleado emple=new Empleado(ids ,name,lastname,money);
                listaEmpleados.add(emple);
                System.out.println("_______________________________");
                System.out.println("Empleado creado");
                System.out.println("Nombre :" + emple.getNombre());
                System.out.println("apellido :" + emple.getApellido());
                System.out.println("salario:" + emple.getSalario());
                System.out.println("ID:" + emple.getId());
                System.out.println("_______________________________");

                break;
        
            case 2: menu=2;//eliminar datos
                System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                Empleado empleado=listaEmpleados.get(i);
                System.out.println("_______________________________");
                System.out.println("Nombre:" + empleado.getNombre());
                System.out.println("apellido:" + empleado.getApellido());
                System.out.println("salario:" + empleado.getSalario());
                System.out.println("ID:" + empleado.getId());
                System.out.println("_______________________________");
                }

                System.out.println("Ingrese el ID que desea eliminar");
                int id=leer.nextInt();
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                    Empleado empleado=listaEmpleados.get(i);
                  if(empleado.getId()==id){
                    listaEmpleados.remove(i);
                  }      
                  else{
                       System.out.print("usuario no creado");
                  }
                } 
                
            break;
            case 3: menu= 3;// actualizar datos
                System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                Empleado empleado=listaEmpleados.get(i);
                System.out.println("_______________________________");
                System.out.println("Nombre:" + empleado.getNombre());
                System.out.println("apellido:" + empleado.getApellido());
                System.out.println("salario:" + empleado.getSalario());
                System.out.println("ID:" + empleado.getId());
                System.out.println("_______________________________");
                }
                
                System.out.print("Ingrese el ID que desea actualizar: ");
                id=leer.nextInt();
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                Empleado empleado=listaEmpleados.get(i);
                  if(empleado.getId()==id){
                      
                    System.out.print("Ingrese el ID: ");
                    ids=leer.nextInt();
                    System.out.print("Ingrese el NOMBRE: ");
                    leer.nextLine();
                    name=leer.nextLine();
                    System.out.print("Ingrese el APELLIDO: ");
                    lastname=leer.nextLine();
                    System.out.print("Ingrese el SALARIO: ");
                    money=leer.nextInt();
                    System.out.print("EMPLEADO ACTUALIZADO");
                    empleado.setId(ids);
                    empleado.setNombre(name);
                    empleado.setApellido(lastname);
                    empleado.setSalario(money);
                  }
                  else{
                       System.out.print("usuario no creado");
                  }
                }
               
                break;
        
        
        
            case 4: menu=4;//mostrar los datos
            
                 System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++)
                { 
                Empleado empleado=listaEmpleados.get(i);
                System.out.println("_______________________________");
                System.out.println("Nombre:" + empleado.getNombre());
                System.out.println("apellido:" + empleado.getApellido());
                System.out.println("salario:" + empleado.getSalario());
                System.out.println("ID:" + empleado.getId());
                System.out.println("_______________________________");
                }
                break;
        }
      }
    }
    
}
