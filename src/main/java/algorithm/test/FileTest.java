package algorithm.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.Lock;

/**
 * @Author: yxw
 * @Date: 2018/9/13 14:29
 * @Description:
 * @Version 1.0
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        String path = "D:\\yangxiaowei\\yxw.txt";
        File file = new File(path);
        FileOutputStream fos=new FileOutputStream(file,true);
        //定义一个字节缓冲区,该缓冲区的大小根据需要来定义
        String font="asdasdasdasd";
        byte[] buffer=new byte[1024];
        fos.write(font.getBytes());
        //关闭此文件输出流并释放与此流有关的所有系统资源。此文件输出流不能再用于写入字节。 如果此流有一个与之关联的通道，则关闭该通道。
        fos.close();
        //关闭此文件输入流并释放与此流有关的所有系统资源。


ThreadLocal threadLocal;
    }

}
