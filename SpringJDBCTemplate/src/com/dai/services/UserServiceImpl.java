package com.dai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.dai.dao.UserDao;
import com.dai.domain.User;


public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public void insertData(User user) {
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}

	@Override
	public void deleteData(String id) {
		userdao.deleteData(id);
		
	}

	@Override
	public User getUser(String id) {
		return userdao.getUser(id);
	}

	@Override
	public void updateData(User user) {
		userdao.updateData(user);
		
	}
        
        @Override
        public boolean verificaUser(String id){
            return userdao.verificaUser(id);
        }

	
}
