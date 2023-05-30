package Homework1;

import java.io.*;

public class FileHandler {
    public void save(String path, String fileName, String format, SavedObject savedTree) throws IOException {
        if (savedTree == null)
        {
            return;
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + "\\" + fileName + "." + format);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(savedTree);
            objectOutputStream.close();
            System.out.println("Файл сохранен!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Проблема с сохранением файла!");
        }

    }

    public SavedObject load(String path, String type) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            if (type.equals("FamilyTree")) {
                FamilyTree familyTree = (FamilyTree) objectInputStream.readObject();
                objectInputStream.close();
                System.out.println("Файл загружен!");
                return familyTree;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден!");
        }

        System.out.println("Неудалось преобразовать!");
        return null;
    }
}
