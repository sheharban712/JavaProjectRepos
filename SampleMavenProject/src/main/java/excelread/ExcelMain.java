package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ReadExcelFile.readStringData(3, 0));
		System.out.println(ReadExcelFile.readIntData(3, 1));

	}

}
