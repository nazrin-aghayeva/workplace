package webLogin;

import ibaHW13.Database.FileException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoginApp {
    List<Credentials> credentialsList= new ArrayList<>();

    public String add(String username, String email, String password){
        credentialsList.add(new Credentials(username, email, password));
        write();
        return "Successfully Created \n"+ read().toString();
    }
    public boolean write(){
        try {
            File userFile=new File("credentials.txt");
            FileOutputStream fos=new FileOutputStream(userFile);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(credentialsList);
            oos.close();
            fos.close();
            return true;
        }catch (IOException e) {
            e.printStackTrace();
            throw new FileException("File is not found");
        }
    }

    public List<Credentials> read()  {
        try{
            File userFile = new File("credentials.txt");
            FileInputStream fis = new FileInputStream(userFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            credentialsList = (List<Credentials>) ois.readObject();
            ois.close();
            fis.close();}
        catch (IOException e){
            throw new FileException("File is not found");
        }
        catch (ClassNotFoundException ex){
            throw new FileException("Class not found");

        }
        return credentialsList;
    }
}
