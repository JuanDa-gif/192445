import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int  nombreDeEstudiantes= 5;
        int  edadEstudiantes=0; 
        for(int i=0 ; i<nombreDeEstudiantes ; i++){
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreDeEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int edad1= input.nextInt();
        input.nextLine();

        float promedioEdad = (edad1 / nombreDeEstudiantes);

        System.out.println("Edad promedio de los estudiantes: " + promedioEdad);

        if (edad1 > 17) {
            System.out.println(nombreDeEstudiante + " es mayor de edad");
        } else {
            System.out.println(nombreDeEstudiante + " es menor de edad");
        }
    }

        System.out.println("Programa finalizado.");
}

} 

