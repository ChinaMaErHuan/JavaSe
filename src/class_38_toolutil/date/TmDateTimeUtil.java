package class_38_toolutil.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.joda.time.format.DateTimeFormat;

import toolsUtils.StringUtils.MehStringUtil;
import hirondelle.date4j.DateTime;
import static class_38_toolutil.date.TmDateUtil.*; 

public class TmDateTimeUtil {

	// public enum ExmayDateTimes {
	// TODAY, YESTERDAY, THIS_WEEK, LAST_WEEK, THIS_MONTH, LAST_MONTH,
	// THIS_YEAR, LAST_YEAR;
	// }
	// ����
	public static final String TODAY = "today";
	// ����
	public static final String YESTERDAY = "yesterday";
	// ����
	public static final String TOMORROW = "tomorrow";
	// ǰ��
	public static final String THE_DAY_BEFORE_YESTERDAY = "theDayBeforeYesterday";
	// ����
	public static final String THIS_WEEK = "thisWeek";
	//���ܵ�һ�쵽�����ʱ���
	public static final String NOW_WEEK = "nowWeek";
	// ����
	public static final String LAST_WEEK = "lastWeek";
	// ����
	public static final String THIS_MONTH = "thisMonth";
	// ���µ�һ�쵽��ͷ��ʱ���
	public static final String NOW_MONTH = "nowMonth";
	// ���µ�һ�쵽��ͷ��ʱ���
	public static final String NOW_MONTH_DAY = "nowMonthDay";
	// ����
	public static final String LAST_MONTH = "lastMonth";
	// ����
	public static final String THIS_YEAR = "thisYear";
	// ȥ��
	public static final String LAST_YEAR = "lastYear";
	// ǰ��
	public static final String THE_YEAR_BEFORE_LAST = "theYearBeforeLast";
	// ����ǰ
	public static final String TWO_YEAR_AGO = "twoYearsAgo";

	public static final String DATATIME_FORMAT = "YYYY-MM-DD hh:mm:ss";

	public static final String DATATIME_FORMAT_YMD = "YYYY-MM-DD";

	public static TmTimeInterval getDateTime(String dateTime) {
		Date now = new Date();
		return getDateTime(dateTime, now);
	}
	
	
	
	/**
	 * ��ȡ���
	 * @param dateString
	 * @return
	 */
	public static String getYear(String dateString){
		DateTime datetime = new DateTime(dateString);
		return String.valueOf(datetime.getYear());
	}
	/**
	 * ��ȡ���
	 * @param dateString
	 * @return
	 */
	public static String getYear(Date date){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return String.valueOf(datetime.getYear());
	}
	
	/**
	 * ��ȡ�·�
	 * @param dateString
	 * @return
	 */
	public static String getMonth(String dateString){
		DateTime datetime = new DateTime(dateString);
		return String.valueOf(datetime.getMonth());
	}
	/**
	 * ��ȡ�·�
	 * @param dateString
	 * @return
	 */
	public static String getMonth(Date date){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return String.valueOf(datetime.getMonthOfYear());
	}
	
	/**
	 * ��ȡ����
	 * @param dateString
	 * @return
	 */
	public static String getDay2(String dateString){
		return String.valueOf(getDay(dateString));
	}
	/**
	 * ��ȡ����
	 * @param dateString
	 * @return
	 */
	public static String getDay2(Date date){
		return String.valueOf(getDay(date));
	}
	
	/**
	 * ��ȡָ��ʱ��Ŀ�ʼʱ��
	 * @param dateTime
	 * @param timeDate
	 * @return
	 */
	public static String getStartTime(String timeDate) {
		Date starttime = TmDateTimeUtil.getDateTime("today",timeDate).getStartTime();
		return TmDateUtil.getCurrentDatetime(starttime);
	}
	
	/**
	 * ��ȡָ��ʱ��Ŀ�ʼʱ��
	 * @param dateTime
	 * @param timeDate
	 * @return
	 */
	public static String getStartTimeByDate(Date timeDate) {
		Date starttime = TmDateTimeUtil.getDateTime("today",timeDate).getStartTime();
		return TmDateUtil.getCurrentDatetime(starttime);
	}
	
	/**
	 * ��ȡָ��ʱ��Ľ���ʱ��
	 * @param dateTime
	 * @param timeDate
	 * @return
	 */
	public static String getEndTime(String timeDate) {
		Date endtime = TmDateTimeUtil.getDateTime("today",timeDate).getEndTime();
		return TmDateUtil.getCurrentDatetime(endtime);
	}
	
