import java.util.*;
import java.lang.*;
/**
 *
 * @author SHAHARIAZ
 */

interface utility{
    public void get_data();
    public void set_data();
}
public class Main {
       static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO COURSE MANAGEMENT SYSTEM BY OOP *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD STUDENTS \t\t\t 2].ADD GROUPS \t\t\t 3].TEACHER PANEL");
        System.out.println();
        System.out.println("4].GET STUDENTS \t\t\t 5].GET GROUPS \t\t\t 6].GET TEACHER");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
        Students student[] = new Students[100];
        Teachers teacher[] = new Teachers [100];
           Groups group [] = new Groups  [100];
                /*STUDENT HARDCODE*/
           
           student[0] =  new Students();
           student[0].name = "Shahariaz";
            student[0].project = "Course_mengment";
             student[0].result = 0;
              student[0].course = "Advance_OOP";
                  student[0].id = 220121036;
              
              
               student[1] =  new Students();
           student[1].name = "Soniya";
            student[1].project = "Course_mengment";
             student[1].result = 0;
              student[1].course = "Advance_OOP";
              student[1].id = 220121051;
              
               student[2] =  new Students();
           student[2].name = "Shahariaz";
            student[2].project = "Shahariaz";
             student[2].result = 0;
              student[2].course = "Shahariaz";
              
              
               student[3] =  new Students();
           student[3].name = "Shahariaz";
            student[3].project = "Shahariaz";
             student[3].result = 0;
              student[3].course = "Shahariaz";
              
               student[4] =  new Students();
           student[4].name = "Shahariaz";
            student[4].project = "Shahariaz";
             student[4].result = 0;
              student[4].course = "Shahariaz";
       
                /*GROUPS DATA HARDCODE*/
                
                  group[0] =  new Groups();
           group[0].gname = "star";
            group[0].fname = "Shahariaz";
            group[0].fid = 220121036;
             group[0].sname = "Soniya";
            group[0].sid = 220121051;
          
                
              
        int Students_counter = 5;
        int Teachers_counter = 3;
          int Groups_counter = 1;
          
          
    
        int choice = 100;
         while(choice!=0){
main_menu();
 choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1 -> {
                        student[Students_counter] = new Students();
                        student[Students_counter].set_data();
                        Students_counter++;
                        System.out.println();
                        System.out.println("1].ADD STUDENT DETAILS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
          }
                    
                    case 2 -> {
                        group[Groups_counter] = new Groups();
                        group[Groups_counter].set_data();
                        Teachers_counter++;
                        System.out.println();
                        System.out.println("1].ADD GROUP DETAILS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
          }
                       case 3 -> {
                      
                        System.out.println();
                        System.out.println("1].ADD TEACHER DETAILS");
                         System.out.println("2].ADD RESULT");
                         int log = sc.nextInt();
                         if(log == 1){
                               teacher[Teachers_counter] = new Teachers();
                        teacher[Teachers_counter].set_data();
                        Teachers_counter++;
                         }
                         if(log == 2){
                           
                         System.out.println("1]FIND A GROUP");
                     
                          System.out.println("2]FIND All GROUP");
                          
                           System.out.println("3] Find A Single Student && Update result");
                        int a = sc.nextInt();
                          
                            sc.nextLine();
                         if(a == 1){
                         System.out.println("2]ENTER A GROUP NAME");
                         
                         String c = sc.nextLine();
                           for (int i = 0; i < Groups_counter; i++) {
         if(c.equals(group[i].gname)) {
             System.out.println("Enter Score For "+group[i].fname+"");
                int fsc = sc.nextInt();
                
                 System.out.println("Enter Score For "+group[i].sname+"");
               int ssc = sc.nextInt();
                 if(student[i].id == group[i].fid ){
          student[i].set_score(fsc);
         
          }
          group[i].set_score(fsc, ssc);
          for(int j = 0; j<Students_counter;j++ ){
          
                if(group[i].fid == student[j].id ){
          student[j].set_score(ssc);
         
          }
          
          if(group[i].fid == student[j].id ){
          student[j].set_score(fsc);
         
          }
          }

         
       }else{
              System.out.println("You Enter A Wrong Group");
         }
                          }
                          
                         }
                         if(a == 2){
                           for (int i = 0; i <Groups_counter;i++){
          group[i].get_data();
           System.out.println();
           System.out.println();
       }
       System.out.println();
       System.out.println("9].GO BACK TO MAIN MENU");
       System.out.println("0].EXIT");
       
                         } 
                         if(a == 3){
                                    System.out.println("ENTER STUDENT ID");
                                    int id = sc.nextInt();
                           for (int i = 0; i <Students_counter;i++){
                              
                               if(student[i].id == id){
                                   
                                    student[i].get_data();
                                    System.out.println("ENTER A SCORE");
                                    int v = sc.nextInt();
                                    student[i].set_score(v);
          
                               }
                               
         
       }
       System.out.println();
       System.out.println("9].GO BACK TO MAIN MENU");
       System.out.println("0].EXIT");
       
                         } 
                         
                         
                        
                      
                        
                         
                         
    }
                       
                         
                         
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
          }
   case 4 -> {
       student[0].student(Students_counter);
       for (int i = 0; i < Students_counter; i++) {
          student[i].get_data();
           System.out.println();
           System.out.println();
       }
       System.out.println();
       System.out.println("9].GO BACK TO MAIN MENU");
       System.out.println("0].EXIT");
       choice = sc.nextInt();
          }
    case 5-> {
       for (int i = 0; i <Groups_counter;i++){
          group[i].get_data();
           System.out.println();
           System.out.println();
       }
       System.out.println();
       System.out.println("9].GO BACK TO MAIN MENU");
       System.out.println("0].EXIT");
       choice = sc.nextInt();
          }
     case 6-> {
       for (int i = 0; i < Teachers_counter; i++) {
         teacher[i].get_data();
           System.out.println();
           System.out.println();
       }
       System.out.println();
       System.out.println("9].GO BACK TO MAIN MENU");
       System.out.println("0].EXIT");
       choice = sc.nextInt();
          }
                    default -> System.out.println("ENTER VALID CHOICE: ");
                }
            }
}
 }
}
