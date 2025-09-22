package ejercicio9;


public class main {
    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("Federico González", "OSDE");
        Profesional doctor = new Profesional("Dr. López", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-09-23", "10:30");

        cita.setPaciente(paciente);
        cita.setProfesional(doctor);

        System.out.println(cita);
        System.out.println("El paciente tiene cita: " + paciente.getCita());
        System.out.println("El profesional atiende al paciente: " + doctor.getPaciente());
    }
    
}
