package com.verinon.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.verinon.course.output.CourseResponseBean;

@Service("CourseSeviceImpl")
public class CourseSeviceImpl implements CourseService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	public CourseResponseBean getCourseDetailsById(Integer cid) {

		System.out.println("course id is: " + cid);
		String url = "http://172.16.5.217:8888/course/";
		url = url.concat(String.valueOf(cid)); //
		System.out.println("The URL is:" + url);

		return restTemplate.exchange(url, HttpMethod.GET, null, CourseResponseBean.class).getBody();

	}

	@Override
	public List<CourseResponseBean> getCourseDetails() {
		return restTemplate.exchange("http://172.16.5.217:8888/courses", HttpMethod.GET, null, List.class).getBody();
	}

}
