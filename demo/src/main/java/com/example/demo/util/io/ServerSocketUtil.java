package com.example.demo.util.io;

import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhanghualong on 2018/1/11.
 */
public class ServerSocketUtil {

    ServerSocket serverSocket = null;
    private static int port=8087;

    public void startAndOperate() {
        try {
            serverSocket=new ServerSocket(port);

            while (true){
                System.out.println("================start");
                Socket clientSocket=serverSocket.accept();
                System.out.println("================end");
                dealWithSocket(clientSocket);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void dealWithSocket(Socket socket){
        System.out.println("accepted from " + socket.getInetAddress() + " @ " + socket.getPort());
        try{
            //接收数据
            BufferedInputStream bufiput=new BufferedInputStream(socket.getInputStream());
            byte[] buff=new byte[1024];
            int length=0;
            String str="";
            while ( (length=bufiput.read(buff))!=-1 ){
                str+=new String(buff);
            }
            System.out.println("accepted message"+str);
            socket.shutdownInput();
            //返回结果
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.write("欢迎您！");
            pw.flush();
            //关闭资源
            bufiput.close();
            pw.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new ServerSocketUtil().startAndOperate();
    }
}
