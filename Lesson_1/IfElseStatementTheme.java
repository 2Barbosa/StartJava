public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        if(age > 20) {
            System.out.println("Вам можно");
        } else {
            System.out.println("Вам нельзя! Вы ещё не достигли 20 лет");
        }
        char sex = 11;
        if (sex != 11) {
            System.out.println(sex + "Вы женщина");
        } else {
            System.out.println(sex + " Вы мужчина");
        }
        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Вы низкого роста или ваш рост стандартный");
        } else {
            System.out.println("Вы высокий!");
        }
        String name = "Иван";
        char capitalLetter = name.charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы M");
        } else if (capitalLetter =='I') {
            System.out.println("Ваше имя начинается с буквы M");
        } else {
            System.out.println("Выше имя начинается с любой другой буквы, кроме M и I.");
        } 

        System.out.println("2. Поиск max и min числа");
        int a = 12, b = 34;
        if(a < b && a != b) {
            System.out.println("max " + b + " min " + a);
            System.out.println("числа не равны");
        } else {
            System.out.println("max " + a + "min " + b);
        } 

        System.out.println("3. Проверка числа");
        int sumInt = 100;
        if(sumInt != 0 && sumInt % 2 == 0 && sumInt > 0) {
            System.out.println("Число " + sumInt + " не является нулем," + 
                "четное, не является отрицательным");
        } else {
            System.out.println("Число может быть нулем, нечетным и отрицательным");
        }  

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int singleDigit1 = num1 % 10;
        int singleDigit2 = num2 % 10;
        if (singleDigit1 == singleDigit2) {
            System.out.println("Разряд единиц у чисел равен, " + singleDigit1);
        } else {
            System.out.println("Разряд единиц у чисел не равен");
        }
        if (num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Разряд десятков " + num1 / 10 % 10 );
        } else {
            System.out.println("Разряд десятков у чисел не равен");
        }
        if(num1 / 100 == num2 / 100) {
            System.out.println("Разряд сотен у чисел равен");
        } else {
            System.out.println("Разряд сотен у чисел не равен");
        }

        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - число");
        } else {
            System.out.println(symbol + " - не буква и не число");
        } 

        System.out.println("6. Подсчет суммы вклада");
        double deposit = 301000;
        double interestRate = 0;
        if (deposit < 100000)  
            interestRate = 0.05; 
        else if (deposit >= 100000 && deposit <= 300000)  
            interestRate = 0.07; 
        else if (deposit > 300000)  
            interestRate = 0.1; 
        double totalAmount = 0;
        double interest = 0;
        interest = deposit * interestRate;
        totalAmount = deposit + interest;
        System.out.println("Сумма вклада: " + deposit + " руб."); 
        System.out.println("Сумма начисленного %: " + interest + " руб."); 
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");
               
        System.out.println("7. Определение оценки по предметам");
        double historyPercent = 59;
        double programmingPercent = 91;
        int historyMark = 0;
        if (historyPercent > 91)
            historyMark = 5;
        else if (historyPercent > 73)
            historyMark = 4;
        else if (historyPercent > 60)
            historyMark = 3;
        else if (historyPercent <= 60)
            historyMark = 2;
        System.out.println("История - " + historyMark);
        int programmingMark = 0;
        if (programmingPercent > 91)
            programmingMark = 5;
        else if (programmingPercent > 73)
            programmingMark = 4;
        else if (programmingPercent > 60)
            programmingMark = 3;
        else if (programmingPercent <= 60)
            programmingMark = 2;
        System.out.println("Программирование - " + programmingMark);
        System.out.println("Средний балл оценки по предметам - " + (historyMark + programmingMark) / 2);
        System.out.println("Средний % по предметам - " + (historyPercent + programmingPercent) / 2);
        
        System.out.println("8 Расчет прибыли за год");
        int rent = 5_000;
        int sales = 13_000;
        int costPrice = 9_000;
        int months = 12;
        int profit = ((sales - (rent + costPrice)) * months);
        if (profit > 0) {
            System.out.println("Прибыль за год " + profit + "руб.");
        } else {
            System.out.println("Прибыль за год " + profit + "руб.");
        }
    }
}
    























