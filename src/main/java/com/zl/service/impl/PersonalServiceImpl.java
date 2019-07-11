package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.PersonalDao;
import com.zl.pojo.Personal;
import com.zl.service.PersonalService;
@Service
public class PersonalServiceImpl implements PersonalService {
	@Autowired
	private PersonalDao pd;
	@Override
	public Personal queryPersonalById(int id) {
		return pd.queryPersonalById(id);
	}

	@Override
	public int addPersonal(Personal personal) {
		return pd.addPersonal(personal);
	}

	@Override
	public int updatePersonal(Personal personal) {
		return pd.updatePersonal(personal);
	}

}
