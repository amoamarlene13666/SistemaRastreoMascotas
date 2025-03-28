package org.example.utilities;

import org.example.list.LinkedList;

public class SplitUtils {
    public static LinkedList split(String source) {
        LinkedList list = new LinkedList();
        for (String part : source.split(" ")) {
            list.add(part);
        }
        return list;
    }
}