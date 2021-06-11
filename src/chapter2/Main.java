package chapter2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception {
        /**
         * Base64加解密新Api
         */
        //Base64.Encoder encoder = Base64.getEncoder();
        // Base64.Decoder decoder = Base64.getDecoder();
        //String str = "中国人寿保险股份有限公司";
        // byte[] strByte = str.getBytes();
        //String strEncode = encoder.encodeToString(strByte);
        //System.out.println(strEncode);
        //System.out.println(new String(decoder.decode(strEncode)));
        /**
         * jdk8日期处理
         */
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(today));
        LocalDateTime change = LocalDateTime.of(2021, 6, 12, 13, 56, 51);
        System.out.println("相差多少天: " + Duration.between(today, change).toHours());


    }
}
