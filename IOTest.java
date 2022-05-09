package Test.IOTest;

import java.io.*;


public class IOTest {
    String inFile;
    String toFile;
    IOTest() throws IOException {
        System.out.println("Откуда копировать?:");
        try(BufferedReader inFileName=new BufferedReader(new  InputStreamReader(System.in)))
            {
        inFile=inFileName.readLine();
        }
        System.out.println("Куда копировать?:");
        try (BufferedReader toFileName=new BufferedReader(new InputStreamReader(System.in))){
        toFile=toFileName.readLine();
        }
    }

    public static void main(String[] args) throws IOException{
        IOTest ioTest=new IOTest();

    }
}




