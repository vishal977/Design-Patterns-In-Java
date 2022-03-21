package com.purple.designpatterns.observer;

public interface ChatRoomObservable {
	
	public void addObserver(ChatRoomParticipant observer);
	
	public void removeObserver(ChatRoomParticipant observer);
	
	public void notifyObservers();
}
