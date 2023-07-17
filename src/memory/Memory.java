package memory;

public class Memory {

    public static void main(String[] args) {

        int x = 5;
        x = calculate(x);
        System.out.println(x);
    }

    static int calculate(int data){
        int tempValue = data + 3;
        int result = tempValue * 2;
        return result;
    }
}
