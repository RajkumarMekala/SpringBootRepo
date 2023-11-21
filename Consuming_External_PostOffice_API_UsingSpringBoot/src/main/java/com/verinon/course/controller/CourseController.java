package com.verinon.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verinon.course.output.CourseResponseBean;
import com.verinon.course.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping(value = "/courseById", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseResponseBean getCourseDetailsById(@RequestParam Integer id) {
		CourseResponseBean courseDetails = courseService.getCourseDetailsById(id);
		return courseDetails;

	}

	@GetMapping(value = "/courses", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CourseResponseBean> getCourseDetails() {
		List<CourseResponseBean> courseDetails = courseService.getCourseDetails();
		return courseDetails;

	}

}
