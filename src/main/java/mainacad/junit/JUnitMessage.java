package mainacad.junit;

public class JUnitMessage {


    public String message;

    public JUnitMessage(String message) { //Создание параметризованного конструктора с инициализацией поля
        this.message = message;
    }

    public void printMessage() {      //создание метода для математической операции.
        System.out.println(message);
        int divide = 1 / 0;             //генерируем исключение: на 0 делить нельзя
    }

    public String printHiMessage() {   //создание другого метода для печати сообщения.
        message = "Привет!" + message; //формируем (создаем) новую строку для печати сообщения.
        System.out.println(message);
        return message;
    }
}
