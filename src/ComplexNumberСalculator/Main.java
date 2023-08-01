package ComplexNumberСalculator;
// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// Соблюдать принципы SOLID, паттерны проектирования.
// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws SecurityException, IOException {
        iCalculable calculator = new Calculator("");

        // Создаем  newCalcLog, присваиваем CalcDecorator , в который передаем старый калькулятор и myLogger
        iCalculable newCalcLog = new CalcDecorator(calculator, new myLogger("log.txt"));

        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}
