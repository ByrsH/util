package com.yrs.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * json数据转换为Map格式数据, 根据key, 获取value值
 *
 * @author ByrsH
 * @create 2017-11-08 22:41
 **/

public class JsonToMap {

    public String getValueByKey(String json, String key){
        if (json == null || key == null){
            return null;
        }
        Gson gson = new GsonBuilder().create();
        Map map = gson.fromJson(json, HashMap.class);
        if (map.containsKey(key)){
            return map.get(key).toString();
        }else {
            return null;
        }

    }

    public List<String> getValueListByKey(String json, String key){
        if (json == null || key == null){
            return null;
        }
//        List<String> valueList = new ArrayList<String>();
        Gson gson = new GsonBuilder().create();
        Map map = gson.fromJson(json, HashMap.class);
        List<String> valueList = new ArrayList<String>(map.values());
        return valueList;
//        List<Map> mapList = (List<Map>) map.get(map.keySet().toArray()[0].toString());
//
//
//
//
//        if (map.containsKey(key)){
//
//        }else {
//            return null;
//        }
//        return null;
    }

    public static void main(String args []){

//        String str = "{\"error\":0,\"message\":\"成功\",\"result\":{\"id\":1232,\"departmentId\":42,\"weacarName\":\"南京网车店\",\"companyName\":\"南京易汇汽车科技有限公司\",\"address\":\"江苏省 镇江市 丹徒区 丹徒新区画意江南44#103\",\"provinceRegionId\":875,\"cityRegionId\":978,\"districtRegionId\":982,\"imgUrl\":\"http://img.weacar.com/ba3f6763-8c46-dcb1-c9c5-5075f3337362.png\",\"tag\":0,\"createdBy\":104,\"updatedBy\":104,\"createdAt\":\"2017-09-06 11:32:53\",\"updatedAt\":\"2017-09-26 15:19:01\"},\"success\":true}";
        String str = "{\"error\":0,\"message\":\"成功\",\"result\":{\"name\":\"yrs\",\"age\":24,\"address\":[{\"home\":\"河南省\"},{\"home\":\"浙江省\"}]},\"success\":true}";

        JsonToMap jsonToMap = new JsonToMap();
        String value = jsonToMap.getValueByKey(str, "result");
        System.out.println(value);

        value = jsonToMap.getValueByKey(value, "address");
        System.out.println(value);

//        value = jsonToMap.getValueByKey(value, "home");

        str = "{\"address\":[{\"home\":\"河南省\"},{\"home\":\"浙江省\"}]}";
        jsonToMap.getValueListByKey(str, "home");

        Gson gson = new GsonBuilder().create();
        Map map = gson.fromJson(str, HashMap.class);

        System.out.println(map.containsKey("result"));

        Map result = (Map) map.get("result");
        System.out.println(result.get("name"));
        System.out.println(result.get("age"));
        System.out.println(result.get("address"));

        List<Map> address = (List<Map>) result.get("address");
        for (Map item: address){
            System.out.println(item.get("name"));
        }




    }
}
