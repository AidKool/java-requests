package todo;

public record TodoRecord(String userId, String id, String title, String completed) {
//    1. generates private final fields for each of the components
//    2. generates a constructor that takes all the components in the order they are defined
//    3. generates public getters for each of the components
//    4. generates an equals() method that compares each of the components
//    5. generates a hashCode() method that uses the hash codes of each of the components
//    6. generates a toString() method that prints the record in a human-readable format
}
