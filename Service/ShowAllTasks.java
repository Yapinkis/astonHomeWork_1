package Service;

import static App.App.tasks;

public class ShowAllTasks {
    public static void showAllTasks() {
        tasks.forEach(System.out::println);
    }
}
