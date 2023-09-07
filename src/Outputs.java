public class Outputs {
    public void printek() {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!"); // \n - sortores (""-n belul);
        System.out.println();
        double base = 30;
        // final int A = 5 // final: allando (mindig nagybetuvel irva)
        System.out.printf("|%20f %10s|\n", base, "");
        System.out.printf("|%.2f|\n", 32.3456);
        System.out.printf("|%020f|\n", 32.3456);
        System.out.printf("|%+20f|\n", 32.3456);
        System.out.printf("|%-20f|\n", 32.3456);
        // printf: String megadasa kotelezo; %f: 35 formazasa; f: valos szam eseten; |: pipe;
        // string: %...s
        // .3: tizedesjegyek szama; % utan levo szam: spacek szama; printf nem csinal
        // sortorest
        // %+: + elojel; %-: balraigazitas

    }

}
