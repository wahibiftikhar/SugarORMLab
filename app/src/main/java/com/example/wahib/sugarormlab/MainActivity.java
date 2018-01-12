package com.example.wahib.sugarormlab;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.orm.SugarRecord;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";
    EditText ettitle, etedition;
    Button btnsave;
    ListView listview;
    ArrayAdapter<Book> adapter;
    Book book = new Book();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettitle = (EditText) findViewById(R.id.title);
        etedition = (EditText) findViewById(R.id.edition);
        btnsave = (Button) findViewById(R.id.save);
        final String title = ettitle.getText().toString();
        final String edition = etedition.getText().toString();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book = new Book(title, edition);
                book.save();
                Log.d(TAG, "onCreate: "+ Book.findAll(Book.class));
            }
        });


/*        listview = (ListView) findViewById(R.id.list);
        List<Book> list = Book.listAll(Book.class);
        adapter = new ArrayAdapter<Book>(MainActivity.this, android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);
        Toast.makeText(getApplicationContext(),""+list,Toast.LENGTH_LONG).show();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book = new Book(ettitle.getText().toString(),etedition.getText().toString());
                book.save();
                Toast.makeText(getApplicationContext(),""+book,Toast.LENGTH_LONG).show();
            }
        });*/



        /*
        // load
        Book book = Book.findById(Book.class, 1); //load entity
        //update
        Book book = Book.findById(Book.class, 1);
        book.title = "updated title here"; // modify the values
        book.edition = "3rd edition";
        book.save(); // updates the previous entry with new values.
        //Delete
        Book book = Book.findById(Book.class, 1);
        book.delete();
        //Bulk Operations
        List<Book> books = Book.listAll(Book.class);
        Book.deleteAll(Book.class);
         */


    }
}