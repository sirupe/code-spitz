import java.util.stream.IntStream;

public class ConsoleVisitor implements Visitor {
    private static final Integer START_POINT = 0;
    private static final String SPACE = " ";
    @Override
    public void draw(Task task, Integer depth) {
        IntStream.range(START_POINT, depth).forEach(d -> System.out.print(SPACE));
        System.out.println(task.getDate() + SPACE + task.getTitle() + SPACE + task.getContent());
    }
}
