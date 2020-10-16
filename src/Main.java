import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию");
        String scanLine = scan.nextLine();
        scanLine = scanLine.trim();

        ParserLine pars = new ParserLine();
        pars.Line = scanLine;

        pars.getParserLine();

        ParserChar charline = pars.returnParserChar();
        String getline = charline.getParserChar();

        if (getline.equals("I") || getline.equals("V") || getline.equals("X")) {
            ParserRoman rchar = charline.returnParserRoman();
            rchar.getParserRoman();

            ResultRoman rnumb = rchar.returnResultRoman();
            String result = rnumb.getResultRoman();
            System.out.println(result);
        }

        else if (getline.charAt(0) > '0' && getline.charAt(0) <= '9') {
            ParserArab anumb = charline.returnParserArab();
            String result2 = anumb.getParserArab();
            System.out.println(result2);

        }
        else {
            System.err.println("Не правильная строка");
            System.exit(0);
        }
    }
}
