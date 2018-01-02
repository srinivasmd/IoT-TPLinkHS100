package com.windchillguru.iot.hs100;


import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class HeaterTimer {

    private static Timer timer = new Timer();
    

    public static void main(String...args){
           timer.schedule (new MyTask(),0,1000*60*15);
    }
}

class MyTask extends TimerTask {
	
        public void run() {
        	TPLinkHS100 plug = new TPLinkHS100("192.168.29.130");
        	if(plug.isReachableByPing(plug.getIp())){
            	try {
					if(plug.isOn()){
						plug.switchOff();
					}else{
						plug.switchOn();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
    }