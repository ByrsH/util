package com.yrs.util.List.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 两个List的交集、差集运算
 *
 * @author ByrsH
 * @create 2017-12-19 23:17
 **/

public class ListOperation {

    /*
    public static void sameAndDifferentOperation(List<Integer> a, List<Integer> b, List<Integer> sameItems,
                                                 List<Integer> onlyAItems, List<Integer> onlyBItems){
        if (a.isEmpty() && b.isEmpty()){
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> sameItemSet = new HashSet<>();
        Set<Integer> onlyBItemSet = new HashSet<>();
        for (Integer item: a){
            map.put(item, item);
        }

        for (Integer item: b){
            if (map.containsKey(item)){
                sameItemSet.add(item);
            }else {
                onlyBItemSet.add(item);
            }
        }

        //去除重复元素
        sameItems.addAll(sameItemSet);
        onlyBItems.addAll(onlyBItemSet);

        for (Integer item: sameItems){
            map.remove(item);
        }
        onlyAItems.addAll(map.values());

    }
    */

    public static void sameAndDifferentOperation(List<CarProvinceMarket> a, List<CarProvinceMarket> b, List<CarProvinceMarket> sameItems,
                                                 List<CarProvinceMarket> onlyAItems, List<CarProvinceMarket> onlyBItems){

        if (a.isEmpty() && b.isEmpty()){
            return;
        }

        HashMap<Integer, CarProvinceMarket> map = new HashMap<>();
        HashMap<Integer, CarProvinceMarket> sameMap = new HashMap<>();
        HashMap<Integer, CarProvinceMarket> onlyBMap = new HashMap<>();
        for (CarProvinceMarket item: a){
            map.put(item.getProvinceId(), item);
        }

        for (CarProvinceMarket item: b){
            if (map.containsKey(item.getProvinceId())){
                /*
                //如果要更新a中的记录，则要更新map中的元素，并添加到sameMap
                CarProvinceMarket carProvinceMarket = map.get(item.getProvinceId());
                carProvinceMarket.setPrice(100000d);
                sameMap.put(item.getProvinceId(), carProvinceMarket);
                */
                sameMap.put(item.getProvinceId(), item);
            }else {
                /*
                //新建的元素，需要设置相关成员变量
                item.setCreatedBy(4);
                */
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
        /*
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i=0; i<1000000; i++){
            a.add(i + 1);
            b.add(i + 2);
        }

        LinkedList<Integer> sameItems = new LinkedList<>();
        LinkedList<Integer> onlyAItems = new LinkedList<>();
        LinkedList<Integer> onlyBItems = new LinkedList<>();
        Long start = System.currentTimeMillis();
        sameAndDifferentOperation(a, b, sameItems, onlyAItems, onlyBItems);

        System.out.println("time = " + (System.currentTimeMillis() - start));

        */
        System.out.println("======================");

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
