package com.offlinecheatbreaker.client.data;

public class FriendTypingData {
    private String playerId;

    private boolean incoming;

    // static
    private long startedTypingTime = -1L;

    /**
     * Store FriendTyping Data.
     *
     * @param playerId
     */
    public FriendTypingData(String playerId, boolean incoming) {
        this.playerId = playerId;
        this.incoming = incoming;

        if (!incoming) {
            this.startedTypingTime = System.currentTimeMillis();
        }
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setStartedTypingTime(long startedTypingTime) {
        this.startedTypingTime = startedTypingTime;
    }

    public boolean hasTypingExpired() {
        return (this.startedTypingTime != -1L && this.startedTypingTime + 2500 < System.currentTimeMillis());
    }
}
