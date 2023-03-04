import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<DataUser>list=new ArrayList();
        list.add(new DataUser( 1,"ahmed"));
        list.add(new DataUser( 2,"ali"));
        list.add(new DataUser( 3,"mona"));
     while (true){
         int newId =list.size();
        System.out.println("If you want to add new element ,Press 1 : ");
        System.out.println("If you want to check that element exit or not ,Press 2 and enter ID : ");
        int x =in.nextInt();
        if (x==1){
            System.out.println("Enter name");
            String name = in.next();
             list.add(new DataUser(++newId,name));
        }
        else if(x==2){
            System.out.println("Enter id");
            int id=in.nextInt();
            if (id<1||id>list.size()){
                System.out.println("Doesn't exist");}
            for (DataUser check:list){
                if (id==check.getId()){
                    System.out.println("name : "+check.getName() );
                    System.out.println("Change name");
                    String newName=in.next();
                  list.add(check.getId()-1,new DataUser(check.getId(), newName));
                    break;
                }
            }


        }

     }
    }
}