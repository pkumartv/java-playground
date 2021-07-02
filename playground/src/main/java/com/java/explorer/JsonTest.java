package com.java.explorer;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;

import org.apache.commons.codec.binary.Base64InputStream;
import org.json.JSONObject;

public class JsonTest {
    JSONObject jsonObject = new JSONObject();
    Gson gson = new Gson();
//  InputStream is= new input
// Byte [] ok = new Byte[10];
//    // IOUtils.toString(ok);
//    BaseEncoding baseEncoding= new Base64InputStream(in);
 public static Map<String, Object> errorMap = new HashMap<String,Object>();


 public static void main(String[] args) {

    Map<String,String> mine= new HashMap<String,String>();
 System.out.println("ok "+mine.keySet());
 System.out.println("ok "+mine.keySet().isEmpty());
     errorMap.put("one", "two");
     System.out.println("map is "+errorMap);
 }





}
