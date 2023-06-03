package airlinereservationsystem;


import airlinereservationsystem.Functions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Blagovesta
 */
public class TimeAndPlace implements Functions{

    private String airport;
    private int hoursFlight;
    private int minutesFlight;
    
    public int getHoursFlight() {
        return hoursFlight;
    }
 
    public int getMinutesFlight() {
        return minutesFlight;
    }

    public void setDuration(int hoursFlight, int minutesFlight) {
        this.hoursFlight = hoursFlight;
        this.minutesFlight = minutesFlight;
    }

   
   
    

    

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }
    
    @Override
    public void airportDest(String place)  {
        if (place.equals("Paris"))  setAirport("Charles de Gaulle");
        if (place.equals("Berlin"))  setAirport("Schönefeld");
        if (place.equals("Londres"))  setAirport("Heathrow");
        if (place.equals("Amstredam"))  setAirport("Amsterdam Schipol");
        if (place.equals("Roma"))  setAirport("Fiumicino");
        if (place.equals("Madrid"))  setAirport("Barajas");
        if (place.equals("Bucarest"))  setAirport("Otopeni");
        if (place.equals("Atenas"))  setAirport("Eleftherios Venizelos");
        if (place.equals("Bruselas"))  setAirport("Brusssel- Natonal");
        if (place.equals("Lisboa"))  setAirport("Humberto Delgado");
        if (place.equals("Estocolmo"))  setAirport("Skavsta");
        if (place.equals("Budapest"))  setAirport("Liszt Ferenc");
        if (place.equals("Berna"))  setAirport("Belp");
        if (place.equals("Belgrado"))  setAirport("Nikola Tesla");
        if (place.equals("Copenhague"))  setAirport("Kastrup");
        if (place.equals("Helsinki"))  setAirport("Vantaa");
        if (place.equals("Bratislava"))  setAirport("M. R. Stefanik");
        if (place.equals("Oslo"))  setAirport("Gardermoen");
        if (place.equals("Dublin"))  setAirport("Dublin");
        if (place.equals("Zagreb"))  setAirport("Franjo Tudman");
        if (place.equals("Lubliana"))  setAirport("Lubljana J. Pucnik");
        if (place.equals("Luxemburgo"))  setAirport("Luxembourg");
        if (place.equals("Monaco"))  setAirport("Heliport de Monaco");
    }

    @Override
    public void duration(String place) {
        if (place.equals("Paris"))  setDuration(3, 0);
        if (place.equals("Berlin"))  setDuration(2,15);
        if (place.equals("Londres"))  setDuration(3,25);
        if (place.equals("Amstredam"))  setDuration(2,40);
        if (place.equals("Roma"))  setDuration(1,50);
        if (place.equals("Madrid")) setDuration(3,25);
        if (place.equals("Bucarest"))  setDuration(1,15);
        if (place.equals("Atenas")) setDuration(1,20);
        if (place.equals("Bruselas"))  setDuration(2,40);
        if (place.equals("Lisboa"))  setDuration(4,25);
        if (place.equals("Estocolmo"))  setDuration(3,0);
        if (place.equals("Budapest"))  setDuration(1,20);
        if (place.equals("Berna"))  setDuration(3,0);
        if (place.equals("Belgrado"))  setDuration(1,10);
        if (place.equals("Copenhague"))  setDuration(2,50); 
        if (place.equals("Helsinki"))  setDuration(4,30);
        if (place.equals("Bratislava"))  setDuration(1,30);
        if (place.equals("Oslo"))  setDuration(4,45);
        if (place.equals("Dublin"))  setDuration(3,50);
        if (place.equals("Zagreb"))  setDuration(1,30);
        if (place.equals("Lubliana"))  setDuration(3,15);
        if (place.equals("Luxemburgo"))  setDuration(3,55);
        if (place.equals("Monaco"))  setDuration(2,35);
    }
    
}
