package com.tedu.annotation;

import com.tedu.SerchService;
import org.springframework.stereotype.Service;

@Service
public class SerchServiceImpl implements SerchService {
    @RequestLog
    @Override
    public void doTest(String key) {
        System.out.println(key);
    }
}
