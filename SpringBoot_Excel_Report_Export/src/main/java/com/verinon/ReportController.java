package com.verinon;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws IOException {
		
		response.setContentType("application/octet-stream");
		String headerKey="Content-Disposition";
		String headerValue="attachment; filename=course.xls";
		response.setHeader(headerKey, headerValue);
		reportService.generateExcelFile(response);
		
	}

}
