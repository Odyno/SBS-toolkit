package net.staniscia.sbs1.msg;

/**
 * Created by staniscia on 23/01/14.
 */
public interface MSG4 extends SBS1Message {
    String getSessionID();

    void setSessionID(String sessionID);

    String getAircraftId();

    void setAircraftId(String aircraftId);

    String getHexIdent();

    void setHexIdent(String hexIdent);

    String getFlightId();

    void setFlightId(String flightId);

    String getDateMessageGenerated();

    void setDateMessageGenerated(String dateMessageGenerated);

    String getTimeMessageGenerated();

    void setTimeMessageGenerated(String timeMessageGenerated);

    String getDataMessageLogged();

    void setDataMessageLogged(String dataMessageLogged);

    String getTimeMessageLogged();

    void setTimeMessageLogged(String timeMessageLogged);

    String getGroundSpeed();

    void setGroundSpeed(String groundSpeed);

    String getTrack();

    void setTrack(String track);

    String getVerticalRate();

    void setVerticalRate(String verticalRate);
}
