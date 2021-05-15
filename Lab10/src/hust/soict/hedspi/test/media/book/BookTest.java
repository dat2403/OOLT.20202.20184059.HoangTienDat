package hust.soict.hedspi.test.media.book;

import hust.soict.hedspi.aims.media.book.Book;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("4", "Hoang4", "category", 15);
		book1.setContentString("Kim Trọng vì tương tư Kiều nên "
				+ "đã quên hết cả thú vui hàng ngày, tìm cách chuyển đến "
				+ "ở gần nhà Kiều. Sau đó mấy tuần trăng thì "
				+ "Kim Trọng – Kiều đã gặp nhau, Kiều đã nhận lời Kim Trọng "
				+ "và họ đã trao đổi món kỷ vật cho nhau. "
				+ "Nhiều lần Kim Trọng cũng muốn vượt rào "
				+ "nhưng Thuý Kiều là một người sắc sảo và biết giữ mình, "
				+ "cô đã thuyết phục được Kim Trọng "
				+ "chờ đợi tới ngày hai người kết hôn");
		
		System.out.println(book1);
		book1.setContentString("Dai hoc Back Khoa Ha Noi");
		System.out.println(book1);
	}
}
