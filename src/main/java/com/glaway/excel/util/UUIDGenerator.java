package com.glaway.excel.util;

import java.util.UUID;

public class UUIDGenerator {

    /**
     *
     * @Method
     * @author
     * @Date
     * @Description
     *   uuid 生成器
     *
     * @return
     */
    public static String generate() {

        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        return id.replace("-", "");
    }

    /***
     * @Title:       random8UUID
     * @Date:
     * @Description: 生成8位随机字符
     * @param
     * @return java.lang.String
     * @throws Exception
     */
    public static String random8UUID() {
        String[] chars = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int j = 0; j < 8; j++) {
            String str = uuid.substring(j * 4, j * 4 + 4);
            int par = Integer.parseInt(str, 16);
            shortBuffer.append(chars[par % 36]);
        }
        return shortBuffer.toString();
    }
}