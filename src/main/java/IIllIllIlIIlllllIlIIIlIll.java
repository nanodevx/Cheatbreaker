import org.lwjgl.opengl.*;

// Mode Slider
public class IIllIllIlIIlllllIlIIIlIll extends IlIIlllIlIIIlIIIlIlIlIlIl
{
    private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private IIllIIlIllIIlllIlIllIIIlI IllIIIIIIIlIlIllllIIllIII;
    private IIllIIlIllIIlllIlIllIIIlI lIIIIllIIlIlIllIIIlIllIlI;
    private int IlllIllIlIIIIlIIlIIllIIIl;
    private float IlIlllIIIIllIllllIllIIlIl;
    private String llIIlllIIIIlllIllIlIlllIl;
    
    public IIllIllIlIIlllllIlIIIlIll(final lIIlIlllIIIIlIIIllIlIIIII liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.IllIIIIIIIlIlIllllIIllIII = new IIllIIlIllIIlllIlIllIIIlI("client/icons/left.png");
        this.lIIIIllIIlIlIllIIIlIllIlI = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");
        this.IlllIllIlIIIIlIIlIIllIIIl = 0;
        this.IlIlllIIIIllIllllIllIIlIl = 0.0f;
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.IIIllIllIlIlllllllIlIlIII = 12;
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 10) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        final boolean b2 = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : (b2 || b) ? -1090519040 : -1895825408);
        if (!this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().endsWith("color")) {
            if (this.IlllIllIlIIIIlIIlIIllIIIl == 0) {
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
            }
            else {
                final boolean b3 = this.IlllIllIlIIIIlIIlIIllIIIl == 1;
                cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(this.llIIlllIIIIlllIllIlIlllIl, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48 - (b3 ? (-this.IlIlllIIIIllIllllIllIIlIl) : this.IlIlllIIIIllIllllIllIIlIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
                if (b3) {
                	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 98 + this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
                }
                else {
                	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 2 - this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
                }
                if (this.IlIlllIIIIllIllllIllIIlIl >= 50) {
                    this.IlllIllIlIIIIlIIlIIllIIIl = 0;
                    this.IlIlllIIIIllIllllIllIIlIl = 0.0f;
                }
                else {
                    final float liiiIlIIllIIlIIlIIIlIIllI = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI(50 + this.IlIlllIIIIllIllllIllIIlIl * 15);
                    if (this.IlIlllIIIIllIllllIllIIlIl + liiiIlIIllIIlIIlIIIlIIllI >= 50) {
                        this.IlIlllIIIIllIllllIllIIlIl = 50;
                    }
                    else {
                        this.IlIlllIIIIllIllllIllIIlIl += liiiIlIIllIIlIIlIIIlIIllI;
                    }
                }
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 130), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 72), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : -723724);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 22), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 4), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : -723724);
            }
        }
        else if (this.IlllIllIlIIIIlIIlIIllIIIl == 0) {
            final float n4 = (float)cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 44.738373f * 1.0617284f - n4 / 2.0f, this.IIIIllIIllIIIIllIllIIIlIl + 1.74f * 1.4367816f, -16777216);
            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("§" + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48 - n4 / 2.0f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -16777216);
        }
        else {
            final boolean b4 = this.IlllIllIlIIIIlIIlIIllIIIl == 1;
            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(this.llIIlllIIIIlllIllIlIlllIl, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48 - (b4 ? (-this.IlIlllIIIIllIllllIllIIlIl) : this.IlIlllIIIIllIllllIllIIlIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), -1895825408);
            final float n5 = (float)cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
            if (b4) {
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 110.21739f * 0.88461536f - n5 / 2.0f + this.IlIlllIIIIllIllllIllIIlIl, this.IIIIllIIllIIIIllIllIIIlIl + 0.8095238f * 3.0882351f, -16777216);
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("§" + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 98 - n5 / 2.0f + this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -16777216);
            }
            else {
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 2.6296296f * 0.57042253f - n5 / 2.0f - this.IlIlllIIIIllIllllIllIIlIl, this.IIIIllIIllIIIIllIllIIIlIl + 0.040983606f * 61.0f, -16777216);
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("§" + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl(), this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 2 - n5 / 2.0f - this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -16777216);
            }
            if (this.IlIlllIIIIllIllllIllIIlIl >= 50) {
                this.IlllIllIlIIIIlIIlIIllIIIl = 0;
                this.IlIlllIIIIllIllllIllIIlIl = 0.0f;
            }
            else {
                final float liiiIlIIllIIlIIlIIIlIIllI2 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI(50 + this.IlIlllIIIIllIllllIllIIlIl * 15);
                if (this.IlIlllIIIIllIllllIllIIlIl + liiiIlIIllIIlIIlIIIlIIllI2 >= 50) {
                    this.IlIlllIIIIllIllllIllIIlIl = 50;
                }
                else {
                    this.IlIlllIIIIllIllllIllIIlIl += liiiIlIIllIIlIIlIIIlIIllI2;
                }
            }
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 130), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 72), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), -723724);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 22), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 4), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), -723724);
        }
        GL11.glColor4f(
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f,
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f, 
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f, 
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? b2 ? (0.82580644f * 0.86875f) : (1.0F) : b2 ? (0.82580644f * 0.96875f) : (3.3793104f * 0.13316326f));
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIIIIIIIlIlIllllIIllIII, 4, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 82), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3));
        GL11.glColor4f(
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f, 
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f, 		
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0f : 0.0f, 
        	((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? b ? (0.82580644f * 0.86875f) : (1.0F) : b ? (0.82580644f * 0.96875f) : (3.3793104f * 0.13316326f));
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIllIIlIlIllIIIlIllIlI, 4, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 22), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3));
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 10) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        final boolean b2 = n > (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        if ((b2 || b) && this.IlllIllIlIIIIlIIlIIllIIIl == 0) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0f));
            for (int i = 0; i < ((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII()).length; ++i) {
                if (((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII())[i].toLowerCase().equalsIgnoreCase((String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl())) {
                    this.llIIlllIIIIlllIllIlIlllIl = (String)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl();
                    if (b) {
                        if (i + 1 >= this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII().length) {
                            this.IlllIllIlIIIIlIIlIIllIIIl = 2;
                            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII())[0]);
                            break;
                        }
                        this.IlllIllIlIIIIlIIlIIllIIIl = 2;
                        this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII())[i + 1]);
                        break;
                    }
                    else if (b2) {
                        if (i - 1 < 0) {
                            this.IlllIllIlIIIIlIIlIIllIIIl = 1;
                            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII())[((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII()).length - 1]);
                            break;
                        }
                        this.IlllIllIlIIIIlIIlIIllIIIl = 1;
                        this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(((String[])this.lIIIIlIIllIIlIIlIIIlIIllI.IllIIIIIIIlIlIllllIIllIII())[i - 1]);
                        break;
                    }
                }
            }
            if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIlIIllIIIllllIIlllIllIIl) {
                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI();
            }
        }
    }
}
