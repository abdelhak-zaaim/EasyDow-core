package com.easydow.download;

@FunctionalInterface
public interface Downloader<T> {
    T download(String url, DownloadFormat format);
}
