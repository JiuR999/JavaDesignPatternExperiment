package org.example.lab1.question4;

import java.util.ArrayList;
import java.util.List;

public class BackupUtil {
    private List<PhoneManager> managers;

    public void setManager(PhoneManager manager){
        if(managers == null){
            managers = new ArrayList<>();
        }
        managers.add(manager);
    }

    public void backup(StorageItem item) {
        for (PhoneManager manager : managers) {
            manager.copy(item);
        }
    }
}
