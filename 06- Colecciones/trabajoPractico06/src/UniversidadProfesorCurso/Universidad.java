package UniversidadProfesorCurso;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor agragado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("✅Curso agregado: " + c.getNombre());
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null || profesor == null) {
            System.out.println("Curso o profesor no encontrado.");
            return;
        }

        curso.setProfesor(profesor);
        System.out.println("📘Asignado profesor " + profesor.getNombre()
                + " al curso " + curso.getNombre());
    }

    public void listarProfesores() {
        System.out.println("👨‍? Profesores registrados: ");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos registrados:");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c);
            }
            cursos.remove(c);
            System.out.println("Curso eliminado: " + c.getNombre());
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor eliminado: " + p.getNombre());
        }
    }
    
    public void reporteCursosPorProfesor() {
        System.out.println("Cantidad de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }

}
