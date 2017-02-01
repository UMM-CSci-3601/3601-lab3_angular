// Trying out SparkJava

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFiles.location("/public");

        // Simple example route
        get("/hello", (req, res) -> "Hello World");

        // Redirects for the "home" page
        redirect.get("", "/");
        redirect.get("/", "index.html");

        // Handle "404" file not found requests:
        notFound((req, res) -> {
                res.type("text");
                res.status(404);
                return "Sorry, we couldn't find that!";
        });
    }
}
