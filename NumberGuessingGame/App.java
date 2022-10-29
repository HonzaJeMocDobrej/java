import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int pts = 0;
        while (true) {
        System.out.println("Uhodni cislo od 0 - 1");
        System.out.println(" ");
        int upperbound = 2;
        int rdmNum = rdm.nextInt(upperbound);
        int inputNum = sc.nextInt();
        if (inputNum == rdmNum) {
            System.out.println("");
            System.out.println("Uhodnul jste");
            System.out.println(" ");
            pts = pts + 1;
            System.out.println("Vas pocet bodu : " + pts);
            System.out.println(" ");
            if (pts == 3) {
                System.out.println("Vyhral jste, program se vypina");
                break;
            }
        }
        else if (inputNum > 1 || inputNum < 0) {
            System.out.println("Neplatne cislo, program se vypina");
            break;
        }
        else{
            System.out.println(" ");
            System.out.println("Neuhodnul jste");
            System.out.println(" ");
            System.out.println("Zacinate od nuly");
            System.out.println(" ");
            pts = 0;
        }
    }
    }
}
