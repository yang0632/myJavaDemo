package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yang0632 on 2019/3/3.
 */
public class FileStream {
    public static void readFile() throws IOException{
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf)) != -1){
            System.out.print(new String(buf, 0, len));
        }
        fis.close();
    }

    public static void writeFile() throws IOException{
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write("abcde".getBytes());  //写入字节
        fos.close();
    }


}
