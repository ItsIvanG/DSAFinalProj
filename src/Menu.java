import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        mainMenu();
    }
    static void  Members(){
        Scanner scan = new Scanner(System.in);
        String[] namesMembers={"Gonzales, Ivan S.",
                "Manalo, Mary Grace C.",
                "Buendia, Daniela Mhaey F.",
                "Garcia, Exequiel G.",
                "Enriquez, John Ren P.",
                "Tuazon, Julian Madison C.",
                "Rodriguez, Patrisha Marie",
                "Sengco, Raeneil P."};
        System.out.println("[1] Group Leader\n" +
                "[2] Member 1\n" +
                "[3] Member 2\n" +
                "[4] Member 3\n" +
                "[5] Member 4\n" +
                "[6] Member 5\n" +
                "[7] Member 6\n" +
                "[8] Member 7\n" +
                "[0] Back to Main Menu");
        int answer = scan.nextInt();
        if(answer>0){
            System.out.println(namesMembers[answer-1]);
            Members();
        }
    }
    static void mainMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] Arrays & Pointers");
        System.out.println("[2] Linked List");
        System.out.println("[3] Stack Data Structure");
        System.out.println("[4] Queue Data Structure");
        System.out.println("[5] Search & Sorting Algorithm");
        System.out.println("[6] Hash Table");
        System.out.println("[7] Tree Data Structure");
        System.out.println("[8] Group Members");
        System.out.println("[0] Exit");

        int answer = scan.nextInt();

        switch(answer){

            case 0:
                System.exit(0);
                break;
            case 1:
                //arrays
                break;
            case 2:
                //linkedlist
                break;
            case 3:
                //stack
                break;
            case 4:
                //queue
                break;
            case  5:
                //search
                break;
            case 6 :
                //hash
                break;
            case 7:
                //tree
                break;
            case 8:
                //group members
                Members();
                mainMenu();
                break;
            default:
                System.out.println("Invalid Choice Selected.");
                break;

        }
    }
}
