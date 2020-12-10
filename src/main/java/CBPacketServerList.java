public class CBPacketServerList extends IllllIllIllIIIIIIlIllIIll {
    private final String hmmm = "You sure you know how this works? im gonna say no, you should leave.";

    public CBPacketServerList() {}

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIllllllllIlIIIllIIllII in) {
        int serversAmount = in.readInt();
        for (int i = 0; i < serversAmount; ++i) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.IlIlIIIlllIIIlIlllIlIllIl().lIIIIIIIIIlIllIIllIlIIlIl().add(new String[] { in.IlllIIIlIlllIllIlIIlllIlI(128), in.IlllIIIlIlllIllIlIIlllIlI(512) });
        }
    }

    @Override
    public void lIIIIIIIIIlIllIIllIlIIlIl(lIlIllllllllIlIIIllIIllII out) { }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIlllIlIllIIlIIIIll handler) { }
}
