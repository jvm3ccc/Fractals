import java.math.BigInteger;

public class Fractals {

    public static BigInteger kochSnowflake(BigInteger n, int iterations){
       /* level 1 */

     /*  BigInteger a = new BigInteger("4");
        BigInteger b = new BigInteger("3");

        //3 * 4 ^ iterations = sides;
        BigInteger sides = a.pow(iterations);
        sides = sides.multiply(b);

        //s / 3^iterations = length of each side
        BigInteger length = b.pow(iterations);
        length = n.divide(length);

        return sides.multiply(length);*/

       BigInteger a = new BigInteger("4");
       BigInteger b = new BigInteger("5");
       BigInteger c = new BigInteger("3");

       BigInteger sides = c.pow(iterations);
       sides = n.divide(sides);

       BigInteger length = b.pow(iterations);
       length = a.multiply(length);

       return sides.multiply(length);

    }



}
