package todo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
}
