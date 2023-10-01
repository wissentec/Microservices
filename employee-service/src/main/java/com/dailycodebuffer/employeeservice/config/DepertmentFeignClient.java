package com.dailycodebuffer.employeeservice.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dailycodebuffer.employeeservice.model.Department;


@FeignClient(name="department-service")
public interface DepertmentFeignClient {
	
	//@FeignClient(value="depertementservice", url="http://localhost:9090")	
@RequestMapping(method = RequestMethod.GET,value = "/department")
	 List<Department> getDepertment();

}
