package com.goaltime.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.goaltime.domain.Task;

@Repository("taskDao")
public class TaskDaoImpl implements TaskDao {

    @Resource
    private SessionFactory sessionFactory;

    @Resource
    private JdbcOperations jdbcOperations;

    //    @Override
    //    public Branch getTask(Long id) {
    //
    //        String sql = "select *"+
    //                " from branch" +
    //                " where ID= :branch_id";
    //
    //        @SuppressWarnings("unchecked")
    //        List<Branch> results = sessionFactory.getCurrentSession().createSQLQuery(sql)
    //        .addEntity(Branch.class)
    //        .setParameter("branch_id", id)
    //        .list();
    //
    //        return results.size() > 0 ? results.get(0) : null;
    //    }



    //    @Transactional
    //    @Override
    //    public List<Task> getTasks(String userName) {
    //
    //        String sql = "SELECT *" +
    //                " FROM TASK_LIST" +
    //                " WHERE USERNAME = :userName";
    //
    //        Session session = sessionFactory.openSession();
    //        TypedQuery<Task> query = session.createQuery(sql)
    //                .setParameter("userName", userName);
    //
    //
    //    }

    @Override
    public List<Task> getTasks(String userName) {

        String sql = "SELECT *" +
                " FROM TASK_LIST" +
                " WHERE USERNAME = :userName";

        List<Task> taskList = new ArrayList<Task>();
        Session session = sessionFactory.openSession();
        for (Object oneObject : session.createQuery(sql)
                .setParameter("userName", userName)
                .getResultList()) {
            taskList.add((Task)oneObject);
        }
        session.close();
        return taskList;
    }

    public Task getTaskById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void addTask() {
        // TODO Auto-generated method stub

    }

    public void updateTask(Task task) {
        // TODO Auto-generated method stub

    }


    //    public List<Admin> getAdmins() {
    //        List<Admin> AdminList = new ArrayList<Admin>();
    //        Session session = factory.openSession();
    //        for (Object oneObject : session.createQuery("FROM Admin").getResultList()) {
    //            AdminList.add((Admin)oneObject);
    //        }
    //        session.close();
    //        return AdminList;
    //    }
    //
    //
    //
    //
    //
    //
    //    public List<Admin> getAdmins() {
    //        Session session = factory.openSession();
    //        TypedQuery<Admin> query = session.createQuery("FROM Admin");
    //        List<Admin> result = query.getResultList();
    //        session.close();
    //        return result;
    //    }
    //
    //
    //    @Transactional
    //    @SuppressWarnings("unchecked")
    //    @Override
    //    public List<TextNote> getAllTextNotesByBranchId(Long branchNumber) {
    //
    //        String sql = "SELECT *"+
    //                " FROM TEXT_NOTE" +
    //                " WHERE BRANCH_ID = :branchNumber " +
    //                " AND ( END_DT is null or END_DT > GETDATE())";
    //
    //        List<TextNote> textNotes = sessionFactory.getCurrentSession().createSQLQuery(sql)
    //                .addEntity(TextNote.class)
    //                .setParameter("branchNumber", branchNumber)
    //                .list();
    //
    //        return textNotes;
    //    }
    //
    //
    //
    //
    //

}
