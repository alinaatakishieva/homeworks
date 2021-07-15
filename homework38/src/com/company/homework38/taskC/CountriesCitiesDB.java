package com.company.homework38.taskC;

import com.company.homework38.ConnectionBase;

import java.sql.*;
import java.util.Scanner;

public class CountriesCitiesDB extends ConnectionBase {
    //Выбрать все города страны, название которой начинается на букву «К»
    public void getCountriesCitiesNamesWithK(){
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select c.country_name, c2.city_name from countries c \n" +
                                                            "join cities c2 on c.id  = c2.fk_country_id \n" +
                                                            "where c.country_name like 'K%' or c2.city_name like 'K%'") ) {
            while(resultSet.next()) {
                    System.out.println(resultSet.getString("country_name") + "    " + resultSet.getString("city_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Подсчитать общее количество человек в городах каждой страны.
    public void getTotalCitiesPopulation(){
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select sum(city_population) from cities c2\n" +
                                                            "where c2.fk_country_id = 1\n" +
                                                            "union \n" +
                                                            "select sum(city_population) from cities c2\n" +
                                                            "where c2.fk_country_id = 2\n" +
                                                            "union \n" +
                                                            "select sum(city_population) from cities c2\n" +
                                                            "where c2.fk_country_id = 3") ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Добавить возможность добавления понятия «Гос. Языка» к каждой стране.
    public void getAbilityToAddOfficialLanguage(){
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to set an official language?");
        String answer = scanner.nextLine();
        if(answer.equals("yes")){
            try {
                PreparedStatement preparedStatement = connect().prepareStatement("update countries\n" +
                                                                                    "set official_language = ?\n" +
                                                                                    "where country_name = ?");
                System.out.println("Enter an official language");
                String language = scanner.nextLine();
                System.out.println("Enter country id");
                String country  = scanner.nextLine();
                preparedStatement.setString(1, language);
                preparedStatement.setString(2, country);
                statement = connect().createStatement();
                resultSet = statement.executeQuery("select country_name, official_language from countries");
                while (resultSet.next()){
                    System.out.println(resultSet.getString("country_name") + " " + resultSet.getString("official_language"));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                    try {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    try {
                        if (statement != null) {
                            statement.close();
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
            }
        } else if (answer.equals("нет")){
            System.out.println("Спасибо");
            System.exit(0);
        }
    }
}
