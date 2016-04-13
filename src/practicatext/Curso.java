/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatext;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Curso {
    
    public String nombre;
    public int creditos;
    public ArrayList <Estudiante> estudiantes;

    public Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.estudiantes = new ArrayList<>();
    }

    public void añadirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}