	/**
	 * ��ȡָ��ʱ��Ľ���ʱ��
	 * @param dateTime
	 * @param timeDate
	 * @return
	 */
	public static String getEndTimeByDate(Date timeDate) {
		Date endtime = TmDateTimeUtil.getDateTime("today",timeDate).getEndTime();
		return TmDateUtil.getCurrentDatetime(endtime);
	}

	public static TmTimeInterval getDateTime(String dateTime, String timeDate) {
		Date date = TmDateUtil.parse(timeDate, Format_Date);
		return getDateTime(dateTime, date);
	}
	
	/**
	 * ��ȡ�������ڵ���������
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	public static List<String> getDays(String starttime,String endtime){
		List<String> days = new ArrayList<String>();
		int count = TmDateTimeUtil.getNumDaysFrom(starttime, endtime);
		DateTime dt = new DateTime(starttime);
		for (int i = 0; i <=count; i++) {
			DateTime dateTime = dt.plusDays(i);
			days.add(dateTime.format("YYYY-MM-DD"));
			
		}
		return days;
	}
	
	/**
	 * ��ȡ�������ڵ���������
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	public static List<String> getDays(Date starttime,Date endtime){
		return getDays(TmDateUtil.getCurrentDate(starttime),TmDateUtil.getCurrentDate(endtime));
	}

	public static TmTimeInterval getDateTime(String dateTime, Date now) {
		TmTimeInterval interval = new TmTimeInterval();
		String nowTime = TmDateUtil.toString(now, Format_DateTime);
		DateTime dt = new DateTime(nowTime);
		if (dateTime.equals(TODAY)) {
			Date startTime = parse(dt.getStartOfDay().format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().format(DATATIME_FORMAT),
					Format_DateTime);
			// Date endTime = new Date();
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(YESTERDAY)) {
			Date startTime = parse(dt.getStartOfDay().minusDays(1).format(
					DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().minusDays(1).format(
					DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}

		if (dateTime.equals(TOMORROW)) {
			Date startTime = parse(dt.getStartOfDay().plusDays(1).format(
					DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(1).format(
					DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}

		if (dateTime.equals(THE_DAY_BEFORE_YESTERDAY)) {
			Date startTime = parse(dt.getStartOfDay().minusDays(2).format(
					DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().minusDays(2).format(
					DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(THIS_WEEK)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			int dayOfWeek = time.getDayOfWeek();
			Date startTime = parse(dt.getStartOfDay().minusDays(dayOfWeek - 1)
					.format(DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(7 - dayOfWeek)
					.format(DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(NOW_WEEK)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			int dayOfWeek = time.getDayOfWeek();
			Date startTime = parse(dt.getStartOfDay().minusDays(dayOfWeek - 1)
					.format(DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(parse(getEndTimeByDate(new Date()),Format_DateTime));
			return interval;
		}
		if (dateTime.equals(LAST_WEEK)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			int dayOfWeek = time.getDayOfWeek();
			Date startTime = parse(dt.getStartOfDay().minusDays(dayOfWeek + 6)
					.format(DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().minusDays(dayOfWeek).format(
					DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(THIS_MONTH)) {
			Date startTime = parse(
					dt.getStartOfMonth().format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfMonth().format(DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if(dateTime.equals(NOW_MONTH)) {
			Date startTime = parse(
					dt.getStartOfMonth().format(DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(parse(getEndTimeByDate(new Date()),Format_DateTime));
			return interval;
		}
		if (dateTime.equals(NOW_MONTH_DAY)) {
			int day = dt.getDay();
			Date startTime = parse(dt.getStartOfMonth().plusDays(day-30).format(TmDateTimeUtil.DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(parse(getEndTimeByDate(new Date()),Format_DateTime));
			return interval;
		}
		if (dateTime.equals(LAST_MONTH)) {
			int monthDays = dt.getNumDaysInMonth();
			int lastMonthDays = dt.getEndOfMonth().minusDays(monthDays)
					.getNumDaysInMonth();
			Date startTime = parse(dt.getStartOfMonth()
					.minusDays(lastMonthDays).format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfMonth().minusDays(monthDays)
					.format(DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(THIS_YEAR)) {
			int days;
			if (dt.isLeapYear()) {
				days = 366;
			} else {
				days = 365;
			}
			Date startTime = parse(dt.getStartOfDay().minusDays(
					dt.getDayOfYear() - 1).format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(
					365 - dt.getDayOfYear()).format(DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(LAST_YEAR)) {
			int days;
			if (dt.isLeapYear()) {
				days = 366;
			} else {
				days = 365;
			}
			int lastYearDays;
			DateTime time = dt.getStartOfDay().minusDays(dt.getDayOfYear() - 2);
			if (time.isLeapYear()) {
				lastYearDays = 366;
			} else {
				lastYearDays = 365;
			}
			Date startTime = parse(dt.getStartOfDay().minusDays(
					dt.getDayOfYear() + lastYearDays - 1).format(
					DATATIME_FORMAT), Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(
					days - dt.getDayOfYear() - lastYearDays).format(
					DATATIME_FORMAT), Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(THE_YEAR_BEFORE_LAST)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			time = time.minusYears(2);
			nowTime = time.toString(Format_DateTime);
			dt = new DateTime(nowTime);
			Date startTime = parse(dt.getStartOfDay().minusDays(
					dt.getDayOfYear() - 1).format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(
					365 - dt.getDayOfYear()).format(DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(THE_YEAR_BEFORE_LAST)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			time = time.minusYears(2);
			nowTime = time.toString(Format_DateTime);
			dt = new DateTime(nowTime);
			Date startTime = parse(dt.getStartOfDay().minusDays(
					dt.getDayOfYear() - 1).format(DATATIME_FORMAT),
					Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(
					365 - dt.getDayOfYear()).format(DATATIME_FORMAT),
					Format_DateTime);
			interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		if (dateTime.equals(TWO_YEAR_AGO)) {
			org.joda.time.DateTime time = DateTimeFormat.forPattern(
					Format_DateTime).parseDateTime(nowTime);
			time = time.minusYears(3);
			nowTime = time.toString(Format_DateTime);
			dt = new DateTime(nowTime);
			// Date startTime =
			// parse(dt.getStartOfDay().minusDays(dt.getDayOfYear()-1).format(DATATIME_FORMAT),
			// Format_DateTime);
			Date endTime = parse(dt.getEndOfDay().plusDays(
					365 - dt.getDayOfYear()).format(DATATIME_FORMAT),
					Format_DateTime);
			// interval.setStartTime(startTime);
			interval.setEndTime(endTime);
			return interval;
		}
		return null;
	}
	
	/**
	 * ��ȡ������������ 2021-12-08 ==>����8
	 * @param date
	 * @return
	 */
	public static Integer getDay(Date date){
		 return getDay(TmDateUtil.getCurrentDate(date));
	}
	
