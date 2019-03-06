package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yang0632 on 2019/3/3.
 */
public class CopyText {
    //文件复制
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("sysdemo_copy,txt");
            fr = new FileReader("sysdemo.java");

            char[] buf = new char[1024];

            int len = 0;
            while ((len=fr.read(buf))!=-1){
                fw.write(buf,0,len); //把数组中的数据写入流
            }
        }
        catch (IOException e){
            throw new RuntimeException("读写失败");
        }
        finally {
            if(fr != null){
                try {
                    fr.close();
                }catch (IOException e){

                }
                try {
                    fw.close();
                }catch (IOException e){

                }
            }
        }
    }
}
