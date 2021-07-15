package com.company.homework38.taskA;

import com.company.homework38.ConnectionBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrenersListDB extends ConnectionBase {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    //TaskA Вывести список тренеров и их заработных плат в консоль
    public void getTrenersNameWithSalary() {
        try {
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select t.full_name, st.salary \n" +
                                                    "from treners t join sport_types st on t.type_of_sport  = st.id");
            while (resultSet.next()){
                System.out.println(resultSet.getString("full_name") + "    " + resultSet.getString("salary"));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    //TaskA Вывести итоговую заработную плату по всем тренерам.
    public int getTrenersSalarySum(){
        try{
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select sum(salary)\n" +
                                                    "from treners t join sport_types st on t.type_of_sport  = st.id;");

            if (resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }
    //TaskA Если фамилия тренера состоит из более чем 3 символов дописать «молодец» в консоль.
    public void addMolodecToTrenersName(){
        try{
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select t.full_name from treners t \n" +
                                                    "where char_length(full_name) > 3; ");
            while (resultSet.next()){
                System.out.println(resultSet.getString("full_name") + "  molodec");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
