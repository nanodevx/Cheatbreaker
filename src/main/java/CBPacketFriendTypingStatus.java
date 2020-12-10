public class CBPacketFriendTypingStatus extends IllllIllIllIIIIIIlIllIIll {
    private String playerId;
    private boolean typing;

    public CBPacketFriendTypingStatus() {}

    public CBPacketFriendTypingStatus(String playerId, boolean isTyping) {
        this.playerId = playerId;
        this.typing = isTyping;
    }


    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIllllllllIlIIIllIIllII out) { // write
        out.lIIIIlIIllIIlIIlIIIlIIllI(this.playerId);
        out.writeBoolean(this.typing);
    }

    @Override
    public void lIIIIIIIIIlIllIIllIlIIlIl(lIlIllllllllIlIIIllIIllII in) { // read
        this.playerId = in.IlllIIIlIlllIllIlIIlllIlI(52);
        this.typing = in.readBoolean();
    }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIlllIlIllIIlIIIIll handler) { // handle
        handler.playerTyping(this);
    }

    public String getPlayerId() {
        return playerId;
    }

    public boolean isTyping() {
        return typing;
    }
}
