import java.sql.SQLOutput;
import java.util.Scanner;

public class InteractiuneCuTastatura {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);
        String continueExit = null;

        do {

            System.out.println("Bine ati venit in Aeroport!\nAlegeti categotia preferata:");
            System.out.println("___________________________");
            System.out.println("1.Vizitator / Calator.");
            System.out.println("2.Econom Class.");
            System.out.println("3.Business Class.");
            System.out.println("4.VIP Class.");
            System.out.println("___________________________");

            System.out.print("Introduceti numarul categoriei preferate: ");
            int categorie = obiectScanner.nextInt();
            System.out.println("___________________________");

            switch (categorie) {

                case 1:
                    System.out.println("Ați ales categoria Vizitator/Calator!\nAcces: Sala de așteptare.");
                    break;
                case 2:
                    System.out.println("Bună ziua!\nAți ales categoria Econom Class!\nAcces: Sala de așteptare și bufet.");
                    break;
                case 3:
                    System.out.println("Bună ziua!\nAți ales categoria Business Class!\nAcces:\n1. Sala de așteptare\n2. Sala de conferințe\n3. Business Lounge.");
                    break;
                case 4:
                    System.out.println("Bună ziua!\nAți ales categoria VIP Class!\n Acces complet la toate serviciile aeroportului!");
                    break;
                default:
                    System.out.println("___________________________");
                    System.out.println("Nu am gasit categoria corespunzatoare");
                    System.out.println("___________________________");
            }
            System.out.println("\n____________________________");
            System.out.print("Doriti sa treceti la meniu principal (Da/Nu): ");
            continueExit = obiectScanner.next();
        } while (continueExit.equals("Da"));
        System.out.println("Larevedere");

    }
}
