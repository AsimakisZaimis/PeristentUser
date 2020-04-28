/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;

/**
 *
 * @author mac
 */
public class UserImpl implements IUser {
    // BUSINESS LOGIC
    @Override
    public User findById(int id) {
        if(id <= 0) 
            return null;
        else {
            // DAO = Data Access Object
            dao.UserDaoImpl userDao = new dao.UserDaoImpl();
            return userDao.findById(id);
        } 
    }
    
}
