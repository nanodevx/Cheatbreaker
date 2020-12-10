//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class lllIlIllIIlIIIlIIIlIIIIll extends IIllIlllIIlllllIlllIIIlIl {
    private int lIIIIlIIllIIlIIlIIIlIIllI;
    private GameProfile lIIIIIIIIIlIllIIllIlIIlIl;
    private int IlllIIIlIlllIllIlIIlllIlI;
    private int IIIIllIlIIIllIlllIlllllIl;
    private int IIIIllIIllIIIIllIllIIIlIl;
    private byte IlIlIIIlllIIIlIlllIlIllIl;
    private byte IIIllIllIlIlllllllIlIlIII;
    private int IllIIIIIIIlIlIllllIIllIII;
    private IIIIllIllIIlIlIIllllIIlIl lIIIIllIIlIlIllIIIlIllIlI;
    private List IlllIllIlIIIIlIIlIIllIIIl;

    public lllIlIllIIlIIIlIIIlIIIIll() {
    }

    public lllIlIllIIlIIIlIIIlIIIIll(lIllIIIIlIIlIllIIIlIlIlll var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI = var1.lIIIIlllIIlIlllllIlIllIII();
        this.lIIIIIIIIIlIllIIllIlIIlIl = var1.llllIIllllllIlIIlIlIIIllI();
        this.IlllIIIlIlllIllIlIIlllIlI = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var1.IIIlIIlIlIIIlllIIlIllllll * (double)32);
        this.IIIIllIlIIIllIlllIlllllIl = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var1.IllIlIIIIlllIIllIIlllIIlI * (double)32);
        this.IIIIllIIllIIIIllIllIIIlIl = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var1.IllIlIlIllllIlIIllllIIlll * (double)32);
        this.IlIlIIIlllIIIlIlllIlIllIl = (byte)((int)(var1.IllllIllllIlIIIlIIIllllll * (float)256 / (float)360));
        this.IIIllIllIlIlllllllIlIlIII = (byte)((int)(var1.IllIIlllIllIlIllIlIIIIIII * (float)256 / (float)360));
        lIlIlIlIlIllllIlllIIIlIlI var2 = var1.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI();
        this.IllIIIIIIIlIlIllllIIllIII = var2 == null ? 0 : lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(var2.lIIIIlIIllIIlIIlIIIlIIllI());
        this.lIIIIllIIlIlIllIIIlIllIlI = var1.lIIIlllIlIlllIIIIIIIIIlII();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIllllllllIlIIIllIIllII var1) {
        System.out.println(Arrays.toString(var1.array()));
        this.lIIIIlIIllIIlIIlIIIlIIllI = var1.lIIIIlIIllIIlIIlIIIlIIllI();
        String uuid = var1.IlllIIIlIlllIllIlIIlllIlI(36);

        UUID var2 = null;
        if (uuid.contains("-")) {
            var2 = UUID.fromString(uuid);
        } else {
            var2 = UUID.fromString( new StringBuilder( uuid ).insert( 20, '-' ).insert( 16, '-' ).insert( 12, '-' ).insert( 8, '-' ).toString() );
        }
        this.lIIIIIIIIIlIllIIllIlIIlIl = new GameProfile(var2, var1.IlllIIIlIlllIllIlIIlllIlI(16));
        int var3 = var1.lIIIIlIIllIIlIIlIIIlIIllI();

        for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var1.IlllIIIlIlllIllIlIIlllIlI(32767);
            String var6 = var1.IlllIIIlIlllIllIlIIlllIlI(32767);
            String var7 = var1.IlllIIIlIlllIllIlIIlllIlI(684);
            this.lIIIIIIIIIlIllIIllIlIIlIl.getProperties().put(var5, new Property(var5, var6, var7));
        }

        this.IlllIIIlIlllIllIlIIlllIlI = var1.readInt();
        this.IIIIllIlIIIllIlllIlllllIl = var1.readInt();
        this.IIIIllIIllIIIIllIllIIIlIl = var1.readInt();
        this.IlIlIIIlllIIIlIlllIlIllIl = var1.readByte();
        this.IIIllIllIlIlllllllIlIlIII = var1.readByte();
        this.IllIIIIIIIlIlIllllIIllIII = var1.readShort();
        this.IlllIllIlIIIIlIIlIIllIIIl = IIIIllIllIIlIlIIllllIIlIl.lIIIIIIIIIlIllIIllIlIIlIl(var1);
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(lIlIllllllllIlIIIllIIllII var1) {
        var1.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI);
        UUID var2 = this.lIIIIIIIIIlIllIIllIlIIlIl.getId();
        var1.lIIIIlIIllIIlIIlIIIlIIllI(var2 == null ? "" : var2.toString());
        var1.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIIIIIIlIllIIllIlIIlIl.getName());
        var1.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIIIIIIlIllIIllIlIIlIl.getProperties().size());
        Iterator var3 = this.lIIIIIIIIIlIllIIllIlIIlIl.getProperties().values().iterator();

        while(var3.hasNext()) {
            Property var4 = (Property)var3.next();
            var1.lIIIIlIIllIIlIIlIIIlIIllI(var4.getName());
            var1.lIIIIlIIllIIlIIlIIIlIIllI(var4.getValue());
            var1.lIIIIlIIllIIlIIlIIIlIIllI(var4.getSignature());
        }

        var1.writeInt(this.IlllIIIlIlllIllIlIIlllIlI);
        var1.writeInt(this.IIIIllIlIIIllIlllIlllllIl);
        var1.writeInt(this.IIIIllIIllIIIIllIllIIIlIl);
        var1.writeByte(this.IlIlIIIlllIIIlIlllIlIllIl);
        var1.writeByte(this.IIIllIllIlIlllllllIlIlIII);
        var1.writeShort(this.IllIIIIIIIlIlIllllIIllIII);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlIIlIIIIIIIlllIIIlIIll var1) {
        var1.lIIIIlIIllIIlIIlIIIlIIllI(this);
    }

    public List IlllIIIlIlllIllIlIIlllIlI() {
        if (this.IlllIllIlIIIIlIIlIIllIIIl == null) {
            this.IlllIllIlIIIIlIIlIIllIIIl = this.lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI();
        }

        return this.IlllIllIlIIIIlIIlIIllIIIl;
    }

    public String lIIIIIIIIIlIllIIllIlIIlIl() {
        return String.format("id=%d, gameProfile='%s', x=%.2f, y=%.2f, z=%.2f, carried=%d", this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, (float)this.IlllIIIlIlllIllIlIIlllIlI / (float)32, (float)this.IIIIllIlIIIllIlllIlllllIl / (float)32, (float)this.IIIIllIIllIIIIllIllIIIlIl / (float)32, this.IllIIIIIIIlIlIllllIIllIII);
    }

    public int IIIIllIlIIIllIlllIlllllIl() {
        return this.lIIIIlIIllIIlIIlIIIlIIllI;
    }

    public GameProfile IIIIllIIllIIIIllIllIIIlIl() {
        return this.lIIIIIIIIIlIllIIllIlIIlIl;
    }

    public int IlIlIIIlllIIIlIlllIlIllIl() {
        return this.IlllIIIlIlllIllIlIIlllIlI;
    }

    public int IIIllIllIlIlllllllIlIlIII() {
        return this.IIIIllIlIIIllIlllIlllllIl;
    }

    public int IllIIIIIIIlIlIllllIIllIII() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    public byte lIIIIllIIlIlIllIIIlIllIlI() {
        return this.IlIlIIIlllIIIlIlllIlIllIl;
    }

    public byte IlllIllIlIIIIlIIlIIllIIIl() {
        return this.IIIllIllIlIlllllllIlIlIII;
    }

    public int IlIlllIIIIllIllllIllIIlIl() {
        return this.IllIIIIIIIlIlIllllIIllIII;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIIIlIlIllIlIlIIIlIlIII var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI((lIIlIIlIIIIIIIlllIIIlIIll)var1);
    }
}
