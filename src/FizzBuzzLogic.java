public class FizzBuzzLogic {

//    Data data = new Data();

    public void checkNumbers(Data data){
        for (int i = 1; i <= data.getLoopSize(); i++) {
        if ((i % data.getValue1() == 0) && (i % data.getValue2() == 0)) {
            System.out.println("FizzBuzz");
        } else if (i % data.getValue1() == 0) {
            System.out.println("Fizz");
        } else if (i % data.getValue2() == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        }

    }



}
