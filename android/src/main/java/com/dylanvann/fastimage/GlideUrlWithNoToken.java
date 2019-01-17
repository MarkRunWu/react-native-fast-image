package com.dylanvann.fastimage;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;


public class GlideUrlWithNoToken extends GlideUrl {

    public GlideUrlWithNoToken(String url) {
        super(url);
    }


    public GlideUrlWithNoToken(String url, Headers headers) {
        super(url, headers);
    }

    @Override
    public String getCacheKey() {
        String url = toStringUrl();
        if (url.contains("?")) {
            return url.substring(0, url.lastIndexOf("?"));
        } else {
            return url;
        }
    }
}
