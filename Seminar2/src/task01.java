public class task01 {

//         java.lang.Object
//             |
//      java.lang.Throwable
//        /           \
//java.lang.Error   java.lang.Exception


}

// Пример пользовательского класса ошибки, наследующегося от Error
class MyCustomError extends Error {
    public MyCustomError() {
        super("This is a custom error message.");
    }
}
