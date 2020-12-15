/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Usuarios;
import com.selmec.utils.dao.IGenericDao;
import java.util.List;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rrojase
 */
public class UserService implements IUserService {

    public UserService() {
    }
    private IGenericDao<Usuarios, Integer> dao;

    @Autowired
    public void setDao(IGenericDao< Usuarios, Integer> daoToSet) {
        dao = daoToSet;
        dao.setClazz(Usuarios.class);
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios user = this.findByName(username);
        if (null == user) {
            throw new UsernameNotFoundException("The user with name " + username + " was not found");
        }
        return user;
    }

    @Transactional(readOnly = true)
    @Override
    public Usuarios findByName(String name) {

        String hql = "from Usuarios u where u.email = '" + name + "'";
        Query query = dao.getCurrentSession().createQuery(hql);
        List<Usuarios> users = query.list();
        if (users.isEmpty()) {
            return null;
        }
        return users.iterator().next();
    }

}
