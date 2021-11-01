import java.io.*;
import java.util.ArrayList;

public class MyFileReader
{
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<String>();
            File file1 = new File("C:\\Users\\SNOvcharenko\\Documents\\fortest.txt");    //creates a new file instance
            FileReader fr = new FileReader(file1);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while ((line = br.readLine()) != null) {

                array.add(line);
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: ");
            for (String s : array) System.out.println(s); // shows the array content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}