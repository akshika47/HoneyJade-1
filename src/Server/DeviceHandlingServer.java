/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Vimukthi Weerasiri
 */
public class DeviceHandlingServer {

    private static DeviceHandlingServer deviceHandlingServer;

    private DeviceHandlingServer() {

    }

    public static DeviceHandlingServer getInstance() {
        if (deviceHandlingServer == null) {
            return deviceHandlingServer;
        }
        return deviceHandlingServer;
    }

    public void executeLocation(LocationBox locationBox) {
    }

    public void saveLog(String log) {
    }

    public void saveLocation(LocationBox locationBox) {
    }
}
