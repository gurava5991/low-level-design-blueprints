package designpattern.struturalpattern.flyweight.Good_Code;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String , TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        treeTypes.putIfAbsent(key, new TreeType(name, color, texture));
        return treeTypes.get(key);
    }
}
