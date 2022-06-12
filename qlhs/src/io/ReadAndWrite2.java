package io;

import models.ClassCG;
import models.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite2 {
    public void write(ArrayList<Student>students){
        File file = new File("student4.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Student> reader(ArrayList<ClassCG>classCGS){
        ArrayList<Student>students = new ArrayList<>();
        File file = new File("student4.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (ArrayList<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("file k tồn tại");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("file chưa tồn tại");;
        }

        return students;
    }
}
