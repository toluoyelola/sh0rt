<<<<<<< HEAD
=======

>>>>>>> 4896be37dcefaa9fcbb8c69440fd64e862a2d880
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What language do you speak? ");
        String language = scanner.nextLine();

	if(language.equalsIgnoreCase("hungarian") || language.isEmpty()){
          System.out.println("Szia " + name + "!");  
        }



    }
}