	/**
	 * 
	 * ��ȡ������������ 2021-12-08 ==>����8
	 * @param date
	 * @return
	 */
	public static Integer getDay(String date){
		 DateTime dateTime = new DateTime(date);
		 return dateTime.getDay();
	}
	/**
	 * 
	 * ��ȡ������������ 2021-12-08 ==>����8
	 * @param date
	 * @return
	 */
	public static Integer getDayT(Date date){
		org.joda.time.DateTime dateTime = new org.joda.time.DateTime(date);
		return dateTime.getDayOfMonth();
	}
	
	/**
	 * 
	 * ��ȡ������������ 2021-12-08 ==>����8
	 * @param date
	 * @return
	 */
	public static Integer getDayT(String date){
		return getDayT(TmDateUtil.parse(date));
	}
	
	/**
	 * ��ȡ���������ڼ�
	 * @param date
	 * @return
	 */
	public static Integer dayOfWeek(Object dateOrStringDate){
		org.joda.time.DateTime dateTime = new org.joda.time.DateTime(dateOrStringDate);
		return dateTime.getDayOfWeek();
	}
	

	/**
	 * ��ȡһ�����ж�����
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getDayOfMonth(String date) {
		Date time = null;
		try {
			time = new SimpleDateFormat(Format_Date).parse(date);
			return getDayOfMonth(time);
		} catch (ParseException e) {
			return 31;
		}
	}
	
	/***
	 * ��ȡһ�����ж�����
	 * @param date
	 * @return
	 */
	public static Integer getDayOfMonth(Date date) {
		String nowTime = new SimpleDateFormat(Format_DateTime).format(date);
		DateTime dt = new DateTime(nowTime);
		return dt.getNumDaysInMonth();
	}
	
	/**
	 * ��ȡ�������ڵļ������  yyyy-MM-dd
	 * @param date
	 * @param date2
	 * @return
	 */
	public static Integer getNumDaysFrom(String date,String date2){
		DateTime dateTime = new DateTime(date);
		DateTime dateTime2 = new DateTime(date2);
		return dateTime.numDaysFrom(dateTime2);
	}
	
