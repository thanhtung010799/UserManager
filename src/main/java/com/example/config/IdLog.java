package com.example.config;

import java.util.UUID;

public class IdLog {
    public static final String TRANS_ID = UUID.randomUUID().toString().replace("-", "");
}
