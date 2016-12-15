package class_38_toolutil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;  
  
public class XML2HTML {  
  
    /** 
     * @param args 
     */  
    public static void Transform(String xmlFileName, String xslFileName,  
            String htmlFileName) {  
        try {  
            TransformerFactory tFac = TransformerFactory.newInstance();  
            Source xslSource = new StreamSource(xslFileName);  
            Transformer t = tFac.newTransformer(xslSource);  
            File xmlFile = new File(xmlFileName);  
            File htmlFile = new File(htmlFileName);  
            Source source = new StreamSource(xmlFile);  
            Result result = new StreamResult(htmlFile);  
            System.out.println(result.toString());  
            t.transform(source, result);  
        } catch (TransformerConfigurationException e) {  
            e.printStackTrace();  
        } catch (TransformerException e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static <T> void main(String[] args) {  
        String xmlFileName = "f:\\person.xml";  
        String xslFileName = "f:\\person.xls";  
        String htmlFileName = "f:\\person.html";  
        Transform(xmlFileName, xslFileName, htmlFileName);  
        
//        List<Integer> integers = new ArrayList<Integer>();
//        integers.add(1);
//        integers.add(58);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
////        Collections.sort(integers, (a,b)->{//jdk1.8
////        	return a-b;
////        });
//        
//        Collections.sort(integers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return 0;
//			}
//		});
//        
//        System.out.println(integers);
        //bean-map  map-bean
        //String StringBuffer StringBuilder
        //日期处理--java.util.Date Calendar
        
        
        //xml解析和读取
        
        
        //国际化
        //数字处理类
        //格式化日期
        //密码处理 
        //邮件发送
        
        
        //正则
  
    }  
  
}  