	/**
	 * ��ȡ�������ڵļ������ yyyy-MM-dd
	 * @param date
	 * @param date2
	 * @return
	 */
	public static Integer getNumDaysFrom(Date date,Date date2){
		return getNumDaysFrom(TmDateUtil.getCurrentDate(date),TmDateUtil.getCurrentDate(date2));
	}

	/**
	 * ��ȡ��ǰʱ��֮ǰһ���µ�ʱ��
	 * 
	 * @return
	 */
	public static String getMonthDay() {
		Date date = new Date();// ��ǰʱ��
		String dString = new SimpleDateFormat(Format_DateTime).format(date);// ʱ��ת��
		DateTime dt = new DateTime(dString);
		String time = new SimpleDateFormat().format(getDateTime(LAST_MONTH)
				.getEndTime());
		Integer day = getDayOfMonth(time);
		DateTime mDateTime = dt.minusDays(day);// ��ǰʱ���ȥ�ϸ��µ�����
		return mDateTime.format(DATATIME_FORMAT_YMD);
	}

	/**
	 * ǰһ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @return string
	 */
	public static String getMinusDays(String dateTime) {
		DateTime dt = new DateTime(dateTime);
		DateTime mDateTime = dt.minusDays(1);
		return mDateTime.format(DATATIME_FORMAT_YMD);
	}

