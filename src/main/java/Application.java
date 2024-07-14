import todo.TodoClient;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {

        TodoClient todoClient = new TodoClient();
        System.out.println(todoClient.findAll());

    }

}
