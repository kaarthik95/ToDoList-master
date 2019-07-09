package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16033706 on 13/7/2018.
 */

public class CustomAdaptor extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdaptor(@NonNull Context context, int resource,
                         @NonNull ArrayList<ToDoItem> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ToDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById((R.id.tv1));
        TextView tvDate = rowView.findViewById((R.id.tv2));
        ToDoItem currentItem = ToDoList.get(position);
        tvName.setText(currentItem.getTask1());
        tvDate.setText(currentItem.getTask2());

        return rowView;
    }

}
