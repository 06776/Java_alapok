import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filekez {

    public void beolvas() throws FileNotFoundException {
        try {
            tryBeolvas();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! Nem található a fájl!");
        }
    }
    public void tryBeolvas() throws FileNotFoundException {
        File file = new File("c:/Users/hajda/Documents/Developer/Alapok - Java/second/Valami.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println("|" + scanner.nextLine()); // String line = scanner.nextLine(); > System.out.println("|" + line);
        }
    }
}
