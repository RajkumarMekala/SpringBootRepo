package com.verinon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verinon.binding.Course;
import com.verinon.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		// TODO Auto-generated method stub
		Optional<Course> optional = courseRepo.findById(cid);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();

	}

	@Override
	public String deleteById(Integer cid) {
		
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
		}
		return "Deleted Successfully....";
	}

}
