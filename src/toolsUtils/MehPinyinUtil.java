package toolsUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

import toolsUtils.StringUtils.MehStringUtil;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


public class MehPinyinUtil {
	
	public static String CNToPinyin(String chinese,boolean mark){
		char[] t1 = null;
	    t1=chinese.toCharArray();
	    String[] t2 = new String[t1.length];
	    HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
	    t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
	    t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
	    t3.setVCharType(HanyuPinyinVCharType.WITH_V);
	    String t4="";
	    int t0=t1.length;
	    try {
	      for (int i=0;i<t0;i++)
	      {
	      //判断是否为汉字字符
	         if(java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+"))   
	              {
	              t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);              
	              t4+=t2[0]+(mark?"":" ");
	              }
	          else
	              t4+=java.lang.Character.toString(t1[i]);
	      }
	      return t4;
	    }
	    catch (BadHanyuPinyinOutputFormatCombination e1) {
	      e1.printStackTrace();
	    }
	    return t4;
	}
	
	public static String getYMD(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }
	
	public static String getPinYinHeadChar(String str) {
		String convert = "";
		for (int j = 0; j < str.length(); j++) {
		      char word = str.charAt(j);
		      String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
		      if (pinyinArray != null) {
		      convert += pinyinArray[0].charAt(0);
		      }else {
		      convert += word;
		      }
		}
		return convert;
	}
	
	public static void getpath(){
		System.out.println(MehPinyinUtil.class.getResource("/"));
	}
	
	/**
	 * 随机产生Title
	 * @param title
	 * @return
	 */
	public static String getRandomTitle(String title){
	    String content = getPinYinHeadChar(title).replaceAll("\\|<|>|\\?|\\*|:|/|\\|", "").replaceAll("[^0-9]|[^a-zA-Z]", "");
	    String before = "";
	    String after = "";
	    if(content.length()>5){
	        before = getYMD("hh")+content.substring(0,3)+getYMD("MM");
	        after = getYMD("mm")+content.substring(3,4)+getYMD("yy")+getYMD("ss")+content.substring(4)+getYMD("dd");
	        return before+after+MehStringUtil.getRandomString(5);
	    }else{
	        return  getYMD("yy")+getYMD("hh")+getYMD("mm")+content+getYMD("MMdd")+getYMD("ss")+MehStringUtil.getRandomString(10);
	    }
	}
	
	public static void main(String[] args) {
		String content = "查询人民币及外币的各种类型的储蓄存款在每个银行的存款利率以及起存金额。 操作步骤: “币种”可选择人民币、美元等各个币种;“类型”可选择“活期”、“定期...";
		//String content = "中华人民共和国";
		System.out.println(CNToPinyin(content,true));
		System.out.println(CNToPinyin(content,false));
		System.out.println(getPinYinHeadChar(content));
		
		System.out.println((int)'z');
		
		//有个词库--->输入法-->分词--->zhongguo
		String test = ",sdfsdfsd56465ADFSDF";
		System.out.println(test.replaceAll("[^0-9]|[^a-zA-Z]", ""));
	}

	
}

