import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        simonMartinez();
        crearMascota();
        consultarMascotas();
        nombre();
        nuevoNombre();
        thomasBuitrago();
    }


    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);//agregamos la cascota a las lista de mascotas
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);//agregamos la cascota a las lista de mascotas
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }


    //Metodo para imprimir mi nombre
    static void nombre(){
        System.out.println("Nombre: Jose Alejandro Jimenez Vasquez");
        System.out.println("Número de documento: 1020302386");
        System.out.println("Grupo: Jueves 9-12m");
    }

    static void nuevoNombre() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo");
        System.out.println("Número de documento: 1036928998");
        System.out.println("Grupo: Jueves 9-12am");
    }
    static void simonMartinez() {
        System.out.println("Nombre: Simon Martinez");
        System.out.println("Número de documento: 1001367561");
        System.out.println("Grupo: miercoles 9-12am");
    }

    static void thomasBuitrago() {
        System.out.println("Nombre: Thomas Buitrago Uribe");
        System.out.println("Número de documento: 1000409680");
        System.out.println("Grupo: viernes 9-12 am");
    }

    static void eliminarMascotas() {
    }


}
