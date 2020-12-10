import java.util.*;
import java.util.function.*;

public class lIIllIIllllllIIlllIlllIIl extends llllIIIIlIlIllIIIllllIIll
{
    protected final List<llllIIIIlIlIllIIIllllIIll> IIIllIllIlIlllllllIlIlIII;
    
    public lIIllIIllllllIIlllIlllIIl(final List list) {
        (this.IIIllIllIlIlllllllIlIlIII = new ArrayList()).addAll(list);
    }
    
    public void lIIIIIIIIIlIllIIllIlIIlIl(final float n, final float n2, final boolean b) {
        for (llllIIIIlIlIllIIIllllIIll llllIIIIlIlIllIIIllllIIll : this.IIIllIllIlIlllllllIlIlIII) {
            llllIIIIlIlIllIIIllllIIll.lIIIIlIIllIIlIIlIIIlIIllI(n, n2, b);
        }
    }
    
    @Override
    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        this.IIIllIllIlIlllllllIlIlIII.forEach(llllIIIIlIlIllIIIllllIIll::lIIIIIIIIIlIllIIllIlIIlIl);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        this.IIIllIllIlIlllllllIlIlIII.forEach(llllIIIIlIlIllIIIllllIIll::lIIIIlIIllIIlIIlIIIlIIllI);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final char c, final int n) {
        this.IIIllIllIlIlllllllIlIlIII.forEach(llllIIIIlIlIllIIIllllIIll -> llllIIIIlIlIllIIIllllIIll.lIIIIlIIllIIlIIlIIIlIIllI(c, n));
    }
    
    @Override
    public boolean lIIIIlIIllIIlIIlIIIlIIllI(final float n, final float n2, final int n3, final boolean b) {
        if (!b) {
            return false;
        }
        boolean liiiIlIIllIIlIIlIIIlIIllI = false;
        for (final llllIIIIlIlIllIIIllllIIll llllIIIIlIlIllIIIllllIIll : this.IIIllIllIlIlllllllIlIlIII) {
            if (liiiIlIIllIIlIIlIIIlIIllI) {
                break;
            }
            liiiIlIIllIIlIIlIIIlIIllI = llllIIIIlIlIllIIIllllIIll.lIIIIlIIllIIlIIlIIIlIIllI(n, n2, n3, b);
        }
        return liiiIlIIllIIlIIlIIIlIIllI;
    }
    
    @Override
    public boolean lIIIIIIIIIlIllIIllIlIIlIl(final float n, final float n2, final int n3, final boolean b) {
        if (!b) {
            return false;
        }
        boolean liiiiiiiiIlIllIIllIlIIlIl = false;
        for (final llllIIIIlIlIllIIIllllIIll llllIIIIlIlIllIIIllllIIll : this.IIIllIllIlIlllllllIlIlIII) {
            if (liiiiiiiiIlIllIIllIlIIlIl) {
                break;
            }
            liiiiiiiiIlIllIIllIlIIlIl = llllIIIIlIlIllIIIllllIIll.lIIIIIIIIIlIllIIllIlIIlIl(n, n2, n3, b);
        }
        return liiiiiiiiIlIllIIllIlIIlIl;
    }
    
    public List<llllIIIIlIlIllIIIllllIIll> IllIIIIIIIlIlIllllIIllIII() {
        return this.IIIllIllIlIlllllllIlIlIII;
    }
}
