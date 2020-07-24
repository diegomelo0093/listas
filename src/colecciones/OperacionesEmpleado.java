/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class OperacionesEmpleado {
     private static final List<Empleado> listaEmpleados = new ArrayList<>();    
     public static void inicializarLista(){
         listaEmpleados.add(new Empleado(1,"diego","melo",200.320));
         listaEmpleados.add(new Empleado(2,"juan","diaz",300.232));
         listaEmpleados.add(new Empleado(3,"jessica","sanchez",700.232));
         listaEmpleados.add(new Empleado(4,"samuel","cardenas",900.232));
         listaEmpleados.add(new Empleado(5,"sebas","torres",800.232));
         listaEmpleados.add(new Empleado(6,"camilo","barana",950.232));
         listaEmpleados.add(new Empleado(7,"elizabeth","jaramillo",1000));
     }
     public static void agregarEmpleado(){
                Scanner leer = new Scanner(System.in);
               
                 
                boolean correcto = true;
                int ids; 
                
                do{
                System.out.print("\nIngrese el ID: ");
                ids=leer.nextInt();
                for(int i = 0; i < listaEmpleados.size(); i++){
                        Empleado empleado=listaEmpleados.get(i);
                        if(empleado.getId()==ids){
                            System.out.print("el usuario ya existe");
                            correcto=true;
                            break;
                        }else{ 
                            correcto=false;
                            break;
                        }
                    }
                } while(correcto==true);
               
                System.out.print("Ingrese el NOMBRE: ");
                leer.nextLine();
                String name=leer.nextLine();
                System.out.print("Ingrese el APELLIDO: ");
                String lastname=leer.nextLine();
                System.out.print("Ingrese el SALARIO:  ");
                double money=leer.nextInt();
                Empleado emple=new Empleado(ids ,name,lastname,money);
                listaEmpleados.add(emple);
                System.out.println("_______________________________");
                System.out.println("Empleado creado");
                System.out.println("Nombre :" + emple.getNombre());
                System.out.println("apellido :" + emple.getApellido());
                System.out.println("salario:" + emple.getSalario());
                System.out.println("ID:" + emple.getId());
                System.out.println("_______________________________");
         
     }
     public static void eliminarEmpleado(){
                Scanner leer = new Scanner(System.in);
                System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                Empleado empleado=listaEmpleados.get(i);                
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
                          
                } 

         
     }
    public static void mostrarEmpleado(){
                System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++)
                { 
                Empleado empleado=listaEmpleados.get(i);
                
                System.out.println("Nombre:" + empleado.getNombre());
                System.out.println("apellido:" + empleado.getApellido());
                System.out.println("salario:" + empleado.getSalario());
                System.out.println("ID:" + empleado.getId());
                System.out.println("_______________________________");
                }
         
     }
    public static void actualizarEmpleado(){
                Scanner leer = new Scanner(System.in);
                int id,ids;
                System.out.println("_______________________________");
                System.out.println("Estos son los datos");
                for(int i = 0; i < listaEmpleados.size(); i++){ 
                Empleado empleado=listaEmpleados.get(i);
               
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
                    String name=leer.nextLine();
                    System.out.print("Ingrese el APELLIDO: ");
                    String lastname=leer.nextLine();
                    System.out.print("Ingrese el SALARIO: ");
                    double money=leer.nextInt();
                    System.out.println("EMPLEADO ACTUALIZADO");
                    empleado.setId(ids);
                    empleado.setNombre(name);
                    empleado.setApellido(lastname);
                    empleado.setSalario(money);
                  }
                }
                

     }
    public static void mostrarGanadoresDeSueldo() {
        System.out.println("\nEmpleados con buen salario");
        filtrarEmpleadosGanadoresDeSueldo()
                        .sorted(Comparator.comparing(Empleado::getSalario, Comparator.reverseOrder()))
                        .forEach(System.out::println);
        System.out.println("\n");
        
    }  public static void mostrarNumeroDeGanadoresDeSueldo() {
        System.out.print("\nNúmero de empleados con buen sueldo: " + filtrarEmpleadosGanadoresDeSueldo().count());
        System.out.println("\n");
    }
      private static Stream<Empleado> filtrarEmpleadosGanadoresDeSueldo(){
            return listaEmpleados.stream()
                               .filter(empleado -> empleado.getSalario() >= 700.000);
          
      }
    public static void mostrarEmpleadosConApellidoQueEmpiezaConJ(){   
     System.out.println("Empleados totales que empiezan por J: "+
             listaEmpleados.stream().filter(empleado -> empleado.getApellido().toUpperCase().startsWith("J")).count());
    }  

     public static Map<Integer, Empleado> listToMap(){
         return listaEmpleados.stream()
                               .collect(Collectors.toMap(
                                       Empleado::getId,
                                       empleado -> empleado
                               ));
     }
     public static void mostrarEmpleadoConMenorSueldo() {
          System.out.println("\nEmpleado con mayor sueldo");
          System.out.println(listaEmpleados.stream().min(Comparator.comparing(Empleado::getSalario))     
                                           .map(Empleado::toString)
                                           .orElse("No hay estudiantes"));
  
     }
      public static void mostrarEmpleadoConMayorSueldo() {
          System.out.println(listaEmpleados.stream().max(Comparator.comparing(Empleado::getSalario))
                                           .map(Empleado::toString)
                                           .orElse("No hay empleados"));
      }
      public static void mostrarEmpleadosOrdenadosPorNombre() {
          System.out.println("\nEmpleados Organizados por Apellido:");
        listaEmpleados.stream()
                        .sorted(Comparator.comparing(Empleado::getNombre))
                        .forEach(System.out::println);
      }
      public static void mostrarEmpleadosOrdenadosPorApellido() {
          System.out.println("\nEmpleados Organizados por Apellido:\n");
            listaEmpleados.stream()
                        .sorted(Comparator.comparing(Empleado::getApellido))
                       .forEach(System.out::println);
      }

      public static void SumaTotal(){
          System.out.println("\nSuma de empleados: "+
        
         listaEmpleados.stream()
                 .filter(empleado -> empleado.getSalario() >= 700.000)
                 .mapToDouble(Empleado::getSalario)
                 .reduce(0,(acc,salario)->acc+salario));
                 
                 
          
      }
        public static void mostrarLosCincoMejores(){
            System.out.println("\nCinco primeros con mejor salario: ");
                    listaEmpleados.stream().filter(empleado -> empleado.getSalario() >= 600.000)
                            .sorted(Comparator.comparing(Empleado::getSalario)).limit(5)
                            .forEach(System.out::println);
       
    }
}
