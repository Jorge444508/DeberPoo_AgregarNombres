import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombres  precione 0 para salir");
        List<Nombres> nomb = new ArrayList<>();
        String escri = "2";
        do {
            if (escri.equals("0")) {
                break;
            } else {
                System.out.println("Escriba el nombre o 0: ");
                escri = sc.nextLine();

                if (escri.equals("0")) {
                    break;
                }
                nomb.add(new Nombres(escri));
            }
        } while (!escri.equals("0"));
        System.out.println("====Lista=====");
        for (int i = 0; i < nomb.size(); i++) {
            System.out.println(nomb.get(i).getNombre());
        }
    }
}