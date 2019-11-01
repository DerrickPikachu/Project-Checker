package com.example.project_checker.module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemoListCollection {
    private ArrayList<MemoList> allList;
    private final static String fileName = "memo_data";

    public MemoListCollection() {
        allList = new ArrayList<>();
    }

    /*
    File I/O:
        Here I want to write/read allList into/from a binary file.
        As a result, I need to use some File I/O in java.
        MemoList is already implements Serializable.
     */

    public void writeList() {
        String s = "test";
        allList.add(new MemoList(s));

        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));

            output.writeInt(allList.size());
            for (int i=0; i<allList.size(); i++)
                output.writeObject(allList.get(i));

            output.close();
        }
        catch(IOException e) {
            System.out.println("write error");
        }
    }

    public void readList() {
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            int size = input.readInt();

            for (int i=0; i<size; i++) {
                allList.add((MemoList)input.readObject());
            }

            input.close();
        }
        catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
        catch (IOException e) {
            System.out.println("read error");
        }
    }

    public String getContent(int index) {
        return allList.get(index).getDescribe();
    }
}
