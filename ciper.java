public class ciper {
    public static void main(String[] args){
        String input = System.console().readLine();
        for(int i=0;i<input.length();i++){
            int characterValue = (int)input.charAt(i);
            int newValue = characterValue + 3;
            if(((characterValue >= 97 && characterValue <= 122) && !(newValue >= 97 && newValue <= 122)) || (characterValue >= 65 && characterValue <= 90) && !(newValue >= 65 && newValue <= 90)){
                newValue -= 26;
            }
            if(characterValue==32){
                newValue = 32;
            }
            System.out.print((char)newValue);
        }
        System.out.println();
    }
}
