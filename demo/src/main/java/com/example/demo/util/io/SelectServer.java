package com.example.demo.util.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by zhanghualong on 2018/1/16.
 * nio selector demo
 */
public class SelectServer {


    public void selector(){
        ServerSocketChannel serverSocketChannel=null;
        Selector selector=null;
        try{
            selector=Selector.open();
            serverSocketChannel=ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(8087));
            serverSocketChannel.configureBlocking(false);
            //Selector一起使用时，Channel必须处于非阻塞模式下。这意味着不能将FileChannel与Selector一起使用
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            while(true){
                int n=selector.select();
                if (n==0) continue;
                Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
                while (iterator.hasNext()){
                    SelectionKey selectionKey=iterator.next();
                    if (selectionKey.isAcceptable()){
                        handleAccept(selectionKey);
                    }else if (selectionKey.isReadable()){
                        handleRead(selectionKey);
                    }else if(selectionKey.isWritable() && selectionKey.isValid()){
                        handleWrite(selectionKey);
                    }else if(selectionKey.isConnectable()){
                        System.out.println("isConnectable = true");
                    }else{
                        System.out.println("其他事件 暂无处理");
                    }
                    iterator.remove();
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                if (null!=selector) selector.close();
                if (null!=serverSocketChannel) serverSocketChannel.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static void handleAccept(SelectionKey key) throws IOException{
        ServerSocketChannel ssChannel = (ServerSocketChannel)key.channel();
        SocketChannel sc = ssChannel.accept();
        sc.configureBlocking(false);
        sc.register(key.selector(), SelectionKey.OP_READ,ByteBuffer.allocateDirect(1024));
    }

    public static void handleRead(SelectionKey key) throws IOException{
        SocketChannel sc = (SocketChannel)key.channel();
        ByteBuffer buf = (ByteBuffer)key.attachment();
        long bytesRead = sc.read(buf);
        while(bytesRead>0){
            buf.flip();
            while(buf.hasRemaining()){
                System.out.print((char)buf.get());
            }
            System.out.println();
            buf.clear();
            bytesRead = sc.read(buf);
        }
        if(bytesRead == -1){
            sc.close();
        }
    }

    public static void handleWrite(SelectionKey key) throws IOException{
        ByteBuffer buf = (ByteBuffer)key.attachment();
        buf.flip();
        SocketChannel sc = (SocketChannel) key.channel();
        while(buf.hasRemaining()){
            sc.write(buf);
        }
        buf.compact();
    }


    public static void main(String[] args) throws Exception{
        System.out.println("server 运行开始");
        new SelectServer().selector();
    }
}
