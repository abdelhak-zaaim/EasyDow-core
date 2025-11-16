package com.easydow.download;

public interface Downloader {
    void download(String url, String destinationPath) throws Exception;
}
