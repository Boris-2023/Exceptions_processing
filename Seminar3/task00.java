import java.io.FileWriter;
import java.io.IOException;

// Класс CustomException представляет собой пользовательское исключение
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class task00 {
    public static void main(String[] args) throws CustomException {
        System.out.println("saving document started");

        // Пытаемся открыть файл и записать в него информацию
        try (FileWriter writer = new FileWriter("test")) {
            // Выбрасываем исключение IOException
            throw new IOException("Operation failed");
        } catch (IOException e) {
            // При перехвате исключения выводим его сообщение
            System.out.println(e.getMessage());
            // И выбрасываем новое исключение CustomException, в которое
            // вкладываем исходное исключение, чтобы сохранить информацию о нем
            throw new CustomException("saving failed", e);
        }
    }
}

