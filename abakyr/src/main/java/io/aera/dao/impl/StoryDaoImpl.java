package io.aera.dao.impl;

import io.aera.dao.StoryDao;
import io.aera.entity.Story;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

public class StoryDaoImpl extends BasicDaoImpl implements StoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    public StoryDaoImpl(Class<Story> entityClass) {
        super(entityClass);
    }
}
