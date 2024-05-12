/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamza.syrage;

/**
 *
 * @author user
 */
public class Car {
    String team ;
    Driver driver ;

    public Car(String team, Driver driver) {
        this.team = team;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" + "team=" + team + ", " + driver + '}';
    }
   
}
