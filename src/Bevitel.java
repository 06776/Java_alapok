import java.util.Scanner;

public class Bevitel {
    public void csinal() {
        Scanner sc = new Scanner(System.in); // CTRL + Space = importalas
        System.out.print("Adja meg az első számot: ");
        int num1 = sc.nextInt();
        System.out.print("Adja meg a második számot: ");
        int num2 = sc.nextInt();

        System.out.print("Adjon meg egy nevet: ");
        sc.nextLine(); // Enter olvasasa, majd a kovetkezo metodus bekerese
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        
        System.out.print("Adjon meg egy várost: ");
        String city = sc.nextLine();
        System.out.println("Az ön városa: " + city);

    }
}
