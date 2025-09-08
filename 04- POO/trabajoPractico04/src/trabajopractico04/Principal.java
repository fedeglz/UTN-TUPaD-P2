package trabajopractico04;


public class Principal {

    
    public static void main(String[] args) {
        //Con contructor completo
        Empleado empleado1 = new Empleado(1, "Federico Gonzalez", "Desarrollador", 500000);
        
        //Con contructor parcial
        Empleado empleado2 = new Empleado("Santiago Gonzalez", "Tester");
        Empleado empleado3 = new Empleado("Maria Jose", "Analista");
        
        //Actualizar salario
        empleado2.actualizarSalario(10);  //10% de aumento
        empleado3.actualizarSalario(200000);   //Aumento fijo
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        //Total empleados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
