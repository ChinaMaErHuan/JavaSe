package class_38_toolutil;
import java.io.FileInputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TextXMLToHTML {

	public static void covert() {
		try {
			FileInputStream fis = new FileInputStream("F:/person.xml");
			Source source = new StreamSource(fis);
			FileInputStream inputStream = new FileInputStream("F:/person.xls");
			Source source2 = new StreamSource(inputStream);
			Result result = new StreamResult(System.out);
			Transformer transformer = TransformerFactory.newInstance().newTransformer(source2);
			transformer.transform(source, result);
			inputStream.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		covert();	
		
		
	}
}
