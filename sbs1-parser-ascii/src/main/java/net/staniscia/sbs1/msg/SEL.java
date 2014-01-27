package net.staniscia.sbs1.msg;

/**
 * Created by staniscia on 23/01/14.
 */
public interface SEL extends SBS1Message {

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

    String getCallsign();

    void setCallsign(String callsign);
}
