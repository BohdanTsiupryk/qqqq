package com.company.storages;

public class NewStorage implements Storage {

    @Override
    public void addData(String data) {
        System.out.println(data);
    }

    @Override
    public void printData() {
        System.out.println("Error message");
    }
}
