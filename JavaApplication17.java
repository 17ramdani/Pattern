/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Ramdani
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 9 - (2 * i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (i == 5 && j == 5) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            for (int j = 3; j <= 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 6 - i; j >= 1; j--) {
                if (i == 1 && j == 5) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
