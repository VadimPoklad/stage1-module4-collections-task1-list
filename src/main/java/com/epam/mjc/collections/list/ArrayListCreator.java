package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();

        Iterator<String> iterator = sourceList.listIterator();
        int i=1;
        while (iterator.hasNext()){
            String str = iterator.next();
            if(i==3){
                arrayList.add(str);
                arrayList.add(str);
                i=1;
            }else i++;
        }
        return arrayList;
    }
}
