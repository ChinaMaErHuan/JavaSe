package class_32_chario.reader;


import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
/**
 * 
 * ������ع�����  �����ƶ�FileReader�ı���
 * MEHFileReader</br>
 * ������:MaErhuan </br>
 * ʱ�䣺2016��5��29��-����4:42:38 </br>
 * @version 1.0.0
 *
 */


public class MEHFileReader extends InputStreamReader {

   /*���캯��*/
    public MEHFileReader(String fileName) throws FileNotFoundException {
        super(new FileInputStream(fileName));
    }
    /*ָ�������*/
    public MEHFileReader(String fileName,String charset) throws FileNotFoundException, UnsupportedEncodingException {
    	super(new FileInputStream(fileName),charset);
    }
    /*���캯��*/
    public MEHFileReader(File file) throws FileNotFoundException {
        super(new FileInputStream(file));
    }
    /*ָ�������*/
    public MEHFileReader(File fileName,String charset) throws FileNotFoundException, UnsupportedEncodingException {
    	super(new FileInputStream(fileName),charset);
    }
    public MEHFileReader(FileDescriptor fd) {
        super(new FileInputStream(fd));
    }

}

