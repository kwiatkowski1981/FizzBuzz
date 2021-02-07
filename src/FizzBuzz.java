public class FizzBuzz {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int n = 100;

        for (int i = 1; i <= n; i++) {

            if ((i % a == 0) && ( i % b == 0)){
                System.out.println("FizzBuzz");
            }else if (i % a == 0){
                System.out.println("Fizz");
            }else if (i % b == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
