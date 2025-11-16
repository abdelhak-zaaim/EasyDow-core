package com.easydow.extract;

public interface Extractor {
    void extract(String archivePath, String destinationPath) throws Exception;
}
