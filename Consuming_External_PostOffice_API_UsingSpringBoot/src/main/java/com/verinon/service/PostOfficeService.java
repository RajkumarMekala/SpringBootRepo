package com.verinon.service;

import com.verinon.output.PostOfficeResponseBean;

public interface PostOfficeService {
	
	public PostOfficeResponseBean getPostOfficeByCity(String cityValue);

}
