/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Blagovesta
 */
public class Info {
    private String destination;
    private String airport;
    private boolean vuelta;
    
    
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public boolean isVuelta() {
        return vuelta;
    }

    public void setVuelta(boolean vuelta) {
        this.vuelta = vuelta;
    }
    
    
 public void setDestination( String destination){
     this.destination = destination;
 }   
      
public String getDestination (){
    return destination;
}
}
