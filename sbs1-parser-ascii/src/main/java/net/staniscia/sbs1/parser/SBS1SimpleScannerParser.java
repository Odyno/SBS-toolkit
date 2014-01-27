package net.staniscia.sbs1.parser;

import net.staniscia.sbs1.*;
import net.staniscia.sbs1.msg.*;

import java.io.InputStream;


/**
 * A simple implementation of SBS1 parser implemented by Java Scanner
 */
class SBS1SimpleScannerParser implements SBS1Parser, SBS1ParserHandler {


    private final SBS1SimpleListenerCaller observers;

    SBS1SimpleScannerParser() {
        observers = new SBS1SimpleListenerCaller();
    }

    @Override
    public void register(SBS1Observer observer) {
        observers.register(observer);
    }

    @Override
    public void unRegister(SBS1Observer observer) {
        observers.unRegister(observer);
    }

    @Override
    public boolean isDone() {
        return !observers.isActive();
    }

    @Override
    public void cancel() {
        observers.doStop();
    }


    @Override
    public SBS1ParserHandler process(InputStream s) {
        return null;
    }

    @Override
    public void processIt(String s) {
        try {
            process(s);
        } catch (InvalidMessageHeatherException e) {
            e.printStackTrace();
        } catch (InvalidMessageBobyException e) {
            e.printStackTrace();
        }
    }


    private void process(String line) throws InvalidMessageHeatherException, InvalidMessageBobyException {
        String[] msg = line.split(",");
        if (msg.length > 2) {
            String s = (new StringBuilder().append(msg[0]).append(msg[1]).toString()).toLowerCase();
            if (s.equals("msg1")) {
                observers.update(MsgFactory.makeMSG(msg, MSG1.class));
            } else if (s.equals("msg2")) {
                observers.update(MsgFactory.makeMSG(msg, MSG2.class));
            } else if (s.equals("msg3")) {
                observers.update(MsgFactory.makeMSG(msg, MSG3.class));
            } else if (s.equals("msg4")) {
                observers.update(MsgFactory.makeMSG(msg, MSG4.class));
            } else if (s.equals("msg5")) {
                observers.update(MsgFactory.makeMSG(msg, MSG5.class));
            } else if (s.equals("msg6")) {
                observers.update(MsgFactory.makeMSG(msg, MSG6.class));
            } else if (s.equals("msg7")) {
                observers.update(MsgFactory.makeMSG(msg, MSG7.class));
            } else if (s.equals("msg8")) {
                observers.update(MsgFactory.makeMSG(msg, MSG8.class));
            } else if (s.equals("sel")) {
                observers.update(MsgFactory.makeMSG(msg, SEL.class));
            } else if (s.equals("id")) {
                observers.update(MsgFactory.makeMSG(msg, ID.class));
            } else if (s.equals("air")) {
                observers.update(MsgFactory.makeMSG(msg, AIR.class));
            } else if (s.equals("sta")) {
                observers.update(MsgFactory.makeMSG(msg, STA.class));
            } else if (s.equals("clk")) {
                observers.update(MsgFactory.makeMSG(msg, CLK.class));
            } else {
                throw new InvalidMessageHeatherException();
            }
        }
    }



/*
    public class AntennaHandler implements Runnable {
        private Scanner scanner;

        public AntennaHandler( final InputStream is) {
            this.scanner = new Scanner(is);

        }

        @Override
        public void run() {
            try{
                while(scanner.hasNextLine()) {
                    String line=scanner.nextLine();
                    process(line);
                }
            }catch (Throwable e){

            }
        }

    }
    */


}
