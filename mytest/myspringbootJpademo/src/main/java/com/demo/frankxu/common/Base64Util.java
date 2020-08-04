package com.demo.frankxu.common;

import java.io.IOException;

public class Base64Util {

        /**
         * 编码
         * @param
         * @return String
         */
        public static String encode(String str){
            byte[] bstr = str.getBytes();
            return new sun.misc.BASE64Encoder().encode(bstr);
        }

        /**
         * 解码
         * @param str
         * @return string
         */
        public static String decode(String str){
            byte[] bt = null;
            String s=null;
            try {
                sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
                bt = decoder.decodeBuffer( str );
                 s = new String(bt);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return s;
        }

        /**
         * @param args
         */
        public static void main(String[] args) {
            String aa = "更多更多";
            String bb= Base64Util.encode(aa);
            System.out.println(bb);
            System.out.println(Base64Util.decode(""));
        }

}
