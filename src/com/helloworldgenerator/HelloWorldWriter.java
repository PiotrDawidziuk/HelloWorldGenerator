package com.helloworldgenerator;

import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldWriter {

    public void writeHelloWorld(String helloWhat){
        try {
            FileWriter fileWriter = new FileWriter("src\\com\\helloworldgenerator\\Hello"+helloWhat+".java");

            fileWriter.write("package com.helloworldgenerator;\n");
            fileWriter.write("\n");
            fileWriter.write("public class Hello"+helloWhat+" {\n");
            fileWriter.write("\n");
            fileWriter.write("    public static void main(String[] args) {\n");
            fileWriter.write("        System.out.println(\"Hello "+helloWhat+"!\");\n");
            fileWriter.write("\n");
            fileWriter.write("    }\n");
            fileWriter.write("\n");
            fileWriter.write("}");

            fileWriter.close();
            System.out.println("Your HelloWorld in Java was created");
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
