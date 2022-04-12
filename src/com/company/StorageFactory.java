package com.company;

import com.company.storages.InMemoryStorage;
import com.company.storages.NewStorage;
import com.company.storages.Storage;
import com.company.storages.UnicStorage;

public class StorageFactory {

     private static final InMemoryStorage inMemorySingleton = new InMemoryStorage();

     public static Storage getStorage(StorageType type) {

          return switch (type) {
               case INMEMORY -> inMemorySingleton;
               case UNIC -> new UnicStorage();
               case NEW -> new NewStorage();
          };
     }
}
