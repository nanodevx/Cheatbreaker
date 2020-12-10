import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class IlIIlIlIIllIllIlIllIIIIII extends IIllIlllIIlllllIlllIIIlIl {
    private GameProfile lIIIIlIIllIIlIIlIIIlIIllI;

    public IlIIlIlIIllIllIlIllIIIIII() {
    }

    public IlIIlIlIIllIllIlIllIIIIII(GameProfile var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI = var1;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIllllllllIlIIIllIIllII var1) {
        String var2 = var1.IlllIIIlIlllIllIlIIlllIlI(36);
        String var3 = var1.IlllIIIlIlllIllIlIIlllIlI(16);
        System.out.println("UUID=" + var2);
        UUID var4 = null;
        if (var2.contains("-")) {
            var4 = UUID.fromString(var2);
        } else {
            var4 = UUID.fromString( new StringBuilder( var2 ).insert( 20, '-' ).insert( 16, '-' ).insert( 12, '-' ).insert( 8, '-' ).toString() );
        }
        this.lIIIIlIIllIIlIIlIIIlIIllI = new GameProfile(var4, var3);
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(lIlIllllllllIlIIIllIIllII var1) {
        UUID var2 = this.lIIIIlIIllIIlIIlIIIlIIllI.getId();
        var1.lIIIIlIIllIIlIIlIIIlIIllI(var2 == null ? "" : var2.toString());
        var1.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.getName());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIllIIlIlIlIllIIIIIIlIIl var1) {
        var1.lIIIIlIIllIIlIIlIIIlIIllI(this);
    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI() {
        return true;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIIIlIlIllIlIlIIIlIlIII var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI((IlIllIIlIlIlIllIIIIIIlIIl)var1);
    }
}
