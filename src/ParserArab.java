public class ParserArab {
    String lineClass3;

    String getParserArab() {

        String[] str = lineClass3.split(" ");

        String s1 = str[0];
        String s2 = str[1];
        String s3 = str[2];
        String c1;

        int a = 0;
        int b = 0;
        int c = 0;

        try {
            a = Integer.parseInt(s1.trim());
        }
        catch (NumberFormatException nfe) {
            System.err.println("Не правильный ввод: первой должна быть цифра");
            System.exit(0);
        }

        try {
            b = Integer.parseInt(s3.trim());
        }
        catch (NumberFormatException nfe) {
            System.err.println("Не правильный ввод: если 1-ая цифра арабская, 2-ая тоже арабская!");
            System.exit(0);
        }

        if (a > 0 && a < 11 && b > 0 && b < 11) {
            if (s2.equals("+")) {
                c = a + b;
            }
            else if (s2.equals("-")) {
                c = a - b;
            }
            else if (s2.equals("/")) {
                c = a / b;
                int c2 = a % b;
                if (c == 0 || c2 != 0) {
                    System.err.println("Результат не целое число");
                    System.exit(0);
                }
            }
            else if (s2.equals("*")) {
                c = a * b;
            }
            else {
                System.err.println("Неправильный 2-ой элемент:");
                System.err.println(" знак арифметической операции - только +, -, /, * ");
                System.exit(0);
            }
        }
        else {
            System.err.println("На вход числа только от 1 до 10 включительно!");
            System.exit(0);
        }

        c1 = Integer.toString(c);
        return c1;
    }
}
