package com.yats.microserv.user.service;

import com.yats.microserv.user.entity.User;
import com.yats.microserv.user.vo.ResponseTemplateVO;

public interface UserService {
	
	public User save(User user);
	public ResponseTemplateVO findUser(Long userId);

}
