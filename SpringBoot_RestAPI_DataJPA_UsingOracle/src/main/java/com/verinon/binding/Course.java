package com.verinon.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_DTLS")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private Double price;

}
