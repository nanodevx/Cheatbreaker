import org.lwjgl.opengl.*;

public class IIllllIllllIIIlIIllllIlll extends IlIIlllIlIIIlIIIlIlIlIlIl
{
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private final int IllIIIIIIIlIlIllllIIllIII;
    public final IlIIIIlllIIIlIIllllIIIlll lIIIIlIIllIIlIIlIIIlIIllI;
    private final lllIllIllIlIllIlIIllllIIl lIIIIllIIlIlIllIIIlIllIlI;
    private int IlllIllIlIIIIlIIlIIllIIIl;
    private IIllIIlIllIIlllIlIllIIIlI IlIlllIIIIllIllllIllIIlIl;
    
    public IIllllIllllIIIlIIllllIlll(final lllIllIllIlIllIlIIllllIIl liiiIllIIlIlIllIIIlIllIlI, final int illIIIIIIIlIlIllllIIllIII, final IlIIIIlllIIIlIIllllIIIlll liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.IlllIllIlIIIIlIIlIIllIIIl = 0;
        this.IlIlllIIIIllIllllIllIIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");
        this.lIIIIllIIlIlIllIIIlIllIlI = liiiIllIIlIlIllIIIlIllIlI;
        this.IllIIIIIIIlIlIllllIIllIII = illIIIIIIIlIlIllllIIllIII;
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        final boolean liiiIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI(n, n2);
        final int illlIllIlIIIIlIIlIIllIIIl = 75;
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 1), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
        if (this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI)) {
            if (liiiIlIIllIIlIIlIIIlIIllI) {
                final float liiiIlIIllIIlIIlIIIlIIllI2 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
                if (this.IlllIllIlIIIIlIIlIIllIIIl + liiiIlIIllIIlIIlIIIlIIllI2 < illlIllIlIIIIlIIlIIllIIIl) {
                    this.IlllIllIlIIIIlIIlIIllIIIl += (int)liiiIlIIllIIlIIlIIIlIIllI2;
                    if (this.IlllIllIlIIIIlIIlIIllIIIl > illlIllIlIIIIlIIlIIllIIIl) {
                        this.IlllIllIlIIIIlIIlIIllIIIl = illlIllIlIIIIlIIlIIllIIIl;
                    }
                }
            }
            else if (this.IlllIllIlIIIIlIIlIIllIIIl > 0) {
                final float liiiIlIIllIIlIIlIIIlIIllI3 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
                if (this.IlllIllIlIIIIlIIlIIllIIIl - liiiIlIIllIIlIIlIIIlIIllI3 < 0.0f) {
                    this.IlllIllIlIIIIlIIlIIllIIIl = 0;
                }
                else {
                    this.IlllIllIlIIIIlIIlIIllIIIl -= (int)liiiIlIIllIIlIIlIIIlIIllI3;
                }
            }
            if (this.IlllIllIlIIIIlIIlIIllIIIl > 0) {
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)(int)(this.IIIIllIIllIIIIllIllIIIlIl + (this.IIIllIllIlIlllllllIlIlIII - this.IIIllIllIlIlllllllIlIlIII * (this.IlllIllIlIIIIlIIlIIllIIIl / (float)illlIllIlIIIIlIIlIIllIIIl * 100) / 100)), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), this.IllIIIIIIIlIlIllllIIllIII);
            }
        }
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.4385965f * 0.24329267f);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlllIIIIllIllllIllIIlIl, 1.9411765f * 1.2878788f, (float)(this.IIIIllIlIIIllIlllIlllllIl + 6), this.IIIIllIIllIIIIllIllIIIlIl + (float)6);
        cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIllIllIlIlllllllIlIlIII().toUpperCase(), this.IIIIllIlIIIllIlllIlllllIl + (float)14, this.IIIIllIIllIIIIllIllIIIlIl + (float)3, this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI) ? ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -818991313 : 791621423);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI);
    }
}
