package com.company.homework38.taskB;

import com.company.homework38.ConnectionBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsDB extends ConnectionBase {

    //TaskB Вывести текст «в группе N студентов» в консоль.
    public int getStudentsCount(){
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select count(*) from students s") ) {
            if(resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
    //TaskB Вывести список всех групп (ID и наименование) в консоль.
    public void getGroupsName(){
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select sg.\"name\", sg.id from students_groups sg") ) {
            while(resultSet.next()) {
                System.out.println(resultSet.getString("id") + " -  " + resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
