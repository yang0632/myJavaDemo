package IO;

import java.io.File;

/**
 * Created by yang0632 on 2019/3/3.
 */
public class FileDemo {
    public static void consMethod(){
        //将封装成file对象。可以是已有的或者未出现的文件或文件夹
        File f = new File("a.txt");
        File f1 = new File("c:\\abc","b.txt");
    }
}
