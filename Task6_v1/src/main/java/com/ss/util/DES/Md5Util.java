package com.ss.util.DES;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 采用MD5加密解密  
 */
public class Md5Util {


    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /*** 
     * MD5加码 生成32位md5码 
     */
    public static String string2MD5(String str){

        byte[] bytes = new byte[0];
        try {
            /**
             * string.getBytes方法如果不指定charset，将返回操作系统默认编码格式的字节数组，
             * 中文平台一般是GBK，所以如果不指定charset,用这个工具类得到的md5字符串和别人的不一样
             * 所以要在这里指定utf-8。
             */
            bytes = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return null;
        }

        byte[] md5Bytes = md5.digest(bytes);   //返回128位的长整型，16字节

        return bytesToHexFun1(md5Bytes);

    }
    /**
     * 根据自己的规则进行MD5加密
     * 例如，现在需求是有字符串传入zhang，xy
     * 其中zhang是传入的字符
     * 然后需要将zhang的字符进行拆分z，和hang，
     * 最后需要加密的字段为zxyhang
     */
   /* public static String MD5Test(String inStr){
        String xy = "xy";
        String finalStr="";
        if(inStr!=null){
            String fStr = inStr.substring(0, 1);
            String lStr = inStr.substring(1, inStr.length());
            finalStr = string2MD5( fStr+xy+lStr);

        }else{
            finalStr = string2MD5(xy);
        }
        return finalStr;
    }*/

    /*******************************************************************************************************************/


    private static String bytesToHexFun2(byte[] bytes) {
        StringBuffer hexValue = new StringBuffer();

        System.out.println(bytes.length);

        for (int i = 0; i < bytes.length; i++){
            int val = ((int) bytes[i]) & 0xff; // 0xff = 255 = 11111111(2进制)  因为int占32bit, & 0xff后高24位被清零。
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));//Integer.toHexString(int)将一个十进制int转为16进制数然后以字符串形式输出。
        }
        return hexValue.toString();
    }


/*******************************************************************************************************************/
    //测试过关。
    private static byte[] HextoBytes(String str) {
        if(str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for(int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }

        return bytes;
    }

    //测试过关。
    private static String bytesToHexFun1(byte[] bytes) {
        char[] buf = new char[bytes.length * 2];
        int index = 0;
        for(byte b : bytes) { // 利用位运算进行转换，可以看作方法一的变种
            buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            buf[index++] = HEX_CHAR[b & 0xf];
        }

        return new String(buf);
    }


/*******************************************************************************************************************/

/*
    // 测试
    public static void main(String args[]) {
        String s1 = "哈哈，呼呼嘻嘻，123";
        System.out.println("使用工具类进行加密的为 "+ bytesToHexFun2(string2MD5(StringToBytes(s1))));

        System.out.println("使用工具类进行加密的为 "+ bytesToHexFun1(string2MD5(StringToBytes(s1))));

        System.out.println("使用工具类进行加密的为 "+ bytesToHexFun2(HextoBytes("e776f30c0bfa672d0a5d3770f8816e4c")));
        System.out.println("使用工具类进行加密的为 "+ bytesToHexFun1(HextoBytes("e776f30c0bfa672d0a5d3770f8816e4c")));

        //System.out.println(toBytes(string2MD5(s1)));


    }*/


}

