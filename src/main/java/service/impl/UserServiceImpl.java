package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import po.Staff;

import dao.UserDao;

import service.UserService;
@Service("userservice")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public String getNameByPassword(String password) {
		List<Staff> list =userDao.find("from Staff as s where s.password='"+password+"'");
		Staff s;
		if(list.size()>0){
		s=list.get(0);
		return s.getUsername();
		}else
		return null;
	}

}
