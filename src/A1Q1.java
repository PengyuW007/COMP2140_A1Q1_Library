import java.util.*;
import java.io.*;

public class A1Q1 {
    public static void main(String[] args) {
        stimulationLibrary();
    }

    public static void stimulationLibrary() {
        Scanner scan;
        String filename;
        BufferedReader inFile;
        String nextLine;
        Library lib = new Library();
        scan = new Scanner(System.in);

        System.out.println("Please enter the input file name (.txt files only):");
        //filename = scan.nextLine();
        filename = "input.txt";
        System.out.println("\nProcessing file " + filename + "...\n");

        try {
            inFile = new BufferedReader(new FileReader(filename));
            nextLine = inFile.readLine();
            //processLine(nextLine, lib);
            while (nextLine != null) {
                processLine(nextLine, lib);
                nextLine = inFile.readLine();
            }
        } catch (IOException e) {
            System.out.println("\nError reading file: " + filename);
        }//end try-catch
    }//end simulationLibrary

    public static void processLine(String nextLine, Library library) {
        String[] tokensOri = nextLine.split(",");
        String commands[] = tokensOri[0].split(" ");
        String command = commands[0];//command
        int comLen = command.length();

        String line = nextLine.substring(comLen);

        String[] tokens = line.split(",");

        if (command.equals("ADD")) {
            String last = tokens[0];
            String first = tokens[1];
            String title = tokens[2];
            library.addBook(last,first,title);
            //System.out.println(library.getNumBooks());
        } else if (command.equals("SEARCHA")) {

        } else if (command.equals("SEARCHT")) {

        } else if (command.equals("GETBOOK")) {

        } else if (command.equals("RETURNBOOK")) {

        }

    }
}
