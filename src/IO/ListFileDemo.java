package IO;

import java.io.File;

/**
 * Created by yang0632 on 2019/3/9.
 */

//递归列出目录下所有内容
public class ListFileDemo {
    public static void main(String[] args){
        File dir = new File("d:\\java1223");
        showDir(dir);
    }
    public static void showDir(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (int x=0; x<files.length; x++){
            if(files[x].isDirectory())
                showDir(files[x]);
            else
                System.out.println(files[x]);
        }
    }
}
