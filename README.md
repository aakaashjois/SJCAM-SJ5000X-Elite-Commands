# SJCAM5000X Elite COMMANDS

Base URL: http://192.168.1.254/

## Modes:
- **Photo:** http://192.168.1.254/?custom=1&cmd=3001&par=0
- **Video:** http://192.168.1.254/?custom=1&cmd=3001&par=1
- **Replay** http://192.168.1.254/?custom=1&cmd=3001&par=2 Could be PC Camera.
- **Video Time Lapse:** http://192.168.1.254/?custom=1&cmd=3001&par=3
- **Photo Time Lapse:** http://192.168.1.254/?custom=1&cmd=3001&par=4

## Image Resolution:

Resolution | Command
-----------|--------
12M | http://192.168.1.254/?custom=1&cmd=1002&par=0
10M | http://192.168.1.254/?custom=1&cmd=1002&par=1
8M | http://192.168.1.254/?custom=1&cmd=1002&par=2
5M | http://192.168.1.254/?custom=1&cmd=1002&par=3
3M | http://192.168.1.254/?custom=1&cmd=1002&par=4
2M | http://192.168.1.254/?custom=1&cmd=1002&par=5
VGA | http://192.168.1.254/?custom=1&cmd=1002&par=6
1.3M | http://192.168.1.254/?custom=1&cmd=1002&par=7
14M | http://192.168.1.254/?custom=1&cmd=1002&par=8 Does not work for SJ5000X Elite

## Video Resolution:

Resolution | Command
-----------|--------
1080p 60fps | http://192.168.1.254/?custom=1&cmd=2002&par=0
1080p 30fps | http://192.168.1.254/?custom=1&cmd=2002&par=1
720p 120fps | http://192.168.1.254/?custom=1&cmd=2002&par=2
720p 60fps | http://192.168.1.254/?custom=1&cmd=2002&par=3
720p 30fps | http://192.168.1.254/?custom=1&cmd=2002&par=4
2K | http://192.168.1.254/?custom=1&cmd=2002&par=5

## Live Preview:
rtsp://192.168.1.254/sjcam.mov

RTSP does not need any keep alive packets.
- Android Media Player gives 5s lag
- Vitamio gives about 10s lag
- Implementing VLC

## Photo TimeLapse Capture Interval:

Interval | Command
---------|--------
3s | http://192.168.1.254/?custom=1&cmd=1012&par=0
5s | http://192.168.1.254/?custom=1&cmd=1012&par=1
10s | http://192.168.1.254/?custom=1&cmd=1012&par=2
20s | http://192.168.1.254/?custom=1&cmd=1012&par=3

## Exposure:

Exposure | Command
---------|--------
+2 | http://192.168.1.254/?custom=1&cmd=2005&par=0
+5/3 | http://192.168.1.254/?custom=1&cmd=2005&par=1
+4/3 | http://192.168.1.254/?custom=1&cmd=2005&par=2
+1 | http://192.168.1.254/?custom=1&cmd=2005&par=3
+2/3 | http://192.168.1.254/?custom=1&cmd=2005&par=4
+1/3 | http://192.168.1.254/?custom=1&cmd=2005&par=5
+0 | http://192.168.1.254/?custom=1&cmd=2005&par=6
-1/3 | http://192.168.1.254/?custom=1&cmd=2005&par=7
-2/3 | http://192.168.1.254/?custom=1&cmd=2005&par=8
-1 | http://192.168.1.254/?custom=1&cmd=2005&par=9
-4/3 | http://192.168.1.254/?custom=1&cmd=2005&par=10
-5/3 | http://192.168.1.254/?custom=1&cmd=2005&par=11
-2 | http://192.168.1.254/?custom=1&cmd=2005&par=12

## White Balance:

Mode | Command
-----|--------
Auto | http://192.168.1.254/?custom=1&cmd=1007&par=0
Daylight | http://192.168.1.254/?custom=1&cmd=1007&par=1
Cloudy | http://192.168.1.254/?custom=1&cmd=1007&par=2
Tungsten | http://192.168.1.254/?custom=1&cmd=1007&par=3
Fluorescent | http://192.168.1.254/?custom=1&cmd=1007&par=4

## Video Lapse Interval:

Time | Command
-----|--------
1s | http://192.168.1.254/?custom=1&cmd=2019&par=0
2s | http://192.168.1.254/?custom=1&cmd=2019&par=1
5s | http://192.168.1.254/?custom=1&cmd=2019&par=2
10s | http://192.168.1.254/?custom=1&cmd=2019&par=3
30s | http://192.168.1.254/?custom=1&cmd=2019&par=4
60s | http://192.168.1.254/?custom=1&cmd=2019&par=5

## Audio:
- Off: http://192.168.1.254/?custom=1&cmd=2007&par=0
- On: http://192.168.1.254/?custom=1&cmd=2007&par=1

## WDR:
- Off: http://192.168.1.254/?custom=1&cmd=2004&par=0
- On: http://192.168.1.254/?custom=1&cmd=2004&par=1

## Cyclic Record:

Time | Command
-----|--------
Off | http://192.168.1.254/?custom=1&cmd=2003&par=0
3min | http://192.168.1.254/?custom=1&cmd=2003&par=1
5min | http://192.168.1.254/?custom=1&cmd=2003&par=2
10min | http://192.168.1.254/?custom=1&cmd=2003&par=3

