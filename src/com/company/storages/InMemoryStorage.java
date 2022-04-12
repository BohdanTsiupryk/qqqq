package com.company.storages;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage implements Storage{

    private List<String> storage = new ArrayList<>();

    @Override
    public void addData(String data) {
        storage.add(data);
    }

    @Override
    public void printData() {
        System.out.println("In memory");
        storage.forEach(s -> System.out.println(s));
    }
}
