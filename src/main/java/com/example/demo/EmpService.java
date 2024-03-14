package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo emprepo;
	
	@Autowired
	private AddressRepo addrepo;
	
	@Transactional(rollbackOn = Exception.class)
	public void getdata() {
		
		Emp emp =new Emp();
		emp.setEname("abhi");
		emp.setEsalary(1000.0);
		
	  Emp save = emprepo.save(emp);
	  
	  Address add =new Address();
	    add.setCity("HSN");
	    add.setState("KAR");
	    add.setCountry("IND");
        add.setEid(save.getEmpid());	    
	    addrepo.save(add);
	}
	
	public void fetch(String n) {
		List<Object[]> gt = emprepo.getdetails(n);
		gt.forEach(x->System.out.println(x[0]+"-----"+x[1]+"-----"+x[2]+"-----"+x[3]+"-----"+x[4]+"-----"+x[5]+"  "));
	}
	
	
	
	

}
