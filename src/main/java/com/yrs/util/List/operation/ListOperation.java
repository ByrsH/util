package com.yrs.util.List.operation;

import java.util.*;

/**
 * 两个List的交集、差集运算
 *
 * @author ByrsH
 * @create 2017-12-19 23:17
 **/

public class ListOperation {
    public static void sameAndDifferentOperation(List<CarProvinceMarket> a, List<CarProvinceMarket> b, List<CarProvinceMarket> sameItems,
                                                 List<CarProvinceMarket> onlyAItems, List<CarProvinceMarket> onlyBItems){

        if (a.isEmpty() && b.isEmpty()){
            return;
        }

        LinkedHashMap<Integer, CarProvinceMarket> map = new LinkedHashMap<>();
        LinkedHashMap<Integer, CarProvinceMarket> sameMap = new LinkedHashMap<>();
        LinkedHashMap<Integer, CarProvinceMarket> onlyBMap = new LinkedHashMap<>();
        for (CarProvinceMarket item: a){
            map.put(item.getProvinceId(), item);
        }

        for (CarProvinceMarket item: b){
            if (map.containsKey(item.getProvinceId())){

                //如果要更新a中的记录，则要更新map中的元素，并添加到sameMap
                CarProvinceMarket carProvinceMarket = map.get(item.getProvinceId());
                carProvinceMarket.setPrice(100000d);
                sameMap.put(item.getProvinceId(), carProvinceMarket);
            }else {
                //新建的元素，需要设置相关成员变量
                item.setCreatedBy(4);
                onlyBMap.put(item.getProvinceId(),item);
            }
        }

        sameItems.addAll(sameMap.values());
        onlyBItems.addAll(onlyBMap.values());

        for (CarProvinceMarket item: sameItems){
            map.remove(item.getProvinceId());
        }

        onlyAItems.addAll(map.values());

    }

    public static void main(String [] args){
        ArrayList<CarProvinceMarket> aCarProMar = new ArrayList<>();
        ArrayList<CarProvinceMarket> bCarProMar = new ArrayList<>();
        for (int i=0; i<1000000; i++){
            CarProvinceMarket aCar = new CarProvinceMarket();
            aCar.setProvinceId((i + 1)/2);
            aCarProMar.add(aCar);
            CarProvinceMarket bCar = new CarProvinceMarket();
            bCar.setProvinceId((i + 2)/2);
            bCarProMar.add(bCar);
        }

        LinkedList<CarProvinceMarket> sameItems = new LinkedList<>();
        LinkedList<CarProvinceMarket> onlyAItems = new LinkedList<>();
        LinkedList<CarProvinceMarket> onlyBItems = new LinkedList<>();

        Long start = System.currentTimeMillis();
        sameAndDifferentOperation(aCarProMar, bCarProMar, sameItems, onlyAItems, onlyBItems);
        System.out.println("time = " + (System.currentTimeMillis() - start));

    }
}
