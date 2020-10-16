public class ParserRoman {
    String lineClass4;
    String c1;

    String getParserRoman() {

        String[] str = lineClass4.split(" ");

        String s1 = str[0];
        String s2 = str[1];
        String s3 = str[2];

        int a = 0;
        int b = 0;

        switch (s1) {
            case "I":
                a = 1;
                break;
            case "II":
                a = 2;
                break;
            case "III":
                a = 3;
                break;
            case "IV":
                a = 4;
                break;
            case "V":
                a = 5;
                break;
            case "VI":
                a = 6;
                break;
            case "VII":
                a = 7;
                break;
            case "VIII":
                a = 8;
                break;
            case "IX":
                a = 9;
                break;
            case "X":
                a = 10;
                break;
            default:
                System.err.println("Неверные данные на ввод");
                System.exit(0);
        }

        switch (s3) {
            case "I":
                b = 1;
                break;
            case "II":
                b = 2;
                break;
            case "III":
                b = 3;
                break;
            case "IV":
                b = 4;
                break;
            case "V":
                b = 5;
                break;
            case "VI":
                b = 6;
                break;
            case "VII":
                b = 7;
                break;
            case "VIII":
                b = 8;
                break;
            case "IX":
                b = 9;
                break;
            case "X":
                b = 10;
                break;
            default:
                System.err.println("Неверные данные на ввод, если 1-ая цифра римская, 2-ая тоже должна быть римской");
                System.exit(0);
        }

        int c = 0;

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
            System.err.println("Не правильный знак арифметической операции! Только +, -, /, * ");
            System.exit(0);
        }

        c1 = Integer.toString(c);
        return c1;

    }

    ResultRoman returnResultRoman() {
        ResultRoman pars5 = new ResultRoman();
        pars5.lineClass5 = c1;
        return pars5;
    }
}
