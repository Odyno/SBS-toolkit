package net.staniscia.sbs1.msg;

import junit.framework.Assert;
import net.staniscia.sbs1.SBS1Observer;
import net.staniscia.sbs1.SBS1Parser;
import net.staniscia.sbs1.parser.ParserFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by staniscia on 24/01/14.
 */
public class SimpleParserTest {

    private SBS1Parser parserToTest;


    @Before
    public void setall() {
        parserToTest = ParserFactory.getDefaultParser();
    }


    @Test
    public void testRegisterObserver() {
        SBS1Observer sbs1Observer = mock(SBS1Observer.class);
        parserToTest.register(sbs1Observer);
        parserToTest.unRegister(sbs1Observer);
    }

    @Ignore
    @Test
    public void testSEL() {


        final SEL msg1 = new SBS1FullMessage();
        msg1.setSessionID("496");
        msg1.setAircraftId("7162");
        msg1.setHexIdent("405637");
        msg1.setFlightId("27928");
        msg1.setDateMessageGenerated("2010/02/19");
        msg1.setTimeMessageGenerated("18:06:07.710");
        msg1.setDataMessageLogged("2010/02/19");
        msg1.setTimeMessageLogged("18:06:07.710");
        msg1.setCallsign("RYR1427");
        parserToTest.register(new SBS1Observer() {

            @Override
            public void update(MSG1 message) {
            }

            @Override
            public void update(MSG2 message) {
            }

            @Override
            public void update(MSG3 message) {
            }

            @Override
            public void update(MSG4 message) {
            }

            @Override
            public void update(MSG5 message) {
            }

            @Override
            public void update(MSG6 message) {
            }

            @Override
            public void update(MSG7 message) {
            }

            @Override
            public void update(MSG8 message) {
            }

            @Override
            public void update(ID message) {
            }

            @Override
            public void update(SEL message) {
                Assert.assertEquals(message, msg1);
            }

            @Override
            public void update(AIR message) {
            }

            @Override
            public void update(STA message) {
            }

            @Override
            public void update(CLK message) {
            }
        });

        parserToTest.processIt("SEL,,496,2286,4CA4E5,27215,2010/02/19,18:06:07.710,2010/02/19,18:06:07.710,RYR1427");

    }

