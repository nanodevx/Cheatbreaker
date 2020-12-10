import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import io.netty.buffer.ByteBuf;

@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class IllllIllIllIIIIIIlIllIIll {
   public static BiMap lIIIIIIIIIlIllIIllIlIIlIl = HashBiMap.create();

   public abstract void lIIIIlIIllIIlIIlIIIlIIllI(lIlIllllllllIlIIIllIIllII var1);

   public abstract void lIIIIIIIIIlIllIIllIlIIlIl(lIlIllllllllIlIIIllIIllII var1);

   public abstract void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIlllIlIllIIlIIIIll var1);

   protected void lIIIIlIIllIIlIIlIIIlIIllI(ByteBuf var1, byte[] var2) {
      var1.writeShort(var2.length);
      var1.writeBytes(var2);
   }

   protected byte[] lIIIIlIIllIIlIIlIIIlIIllI(ByteBuf var1) {
      short var2 = var1.readShort();
      if (var2 < 0) {
         System.out.println("[WS] Key was smaller than nothing!  Weird key!");
         return new byte[0];
      } else {
         byte[] var3 = new byte[var2];
         var1.readBytes(var3);
         return var3;
      }
   }

   static {
      lIIIIIIIIIlIllIIllIlIIlIl.put(llIlIlIIIIlIIlIlIIIllllll.class, 0);
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIIllllllIlllIllllIlIIIII.class, 1);
      lIIIIIIIIIlIllIIllIlIIlIl.put(llIllIIlllllIIIIIIllIllll.class, 2); // command
      lIIIIIIIIIlIllIIllIlIIlIl.put(lIlllIlIIllllIllIIlIlIlIl.class, 3); // notification
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIlllllIIIlIIlIIIIIlllIlI.class, 4); // friend list update
      lIIIIIIIIIlIllIIllIlIIlIl.put(IlIIlIIllIIIlIllIllllIIlI.class, 5); // friend message
      lIIIIIIIIIlIllIIllIlIIlIl.put(lllIIllIlIIlllIIIIIlllllI.class, 6); // server update
      lIIIIIIIIIlIllIIllIlIIlIl.put(llIIIllIIlllIIIIllIllIlIl.class, 7); // friend requests bulk
      lIIIIIIIIIlIllIIllIlIIlIl.put(lllIlllIIIIIllllIIIlIIlIl.class, 8); // cosmetics bulk
      lIIIIIIIIIlIllIIllIlIIlIl.put(llIlIlIIlIlllIIlIlllIIIII.class, 9); // friend request send
      lIIIIIIIIIlIllIIllIlIIlIl.put(lllllIlIIlIlIIlllIlllIIll.class, 16); // friend request sent
      lIIIIIIIIIlIllIIllIlIIlIl.put(IlIlIIIlIIIlIIllIlIlIIIll.class, 17); // friend remove
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIIIlIllIlIIIllIIIIIIllII.class, 18); // friend update
      lIIIIIIIIIlIllIIllIlIIlIl.put(lIlIIllIllllIllllIllllIII.class, 19); // profile fetch
      lIIIIIIIIIlIllIIllIlIIlIl.put(lIIlIlIlIlIlllIlllIlIlIlI.class, 20); // cosmetics update
      lIIIIIIIIIlIllIIllIlIIlIl.put(IlIlIlIIIlIIlllIllIllIIlI.class, 21); // friend accept or deny
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIIIlIlIIIllIlIIlIllIIlIl.class, 22);
      lIIIIIIIIIlIllIIllIlIIlIl.put(IlIIIIllIlIlIllIIIllIlIlI.class, 23); // crash log
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIIIllllIlllIIlIIlIIIIIll.class, 24);
      lIIIIIIIIIlIllIIllIlIIlIl.put(lllIlIIlIIIlIlIIIllIlllIl.class, 25);
      lIIIIIIIIIlIllIIllIlIIlIl.put(IlIIIIIllIIIIlIIIllIIlIII.class, 32);
      lIIIIIIIIIlIllIIllIlIIlIl.put(llllIIlIlllIIllIllIIlIIlI.class, 33);
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIlIllllIIlIlIIIlllIIllIl.class, 34);
      lIIIIIIIIIlIllIIllIlIIlIl.put(llllllIlIlIIllIIlIIlIlIlI.class, 35);
      lIIIIIIIIIlIllIIllIlIIlIl.put(lIIlIlIlIIlIlIIllIllllIII.class, 36);
      lIIIIIIIIIlIllIIllIlIIlIl.put(lIIllIlllIIlllIllIIlllllI.class, 37); // useless (empty packet?????)
      lIIIIIIIIIlIllIIllIlIIlIl.put(IIIIlIIIIIIIIllIlIllIlIlI.class, 100); // lol juice wrld
      lIIIIIIIIIlIllIIllIlIIlIl.put(CBPacketFriendTypingStatus.class, 101);
      lIIIIIIIIIlIllIIllIlIIlIl.put(CBPacketServerList.class, 2020); // what an ass year can you agree?
   }
}
