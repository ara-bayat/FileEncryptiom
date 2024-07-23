package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Enter file address:");
        Scanner scanner = new Scanner(System.in);
        String fileAddress = scanner.nextLine();
        System.out.printf("Enter method you want to encrypt:");
        System.out.printf("1 for single thread normal encryption");
        byte method = scanner.nextByte();
        IEncryption iEncryption;
        switch (method)
        {
            case 1->iEncryption=new SingleThreadBasicEncryption(fileAddress);
            default -> iEncryption=new SingleThreadBasicEncryption(fileAddress);
        }
        iEncryption.encrypotor();


    }
}