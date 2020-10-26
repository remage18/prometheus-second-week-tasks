package com.tasks6.rle;

public class RLE_decoder {
    public static void main( String[] args ) {
        if(args.length > 0) {
            String string = args[0] + ".";
            StringBuilder answer = new StringBuilder();
            if (Character.isDigit(string.charAt(0))) {
                System.out.println("");
                return;
            }
            answer.append(string.charAt(0));
            for(int i=1; i < string.length() - 1; i++) {
                char s1 = string.charAt(i);
                char s2 = string.charAt(i + 1);
                if (s1 == s2) {
                    System.out.println("");
                    return;
                }
                if(Character.isDigit(s1)){
                    if(Character.isDigit(s2)) {
                        System.out.println("");
                        return;
                    }
                    answer.append(String.valueOf(string.charAt(i - 1)).repeat(Math.max(0,
                            Character.getNumericValue(s1) - 1)));
                }
                else{
                    answer.append(s1);
                }
            }
            System.out.println(answer);
        }
    }
}
