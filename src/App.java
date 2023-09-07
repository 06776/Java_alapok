public class App {
    public static void main(String[] args) throws Exception {
        // Outputs kimenetek1 = new Outputs(); // konstruktor hivasa: Outputs()
        // Outputs kimenetek2 = new Outputs();
        // Ownmath ownmath = new Ownmath();

        // System.out.println(Ownmath.pow(2, 3));

        // kimenetek1.printek();
        // Outputs.printek(); (static eseten)

        new Outputs().printek(); // nem static hasznalat; ha csak 1X kerul felhasznalasra - akkor erdemes
                                 // hasznalni
        Konvert.csinald();
        Konvert.veletlen();
    }
}
