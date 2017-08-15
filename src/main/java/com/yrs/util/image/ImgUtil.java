package com.yrs.util.image;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by yrs on 2017/8/15.
 */
public class ImgUtil {
    public static byte[] base64ToImgBytes(String baseStr) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        //去除"data:image/jpeg;base64,"
        baseStr = baseStr.split(",", 2)[1];
        //解码
        byte[] bytes = decoder.decodeBuffer(baseStr);

        //调整异常数据
        for (int i=0; i<bytes.length; i++) {
            if (bytes[i] < 0) {
                bytes[i] += 256;
            }
        }
        return bytes;
    }

    public static String bytesToBase64(String str) {
        BASE64Encoder encoder = new BASE64Encoder();
        String base64Str = encoder.encode(str.getBytes());
        return base64Str;
    }
}
                