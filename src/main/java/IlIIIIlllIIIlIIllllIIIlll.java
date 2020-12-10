//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.lwjgl.opengl.GL11;

public class IlIIIIlllIIIlIIllllIIIlll {
    final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    protected lIIIllIllIllIlllIlIIlIlII IIIIIIlIlIlIllllllIlllIlI;
    private boolean lIIIIlIIllIIlIIlIIIlIIllI = false;
    private boolean lIIIIIIIIIlIllIIllIlIIlIl = false;
    private String IlllIIIlIlllIllIlIIlllIlI;
    private boolean IIIIllIlIIIllIlllIlllllIl = false;
    public boolean IllIllIIIlIIlllIIIllIllII = false;
    private IIlIIlIIIIIlIlIIlIIlIIlII IIIIllIIllIIIIllIllIIIlIl;
    public IIlIIlIIIIIlIlIIlIIlIIlII IlIIlIIIIlIIIIllllIIlIllI;
    private float IlIlIIIlllIIIlIlllIlIllIl = 0.0F;
    public float lIIlIIllIIIIIlIllIIIIllII = 0.0F;
    private float IIIllIllIlIlllllllIlIlIII = 0.0F;
    public float lIIlllIIlIlllllllllIIIIIl = 0.0F;
    private boolean IllIIIIIIIlIlIllllIIllIII = true;
    private boolean newModule = false;
    public boolean lIllIllIlIIllIllIlIlIIlIl = true;
    public float llIlIIIllIIIIlllIlIIIIIlI = 0.0F;
    public float lIllIlIlllIIlIIllIIlIIlII = 0.0F;
    public boolean IIIlIIlIlIIIlllIIlIllllll = true;
    private List lIIIIllIIlIlIllIIIlIllIlI;
    private List IlllIllIlIIIIlIIlIIllIIIl;
    public lIIlIlllIIIIlIIIllIlIIIII IllIlIIIIlllIIllIIlllIIlI;
    private Map IlIlllIIIIllIllllIllIIlIl;
    private IlIllIllllIIIlIIIllIIIllI llIIlllIIIIlllIllIlIlllIl;
    private IIllIIlIllIIlllIlIllIIIlI lIIlIlIllIIlIIIlIIIlllIII;
    private float IIIlllIIIllIllIlIIIIIIlII;
    private float llIlIIIlIIIIlIlllIlIIIIll;
    private float IIIlIIllllIIllllllIlIIIll;
    private String lllIIIIIlIllIlIIIllllllII;

    public IlIIIIlllIIIlIIllllIIIlll(String var1) {
        this.IlllIIIlIlllIllIlIIlllIlI = var1;
        this.IlIlllIIIIllIllllIllIIlIl = new HashMap();
        this.IIIIIIlIlIlIllllllIlllIlI = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
        this.lIIIIllIIlIlIllIIIlIllIlI = new ArrayList();
        this.IlllIllIlIIIIlIIlIIllIIIl = new ArrayList();
        this.IllIlIIIIlllIIllIIlllIIlI = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Scale")).lIIIIIIIIIlIllIIllIlIIlIl(1.0F).lIIIIlIIllIIlIIlIIIlIIllI(1.0126582F * 0.49375F, 0.55F * 2.7272727F);
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(Class var1, Consumer var2) {
        this.IlIlllIIIIllIllllIllIIlIl.put(var1, var2);
    }

    protected void lIIIIIIIIIlIllIIllIlIIlIl() {
        Iterator var1 = this.IlIlllIIIIllIllllIllIIlIl.entrySet().iterator();

        while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI((Class)var2.getKey(), (Consumer)var2.getValue());
        }

    }

