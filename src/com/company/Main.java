package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int N = keyboard.nextInt();
        String s = sc.nextLine();
        char[] input = s.toCharArray();
        int checker = (int)input[0];
        String resultS = "";
        int rSL;
        boolean flag = false;
        for (int i = 1; i < N; i++) {
            if (checker >= (int)(input[i])) {
                resultS = s.substring(i);
                rSL = resultS.length();
                for (int j = 0; j < rSL; j++) {
                    if ((int)(resultS.substring(j, j+1)).charAt(0) <= (int)(input[j])) {
                        flag = true;
                        checker = (int)input[i];
                        break;
                    }
                }
            }
            if (!flag) {
                resultS = s;
            }
        }
        System.out.println(resultS);

    }
}
