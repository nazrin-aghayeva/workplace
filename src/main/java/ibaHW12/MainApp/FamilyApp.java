package ibaHW12.MainApp;

import ibaHW12.Controller.FamilyController;
import ibaHW12.Entity.Family;
import ibaHW12.Entity.Human;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FamilyApp {
    public static void main(String[] args) throws ParseException {
        DisplayMenu displayMenu= new DisplayMenu();
        FamilyController familyController= new FamilyController();
        Scanner scanner= new Scanner(System.in);
            boolean command=true;
            while (command){
                displayMenu.user();
                String menu_item= scanner.next();
                switch (menu_item){
                    case "1":
                        Human Jane= new Human("Jane", "Brodly",1992,11,12,111);
                        Human Kane= new Human("Kane", "Brodly", 1990,7,13,111);
                        familyController.createNewFamily(Jane,Kane);
                        Human Adrian= new Human("Adrian", "Abraham",1982,11,12,111);
                        Human Johnatan= new Human("Johnatan", "Abraham", 1980,7,13,111);
                        familyController.createNewFamily(Adrian,Johnatan);
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
                        try {
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

                        }
                       catch (InputMismatchException ex){
                           System.out.println("Please enter valid data");
                       }
                    break;

                    case "7":
                        System.out.println("Enter id to delete family");
                        int delete= scanner.nextInt();
                        familyController.deleteFamilyByIndex(delete);
                        System.out.println("Data deleted");
                        break;

                    case "8":

                        boolean command2= true;
                    while (command2) {
                        displayMenu.edition();
                        String menu_item1= scanner.next();
                        switch (menu_item1) {
                            case "1":
                                try {
                                    System.out.println("Enter ID of family to which you want add:");
                                    int familyId = scanner.nextInt();
                                    Family familyById = familyController.getByFamilyId(familyId);
                                    System.out.println("Enter name for boy");
                                    String boy = scanner.next();
                                    System.out.println("Enter name for girl");
                                    String girl = scanner.next();
                                    familyController.bornChild(familyById, boy, girl);
                                    System.out.println("Data saved");
                                }
                                catch (InputMismatchException ex){
                                    System.out.println("Please enter valid data");
                                }
                                break;
                            case "2":
                                try {
                                    System.out.println("Enter ID of family to which you want add:");
                                    int familyId1 = scanner.nextInt();
                                    Family familyById1= familyController.getByFamilyId(familyId1);
                                    System.out.println("Enter name:");
                                    String name = scanner.next();
                                    System.out.println("Enter surname: ");
                                    String surname = scanner.next();
                                    System.out.println("Enter year of birth");
                                    int birthYear = scanner.nextInt();
                                    System.out.println("Enter level of intelligence");
                                    int iq = scanner.nextInt();
                                    familyController.adoptChild(familyById1, new Human(name, surname, birthYear, iq));
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
