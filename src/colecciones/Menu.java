
package colecciones;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    
     private static Scanner scanner = new Scanner(System.in);
     
     public static void mostrarMenu(){
         
         OperacionesEmpleado.inicializarLista();
       int opcion;
        do {  
            mostrarOpciones();
            opcion = validarOpcion();
         switch (opcion) {
                case 1:
                    OperacionesEmpleado.agregarEmpleado();
                    break;
                case 2:
                    OperacionesEmpleado.eliminarEmpleado();
                    break;
                case 3:
                    OperacionesEmpleado.actualizarEmpleado();
                    break;
                case 4:
                    OperacionesEmpleado.mostrarEmpleado();
                    break;
                case 5:
                    OperacionesEmpleado.mostrarGanadoresDeSueldo();
                    break;
                case 6:
                    OperacionesEmpleado.mostrarNumeroDeGanadoresDeSueldo();
                    break;
                case 7:
                    OperacionesEmpleado.mostrarEmpleadosConApellidoQueEmpiezaConJ();
                    break;
                case 8:
                    OperacionesEmpleado.listToMap().forEach(
                            (id, empleado) -> System.out.println(id + ". " + empleado)
                    );
                    break;
                case 9:
                    OperacionesEmpleado.mostrarEmpleadoConMenorSueldo();
                    break;
                case 10:
                    OperacionesEmpleado.mostrarEmpleadoConMayorSueldo();
                    break;
                case 11:
                    OperacionesEmpleado.mostrarEmpleadosOrdenadosPorNombre();
                    break;
                case 12:
                    OperacionesEmpleado.mostrarEmpleadosOrdenadosPorApellido();
                    break;
                case 13:
                    OperacionesEmpleado.mostrarLosCincoMejores();
                    break;
                case 14:
                    OperacionesEmpleado.SumaTotal();
                    break;
                case 15:
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while(opcion != 15);

        System.out.println("Muchas gracias por usar nuestro sistema");
    }

         private static void mostrarOpciones() {
            System.out.println("Bienvenido al menu estas son las opciones\n"
            + "1 Para agregar un empleado\n"
            +"2 Para Eliminar un empleado\n"
            +"3 Para actualizar un empleado\n"
            +"4 Para mostrar todos los empleados\n"
            +"5 Mostrar los empleados con buen sueldo\n" 
            +"6 Numero de empleados con buen sueldo\n"
            +"7 número total de empleados cuyo apellido comienza por la letra J\n"
            +"8 Para convertir lista a mapa\n"
            +"9 Para mostrar empleado con menor sueldo\n"
            +"10 Para mostrar empleado con mayor sueldo\n" 
            +"11 Para ordenarlos por nombre\n"
            +"12 Para ordenarlos por apellido\n"         
            +"13 cinco primeros empleados con el mayor salario teniendo \n"
            +"14  suma de los salarios de todos los empleados cuyo salario es mayor a 700000\n"
            +"15 Para salir\n");
        }
        private static int validarOpcion(){
                   try{
                      return scanner.nextInt();
                    }catch(InputMismatchException exception){
                        scanner.nextLine();
                        return 0;
      }
    }
  }

 