## Gyro:
- Off: http://192.168.1.254/?custom=1&cmd=9001&par=0
- On: http://192.168.1.254/?custom=1&cmd=9001&par=1

## Auto Power Off:

  Time | Command
  -----|--------
  Auto power off | http://192.168.1.254/?custom=1&cmd=3007&par=0
  3min | http://192.168.1.254/?custom=1&cmd=3007&par=1
  5min | http://192.168.1.254/?custom=1&cmd=3007&par=2
  10min | http://192.168.1.254/?custom=1&cmd=3007&par=3
  Off now | http://192.168.1.254/?custom=1&cmd=3007&par=4

## Frequency:
- 50Hz: http://192.168.1.254/?custom=1&cmd=3025&par=0
- 60Hz: http://192.168.1.254/?custom=1&cmd=3025&par=1

## Number of Photos Left:
http://192.168.1.254/?custom=1&cmd=1003

Returns \<Value\>Number of photos left\</Value\>

## Video Recording Seconds Left:
http://192.168.1.254/?custom=1&cmd=2009

Returns \<Value\>Number of seconds left\</Value\>

## Date Stamp:
- Off: http://192.168.1.254/?custom=1&cmd=2008&par=0
- On: http://192.168.1.254/?custom=1&cmd=2008&par=1

## Set WiFi Password:
http://192.168.1.254/?custom=1&cmd=3004&str=password_here

## Set WiFi SSID:
http://192.168.1.254/?custom=1&cmd=3003&str=SSID_here

## Set Date:
http://192.168.1.254/?custom=1&cmd=3005&str/YYYY-MM-DD

## Set Time:
http://192.168.1.254/?custom=1&cmd=3006&str/HH:MM:SS

## Reset Settings to Default:
http://192.168.1.254/?custom=1&cmd=3011

## Format Card:
http://192.168.1.254/?custom=1&cmd=3010&par=1

## Query All Settings:
http://192.168.1.254/?custom=1&cmd=3014
(Returns the most current values for all settings parameters)

## Get All Commands:
http://192.168.1.254/?custom=1&cmd=3002

## List of Files and its Values:
http://192.168.1.254/?custom=1&cmd=3015

## Remaining Space (in Bytes):
http://192.168.1.254/?custom=1&cmd=3017

## Disconnect Client from WiFi:
http://192.168.1.254/?custom=1&cmd=3013

## Check Devices Connected Via WiFi:
http://192.168.1.254/?custom=1&cmd=3018

## Snap picture:
http://192.168.1.254/?custom=1&cmd=1001

## Video recording status:
http://192.168.1.254/?custom=1&cmd=2016

## Unknown Commands
- http://192.168.1.254/?custom=1&cmd=1006
- http://192.168.1.254/?custom=1&cmd=1008
- http://192.168.1.254/?custom=1&cmd=1009
- http://192.168.1.254/?custom=1&cmd=1011
- http://192.168.1.254/?custom=1&cmd=2010
- http://192.168.1.254/?custom=1&cmd=2013
- http://192.168.1.254/?custom=1&cmd=2014
- http://192.168.1.254/?custom=1&cmd=2015
- http://192.168.1.254/?custom=1&cmd=3030
- http://192.168.1.254/?custom=1&cmd=3008
- http://192.168.1.254/?custom=1&cmd=3019
- http://192.168.1.254/?custom=1&cmd=3021
- http://192.168.1.254/?custom=1&cmd=3022
- http://192.168.1.254/?custom=1&cmd=3023
- http://192.168.1.254/?custom=1&cmd=3024
- http://192.168.1.254/?custom=1&cmd=3028
- http://192.168.1.254/?custom=1&cmd=3030
- http://192.168.1.254/?custom=1&cmd=4001
- http://192.168.1.254/?custom=1&cmd=4002
- http://192.168.1.254/?custom=1&cmd=4003
- http://192.168.1.254/?custom=1&cmd=4004
- http://192.168.1.254/?custom=1&cmd=8001
- http://192.168.1.254/?custom=1&cmd=8002
- http://192.168.1.254/?custom=1&cmd=9001
- http://192.168.1.254/?custom=1&cmd=9002
- http://192.168.1.254/?custom=1&cmd=8002
- http://192.168.1.254/?custom=1&cmd=3021
- http://192.168.1.254/?custom=1&cmd=3022
- http://192.168.1.254/?custom=1&cmd=3023
- http://192.168.1.254/?custom=1&cmd=3024
- http://192.168.1.254/?custom=1&cmd=9002

  Battery Value 0(Full)/1(75%)/2(50%)/3(25%)/4(Low Battery)/5(Charger)

- http://192.168.1.254/?custom=1&cmd=3016

  Gives Status = 1

- http://192.168.1.254/?custom=1&cmd=3027

  Generates Random \<Value\>

- http://192.168.1.254/?custom=1&cmd=3012

  Gives a \<String\>660\</String\> Firmware Number

- http://192.168.1.254/?custom=1&cmd=3030

  Returns the path to the Firmware File

- http://192.168.1.254/?custom=1&cmd=3029

  Returns \<String\>http://115.29.201.46:8020/download/filedesc.xml \</String\>

- http://192.168.1.254/?custom=1&cmd=2006

  Enable Motion Detection
