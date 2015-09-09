package com.stu;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.entity.User;
import com.entity.UserMixin;
import com.mapper.UserMapper;
import com.mapper.UserMixinMapper;


public class UserTest extends BaseTest{
	
	@Test
	public void userTest() {
		 SqlSession sqlSession = sqlSessionFactory.openSession(); 
		 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		 
		 User param = new User();
		 param.setId(1);
		 User user = userMapper.selectUser(param);
		 System.out.println(user.getName());
	}

	// 一个实体中包含多个实体的例子
	@Test
	public void mixinTest() {
		 SqlSession sqlSession = sqlSessionFactory.openSession(); 
		 UserMixinMapper userMixinMapper = sqlSession.getMapper(UserMixinMapper.class);
		 
		 List<UserMixin> list = userMixinMapper.selectUserMixins();
		 System.out.println("size ->" + list.size());
		 for(UserMixin um : list) {
			 System.out.println(um.getUser().getName() +" ---> " + um.getUserqq().getQq());
		 }
		 sqlSession.commit();
	}
	
	@Test
	public void usersTest() {
		 SqlSession sqlSession = sqlSessionFactory.openSession(); 
		 UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		 
		 List<User> users = userMapper.selectUsers();
		 System.out.println(users.size());
	}
}
