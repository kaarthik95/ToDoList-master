package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    ArrayList<ToDoItem> alToDoList;
    CustomAdaptor caToDoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDoList = findViewById(R.id.listViewToDoList);

        alToDoList = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("MSA", "1/7/2018");
        alToDoList.add(item1);
        ToDoItem item2 = new ToDoItem("Go for haircut", "22/9/2018");
        alToDoList.add(item2);


        caToDoList = new CustomAdaptor(this, R.layout.todoitem_main, alToDoList);
        lvToDoList.setAdapter(caToDoList);
    }
}
