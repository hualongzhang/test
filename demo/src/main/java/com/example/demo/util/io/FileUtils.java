package com.example.demo.util.io;

import java.io.*;

/**
 * Created by zhanghualong on 2017/11/30.
 */
public class FileUtils {


    /*****文件中读取字符串************************/
    public static  String  convertFileToString(String filePath,String fileName) throws  Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(filePath+ File.separator+fileName));
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException("未找到文件");
        }finally {
            if(br!=null){
                br.close();
            }
        }
        return sb.toString();
    }

    /******字符串写入文件中***************/
    public static void writeStrToFile(String str,String filePath,String fileName){
        BufferedOutputStream buf=null;
        try{
            buf=new BufferedOutputStream(new FileOutputStream(
                    new File(filePath+File.separator+fileName)));
            buf.write(str.getBytes("UTF-8"));
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                if(null!=buf){
                    buf.close();
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
