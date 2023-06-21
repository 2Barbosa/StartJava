
public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte numCore = 7;
        short modelNum = 520;
        int numBit = 64;
        long numRam = 8000L;
        float monitorSize = 15.6f;
        double numGhz = 2.80;
        char symbol9 = 'i';
        boolean booleantrue = true;
        System.out.println("LENOVO-Y " + modelNum + " " + monitorSize);
        System.out.println("Количество ядер " + symbol9 + numCore);
        System.out.println("Частота процессора " + numGhz + "GHz");
        System.out.println("Оперативная память " + numRam + "МБ");
        System.out.println("Тип системы " + numBit + "Bit");

        System.out.println("2. Расчет стоимости товара со скидкой.");
        //цена ручки 100 рб, книга 200 рб, На них действует скидка 11%
        byte sumDiscount = 11;
        byte penPrice = 100;
        short bookPrice = 200;
        int sumAll =penPrice + bookPrice;
        System.out.println("Общая стоимость без скидки:" + sumAll + " руб.");
        System.out.println("Сумма скидки:" + sumAll / 100 * sumDiscount + "руб.");
        System.out.print("Общая стоимость товаров со скидкой:");
        System.out.println(sumAll - sumAll / 100 * sumDiscount + "руб.");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v   a");
        System.out.println("    J   a a  v   v   a a");
        System.out.println(" J  J  aaaaa  v v   aaaaa");
        System.out.println("  JJ  a     a  v   a     a");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32_767;
        int numInt = 2_147_483_647;
        long numLong = 9_223_372_036_854_775_807L;
        System.out.println(byteMax + " " + shortMax + " " + numInt + " " + numLong);
        System.out.println(++byteMax + " " + ++shortMax + " " + ++numInt + " " + ++numLong);
        System.out.println(--byteMax + " " + --shortMax + " " + --numInt + " " + --numLong);

        System.out.println("5. Перестановка значений переменных");
        System.out.println("С третьей переменной");
        int a = 2, b = 5;
        System.out.println("a-" + a + ", b-" + b);
        int tmp = b;
        b = a;
        a = tmp;
        System.out.println("a-" + a + ", b-" + b);
        System.out.println("Aрифметический, сложение и вычитание ");
        System.out.println("a-" + a + ", b-" + b);
        a = a + b - (b = a);
        System.out.println("a-" + a + ", b-" + b);
        System.out.println("Aрифметический, умножение деление ");
        System.out.println("a-" + a + ", b-" + b);
        a = a * b / (b = a);
        System.out.println("a-" + a + ", b-" + b);
        System.out.println("Aрифметический, вычитание и сложение ");
        System.out.println("a-" + a + ", b-" + b);
        a -= b;
        b += a;
        a -= b;
        System.out.println("a-" + a + ", b-" + b);
        System.out.println("Побитовый");
        System.out.println("a-" + a + ", b-" + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a-" + a + ", b-" + b);

        System.out.println("6. Вывод символов и их кодов");
        char numSign = '#';
        char and = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) numSign + "-" + numSign);
        System.out.println((int) and + "-" + and);
        System.out.println((int) at + "-" + at);
        System.out.println((int) caret + "-" + caret);
        System.out.println((int) underscore + "-" + underscore);

        System.out.println("7. Вывод в консоль Java талисман.");
        char slash = '/';
        char backSlash = '\\';
        char underCore = '_';
        char leftParenthes = '(';
        char rightParenthes = ')';
        System.out.println("        " + slash + backSlash);
        System.out.println("       " + slash + "  " + backSlash);
        System.out.println("      " + slash + underCore + leftParenthes + " " +
                rightParenthes + backSlash);
        System.out.println("     " + slash + "      " + backSlash);
        System.out.println("    " + slash + underCore + underCore + underCore +
                underCore + slash + backSlash + underCore + underCore + backSlash);

        System.out.println("8. Вывод количества сотен, десятков и единиц числа ");
        byte num = 123;
        int hundreds = (num / 100);
        int dec = (num % 100) / 10;
        int ones = (num % 10);
        System.out.println("Сотня - " + hundreds);
        System.out.println("Десятки - " + dec);
        System.out.println("Единицы - " + ones);

        System.out.println("9. Вывод времени");
        int time = 86399;
        int hours = (time / 60) / 60;
        int minuts = (time / 60) % 60;
        int seconds = minuts % 60;
        System.out.println(hours + ":" + minuts + ":" + seconds);
    }
}





