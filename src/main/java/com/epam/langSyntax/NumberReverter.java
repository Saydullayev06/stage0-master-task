package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String num =""+ number;
        String reverse = "";
        for (int i = num.length() - 1; i>=0; i--){
            reverse += num.charAt(i);
        }
        int ans = Integer.parseInt(reverse);
        System.out.println(ans);
    }

}
