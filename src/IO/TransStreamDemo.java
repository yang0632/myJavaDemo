package IO;

import java.io.*;

/**
 * Created by yang0632 on 2019/3/7.
 */
public class TransStreamDemo {
    public static void main(String[] args) throws IOException{
        //获取键盘录入对象
        //InputStream in = System.in;
        //将字节流对象转成字符流对象,使用转换流 InputStreamReader
        //InputStreamReader isr = new InputStreamReader(in);
        //使用缓冲区提高效率
        //BufferedReader bufr = new BufferedReader(isr);

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in)); //键盘录入最常见写法

        //OutputStream out = System.out;
        //OutputStreamWriter osw = new OutputStreamWriter(out);
        //BufferedWriter bufw = new BufferedWriter(osw); //使用缓冲区可以用newline方法

        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line = bufr.readLine())!=null){
            if("over".equals(line)) //自定义结束录入标志
                break;
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush(); //一定要flush
        }
        bufr.close();
    }

}
