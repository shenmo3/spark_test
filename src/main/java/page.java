import static spark.Spark.*;

public class page {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World!");
    }
}