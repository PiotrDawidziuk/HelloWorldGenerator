package com.helloworldgenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HelloWorldWriter helloWorldWriter = new HelloWorldWriter();
        Scanner input  = new Scanner(System.in);
        System.out.println("Do you wish to say hello to someone in particular? y/n");
        String helloWho = "";
        String yn = input.next();
        if (yn.equals("y")){
            System.out.println("To whom do you wish to say hello (only letters, no special characters or numbers, please)?");
            helloWho = input.next();
        } else {
            helloWho = "World";
        }
        helloWorldWriter.writeHelloWorld(helloWho);

    }

}
