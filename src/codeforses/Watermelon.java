/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforses;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
if(w==2){
            System.out.println("NO");

}
     else   if (w % 2 == 0) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
