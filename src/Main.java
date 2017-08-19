public class Main {

    public static float laenge = 243f;
    public static int iterationen = 3;
    public static int result = 0;

    public static void main(String[] args) {

        // Theorie: http://www.fraktalkunst.de/2012/02/03/koch-kurve-und-schneeflocke/

        for( int i = 0; i <= iterationen; i++) {

            if( i == 0 ) {
                result = (int) laenge;
                continue;
            }

            float L = calcL(i);
            int N = calcN(i);
            result += L * N;
        }

        System.out.println("Ergebnis: " + result);

    }

    public static int calcN(int n) {
        return (int) Math.pow(laenge, n);
    }

    public static float calcL(int n) {
        float tmpL = laenge / 3f;
        float newL = (float) Math.pow(tmpL, n);
        return newL;
    }



}
