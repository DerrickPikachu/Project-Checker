package com.example.project_checker.module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemoListCollection {
    private static ArrayList<MemoList> allList;
    private final static String FILENAME = "memo_list";
    private static File path;

    public MemoListCollection() {
        allList = new ArrayList<>();
    }

    /*
    File I/O:
        Here I want to write/read allList into/from a binary file.
        As a result, I need to use some File I/O in java.
        MemoList is already implements Serializable.

        Format:
            The first data is a int number, and after this are MemoList object
     */

    public static void setPath(File f) {
        path = f;
    }

    public void writeList() {
        File file = new File(path, FILENAME);

        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));

//            allList.add(new MemoList("text"));

            output.writeInt(allList.size());
            for (int i=0; i<allList.size(); i++) {
                output.writeObject(allList.get(i));
            }

            output.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }

    private void readList() {
        File file = new File(path, FILENAME);

        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));

            int size = input.readInt();
            for (int i=0; i<size; i++) {
                allList.add((MemoList)input.readObject());
            }

            input.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
        catch(ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public String getContent(int index) {
        try {
            if (index < 0 || index >= allList.size())
                throw new Exception("index out of bound");
            return allList.get(index).getDescribe();
        }
        catch(Exception e) {
            System.out.println(e.toString());
            return "";
        }
    }

    public int size() {
        return allList.size();
    }
}
