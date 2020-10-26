package com.tasks6.rle;

public class RLE {
    public static void main( String[] args ) {
        if(args.length > 0) {
            StringBuilder string = new StringBuilder();
            String answer = args[0] + ".";
            int count = 1;
            for(int i=0; i < answer.length() - 1; i++) {
                if(answer.charAt(i) == answer.charAt(i + 1)) {
                    count++;
                }
                else {
                    string.append(answer.charAt(i));
                    if(count != 1) {
                        string.append(count);
                        count = 1;
                    }
                }
                if(count >= 9) {
                    string.append(answer.charAt(i));
                    string.append(count);
                    count = 0;
                }
            }
            System.out.println(string);
        }
    }
}
