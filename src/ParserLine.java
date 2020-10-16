public class ParserLine {
    String Line;
    String s = "";
    String s1 = "";

    String getParserLine () {

        Line = Line.trim();
        char charLine = Line.charAt(0);

        if ((charLine > '0' && charLine <= '9') || charLine =='I' || charLine == 'V' || charLine == 'X') {

            char oneChar = Line.charAt(0);
            s += oneChar;
            for (int i = 1; i < Line.length(); i++) {
                char a = Line.charAt(i - 1);
                char b = Line.charAt(i);
                if ((a > '0' && a <= '9') || a == 'I' || a == 'V' || a == 'X') {
                    if ((b >= '0' && b <= '9') || b == 'I' || b == 'V' || b == 'X') {
                        s += b;
                    } else if (b == ' ') {
                        s += b;
                    } else {
                        s += " " + b;
                    }
                }
                else if (a == ' ') {
                    if ((b > '0' && b <= '9') || b == 'I' || b == 'V' || b == 'X') {
                        s += b;
                    } else if (b == ' ') {
                        continue;
                    }
                    else {
                        s += b;
                    }
                }
                else {
                    if ((b > '0' && b <= '9') || b == 'I' || b == 'V' || b == 'X') {
                        s += " " + b;
                    } else if (b == ' ') {
                        s += b;
                    } else {
                        s += " " + b;
                    }
                }
            }
            String[] str1 = s.split(" ");
            if (str1.length != 3) {
                System.err.println("Не верное кол-во символов");
//                System.out.println(str1.length);
                System.exit(0);
            }
            else{
                s1 = Integer.toString(str1.length);
            }
        }
        else {
            s1 = "Не верный 1-ый символ";
            System.err.println("Не верный 1-ый символ");
            System.exit(0);
        }
        return s1;
    }

    ParserChar returnParserChar() {
        ParserChar Pars2 = new ParserChar();
        Pars2.lineClass2 = s;
        return Pars2;
    }

}
