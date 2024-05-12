package hamza.syrage;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
   
    System.out.println("enter the numbre of drivers");  
    
    int numbreOfDrivers = in.nextInt();
   
    ArrayList <Driver> driverList = new ArrayList();
    
    for (int i = 0; i < numbreOfDrivers; i++) {
         System.out.println("enter driver info");
        String n = in.next() ;
        int p = in.nextInt();
       driverList.add(new Driver(n,p)) ;
    }
    
    ArrayList <Car> carList = new ArrayList();
    for (int i = 0; i < numbreOfDrivers; i++) {
        System.out.println("enter team name");
        String t = in.next();
        carList.add(new Car(t,driverList.get(i))) ;
    }
    for(Car c :carList) {
        System.out.println(c);
    }
    int max=0,index=0 ;
    for(Car c :carList) {
        
       if (max < c.driver.points ) {
                max =c.driver.points ;
               index= carList.indexOf(c);
        }
   }
    for (int i = 0; i < 2; i++) {
        System.out.println("");
    }
    System.out.println("winer team is");
    System.out.println(carList.get(index));
    
    
    
 }   
}