/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforses;

import java.util.Scanner;


public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numofword = in.nextInt();
        for(int i =0 ; i< numofword ; i ++){
            String word = in.next();
            word =word.toLowerCase();
        if(word.length() <=10){
            System.out.println(word);}else{
        
            System.out.println(word.charAt(0)+"" +(word.length()-2)+""+word.charAt(word.length()-1));
        
        }
        
        
        }
    }
 
}
////abcdefgh    
//abcdefghi
//abcdefghij
//a9k
//a11m


//
//abcdefgh
//abcdefghi
//a8j
//a9k
//a11m