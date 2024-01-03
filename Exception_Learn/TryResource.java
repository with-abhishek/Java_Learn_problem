package Exception_Learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryResource {
    public static void main(String[] args) {

        // FileInputStream file=null;
        // Scanner sc =null;
        
        try(FileInputStream file = new FileInputStream("ex.txt");Scanner sc = new Scanner(System.in))
        {   
            // file = new FileInputStream("ex.txt");
        //     sc = new Scanner(System.in);
            System.out.println("inside - Try");
            
        } 
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        catch (IOException e) {
                e.printStackTrace();
        }
    //     finally
    //     {
    //         if(file!=null)
    //         {try {
    //             file.close();
    //         } catch (IOException e) {
    //                 e.printStackTrace();            }
            
    //     }
    // }
    //     System.out.println("Program Ends .......");

        
    }
}
