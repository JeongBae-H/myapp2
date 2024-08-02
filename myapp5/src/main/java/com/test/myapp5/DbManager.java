package com.test.myapp5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DbManager {
    @Autowired
    private Database database;
    public DbManager(@Qualifier("oracle") Database database) {
        this.database = database;
    }
    public void dbOpen() {
        this.database.open();
    }
}
