package net.staniscia.sbs1.msg;

import net.staniscia.sbs1.InvalidMessageBobyException;

/**
 * Created by staniscia on 23/01/14.
 */
class SBS1FullMessage implements MSG1, MSG2, MSG3, MSG4, MSG5, MSG6, MSG7, MSG8, SEL, ID, AIR, STA, CLK {


    private StatusFlagsType statusFlagsType;

    /**
     * Field 3: Database Session record number
     */
    private String sessionID;

    /**
     * Field 4:  AircraftID 	 Database Aircraft record number
     */
    private String aircraftId;

    /**
     * Field 5:
     * HexIdent 	 Aircraft Mode S hexadecimal code
     */
    private String hexIdent;

    /**
     * Field 6:
     * FlightID 	 Database Flight record number
     */
    private String flightId;

    /**
     * Field 7:
     * Date message generated 	  As it says
     */
    private String dateMessageGenerated;

    /**
     * Field 8:
     * Time message generated 	  As it says
     */
    private String timeMessageGenerated;

    /**
     * Field 9:
     * Date message logged 	  As it says
     */
    private String dataMessageLogged;

    /**
     * Field 10:
     * Time message logged 	  As it says
     */
    private String timeMessageLogged;

    /**
     * Field 11:
     * Callsign 	 An eight digit flight ID - can be flight number or registration (or even nothing).
     */
    private String callsign;

    /**
     * Field 12:
     * Altitude 	 Mode C altitude. Height relative to 1013.2mb (Flight Level). Not height AMSL..
     */
    private String altitude;

    /**
     * Field 13:
     * GroundSpeed 	 Speed over ground (not indicated airspeed)
     */
    private String groundSpeed;

    /**
     * Field 14:
     * Track 	 Track of aircraft (not heading). Derived from the velocity E/W and velocity N/S
     */
    private String track;


    /**
     * Field 15:
     * Latitude 	 North and East positive. South and West negative.
     */
    private String latitude;


    /**
     * Field 16:
     * Longitude 	 North and East positive. South and West negative.
     */
    private String longitude;


    /**
     * Field 17:
     * VerticalRate 	 64ft resolution
     */
    private String verticalRate;

    /**
     * Field 18:
     * Squawk 	 Assigned Mode A squawk code.
     */
    private String squawk;

    /**
     * Field 19:
     * Alert (Squawk change) 	 Flag to indicate squawk has changed.
     */
    private String alertSquawkChange;


    /**
     * Field 20:
     * Emergency 	 Flag to indicate emergency code has been set
     */
    private String emergency;

    /**
     * Field 21:
     * SPI (Ident) 	 Flag to indicate transponder Ident has been activated.
     */
    private String identSPI;

    /**
     * Field 22:
     * IsOnGround 	 Flag to indicate ground squat switch is active
     */
    private boolean onGround;


    @Override
    public String getSessionID() {
        return sessionID;
    }

    @Override
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    @Override
    public String getAircraftId() {
        return aircraftId;
    }

