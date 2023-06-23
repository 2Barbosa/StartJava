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
        double deposit = 300000;
        double interestRate = 0;
        double interest = 0;
        double totalAmount = 0;
        if (deposit < 100000) { 
            interestRate = 0.05; 
        } else if (deposit >= 100000 && deposit <= 300000) { 
            interestRate = 0.07; 
        } else if (deposit > 300000) { 
            interestRate = 0.1; 
        } 
        interest = deposit * interestRate; // вычисление процента 
        totalAmount = deposit + interest; // вычисление итоговой суммы 
        System.out.println("Сумма вклада: " + deposit + " руб."); 
        System.out.println("Начисленный %: " + interest + " руб."); 
        System.out.println("Итоговая сумма с %: " + totalAmount + " руб.");

        System.out.println("7. Определение оценки по предметам");
        double history = 59;
        double programming = 91;
        int history_mark = (history > 60) ? ((history > 73) ? 4 : 3) : 2;
        int programming_mark = (programming > 60) ? ((programming > 73) ? 4 : 3) : 2;
        System.out.println("Оценка по предмету \"История\": " + history_mark);
        System.out.println("Оценка по предмету \"Программирование\": " + programming_mark);
        // вычисление средней оценки
        double simply_mark = (history_mark + programming_mark) / 2.0;
        System.out.println("Средний балл оценок по предметам: " + simply_mark);
        // вычисление среднего процента по предметам
        double symply_interest = (history + programming) / 2.0;
        System.out.println("Средний % по предметам: " + symply_interest);
        }

        System.out.println("8 Расчет прибыли за год");
        int rent = 5_000;
        int sales = 13_000;
        int costPrice = 9_000;
        int months = 12;
        if((sales - ((rent + costPrice)) * months) > 0) {
            System.out.println("Прибыль за год " + (sales - (rent + costPrice)) * months + "руб.");
        } else { 
            System.out.println("Прибыли нет"); 
        }
    }





















