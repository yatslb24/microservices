package com.yats.microserv.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.yats.microserv.user.entity.User;
import com.yats.microserv.user.repo.UserRepository;
import com.yats.microserv.user.vo.Department;
import com.yats.microserv.user.vo.ResponseTemplateVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	public ResponseTemplateVO findUser(Long userId) {
		 ResponseTemplateVO  resp = new ResponseTemplateVO();
		 User user = userRepo.findUserById(userId);
		 Department department=	 restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(), Department.class);
		 resp.setUser(user);resp.setDepartment(department);
		 return resp;
	}

}
