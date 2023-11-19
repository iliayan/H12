
// Головний клас
public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу MyClass
        MyClass myObject = new MyClass();

        // Викликаємо абстрактний метод з Interface1
        myObject.abstractMethod();

        // Викликаємо абстрактний метод та дефолтний метод з Interface2
        myObject.abstractMethod();
        myObject.defaultMethod();

        // Викликаємо статичний метод з Interface2
        Interface2.staticMethod();
    }
}