package org.example;

import java.io.*;

public class fileReader {

    public static void main(String[] args) throws IOException {

        File filename = new File(System.getProperty("user.dir")+ "//Demo.txt");


        BufferedReader br = new BufferedReader(new FileReader(filename));
        System.out.print(br.readLine());



    }





}
