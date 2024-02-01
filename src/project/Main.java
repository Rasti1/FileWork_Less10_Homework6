package project;

import project.fileinout.FileReadService;
import project.fileinout.FileWriteService;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        getInfo();

    }
    private static void getInfo(){

        FileWriteService write = new FileWriteService();
        FileReadService read = new FileReadService();

        int counter = 0;

        System.out.println("""
            Choose, what do you want to do:
            1 - Create and Write in;
            2 - Read;
            """);

        System.out.print("Input: ");
        counter = sc.nextInt();
        sc.nextLine();

        if (counter == 1){

            System.out.print("Enter file's name (without extension): ");
            String fileName = sc.nextLine();

            System.out.print("\nEnter message in file: ");
            String text = sc.nextLine();

            write.writeInFile(fileName, text);


        } else if (counter == 2){

            System.out.print("Enter file's name (without extension): ");
            String fName = sc.nextLine();

            String fileContent = read.readFromFile(fName);
            System.out.println("Text in file: " + fileContent);

        } else
            System.out.println("Invalid value.");
    }
}
