package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner (System.in);

        while (input.hasNext()){
            for(int i=1;i<=3;i++){
            String stdin = input.nextLine();

                System.out.println(i+" "+stdin);
            }
        }

        System.out.println("hello");

        System.out.println("ok");
    }
}

