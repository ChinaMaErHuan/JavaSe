package toolsUtils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 
 * 日期工具类
 * 创建人:maerhuan 
 * 时间：2016年4月1日-下午10:08:25 
 * @version 1.0.0
 *
 */
public class MehDateUtil {
	/**
	 * 
	 * 判断一年是否是闰年
	 * toolsUntil 
	 * 方法名：isLeapYear
	 * 创建人：maerhuan 
	 * 时间：2016年4月1日-下午10:11:21 
	 * @param year
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean isLeapYear(int year){
		return (year%4==0 && year%100!=0)  ||  year%400==0;
	}
	/**
	 * 
	 * 获取一年中某月的天数
	 * toolsUntil 
	 * 方法名：getMonthDay
	 * 创建人：maerhuan 
	 * 时间：2016年4月1日-下午10:14:16 
	 * @param year
	 * @param month
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	public static int getMonthDay(int year,int month){
		int result = 31;	
		switch (month) {
				case 4:
				case 6:
				case 9:
				case 11:
					result = 30;
				break;
			case 2:
				result = MehDateUtil.isLeapYear(year)?29:28;
				break;
			default:
				result = 31;
				break;
		}
		return result;	
	}

	/*
	 * pattern:
	 * 理论上讲日期格式表达式包含全部26个英文字母的大小写，不过它们中的一些字母只是被预留了，并没有确切的含义。目前有效的字母及它们所代表的含义如下：
	 * 中文解释含义： G：年代标识，表示是公元前还是公元后 y：年份 M：月份 d：日 h：小时，从1到12，分上下午 H：小时，从0到23 m：分钟
	 * s：秒 S：毫秒 E：一周中的第几天，对应星期几，第一天为星期日，于此类推 z：时区 D：一年中的第几天
	 * F：这一天所对应的星期几在该月中是第几次出现 w：一年中的第几个星期 W：一个月中的第几个星期 a：上午/下午标识 k：小时，从1到24
	 * K：小时，从0到11，区分上下午
	 * 在日期格式表达式中出现的所有字母，在进行日期格式化操作后，都将被其所代表的含义对应的属性值所替换，并且对某些字母来说
	 * ，重复次数的不同，格式化后的结果也会有所不同。请看下面的例子：
	 */
	/**
	 * 
	 * 格式化日期 字符串转日期
	 * toolsUntils 
	 * 方法名：stringToDate
	 * 创建人：maerhuan 
	 * 时间：2016年4月2日-下午5:14:20 
	 * @param dateString
	 * @param pattern
	 * @return
	 * @throws ParseException Date
	 * @exception 
	 * @since  1.0.0
	 */
	public static  Date stringToDate(String dateString,String pattern){
		
		try {
			return new SimpleDateFormat(pattern).parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	/**
	 * 
	 * 日期转字符串
	 * toolsUntils 
	 * 方法名：dateToString
	 * 创建人：maerhuan 
	 * 时间：2016年4月2日-下午5:23:24 
	 * @param date
	 * @param pattern
	 * @return
	 * @throws ParseException String
	 * @exception 
	 * @since  1.0.0
	 */
	public static String dateToString(Date date,String pattern) {
		if(date!=null){
			return new SimpleDateFormat(pattern).format(date);
			
		}else{
			return "";
		}
	}
	/**
	 * 
	 * getTimeFormat</br>
	 * com.tz.tld </br>
	 * 方法名：getTimeFormat </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年9月17日-下午3:40:18 </br>
	 * @param startTime
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String getTimeFormat(Date startTime){
		try{
			long startTimeMills = startTime.getTime();
			long endTimeMills = System.currentTimeMillis();
			long diff = (endTimeMills - startTimeMills)/1000;//秒
			long day_diff  = (long) Math.floor(diff/86400);//天
			StringBuffer buffer = new StringBuffer();
			if(day_diff<0){
				return "[error],时间越界...";
			}else{
				if(day_diff==0 && diff<60){
					if(diff==0)diff=1;
					buffer.append(diff+"秒前");
				}else if(day_diff==0 && diff<120){
					buffer.append("1 分钟前");
				}else if(day_diff==0 && diff<3600){
					buffer.append(Math.round(Math.floor(diff/60))+"分钟前");
				}else if(day_diff==0 && diff<7200){
					buffer.append("1小时前");
				}else if(day_diff==0 && diff<86400){
					buffer.append(Math.round(Math.floor(diff/3600))+"小时前");
				}else if(day_diff==1){
					buffer.append("1天前");
				}else if(day_diff<7){
					buffer.append(day_diff+"天前");
				}else if(day_diff <30){
					buffer.append(Math.round(Math.ceil( day_diff / 7 )) + " 星期前");
				}else if(day_diff >=30 && day_diff<=179 ){
					buffer.append(Math.round(Math.ceil( day_diff / 30 )) + "月前");
				}else if(day_diff >=180 && day_diff<365){
					buffer.append("半年前");
				}else if(day_diff>=365){
					buffer.append(Math.round(Math.ceil( day_diff /30/12))+"年前");
				}
			}
			return buffer.toString();
		}catch(Exception ex){
			return "";
		}
	}
	/**
	 * 
	 * 方法名：getTimeFormat<BR>
	 * 创建人：meh <BR>
	 * 时间：2014年11月11日-下午10:28:21 <BR>
	 * @param startTime
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String getTimeFormat(String startTime){
		return getTimeFormat(stringToDate(startTime, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
		// System.out.println(isLeapYear(2016));
		// System.out.println(getMonthDay(2016, 5));
		// Date date = new Date();
		// String pattern = "yyyy/MM/dd/a/HH:mm:ss:SS E";
		// pattern = "y/MM/dd/hh";
		// SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		// System.out.println(dateFormat.format(date));

		 String string = "2016/2/5/5/25";
		 
		 System.out.println(stringToDate(string,"yyyy/MM/dd/hh/mm"));

		 Date date = new Date();
		 
		 System.out.println(dateToString(date,"yyyy/MM/dd/hh/mm"));
		
		 
		
		
		
		
	}
}
