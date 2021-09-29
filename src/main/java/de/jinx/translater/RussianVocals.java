package de.jinx.translater;

import java.util.ArrayList;
import java.util.HashMap;

public class RussianVocals {
                                //Vocal,Russian Key
    public static final HashMap<String,Character> RUSSIAN_VOCALS = new HashMap();

    public static void populateVocals(){
        RUSSIAN_VOCALS.put("a",'a');
        RUSSIAN_VOCALS.put("b",'б');
        RUSSIAN_VOCALS.put("v",'в');
        RUSSIAN_VOCALS.put("g",'г');
        RUSSIAN_VOCALS.put("d",'д');
        RUSSIAN_VOCALS.put("ye",'е');
        RUSSIAN_VOCALS.put("yo",'ё');
        RUSSIAN_VOCALS.put("zh",'ж');
        RUSSIAN_VOCALS.put("z",'з');
        RUSSIAN_VOCALS.put("i",'и');
        RUSSIAN_VOCALS.put("y",'й');
        RUSSIAN_VOCALS.put("k",'к');
        RUSSIAN_VOCALS.put("l",'л');
        RUSSIAN_VOCALS.put("m",'м');
        RUSSIAN_VOCALS.put("n",'н');
        RUSSIAN_VOCALS.put("o",'о');
        RUSSIAN_VOCALS.put("p",'п');
        RUSSIAN_VOCALS.put("r",'р');
        RUSSIAN_VOCALS.put("s",'с');
        RUSSIAN_VOCALS.put("t",'т');
        RUSSIAN_VOCALS.put("oo",'у');
        RUSSIAN_VOCALS.put("f",'ф');
        RUSSIAN_VOCALS.put("kh",'х');
        RUSSIAN_VOCALS.put("ts",'ц');
        RUSSIAN_VOCALS.put("ch",'ч');
        RUSSIAN_VOCALS.put("sh",'ш');
        RUSSIAN_VOCALS.put("sch",'щ');
        RUSSIAN_VOCALS.put("e",'э');
        RUSSIAN_VOCALS.put("yu",'ю');
        RUSSIAN_VOCALS.put("ya",'я');

        RUSSIAN_VOCALS.put("hard",'ъ');
        RUSSIAN_VOCALS.put("soft",'ь');
    }
}
