public class Renderer {
    private final static Integer START_DEPTH = 0;
    private final static Integer NEXT = 1;
    private final Visitor visitor;
    
    private Renderer(Visitor visitor) {
        this.visitor = visitor;
    }
    
    public static Renderer from(Visitor visitor) {
        return new Renderer(visitor);
    }
    
    public void render(Task task) {
        this.render(task, START_DEPTH);
    }
    
    private void render(Task task, Integer depth) {
        this.visitor.draw(task, depth);
        for (Task t : task.getTasks()) {
            this.render(t, depth + NEXT);
        }
    }
}
