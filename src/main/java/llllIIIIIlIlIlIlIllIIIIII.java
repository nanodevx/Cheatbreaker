import org.lwjgl.opengl.*;

public class llllIIIIIlIlIlIlIllIIIIII extends IlIIlllIlIIIlIIIlIlIlIlIl
{
    public int lIIIIlIIllIIlIIlIIIlIIllI;
	   final static lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    public String IllIIIIIIIlIlIllllIIllIII;
    public final lllIllIllIlIllIlIIllllIIl lIIIIllIIlIlIllIIIlIllIlI;
    private lIlIllIlIlIIIllllIlIllIll IlIlllIIIIllIllllIllIIlIl;
    public boolean IlllIllIlIIIIlIIlIIllIIIl;
    private int llIIlllIIIIlllIllIlIlllIl;
    
    public llllIIIIIlIlIlIlIllIIIIII(final lIlIllIlIlIIIllllIlIllIll ilIlllIIIIllIllllIllIIlIl, final lllIllIllIlIllIlIIllllIIl liiiIllIIlIlIllIIIlIllIlI, final String illIIIIIIIlIlIllllIIllIII, final int n, final int n2, final int n3, final int n4, final int liiiIlIIllIIlIIlIIIlIIllI, final float n5) {
        super(n5);
        this.IlllIllIlIIIIlIIlIIllIIIl = true;
        this.llIIlllIIIIlllIllIlIlllIl = 0;
        this.IllIIIIIIIlIlIllllIIllIII = illIIIIIIIlIlIllllIIllIII;
        this.lIIIIlIIllIIlIIlIIIlIIllI(n, n2, n3, n4);
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.lIIIIllIIlIlIllIIIlIllIlI = liiiIllIIlIlIllIIIlIllIlI;
        this.IlIlllIIIIllIllllIllIIlIl = ilIlllIIIIllIllllIllIIlIl;
    }
    
    public llllIIIIIlIlIlIlIllIIIIII(final lllIllIllIlIllIlIIllllIIl lllIllIllIlIllIlIIllllIIl, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        this(cb.IIIIllIlIIIllIlllIlllllIl().IIIllIllIlIlllllllIlIlIII, lllIllIllIlIllIlIIllllIIl, s, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
        final boolean liiiIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI(n, n2);
        final int llIIlllIIIIlllIllIlIlllIl = 120;
        if (liiiIlIIllIIlIIlIIIlIIllI && this.IlllIllIlIIIIlIIlIIllIIIl) {
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl - 2), (float)(this.IIIIllIIllIIIIllIllIIIlIl - 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 2), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.buttonColorTellinqIsFat.lIIIIlIIllIIlIIlIIIlIIllI() : -854025);
            final float liiiIlIIllIIlIIlIIIlIIllI2 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
            if (this.llIIlllIIIIlllIllIlIlllIl + liiiIlIIllIIlIIlIIIlIIllI2 < llIIlllIIIIlllIllIlIlllIl) {
                this.llIIlllIIIIlllIllIlIlllIl += (int)liiiIlIIllIIlIIlIIIlIIllI2;
            }
            else {
                this.llIIlllIIIIlllIllIlIlllIl = llIIlllIIIIlllIllIlIlllIl;
            }
        }
        else if (this.llIIlllIIIIlllIllIlIlllIl > 0) {
            final float liiiIlIIllIIlIIlIIIlIIllI3 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
            if (this.llIIlllIIIIlllIllIlIlllIl - liiiIlIIllIIlIIlIIIlIIllI3 < 0.0f) {
                this.llIIlllIIIIlllIllIlIlllIl = 0;
            }
            else {
                this.llIIlllIIIIlllIllIlIlllIl -= (int)liiiIlIIllIIlIIlIIIlIIllI3;
            }
        }
        if (this.IlllIllIlIIIIlIIlIIllIIIl) {
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)this.IIIIllIIllIIIIllIllIIIlIl, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.buttonColorTellinqIsFat.lIIIIlIIllIIlIIlIIIlIIllI() : -723724);
        }
        else {
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)this.IIIIllIIllIIIIllIllIIIlIl, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? -1624231888 : -1611336460);
        }
        if (this.llIIlllIIIIlllIllIlIlllIl > 0) {
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)(int)(this.IIIIllIIllIIIIllIllIIIlIl + (this.IIIllIllIlIlllllllIlIlIII - this.IIIllIllIlIlllllllIlIlIII * (this.llIIlllIIIIlllIllIlIlllIl / (float)llIIlllIIIIlllIllIlIlllIl * 100) / 100)), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), this.lIIIIlIIllIIlIIlIIIlIIllI);
        }
        if (this.IllIIIIIIIlIlIllllIIllIII.contains(".png")) {
            GL11.glPushMatrix();
            float var1 = cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? 1.0f
                    : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI")
                    ? cbSettings.mainColor.lIIIIlIIllIIlIIlIIIlIIllI() : 0.0f;
            GL11.glColor4f(
                    cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainColor.lIIIIlIIllIIlIIlIIIlIIllI() : var1,
                    cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainColor.lIIIIlIIllIIlIIlIIIlIIllI() : var1,
                    cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainColor.lIIIIlIIllIIlIIlIIIlIIllI() : var1,
                    cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? 1.0f : 0.47368422f * 0.9499999f);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/icons/" + this.IllIIIIIIIlIlIllllIIllIII), 8, (float)(this.IIIIllIlIIIllIlllIlllllIl + 6), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 6));
            GL11.glPopMatrix();
        }
        else {
            this.IlIlllIIIIllIllllIllIIlIl.lIIIIIIIIIlIllIIllIlIIlIl(this.IllIIIIIIIlIlIllllIIllIII.toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2), this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI() + ((this.IlIlllIIIIllIllllIllIIlIl == cb.IIIIllIlIIIllIlllIlllllIl().IIIllIllIlIlllllllIlIlIII) ? 2.0f : (0.54545456f * 0.9166667f)), cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : 1862270976);
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
    }
    
    public int lIIIIIIIIIlIllIIllIlIIlIl() {
        return this.IlIlIIIlllIIIlIlllIlIllIl;
    }
    
    public void lIIIIlIIllIIlIIlIIIlIIllI(final boolean illlIllIlIIIIlIIlIIllIIIl) {
        this.IlllIllIlIIIIlIIlIIllIIIl = illlIllIlIIIIlIIlIIllIIIl;
    }
}
