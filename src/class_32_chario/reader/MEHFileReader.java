package class_32_chario.reader;


import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
/**
 * 
 * 马二欢重构的类  可以制定FileReader的编码
 * MEHFileReader</br>
 * 创建人:MaErhuan </br>
 * 时间：2016年5月29日-下午4:42:38 </br>
 * @version 1.0.0
 *
 */


public class MEHFileReader extends InputStreamReader {

   /*构造函数*/
    public MEHFileReader(String fileName) throws FileNotFoundException {
        super(new FileInputStream(fileName));
    }
    /*指定编码的*/
    public MEHFileReader(String fileName,String charset) throws FileNotFoundException, UnsupportedEncodingException {
    	super(new FileInputStream(fileName),charset);
    }
    /*构造函数*/
    public MEHFileReader(File file) throws FileNotFoundException {
        super(new FileInputStream(file));
    }
    /*指定编码的*/
    public MEHFileReader(File fileName,String charset) throws FileNotFoundException, UnsupportedEncodingException {
    	super(new FileInputStream(fileName),charset);
    }
    public MEHFileReader(FileDescriptor fd) {
        super(new FileInputStream(fd));
    }

}

