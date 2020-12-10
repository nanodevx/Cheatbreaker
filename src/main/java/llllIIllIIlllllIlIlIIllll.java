import org.lwjgl.opengl.*;
import java.util.*;

public class llllIIllIIlllllIlIlIIllll extends IlIIlllIlIIIlIIIlIlIlIlIl
{
    private String lIIIIlIIllIIlIIlIIIlIIllI;
    final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private IIIlIllIIlIllIIIIlIIlIlIl lIIIIllIIlIlIllIIIlIllIlI;
    
    public llllIIllIIlllllIlIlIIllll(final List illIIIIIIIlIlIllllIIllIII, final String liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.lIIIIllIIlIlIllIIIlIllIlI = new IIIlIllIIlIllIIIIlIIlIlIl();
        this.IIIllIllIlIlllllllIlIlIII = 220;
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
    	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
        final lIIIllIllIllIlllIlIIlIlII illIlIIIIlllIIllIIlllIIlI = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
        final List lIllIllIlIIllIllIlIlIIlIl = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(32826);
        llIlIlllllIIllIIIIllIllII.lIIIIIIIIIlIllIIllIlIIlIl();
        llIlIlllllIIllIIIIllIllII.IlllIIIlIlllIllIlIIlllIlI();
        int n4 = 0;
        int n5 = 0;
        final Iterator<IIlllllllIlllIIllllIIlIll> iterator = (Iterator<IIlllllllIlllIIllllIIlIll>)IIlllllllIlllIIllllIIlIll.lIIIIlIIllIIlIIlIIIlIIllI.iterator();
        while (iterator.hasNext()) {
            final lIIlllIIIlIllllllIlIlIIII liiiIlIIllIIlIIlIIIlIIllI = lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(iterator.next());
            if (liiiIlIIllIIlIIlIIIlIIllI != null) {
                if (n4 >= 15) {
                    n4 = 0;
                    ++n5;
                }
                final int n6 = this.IIIIllIlIIIllIlllIlllllIl + 12 + n4 * 20;
                final int n7 = this.IIIIllIIllIIIIllIllIIIlIl + 14 + n5 * 20;
                final boolean b = n > (n6 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (n6 + 18) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (n7 - 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (n7 + 18 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
                if (lIllIllIlIIllIllIlIlIIlIl.contains(lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(liiiIlIIllIIlIIlIIIlIIllI))) {
                    IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(n6 - 2), (float)(n7 - 2), (float)(n6 + 18), (float)(n7 + 18), 2130771712);
                }
                else if (b) {
                    IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(n6 - 2), (float)(n7 - 2), (float)(n6 + 18), (float)(n7 + 18), 1325400319);
                }
                this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(illIlIIIIlllIIllIIlllIIlI.llIlIIIlIIIIlIlllIlIIIIll, illIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI(), new lIlIlIlIlIllllIlllIIIlIlI(liiiIlIIllIIlIIlIIIlIIllI), n6, n7);
                ++n4;
            }
        }
        llIlIlllllIIllIIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI();
        GL11.glDisable(32826);
        GL11.glDisable(3042);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n3, final int n4) {
        try {
            final List lIllIllIlIIllIllIlIlIIlIl = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl();
            int n5 = 0;
            int n6 = 0;
            final Iterator<IIlllllllIlllIIllllIIlIll> iterator = (Iterator<IIlllllllIlllIIllllIIlIll>)IIlllllllIlllIIllllIIlIll.lIIIIlIIllIIlIIlIIIlIIllI.iterator();
            while (iterator.hasNext()) {
                final lIIlllIIIlIllllllIlIlIIII liiiIlIIllIIlIIlIIIlIIllI = lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(iterator.next());
                if (liiiIlIIllIIlIIlIIIlIIllI != null) {
                    if (n5 >= 15) {
                        n5 = 0;
                        ++n6;
                    }
                    final int n7 = this.IIIIllIlIIIllIlllIlllllIl + 12 + n5 * 20;
                    final int n8 = this.IIIIllIIllIIIIllIllIIIlIl + 14 + n6 * 20;
                    if (n > (n7 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (n7 + 18) * this.lIIIIIIIIIlIllIIllIlIIlIl && n3 > (n8 - 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n3 < (n8 + 18 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n4 == 0) {
                        final int liiiIlIIllIIlIIlIIIlIIllI2 = lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(liiiIlIIllIIlIIlIIIlIIllI);
                        if (lIllIllIlIIllIllIlIlIIlIl.contains(liiiIlIIllIIlIIlIIIlIIllI2)) {
                        	cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl().removeIf(n2 -> (Integer)n2 == liiiIlIIllIIlIIlIIIlIIllI2);
                        }
                        else {
                        	cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl().add(liiiIlIIllIIlIIlIIIlIIllI2);
                        }
                        if (cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.IlIlIIIlllIIIlIlllIlIllIl()) {
                            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI();
                        }
                        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
                    }
                    ++n5;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
