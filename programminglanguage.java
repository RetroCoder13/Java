public class programminglanguage {
    public static void main(String args[]){
        String[] input;
        while(true){
            input = System.console().readLine().split(" ");
            if(input[0].equals("OUT")){
                if(input[1].equals("ADD") || input[1].equals("SUB") || input[1].equals("MUL") || input[1].equals("DIV") || input[1].equals("POW")){
                    function_out(Double.toString(function_numbers(Double.parseDouble(input[2]), Double.parseDouble(input[3]),input[1])));
                } else {
                    for(int i=0;i<input.length-1;i++){
                        function_out(input[i+1]);
                        function_out(" ");
                    }
                }
                function_out("\n");
            }
        }
    }

    public static void function_out(String output){
        System.out.print(output);
    }

    public static String function_in(){
        return System.console().readLine();
    }


    public static double function_numbers(double a, double b, String operation){
        if(operation.equals("ADD")){
            return function_add(a, b);
        } else if(operation.equals("SUB")){
            return function_sub(a, b);
        } else if(operation.equals("MUL")){
            return function_mul(a, b);
        } else if(operation.equals("DIV")){
            return function_div(a, b);
        } else {
            return function_pow(a, b);
        }
    }
    public static double function_add(double a, double b){
        return a+b;
    }
    public static double function_sub(double a, double b){
        return a-b;
    }
    public static double function_mul(double a, double b){
        return a*b;
    }
    public static double function_div(double a, double b){
        return a/b;
    }
    public static double function_pow(double a, double b){
        return Math.pow(a,b);
    }
}
