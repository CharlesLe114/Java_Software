import java.math.BigInteger;

public class Mersenne {

    public static void main(String[] args){
        int quantity = 50;
        switch (quantity){
            case 1:
                System.out.print(3);
                break;
            case 2:
                System.out.print(3 + " " + 7);
                break;
            default:
                System.out.print(3 + " " + 7 + " ");
                quantity-=2;
                int previousprime = 5;
                int currentprime = 5;
                int index = 2;
                BigInteger powerOfTwo = BigInteger.valueOf(32);
                while (quantity > 0) {
                    boolean isItPrime = true;
                    for (int i = 3; i <= Math.sqrt(currentprime); i += 2) {
                        if (currentprime % i == 0) {
                            isItPrime = false;
                            break;
                        }//end if (currentprime%i==0)
                    }//end for (int i; i<Math.sqrt(currentprime); i+=2)
                    if (isItPrime) {
                        for (int i = previousprime; i < currentprime; i++) powerOfTwo=powerOfTwo.multiply(new BigInteger("2"));
                        BigInteger one;
                        one=BigInteger.ONE;
                        System.out.print(powerOfTwo.subtract(one) + " ");
                        quantity--;
                    }// end if(isItPrime)
                    previousprime=currentprime;
                    currentprime += index;
                    index = 6-index;
                } // end while (quantity>0)
                break;
        }// end switch
    }
}
