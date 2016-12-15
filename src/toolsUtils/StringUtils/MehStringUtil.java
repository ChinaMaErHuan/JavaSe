package toolsUtils.StringUtils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Encoder;

/**
 * 
 * 
 * StringUtil 创建人:maerhuan 时间：2016年4月5日-下午5:13:36
 * 
 * @version 1.0.0
 * 
 */
public class MehStringUtil {
	
	public static final long ONE_KB = 1024;
	public static final long ONE_MB = ONE_KB * ONE_KB;
	public static final long ONE_GB = ONE_KB * ONE_MB;
	
	/**
	 * 
	 * 统计文件大小</br>
	 * toolsUtils </br>
	 * 方法名：countFileSize </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月27日-下午9:45:42 </br>
	 * @param file
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String countFileSize(File file) {
		return  countFileSize(file.getAbsolutePath());
	}
	/**
	 * 
	 * 统计文件大小</br>
	 * toolsUtils </br>
	 * 方法名：countFileSize </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月27日-下午9:31:10 </br>
	 * @param pathname
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String countFileSize(String pathname) {
		String fileSizeString = "";
		try {
			File file = new File(pathname);
			DecimalFormat df = new DecimalFormat("#.00");
			long fileS = file.length();
			if (fileS < 1024) {
				fileSizeString = fileS+" bytes";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "KB";
			} else if (fileS < 1073741824) {
				fileSizeString = df
						.format(((double) fileS / 1024 / 1024) - 0.01)
						+ "MB";
			} else {
				fileSizeString = df.format((double) fileS / 1024 / 1024 / 1024)
						+ "G";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSizeString;
	}
	
	
	/**
	 * 
	 * 根据File文件的长度统计文件的大小</br>
	 * toolsUtils </br>
	 * 方法名：countFileSize </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月27日-下午9:32:32 </br>
	 * @param fileSize
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String countFileSize(long fileSize) {
		String fileSizeString = "";
		try {
			DecimalFormat df = new DecimalFormat("#.00");
			long fileS = fileSize;
			if (fileS == 0) {
				fileSizeString = "0KB";
			} else if (fileS < 1024) {
				fileSizeString = df.format((double) fileS) + "B";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "KB";
			} else if (fileS < 1073741824) {
				fileSizeString = df
						.format(((double) fileS / 1024 / 1024) - 0.01)
						+ "MB";
			} else {
				fileSizeString = df.format((double) fileS / 1024 / 1024 / 1024)
						+ "G";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSizeString;
	}
	
	/**
	 * 
	 * 根据File文件的长度统计文件的大小</br>
	 * toolsUtils </br>
	 * 方法名：byteCountToDisplaySize </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月27日-下午9:33:07 </br>
	 * @param size
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String byteCountToDisplaySize(long size) {
		String displaySize;
		if (size / ONE_GB > 0) {
			displaySize = String.valueOf(size / ONE_GB) + " G";
		} else if (size / ONE_MB > 0) {
			displaySize = String.valueOf(size / ONE_MB) + " MB";
		} else if (size / ONE_KB > 0) {
			displaySize = String.valueOf(size / ONE_KB) + " KB";
		} else {
			displaySize = String.valueOf(size) + " bytes";
		}
		return displaySize;
	}
	/**
	 * 
	 * 为上传文件自动分配文件名称，避免重复</br> com.tz.util </br> 方法名：generateFileName </br>
	 * 创建人：maerhuan </br> 时间：2016年10月6日-下午6:52:01 </br>
	 * 
	 * @param fileName
	 * @param randomNum
	 * @param dataPattern
	 * @return String </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static String generateFileName(String fileName, int randomNum,
			String dataPattern) {
		// 获得当前时间
		DateFormat format = new SimpleDateFormat(dataPattern);
		// 转换为字符串
		String formatDate = format.format(new Date());
		// 随机生成文件编号
		int random = new Random().nextInt(randomNum);
		// 获得文件后缀名称
		int position = fileName.lastIndexOf(".");
		String extension = fileName.substring(position);
		// 组成一个新的文件名称
		return formatDate + random + extension;
	}
	
	
	
	/**
	 * 
	 * 判断字符串是否为空 toolsUtils 方法名：isEmpty 创建人：maerhuan 时间：2016年4月5日-下午5:20:35
	 * 
	 * @param content
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isEmpty(String content) {
		 return null == content  || content.equals("")
				|| content.matches("\\s*");
		// 先判断是不是空字符串 
	}

	/**
	 * 
	 * 判断字符串不为空 toolsUtils 方法名：isNotEmpty 创建人：maerhuan 时间：2016年4月5日-下午5:21:48
	 * 
	 * @param content
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isNotEmpty(String content) {
		return !isEmpty(content);
	}
	/**
	 * 
	 * 设定默认值</br>
	 * toolsUtils </br>
	 * 方法名：defaultValue </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月5日-下午2:37:30 </br>
	 * @param content
	 * @param defaultValue
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String defaultValue(String content,String defaultValue){
		if(isEmpty(content)){
			return defaultValue;
		}
		return content;
	}

	/**
	 * 
	 * 是不是中文 字符判断 toolsUtils 方法名：isChineseChar 创建人：maerhuan
	 * 时间：2016年4月5日-下午5:22:02
	 * 
	 * @param c
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isChineseChar(char c) {
		try {
			return String.valueOf(c).getBytes("UTF-8").length > 1;
		} catch (UnsupportedEncodingException e) {
			return false;
		}

	}

	/**
	 * 
	 * 是否是图片 toolsUtils 方法名：isImage 创建人：maerhuan 时间：2016年4月5日-下午5:20:24
	 * 
	 * @param ext
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isImage(String ext) {
		return ext.toLowerCase().matches("jpg|gif|bmp|png|jpeg");
	}

	/**
	 * 
	 * 判断是不是office文档 toolsUtils 方法名：isDoc 创建人：maerhuan 时间：2016年4月5日-下午5:22:30
	 * 
	 * @param ext
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isDoc(String ext) {
		return ext.toLowerCase().matches("doc|docx|xls|xlsx|pdf|txt|ppt|pptx");
	}

	/**
	 * 
	 * 音频视频的判断 toolsUtils 方法名：isVideo 创建人：maerhuan 时间：2016年4月5日-下午5:22:49
	 * 
	 * @param ext
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isVideo(String ext) {
		return ext.toLowerCase().matches("mp4|flv|mp3");
	}

	/**
	 * @作用:判断是否为数字
	 */
	public static boolean isNumeric(String str) {
		Matcher isNum = Pattern.compile("(-|\\+)?[0-9]+(.[0-9]+\\+)?").matcher(
				str);
		return isNum.matches();
	}

