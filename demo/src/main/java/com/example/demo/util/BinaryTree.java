package com.example.demo.util;


import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.stream.Stream;


public class BinaryTree {

	
	public static void main(String[] args) {

		int count= Stream.of(1,2,3).reduce(0,(acc,element) -> acc +element
				);
		System.out.println(count);

		FileChannel channel;
		ByteBuffer byteBuffer;
	}
    
}
