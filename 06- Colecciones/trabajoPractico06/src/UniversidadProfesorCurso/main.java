package UniversidadProfesorCurso;


public class main {
    
    public static void main(String[] args) {
        
        Universidad utn = new Universidad("UTN");

        
        Profesor p1 = new Profesor("P01", "Ana Pérez", "Programación");
        Profesor p2 = new Profesor("P02", "Carlos Gómez", "Bases de Datos");
        Profesor p3 = new Profesor("P03", "Laura Díaz", "Redes");

        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        
        Curso c1 = new Curso("C01", "Programación II");
        Curso c2 = new Curso("C02", "Base de Datos I");
        Curso c3 = new Curso("C03", "Redes I");
        Curso c4 = new Curso("C04", "Sistemas Operativos");
        Curso c5 = new Curso("C05", "Algoritmos");

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        System.out.println("\n------------------------------------------");
        utn.asignarProfesorACurso("C01", "P001");
        utn.asignarProfesorACurso("C02", "P002");
        utn.asignarProfesorACurso("C03", "P003");
        utn.asignarProfesorACurso("C04", "P001");
        utn.asignarProfesorACurso("C05", "P001");

        System.out.println("\n------------------------------------------");
        utn.listarProfesores();
        System.out.println();
        utn.listarCursos();

        System.out.println("\n------------------------------------------");
        utn.asignarProfesorACurso("C04", "P02");

        System.out.println("\n------------------------------------------");
        utn.eliminarCurso("C05");

        System.out.println("\n------------------------------------------");
        utn.eliminarProfesor("P03");

        System.out.println("\n------------------------------------------");
        utn.reporteCursosPorProfesor();
    }
    
}
