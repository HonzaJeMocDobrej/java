import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte pocet radku");
        int rows = sc.nextInt();
        System.out.println("Zadejte pocet sloupcu");
        int columns = sc.nextInt();
        for (int j = 0; j < rows; j++) {
            System.out.println(" ");
        for (int i = 0; i < columns; i++) {
            System.out.print("# ");
        }
        }
    }

}