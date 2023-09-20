package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA=Integer.parseInt(a);
        int intB=Integer.parseInt(b);
        if(Math.abs(intA)==Math.abs(intB)){
            if(intA==intB)return 0;
            else {
                if (intA < intB) return -1;
                else return 1;
            }
        }else {
            if (Math.abs(intA) < Math.abs(intB)) return -1;
            else return 1;
        }
    }
}
