package com.purple.designpatterns.singleton;

public class DriverCode {

	public static void main(String[] args) {
		GlobalChatChannel gcc = GlobalChatChannel.getInstance();
		GlobalChatChannel gcc2 = GlobalChatChannel.getInstance();
		System.out.println(gcc == gcc2);
	}

}
