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
public class Driver {
    String name ;
    int points ;

    public Driver(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", points=" + points + '}';
    }
    
    
}
