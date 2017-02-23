package com.wxjfkg.mybatis;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxjfkg.BootstrapApplication;
import com.wxjfkg.mybatis.entity.User;
import com.wxjfkg.mybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootstrapApplication.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testFindAll() {
		List<User> userList = userService.findAll();

		Assert.assertEquals(1, userList.size());
	}
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("guorui");
		user.setGender("1");
		user.setAge(20);
		int row = userService.save(user);
		Assert.assertEquals(1, row);
	}

}
