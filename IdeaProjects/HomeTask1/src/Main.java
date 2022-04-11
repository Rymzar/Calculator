public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        /*Возникает ошибка типа "Exception in thread "main" java.lang.ArithmeticException"
        в следствии того, что возможно происходит деление на ноль.
        Для решение данной проблемы необходимо исключить возможность деления на ноль*/
        calc.println.accept(c);
    }
}
