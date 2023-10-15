package myNumber;

public class myNumber {
    private int num;
    public int num2;

    public myNumber() {
        num = 0;
        num2 = 100;
    }

    public myNumber(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    int getNum() {
        return num;
    }

    void SetNum(int i) {
        num = i;
        num2 = 10 * i;
    }

    int getNum2() {
        return num2;
    }

    void description() {
        System.out.println("num: " + num);
        System.out.println("num2: " + num2);
    }

    float average() {
        return (num + num2) / 2.0f;
    }

    public static void main(String[] args) {
        myNumber A = new myNumber();
        System.out.println(A.getNum());
        A.SetNum(10);
        System.out.println(A.getNum());
        System.out.println(A.num2);
        A.description();
        System.out.println("Average: " + A.average());

        myNumber B = new myNumber(13, 10);
        B.description();
        System.out.println("Average: " + B.average());
    }
}
