package chapter2;

import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception {
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String str = "中国人寿保险股份有限公司";
        byte[] strByte = str.getBytes();
        String strEncode = encoder.encodeToString(strByte);
        //System.out.println(strEncode);
        System.out.println(new String(decoder.decode(strEncode)));
    }
}