    @Override
    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }

    @Override
    public String getHexIdent() {
        return hexIdent;
    }

    @Override
    public void setHexIdent(String hexIdent) {
        this.hexIdent = hexIdent;
    }

    @Override
    public String getFlightId() {
        return flightId;
    }

    @Override
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @Override
    public String getDateMessageGenerated() {
        return dateMessageGenerated;
    }

    @Override
    public void setDateMessageGenerated(String dateMessageGenerated) {
        this.dateMessageGenerated = dateMessageGenerated;
    }

    @Override
    public String getTimeMessageGenerated() {
        return timeMessageGenerated;
    }

    @Override
    public void setTimeMessageGenerated(String timeMessageGenerated) {
        this.timeMessageGenerated = timeMessageGenerated;
    }

    @Override
    public String getDataMessageLogged() {
        return dataMessageLogged;
    }

    @Override
    public void setDataMessageLogged(String dataMessageLogged) {
        this.dataMessageLogged = dataMessageLogged;
    }

    @Override
    public String getTimeMessageLogged() {
        return timeMessageLogged;
    }

    @Override
    public void setTimeMessageLogged(String timeMessageLogged) {
        this.timeMessageLogged = timeMessageLogged;
    }

    @Override
    public StatusFlagsType getStatusFlags() {
        return this.statusFlagsType;
    }

    @Override
    public void setStatusFlags(StatusFlagsType sft) {
        this.statusFlagsType = sft;
    }

    @Override
    public String getCallsign() {
        return callsign;
    }

    @Override
    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    @Override
    public String getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    @Override
    public String getGroundSpeed() {
        return groundSpeed;
    }

    @Override
    public void setGroundSpeed(String groundSpeed) {
        this.groundSpeed = groundSpeed;
    }

    @Override
    public String getTrack() {
        return track;
    }

    @Override
    public void setTrack(String track) {
        this.track = track;
    }

    @Override
    public String getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String getVerticalRate() {
        return verticalRate;
    }

    @Override
    public void setVerticalRate(String verticalRate) {
        this.verticalRate = verticalRate;
    }

    @Override
    public String getSquawk() {
        return squawk;
    }

    @Override
    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    @Override
    public String getAlertSquawkChange() {
        return alertSquawkChange;
    }

    @Override
    public void setAlertSquawkChange(String alertSquawkChange) {
        this.alertSquawkChange = alertSquawkChange;
    }

    @Override
    public String getEmergency() {
        return emergency;
    }

    @Override
    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    @Override
    public String getIdentSPI() {
        return identSPI;
    }

    @Override
    public void setIdentSPI(String identSPI) {
        this.identSPI = identSPI;
    }

    @Override
    public boolean isOnGround() {
        return onGround;
    }

    @Override
    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public static <T extends SBS1Message> T make(Object[] msg, Class<T> tClass) throws InvalidMessageBobyException {
        SBS1FullMessage msgObj = new SBS1FullMessage();
        try {
            msgObj.setSessionID(String.valueOf(msg[2]));

            if (!CLK.class.equals(tClass)) {
                msgObj.setAircraftId(String.valueOf(msg[3]));
                msgObj.setHexIdent(String.valueOf(msg[4]));
                msgObj.setFlightId(String.valueOf(msg[5]));
            }

            msgObj.setDateMessageGenerated(String.valueOf(msg[6]));
            msgObj.setTimeMessageGenerated(String.valueOf(msg[7]));
            msgObj.setDataMessageLogged(String.valueOf(msg[8]));
            msgObj.setTimeMessageLogged(String.valueOf(msg[9]));


            if (!AIR.class.equals(tClass) &&
                    !CLK.class.equals(tClass)) {
                if (STA.class.equals(tClass)) {
                    msgObj.setStatusFlags(StatusFlagsType.from(String.valueOf(msg[10])));
                } else {
                    msgObj.setCallsign(String.valueOf(msg[10]));
                }
            }

            if (!AIR.class.equals(tClass) &&
                    !CLK.class.equals(tClass) &&
                    !SEL.class.equals(tClass) &&
                    !ID.class.equals(tClass) &&
                    !STA.class.equals(tClass) &&
                    !AIR.class.equals(tClass) &&
                    !CLK.class.equals(tClass)) {

                msgObj.setAltitude(String.valueOf(msg[11]));
                msgObj.setGroundSpeed(String.valueOf(msg[12]));
                msgObj.setTrack(String.valueOf(msg[13]));
                msgObj.setLatitude(String.valueOf(msg[14]));
                msgObj.setLongitude(String.valueOf(msg[15]));
                msgObj.setVerticalRate(String.valueOf(msg[16]));
                msgObj.setSquawk(String.valueOf(msg[17]));
                msgObj.setAlertSquawkChange(String.valueOf(msg[18]));
                msgObj.setEmergency(String.valueOf(msg[19]));
                msgObj.setIdentSPI(String.valueOf(msg[20]));
                msgObj.setOnGround((Boolean.parseBoolean(String.valueOf(msg[21]))));
            }

        } catch (Throwable t) {
            throw new InvalidMessageBobyException(t);
        }
        return (T) msgObj;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SBS1FullMessage{");
        sb.append("sessionID='").append(sessionID).append('\'');
        sb.append(", aircraftId='").append(aircraftId).append('\'');
        sb.append(", hexIdent='").append(hexIdent).append('\'');
        sb.append(", flightId='").append(flightId).append('\'');
        sb.append(", dateMessageGenerated='").append(dateMessageGenerated).append('\'');
        sb.append(", timeMessageGenerated='").append(timeMessageGenerated).append('\'');
        sb.append(", dataMessageLogged='").append(dataMessageLogged).append('\'');
        sb.append(", timeMessageLogged='").append(timeMessageLogged).append('\'');
        sb.append(", callsign='").append(callsign).append('\'');
        sb.append(", altitude='").append(altitude).append('\'');
        sb.append(", groundSpeed='").append(groundSpeed).append('\'');
        sb.append(", track='").append(track).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", verticalRate='").append(verticalRate).append('\'');
        sb.append(", squawk='").append(squawk).append('\'');
        sb.append(", alertSquawkChange='").append(alertSquawkChange).append('\'');
        sb.append(", emergency='").append(emergency).append('\'');
        sb.append(", identSPI='").append(identSPI).append('\'');
        sb.append(", onGround=").append(onGround);
        sb.append('}');
        return sb.toString();
    }


}
