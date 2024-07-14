package todo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Todo {

    private final Integer userId;
    private final Integer id;
    private final String title;
    private final Boolean completed;

    @JsonCreator
    public Todo(@JsonProperty("userId") Integer userId,
                @JsonProperty("id") Integer id,
                @JsonProperty("title") String title,
                @JsonProperty("completed") Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(userId, todo.userId)
                && Objects.equals(id, todo.id)
                && Objects.equals(title, todo.title)
                && Objects.equals(completed, todo.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, id, title, completed);
    }
}
