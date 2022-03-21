package com.purple.designpatterns.observer;

public class DriverCode {

	public static void main(String[] args) {
		System.out.println("Creating a new chat room...");
		ChatRoomConcrete generalChat = new ChatRoomConcrete();
		
		System.out.println("Adding 3 participants - John, Harry and Amy");
		ChatRoomParticipant john = new ChatRoomParticipant("John", generalChat);
		generalChat.addObserver(john);
		ChatRoomParticipant harry = new ChatRoomParticipant("Harry", generalChat);
		generalChat.addObserver(harry);
		ChatRoomParticipant amy = new ChatRoomParticipant("Amy", generalChat);
		generalChat.addObserver(amy);
		
		System.out.println("Adding messages to chat room");
		generalChat.addMessageToChatRoom("Hello World");
		generalChat.addMessageToChatRoom("This is");
		generalChat.addMessageToChatRoom("A test message");
	}

}
