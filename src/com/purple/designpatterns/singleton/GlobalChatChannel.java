package com.purple.designpatterns.singleton;

public class GlobalChatChannel {
	
	static GlobalChatChannel globalChatChannelInstance;
	
	private GlobalChatChannel() {}
	
	public static GlobalChatChannel getInstance() {
		if(globalChatChannelInstance != null)
			return globalChatChannelInstance;
		else {
			globalChatChannelInstance = new GlobalChatChannel();
			return globalChatChannelInstance;
		}
	}

}
