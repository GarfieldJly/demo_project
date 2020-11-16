package com.garfield.cache.domain;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jingliyuan
 * @date 2020/10/21
 */
public class Record {
    private Map<KeyEnum,String> map = new EnumMap<KeyEnum, String>(KeyEnum.class);

    public void setData(KeyEnum keyEnum,String data){
        map.put(keyEnum,data);
    }

    public String getData(KeyEnum keyEnum){
        return map.get(keyEnum);
    }

    public static void main(String[] args) {
        Record record = new Record();
        record.setData(KeyEnum.KEY_1,"garfield");
        record.setData(KeyEnum.KEY_2,"加菲猫");

        Set<KeyEnum> keyEnums = record.map.keySet();
        for (KeyEnum keyEnum : keyEnums){
            System.out.println("键为:"+keyEnum);
        }
        System.out.println(record.getData(KeyEnum.KEY_1));
        System.out.println(record.getData(KeyEnum.KEY_2));

    }

}
