package com.hibernate.lesson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelStudy {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();//创建会话
        Session se = sf.openSession();

        StudyEntity sty = (StudyEntity) se.get(StudyEntity.class,2);

        System.out.println(sty.getName() + " " + sty.getLesson());

        sty.setLesson("python");
        sty.setName("spring");

        Transaction tx = se.beginTransaction();

        se.update(sty);
        tx.commit();

        se.delete(sty);

        sty = (StudyEntity) se.get(StudyEntity.class,2);

        System.out.println(sty.getName() + " " + sty.getLesson());

    }
}
