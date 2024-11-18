package com.josueao.creatUrlShortner;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
import java.util.Objects;

public class Main implements RequestHandler<Map<String, Objects>, Map<String, String>> {

    @Override
    public Map<String, String> handleRequest(Map<String, Objects> stringObjectsMap, Context context) {
        return Map.of();
    }
}