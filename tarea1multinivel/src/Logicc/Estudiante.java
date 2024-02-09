
package Logicc;

public class Estudiante {
    private int codigo;
    private String nombre;
    private double notas[];

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Estudiante(int codigo, String nombre, double[] notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notas = notas;
    }

    
    public String toString() {
        return "Estudiante: " + "codigo= " + codigo + ", nombre= " + nombre + ", nota 1= " + notas[0] + ", nota 2= " + notas[1] + ", nota 3= "+ notas[2]+ "\n" + " Promedio= ";
    }
    
    public double obtenerPromedio() {
        double contadorPromedio=0;
        for(int i=0; i<3; i++){
            contadorPromedio+= this.notas[i];
        }
        return contadorPromedio/3;
    }
    
    
    
}
