package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;


public class DateTest {

	public static void main(String[] args) {
		MyDate[] myDates = new MyDate[5];
		myDates[0] = new MyDate(2,6,2020); 
		myDates[1] = new MyDate(7,8,2020); 
		myDates[2] = new MyDate(1,2,2020); 
		myDates[3] = new MyDate(3,6,2020); 
		myDates[4] = new MyDate(9,4,2020); 
		
		DateUtils dateUtils = new DateUtils();
		dateUtils.SortDate(myDates);
		for(int i =0 ;i <5 ;i ++) {
			myDates[i].print(2);
		}
	}

}