    protected void IlllIIIlIlllIllIlIIlllIlI() {
        Iterator var1 = this.IlIlllIIIIllIllllIllIIlIl.entrySet().iterator();

        while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIIIIIIlIllIIllIlIIlIl((Class)var2.getKey(), (Consumer)var2.getValue());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(boolean var1) {
        if (var1 != this.IllIllIIIlIIlllIIIllIllII) {
            cb.IIIlllIIIllIllIlIIIIIIlII();
        }

        if (var1) {
            if (!this.IIIIllIlIIIllIlllIlllllIl) {
                this.IIIIllIlIIIllIlllIlllllIl = true;
                this.lIIIIIIIIIlIllIIllIlIIlIl();
            }
        } else if (this.IIIIllIlIIIllIlllIlllllIl) {
            this.IIIIllIlIIIllIlllIlllllIl = false;
            this.IlllIIIlIlllIllIlIIlllIlI();
        }

    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(boolean var1) {
        if (var1) {
            if (!this.IIIIllIlIIIllIlllIlllllIl) {
                this.IIIIllIlIIIllIlllIlllllIl = true;
                this.lIIIIIIIIIlIllIIllIlIIlIl();
            }
        } else if (this.IIIIllIlIIIllIlllIlllllIl) {
            this.IIIIllIlIIIllIlllIlllllIl = false;
            this.IlllIIIlIlllIllIlIIlllIlI();
        }

        this.IllIllIIIlIIlllIIIllIllII = this.IIIIllIlIIIllIlllIlllllIl;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2) {
        this.IlIlIIIlllIIIlIlllIlIllIl = var1;
        this.IIIllIllIlIlllllllIlIlIII = var2;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2) {
        this.IlIlIIIlllIIIlIlllIlIllIl = var1;
        this.IIIllIllIlIlllllllIlIlIII = var2;
        this.lIIlIIllIIIIIlIllIIIIllII = var1;
        this.lIIlllIIlIlllllllllIIIIIl = var2;
    }

    public void IlllIIIlIlllIllIlIIlllIlI(float var1, float var2) {
        this.llIlIIIllIIIIlllIlIIIIIlI = var1;
        this.lIllIlIlllIIlIIllIIlIIlII = var2;
    }

    public boolean IIIIllIlIIIllIlllIlllllIl() {
        return this.lIIIIlIIllIIlIIlIIIlIIllI;
    }

    public void IlllIIIlIlllIllIlIIlllIlI(boolean var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI = var1;
    }

    public boolean IIIIllIIllIIIIllIllIIIlIl() {
        return this.lIIIIIIIIIlIllIIllIlIIlIl;
    }

    public void IIIIllIlIIIllIlllIlllllIl(boolean var1) {
        this.lIIIIIIIIIlIllIIllIlIIlIl = var1;
        if (!var1 && this.IlIlIIIlllIIIlIlllIlIllIl()) {
            this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        }

    }

    public boolean IlIlIIIlllIIIlIlllIlIllIl() {
        return this.IIIIllIlIIIllIlllIlllllIl;
    }

    public String IIIllIllIlIlllllllIlIlIII() {
        return this.IlllIIIlIlllIllIlIIlllIlI;
    }

    public float IllIIIIIIIlIlIllllIIllIII() {
        return this.llIlIIIllIIIIlllIlIIIIIlI;
    }

    public float lIIIIllIIlIlIllIIIlIllIlI() {
        return this.lIllIlIlllIIlIIllIIlIIlII;
    }

    public float IlllIllIlIIIIlIIlIIllIIIl() {
        return this.IlIlIIIlllIIIlIlllIlIllIl;
    }

    public float IlIlllIIIIllIllllIllIIlIl() {
        return this.IIIllIllIlIlllllllIlIlIII;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1) {
        this.IIIllIllIlIlllllllIlIlIII = var1;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl = var1;
    }

    public List llIIlllIIIIlllIllIlIlllIl() {
        return this.lIIIIllIIlIlIllIIIlIllIlI;
    }

    public List lIIlIlIllIIlIIIlIIIlllIII() {
        return this.IlllIllIlIIIIlIIlIIllIIIl;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI(var1, this.llIlIIIllIIIIlllIlIIIIIlI, this.lIllIlIlllIIlIIllIIlIIlII);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1, float var2, float var3) {
        float var4 = 0.0F;
        float var5 = 0.0F;
        GL11.glScalef((Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl());
        var2 *= (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
        var3 *= (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
        switch(IllIIIIIllllIlllIIlIIllIl.lIIIIlIIllIIlIIlIIIlIIllI[this.IIIIllIIllIIIIllIllIIIlIl.ordinal()]) {
            case 1:
                var4 = 2.0F;
                var5 = 2.0F;
                break;
            case 2:
                var4 = 2.0F;
                var5 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var3 / 2.0F;
                break;
            case 3:
                var5 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var3 - 2.0F;
                var4 = 2.0F;
                break;
            case 4:
                var4 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var2 / 2.0F;
                var5 = 2.0F;
                break;
            case 5:
                var4 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var2 / 2.0F;
                var5 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var3 / 2.0F;
                break;
            case 6:
                var4 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var2;
                var5 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var3 - 2.0F;
                break;
            case 7:
                var4 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2);
                var5 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var3 - 2.0F;
                break;
            case 8:
                var4 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var2 - 2.0F;
                var5 = 2.0F;
                break;
            case 9:
                var4 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var2;
                var5 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var3 / 2.0F;
                break;
            case 10:
                var4 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var2;
                var5 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var3;
        }

        GL11.glTranslatef(var4 / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), var5 / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), 0.0F);
        GL11.glTranslatef(this.IlIlIIIlllIIIlIlllIlIllIl / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), this.IIIllIllIlIlllllllIlIlIII / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), 0.0F);
    }

