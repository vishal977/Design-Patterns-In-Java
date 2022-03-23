package com.purple.designpatterns.observer;

import java.util.List;

public class ChatRoomParticipant implements ChatRoomObserver {
	
	private ChatRoomConcrete chatRoom;
	
	public String userName;
	
	private List<String> messages;
	
	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public ChatRoomParticipant(String userName, ChatRoomConcrete chatRoom) {
		this.userName = userName;
		this.chatRoom = chatRoom;
	}
	
	@Override
	public void update() {
		setMessages(chatRoom.getAllMessages());
		System.out.println("Chat window for participant - " + userName + " has been updated!");
	}
	
	public String getUserName() {
		return userName;
	}
}
