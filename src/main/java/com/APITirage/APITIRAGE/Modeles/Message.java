package com.APITirage.APITIRAGE.Modeles;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class Message {
    public static ResponseEntity<Object> ErreurReponse(String msg, HttpStatus status) {
        Map<String,Object> map = new HashMap<>();
        map.put("Message", msg);
        return new ResponseEntity<Object>(map,status);
    }
}
