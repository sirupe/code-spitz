import java.util.Objects;

class Title {
    private final String title;
    
    private Title(String title) {
        Objects.requireNonNull(title);
        this.title = title;
    }
    
    static Title from(String title) {
        return new Title(title);
    }
    
    public String getTitle() {
        return title;
    }
}
