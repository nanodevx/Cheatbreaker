import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.*;
import org.lwjgl.opengl.*;

public class IIlllllIIlIlIIlIIlllIIIII extends IlIIlllIlIIIlIIIlIlIlIlIl
{
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
    private List IllIIIIIIIlIlIllllIIllIII;
    private boolean lIIIIllIIlIlIllIIIlIllIlI;
    private boolean IlllIllIlIIIIlIIlIIllIIIl;
    private boolean IlIlllIIIIllIllllIllIIlIl;
    private boolean llIIlllIIIIlllIllIlIlllIl;
    private IllllllllIlIIIIIIIIllIIII lIIlIlIllIIlIIIlIIIlllIII;
    private float IIIlllIIIllIllIlIIIIIIlII;
    private float llIlIIIlIIIIlIlllIlIIIIll;
    private float IIIlIIllllIIllllllIlIIIll;
    private float lllIIIIIlIllIlIIIllllllII;
    private float lIIIIIllllIIIIlIlIIIIlIlI;
    private float IIIIIIlIlIlIllllllIlllIlI;
    private float IllIllIIIlIIlllIIIllIllII;
    private float IlIIlIIIIlIIIIllllIIlIllI;
    private int lIIlIIllIIIIIlIllIIIIllII;
    private int lIIlllIIlIlllllllllIIIIIl;
    private int lIllIllIlIIllIllIlIlIIlIl;
    private int llIlIIIllIIIIlllIlIIIIIlI;
    
