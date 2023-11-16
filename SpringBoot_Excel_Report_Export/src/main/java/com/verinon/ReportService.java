package com.verinon;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions.SetOptions.SetNulls;
import org.springframework.stereotype.Service;

import com.verinon.binding.Course;

@Service
public class ReportService {
	@Autowired
	private CourseRepository courseRepository;

	public void generateExcelFile(HttpServletResponse response) throws IOException {
		List<Course> courses = courseRepository.findAll();

		HSSFWorkbook workBook = new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet("Course Info");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CNAME");
		row.createCell(2).setCellValue("PRICE");
		int dataRowIndex = 1;

		for (Course course : courses) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(course.getId());
			dataRow.createCell(1).setCellValue(course.getName());
			dataRow.createCell(2).setCellValue(course.getPrice());
			dataRowIndex++;

		}
		ServletOutputStream ops = response.getOutputStream();
		workBook.write(ops);
		workBook.close();
		ops.close();

	}
}
