import org.lwjgl.input.*;
import org.lwjgl.opengl.*;

public class IIllllIIIIllIIlIllIIIIIlI extends IlIIlllIlIIIlIIIlIlIlIlIl
{
    private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private float IllIIIIIIIlIlIllllIIllIII;
    private float lIIIIllIIlIlIllIIIlIllIlI;
    private boolean IlllIllIlIIIIlIIlIIllIIIl;
    private IIllIIlIllIIlllIlIllIIIlI IlIlllIIIIllIllllIllIIlIl;
    private IIllIIlIllIIlllIlIllIIIlI llIIlllIIIIlllIllIlIlllIl;
    
    public IIllllIIIIllIIlIllIIIIIlI(final lIIlIlllIIIIlIIIllIlIIIII liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.IllIIIIIIIlIlIllllIIllIII = -1;
        this.IlllIllIlIIIIlIIlIIllIIIl = false;
        this.IlIlllIIIIllIllllIllIIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/sun-64.png");
        this.llIIlllIIIIlllIllIlIlllIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/moon-64.png");
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.IIIllIllIlIlllllllIlIlIII = 22;
        this.IllIIIIIIIlIlIllllIIllIII = Float.parseFloat("" + liiiIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
        final int n4 = 170;
        final boolean b = n > (this.IIIIllIlIIIllIlllIlllllIl + 170) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + 4 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 20 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
        if (n3 == 0 && b) {
            this.IlllIllIlIIIIlIIlIIllIIIl = true;
        }
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        final int n4 = 148;
        cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 8), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 8), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
        if (this.IlllIllIlIIIIlIIlIIllIIIl && !Mouse.isButtonDown(0)) {
            this.IlllIllIlIIIIlIIlIIllIIIl = false;
        }
        cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl("SERVER", (float)(this.IIIIllIlIIIllIlllIlllllIl + 172 + n4 / 2), (float)(this.IIIIllIIllIIIIllIllIIIlIl - 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 172 + n4 / 2 - 1.2580645f * 0.3974359f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 8), this.IIIIllIlIIIllIlllIlllllIl + 172 + n4 / 2 + 0.33333334f * 1.5f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 14), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : 1862270976);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.llIIlllIIIIlllIllIlIlllIl, this.IIIIllIlIIIllIlllIlllllIl + 180 - 1.3170732f * 2.4675925f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3), 6.346154f * 1.1818181f, 47.307693f * 0.15853658f);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 180 - 0.4509804f * 1.1086956f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), this.IIIIllIlIIIllIlllIlllllIl + 180 + 0.45652175f * 1.0952381f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 14), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : 1862270976);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlllIIIIllIllllIllIIlIl, this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 10 - (float)5, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), 10, 10);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 10 - 1.1875f * 0.42105263f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 10 + 0.4673913f * 1.0697675f, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 14), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : 1862270976);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 174, this.IIIIllIIllIIIIllIllIIIlIl + 16, this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 4, this.IIIIllIIllIIIIllIllIIIlIl + 18, 1.0, (n > (this.IIIIllIlIIIllIlllIlllllIl + 170) * this.lIIIIIIIIIlIllIIllIlIIlIl && n < (this.IIIIllIlIIIllIlllIlllllIl + 170 + n4 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 > (this.IIIIllIIllIIIIllIllIIIlIl + 4 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && n2 < (this.IIIIllIIllIIIIllIllIIIlIl + 20 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl) ? -1895825408 : 1862270976);
        final double n5 = n4 - 18;
        final float float1 = Float.parseFloat("" + this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl());
        final float float2 = Float.parseFloat("" + this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIIIlIlllIllIlIIlllIlI());
        if (this.IlllIllIlIIIIlIIlIIllIIIl) {
            this.lIIIIllIIlIlIllIIIlIllIlI = Math.round((float1 + (n - (this.IIIIllIlIIIllIlllIlllllIl + 180) * this.lIIIIIIIIIlIllIIllIlIIlIl) * ((float2 - float1) / (n5 * this.lIIIIIIIIIlIllIIllIlIIlIl))) * 100) / (float)100;
            if (this.lIIIIllIIlIlIllIIIlIllIlI < -13490 && this.lIIIIllIIlIlIllIIIlIllIlI > -15490) {
                this.lIIIIllIIlIlIllIIIlIllIlI = -14490;
            }
            if (this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl().equals(llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl)) {
                this.lIIIIllIIlIlIllIIIlIllIlI = (float)Math.round(this.lIIIIllIIlIlIllIIIlIllIlI);
            }
            if (this.lIIIIllIIlIlIllIIIlIllIlI < float1) {
                this.lIIIIllIIlIlIllIIIlIllIlI = float1;
            }
            else if (this.lIIIIllIIlIlIllIIIlIllIlI > float2) {
                this.lIIIIllIIlIlIllIIIlIllIlI = float2;
            }
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((long)(int)cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IllIlIlIllllIlIIllllIIlll.IIIIllIlIIIllIlllIlllllIl());
            switch (lIllIllIllllllIllIlllIlIl.lIIIIlIIllIIlIIlIIIlIIllI[this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl().ordinal()]) {
                case 1: {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Integer.parseInt((int)this.lIIIIllIIlIlIllIIIlIllIlI + ""));
                    break;
                }
                case 2: {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIllIIlIlIllIIIlIllIlI);
                    break;
                }
                case 3: {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Double.parseDouble(this.lIIIIllIIlIlIllIIIlIllIlI + ""));
                    break;
                }
            }
        }
        final float float3 = Float.parseFloat(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + "");
        float n6;
        if (float3 < this.IllIIIIIIIlIlIllllIIllIII) {
            n6 = this.IllIIIIIIIlIlIllllIIllIII - float3;
        }
        else {
            n6 = float3 - this.IllIIIIIIIlIlIllllIIllIII;
        }
        float n7 = ((float2 - float1) / 20 + n6 * 8) / (lIIIllIllIllIlllIlIIlIlII.IIIlIIlIlIIIlllIIlIllllll + 1);
        if (n7 < 0.18000000715255737 * 5.555555334797621E-4) {
            n7 = 2.1333334f * 4.6874997E-5f;
        }
        final float float4 = Float.parseFloat(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + "");
        if (this.IllIIIIIIIlIlIllllIIllIII < float4) {
            if (this.IllIIIIIIIlIlIllllIIllIII + n7 <= float4) {
                this.IllIIIIIIIlIlIllllIIllIII += n7;
            }
            else {
                this.IllIIIIIIIlIlIllllIIllIII = float4;
            }
        }
        else if (this.IllIIIIIIIlIlIllllIIllIII > float4) {
            if (this.IllIIIIIIIlIlIllllIIllIII - n7 >= float4) {
                this.IllIIIIIIIlIlIllllIIllIII -= n7;
            }
            else {
                this.IllIIIIIIIlIlIllllIIllIII = float4;
            }
        }
        final double n8 = 100 * ((this.IllIIIIIIIlIlIllllIIllIII - float1) / (float2 - float1));
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 174, this.IIIIllIIllIIIIllIllIIIlIl + 16, this.IIIIllIlIIIllIlllIlllllIl + 180 + n5 * n8 / 100, this.IIIIllIIllIIIIllIllIIIlIl + 18, 4, -12418828);
        GL11.glColor4f(0.6666667f * 0.375f, 1.0f * 0.45f, 1.0f, 1.0f);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 1359.3749f * 0.13333334f + n5 * n8 / 100, this.IIIIllIIllIIIIllIllIIIlIl + 18.818182f * 0.9166667f, 31.125001159496648 * 0.14457830786705017);
        if (this.IllIIIIIIIlIlIllllIIllIII == -14490) {
            GL11.glColor4f(0.7738095f * 0.32307693f, 0.037499998f * 12.0f, 1.0f, 1.0f);
        }
        else {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 39.5f * 4.588608f + n5 * n8 / 100, this.IIIIllIIllIIIIllIllIIIlIl + 1.2763158f * 13.515464f, 1.6875000046566129 * 1.600000023841858);
    }
}
