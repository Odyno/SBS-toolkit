package net.staniscia.sbs1.msg;

import net.staniscia.sbs1.InvalidStatusFlagsException;

/**
 * Created by staniscia on 23/01/14.
 */
public interface STA extends SBS1Message {

    enum StatusFlagsType {
        /**
         * Position Lost
         */
        PL,

        /**
         * Signal Lost
         */
        SL,

        /**
         * Remove
         */
        RM,

        /**
         * Delete
         */
        AD,

        /**
         * used to reset time-outs if aircraft returns into cover
         */
        OK;

        public static StatusFlagsType from(String o) throws InvalidStatusFlagsException {
            if ("PL".equalsIgnoreCase(o)) return PL;
            if ("SL".equalsIgnoreCase(o)) return SL;
            if ("RM".equalsIgnoreCase(o)) return RM;
            if ("AD".equalsIgnoreCase(o)) return AD;
            if ("OK".equalsIgnoreCase(o)) return OK;
            throw new InvalidStatusFlagsException();
        }
    }

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

    StatusFlagsType getStatusFlags();

    void setStatusFlags(StatusFlagsType sft);
}
