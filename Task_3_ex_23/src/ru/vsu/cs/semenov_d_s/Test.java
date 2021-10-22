package ru.vsu.cs.semenov_d_s;

import static ru.vsu.cs.semenov_d_s.Main.picture;
import static ru.vsu.cs.semenov_d_s.Main.printColor;

public class Test {

    public static boolean makeTest() {
        if (picture.getColor(3,4) != SimpleColor.YELLOW){
            return false;
        } else if (picture.getColor(0,-2) != SimpleColor.GRAY){
            return false;
        } else if (picture.getColor(-1.5,3.5) != SimpleColor.ORANGE){
            return false;
        } else if (picture.getColor(-4,5) != SimpleColor.BLUE){
            return false;
        } else if (picture.getColor(-9,1) != SimpleColor.BLUE){
            return false;
        } else if (picture.getColor(8,-3) != SimpleColor.GRAY){
            return false;
        }
        else {
            return true;
        }
    }

    public static void printTest(){
        printColor(3,4);
        printColor(0,-2);
        printColor(-1.5, 3.5);
        printColor(-4, 5);
        printColor(-9, 1);
        printColor(8,-3);
    }

}
