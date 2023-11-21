package com.verinon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.verinon.output.PostOfficeDetailsBean;
import com.verinon.output.PostOfficeResponseBean;

@Service("PostOfficeSeviceImpl")
public class PostOfficeSeviceImpl implements PostOfficeService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	public PostOfficeResponseBean getPostOfficeByCity(String cityValue) {

		String url = "https://api.postalpincode.in/postoffice/{city}";
		url = url.replace("{city}", cityValue);
		System.out.println("The URL is :" + url);
		ResponseEntity<PostOfficeResponseBean[]> postOfficeResponseBeanEntity = restTemplate.getForEntity(url,
				PostOfficeResponseBean[].class);
		System.out.println("The status is :" + postOfficeResponseBeanEntity.getStatusCodeValue());
		PostOfficeResponseBean[] postOfficeResponseBeans = postOfficeResponseBeanEntity.getBody();
		for (PostOfficeResponseBean postOfficeResponseBean : postOfficeResponseBeans) {
			List<PostOfficeDetailsBean> postOffice = postOfficeResponseBean.getPostOffice();
			for (PostOfficeDetailsBean officeDetailsBean : postOffice) {
				System.out.println("The Name :" + officeDetailsBean.getName() + " Circle :"
						+ officeDetailsBean.getCircle() + " District :" + officeDetailsBean.getDistrict());
			}

		}
		return postOfficeResponseBeans[0];
	}

	/*
	 * @Override public PostOfficeResponseBean getPostOfficeByCity(String cityValue)
	 * {
	 * 
	 * String url = "https://api.postalpincode.in/postoffice/{city}"; url =
	 * url.replace("{city}", cityValue); System.out.println("The URL is :" + url);
	 * 
	 * return restTemplate.exchange(url, HttpMethod.GET, null,
	 * PostOfficeResponseBean.class).getBody(); }
	 */

}
