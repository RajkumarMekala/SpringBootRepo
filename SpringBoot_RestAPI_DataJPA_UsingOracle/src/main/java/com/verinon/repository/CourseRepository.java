package com.verinon.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
