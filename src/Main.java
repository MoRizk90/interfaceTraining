import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static ArrayList<String> readToValue(){
        ArrayList<String> values = new ArrayList<String>(); // a new object created in the memory from class entery

        // 2) using the scanner to create a scanner object to get the keyboard from the entry
        Scanner keyBoardEnrty = new Scanner(System.in);

        //3) the below variable was created to be used in the while loop in the op
        boolean quit = true;

        // 4)
        int index = 0;

        // 5) printing to the user some instruction
        System.out.println("Choose an option \n"
                            + "1 to enter  a string \n"
                            + "0 t o quit");

        // 6)
        while (!quit){
            // 7) printing to the user instruction to choose an option
            System.out.println("Choose an option: ");

            // waiting for an entry from the user
            int choice = keyBoardEnrty.nextInt();

            // The below line is used in order to avoid an extra line by the string and the allowing the scanner to take it as an input
            keyBoardEnrty.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = keyBoardEnrty.nextLine();
                    values.add(1, stringInput);
                    index++;
                    break;

            }
        }
        return values;

    }

    public static void saveObjects(Isavable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
    }
}
