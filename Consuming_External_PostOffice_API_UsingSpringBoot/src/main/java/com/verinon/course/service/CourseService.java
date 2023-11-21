package com.verinon.course.service;

import java.util.List;

import com.verinon.course.output.CourseResponseBean;

public interface CourseService {
	public CourseResponseBean getCourseDetailsById(Integer cid);
	public List<CourseResponseBean> getCourseDetails();

	//CourseResponseBean getCourseDetails(String cid);

}
