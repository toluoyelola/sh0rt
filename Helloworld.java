
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
	else if (language.equalsIgnoreCase("english")){
            System.out.println("Hello " + name + "!");
        }
	else if (language.equalsIgnoreCase("yoruba")){
            System.out.println(name + " bawo ni");
        }
        else{
           System.out.println("Sorry " + name + " I do not know that language"); 
        }



    }
}