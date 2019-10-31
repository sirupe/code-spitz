import java.time.LocalDateTime;

class TimeStamp {
    private final LocalDateTime time;
    
    private TimeStamp() {
        this.time = LocalDateTime.now();
    }
    
    static TimeStamp newInstance() {
        return new TimeStamp();
    }
    
    public LocalDateTime getTime() {
        return LocalDateTime.from(this.time);
    }
}
