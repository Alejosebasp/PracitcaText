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
public class Programa {
    
    public String nombre;
    public String departamento;
    public ArrayList <Curso> cursos;

    public Programa(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cursos = new <Curso> ArrayList();
    }
    
    public void añadirCurso(String nombre, int creditos){
        Curso curso = new Curso(nombre, creditos);
        cursos.add(curso);
    }
}
