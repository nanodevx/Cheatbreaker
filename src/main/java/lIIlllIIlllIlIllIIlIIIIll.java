import java.net.*;

import com.offlinecheatbreaker.client.data.FriendTypingData;
import io.netty.buffer.*;
import java.nio.*;
import com.google.gson.*;
import java.math.*;
import com.mojang.authlib.exceptions.*;
import com.mojang.authlib.minecraft.*;
import java.util.*;
import com.mojang.authlib.yggdrasil.*;
import com.cheatbreaker.client.network.messages.*;
import java.security.spec.*;
import javax.crypto.*;
import java.security.*;
import java.io.*;

// CheatBreaker Websocket Handler.
@SuppressWarnings({"unchecked", "unused", "deprecation", "rawtypes"})
public class lIIlllIIlllIlIllIIlIIIIll extends IlIllIlIIIIllIIIllllIIIlI
{
    private final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private final lIIIllIllIllIlllIlIIlIlII IIIIllIlIIIllIlllIlllllIl;
    private final List IIIIllIIllIIIIllIllIIIlIl;
    
	public lIIlllIIlllIlIllIIlIIIIll(final URI var1, final Map var2) {
        super(var1, new IIIIIlIllllllIIIIIIIlIlll(), var2, 0);
        this.IIIIllIlIIIllIlllIlllllIl = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
        this.IIIIllIIllIIIIllIllIIIlIl = new ArrayList();
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IllllIllIllIIIIIIlIllIIll var1) {
        if (this.IlllIllIlIIIIlIIlIIllIIIl()) {
            final lIlIllllllllIlIIIllIIllII var2 = new lIlIllllllllIlIIIllIIllII(Unpooled.buffer());
            var2.lIIIIIIIIIlIllIIllIlIIlIl((int)IllllIllIllIIIIIIlIllIIll.lIIIIIIIIIlIllIIllIlIIlIl.get(var1.getClass()));
            try {
                var1.lIIIIlIIllIIlIIlIIIlIIllI(var2);
                this.lIIIIlIIllIIlIIlIIIlIIllI(var2.array());
            }
            catch (Exception var3) {
                var3.printStackTrace();
            }
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lIlIllllllllIlIIIllIIllII var1) {
        final int var2 = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final Class<IllllIllIllIIIIIIlIllIIll> var3 = (Class<IllllIllIllIIIIIIlIllIIll>)IllllIllIllIIIIIIlIllIIll.lIIIIIIIIIlIllIIllIlIIlIl.inverse().get(var2);
        try {
			final IllllIllIllIIIIIIlIllIIll var4 = (var3 == null) ? null : var3.newInstance();
            if (var4 == null) {
                return;
            }
            var4.lIIIIIIIIIlIllIIllIlIIlIl(var1);
            var4.lIIIIlIIllIIlIIlIIIlIIllI(this);
        }
        catch (Exception var5) {
            System.out.println("Error from: " + var3);
            var5.printStackTrace();
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IllIIllIIlllIlllIllIIIIIl var1) {
        System.out.println("[CB] Connection established");
        this.welcomeUser(); // Welcome the user to the webserver!
        if (Objects.equals(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI(), lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
            this.IlllIIIlIlllIllIlIIlllIlI();
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final ByteBuffer var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI(new lIlIllllllllIlIIIllIIllII(Unpooled.wrappedBuffer(var1.array())));
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final String var1) {
    }
    
	public void lIIIIlIIllIIlIIlIIIlIIllI(final llIllIIlllllIIIIIIllIllll var1) {
        lIIIllllIIllIIIIIlIIlIIlI.cb.lIIlllIIlIlllllllllIIIIIl().add(var1.lIIIIlIIllIIlIIlIIIlIIllI());
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IlIlIIIlIIIlIIllIlIlIIIll var1) {
        final String var2 = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final lIIllIIIIllIIlllIIIIlllII var3 = lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl(var2);
        if (var3 != null) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().remove(var2);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(var3, false);
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IlIIlIIllIIIlIllIllllIIlI var1) {
        final String playerId = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final String message = var1.lIIIIIIIIIlIllIIllIlIIlIl();
        final lIIllIIIIllIIlllIIIIlllII friend = lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().get(playerId);
        if (friend != null) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI(friend.IlllIIIlIlllIllIlIIlllIlI(), message);
            if (lIIIllllIIllIIIIIlIIlIIlI.cb.IllIIlIIlllllIllIIIlllIII() != lIlIlIllIlIlIIIIllIlllIll.IlllIIIlIlllIllIlIIlllIlI) {
                lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIIIIIlIllIIllIlIIlIl("message");
                llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.IlIlllIIIIllIllllIllIIlIl + friend.IIIIllIlIIIllIlllIlllllIl() + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + " says:", message);
            }
            for (final Object o : IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IlIlllIIIIllIllllIllIIlIl()) {
                final llllIIIIlIlIllIIIllllIIll gui = (llllIIIIlIlIllIIIllllIIll)o;
                if (gui instanceof lIlIIIlIIIlllllllllllIlIl && ((lIlIIIlIIIlllllllllllIlIl)gui).lIIIIllIIlIlIllIIIlIllIlI() == friend) {
                    lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI(friend.IlllIIIlIlllIllIlIIlllIlI());
                }
            }
        }
    }
    
    private void lIIIIlIIllIIlIIlIIIlIIlll(final IllllIllIllIIIIIIlIllIIll p) {
        this.lIIIIlIIllIIlIIlIIIlIIllI(p);
    }
    
    public void lIIIIIIIIIlIllIIllIlIIlIl(final String server) {
        this.lIIIIlIIllIIlIIlIIIlIIlll(new lllIIllIlIIlllIIIIIlllllI("", server));
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lllIIllIlIIlllIIIIIlllllI var1) {
        final String var2 = var1.lIIIIIIIIIlIllIIllIlIIlIl();
        final String var3 = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final lIIllIIIIllIIlllIIIIlllII var4 = lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().get(var2);
        if (var4 != null) {
            var4.IlllIIIlIlllIllIlIIlllIlI(var3);
        }
    }

    public void playerTyping(final CBPacketFriendTypingStatus packet) {
	    if(packet.isTyping()) {
	        System.out.println("INCOMING DATA");
            //cb.getPlayersTypingToUser().add(packet.getPlayerId());
            cb.getFriendsTypingInComingData().add(new FriendTypingData(packet.getPlayerId(), true));

            lIIllIIIIllIIlllIIIIlllII friend = lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().get(packet.getPlayerId());

            if (friend != null && lIIIllllIIllIIIIIlIIlIIlI.cb.IllIIlIIlllllIllIIIlllIII() != lIlIlIllIlIlIIIIllIlllIll.IlllIIIlIlllIllIlIIlllIlI) {
                llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(friend.IIIIllIlIIIllIlllIlllllIl(), "Has started typing.");
            }
        } else {
	        System.out.println("INCOMING DATA");
	        cb.getFriendsTypingInComingData().removeIf(friendTypingData -> friendTypingData.getPlayerId().equals(packet.getPlayerId())); // must of expired.
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final llIIIllIIlllIIIIllIllIlIl packet) {
        lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().clear();
        final JsonArray friendList = packet.lIIIIlIIllIIlIIlIIIlIIllI();
        for (final JsonElement element : friendList) {
            final JsonObject friendObject = element.getAsJsonObject();
            final String uuid = friendObject.get("uuid").getAsString();
            final String name = friendObject.get("name").getAsString();
            final IIllIIIIllIIIIIllllIllllI request = new IIllIIIIllIIIIIllllIllllI(name, uuid);
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().put(uuid, request);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(request, true);
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IllllIllIllIIIIIIlIllIIll var1, final boolean var2) {
        if (var2) {
            final lllllIlIIlIlIIlllIlllIIll var3 = (lllllIlIIlIlIIlllIlllIIll)var1;
            final IIllIIIIllIIIIIllllIllllI var4 = new IIllIIIIllIIIIIllllIllllI(var3.lIIIIIIIIIlIllIIllIlIIlIl(), var3.lIIIIlIIllIIlIIlIIIlIIllI());
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().put(var3.lIIIIlIIllIIlIIlIIIlIIllI(), var4);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
            var4.lIIIIlIIllIIlIIlIIIlIIllI(var3.IlllIIIlIlllIllIlIIlllIlI());
            llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI("Friend Request", "Request has been sent.");
        }
        else {
            final llIlIlIIlIlllIIlIlllIIIII var5 = (llIlIlIIlIlllIIlIlllIIIII)var1;
            final String var6 = var5.lIIIIlIIllIIlIIlIIIlIIllI();
            final String var7 = var5.lIIIIIIIIIlIllIIllIlIIlIl();
            final IIllIIIIllIIIIIllllIllllI var8 = new IIllIIIIllIIIIIllllIllllI(var7, var6);
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().put(var6, var8);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(var8, true);
            if (lIIIllllIIllIIIIIlIIlIIlI.cb.IllIIlIIlllllIllIIIlllIII() != lIlIlIllIlIlIIIIllIlllIll.IlllIIIlIlllIllIlIIlllIlI) {
                lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIIIIIlIllIIllIlIIlIl("message");
                llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI("Friend Request", var8.lIIIIlIIllIIlIIlIIIlIIllI() + " wants to be your friend.");
            }
        }
    }
    
    private void welcomeUser() {
    	llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.IlIlllIIIIllIllllIllIIlIl + "Connected", "Welcome, " + this.IIIIllIlIIIllIlllIlllllIl.IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI() + ".");
    }
    
    private void byeUser() {
    	llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "Disconnected", "Bye, " + this.IIIIllIlIIIllIlllIlllllIl.IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI() + ".");
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IIIIlIllIlIIIllIIIIIIllII var1) {
        final String playerId = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final String name = var1.lIIIIIIIIIlIllIIllIlIIlIl();
        final boolean online = var1.IIIIllIlIIIllIlllIlllllIl();
        lIIllIIIIllIIlllIIIIlllII var2 = lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().get(playerId);
        if (var2 == null) {
            var2 = lIIllIIIIllIIlllIIIIlllII.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(online).lIIIIIIIIIlIllIIllIlIIlIl(name).lIIIIlIIllIIlIIlIIIlIIllI(playerId).lIIIIlIIllIIlIIlIIIlIIllI(online).lIIIIlIIllIIlIIlIIIlIIllI(lIlIlIllIlIlIIIIllIlllIll.lIIIIlIIllIIlIIlIIIlIIllI).lIIIIlIIllIIlIIlIIIlIIllI();
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().put(playerId, var2);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(var2, true);
        }
        if (var1.IlllIIIlIlllIllIlIIlllIlI() < 10L) {
            final int var3 = (int)var1.IlllIIIlIlllIllIlIIlllIlI();
            lIlIlIllIlIlIIIIllIlllIll var4 = lIlIlIllIlIlIIIIllIlllIll.lIIIIlIIllIIlIIlIIIlIIllI;
            lIlIlIllIlIlIIIIllIlllIll[] values;
            for (int length = (values = lIlIlIllIlIlIIIIllIlllIll.values()).length, i = 0; i < length; ++i) {
                final lIlIlIllIlIlIIIIllIlllIll var5 = values[i];
                if (var5.ordinal() == var3) {
                    var4 = var5;
                }
            }
            var2.lIIIIIIIIIlIllIIllIlIIlIl(var4);
        }
        var2.lIIIIlIIllIIlIIlIIIlIIllI(online);
        var2.lIIIIlIIllIIlIIlIIIlIIllI(name);
        IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IIIlIIllllIIllllllIlIIIll().lIIIIllIIlIlIllIIIlIllIlI();
        if (!online) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IIlllllIIIlIIlIIIIIlllIlI packet) {
        lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().clear();
        final Map<String, List> var2 = (Map<String, List>)packet.IlllIIIlIlllIllIlIIlllIlI();
        final Map<String, List> var3 = (Map<String, List>)packet.IIIIllIlIIIllIlllIlllllIl();
        lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIlIIllIIlIIlIIIlIIllI(packet.lIIIIlIIllIIlIIlIIIlIIllI());
        lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIIIIIlIllIIllIlIIlIl(packet.lIIIIIIIIIlIllIIllIlIIlIl());
        for (final Map.Entry<String, List> entry : var2.entrySet()) {
            final String uuid = entry.getKey();
            final String name = (String) entry.getValue().get(0);
            final int statusOrdinal = (int) entry.getValue().get(1);
            final String server = (String) entry.getValue().get(2);
            lIlIlIllIlIlIIIIllIlllIll onlineStatus = lIlIlIllIlIlIIIIllIlllIll.lIIIIlIIllIIlIIlIIIlIIllI;
			final lIlIlIllIlIlIIIIllIlllIll[] statusValues;
            final lIlIlIllIlIlIIIIllIlllIll[] values = lIlIlIllIlIlIIIIllIlllIll.values();
            lIlIlIllIlIlIIIIllIlllIll[] array;
            for (int length = (array = values).length, i = 0; i < length; ++i) {
                final lIlIlIllIlIlIIIIllIlllIll status = array[i];
                if (status.ordinal() == statusOrdinal) {
                    onlineStatus = status;
                }
            }
            final lIIllIIIIllIIlllIIIIlllII friend = lIIllIIIIllIIlllIIIIlllII.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIIIIIIlIllIIllIlIIlIl(name).lIIIIlIIllIIlIIlIIIlIIllI(uuid).IIIIllIlIIIllIlllIlllllIl(server).lIIIIlIIllIIlIIlIIIlIIllI(onlineStatus).lIIIIlIIllIIlIIlIIIlIIllI(true).IlllIIIlIlllIllIlIIlllIlI("Online").lIIIIlIIllIIlIIlIIIlIIllI();
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().put(uuid, friend);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(friend, true);
        }
        for (final Map.Entry<String, List> entry : var3.entrySet()) {
            final String uuid = entry.getKey();
            final String name = (String) entry.getValue().get(0);
            final lIIllIIIIllIIlllIIIIlllII friend2 = lIIllIIIIllIIlllIIIIlllII.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIIIIIIlIllIIllIlIIlIl(name).lIIIIlIIllIIlIIlIIIlIIllI(uuid).IIIIllIlIIIllIlllIlllllIl("").lIIIIlIIllIIlIIlIIIlIIllI(lIlIlIllIlIlIIIIllIlllIll.lIIIIlIIllIIlIIlIIIlIIllI).lIIIIlIIllIIlIIlIIIlIIllI(false).IlllIIIlIlllIllIlIIlllIlI("Online").lIIIIlIIllIIlIIlIIIlIIllI((String) entry.getValue().get(1)).lIIIIlIIllIIlIIlIIIlIIllI();
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().put(uuid, friend2);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(friend2, true);
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lllIlllIIIIIllllIIIlIIlIl packet) {
        final String uuid = packet.lIIIIIIIIIlIllIIllIlIIlIl();
        lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIllllIIIIlIlIIIIlIlI().removeIf(var1x -> var1x.IIIIllIlIIIllIlllIlllllIl().equals(uuid));
        lIIIllllIIllIIIIIlIIlIIlI.cb.lllIIIIIlIllIlIIIllllllII().removeIf(var1x -> var1x.IIIIllIlIIIllIlllIlllllIl().equals(uuid));
        lIIIllllIIllIIIIIlIIlIIlI.cb.IlllIIIlIlllIllIlIIlllIlI(uuid);
        for (final IlIlIIIlllIIIlIlllIlIllIl cosmetic : packet.lIIIIlIIllIIlIIlIIIlIIllI()) {
            try {
                if (cosmetic.lIIIIlIIllIIlIIlIIIlIIllI().equals("cape")) {
                    lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIllllIIIIlIlIIIIlIlI().add(cosmetic);
                }
                else {
                    lIIIllllIIllIIIIIlIIlIIlI.cb.lllIIIIIlIllIlIIIllllllII().add(cosmetic);
                }
                final lIllIIIIlIIlIllIIIlIlIlll var5 = (this.IIIIllIlIIIllIlllIlllllIl.lIIIIllIIlIlIllIIIlIllIlI == null) ? null : this.IIIIllIlIIIllIlllIlllllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(uuid);
                if (!cosmetic.IlIlIIIlllIIIlIlllIlIllIl()) {
                    continue;
                }
                if (!(var5 instanceof IIlllIIIIIIlllIllIlIlIlII)) {
                    continue;
                }
                if (cosmetic.lIIIIlIIllIIlIIlIIIlIIllI().equals("cape")) {
                    ((IIlllIIIIIIlllIllIlIlIlII)var5).lIIIIlIIllIIlIIlIIIlIIllI(cosmetic.lIIIIIIIIIlIllIIllIlIIlIl());
                    var5.lIIIIlIIllIIlIIlIIIlIIllI(cosmetic);
                }
                else {
                    var5.lIIIIIIIIIlIllIIllIlIIlIl(cosmetic);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int code, final String reason, final boolean remote) {
        System.out.println("Close: " + reason + " (" + code + ") - " + remote);
        if (code != -1 && code != 1003 && code != 1013 && code != 1000) // prevent websocket disconnect from sending this without the websocket actually going offline.
            this.byeUser();
        new IllIlllllIllIIIIlIlIIIIll().start();
        IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lllIIIIIlIllIlIIIllllllII().IllIIIIIIIlIlIllllIIllIII().clear();
        IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IIIlIIllllIIllllllIlIIIll().IllIIIIIIIlIlIllllIIllIII().clear();
        lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().clear();
        lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().clear();
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final Exception var1) {
        System.out.println("Error: " + var1.getMessage());
        var1.printStackTrace();
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lIlllIlIIllllIllIIlIlIlIl packet) {
        final String title = packet.lIIIIlIIllIIlIIlIIIlIIllI();
        final String message = packet.lIIIIIIIIIlIllIIllIlIIlIl();
        lIIIllllIIllIIIIIlIIlIIlI.cb.lIIlllIIlIlllllllllIIIIIl().add(IlIllllIIlIIllIlIlllllIlI.lIIIIllIIlIlIllIIIlIllIlI + "[" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + packet.lIIIIlIIllIIlIIlIIIlIIllI() + IlIllllIIlIIllIlIlllllIlI.lIIIIllIIlIlIllIIIlIllIlI + "] " + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + packet.lIIIIIIIIIlIllIIllIlIIlIl());
        llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(title, message);
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final llIlIlIIIIlIIlIlIIIllllll var1) {
        final SecretKey var2 = IIlIlIIIIIlIllIllllllIIlI.lIIIIlIIllIIlIIlIIIlIIllI();
        final PublicKey var3 = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        final String var4 = new BigInteger(IIlIlIIIIIlIllIllllllIIlI.lIIIIlIIllIIlIIlIIIlIIllI("", var3, var2)).toString(16);
        try {
            this.lIllIllIlIIllIllIlIlIIlIl().joinServer(this.IIIIllIlIIIllIlllIlllllIl.IIIIlIIIlllllllllIlllIlll().IIIIllIIllIIIIllIllIIIlIl(), this.IIIIllIlIIIllIlllIlllllIl.IIIIlIIIlllllllllIlllIlll().IIIIllIlIIIllIlllIlllllIl(), var4);
        }
        catch (AuthenticationUnavailableException var5) {
            llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI("Authentication Unavailable", var5.getMessage());
            return;
        }
        catch (InvalidCredentialsException var6) {
            llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI("Invalid Credentials", var6.getMessage());
            return;
        }
        catch (AuthenticationException var7) {
            llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI("Authentication Error", var7.getMessage());
            return;
        }
        catch (NullPointerException var12) {
            this.IlllIIIlIlllIllIlIIlllIlI();
        }
        try {
            final lIlIllllllllIlIIIllIIllII var8 = new lIlIllllllllIlIIIllIIllII(Unpooled.buffer());
            final IIIllllllIlllIllllIlIIIII var9 = new IIIllllllIlllIllllIlIIIII(var2, var3, var1.lIIIIIIIIIlIllIIllIlIIlIl());
            var9.lIIIIlIIllIIlIIlIIIlIIllI(var8);
            this.lIIIIlIIllIIlIIlIIIlIIllI(var9);
            final File var10 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles.txt");
            if (var10.exists()) {
                this.lIIIIlIIllIIlIIlIIIlIIllI(var9);
            }
        }
        catch (Exception var11) {
            var11.printStackTrace();
        }
    }
    
    private MinecraftSessionService lIllIllIlIIllIllIlIlIIlIl() {
        return new YggdrasilAuthenticationService(this.IIIIllIlIIIllIlllIlllllIl.IlIIIIllIIIIIlllIIlIIlllI(), UUID.randomUUID().toString()).createMinecraftSessionService();
    }
    
    @Override
    public void IlllIIIlIlllIllIlIIlllIlI(final String var1) {
        if (this.IlllIllIlIIIIlIIlIIllIIIl()) {
            super.IlllIIIlIlllIllIlIIlllIlI(var1);
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IIlllIIIIIIlllIllIlIlIlII var1) {
        if (var1.llllIIllllllIlIIlIlIIIllI() != null && this.IIIIllIlIIIllIlllIlllllIl.IlIlllIIIIllIllllIllIIlIl != null) {
            final String var2 = var1.llllIIllIIlllllIlIlIIllll().toString();
            if (!this.IIIIllIIllIIIIllIllIIIlIl.contains(var2) && !var2.equals(this.IIIIllIlIIIllIlllIlllllIl.IlIlllIIIIllIllllIllIIlIl.llllIIllIIlllllIlIlIIllll().toString())) {
                this.IIIIllIIllIIIIllIllIIIlIl.add(var2);
                this.lIIIIlIIllIIlIIlIIIlIIllI(new lIlIIllIllllIllllIllllIII(var2));
            }
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        final List<IlIlIIIlllIIIlIlllIlIllIl> cosmetics = (List<IlIlIIIlllIIIlIlllIlIllIl>)lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlIIllllIIllllllIlIIIll();
        if (cosmetics.isEmpty()) {
            return;
        }
        this.lIIIIlIIllIIlIIlIIIlIIllI(new lIIlIlIlIlIlllIlllIlIlIlI(cosmetics));
    }
    
    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        this.lIIIIlIIllIIlIIlIIIlIIllI((IllllIllIllIIIIIIlIllIIll)new IIIIlIllIlIIIllIIIIIIllII("", "", lIIIllllIIllIIIIIlIIlIIlI.cb.IllIIlIIlllllIllIIIlllIII().ordinal(), true));
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IlIlIlIIIlIIlllIllIllIIlI var1) { // TODO: Fix the player not being removed from the request list.
        if (!var1.lIIIIlIIllIIlIIlIIIlIIllI()) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIllIIIIlllIlIIIIIlI().lIIIIIIIIIlIllIIllIlIIlIl().remove(var1.lIIIIIIIIIlIllIIllIlIIlIl());
            IlIIlIllIllllIIlIllllIlII var2 = null;
            List<IlIIlIllIllllIIlIllllIlII> friends = IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lllIIIIIlIllIlIIIllllllII().llIIlllIIIIlllIllIlIlllIl();
            
            for (final IlIIlIllIllllIIlIllllIlII var3 : friends) {
                if (var3.IllIIIIIIIlIlIllllIIllIII().lIIIIIIIIIlIllIIllIlIIlIl().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl())) {
                    var2 = var3;
                }
            }
            if (var2 != null) {
                IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lllIIIIIlIllIlIIIllllllII().llIIlllIIIIlllIllIlIlllIl().add(var2);
                IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(var2.IllIIIIIIIlIlIllllIIllIII(), false);
            }
        }
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IlIIIIIllIIIIlIIIllIIlIII var1) {
        try {
            final byte[] var2 = lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIlIIllIIlIIlIIIlIIllI(), Message.i());
            this.lIIIIlIIllIIlIIlIIIlIIllI(new lllIlIIlIIIlIlIIIllIlllIl(var2));
        }
        catch (Exception | UnsatisfiedLinkError ex) {}
    }
    
    public static byte[] lIIIIlIIllIIlIIlIIIlIIllI(final byte[] var0, final byte[] var1) throws Exception {
        final PublicKey var2 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(var0));
        final Cipher var3 = Cipher.getInstance("RSA");
        var3.init(1, var2);
        return var3.doFinal(var1);
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final llllIIlIlllIIllIllIIlIIlI var1) {
        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIllllIIIlIllllIIIIIllII = true;
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IIlIllllIIlIlIIIlllIIllIl var1) {
        try {
            final File var2 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles.txt");
            if (!var2.exists()) {
                var2.createNewFile();
            }
            try {
                final BufferedWriter var3 = new BufferedWriter(new FileWriter(var2));
                var3.write("################################");
                var3.newLine();
                var3.write("# MC_Client: PROFILES");
                var3.newLine();
                var3.write("################################");
                var3.newLine();
                for (final IlIIlIIlIIlllIlIIIlIllIIl var4 : lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIIIIIlIllIIllIlIIlIl) {
                    var3.write(String.valueOf(var4.lIIIIlIIllIIlIIlIIIlIIllI()) + ":" + var4.lIIIIlIIllIIlIIlIIIlIIllI);
                    var3.newLine();
                }
                var3.close();
            }
            catch (Exception ex) {}
        }
        catch (Exception ex2) {}
    }
}
