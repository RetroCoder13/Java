package Functions;

public class function3 {
    public static void main(String[] args){
        if(args.length>0){
            Double value = Double.parseDouble(args[0]);
            System.out.println(circleArea(value));
        } else {
            System.out.println(circleArea(7.5645455722826188E153));
        }
    }

    public static Double circleArea(Double number){
        return Math.pow(number,2)*Math.PI;
    }
}