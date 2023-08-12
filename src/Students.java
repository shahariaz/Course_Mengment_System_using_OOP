import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author SHAHARIAZ
 */
public class Students   implements utility{
    int id;
   String uid;
    String name;
    String project;
    String patner;
    int result=0;
    String course;
    String pass = "YOU PASSED";
    int total;
  
 public void set_score(int a) {
        this.result = a;
 
    }
 public void student(int a){
     this.total = a;
      System.out.println("Total Student: "+total);
 }
   
  @Override
    public void set_data(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        uid = String.valueOf(uuid);
        System.out.println("======================= *** ENTER STUDENT DETAILS *** =======================");
        System.out.println();
        System.out.print("STUDENT NAME: ");
        name = sc.nextLine();
         System.out.print(("STUDENT ID: "));
        id = sc.nextInt();
 
        sc.nextLine();
        System.out.print("PROJECT NAME: ");
         project= sc.nextLine();
         System.out.print("COURSE NAME: ");
      course = sc.nextLine();
        


    }

    @Override
    public void get_data() {
       
         System.out.println("STUDENT ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("PROJECT NAME: "+project);
        System.out.println("SCORE: "+result);
        if(40 <= result){
            System.out.println("RESULT: "+pass);}
        else{
            System.out.println("Sorry you didn't passed ");}
        }
  
       
    }
   

