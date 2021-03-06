/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.ArrayList;

/**
 *
 * @author Vimukthi Weerasiri
 */
public class Trip {

    int routeID;
    int[] routeStationIdList;
    String[] estimatedArrivalTimeForStations;
    String[] estimatedArrivalTime;
    boolean[] passedStationIds;

    float startedLatitude;
    float startedLongitude;
    int passedCheckingFactor;
    int nearestLocationId;

    float[][] wayPoints;
    int[][] IdPreviousNext;

    //making singleton
    public static ArrayList<Trip> trip = new ArrayList<>();

    private Trip(int routeId) {
        routeID = routeId;
        setTripData();
        estimatedArrivalTimeForStations();
    }

    public static Trip getInstance(int routeID) {
        for (int i = 0; i < trip.size(); i++) {
            if (trip.get(i).routeID == routeID) {
                return trip.get(i);
            }
        }
        Trip newTrip = new Trip(routeID);
        trip.add(newTrip);

        return newTrip;
    }

    //////////////////////
    public int getIdOfNearestLocation(int latitude, int longitude) {
        //get ID from the array
        return 0;
    }

    public float[] getCordinatesOfTheStations(int stationID, int latitude, int longitude) {
        return null;
    }

    public void countDelayToStations() {
    }

    public void didStationPassed() {
    }

    public void estimateTimeForAllStations() {
    }

    public void getTimeOfNeareestLocation() {
    }

    public void updateRasberryHandler() {
        RasberryHandler.getInstance().updateFromTrip(routeID, routeStationIdList, passedStationIds, estimatedArrivalTime);
    }

    private void setTripData() {
        //initialize routeStationIds
        //initialize waypoints[][]
        //initialize IdpreviousNext
    }

    private void estimatedArrivalTimeForStations() {
    }

    public void execute(LocationBox locationBox) {
    }
}
