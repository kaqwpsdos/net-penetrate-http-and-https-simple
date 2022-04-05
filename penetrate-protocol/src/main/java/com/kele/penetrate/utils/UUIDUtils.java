package com.kele.penetrate.utils;

import com.kele.penetrate.factory.annotation.Recognizer;

import java.util.UUID;

@Recognizer
@SuppressWarnings("unused")
public class UUIDUtils
{
    public String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}