package com.dylanvann.fastimage;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;

import java.net.URI;
import java.net.URISyntaxException;


public class GlideUrlWithoutQ extends GlideUrl {

    public GlideUrlWithoutQ(String url) {
        super(url);
    }


    public GlideUrlWithoutQ(String url, Headers headers) {
        super(url, headers);
    }

    @Override
    public String getCacheKey() {
        URI uri = URI.create(toStringUrl());
        try {
            return new URI(uri.getScheme(),
                    uri.getAuthority(),
                    uri.getPath(),
                    null,
                    null
            ).toString();
        } catch (URISyntaxException e) {
            return toStringUrl();
        }
    }
}
