package com.practice.cetamonitoring;

 class users {

    private static String registeredUser="admin";
    private static String registeredPin="1234";

    //add the authentication methods

    public static String getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(String registeredUser) {

        this.registeredUser = registeredUser;
    }

    public static String getRegisteredPin() {
        return registeredPin;
    }

    public void setRegisteredPin(String registeredPin) {
        this.registeredPin = registeredPin;
    }
}
