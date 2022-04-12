package com.company;

import com.company.storages.Storage;

public class Main {

    private static String inputData = "input";

    public static void main(String[] args) {
        StorageType storageType = StorageType.valueOf(args[0]);

        Storage storage = StorageFactory.getStorage(storageType);

        storage.addData(inputData);
        storage.printData();
    }
}
