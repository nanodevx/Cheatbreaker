import org.lwjgl.input.*;

public class IlIllIIllIIIIIllIlIIIIIIl extends IlIIlllIlIIIlIIIlIlIlIlIl
{
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
    private llllIIIIIlIlIlIlIllIIIIII IllIIIIIIIlIlIllllIIllIII;
    private boolean lIIIIllIIlIlIllIIIlIllIlI;
    
    public IlIllIIllIIIIIllIlIIIIIIl(final lIIlIlllIIIIlIIIllIlIIIII liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.lIIIIllIIlIlIllIIIlIllIlI = false;
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.IIIllIllIlIlllllllIlIlIII = 12;
        this.IllIIIIIIIlIlIllllIIllIII = new llllIIIIIlIlIlIlIllIIIIII(cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl, null, Keyboard.getKeyName((int)liiiIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl()), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 100, this.IIIIllIIllIIIIllIllIIIlIl, 96, 18, -9442858, n);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 10) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : ((n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) || b) ? -1090519040 : -1895825408);
        if (this.lIIIIllIIlIlIllIIIlIllIlI && Keyboard.getEventKeyState()) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Keyboard.getEventKey());
            this.IllIIIIIIIlIlIllllIIllIII.IllIIIIIIIlIlIllllIIllIII = Keyboard.getKeyName((int)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
            this.lIIIIllIIlIlIllIIIlIllIlI = false;
        }
        this.IllIIIIIIIlIlIllllIIllIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 100, this.IIIIllIIllIIIIllIllIIIlIl, 96, 18);
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(n, n2, n3);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
        if (this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(n, n2)) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
            this.lIIIIllIIlIlIllIIIlIllIlI = true;
            this.IllIIIIIIIlIlIllllIIllIII.IllIIIIIIIlIlIllllIIllIII = "<PRESS ANY KEY>";
        }
    }
}
