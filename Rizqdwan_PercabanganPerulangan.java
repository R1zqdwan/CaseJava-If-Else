package rizqdwan_percabanganperulangan;

import java.util.Scanner;

public class Rizqdwan_PercabanganPerulangan {
    
    public static void main(String[] args) {
        Scanner tools = new Scanner(System.in);
        boolean Login = false;

        String email, password;
        while (Login == false) {
            System.out.println("  LOGIN DISCORD \n");
            System.out.print("Email: ");
            email = tools.nextLine();
            System.out.print("Password: ");
            password = tools.nextLine();

            
            if (email.equals("nawdqzir@gmail.com") && password.equals("nawdqzir1")) {
                
                System.out.println("\n-----Welcome To Discord-----");
            Login = true;
            } 
            else if (!email.equals("nawdqzir@gmail.com") && !password.equals("nawdqzir1")){
                System.out.println("\n-----Your Email and Password Is Wrong-----");
            }
            else if(!email.equals("nawdqzir@gmail.com")){
                System.out.println("\n-----Your Email is wrong-----");
                
            }else if (!password.equals("nawdqzir1")){
                System.out.println("\n-----Your Password is wrong-----");
            }
        }
    }
}

  
