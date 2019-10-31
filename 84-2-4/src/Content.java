import java.util.Objects;

class Content {
    private final String content;
    
    private Content(String content) {
        Objects.requireNonNull(content);
        this.content = content;
    }
    
    static Content from(String content) {
        return new Content(content);
    }
    
    public String getContent() {
        return content;
    }
}
