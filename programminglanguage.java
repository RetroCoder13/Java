import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class programminglanguage {
    public static void main(String args[]){
        String[] input;
        HashMap<String,String> variables = new HashMap<String,String>();

        while(true){
            input = System.console().readLine().split(" ");
            if(input[0].equals("OUT")){
                if(input[1].equals("ADD") || input[1].equals("SUB") || input[1].equals("MUL") || input[1].equals("DIV") || input[1].equals("POW")){
                    function_out(Double.toString(function_numbers(input[2], input[3], input[1], variables)), variables);
                } else {
                    for(int i=0;i<input.length-1;i++){
                        function_out(input[i+1], variables);
                        function_out(" ", variables);
                    }
                }
                function_out("\n", variables);
            }

            if(input[0].equals("VAR")){
                if(input[2].equals("ADD") || input[2].equals("SUB") || input[2].equals("MUL") || input[2].equals("DIV") || input[2].equals("POW")){
                    function_var(input[1], Double.toString(function_numbers(input[3], input[4], input[2], variables)), variables);
                } else {
                    function_var(input[1], input[2], variables);
                }
            }

            if(input[0].equals("RUN")){
                function_run(input[1], variables);
            }

            if(input[0].equals("EXT")){
                System.exit(0);
            }
        }
    }

    public static void function_run(String path, HashMap<String,String> variables){
        File file = new File(path);
        if(file.exists()){
            try{
                Scanner fileRead = new Scanner(file);
                while(fileRead.hasNextLine()){
                    String[] input = fileRead.nextLine().split(" ");
                    if(input[0].equals("OUT")){
                        if(input[1].equals("ADD") || input[1].equals("SUB") || input[1].equals("MUL") || input[1].equals("DIV") || input[1].equals("POW")){
                            function_out(Double.toString(function_numbers(input[2], input[3], input[1], variables)), variables);
                        } else {
                            for(int i=0;i<input.length-1;i++){
                                function_out(input[i+1], variables);
                                function_out(" ", variables);
                            }
                        }
                        function_out("\n", variables);
                    }

                    if(input[0].equals("VAR")){
                        if(input[2].equals("ADD") || input[2].equals("SUB") || input[2].equals("MUL") || input[2].equals("DIV") || input[2].equals("POW")){
                            function_var(input[1], Double.toString(function_numbers(input[3], input[4], input[2], variables)), variables);
                        } else {
                            function_var(input[1], input[2], variables);
                        }
                    }

                    if(input[0].equals("RUN")){
                        function_run(input[1], variables);
                    }

                    if(input[0].equals("EXT")){
                        System.exit(0);
                    }
                }
            } catch(FileNotFoundException e) {}
        }
    }

    public static void function_out(String output, HashMap<String,String> variables){
        if(variables.keySet().contains(output)){
            System.out.print(variables.get(output));
        } else if(output.equals("IN")){
            System.out.print(function_in());
        } else {
            System.out.print(output);
        }
    }
    public static String function_in(){
        return System.console().readLine();
    }

    public static void function_var(String variableName, String input, HashMap<String,String> variables){
        if(input.equals("IN")){
            variables.put(variableName, function_in());
        } else {
            variables.put(variableName, input);
        }
    }

    public static double function_numbers(String a, String b, String operation, HashMap<String,String> variables){
        if(variables.keySet().contains(a) && variables.keySet().contains(b)){
            if(operation.equals("ADD")){
                return function_add(Double.parseDouble(variables.get(a)), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("SUB")){
                return function_sub(Double.parseDouble(variables.get(a)), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("MUL")){
                return function_mul(Double.parseDouble(variables.get(a)), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("DIV")){
                return function_div(Double.parseDouble(variables.get(a)), Double.parseDouble(variables.get(b)));
            } else {
                return function_pow(Double.parseDouble(variables.get(a)), Double.parseDouble(variables.get(b)));
            }
        } else if(variables.keySet().contains(a)){
            if(operation.equals("ADD")){
                return function_add(Double.parseDouble(variables.get(a)), Double.parseDouble(b));
            } else if(operation.equals("SUB")){
                return function_sub(Double.parseDouble(variables.get(a)), Double.parseDouble(b));
            } else if(operation.equals("MUL")){
                return function_mul(Double.parseDouble(variables.get(a)), Double.parseDouble(b));
            } else if(operation.equals("DIV")){
                return function_div(Double.parseDouble(variables.get(a)), Double.parseDouble(b));
            } else {
                return function_pow(Double.parseDouble(variables.get(a)), Double.parseDouble(b));
            }
        } else if(variables.keySet().contains(b)){
            if(operation.equals("ADD")){
                return function_add(Double.parseDouble(a), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("SUB")){
                return function_sub(Double.parseDouble(a), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("MUL")){
                return function_mul(Double.parseDouble(a), Double.parseDouble(variables.get(b)));
            } else if(operation.equals("DIV")){
                return function_div(Double.parseDouble(a), Double.parseDouble(variables.get(b)));
            } else {
                return function_pow(Double.parseDouble(a), Double.parseDouble(variables.get(b)));
            }
        } else {
            if(operation.equals("ADD")){
                return function_add(Double.parseDouble(a), Double.parseDouble(b));
            } else if(operation.equals("SUB")){
                return function_sub(Double.parseDouble(a), Double.parseDouble(b));
            } else if(operation.equals("MUL")){
                return function_mul(Double.parseDouble(a), Double.parseDouble(b));
            } else if(operation.equals("DIV")){
                return function_div(Double.parseDouble(a), Double.parseDouble(b));
            } else {
                return function_pow(Double.parseDouble(a), Double.parseDouble(b));
            }
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
