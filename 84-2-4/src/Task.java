import java.time.LocalDateTime;
import java.util.Set;

class Task {
    private Title title;
    private Content content;
    private TimeStamp date;
    private final Tasks tasks;
    
    private Task(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
        this.date = TimeStamp.newInstance();
        this.tasks = Tasks.newInstance();
    }
    
    static Task of(String title, String content) {
        return new Task(title, content);
    }
    
    void addTask(Task task) {
        this.tasks.addTask(task);
    }
    
    Set<Task> getTasks() {
        return this.tasks.getTasks();
    }
    
    void setTitle(String title) {
        this.title = Title.from(title);
    }
    
    void setContent(String content) {
        this.content = Content.from(content);
    }
    
    public String getTitle() {
        return title.getTitle();
    }
    
    public String getContent() {
        return content.getContent();
    }
    
    public LocalDateTime getDate() {
        return date.getTime();
    }
}
