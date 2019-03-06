package IO;

import java.io.*;

/**
 * Created by yang0632 on 2019/3/3.
 */

public class CopyTextByBuf {
    public static void main(String[] args) {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {
            bufr = new BufferedReader(new FileReader("sysdemo.java"));
            bufw = new BufferedWriter(new FileWriter("sysdemo_copy.txt"));
            String line = null;

            while ((line=bufr.readLine())!=null){
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        }
        catch (IOException e){
            throw new RuntimeException("读写失败");
        }
        finally {
                try {
                    if(bufr!=null)
                        bufr.close();
                }catch (IOException e){
                    throw new RuntimeException("读取关闭失败");

                }
                try {
                    if(bufw!=null)
                        bufw.close();
                }catch (IOException e){
                    throw new RuntimeException("写入关闭失败");
                }
            }
        }
    }

