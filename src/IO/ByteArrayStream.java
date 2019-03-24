package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by yang0632 on 2019/3/9.
 */
public class ByteArrayStream {
    public static void main(String[] args) {
        //数据源
        ByteArrayInputStream bis = new ByteArrayInputStream("ABCD".getBytes());
        //数据目的
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int by = 0;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        System.out.println();
    }
}
