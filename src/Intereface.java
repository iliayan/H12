// Інтерфейс з одним абстрактним методом
interface Interface1 {
    void abstractMethod();
}

// Інтерфейс з абстрактним, дефолтним та статичним методами
interface Interface2 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Це дефолтний метод.");
    }

    static void staticMethod() {
        System.out.println("Це статичний метод.");
    }
}