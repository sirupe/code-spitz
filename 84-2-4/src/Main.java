public class Main {
    public static void main(String[] args) {
        Task baseTask = Task.of("0", "start");
        Task task1 = Task.of("1", "first");
        Task task2 = Task.of("1-1", "first-bar-first");
        Task task3 = Task.of("1-2", "first-bar-second");
        Task task4 = Task.of("2", "second");
        Task task5 = Task.of("2-1", "second-bar-first");
        Task task6 = Task.of("2-1-1", "second-bar-first-bar-first");
        task1.addTask(task2);
        task1.addTask(task3);
        task5.addTask(task6);
        task4.addTask(task5);
        baseTask.addTask(task1);
        baseTask.addTask(task4);
        
        Renderer renderer = Renderer.from(new ConsoleVisitor());
        renderer.render(baseTask);
    }
}
