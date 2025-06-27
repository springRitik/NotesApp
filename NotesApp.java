import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String FolderPath = System.getProperty("user.home") +"\\Desktop\\myfile\\";
    File folder = new File (FolderPath);
    if(!folder.exists()){
        folder.mkdirs();
    }
    
System.out.println("Enter file Name (Like abc.txt)");
String filename = scanner.nextLine();
    String fullpath = FolderPath+ filename;
      boolean file = true;
       while (file) {
System.out.println("****NOTES APP****");
System.out.println("Enter your choice");

System.out.println("1. write notes");
System.out.println("2 Read Notes");
System.out.println("3. to exist");
int Choice = scanner.nextInt();
scanner.nextLine();
switch (Choice) {
    case 1: try {
        System.out.println("Enter Your Notes");
      String Notes = scanner.nextLine();
    
      FileWriter writer = new FileWriter(fullpath, true); 
        writer.write(Notes+ "\n");
        writer.close();
    System.out.println("Notes Saved In File Sucessfully");
       
        
    } catch (IOException e) {
        System.out.println("File does not Saved"+e.getMessage());
    }
        
        break;

        case 2: 
        try {

        FileReader reader = new FileReader(fullpath);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while((line = br.readLine()) != null){
            System.out.println("-" +line);
        }    
            
        } catch (IOException e) {
            System.out.println("File can not Read" +e.getMessage());
        }
break;
        case 3 : 
        System.out.println("exists");
        file = false;
break;
    default:
 System.out.println("Invalid choice");   
        break;
}

       }        
       
    }
}

    

