package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
    private String name;
    private Instant access;

    public LogEntry() {}

    public LogEntry(String name, Instant access) {
        this.name = name;
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", access=").append(access);
        sb.append('}');
        return sb.toString();
    }
}
