package com.helloworldgenerator;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("helloworld.java");

            fileWriter.write("public class helloworld {\n");
            fileWriter.write("\n");
            fileWriter.write("    public static void main(String[] args) {\n");
            fileWriter.write("        System.out.println(\"Hello World!\");\n");
            fileWriter.write("\n");
            fileWriter.write("    }\n");
            fileWriter.write("\n");
            fileWriter.write("}");

            fileWriter.close();
            System.out.println("Your Hello world");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
