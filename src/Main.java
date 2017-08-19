public class Main {

    public static int laenge = 19683;
    public static int iterationen = 7;
    public static int result = 0;

    public static void main(String[] args) {

        // Theorie: http://www.fraktalkunst.de/2012/02/03/koch-kurve-und-schneeflocke/

        for( int i = 1; i <= iterationen; i++) {
            int L = calcL(i);
            int N = calcN(i);
            result += L * N;
        }

        System.out.println("Ergebnis: " + result);

    }

    public static int calcN(int n) {
        return (int) Math.pow(4, n);
    }

    public static int calcL(int n) {
        int tmpL = laenge / 3;
        int newL = (int) Math.pow(tmpL, n);
        return newL;
    }



}
