package com.company.storages;

import java.util.HashSet;
import java.util.Set;

public class UnicStorage implements Storage {

    private Set<String> storage = new HashSet();

    @Override
    public void addData(String data) {
        storage.add(data);
    }

    @Override
    public void printData() {
        System.out.println("unic");

        storage.forEach(s -> System.out.println(s));
    }
}