	/**
	 * 判断字符串是否都是数字组成
	 * 
	 * @param numString
	 * @return
	 */
	public static boolean isNumber(String numString) {
		return MehStringUtil.isNumeric(numString);
	}

	/**
	 * 
	 * 邮箱的验证 toolsUtils 方法名：isEmail 创建人：maerhuan 时间：2016年4月5日-下午5:23:28
	 * 
	 * @param email
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isEmail(String email) {
		boolean flag = false;
		try {
			String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(email);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 
	 * 手机号码的验证 toolsUtils 方法名：isMobile 创建人：maerhuan 时间：2016年4月5日-下午5:23:45
	 * 
	 * @param mobiles
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isMobile(String mobiles) {
		boolean flag = false;
		try {
			Pattern p = Pattern
					.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
			Matcher m = p.matcher(mobiles);
			flag = m.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 
	 * 网络地址的验证 toolsUtils 方法名：isHomepage 创建人：maerhuan 时间：2016年4月5日-下午5:24:02
	 * 
	 * @param str
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isHomepage(String str) {
		String regex = "http://(([a-zA-z0-9]|-){1,}\\.){1,}[a-zA-z0-9]{1,}-*";
		return match(regex, str);
	}

	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);// 将给定的正则表达式编译到具有给定标志的模式中
		Matcher matcher = pattern.matcher(str);// 模式进行匹配字符
		return matcher.matches();
	}

	/**
	 * 
	 * 替换所有的空格 toolsUtils 方法名：replaceAllTrim 创建人：maerhuan 时间：2016年4月5日-下午5:24:17
	 * 
	 * @param content
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String replaceAllTrim(String content) {
		return content.replaceAll("\\s*", "");
	}

	/**
	 * 
	 * 获取文件的后缀 toolsUtils 方法名：getExt 创建人：maerhuan 时间：2016年4月5日-下午5:24:40
	 * 
	 * @param path
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getExt(String path) {
		if (isEmpty(path))
			return path;
		String ext = path.substring(path.lastIndexOf(".") + 1);
		return ext;
	}
	
	/**
	 * 
	 * 获取文件的带点的后缀 toolsUtils 方法名：getExtPoint 创建人：maerhuan 时间：2016年4月5日-下午5:24:57
	 * 
	 * @param path
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getExtPoint(String path) {
		if (isEmpty(path))
			return path;
		String ext = path.substring(path.lastIndexOf("."));
		return ext;

	}
	/**
	 * 
	 * 获取文件的后缀</br> com.tz.util </br> 方法名：getExt </br> 创建人：maerhuan </br>
	 * 时间：2016年10月6日-下午6:49:38 </br>
	 * 
	 * @param name
	 * @param flag
	 * @return String </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static String getExt(String name, boolean flag) {
		if (isNotEmpty(name)) {
			String ext = null;
			if (flag) {
				ext = name.substring(name.lastIndexOf("."), name.length());
			} else {
				ext = name.substring(name.lastIndexOf(".") + 1, name.length());
			}
			return ext;
		} else {
			return "";
		}
	}
	/**
	 * 
	 * 获取文件名字 toolsUtils 方法名：getFileName 创建人：maerhuan 时间：2016年4月5日-下午5:25:15
	 * 
	 * @param path
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getFileName(String path) {
		if (isEmpty(path))
			return path;
		String filename = path.substring(path.lastIndexOf("/") + 1,
				path.indexOf("."));
		return filename;

	}

	/**
	 * 
	 * 随机文件名 toolsUtils 方法名：getNewFileName 创建人：maerhuan 时间：2016年4月5日-下午5:25:27
	 * 
	 * @param filename
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getNewFileName(String filename) {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_"
				+ getRandomString(5) + getExtPoint(filename);
	}

	/**
	 * 
	 * 根据用户id获取随机文件名 toolsUtils 方法名：getNewFileName 创建人：maerhuan
	 * 时间：2016年4月5日-下午5:25:41
	 * 
	 * @param filename
	 * @param userId
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getNewFileName(String filename, Integer userId) {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_"
				+ getRandomString(5) + "_" + userId + getExtPoint(filename);
	}

	/**
	 * 
	 * 验证码 toolsUtils 方法名：getRandomString 创建人：maerhuan 时间：2016年4月5日-下午5:25:58
	 * 
	 * @param length
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String getRandomString(int length) {
		if (length == 0)
			return "";
		if (length >= 57)
			return getRandomString(57);
		StringBuffer bu = new StringBuffer();
		String[] arr = { "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c",
				"d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		Random random = new Random();
		while (bu.length() < length) {
			String temp = arr[random.nextInt(57)];
			if (bu.indexOf(temp) == -1) {
				bu.append(temp);
			}

		}

		return bu.toString();
	}

	/**
	 * 
	 * MD5加密 toolsUtils 方法名：md5 创建人：maerhuan 时间：2016年4月5日-下午5:26:22
	 * 
	 * @param src
	 * @return byte[]
	 * @exception
	 * @since 1.0.0
	 */
	public static byte[] md5(String src) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] md = md5.digest(src.getBytes());
			return md;
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * 
	 * 加盐加密 toolsUtils 方法名：md5Base64 创建人：maerhuan 时间：2016年4月5日-下午5:26:39
	 * 
	 * @param str
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String md5Base64(String str) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			return base64Encode(md5.digest(str.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String base64Encode(byte[] b) {
		if (b == null) {
			return null;
		}
		return new BASE64Encoder().encode(b);
	}
	
	/*加盐加密*/
	public static String saltPassword(String slatString,String password){
		return md5Base64(slatString+password);
	}

	/**
	 * 
	 * 凯撒加密 toolsUtils 方法名：encryption 创建人：maerhuan 时间：2016年4月5日-下午5:26:53
	 * 
	 * @param str
	 * @param k
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String encryption(String str, int k) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c += k % 26;
				if (c < 'a') {
					c += 26;
				}
				if (c > 'z') {
					c -= 26;
				}
			} else if (c >= 'A' && c <= 'Z') {
				c += k % 26;
				if (c < 'A') {
					c += 26;
				}
				if (c > 'Z') {
					c -= 26;
				}
			}
			string += c;
		}
		return string;
	}

	/**
	 * 
	 * 凯撒解密 toolsUtils 方法名：dencryption 创建人：maerhuan 时间：2016年4月5日-下午5:27:06
	 * 
	 * @param str
	 * @param n
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String dencryption(String str, int n) {
		String string = "";
		int k = Integer.parseInt("-" + n);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c += k % 26;
				if (c < 'a') {
					c += 26;
				}
				if (c > 'z') {
					c -= 26;
				}
			} else if (c >= 'A' && c <= 'Z') {
				c += k % 26;
				if (c < 'A') {
					c += 26;
				}
				if (c > 'Z') {
					c -= 26;
				}
			}
			string += c;
		}
		return string;
	}

	/**
	 * 把传入的数转换为中文金额大写形式
	 * 
	 * @param flag
	 *            int 标志位，1 表示转换整数部分，0 表示转换小数部分
	 * @param s
	 *            String 要转换的字符串
	 * @return 转换好的带单位的中文金额大写形式
	 */
	public static String numFormat(String s,int flag) {
		int sLength = s.length();
		// 货币大写形式
		String bigLetter[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
		// 货币单位
		String unit[] = {"元", "拾", "佰", "仟", "万", 
				// 拾万位到仟万位
				"拾", "佰", "仟",
				// 亿位到万亿位
				"亿", "拾", "佰", "仟", "万"};
		String small[] = {"分", "角"};
		// 用来存放转换后的新字符串
		String newS = "";
		// 逐位替换为中文大写形式
		for(int i = 0; i < sLength; i ++) {
			if(flag == 1) {
				// 转换整数部分为中文大写形式（带单位）
				newS = newS + bigLetter[s.charAt(i) - 48] + unit[sLength - i - 1];
			} else if(flag == 2) {
				// 转换小数部分（带单位）
				newS = newS + bigLetter[s.charAt(i) - 48] + small[sLength - i - 1];
			}
		}
		return newS;
	}

	/**
	 * 整数的转换与0补齐
	 * 
	 * @param str
	 *            转换的数字
	 * @param length
	 *            转换的长度。不够0补齐.
	 * @return
	 */
	public static String formatNO(int str, int length) {
		float ver = Float.parseFloat(System
				.getProperty("java.specification.version"));
		String laststr = "";
		if (ver < 1.5) {
			try {
				NumberFormat formater = NumberFormat.getNumberInstance();
				formater.setMinimumIntegerDigits(length);
				laststr = formater.format(str).toString().replace(",", "");
			} catch (Exception e) {
				System.out.println("格式化字符串时的错误信息：" + e.getMessage());
			}
		} else {
			Integer[] arr = new Integer[1];
			arr[0] = new Integer(str);
			laststr = String.format("%0" + length + "d", arr);
		}
		return laststr;
	}

	/**
	 * pattern:
	 * 理论上讲日期格式表达式包含全部26个英文字母的大小写，不过它们中的一些字母只是被预留了，并没有确切的含义。目前有效的字母及它们所代表的含义如下：
	 * 中文解释含义： G：年代标识，表示是公元前还是公元后 y：年份 M：月份 d：日 h：小时，从1到12，分上下午 H：小时，从0到23 m：分钟
	 * s：秒 S：毫秒 E：一周中的第几天，对应星期几，第一天为星期日，于此类推 z：时区 D：一年中的第几天
	 * F：这一天所对应的星期几在该月中是第几次出现 w：一年中的第几个星期 W：一个月中的第几个星期 a：上午/下午标识 k：小时，从1到24
	 * K：小时，从0到11，区分上下午
	 * 在日期格式表达式中出现的所有字母，在进行日期格式化操作后，都将被其所代表的含义对应的属性值所替换，并且对某些字母来说
	 * ，重复次数的不同，格式化后的结果也会有所不同。请看下面的例子： 字符串格式编程日期 方法名：stringToDate 创建人：maerhuan
	 * 时间：2016年3月24日-下午10:56:12 手机:1564545646464
	 * 
	 * @param dateString
	 * @param pattern
	 * @return
	 * @throws ParseException
	 *             Date
	 * @exception
	 * @since 1.0.0
	 */
	public static Date stringToDate(String dateString, String pattern)
			throws ParseException {
		return new SimpleDateFormat(pattern).parse(dateString);
	}

	/**
	 * 
	 * 日期转字符串 toolsUtils 方法名：dateToString 创建人：maerhuan 时间：2016年4月5日-下午5:27:50
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 * @throws ParseException
	 *             String
	 * @exception
	 * @since 1.0.0
	 */
	public static String dateToString(Date date, String pattern)
			throws ParseException {
		return new SimpleDateFormat(pattern).format(date);
	}
	/**
	 * 讲一个数字个格式化成为你的需要的金额【数字会四舍五入】<br/>--
	 * eg:doubleToString(12.5698,"#.##")===12.57<br/>
	 * eg:doubleToString(12.5698,"0.00")===12.57<br/>
	 * eg:doubleToString(12,"0.00")===12.00<br/>
	 * eg:doubleToString(12,"#.##")===12<br/>
	 * 将小数格式化成字符串，会进行四舍五入 如：3656.4554===结果:3656.46<BR>
	 * 方法名：formatDoubleToString<BR>
	 * 创建人：maerhuan <BR>
	 * 时间：2014年8月12日-下午9:12:01 <BR>
	 * 
	 * @param dou
	 * @return String<BR>
	 * @exception <BR>
	 * @since 1.0.0
	 */
	public static String formatDoubleToString(double dou,String format) {
		if(isEmpty(format))format = "#.##";
		DecimalFormat decimalFormat = new DecimalFormat(format);
		String string = decimalFormat.format(dou);// 四舍五入，逢五进一
		return string;
	}
	/**
	 * 百分比转换
	 * 方法名：getPercent<BR>
	 * 创建人：maerhuan <BR>
	 * 时间：2014年8月12日-下午9:50:46 <BR>
	 * @param num
	 * @param totalCount
	 * @param format
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String getPercent(int num,double totalCount,String...objects){
		String format = "#.##";
		if(objects!=null && objects.length>0){
			format = objects[0];
		}
		return MehStringUtil.formatDoubleToString((num/totalCount)*100,format)+"%";
	}
	
	/**
	 * 百分比转换
	 * 方法名：getPercent<BR>
	 * 创建人：maerhuan <BR>
	 * 时间：2014年8月12日-下午9:50:46 <BR>
	 * @param num 当前的数字
	 * @param totalCount 总数
	 * @param format 
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String getPercent(int num,float totalCount,String...objects){//动态参数
		String format = "#.##";
		if(objects!=null && objects.length>0){
			format = objects[0];
		}
		return MehStringUtil.formatDoubleToString((num/totalCount)*100,format)+"%";
	}
	
	
	
	/**
	 *冒泡排序方法,如果为true那就是降序，false那么久是升序 
	 * 方法名：sorts<BR>
	 * 创建人：maerhuan <BR>
	 * 时间：2014年8月12日-下午11:35:55 <BR>
	 * @param datas
	 * @param flag
	 * @return int[]<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static int[] sorts(int[] datas,boolean flag){
		for (int i = 0; i < datas.length; i++) {//轮询次数
			for(int j=0; j < datas.length-1; j++){//交换次数
				if(flag){ 
					if(datas[j] < datas[j+1]){
						int temp = datas[j];
						datas[j] = datas[j+1];
						datas[j+1] = temp;
					}
				}else{
					if(datas[j] < datas[j+1]){
						int temp = datas[j];
						datas[j] = datas[j+1];
						datas[j+1] = temp;
					}
				}
			}
		}
		return datas;
	}

	/**
	 * 
	 * 替换标签符号位转义符号 toolsUtils 方法名：htmlEncode 创建人：maerhuan 时间：2016年4月5日-下午5:28:16
	 * 
	 * @param txt
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String htmlEncode(String txt) {
		if (null != txt) {
			txt = txt.replace("&", "&amp;").replace("&amp;amp;", "&amp;")
					.replace("&amp;quot;", "&quot;").replace("\"", "&quot;")
					.replace("&amp;lt;", "&lt;").replace("<", "&lt;")
					.replace("&amp;gt;", "&gt;").replace(">", "&gt;")
					.replace("&amp;nbsp;", "&nbsp;");
		}
		return txt;
	}

	/**
	 * 
	 * 字符串数组转字符串 toolsUtils 方法名：arrToString 创建人：maerhuan 时间：2016年4月5日-下午5:28:29
	 * 
	 * @param strings
	 * @param separtor
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public static String arrToString(String[] strings, String separtor) {
		StringBuffer buffer = new StringBuffer();
		if (strings != null) {
			for (String string : strings) {
				buffer.append(string + separtor);
			}
			String result = buffer.toString();
			return result.substring(0, result.length() - 1);
		} else {
			return "";
		}
	}

	/** 首字母大写 */
	public static String toUpperCaseFirst(String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}
	
	/** 获取首字母 */
	public static String getFirstChar(String text) {
		return text.substring(0, 1);
	}

	/** 首字母小写 **/
	public static String toLowerCaseFirst(String text) {
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}
	/**替换符号**/
	public static String conversionSpecialCharacters(String string) {
		return string.replaceAll("\\\\", "/");
	}

	/**
	 * 
	 * 截取字符串 toolsUtils 方法名：subString 创建人：maerhuan 时间：2016年4月5日-下午5:29:26
	 * 
	 * @param orignal
	 * @param count
	 * @return
	 * @throws UnsupportedEncodingException
	 *             String
	 * @exception
	 * @since 1.0.0
	 */
	public static String subString(String orignal, int count)
			throws UnsupportedEncodingException {
		// 要截取的字符串不为空 不是null字符串
		if (orignal != null && !"".equals(orignal)) {
			// 设置编码方式
			orignal = new String(orignal.getBytes(), "GBK");
			// 要截取的字节数>0 &&小于字符串的字节数
			if (count > 0 && count < orignal.getBytes("GBK").length) {
				StringBuilder builder = new StringBuilder();
				char c;
				for (int i = 0; i < count; i++) {
					c = orignal.charAt(i);
					builder.append(c);
					if (CutString.isChinese(c)) {
						--count;
					}

				}
				return builder.toString();
			}

		}
		return orignal;
	}
	/**
	 * 
	 * List转换字符串
	 * toolsUtils 
	 * 方法名：listToString
	 * 创建人：maerhuan 
	 * 时间：2016年4月17日-下午4:29:48 
	 * @param params
	 * @param sepator
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public static String listToString(List<String> params, String sepator) {
		if (params.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			for (String string : params) {
				buffer.append(string + sepator);
			}
			String result = buffer.toString();
			return result.substring(0, result.length() - 1);
		} else {
			return "";
		}
	}
	/**
	 * 
	 * 根据索引转换字母</br>
	 * com.tz.tld </br>
	 * 方法名：getCharacter </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年9月24日-下午11:16:57 </br>
	 * @param num
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String getCharacter(int num){
		return String.valueOf((char)(64+num)) ;	
	}
	/**
	 * 
	 * 获取集合的长度</br>
	 * com.tz.tld </br>
	 * 方法名：getLength </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年9月17日-下午3:32:34 </br>
	 * @param collection
	 * @return int </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static int getLength(Collection<?> collection){
		if(collection!=null){
			return collection.size();
		}else {
			return 0;
		}
	}
	
	
	
	
	

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String string = "ashdasdsasafdsgfgvds";
		// boolean bl = isEmpty(string);
		// System.out.println(bl);
		// String string2 = "i love you ";
		// System.out.println(replaceAllTrim(string2));

		 //String pString = "d:/2013032201/meh/meh.jpg";
		//String string  = pString.substring(pString.lastIndexOf('/')+1);
		 //System.out.println(string);
		// System.out.println(getExtPoint(pString));
		// System.out.println(getFileName(pString));
		 System.out.println(getRandomString(20));
		/**
		 * System.out.println(UUID.randomUUID().toString());
		 */

		// String [] strings = {"asd","asd","hgdtg","as","gs"};
		// String separtor = "";
		// System.out.println(arrToString(strings, separtor));
		// String string = "我爱你abc";
		// System.out.println(subString(string, 4));
		// System.out.println(string.substring(2,5));
		// String string3 = "abcdef";
		// System.out.println(string3.substring(1, 3));
		// String str = "2013032201/1/1.jpg";
		// System.out.println(getNewFileName(str));
		// System.out.println(getNewFileName(str, 2013032201));

		// System.out.println(md5("c"));
		// System.out.println(md5Base64("123456"));
		// System.out.println(md5Base64("keke_123456"));//加盐加密
		// System.out.println(encryption("123asd", 2));
		// System.out.println(dencryption("123cuf", 2));
		//System.out.println(formatNO(123, 4));

		// Properties properties = System.getProperties();
//		 Enumeration<Object> enumeration = properties.elements();
//		 while (enumeration.hasMoreElements()) {
//		 Object object = (Object) enumeration.nextElement();
//		 System.out.println(object);
//		 }
		 
//		 Enumeration<?> enumeration2 = properties.propertyNames();
//		 while (enumeration2.hasMoreElements()) {
//		 Object object = enumeration2.nextElement();
		 //System.out.println(object+"====="+System.getProperty(String.valueOf(object)));
		 //开发中不能出现任何\\
		 //file.separator   ===== \
		 
		 
		 //负载均衡的时候用到
//		 System.out.println("======Runtime=====");
//		 Runtime runtime = Runtime.getRuntime();
//		 long max=runtime.maxMemory()/1024/1024;
//		 long total=runtime.totalMemory()/1024/1024;
//		 long free=runtime.freeMemory()/1024/1024;
//		 System.out.println("运行时的对象:"+runtime.availableProcessors());
//		 System.out.println("最大内存数"+max);
//		 System.out.println("空闲的内存数"+free);
//		 System.out.println("总内存数"+total);
//		 System.out.println("剩余内存大小："+(max-total+free));
		 
			// List<String> list = new ArrayList<String>();
			// list.add("aaa");
			// list.add("bbb");
			//
			// System.out.println(listToString(list, ","));
			// String str= "我是哈哈哈哈哈哈";
			// System.out.println(str.getBytes("gbk"));
			// System.out.println(str.getBytes("utf-8"));
			// String str2 = new String ("asdas".getBytes(),"gbk");
			// System.out.println(str2);
//		try {
//			dateToString(new Date(), "yyyymmdd");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 
		 
		 }
	}

