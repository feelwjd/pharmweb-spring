package com.example.pharmwebspring.Service.Impl;

import com.example.pharmwebspring.DAO.Dao;
import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private Dao dao;

    @Override
    public void insertPharmacy(Pharmacy pharmacy) {
        dao.setPharmacy(pharmacy);
    }

    @Override
    public void insertUser(User user) {
        dao.setUser(user);
    }

    @Override
    public Pharmacy getPharmacy(Login login) { return dao.getPharmacy(login); }

    @Override
    public User getUser(Login login) { return dao.getUser(login); }

}
