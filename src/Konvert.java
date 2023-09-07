import java.util.Random;

public class Konvert {
    public static void csinald() {
        // byte a = 35;
        // int b = a; // int: kisebb a byte-nal, vagyis ezt bele lehet tenni a byte-ba
        // (forditva nem
        // // mukodik)

        int a = 128;
        byte b = (byte) a; // castolva: lehetseges a szukites, vagyis a tipus kenyszerites; a nagyobb ertek
                           // elveszik (byte = 128!), ha 128 vagy nagyobb; tartomanya: -128-tol 127-ig
        System.out.println(b);

        float szam = 30.1f; // alapertelmezetten double-kent van kezelve; double nem teheto float-ba;
                            // f vagy F: float-kent legyen tarolva
        double szam2 = 30.1; // double-be teheto double; 3. = 3.0
        
        System.out.println(szam);
        System.out.println(szam2);
    }

    public static void veletlen() {
        Random random = new Random(); // import java.util.Random
        System.out.println(random.nextInt(6)+1); // + ..., ha nagyobb szamot szeretnenk; 6)+1: 1-tol 6-ig
    }
}
