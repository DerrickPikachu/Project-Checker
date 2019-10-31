package com.example.project_checker.module;

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

    private void writeList() {
        
    }

    private void readList() {

    }
}
