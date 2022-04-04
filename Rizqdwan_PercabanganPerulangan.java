package rizqdwan_percabanganperulangan;

import java.util.Scanner;

public class Rizqdwan_PercabanganPerulangan {

// Rizqdwan Dhuhakbar Hendyutama | 21523100 \\
    
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

            
            if (email.equals("rizqdwan@gmail.com") && password.equals("rizqdwan31")) {
                
                System.out.println("\n-----Welcome To Discord-----");
            Login = true;
            } 
            else if (!email.equals("rizqdwan@gmail.com") && !password.equals("rizqdwan31")){
                System.out.println("\n-----Your Email and Password Is Wrong-----");
            }
            else if(!email.equals("rizqdwan@gmail.com")){
                System.out.println("\n-----Your Email is wrong-----");
                
            }else if (!password.equals("rizqdwan31")){
                System.out.println("\n-----Your Password is wrong-----");
            }
        }
    }
}

  
