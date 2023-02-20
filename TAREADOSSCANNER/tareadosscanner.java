import java.util.Scanner;
public class tareadosss{

   public static void main(String[] args){
        Scanner nm = new Scanner (System.in);
        System.out.println("Escribe tu nombre ");
        String nombre = nm.nextLine();
        System.out.println("Nombre: " + nombre);

        Scanner cm = new Scanner (System.in);
        System.out.println("Escribe tu profesión ");
        String profesion = cm.nextLine();
        System.out.println("Profesion: " + profesion);

        Scanner dm = new Scanner (System.in);
        System.out.println("Escribe de donde eres ");
        String donde = dm.nextLine();
        System.out.println("Pais: " + donde);
   }
}
