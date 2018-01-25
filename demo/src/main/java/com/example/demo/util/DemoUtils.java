package com.example.demo.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.*;

/**
 * Created by zhanghualong on 2017/11/27.
 */
public class DemoUtils {

    public static void main(String[] args) throws Exception{
        System.out.print("server 运行开始");
        List<String> a_list=new ArrayList<String>();
        a_list.add("1");
        a_list.add("2");
        a_list.add("3");
        System.out.println(a_list.toString());
        Iterator<String> iterator_str=a_list.iterator();
        while(iterator_str.hasNext()){
        	String tmp=iterator_str.next();
        	if(tmp.equals("2")){
        		iterator_str.remove();
        	}
        }
        System.out.println(a_list.toString());
    }

}
