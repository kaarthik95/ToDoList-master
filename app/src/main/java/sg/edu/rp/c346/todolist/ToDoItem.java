package sg.edu.rp.c346.todolist;

/**
 * Created by 16033706 on 13/7/2018.
 */

public class ToDoItem {

    private String task1;
    private String task2;

    public ToDoItem(String Task1, String Date) {
        this.task1 = Task1;
        this.task2 = Date;
    }

    public String getTask1() {
        return task1;
    }

    public void setTask1(String task1) {
        this.task1 = task1;
    }

    public String getTask2() {
        return task2;
    }

    public void setTask2(String task2) {
        this.task2 = task2;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "task1='" + task1 + '\'' +
                ", task2='" + task2 + '\'' +
                '}';
    }
}
