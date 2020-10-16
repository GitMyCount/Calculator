public class ParserChar {
    String lineClass2;
    String s;

    String getParserChar () {
        s = Character.toString(lineClass2.charAt(0));
        return s;
    }
    ParserArab returnParserArab () {
        ParserArab pars3 = new ParserArab();
        pars3.lineClass3 = lineClass2 + " 1";
        return pars3;
    }
    ParserRoman returnParserRoman () {
        ParserRoman pars4 = new ParserRoman();
        pars4.lineClass4 = lineClass2 + " I";
        return pars4;
    }
}
