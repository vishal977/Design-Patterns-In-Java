package com.purple.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomConcrete implements ChatRoomObservable {
	
	private List<ChatRoomParticipant> observers;
	
	public ChatRoomConcrete() {
		observers = new ArrayList<>();
		chatRoomMessages = new ArrayList<>();
	}
	
	private List<String> chatRoomMessages;

	@Override
	public void addObserver(ChatRoomParticipant participant) {
		System.out.println("Added new participant - " + participant.getUserName());
		observers.add(participant);
	}

	@Override
	public void removeObserver(ChatRoomParticipant observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(ChatRoomObserver obs: observers) {
			obs.update();
		}
	}

	/* Upon adding a new message into the chat room, all participants are notified. */
	public void addMessageToChatRoom(String message) {
		chatRoomMessages.add(message);
		this.notifyObservers();
	}
	
	public List<String> getAllMessages() {
		return chatRoomMessages;
	}
	
}
