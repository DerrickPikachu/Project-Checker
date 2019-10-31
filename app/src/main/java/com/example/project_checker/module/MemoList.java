package com.example.project_checker.module;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class MemoList implements Serializable {
    private Date deadLine;
    private String describe;
    private ArrayList<String> checkArray;

    public MemoList(Date d, String text, ArrayList<String> check) {
        deadLine = d;
        describe = text;
        checkArray = check;
    }

    public MemoList(Date d, String text) {
        deadLine = d;
        describe = text;
        checkArray = new ArrayList<>();
    }

    public MemoList(String text) {
        deadLine = new Date();
        describe = text;
        checkArray = new ArrayList<>();
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public String getDescribe() {
        return describe;
    }

    public ArrayList<String> getCheckArray() {
        return checkArray;
    }

    public void setCheckArray(ArrayList<String> checkArray) {
        this.checkArray = checkArray;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
