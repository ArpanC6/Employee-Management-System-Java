package util;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class FileLogger {
    public static void log(String message) {
        try (FileWriter fw = new FileWriter("app.log", true)) {
            fw.write(LocalDateTime.now() + " : " + message + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}