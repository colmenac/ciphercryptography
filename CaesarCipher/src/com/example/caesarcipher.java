package com.example;
import java.util.Scanner;

public class caesarcipher {

        public void greet(){
            System.out.println("-------------Program to Crypt/Decrypt a message---------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a message to be decrypted: ");
            String msg = scanner.nextLine();
            System.out.print("Enter the Key to shift: ");
            int key = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Encrypted msg: " + encryption(msg, key));
            System.out.print("Enter encrypted msg to be decoded: ");
            msg = scanner.nextLine();
            System.out.print("Enter the key used to shift: ");
            key = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Encrypted msg: " + decryption(msg, key));
        }

        public static String encryption(String text, int key) {

            String word = "";
            for (char letter : text.toLowerCase().toCharArray()) {
                if (Character.isLetter(letter)) {
                    letter = (char) (letter + key);
                    if (letter > 'z') letter = (char) ('a' + (letter - 'z') - 1);
                }
                word += (letter);
            }
            return word;

        }

        public static String decryption(String emessage, int k) {
            String plain = "";
            for (char letter : emessage.toLowerCase().toCharArray()) {
                if(Character.isLetter(letter)){
                    letter = (char) (letter-k);
                    if(letter<'a') letter = (char) ('z' - ('a'-letter) + 1);
                }
                plain+=letter;
            }
            return plain;
        }

        public static void main(String[] args) {

            caesarcipher c = new caesarcipher();
            c.greet();
            System.out.println("Project complete...");



        }
}

