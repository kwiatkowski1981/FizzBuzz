public class Data {

    private   int value1;  //3
    private   int value2;  //5
    private int loopSize; //100

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getLoopSize() {
        return loopSize;
    }

    public void setLoopSize(int loopSize) {
        this.loopSize = loopSize;
    }


    public Data() {
    }

    public Data(int value1, int value2, int loopSize) {
        this.value1 = value1;
        this.value2 = value2;
        this.loopSize = loopSize;
    }

}
