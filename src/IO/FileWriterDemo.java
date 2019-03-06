package IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yang0632 on 2019/3/3.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null; //在外面建立引用;在try内初始化
        try {

            //FileWriter对象一被初始化就要明确被操作的文件
            //文件被创建在指定目录下,如果存在同名文件将被覆盖
            fw = new FileWriter("demo.txt");

            //调用write方法,把数据写入到流中
            fw.write("abcde");

            //刷新流对象中缓冲中的数据,将数据刷到目的地
            //fw.flush();

            //关闭流资源,关闭前会刷新一次内部缓冲;
            //和flush区别:flush刷新后流可以继续使用,close刷新后,流关闭
        }catch (IOException e){
            System.out.println(e.toString());
        }
        finally {
            try {
                if(fw != null) //不为空才需要关闭(如果有多个,要一个个关闭)
                    fw.close();
            }catch (IOException e){
                System.out.println(e.toString());
            }

        }

    }
}

