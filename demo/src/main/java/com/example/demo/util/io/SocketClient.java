package com.example.demo.util.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by zhanghualong on 2018/1/11.
 */
public class SocketClient {

    public void sendAndRecieve() throws Exception{
        Socket clientSocket=new Socket("localhost",8087);
        //发送内容
        OutputStream os = clientSocket.getOutputStream();//字节输出流
        PrintWriter pw =new PrintWriter(os);//将输出流包装成打印流
        pw.write("用户名：admin；密码：123");
        pw.flush();
        clientSocket.shutdownOutput();
        //读取内容
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String info = null;
        while((info=br.readLine())!=null){
            System.out.println("我是客户端，服务器说："+info);
        }
        //关闭资源
        br.close();
        pw.close();
        os.close();
        clientSocket.close();
    }

    public static void main(String[] args) throws  Exception{

        new SocketClient().sendAndRecieve();
    }
}
