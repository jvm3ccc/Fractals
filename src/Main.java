public class Main {

    private static float laenge = 531441;
    private static int iterationen = 9;
    private static int result = 0;

    public static void main(String[] args) {

        // Theorie: http://www.fraktalkunst.de/2012/02/03/koch-kurve-und-schneeflocke/

        for (int i = 0; i <= iterationen; i++) {

            if( i == 0 ) {
                result = (int) laenge;
                continue;
            }

            float L = calcL(i);
            int N = calcN(i);
            result = (int) (L * N);
        }

        System.out.println("Ergebnis: " + result);

    }

    private static int calcN(int n) {
        return 3 * (int) Math.pow(4, n);
    }

    private static float calcL(int n) {
        return laenge * (float) Math.pow(3, -n);
    }
}
