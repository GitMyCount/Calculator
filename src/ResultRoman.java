public class ResultRoman {
    String lineClass5;
    int i = 0;
    String numRom1;
    String numRom2;
    String numRom3;

    String getResultRoman () {

        i = Integer. parseInt(lineClass5);
        if (i <= 0) {
            System.err.println("Не возможный результат, арабские только > 0! ");
            System.exit(0);
        }

        int a = i / 10;
        int b = i % 10;

        if (a != 0) {
            switch (a) {
                case 1:
                    numRom1 = "X";
                    break;
                case 2:
                    numRom1 = "XX";
                    break;
                case 3:
                    numRom1 = "XXX";
                    break;
                case 4:
                    numRom1 = "XL";
                    break;
                case 5:
                    numRom1 = "L";
                    break;
                case 6:
                    numRom1 = "LX";
                    break;
                case 7:
                    numRom1 = "LXX";
                    break;
                case 8:
                    numRom1 = "LXXX";
                    break;
                case 9:
                    numRom1 = "XC";
                    break;
                case 10:
                    numRom1 = "C";
                    break;
                default:
                    System.err.println("Неверные данные на ввод");
                    System.exit(0);
            }
        }

        if (b != 0) {
            switch (b) {
                case 1:
                    numRom2 = "I";
                    break;
                case 2:
                    numRom2 = "II";
                    break;
                case 3:
                    numRom2 = "III";
                    break;
                case 4:
                    numRom2 = "IV";
                    break;
                case 5:
                    numRom2 = "V";
                    break;
                case 6:
                    numRom2 = "VI";
                    break;
                case 7:
                    numRom2 = "VII";
                    break;
                case 8:
                    numRom2 = "VIII";
                    break;
                case 9:
                    numRom2 = "IX";
                    break;
                default:
                    System.err.println("Неверные данные на ввод");
                    System.exit(0);
            }
        }
        if (a != 0 && b != 0) {
            numRom3 = numRom1 + numRom2;
        }
        else if (b != 0) {
            numRom3 = numRom2;
        }
        else if (a != 0) {
            numRom3 = numRom1;
        }

        return numRom3;
    }
}
