package homework13.MainApp;

public class DisplayMenu {
    public void user(){
        StringBuilder sb= new StringBuilder();
        sb.append(" 1- Fill with test data\n");
        sb.append(" 2- Display the entire list of families\n");
        sb.append(" 3- Display a list of families where the number of people is greater that the specified number \n");
        sb.append(" 4- Display a list of families where the number of people is less that the specified number    \n");
        sb.append(" 5- Calculate the number of families where the number of people equal to required number       \n");
        sb.append(" 6- Create a new family\n");
        sb.append(" 7- Delete the family by its index in the general list\n");
        sb.append(" 8- Edit the family by its index in the general list\n");
        sb.append(" 9- Remove all children over the age of majority\n");
        sb.append(" 10- Exit \n" );
        sb.append(">>> Your selection: ");
        System.out.println(sb);
    }

    public void edition(){
        StringBuilder sb= new StringBuilder();
        sb.append(" 1- Give birth to baby\n");
        sb.append(" 2- Adopt child\n");
        sb.append(" 3- Return to the main menu \n");
        sb.append(">>> Your selection: ");
        System.out.println(sb);
    }

}
