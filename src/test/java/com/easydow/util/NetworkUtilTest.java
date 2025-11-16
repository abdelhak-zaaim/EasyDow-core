package com.easydow.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkUtilTest {

    @Test
    void testValidIpAddresses() {
        assertTrue(NetworkUtil.isValidIp("0.0.0.0"));
        assertTrue(NetworkUtil.isValidIp("127.0.0.1"));
        assertTrue(NetworkUtil.isValidIp("192.168.1.1"));
        assertTrue(NetworkUtil.isValidIp("255.255.255.255"));
    }

    @Test
    void testInvalidIpAddresses() {
        assertFalse(NetworkUtil.isValidIp(""));
        assertFalse(NetworkUtil.isValidIp("256.0.0.1"));
        assertFalse(NetworkUtil.isValidIp("192.168.1"));
        assertFalse(NetworkUtil.isValidIp("192.168.1.1.1"));
        assertFalse(NetworkUtil.isValidIp("abc.def.ghi.jkl"));
        assertFalse(NetworkUtil.isValidIp("192.168.1.-1"));
        assertFalse(NetworkUtil.isValidIp("192.168.1.01a"));
    }

    @Test
    void testValidPorts() {
        assertTrue(NetworkUtil.isValidPort(0));
        assertTrue(NetworkUtil.isValidPort(80));
        assertTrue(NetworkUtil.isValidPort(65535));
    }

    @Test
    void testInvalidPorts() {
        assertFalse(NetworkUtil.isValidPort(-1));
        assertFalse(NetworkUtil.isValidPort(65536));
        assertFalse(NetworkUtil.isValidPort(Integer.MIN_VALUE));
        assertFalse(NetworkUtil.isValidPort(Integer.MAX_VALUE));
    }
}