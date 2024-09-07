
package com.mycompany.l1;

import java.util.Scanner;

public class L1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What programming languages do you know?");
        String proLang = input.nextLine();
        System.out.println("That's great ! You can use " + proLang + " to develop our project!");
    }
}
