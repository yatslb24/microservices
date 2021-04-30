package com.yats.microserv.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yats.microserv.user.entity.User;
import com.yats.microserv.user.service.UserService;
import com.yats.microserv.user.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {
	
@Autowired
private UserService userService;

 @PostMapping("/")	
 public User save(@RequestBody User user) {
	 return userService.save(user) ;
 }
 @GetMapping("/{id}")
 public ResponseTemplateVO findUserById(@PathVariable("id")Long userId) {
	return  userService.findUser(userId);
 }
}