    public float[] lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1, boolean var2) {
        float var3 = 0.0F;
        float var4 = 0.0F;
        float var5 = this.llIlIIIllIIIIlllIlIIIIIlI * (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
        float var6 = this.lIllIlIlllIIlIIllIIlIIlII * (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
        switch(IllIIIIIllllIlllIIlIIllIl.lIIIIlIIllIIlIIlIIIlIIllI[this.IIIIllIIllIIIIllIllIIIlIl.ordinal()]) {
            case 1:
                var3 = 2.0F;
                var4 = 2.0F;
                break;
            case 2:
                var3 = 2.0F;
                var4 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var6 / 2.0F;
                break;
            case 3:
                var4 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var6 - 2.0F;
                var3 = 2.0F;
                break;
            case 4:
                var3 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var5 / 2.0F;
                var4 = 2.0F;
                break;
            case 5:
                var3 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var5 / 2.0F;
                var4 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var6 / 2.0F;
                break;
            case 6:
                var3 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2) - var5;
                var4 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var6 - 2.0F;
                break;
            case 7:
                var3 = (float)(var1.lIIIIlIIllIIlIIlIIIlIIllI() / 2);
                var4 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var6 - 2.0F;
                break;
            case 8:
                var3 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var5 - 2.0F;
                var4 = 2.0F;
                break;
            case 9:
                var3 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var5;
                var4 = (float)(var1.lIIIIIIIIIlIllIIllIlIIlIl() / 2) - var6 / 2.0F;
                break;
            case 10:
                var3 = (float)var1.lIIIIlIIllIIlIIlIIIlIIllI() - var5;
                var4 = (float)var1.lIIIIIIIIIlIllIIllIlIIlIl() - var6;
        }

        return new float[]{(var3 + (var2 ? this.IlIlIIIlllIIIlIlllIlIllIl : 0.0F)) / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), (var4 + (var2 ? this.IIIllIllIlIlllllllIlIlIII : 0.0F)) / (Float)this.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()};
    }

    public boolean IIIlllIIIllIllIlIIIIIIlII() {
        return this.IllIIIIIIIlIlIllllIIllIII;
    }

    public IIlIIlIIIIIlIlIIlIIlIIlII llIlIIIlIIIIlIlllIlIIIIll() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIIlIIIIIlIlIIlIIlIIlII var1) {
        if (var1 != this.IlIIlIIIIlIIIIllllIIlIllI) {
            cb.IIIlllIIIllIllIlIIIIIIlII();
        }

        this.IIIIllIIllIIIIllIllIIIlIl = var1;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII var1) {
        this.IIIIllIIllIIIIllIllIIIlIl = var1;
        this.IlIIlIIIIlIIIIllllIIlIllI = var1;
    }

    public llIIIlIIIllllllIllIIlIIll IIIlIIllllIIllllllIlIIIll() {
        return IllIlIlllIIllIlIIlIIIIIII.IlllIIIlIlllIllIlIIlllIlI(this.IIIIllIIllIIIIllIllIIIlIl);
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(IIllIIlIllIIlllIlIllIIIlI var1, int var2, int var3) {
        this.llIIlllIIIIlllIllIlIlllIl = IlIllIllllIIIlIIIllIIIllI.lIIIIIIIIIlIllIIllIlIIlIl;
        this.lIIlIlIllIIlIIIlIIIlllIII = var1;
        this.IIIlllIIIllIllIlIIIIIIlII = (float)var2;
        this.llIlIIIlIIIIlIlllIlIIIIll = (float)var3;
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(String var1, float var2) {
        this.llIIlllIIIIlllIllIlIlllIl = IlIllIllllIIIlIIIllIIIllI.lIIIIlIIllIIlIIlIIIlIIllI;
        this.lllIIIIIlIllIlIIIllllllII = var1;
        this.IIIlIIllllIIllllllIlIIIll = var2;
    }

    public IlIllIllllIIIlIIIllIIIllI lllIIIIIlIllIlIIIllllllII() {
        return this.llIIlllIIIIlllIllIlIlllIl;
    }

    public IIllIIlIllIIlllIlIllIIIlI lIIIIIllllIIIIlIlIIIIlIlI() {
        return this.lIIlIlIllIIlIIIlIIIlllIII;
    }

    public float IIIIIIlIlIlIllllllIlllIlI() {
        return this.IIIlllIIIllIllIlIIIIIIlII;
    }

    public float IllIllIIIlIIlllIIIllIllII() {
        return this.llIlIIIlIIIIlIlllIlIIIIll;
    }

    public String IlIIlIIIIlIIIIllllIIlIllI() {
        return this.lllIIIIIlIllIlIIIllllllII;
    }

    public float lIIlIIllIIIIIlIllIIIIllII() {
        return this.IIIlIIllllIIllllllIlIIIll;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(List var1) {
        this.lIIIIllIIlIlIllIIIlIllIlI = var1;
    }

    public void IIIIllIIllIIIIllIllIIIlIl(boolean var1) {
        if (var1 != this.lIllIllIlIIllIllIlIlIIlIl) {
            cb.IIIlllIIIllIllIlIIIIIIlII();
        }

        this.IllIIIIIIIlIlIllllIIllIII = var1;
    }

    public void IlIlIIIlllIIIlIlllIlIllIl(boolean var1) {
        this.IllIIIIIIIlIlIllllIIllIII = var1;
        this.lIllIllIlIIllIllIlIlIIlIl = var1;
    }

    public void setNew(boolean newModule) {
        this.newModule = newModule;
    }

    public boolean isNew() {
        return newModule;
    }
}
