// Создаем CalcDecorator, и implements iCalculable. Добавляем методы калькулятора. 
// И включаем в него и калькулятор и logger.

package ComplexNumberСalculator;

public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private myLogger logger;

//  Создаем конструктор

    public CalcDecorator(iCalculable oldCalc, myLogger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

// Создаем функционал

    @Override
    public iCalculable sum(String arg) {
        String firstArg = oldCalc.getResult();

        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg,
                arg));
        iCalculable result = oldCalc.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }

    @Override
    public iCalculable multi(String arg) {
        String firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметром %s",
                firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public String getResult() {
        String result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }

    @Override
    public iCalculable divis(String arg) {
        String firstArg = oldCalc.getResult();

        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода divis с параметром %s", firstArg,
                arg));
        iCalculable result = oldCalc.divis(arg);
        logger.log(String.format("Вызова метода divis произошел"));

        return result;
    }

}