
import java.util.Scanner;
import java.util.UUID;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAHARIAZ
 */
public class Teachers  implements utility{
     int id;
   String uid;
    String name;
     String course;
     String deperment;
     String password;
     
  @Override
    public void set_data(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        uid = String.valueOf(uuid);
        System.out.println("======================= *** ENTER STUDENT DETAILS *** =======================");
        System.out.println();
        System.out.print("TEACHER NAME: ");
        name = sc.nextLine();
         System.out.print(("TEACHER ID: "));
        id = sc.nextInt();
 
        sc.nextLine();
        System.out.print("DEPERMENT NAME: ");
         deperment= sc.nextLine();
         System.out.print("COURSE NAME: ");
      course = sc.nextLine();
      System.out.print("PASSWORD: ");
        password = sc.nextLine();
        


    }

    @Override
   public void get_data() {
       
        System.out.println("NAME: "+name);
          System.out.println("ID: "+id);
        System.out.println("COURSE NAME: "+course);
        System.out.println("DEPERMENT NAME: "+deperment);
      
   
}
}