    @Ignore
    @Test
    public void testMsg2() {
        parserToTest.processIt("ID,,496,7162,405637,27928,2010/02/19,18:06:07.115,2010/02/19,18:06:07.115,EZY691A");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg3() {
        parserToTest.processIt("AIR,,496,5906,400F01,27931,2010/02/19,18:06:07.128,2010/02/19,18:06:07.128");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg4() {
        parserToTest.processIt("STA,,5,179,400AE7,10103,2008/11/28,14:58:51.153,2008/11/28,14:58:51.153,RM");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg5() {
        parserToTest.processIt("CLK,,496,-1,,-1,2010/02/19,18:18:19.036,2010/02/19,18:18:19.036");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg6() {


        final MSG1 msg1 = new SBS1FullMessage();
        msg1.setSessionID("145");
        msg1.setAircraftId("256");
        msg1.setHexIdent("7404F2");
        msg1.setFlightId("11267");
        msg1.setDateMessageGenerated("2008/11/28");
        msg1.setTimeMessageGenerated("23:48:18.611");
        msg1.setDataMessageLogged("2008/11/28");
        msg1.setTimeMessageLogged("23:53:19.161");
        msg1.setCallsign("RJA1118");

        parserToTest.register(new SBS1Observer() {

            @Override
            public void update(MSG1 message) {
                Assert.assertEquals(message, msg1);
            }

            @Override
            public void update(MSG2 message) {
            }

            @Override
            public void update(MSG3 message) {
            }

            @Override
            public void update(MSG4 message) {
            }

            @Override
            public void update(MSG5 message) {
            }

            @Override
            public void update(MSG6 message) {
            }

            @Override
            public void update(MSG7 message) {
            }

            @Override
            public void update(MSG8 message) {
            }

            @Override
            public void update(ID message) {
            }

            @Override
            public void update(SEL message) {
            }

            @Override
            public void update(AIR message) {
            }

            @Override
            public void update(STA message) {
            }

            @Override
            public void update(CLK message) {
            }
        });
        parserToTest.processIt("MSG,1,145,256,7404F2,11267,2008/11/28,23:48:18.611,2008/11/28,23:53:19.161,RJA1118,,,,,,,,,,,");

    }

    @Ignore
    @Test
    public void testMsg7() {
        parserToTest.processIt("MSG,2,496,603,400CB6,13168,2008/10/13,12:24:32.414,2008/10/13,12:28:52.074,,,0,76.4,258.3,54.05735,-4.38826,,,,,,0");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg8() {
        parserToTest.processIt("MSG,3,496,211,4CA2D6,10057,2008/11/28,14:53:50.594,2008/11/28,14:58:51.153,,37000,,,51.45735,-1.02826,,,0,0,0,0");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg9() {
        parserToTest.processIt("MSG,4,496,469,4CA767,27854,2010/02/19,17:58:13.039,2010/02/19,17:58:13.368,,,288.6,103.2,,,-832,,,,,");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg10() {
        parserToTest.processIt("MSG,5,496,329,394A65,27868,2010/02/19,17:58:12.644,2010/02/19,17:58:13.368,,10000,,,,,,,0,,0,0");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg11() {
        parserToTest.processIt("MSG,6,496,237,4CA215,27864,2010/02/19,17:58:12.846,2010/02/19,17:58:13.368,,33325,,,,,,0271,0,0,0,0");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg12() {
        parserToTest.processIt("MSG,7,496,742,51106E,27929,2011/03/06,07:57:36.523,2011/03/06,07:57:37.054,,3775,,,,,,,,,,0");
        Assert.fail();
    }

    @Ignore
    @Test
    public void testMsg13() {
        parserToTest.processIt("MSG,8,496,194,405F4E,27884,2010/02/19,17:58:13.244,2010/02/19,17:58:13.368,,,,,,,,,,,,0");
        Assert.fail();
    }


    @Ignore
    @Test
    public void createFactory() {

        parserToTest.processIt("SEL,,496,2286,4CA4E5,27215,2010/02/19,18:06:07.710,2010/02/19,18:06:07.710,RYR1427");
        parserToTest.processIt("ID,,496,7162,405637,27928,2010/02/19,18:06:07.115,2010/02/19,18:06:07.115,EZY691A");
        parserToTest.processIt("AIR,,496,5906,400F01,27931,2010/02/19,18:06:07.128,2010/02/19,18:06:07.128");
        parserToTest.processIt("STA,,5,179,400AE7,10103,2008/11/28,14:58:51.153,2008/11/28,14:58:51.153,RM");
        parserToTest.processIt("CLK,,496,-1,,-1,2010/02/19,18:18:19.036,2010/02/19,18:18:19.036");
        parserToTest.processIt("MSG,1,145,256,7404F2,11267,2008/11/28,23:48:18.611,2008/11/28,23:53:19.161,RJA1118,,,,,,,,,,,");
        parserToTest.processIt("MSG,2,496,603,400CB6,13168,2008/10/13,12:24:32.414,2008/10/13,12:28:52.074,,,0,76.4,258.3,54.05735,-4.38826,,,,,,0");
        parserToTest.processIt("MSG,3,496,211,4CA2D6,10057,2008/11/28,14:53:50.594,2008/11/28,14:58:51.153,,37000,,,51.45735,-1.02826,,,0,0,0,0");
        parserToTest.processIt("MSG,4,496,469,4CA767,27854,2010/02/19,17:58:13.039,2010/02/19,17:58:13.368,,,288.6,103.2,,,-832,,,,,");
        parserToTest.processIt("MSG,5,496,329,394A65,27868,2010/02/19,17:58:12.644,2010/02/19,17:58:13.368,,10000,,,,,,,0,,0,0");
        parserToTest.processIt("MSG,6,496,237,4CA215,27864,2010/02/19,17:58:12.846,2010/02/19,17:58:13.368,,33325,,,,,,0271,0,0,0,0");
        parserToTest.processIt("MSG,7,496,742,51106E,27929,2011/03/06,07:57:36.523,2011/03/06,07:57:37.054,,3775,,,,,,,,,,0");
        parserToTest.processIt("MSG,8,496,194,405F4E,27884,2010/02/19,17:58:13.244,2010/02/19,17:58:13.368,,,,,,,,,,,,0");
    }


}
