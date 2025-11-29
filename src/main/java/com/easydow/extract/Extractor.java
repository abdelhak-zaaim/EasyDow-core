package com.easydow.extract;

import com.easydow.commun.VideoInfo;

public interface Extractor {
    VideoInfo extract(String url);
}
