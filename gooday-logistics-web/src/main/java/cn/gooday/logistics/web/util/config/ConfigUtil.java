package cn.gooday.logistics.web.util.config;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * 获取属性文件中的属性值
 */
public class ConfigUtil {

    /**
     * 属性文件对象
     */
    //NOTE: prefixSub() 假定key/value 都是String 且不为null。
    private static final Properties configProps = PropsUtil.loadProps("config.properties");

    /**
     * 获取 String 类型的属性值
     */
    public static String getString(String key) {
        return PropsUtil.getString(configProps, key);
    }

    /**
     * 获取 String 类型的属性值（可指定默认值）
     */
    public static String getString(String key, String defaultValue) {
        return PropsUtil.getString(configProps, key, defaultValue);
    }

    /**
     * 获取 int 类型的属性值
     */
    public static int getInt(String key) {
        return PropsUtil.getNumber(configProps, key);
    }

    /**
     * 获取 int 类型的属性值（可指定默认值）
     */
    public static int getInt(String key, int defaultValue) {
        return PropsUtil.getNumber(configProps, key, defaultValue);
    }

    /**
     * 获取 boolean 类型的属性值
     */
    public static boolean getBoolean(String key) {
        return PropsUtil.getBoolean(configProps, key);
    }

    /**
     * 获取 int 类型的属性值（可指定默认值）
     */
    public static boolean getBoolean(String key, boolean defaultValue) {
        return PropsUtil.getBoolean(configProps, key, defaultValue);
    }

    /**
     * 例如{a.x=v1, a.y=v2}，prefix="a."，返回新的properties {x=v1, y=v2}。
     * <p>
     * <p>prefix 为null/empty 时返回原properties 的拷贝。
     */
    public static Properties prefixSub(String prefix) {
        if (prefix == null) prefix = "";

        Properties copy = new Properties();
        for (Enumeration<?> e = configProps.keys(); e.hasMoreElements(); ) {
            String key = (String) e.nextElement(); //configProps 只有String key
            if (key.startsWith(prefix)) {
                String key2 = key.substring(key.length());
                copy.setProperty(key2, configProps.getProperty(key)); //value 不会为null
            }
        }

        return copy;
    }

}
