package com.selmec.kitpruebas.services;

import com.selmec.kitpruebas.Models.Usuarios;
import com.selmec.utils.dao.IGenericDao;
import com.selmec.utils.services.BaseServices;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuariosServices extends BaseServices<Usuarios, Integer> implements IUsuariosServices {

    @Autowired
    public void setDao(IGenericDao<Usuarios, Integer> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Usuarios.class);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuarios GetByUsername(String username) {
        List<Usuarios> usuarios = this.dao.getCurrentSession().createCriteria(Usuarios.class).add(Restrictions.eq("email", username)).list();
        if (usuarios.isEmpty()) {
            return null;
        }
        return (Usuarios) usuarios.get(0);
    }

    @Transactional
    @Override
    public void Save(Usuarios usuarios) {
        String password = KeyGenerators.string().generateKey();
        usuarios.setPassword(password);
        dao.create(usuarios);
    }

}
