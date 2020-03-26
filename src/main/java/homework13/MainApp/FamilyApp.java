package homework13.MainApp;

import homework13.Controller.FamilyController;
import homework13.Entity.Family;
import homework13.Entity.Human;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FamilyApp {
    public static void main(String[] args)  {

        DisplayMenu displayMenu= new DisplayMenu();
        FamilyController familyController= new FamilyController();
        Scanner scanner= new Scanner(System.in);
            boolean command=true;
            while (command){
                displayMenu.user();
                String menu_item= scanner.next();
                switch (menu_item){
                    case "1":
                       Human Kane= new Human("Kane", "Baker",1980,11,2,111);
                       Human Luisa= new Human("Luisa", "Baker",1982,11,2,111);
                       familyController.createNewFamily(Luisa,Kane);
                        break;

                    case "2":
                        familyController.displayAllFamilies();
                        break;

                    case "3":
                        System.out.println("Enter number for filtering");
                        int number_big= scanner.nextInt();
                        System.out.println(familyController.getFamiliesBiggerThan(number_big));
                        break;

                    case "4":
                        System.out.println("Enter number for filtering");
                        int number_less= scanner.nextInt();
                        System.out.println(familyController.getFamiliesLessThan(number_less));
                        break;

                    case "5":
                        System.out.println("Enter number for filtering");
                        long number_equal= scanner.nextInt();
                        System.out.println(familyController.countFamiliesWithMemberNumber(number_equal));
                        break;
                    case "6":

                        System.out.println("Enter mother's name:");
                        String mom_name = scanner.next();
                        System.out.println("Enter mothers's surname:");
                        String mom_surname = scanner.next();
                        System.out.println("Enter year of birth: ");
                        int mom_year = scanner.nextInt();
                        System.out.println("Enter month of birth");
                        int mom_month = scanner.nextInt();
                        System.out.println("Enter birthday");
                        int mom_day= scanner.nextInt();
                        System.out.println("Enter level of intelligence");
                        int mom_iq = scanner.nextInt();

                        System.out.println("Enter father's name:");
                        String dad_name = scanner.next();
                        System.out.println("Enter father's surname:");
                        String dad_surname = scanner.next();
                        System.out.println("Enter year of birth: ");
                        int dad_year = scanner.nextInt();
                        System.out.println("Enter month of birth");
                        int dad_month = scanner.nextInt();
                        System.out.println("Enter birthday");
                        int dad_day= scanner.nextInt();
                        System.out.println("Enter level of intelligence");
                        int dad_iq = scanner.nextInt();
                        familyController.createNewFamily(new Human(mom_name,mom_surname,mom_year,mom_month,mom_day,mom_iq),new Human(dad_name,dad_surname,dad_year,dad_month,dad_day,dad_iq));
                        System.out.println("Data saved");
                        break;

                    case "7":
                        try {
                            System.out.println("Enter id to delete family");
                            int delete = scanner.nextInt();
                            familyController.deleteFamilyByIndex(delete);
                            System.out.println("Data deleted");
                        }
                        catch (IndexOutOfBoundsException ex){
                            System.out.println("Enter valid id");
                        }
                        break;

                    case "8":

                        boolean command2= true;
                    while (command2) {
                        displayMenu.edition();
                        String menu_item1= scanner.next();
                        switch (menu_item1) {
                            case "1":
                                System.out.println("Enter ID of family to which you want add:");
                                int familyId = scanner.nextInt(7);
                                Family familyById= familyController.getByFamilyId(familyId);
                                System.out.println("Enter name for boy");
                                String boy = scanner.next();
                                System.out.println("Enter name for girl");
                                String girl = scanner.next();
                                familyController.bornChild(familyById, boy,girl);
                                System.out.println("Data saved");
                                break;
                            case "2":
                                try {
                                    System.out.println("Enter ID of family to which you want add:");
                                    int familyId1 = scanner.nextInt();
                                    System.out.println("Enter name:");
                                    String name = scanner.next();
                                    System.out.println("Enter surname: ");
                                    String surname = scanner.next();
                                    System.out.println("Enter year of birth");
                                    int birthYear = scanner.nextInt();
                                    System.out.println("Enter level of intelligence");
                                    int iq = scanner.nextInt();
                                    familyController.adoptChild(familyId1, new Human(name, surname, birthYear, iq));
                                    System.out.println("Data saved");
                                }
                                catch (InputMismatchException ex){
                                    System.out.println("Please enter valid data");
                                }
                                break;
                            case "3":
                                command2=false;
                                break;
                            default:
                                System.out.println("Please enter command from menu");
                                break;
                        }
                    }
                        break;

                    case "9":
                        System.out.println("Enter number for filtering");
                        int older_than= scanner.nextInt();
                        familyController.deleteAllChildrenOlderThen(older_than);
                        System.out.println("Deleted...");
                        break;

                    case "10":
                        command=false;
                        System.out.println("Bye Bye");
                        break;
                    default:
                        System.out.println("Please enter command from menu");
                        break;
                }
            }
    }
}
