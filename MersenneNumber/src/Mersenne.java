/* Число Мерссена - это простое число, представимое в виде (2^p-1), где p - также простое число.
Напишите программу нахождения первых N чисел Мерссена. N задается в программе */

public class Mersenne {

    public static void main(String[] args) {
        int quantity = 22;
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
                long powerOfTwo = 32;
                while (quantity > 0) {
                    boolean isItPrime = true;
                    for (int i = 3; i <= Math.sqrt(currentprime); i += 2) {
                        if (currentprime % i == 0) {
                            isItPrime = false;
                            break;
                        }//end if (currentprime%i==0)
                    }//end for (int i; i<Math.sqrt(currentprime); i+=2)
                    if (isItPrime) {
                        for (int i = previousprime; i < currentprime; i++) powerOfTwo *= 2;
                        System.out.print((powerOfTwo - 1) + " ");
                        quantity--;
                    }// end if(isItPrime)
                    previousprime=currentprime;
                    currentprime += index;
                    index = 6-index;
                } // end while (quantity>0)
                break;
        }// end switch
    }//end main()
}

