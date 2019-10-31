import java.util.LinkedHashSet;
import java.util.Set;

class Tasks {
    private final Set<Task> tasks;
    
    private Tasks() {
        this.tasks = new LinkedHashSet<>();
    }
    
    static Tasks newInstance() {
        return new Tasks();
    }
    
    final void addTask(Task task) {
        this.tasks.add(task);
    }
    
    Set<Task> getTasks() {
        return new LinkedHashSet<>(this.tasks);
    }
}
