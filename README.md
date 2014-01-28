SBS-toolkit
===========
This is a Java toolkit that manage messages containing Mode S [ADS-B](http://en.wikipedia.org/wiki/Automatic_dependent_surveillance-broadcast) aircraft data.

* Continuous Integration: [https://travis-ci.org/Odyno/SBS-toolkit](https://travis-ci.org/Odyno/SBS-toolkit). Status: [![Build Status](https://travis-ci.org/Odyno/SBS-toolkit.png?branch=master)](https://travis-ci.org/Odyno/SBS-toolkit)
* Maven Develop Site: [http://odyno.github.io/SBS-toolkit](http://odyno.github.io/SBS-toolkit)

Module 1 - SBS Socket Services
--------------------------------
OSGI Modules  used to read a specific tcp port (default 30003) and parse the information in according of configurated SBS1-Parser ( default is SBS1 ascii format) and the configured listener (default java.util.logging  SBS1Observer implementation)


Module 2 - SBS-1 BaseStation ascii format parser
-----------------------------------------------
This format has become a semi-standard way of sending ADS-B data. I use as specification the documentation of protocol at [http://www.homepages.mcb.net](http://www.homepages.mcb.net/bones/SBS/Article/Barebones42_Socket_Data.htm).
The SBS-1 ascii messages are in a simple comma-delimited format; I show below examples of all possible messages ( [http://www.homepages.mcb.net](http://www.homepages.mcb.net/bones/SBS/Article/Barebones42_Socket_Data.htm)):

```
SEL,,496,2286,4CA4E5,27215,2010/02/19,18:06:07.710,2010/02/19,18:06:07.710,RYR1427
ID,,496,7162,405637,27928,2010/02/19,18:06:07.115,2010/02/19,18:06:07.115,EZY691A
AIR,,496,5906,400F01,27931,2010/02/19,18:06:07.128,2010/02/19,18:06:07.128
STA,,5,179,400AE7,10103,2008/11/28,14:58:51.153,2008/11/28,14:58:51.153,RM
CLK,,496,-1,,-1,2010/02/19,18:18:19.036,2010/02/19,18:18:19.036
MSG,1,145,256,7404F2,11267,2008/11/28,23:48:18.611,2008/11/28,23:53:19.161,RJA1118,,,,,,,,,,,
MSG,2,496,603,400CB6,13168,2008/10/13,12:24:32.414,2008/10/13,12:28:52.074,,,0,76.4,258.3,54.05735,-4.38826,,,,,,0
MSG,3,496,211,4CA2D6,10057,2008/11/28,14:53:50.594,2008/11/28,14:58:51.153,,37000,,,51.45735,-1.02826,,,0,0,0,0
MSG,4,496,469,4CA767,27854,2010/02/19,17:58:13.039,2010/02/19,17:58:13.368,,,288.6,103.2,,,-832,,,,,
MSG,5,496,329,394A65,27868,2010/02/19,17:58:12.644,2010/02/19,17:58:13.368,,10000,,,,,,,0,,0,0
MSG,6,496,237,4CA215,27864,2010/02/19,17:58:12.846,2010/02/19,17:58:13.368,,33325,,,,,,0271,0,0,0,0
MSG,7,496,742,51106E,27929,2011/03/06,07:57:36.523,2011/03/06,07:57:37.054,,3775,,,,,,,,,,0
MSG,8,496,194,405F4E,27884,2010/02/19,17:58:13.244,2010/02/19,17:58:13.368,,,,,,,,,,,,0
```
