package App;

import Model.Task;
import Service.AddTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Service.DeleteTask.deleteTask;

import static Service.CompleteTask.completeTask;

public class App {
    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
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
                case 1:
                    System.out.println("Введите наименование задачи");
                    String task = scanner.nextLine();
                    AddTask.addTask(task);
                    break;
                case 3:
                    System.out.println("Введите наименование задачи");
                    String taskDel = scanner.nextLine();
                    deleteTask(taskDel);
                    break;
                case 5:
                    completeTask();
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
