# IoT-TPLinkHS100

Simple Java API for TP-Link HS100 Plugs. Although it should work for all HS plugs, but i have tested them on HS100 plugs

## Supported Devices

| Model                      | Type |
|----------------------------|------|
| HS100(Tested), HS105, HS110, HS200 | Plug |

## Getting Started

There is one class central to the TPLink HS-100 API. This is the TPLinkHS100.java class. It represents a physical plug.

### Creating a Plug Object

You can create a TPLinkHS100 Plug with just the IP, and you can additionally specify the Port. 

By default, the port for TP-Link

    TPLinkHS100 plug = new TPLinkHS100(String IP);

    // Default local port is almost always 9999!
    TPLinkHS100 plug = new TPLinkHS100(String IP, int PORT);
    
### Turning the Plug On and Off

    // On
    plug.switchOn();

    // Off
    plug.switchOff();

### Getting Information

    // Checks if the IP has a device behind it
    plug.isReachableByPing(); 

    // Checks if the plug is on
    plug.isOn();

    // Checks if the plug is off
    plug.isOff();

    // USER SET INFO //

    // Ip you created the plug with
    plug.getIp();

    // Port assigned to a plug
    plug.getPort();
    
### Setting Information

    // Set the IP
    plug.setIp(String IP);

    // Set the Port
    plug.setPort(Integer PORT);
    
### Sample Program to Toggle (On/Off) Plug for every 15 mins

    //Check Implementation Done In HeaterTimer.java
    

