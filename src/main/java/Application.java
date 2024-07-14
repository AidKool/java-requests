import todo.Todo;
import todo.TodoClient;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {

        TodoClient todoClient = new TodoClient();
        List<Todo> todos = todoClient.findAll();

        System.out.println(todos);

    }

}
