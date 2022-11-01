import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Rohlik = 3;
        int Houska = 4;
        int Chleba = 20;
        int Jablko = 8;
        int Banan = 10;
        int Pomeranc = 7;
        int Kedlub = 10;
        int Paprika = 9;
        int Kvetak = 15;
        int Konto = 0;
        while (true) {
        System.out.println("Vyberte si kategorii stisknutim dane cislice");
        System.out.println(" ");
        System.out.println("Pecivo - 1, Ovoce - 2, Zelenina - 3, Prejit k platbe - 4");
        int ktg = sc.nextInt();
        
        if (ktg == 1) {
            System.out.println("Vyberte si pecivo, kterou chcete koupit");
            System.out.println(" ");
            System.out.println("Rohlik - 1, Houska - 2, Chleba - 3, Prejit k platbe - 4");
            int pcv = sc.nextInt();
            if (pcv == 1) {
                Konto = Konto + Rohlik;
            }
            else if (pcv == 2) {
                Konto = Konto + Houska;
            }
            else if (pcv == 3) {
                Konto = Konto + Chleba;
            }
            else if (pcv == 4) {
                System.out.println(" ");
                System.out.println("Vase konto cini: "+ Konto + " kc");
                break;
            }
            else if (ktg > 4 || ktg < 1) {
                System.out.println("Zadali jste neplatne cislo, program se vypina");
                break;
            }

        }
        else if (ktg == 2) {
            System.out.println("Vyberte si polozku, kterou chcete koupit");
            System.out.println(" ");
            System.out.println("Jablko - 1, Banan - 2, Pomeranc - 3, Prejit k platbe - 4");
            int ovc = sc.nextInt();
            if (ovc == 1) {
                Konto = Konto + Jablko;
            }
            else if (ovc == 2) {
                Konto = Konto + Banan;
            }
            else if (ovc == 3) {
                Konto = Konto + Pomeranc;
            }
            else if (ovc == 4) {
                System.out.println(" ");
                System.out.println("Vase konto cini: "+ Konto + " kc");
                break;
            }
            else if (ktg > 4 || ktg < 1) {
                System.out.println("Zadali jste neplatne cislo, program se vypina");
                break;
            }
        }
        else if (ktg == 3) {
            System.out.println("Vyberte si zeleninu, kterou chcete koupit");
            System.out.println(" ");
            System.out.println("Kedlub - 1, Paprika - 2, Kvetak - 3, Prejit k platbe - 4");
            int zln = sc.nextInt();
            if (zln == 1) {
                Konto = Konto + Kedlub;
            }
            else if (zln == 2) {
                Konto = Konto + Paprika;
            }
            else if (zln == 3) {
                Konto = Konto + Kvetak;
            }
            else if (zln == 4) {
                System.out.println(" ");
                System.out.println("Vase konto cini: "+ Konto + " kc");
            }
            else if (ktg > 4 || ktg < 1) {
                System.out.println("Zadali jste neplatne cislo, program se vypina");
                break;
            }
        }
        else if (ktg == 4) {
            System.out.println(" ");
            System.out.println("Vase konto cini: "+ Konto + " kc");
            break;
        }
        else if (ktg > 4 || ktg < 1) {
            System.out.println("Zadali jste neplatne cislo, program se vypina");
            break;
        }
    }
    }
}
