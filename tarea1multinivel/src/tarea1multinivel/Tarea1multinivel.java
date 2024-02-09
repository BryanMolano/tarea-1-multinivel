
package tarea1multinivel;
import Logicc.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
public class Tarea1multinivel {
    private Estudiante estudiante;
    private ArrayList<Estudiante> estudiantes;
//Traer  un programa que aplique 1los conceptos de Clase, 
//definir la clase Estudiante con atributos código, nombre y notas (tres notas decimales), con un método que calcule el promedio de las notas.
    public static void main(String[] args) {
       Tarea1multinivel principal = new Tarea1multinivel();
       
       principal.iniciar();
    }
    private void iniciar() {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Digite una opcion:\n" + "0. Salir\n" + "1. Digitar un nuevo estudiante\n" + "2. Ver tdos los estudiantes\n");
			op = sc.nextInt();
			if (op == 1) {
                            for(int j=0; j<3; j++){
                            System.out.println("Digite el codigo del estudiante");
                            int codigoEstudiante = sc.nextInt();
                            System.out.println("Digite el nombre del estudiante");
                            String nombreEstudiante = sc.next();
                            System.out.println("Ingrese las tres notas del estudiante");
                            double notas[] = new double[3];
                            for(int i=0; i<3; i++){
                                System.out.println("Digite la nota numero " + (i+1));
                                notas[i] = sc.nextDouble();
                        }
                            this.estudiante = new Estudiante(codigoEstudiante, nombreEstudiante, notas);
                            this.estudiantes.add(estudiante);
                            }
			} else if (op == 2) {
                            System.out.println("A continuacion los estudiantes y sus respectivas notas: ");
                            for(Estudiante estudiante : estudiantes){
                                System.out.println(estudiante.toString() + estudiante.obtenerPromedio()+ "\n =========");
                            }
			}
                        }while (op != 0);
                        sc.close();
    }

    public Tarea1multinivel() {
        this.estudiantes = new ArrayList<Estudiante>();
    }

   
    }
    
                       

