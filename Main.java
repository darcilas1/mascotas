import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        nombre();
        simonMartinez();
        crearMascota();
        consultarMascotas();
        Darcilas1();
    }

    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }

    static void imprimirMiNombre() {
        System.out.println("Mi nombre es: Luis Castrillon");
    }

    static void printName() {
        System.out.println("Modificado por: Paula");
    }

    static void nombreFelipe() {
        System.out.println("Tarea 2");
        String nombre = "Nombre: Felipe Ochoa Lotero ";
        String group = "Número de documento: 1000409803 ";
        String documento = "Grupo: 3091 Viernes 6-9am";
        System.out.println(nombre + group + documento);
    }

    static void nombre112() {
        System.out.println("Nombre: Juan Esteban Zuluaga Quintero ");
        System.out.println("Número de documento: 1036252594 ");
        System.out.println("Nombre: Alejandro Jaramillo Rodriguez ");
        System.out.println("Número de documento: 1027800088 ");
        System.out.println("Grupo: Viernes 9-12m ");
        System.out.println("Nombre: Jose Alejandro Jimenez Vasquez ");
        System.out.println("Número de documento: 1020302386 ");
        System.out.println("Grupo: Jueves 9-12m ");
    }

    static void nuevoNombre() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo ");
        System.out.println("Número de documento: 1036928998 ");
        System.out.println("Grupo: Jueves 9-12am ");
    }

    static void simonMartinez() {
        System.out.println("Nombre: Simon Martinez ");
        System.out.println("Número de documento: 1001367561 ");
        System.out.println("Grupo: miercoles 9-12am ");
    }

    static void IsaIda() {
        System.out.println("Nombre: Isabella Idarraga Botero ");
        System.out.println("Numero de identificación: 1011511471 ");
        System.out.println("Grupo: 9am-12pm ");
    }

    static void EstebanRomero() {
        System.out.println("Nombre: Esteban Jacob Romero Ríos ");
        System.out.println("Numero de identificación: 1044211596 ");
        System.out.println("Grupo: Jueves 9am-12pm ");
    }

    static void SamuelHenao() {
        System.out.println("Nombre: Samuel Henao Castrillon ");
        System.out.println("Grupo: Jueves 9am-12pm ");
    }

    static void thomasBuitrago() {
        System.out.println("Nombre: Thomas Buitrago Uribe ");
        System.out.println("Número de documento: 1000409680 ");
        System.out.println("Grupo: viernes 9-12 am ");
    }

    static void juanSebastianRavem() {
        System.out.println("Nombre: Juan Sebastián Rave Martínez ");
        System.out.println("Número de documento: 1023628594 ");
        System.out.println("Grupo: miercoles 9-12am ");
    }

    static void juanSebastianRave() {
        System.out.println("Nombre: Juan Sebastián Rave Martínez ");
        System.out.println("Número de documento: 1023628594 ");
        System.out.println("Grupo: miercoles 9-12am ");
    }

    static void Imprimir_Nicolas_Ospina() {
        System.out.println("Estudiante: Nicolás Ospina Torres ");
        System.out.println("Grupo: Lenguajes de Programación 3324 ");
    }

    static void imprimirNombreC() {
        System.out.println("Cesar Montoya ");
        // El pull request fue pedido por Cesar Montoya del grupo 3324
    }

    public static void nombreJuan() {
        System.out.println("Mi nombre es: Juan Camilo Ramón Pérez ");
    }

    static void nombre() {
        System.out.println("Juan Camilo Ramón Pérez ");
    }

    static void MiNombre() {
        System.out.println("Nombre: Juan Pablo Corena Álvarez ");
        System.out.println("Número: 1126644465 ");
        System.out.println("Grupo: Jueves 9-12 ");
    }

    static void nombreSaDG() {
        System.out.println("Nombre: Samuel Deossa Gomez ");
        System.out.println("Número de documento: 1023593101 ");
        System.out.println("Grupo: Jueves 9-12am ");
    }

    static void imprimirNombreMateo() {
        System.out.println("Nombre: Mateo Andres Pineda Beltran ");
    }

    public static void gabyMar() {
        System.out.println("Nombre: Gabriela Lucía Martínez Mercado ");
        System.out.println("Numero de identificación: 1048441217 ");
        System.out.println("Grupo: Jueves 9am-12pm ");
    }

    static void ElMaestrotic2() {
        System.out.println("------------------------------------------------------ ");
        System.out.println("Je mapelle Martin Vanegas Ospina et j'ai 18 ans ");
        Mascota g1 = new Mascota("Colmillo", "Cruce", "Felino", 2);
        mascotas.add(g1);
        System.out.println("Mi mascota se llama: " + g1.getNombre());
        System.out.println("Favorite tv show: How I Met Your Mother ");
        System.out.println("Grupo: Jueves 9-12m ");
    }

    static void PuesYO() {
        System.out.println("Nombre: Juan Manuel Escobar Mejia ");
        System.out.println("Número de documento: 1025882573 ");
        System.out.println("Grupo: Jueves 9-12");
    }

    static void Darcilas1(){
        System.out.println("Nombre: Daniel Arcila Salazar");
        System.out.println("Cedula: 1033257612");
        System.out.println("Horario: 9am-12pm");
    }
}



