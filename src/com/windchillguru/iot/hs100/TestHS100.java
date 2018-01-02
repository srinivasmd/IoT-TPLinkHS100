package com.windchillguru.iot.hs100;

import java.io.IOException;

public class TestHS100 {

	public static void main(String[] args) {
		
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
