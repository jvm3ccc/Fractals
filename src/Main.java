public class Main {

    private static float laenge = 531441f;
    private static int iterationen = 9;
    private static int result = 0;

    public static void main(String[] args) {

        level1();
        level2();

    }

    private static void level2() {

        // Theorie: http://snowflakecurve.weebly.com/square-curve.html

        for (int i = 0; i <= iterationen; i++) {

            if( i == 0 ) {
                result = (int) laenge;
                continue;
            }

            int L = (int) calcL(i);
            int N = (int) calcN2(i);

            result = (int) (L * N);
        }

        System.out.println("Ergebnis2: " + result);
    }

    private static void level1() {

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

        System.out.println("Ergebnis1: " + result);
    }



    /**
     * Anzahl der Seiten multipliziert mit den Segmenten
     * Bei Dreieck 3 Seiten
     * Bei 4-Eck 4 Seiten
     *
     * Dreieck 4 Segmente
     * Viereck 5 Segemente
     *
     * @param n - Iteration
     * @return Anzahl der Seiten multipliziert mit der Laengen
     */
    private static int calcN(int n) {
        return 3 * (int) Math.pow(4, n);
    }

    /**
     * Anzahl der Seiten multipliziert mit den Segmenten
     * Bei Dreieck 3 Seiten
     * Bei 4-Eck 4 Seiten
     *
     * Dreieck 4 Segmente
     * Viereck 5 Segemente
     *
     * @param n - Iteration
     * @return Anzahl der Seiten multipliziert mit der Laengen
     */
    private static int calcN2(int n) {
        return 4 * (int) Math.pow(5, n);
    }

    /**
     * Mit jeder Iteration wird ein Drittel der Laenge berechnet
     *
     * zB
     * 0 .. n
     * 1 .. n/3
     * 2 .. n/9
     * usw
     *
     * @param n - Iteration i siehe Schleife
     * @return Laenge einer Seite
     */
    private static float calcL(int n) {
        return laenge * (float) Math.pow(3, -n);
    }
}
