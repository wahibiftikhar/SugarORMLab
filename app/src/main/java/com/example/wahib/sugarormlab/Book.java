package com.example.wahib.sugarormlab;

/**
 * Created by wahib on 13/01/18.
 */

import com.orm.SugarRecord;

/**
 * Created by Tee on 12/12/2017.
 */

public class Book extends SugarRecord<Book> {
    String title;
    String edition;

    public Book() {
    }

    public Book(String title, String edition) {
        this.title = title;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
}