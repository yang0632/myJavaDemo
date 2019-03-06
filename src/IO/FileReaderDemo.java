package IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yang0632 on 2019/3/3.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        //创建文件读取流对象,和指定文件相关联
        //保证文件,存在,否则发生异常FileNotFoundException
        FileReader fr = new FileReader("demo.txt");

        //定义一个数组,存储读到的字符
        char[] buf = new char[1024];
        int len = 0;

        //read方法,读到的内容放数组里,返回的是读到的字符个数
        while ((len = fr.read(buf))!= -1){
            System.out.print(new String(buf,0,len));
        }

        fr.close();

    }
}
