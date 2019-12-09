package com.githubslashnathantyler.repositories;

import com.githubslashnathantyler.model.Bl3Manufacturer;

import javax.persistence.EntityManager;
import java.util.List;

public class Bl3ManufacturerRepository {
    private EntityManager manager;

    public Bl3ManufacturerRepository(EntityManager manager) {
        this.manager = manager;
    }

    public List<Bl3Manufacturer> findAll() {
        // query.unwrap(org.hibernate.Query.class).getQueryString()
        // query.unwrap(org.apache.openjpa.persistence.QueryImpl.class).getQueryString()

//        System.out.println("hdvzghdjsgdhs " + manager.createQuery("from Bl3Manufacturer").unwrap(org.hibernate.Query.class).getQueryString() + " kdhgfhgsdf");
//        CriteriaBuilder cb = manager.getCriteriaBuilder();
//        CriteriaQuery<Bl3Manufacturer> q = cb.createQuery(Bl3Manufacturer.class);
//        Root<Bl3Manufacturer> b = q.from(Bl3Manufacturer.class);
//        q.select(b).orderBy(cb.desc(b.get("id")));
//        TypedQuery<Bl3Manufacturer> findAllM = manager.createQuery(q);
//        System.out.println("jkhgdhgshgd " + findAllM.unwrap(org.hibernate.query.Query.class).getQueryString() + " dfgdjhfgdgf");

        return manager.createQuery("from Bl3Manufacturer").getResultList();
    }
}
