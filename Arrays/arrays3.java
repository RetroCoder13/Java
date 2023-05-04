package Arrays;
import java.util.ArrayList;

public class arrays3 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            names.add(args[i]);
        }
        System.out.println(names);
    }
}