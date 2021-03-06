package com.nepxion.discovery.plugin.example.service.sentinel;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nepxion.discovery.plugin.example.service.feign.BFeign;

@Component
public class MyBFeignFallbackHandler implements BFeign {
    private static final Logger LOG = LoggerFactory.getLogger(MyBFeignFallbackHandler.class);

    @Override
    public String invoke(String value) {
        LOG.info("Value={}", value);

        return "Sentinel BFeign Client Fallback Causes";
    }
}