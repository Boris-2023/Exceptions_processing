// Базовый класс Animal с методом eat()
public class Animal {
    // Метод eat() может выбросить исключение EatingException
    public void eat() throws EatingException {
        // С 50% вероятностью животное не захочет есть
        if (Math.random() < 0.5) {
            // В таком случае выбрасывается исключение EatingException
            throw new EatingException("Animal is not eating");
        } else {
            // Если животное ест, выводится соответствующее сообщение
            System.out.println("Animal is eating...");
        }
    }
}

// Класс EatingException представляет собой пользовательское исключение,
// которое выбрасывается, когда животное не хочет есть
class EatingException extends Exception {
    // Конструктор принимает сообщение об ошибке
    public EatingException(String message) {
        super(message);
    }
}

// Главный класс, в котором выполняется основная программа
class Main {
    public static void main(String[] args) throws AnimalCareException {
        // Создаем объект животного
        Animal animal = new Animal();

        // Пытаемся накормить животное
        try {
            animal.eat();
        } catch (EatingException e) {
            // Если животное не ест, ловим исключение EatingException
            // Выводим сообщение об ошибке
            System.out.println(e.getMessage());
            // Затем выбрасываем новое исключение AnimalCareException
            throw new AnimalCareException("Feeding failed", e);
        }
    }
}

// Класс AnimalCareException представляет собой пользовательское исключение,
// которое выбрасывается, когда уход за животным не удается
class AnimalCareException extends Exception {
    // Конструктор принимает сообщение об ошибке и исходное исключение
    public AnimalCareException(String message, Throwable cause) {
        super(message, cause);
    }
}

