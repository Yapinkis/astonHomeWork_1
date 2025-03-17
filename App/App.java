package App;

import Model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Service.DeleteTask.deleteTask;

public class App {
    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        tasks.add(new Task("one"));
        tasks.add(new Task("two"));
        tasks.add(new Task("three"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете задачу");
            System.out.println(" " +
                    "\n 1 - Добавить задачу" +
                    "\n 2 - Показать список задач" +
                    "\n 3 - Удалить задачу" +
                    "\n 4 - Удалить все азадчи" +
                    "\n 5 - Маркировать задачу как выполненную" +
                    "\n 6 - Завершить программу");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 3:
                    System.out.println("Введите наименование задачи");
                    String task = scanner.nextLine();
                    deleteTask(task);
                    break;
                case 6:
                    System.out.println("Программа завершена");
                    return;
                default:
                    System.out.println("Введён неверный индекс");

            }
        }
    }
}
