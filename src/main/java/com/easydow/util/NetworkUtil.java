package com.easydow.util;

public class NetworkUtil {
    public static boolean isValidIp(String ip) {
        String ipPattern =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ip.matches(ipPattern);
    }

    public static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }
}
