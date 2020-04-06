package ibaHomework13.Database;

import ibaHomework13.Entity.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Family> families= new ArrayList<>();
    public List<Family> readFromFileFamilies()  {
        try{
            File familyFile = new File("families.txt");
            FileInputStream fis = new FileInputStream(familyFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            families = (List<Family>) ois.readObject();
            ois.close();
            fis.close();}
        catch (IOException e){
            throw new FileException("File is not found");
        }
        catch (ClassNotFoundException ex){
            throw new FileException("Class not found");

        }
        return families;
    }

    public boolean writeToFileFamilies(){
        try {
            File familyFile=new File("families.txt");
            FileOutputStream fos=new FileOutputStream(familyFile);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(families);
            oos.close();
            fos.close();
            return true;
        }catch (IOException e) {
            e.printStackTrace();
            throw new FileException("File is not found");
        }
    }

    public List<Family> getAllFamilies(){
        return readFromFileFamilies();
    }

    public List<Family> getFamilyList() {
        return families;
    }






}
