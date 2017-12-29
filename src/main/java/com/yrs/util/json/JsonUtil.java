package com.yrs.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * json数据转换为Map格式数据, 根据key, 获取value值
 *
 * @author ByrsH
 * @create 2017-11-08 22:41
 **/

public class JsonUtil {

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

    /*
    public List<String> getValueListByKey(String jsonArrayValue){
        if (jsonArrayValue == null && jsonArrayValue.startsWith("[") && jsonArrayValue.endsWith("]")){
            return null;
        }

        List<String> values = new ArrayList<String>();

        String pattern = "\\{(\\w|\\W)*?\\}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(jsonArrayValue);

        while (m.find()){
            values.add(m.group());
        }
        return values;
    }
    */

    public static void main(String args []){

        String str = "{\"error\":0,\"message\":\"成功\",\"result\":{\"name\":\"yrs\",\"age\":24,\"address\":[{\"home\":\"河南省\",\"city\":\"长葛市\"},{\"home\":\"浙江省\",\"city\":\"杭州市\"}]},\"success\":true}";

        JsonUtil jsonToMap = new JsonUtil();
        String value = jsonToMap.getValueByKey(str, "result");
        System.out.println(value);

        value = jsonToMap.getValueByKey(value, "address");
        System.out.println(value);

        //用Gson反序列化集合
        Gson gson = new Gson();
        Type type = new TypeToken<List<Location>>(){}.getType();
        List<Location> locations = gson.fromJson(value, type);
        System.out.println(locations.get(0).getCity());
    }
}
