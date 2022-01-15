package com.tms.lesson15.persistance;

import com.tms.lesson15.entity.Car;
import com.tms.lesson15.entity.TYPE;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarService implements Entity<Car> {

    private Connection connect;

    private static final String ID_COL = "id";
    private static final String MODEL_COL = "model";
    private static final String TYPE_COL = "type";
    private static final String YEAR_COL = "year";

    public CarService(Connection connect) {
        this.connect = connect;
    }

    @Override
    public void save(Car car) {
        try {

            PreparedStatement statement = connect.prepareStatement("insert into car (model, type, year) values (?, ?, ?)");
            statement.setString(1, car.getModel());
            statement.setBoolean(2, car.getType() == TYPE.PASSENGER ? true : false);
            statement.setDate(3, Date.valueOf(car.getYear()));
            statement.executeUpdate();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public boolean update(Car car) {

        try {
            Car carFromDB = get(car.getId());
            if (Objects.isNull(carFromDB)) {
                throw new SQLException("no car for updating");
            }
            PreparedStatement statement = connect.prepareStatement("update car set model = ?, type = ?, year = ? where id = ?");
            statement.setString(1, car.getModel());
            statement.setBoolean(2, car.getType() == TYPE.PASSENGER);
            statement.setDate(3, Date.valueOf(car.getYear()));
            statement.setInt(4, car.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Car car) {
        try {
            int id = car.getId();
            if (id == 0) {
                throw new SQLException("no car in database");
            }
            PreparedStatement statement = connect.prepareStatement("delete from car where id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return false;
    }

    @Override
    public Car get(Integer id) {

        Car car = null;

        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from car where id = " + id);

            if (resultSet.next()) {
                int idBD = resultSet.getInt(ID_COL);
                String model = resultSet.getString(MODEL_COL);
                boolean type = resultSet.getBoolean(TYPE_COL);
                String year = resultSet.getDate(YEAR_COL).toString();
                car = new Car(idBD, model, TYPE.getBool(type), year);
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return car;
    }

    @Override
    public List<Car> getAll() {

        List<Car> cars = new ArrayList<>();

        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from car");

            while (resultSet.next()) {
                int idBD = resultSet.getInt(ID_COL);
                String model = resultSet.getString(MODEL_COL);
                boolean type = resultSet.getBoolean(TYPE_COL);
                String year = resultSet.getDate(YEAR_COL).toString();
                Car car = new Car(idBD, model, TYPE.getBool(type), year);
                cars.add(car);
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return cars;
    }
}
