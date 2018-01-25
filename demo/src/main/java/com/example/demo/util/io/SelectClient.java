package com.example.demo.util.io;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by zhanghualong on 2018/1/12.
 * nio socketchennel 客户端
 */
public class SelectClient extends  Thread{

    private static final String STR = "Hello World!";
    private static final String REMOTE_IP = "127.0.0.1";
    private static final int port=8087;
    private static final int THREAD_COUNT = 5;

    @Override
    public void run() {
        try{
            SocketChannel sc = SocketChannel.open();
            sc.configureBlocking(false);
            sc.connect(new InetSocketAddress(REMOTE_IP, port));
            while (!sc.finishConnect()){
                System.out.println("同" + REMOTE_IP + "的连接正在建立，请稍等！");
                Thread.sleep(1000);
            }
            System.out.println(this.getName()+"发送内容 开始时间为" + System.currentTimeMillis());
            String writeStr = STR + this.getName();
            ByteBuffer bb = ByteBuffer.allocate(writeStr.length());
            bb.put(writeStr.getBytes());
            bb.flip(); // 写缓冲区的数据之前一定要先反转(flip)
            sc.write(bb);
            bb.clear();
            sc.close();
            System.out.println(this.getName()+"发送内容 结束时间为" + System.currentTimeMillis());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        SelectClient[] arrays=new SelectClient[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++)
            arrays[i] = new SelectClient();
        for (int i = 0; i < THREAD_COUNT; i++)
            arrays[i].start();
        // 一定要join保证线程代码先于sc.close()运行，否则会有AsynchronousCloseException
        for (int i = 0; i < THREAD_COUNT; i++)
            arrays[i].join();
    }

}
