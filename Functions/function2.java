package Functions;

public class function2 {
    public static void main(String[] args){
        int i = 0;
        while(i<=20){
            System.out.println(doubleNumber(i));
            i++;
        }
    }

    public static int doubleNumber(int number){
        return number*2;
    }
}