	/**
	 * ǰһ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @return Date
	 */
	public static Date minusDays(String dateTime) {
		try {
			return new SimpleDateFormat(Format_Date)
					.parse(getMinusDays(dateTime));
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * ��һ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @return Date
	 */
	public static Date plusDays(String dateTime) {
		try {
			return new SimpleDateFormat(Format_Date)
					.parse(getPlusDays(dateTime));
		} catch (ParseException e) {
			return new Date();
		}
	}
	
	

	/**
	 * ��һ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getPlusDays(String dateTime) {
		DateTime dt = new DateTime(dateTime);
		if (dt.gt(new DateTime(TmDateUtil.toString(new Date())))) {
			return TmDateUtil.getCurrentDate();
		} else {
			DateTime mDateTime = dt.plusDays(1);
			return mDateTime.format(DATATIME_FORMAT_YMD);
		}
	}

	/**
	 * ǰһ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @return
	 */
	public static String getMinusDays(Date dateTime) {
		Date date = new Date();// ��ǰʱ��
		String dfmt = new SimpleDateFormat(Format_Date).format(date);// ʱ��ת��
		return getMinusDays(dfmt);
	}
	

	/**
	 * ��һ��ʱ�� ʱ���ʽ��(yyyy-MM-dd)
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getPlusDays(Date dateTime) {
		Date date = new Date();// ��ǰʱ��
		String dfmt = new SimpleDateFormat(Format_Date).format(date);// ʱ��ת��
		return getPlusDays(dfmt);
	}

	/**
	 * ��ȡĳ��ʱ��ε�ʱ�䷶Χֵ 2010-01-01===>2010-12-12
	 * ��ȡ:2010-01-02,2010-01-03.....2010-12-11,2010-12-12
	 * 
	 * @param beginDate
	 *            ��ʼʱ��
	 * @param endDate
	 *            ����ʱ��
	 * @return
	 */

	public static String getPrevOrNextDay(String type, String dateTime) {
		if (MehStringUtil.isNotEmpty(type) && type.equals(YESTERDAY)) {
			return getMinusDays(dateTime);
		}
		if (MehStringUtil.isNotEmpty(type) && type.equals(TOMORROW)) {
			return getPlusDays(dateTime);
		}
		return dateTime;
		// ExmayDateUtil.getCurrentDate(Format_Date);
	}

	public static Date getPrevOrNextDays(String type, String dateTime) {
		if (MehStringUtil.isNotEmpty(type) && type.equals(YESTERDAY)) {
			return minusDays(dateTime);
		}
		if (MehStringUtil.isNotEmpty(type) && type.equals(TOMORROW)) {
			return plusDays(dateTime);
		}
		return TmDateUtil.parse(dateTime);
		// ExmayDateUtil.parse(dateTime);
	}

	public static List<String> getDateRange(String beginDate, String endDate) {
		GregorianCalendar[] ga = null;
		List<String> list = new ArrayList<String>();
		try {
			ga = getDate(beginDate, endDate);
			for (GregorianCalendar day : ga) {
				list.add(String.valueOf(day.get(Calendar.YEAR)) + "-"
						+ String.valueOf(day.get(Calendar.MONTH) + 1) + "-"
						+ String.valueOf(day.get(Calendar.DAY_OF_MONTH)));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean validDate(String beginDate, String endDate) {
		DateTime beginDateTime = new DateTime(beginDate);
		DateTime endDateTime = new DateTime(endDate);
		if (beginDateTime.gt(endDateTime) || beginDateTime.equals(endDateTime)) {
			return false;
		}
		return true;
	}

	public static GregorianCalendar[] getDate(String beginDate, String endDate)
			throws ParseException {
		List<GregorianCalendar> v = new ArrayList<GregorianCalendar>();
		SimpleDateFormat sdf = new SimpleDateFormat(Format_Date);
		GregorianCalendar gc1 = new GregorianCalendar(), gc2 = new GregorianCalendar();
		gc1.setTime(sdf.parse(beginDate));
		gc2.setTime(sdf.parse(endDate));
		do {
			GregorianCalendar gc3 = (GregorianCalendar) gc1.clone();
			v.add(gc3);
			gc1.add(Calendar.DAY_OF_MONTH, 1);
		} while (!gc1.after(gc2));
		return v.toArray(new GregorianCalendar[v.size()]);
	}
	
	/**
	 * ��ȡ��ǰ�µ���һ����
	 * @param date
	 * @return
	 */
	public static String getNextMonth(Date date){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return datetime.plusMonths(1).toString("yyyy-MM-dd");
	}
	
	public static String getNextMonth(String dateString){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(TmDateUtil.parse(dateString));
		return datetime.plusMonths(1).toString("yyyy-MM-dd");
	}
	
	public static String getNextMonth(Date date,String  format){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return datetime.plusMonths(1).toString(format);
	}
	
	public static String getNextMonth(String dateString,String  format){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(TmDateUtil.parse(dateString));
		return datetime.plusMonths(1).toString(format);
	}
	
	/**
	 * ��ȡ��ǰ�µ���һ����
	 * @param date
	 * @return
	 */
	public static String getPrevMonth(Date date){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return datetime.minusMonths(1).toString("yyyy-MM-dd");
	}
	
	public static String getPrevMonth(String dateString){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(TmDateUtil.parse(dateString));
		return datetime.minusMonths(1).toString("yyyy-MM-dd");
	}
	
	public static String getPrevMonth(Date date,String format){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(date);
		return datetime.minusMonths(1).toString(format);
	}
	
	public static String getPrevMonth(String dateString,String format){
		org.joda.time.DateTime datetime = new org.joda.time.DateTime(TmDateUtil.parse(dateString));
		return datetime.minusMonths(1).toString(format);
	}
	
	public static int numYear(String currentDate,String date){
		DateTime dateTime = new DateTime(currentDate);
		DateTime edateTime = new DateTime(date);
		return edateTime.numDaysFrom(dateTime) / 365;
	}
	
	public static int numYear(Date currentDate,Date date){
		DateTime dateTime = new DateTime(TmDateUtil.getCurrentDate(currentDate));
		DateTime edateTime = new DateTime(TmDateUtil.getCurrentDate(date));
		return edateTime.numDaysFrom(dateTime) / 365;
	}
	
	public static String numMinutes(String currentDate,String date){
		DateTime dateTime = new DateTime(currentDate);
		DateTime edateTime = new DateTime(date);
		long timer = dateTime.numSecondsFrom(edateTime) / 60;
		if(timer<=0)return "-1";
		if(timer > 60){
			return  timer/60+"Сʱ";
		}else{
			return timer+"����";
		}
	}

	//ҵ��������û��һ���ֵ��
	public static void main(String[] args) throws ParseException {
		//�����������(��)ȥ
		//��ȡ���ܵĵ�һ��
		//���ܣ����죬���� ���� һ��ǰ ����ǰ
		//��ȡ����Ŀ�ʼʱ��ͽ���ʱ��
//		TmTimeInterval timeInterval = getDateTime(TmDateTimeUtil.TODAY);
//		System.out.println(TmDateUtil.getCurrentDatetime(timeInterval.getStartTime()));
//		System.out.println(TmDateUtil.getCurrentDatetime(timeInterval.getEndTime()));
		
//		TmTimeInterval timeInterval = getDateTime(TmDateTimeUtil.THE_YEAR_BEFORE_LAST);
//		TmTimeInterval timeInterval = getDateTime(TmDateTimeUtil.THIS_YEAR);
//		TmTimeInterval timeInterval = getDateTime(TmDateTimeUtil.LAST_MONTH);
//		TmTimeInterval timeInterval = getDateTime(TmDateTimeUtil.NOW_WEEK);
//		
//		System.out.println(TmDateUtil.getCurrentDatetime(timeInterval.getStartTime()));
//		System.out.println(TmDateUtil.getCurrentDatetime(timeInterval.getEndTime()));
//		System.out.println(TmDateUtil.getTimeFormat(timeInterval.getStartTime()));
		
//		
//		System.out.println(getNextMonth(new Date()));
//		System.out.println(getPrevMonth(new Date()));
		
//		List<String> dates =  getDateRange("2015-12-12","2016-2-12");
//		for (String string : dates) {
//			System.out.println(string);
//		}
		
		
//		TmTimeInterval timeInterval = getDateTime(TODAY,new Date());
//		System.out.println(TmDateUtil.getCurrentDatetime(timeInterval.getStartTime())+"==="+TmDateUtil.getCurrentDatetime(timeInterval.getEndTime()));
//		System.out.println(numMinutes("2013-12-24 06:30:00","2013-12-24 22:10:00"));
		//System.out.println(getYear("2012-11-12"));
		//System.out.println(getMonth("2012-11-12"));
		//System.out.println(numYear(new Date(),MyhomeDateUtil.parse("1986-02-27")));
		//org.joda.time.DateTime datetime = new org.joda.time.DateTime(TmDateUtil.parseDateTime("2013-11-15 10:44:52:123"));
		//System.out.println(datetime.getDayOfWeek());
		//System.out.println(getPrevMonth("2012-11-12"));
//		 MyhomeTimeInterval interval = getDateTime("today",MyhomeDateUtil.dateToString("2012-12-12 12:23:23"));
//		 System.out.println(interval.getStartTime()+"===>"+interval.getEndTime());
		 
		// System.out.println(interval.getStartTime().toLocaleString()+"===========>"+interval.getEndTime().toLocaleString());
		// System.out.println(getDayOfMonth(new Date()));
		// System.out.println(getPlusDays("2010-04-19"));
		// ExmayTimeInterval interval = getDateTime("yesterday");
		//		
		// System.out.println(new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(interval.getStartTime())+"===========>"+new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(interval.getEndTime()));
		// List<String> list = new
		// ExmayDateTimeUtil().getDateRange("2011-01-01", "2011-05-30");
		// for (String string : list) {
		// System.out.println(string);
		// }
		// ExmayTimeInterval interval = getDateTime(LAST_MONTH);
		// System.out.println(interval.getEndTime().toLocaleString()+"===>"+interval.getStartTime().toLocaleString());
		// System.out.println(getDayOfMonth(new
		// SimpleDateFormat("yyyy-MM-dd").format(interval.getStartTime())));
		// System.out.println();
		// System.out.println(getDayOfMonth("2011-03-12"));
		// System.out.println(getMonthDay());
		// Date nowTime = new SimpleDateFormat("yyyyMM").parse("201108");
//		 Date date = new Date();
//		 String dString = new SimpleDateFormat("yyyy-MM-dd").format(date);
//		 DateTime time = new DateTime(dString);
//		 time = time.plusDays(30);
//		 System.out.println(time.toString());
//		 DateTime time = new DateTime();
		//		
		// DateTime mDateTime = time.minusDays(30);
		// System.out.println(mDateTime.format("YYYY-MM-DD"));
		// String nowTime = ExmayDateUtil.toString(now, Format_DateTime);
		// DateTime time = new DateTime(nowTime);
		// System.out.println(time.getEndOfMonth().getDay());
		// ExmayTimeInterval interval = getDateTime(THE_YEAR_BEFORE_LAST);
		// System.out.println(ExmayDateUtil.toString(interval.getStartTime(),
		// ExmayDateUtil.Format_DateTime));
		// System.out.println(ExmayDateUtil.toString(interval.getEndTime(),ExmayDateUtil.Format_DateTime));
		// String time = "2010-11-19 20:22:59";
		// DateTime dt = new DateTime(time);
		// System.out.println(dt.getWeekIndex());
		// org.joda.time.DateTime dateTime =
		// DateTimeFormat.forPattern(Format_DateTime).parseDateTime(time);
		// System.out.println(dateTime.getDayOfWeek());
	}

	
}
