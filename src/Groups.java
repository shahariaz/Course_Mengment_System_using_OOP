
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
public class Groups extends Main implements utility {
  
      String gname;
       String fname;
        String sname;
        int fid;
        int sid;
        int fscore = 0;
        int sscore = 0;
          int i = 0;
          String submit ;
          
  
    public void set_score(int a,int b) {
        this.fscore = a;
    this.sscore = b;
    }
        
  @Override
    public void set_data(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("======================= *** ENTER GROUPS DETAILS *** =======================");
        System.out.println();
        System.out.print("GROUP NAME: ");
        gname = sc.nextLine();
         System.out.print("Submit: YES OR NO ");
        submit = sc.nextLine();
        System.out.print("1ST MEMBER NAME: ");
        fname = sc.nextLine();
         System.out.print(("1ST MEMBER ID: "));
        fid = sc.nextInt();
        System.out.print("2ND MEMBER NAME: ");
        sname = sc.nextLine(); 
        sc.nextLine();
         System.out.print(("2ND MEMBER ID: "));
        sid = sc.nextInt();
       
        


    }

    @Override
    public void get_data() {
         System.out.println("GROUP NAME: "+gname);
         System.out.println("SUBMITTED STATUS: "+submit);
         
        System.out.println("1ST MEMBER NAME:"+fname+"   1ST MEMBER ID:"+fid+"   1ST MEMBER SCORE:"+fscore+" ");
           System.out.println("2ND MEMBER NAME:"+sname+"   2ND MEMBER ID:"+sid+"   2ND MEMBER SCORE:"+sscore+" ");
        
         
        
          
         
    
}
}
