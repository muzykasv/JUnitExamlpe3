package mainacad.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SuiteTest1 {

    public String message = "Саша";

    JUnitMessage junitMessage = new JUnitMessage(message);

    @Test(expected = ArithmeticException.class) //проверяем, генерирует ли код исключения или нет
    public void testJUnitMessage() {            /*Использование аннотации @Test для создания нашего теста.
                                                 Когда вы выполните вышеупомянутый метод классов, он вызовет
                                                 математическую операцию. Здесь ожидается арифметическое исключение,
                                                 поэтому вы перечисляете его как параметр в @Test.*/
        System.out.println("Сообщение Junit печатается");
        junitMessage.printMessage();           //вызов метода printMessage () JUnitMessage.java
    }

    @Test
    public void testJUnitHiMessage() {         //создание другого метода для печати сообщения Привет!
        message = "Привет!" + message;
        System.out.println("Привет, сообщение Junit печатается");
        assertEquals (message,junitMessage.printHiMessage());
        System.out.println("Suite Test 2 успешно. " + message);
    }
}

