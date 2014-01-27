package net.staniscia.sbs1.msg;

import net.staniscia.sbs1.InvalidMessageBobyException;

/**
 * Created by staniscia on 23/01/14.
 */
public class MsgFactory {

    public static <T extends SBS1Message> T makeMSG(Object[] val, Class<T> tClass) throws InvalidMessageBobyException {
        return SBS1FullMessage.make(val, tClass);
    }


}