    public IIlllllIIlIlIIlIIlllIIIII(final lIIlIlllIIIIlIIIllIlIIIII liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.lIIIIllIIlIlIllIIIlIllIlI = false;
        this.IlllIllIlIIIIlIIlIIllIIIl = false;
        this.IlIlllIIIIllIllllIllIIlIl = false;
        this.llIIlllIIIIlllIllIlIlllIl = false;
        this.IIIlllIIIllIllIlIIIIIIlII = 1.0f;
        this.llIlIIIlIIIIlIlllIlIIIIll = 1.0f;
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.lIIlIlIllIIlIIIlIIIlllIII = new IllllllllIlIIIIIIIIllIIII(n, (int)liiiIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), 1.0f);
        this.IllIIIIIIIlIlIllllIIllIII = new ArrayList();
        for (int i = 0; i < 16; ++i) {
            this.IllIIIIIIIlIlIllllIIllIII.add(new IllllllllIlIIIIIIIIllIIII(n, lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.IlllIIIlIlllIllIlIIlllIlI[i], 1.0f));
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
        this.IIIllIllIlIlllllllIlIlIII = (this.lIIIIllIIlIlIllIIIlIllIlI ? 130 : 18);
        this.IIIlIIllllIIllllllIlIIIll = (float)(this.IIIIllIlIIIllIlllIlllllIl + 56);
        this.lIIIIIllllIIIIlIlIIIIlIlI = (float)(this.IIIIllIlIIIllIlllIlllllIl + 176);
        this.lllIIIIIlIllIlIIIllllllII = (float)(this.IIIIllIIllIIIIllIllIIIlIl + 25);
        this.IIIIIIlIlIlIllllllIlllIlI = (float)(this.IIIIllIIllIIIIllIllIIIlIl + 119);
        this.IllIllIIIlIIlllIIIllIllII = this.lIIIIIllllIIIIlIlIIIIlIlI - this.IIIlIIllllIIllllllIlIIIll;
        this.IlIIlIIIIlIIIIllllIIlIllI = this.IIIIIIlIlIlIllllllIlllIlI - this.lllIIIIIlIllIlIIIllllllII;
        cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 160, this.IIIIllIIllIIIIllIllIIIlIl + 3, 14, 14);
        this.lIIlIlIllIIlIIIlIIIlllIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(n, n2, n3);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 186), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 16), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 16), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 17), 2130706432);
        cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI("#", (float)(this.IIIIllIlIIIllIlllIlllllIl + 188), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1358954496);
        cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(Integer.toHexString(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI()), (float)(this.IIIIllIlIIIllIlllIlllllIl + 194), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? -1 : -1358954496);
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 40) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 18 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        String s = b ? "(Favorite)" : "(+)";
        if (cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIIIIlIIllIIlIIlIIIlIIllI((int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl())) {
            s = (b ? "(Un-favorite)" : "(-)");
        }
        cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(s, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 16 - cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl(s)), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : b ? -822083584 : -1358954496);
        if (this.lIIIIllIIlIlIllIIIlIllIlI) {
            if (this.IlllIllIlIIIIlIIlIIllIIIl && !Mouse.isButtonDown(0)) {
                this.IlllIllIlIIIIlIIlIIllIIIl = false;
                this.lIIIIIIIIIlIllIIllIlIIlIl();
            }
            if (this.IlIlllIIIIllIllllIllIIlIl && !Mouse.isButtonDown(0)) {
                this.IlIlllIIIIllIllllIllIIlIl = false;
                this.lIIIIIIIIIlIllIIllIlIIlIl();
            }
            if (this.llIIlllIIIIlllIllIlIlllIl && !Mouse.isButtonDown(0)) {
                this.llIIlllIIIIlllIllIlIlllIl = false;
                this.lIIIIIIIIIlIllIIllIlIIlIl();
            }
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 55), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 24), (float)(this.IIIIllIlIIIllIlllIlllllIl + 177), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 120), -822083584);
            final lIllIIlIIIIlIIllllIllllll iiiIllIIllIIIIllIllIIIlIl = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
            GL11.glDisable(3553);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll, this.IIIIIIlIlIlIllllllIlllIlI, 0.0);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIIllllIIIIlIlIIIIlIlI, this.IIIIIIlIlIlIllllllIlllIlI, 0.0);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIIllllIIIIlIlIIIIlIlI, this.lllIIIIIlIllIlIIIllllllII, 0.0);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll, this.lllIIIIIlIllIlIIIllllllII, 0.0);
            iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
            int[] liiiiiiiiIlIllIIllIlIIlIl = null;
            for (int n4 = 0; n4 < this.IllIllIIIlIIlllIIIllIllII; ++n4) {
                for (int n5 = 0; n5 < this.IlIIlIIIIlIIIIllllIIlIllI; ++n5) {
                    final int i = (int)this.llIlIIIlIIIIlIlllIlIIIIll << 24 | Color.HSBtoRGB(this.IIIlllIIIllIllIlIIIIIIlII, n4 / this.IllIllIIIlIIlllIIIllIllII, 1.0f - n5 / this.IlIIlIIIIlIIIIllllIIlIllI);
                    final boolean b2 = n >= (this.IIIlIIllllIIllllllIlIIIll + n4) * this.lIIIIIIIIIlIllIIllIlIIlIl && n <= (this.IIIlIIllllIIllllllIlIIIll + n4 + 1.0f) * this.lIIIIIIIIIlIllIIllIlIIlIl;
                    final boolean b3 = n2 <= (this.lllIIIIIlIllIlIIIllllllII + n5 + 1.0f + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.lllIIIIIlIllIlIIIllllllII + n5 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
                    final boolean b4 = b2 && b3;
                    final boolean b5 = n4 == 0 && n < this.IIIlIIllllIIllllllIlIIIll * this.lIIIIIIIIIlIllIIllIlIIlIl && b3;
                    final boolean b6 = n5 == 0 && n2 < (this.lllIIIIIlIllIlIIIllllllII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && b2;
                    final boolean b7 = n4 == this.IllIllIIIlIIlllIIIllIllII - 1.0f && n > (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII) * this.lIIIIIIIIIlIllIIllIlIIlIl && b3;
                    final boolean b8 = n5 == this.IlIIlIIIIlIIIIllllIIlIllI - 1.0f && n2 > (this.lllIIIIIlIllIlIIIllllllII + this.IlIIlIIIIlIIIIllllIIlIllI + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && b2;
                    if (this.IlllIllIlIIIIlIIlIIllIIIl && (b4 || b5 || b6 || b7 || b8)) {
                        this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(i);
                        this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl = new int[] { n4, n5 };
                    }
                    if (this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl != null) {
                        liiiiiiiiIlIllIIllIlIIlIl = this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl;
                    }
                    else if (i == (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl()) {
                        liiiiiiiiIlIllIIllIlIIlIl = new int[] { n4, n5 };
                    }
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl();
                    GL11.glColor4f((i >> 16 & 0xFF) / (float)255, (i >> 8 & 0xFF) / (float)255, (i & 0xFF) / (float)255, 1.0f);
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + n4, this.lllIIIIIlIllIlIIIllllllII + n5 + 1.0f, 0.0);
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + n4 + 1.0f, this.lllIIIIIlIllIlIIIllllllII + n5 + 1.0f, 0.0);
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + n4 + 1.0f, this.lllIIIIIlIllIlIIIllllllII + n5, 0.0);
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + n4, this.lllIIIIIlIllIlIIIllllllII + n5, 0.0);
                    iiiIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
                }
            }
            if (liiiiiiiiIlIllIIllIlIIlIl != null) {
                GL11.glPushMatrix();
                GL11.glColor4f(0.0f, 0.0f, 0.0f, 3.0f * 0.25f);
                lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + liiiiiiiiIlIllIIllIlIIlIl[0] + 1.2205882f * 0.913494f, this.lllIIIIIlIllIlIIIllllllII + liiiiiiiiIlIllIIllIlIIlIl[1] + 0.097222224f * 11.468572f, 4);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + liiiiiiiiIlIllIIllIlIIlIl[0] + 0.24193548f * 4.608667f, this.lllIIIIIlIllIlIIIllllllII + liiiiiiiiIlIllIIllIlIIlIl[1] + 0.23157895f * 4.8147726f, 2.700000047683716 * 1.0);
                GL11.glPopMatrix();
            }
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll - 51, this.lllIIIIIlIllIlIIIllllllII + 1.0f, this.IIIlIIllllIIllllllIlIIIll - 43, this.lllIIIIIlIllIlIIIllllllII + 9, -16777216);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll - 50, this.lllIIIIIlIllIlIIIllllllII + 2.0f, this.IIIlIIllllIIllllllIlIIIll - 44, this.lllIIIIIlIllIlIIIllllllII + 8, this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI ? -13369549 : -1);
            cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI("CHROMA", this.IIIlIIllllIIllllllIlIIIll - 40, this.lllIIIIIlIllIlIIIllllllII, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1358954496);
            this.IlllIIIlIlllIllIlIIlllIlI(n, n2);
            this.lIIIIIIIIIlIllIIllIlIIlIl(n, n2);
            this.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIlIllIIIIllIIllIlIl, this.lIIlIIllIIIIIlIllIIIIllII = (int)(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 64), this.lIIlllIIlIlllllllllIIIIIl = (int)this.lllIIIIIlIllIlIIIllllllII, n, n2, (int)n3);
            this.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIllIlIlIIIllllIlIllIll, this.lIllIllIlIIllIllIlIlIIlIl = (int)(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 94), this.llIlIIIllIIIIlllIlIIIIIlI = (int)this.lllIIIIIlIllIlIIIllllllII, n, n2, (int)n3);
            this.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIIIIIIIlIlIllllIIllIII, (int)(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 34), (int)this.lllIIIIIlIllIlIIIllllllII, n, n2, (int)n3);
        }
    }
    
    private void lIIIIIIIIIlIllIIllIlIIlIl() {
        if (cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIlIllIIIIllIIllIlIl.size() >= 16) {
        	cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIlIllIIIIllIIllIlIl.remove(0);
        }
        cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIlIllIIIIllIIllIlIl.add(new IllllllllIlIIIIIIIIllIIII(this.lIIIIIIIIIlIllIIllIlIIlIl, (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), 1.0f));
        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
    }
    
    private void lIIIIIIIIIlIllIIllIlIIlIl(final int n, final int n2) {
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 18, this.lllIIIIIlIllIlIIIllllllII - 1.0f, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 28, this.lllIIIIIlIllIlIIIllllllII + 1.0f + this.IlIIlIIIIlIIIIllllIIlIllI, -822083584);
        this.IlllIIIlIlllIllIlIIlllIlI();
        for (int n3 = 0; n3 < this.IlIIlIIIIlIIIIllllIIlIllI; ++n3) {
            final int intValue = (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl();
            final int rgb = new Color(intValue >> 16 & 0xFF, intValue >> 8 & 0xFF, intValue & 0xFF, Math.round(255 - n3 / this.IlIIlIIIIlIIIIllllIIlIllI * 255)).getRGB();
            if (this.llIIlllIIIIlllIllIlIlllIl && n2 >= (this.IlllIIIlIlllIllIlIIlllIlI + this.lllIIIIIlIllIlIIIllllllII + n3) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 <= (this.IlllIIIlIlllIllIlIIlllIlI + this.lllIIIIIlIllIlIIIllllllII + n3 + 1.0f) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
                this.llIlIIIlIIIIlIlllIlIIIIll = n3 / this.IlIIlIIIIlIIIIllllIIlIllI;
                this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(rgb);
            }
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 19, this.lllIIIIIlIllIlIIIllllllII + n3, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 27, this.lllIIIIIlIllIlIIIllllllII + n3 + 1.0f, rgb);
        }
        final float n4 = -1 + this.IlIIlIIIIlIIIIllllIIlIllI * this.llIlIIIlIIIIlIlllIlIIIIll;
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 18, this.lllIIIIIlIllIlIIIllllllII + n4, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 28, this.lllIIIIIlIllIlIIIllllllII + n4 + 3, -822083584);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 18, this.lllIIIIIlIllIlIIIllllllII + n4 + 1.0f, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 28, this.lllIIIIIlIllIlIIIllllllII + n4 + 2.0f, -805306369);
    }
    
    private void IlllIIIlIlllIllIlIIlllIlI(final int n, final int n2) {
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 4, this.lllIIIIIlIllIlIIIllllllII - 1.0f, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 14, this.lllIIIIIlIllIlIIIllllllII + 1.0f + this.IlIIlIIIIlIIIIllllIIlIllI, -822083584);
        for (int n3 = 0; n3 < this.IlIIlIIIIlIIIIllllIIlIllI; ++n3) {
            if (this.IlIlllIIIIllIllllIllIIlIl && n2 >= (this.IlllIIIlIlllIllIlIIlllIlI + this.lllIIIIIlIllIlIIIllllllII + n3) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 <= (this.IlllIIIlIlllIllIlIIlllIlI + this.lllIIIIIlIllIlIIIllllllII + n3 + 1.0f) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
                final int intValue = (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl();
                final float[] rgBtoHSB = Color.RGBtoHSB(intValue >> 16 & 0xFF, intValue >> 8 & 0xFF, intValue & 0xFF, null);
                this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Color.HSBtoRGB(this.IIIlllIIIllIllIlIIIIIIlII, rgBtoHSB[1], rgBtoHSB[2]));
                this.IIIlllIIIllIllIlIIIIIIlII = n3 / this.IlIIlIIIIlIIIIllllIIlIllI;
            }
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 5, this.lllIIIIIlIllIlIIIllllllII + n3, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 13, this.lllIIIIIlIllIlIIIllllllII + n3 + 1.0f, Color.HSBtoRGB(n3 / this.IlIIlIIIIlIIIIllllIIlIllI, 1.0f, 1.0f));
        }
        final float n4 = -1 + this.IlIIlIIIIlIIIIllllIIlIllI * this.IIIlllIIIllIllIlIIIIIIlII;
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 4, this.lllIIIIIlIllIlIIIllllllII + n4, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 14, this.lllIIIIIlIllIlIIIllllllII + n4 + 3, -822083584);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 4, this.lllIIIIIlIllIlIIIllllllII + n4 + 1.0f, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 14, this.lllIIIIIlIllIlIIIllllllII + n4 + 2.0f, -805306369);
    }
    
    private void IlllIIIlIlllIllIlIIlllIlI() {
        boolean b = true;
        for (int n = 2; n < this.IlIIlIIIIlIIIIllllIIlIllI - 4; n += 4) {
            if (!b) {
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 19, this.lllIIIIIlIllIlIIIllllllII + n, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 23, this.lllIIIIIlIllIlIIIllllllII + n + 4, -1);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 23, this.lllIIIIIlIllIlIIIllllllII + n + 4, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 27, this.lllIIIIIlIllIlIIIllllllII + n + 8, -1);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 23, this.lllIIIIIlIllIlIIIllllllII + n, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 27, this.lllIIIIIlIllIlIIIllllllII + n + 4, -7303024);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 19, this.lllIIIIIlIllIlIIIllllllII + n + 4, this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 23, this.lllIIIIIlIllIlIIIllllllII + n + 8, -7303024);
            }
            b = !b;
        }
    }
    
    private void lIIIIlIIllIIlIIlIIIlIIllI(final List<IllllllllIlIIIIIIIIllIIII> list, final int n, final int n2, final int n3, final int n4, final int n5) {
        int n6 = 0;
        int n7 = 0;
        final int n8 = 8;
        for (final IllllllllIlIIIIIIIIllIIII illllllllIlIIIIIIIIllIIII : list) {
            illllllllIlIIIIIIIIllIIII.lIIIIIIIIIlIllIIllIlIIlIl = this.lIIIIIIIIIlIllIIllIlIIlIl;
            if (n6 == n8) {
                ++n7;
                n6 = 0;
            }
            if (list == this.IllIIIIIIIlIlIllllIIllIII) {
                final int n9 = n8 * 2 / 8 * 12;
                final int n10 = n + n9 - n7 * 12 - 12;
                final int n11 = n2 + n6 * n9 - n6 * 12;
                illllllllIlIIIIIIIIllIIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
                illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n10, n11, 10, 10);
                final String s = "0123456789abcdefklmnor";
                final int beginIndex = n6 + n7 * n8;
                final String substring = s.substring(beginIndex, beginIndex + 1);
                if (illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n3, n4)) {
                    IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(n10 + 12), (float)(n11 - 1), (float)(n10 + 26), (float)(n11 + 11), -1087492562);
                    cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("&" + substring, n10 + 14, (double)n11, -1);
                }
            }
            else {
                final int n12 = n + n7 * 12;
                final int n13 = n2 + n6 * 12;
                illllllllIlIIIIIIIIllIIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
                illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n12, n13, 10, 10);
            }
            illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n3, n4, (float)n5);
            ++n6;
        }
    }
    
    private void lIIIIlIIllIIlIIlIIIlIIllI(final List<IllllllllIlIIIIIIIIllIIII> list, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        int n6 = 0;
        final int n7 = 8;
        for (final IllllllllIlIIIIIIIIllIIII illllllllIlIIIIIIIIllIIII : list) {
            if (list != this.IllIIIIIIIlIlIllllIIllIII) {
                if (n5 == n7) {
                    ++n6;
                    n5 = 0;
                }
                final int n8 = n + n6 * 12;
                final int n9 = n2 + n5 * 12;
                illllllllIlIIIIIIIIllIIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
                illllllllIlIIIIIIIIllIIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
                illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n8, n9, 10, 10);
            }
            if (illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI(n3, n4)) {
                if (list == this.IllIIIIIIIlIlIllllIIllIII) {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(new Color(illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI).getRGB());
                }
                else {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(new Color(illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI, true).getRGB());
                }
                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
                final float[] rgBtoHSB = Color.RGBtoHSB(illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI >> 16 & 0xFF, illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI >> 8 & 0xFF, illllllllIlIIIIIIIIllIIII.lIIIIlIIllIIlIIlIIIlIIllI & 0xFF, null);
                this.IIIlllIIIllIllIlIIIIIIlII = rgBtoHSB[0];
                this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl = new int[] { (int)(rgBtoHSB[1] * this.IllIllIIIlIIlllIIIllIllII), (int)(this.IlIIlIIIIlIIIIllllIIlIllI - rgBtoHSB[2] * this.IlIIlIIIIlIIIIllllIIlIllI) };
            }
            ++n5;
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 40) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 18 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        if (n > this.IIIIllIlIIIllIlllIlllllIl * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 40) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 18 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
            final float[] rgBtoHSB = Color.RGBtoHSB((int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() >> 16 & 0xFF, (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() >> 8 & 0xFF, (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() & 0xFF, null);
            this.IIIlllIIIllIllIlIIIIIIlII = rgBtoHSB[0];
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl = new int[] { (int)(rgBtoHSB[1] * this.IllIllIIIlIIlllIIIllIllII), (int)(this.IlIIlIIIIlIIIIllllIIlIllI - rgBtoHSB[2] * this.IlIIlIIIIlIIIIllllIIlIllI) };
            this.lIIIIllIIlIlIllIIIlIllIlI = !this.lIIIIllIIlIlIllIIIlIllIlI;
        }
        else if (b) {
            if (cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIIIIlIIllIIlIIlIIIlIIllI((int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl())) {
            	cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIIIIIIIIIlIllIIllIlIIlIl((int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
            }
            else {
                if (cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIllIlIlIIIllllIlIllIll.size() >= 16) {
                	cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIllIlIlIIIllllIlIllIll.remove(0);
                }
                cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIllIlIlIIIllllIlIllIll.add(new IllllllllIlIIIIIIIIllIIII(this.lIIIIIIIIIlIllIIllIlIIlIl, (int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), 1.0f));
            }
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
        }
        else if (this.lIIIIllIIlIlIllIIIlIllIlI) {
            this.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIIIIIIIlIlIllllIIllIII, 0, 0, n, n2);
            this.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIlIllIIIIllIIllIlIl, this.lIIlIIllIIIIIlIllIIIIllII, this.lIIlllIIlIlllllllllIIIIIl, n, n2);
            this.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIllIlIlIIIllllIlIllIll, this.lIllIllIlIIllIllIlIlIIlIl, this.llIlIIIllIIIIlllIlIIIIIlI, n, n2);
            final boolean b2 = n > (this.IIIlIIllllIIllllllIlIIIll - 51) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.lllIIIIIlIllIlIIIllllllII + 1.0f + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIlIIllllIIllllllIlIIIll - 43) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.lllIIIIIlIllIlIIIllllllII + 9 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
            if (n > this.IIIlIIllllIIllllllIlIIIll * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.lllIIIIIlIllIlIIIllllllII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.lllIIIIIlIllIlIIIllllllII + this.IlIIlIIIIlIIIIllllIIlIllI + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
                this.IlllIllIlIIIIlIIlIIllIIIl = true;
            }
            if (n > (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 4) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 14) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.lllIIIIIlIllIlIIIllllllII - 1.0f + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.lllIIIIIlIllIlIIIllllllII + 1.0f + this.IlIIlIIIIlIIIIllllIIlIllI + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
                this.IlIlllIIIIllIllllIllIIlIl = true;
            }
            if (n > (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 18) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIlIIllllIIllllllIlIIIll + this.IllIllIIIlIIlllIIIllIllII + 28) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.lllIIIIIlIllIlIIIllllllII - 1.0f + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.lllIIIIIlIllIlIIIllllllII + 1.0f + this.IlIIlIIIIlIIIIllllIIlIllI + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) {
                this.llIIlllIIIIlllIllIlIlllIl = true;
            }
            if (b2) {
                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
                this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI = !this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI;
            }
        }
    }

    public lIIlIlllIIIIlIIIllIlIIIII getModSetting() {
        return lIIIIlIIllIIlIIlIIIlIIllI;
    }
}
