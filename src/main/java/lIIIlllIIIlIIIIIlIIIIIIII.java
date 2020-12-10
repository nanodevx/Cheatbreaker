import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class lIIIlllIIIlIIIIIlIIIIIIII extends llIIlIllIllllIlIllIlIlIII {
    private float IIIIllIlIIIllIlllIlllllIl;
    private float IIIIllIIllIIIIllIllIIIlIl;
    protected List<llllIIIIlIlIllIIIllllIIll> lIIIIlIIllIIlIIlIIIlIIllI;
    protected List<llllIIIIlIlIllIIIllllIIll> lIIIIIIIIIlIllIIllIlIIlIl;
    private llIIllIIIllIIlIlIIIIIIIII IlIlIIIlllIIIlIlllIlIllIl;
    protected int IlllIIIlIlllIllIlIIlllIlI = 0;

    public lIIIlllIIIlIIIIIlIIIIIIII() {
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIllIllIllIlllIlIIlIlII var1, int var2, int var3) {
        this.lllIIIIIlIllIlIIIllllllII = var1;
        this.lIIlllIIlIlllllllllIIIIIl = var1.llIlIIIlIIIIlIlllIlIIIIll;
        this.lIIIIIllllIIIIlIlIIIIlIlI = var2;
        this.IIIIIIlIlIlIllllllIlllIlI = var3;
        this.IllIllIIIlIIlllIIIllIllII.clear();
        this.IlIlIIIlllIIIlIlllIlIllIl = new llIIllIIIllIIlIlIIIIIIIII(this.lllIIIIIlIllIlIIIllllllII, this.lllIIIIIlIllIlIIIllllllII.IIIllIllIlIlllllllIlIlIII, this.lllIIIIIlIllIlIIIllllllII.IllIIIIIIIlIlIllllIIllIII);
        float var4 = this.IIIIllIIllIIIIllIllIIIlIl();
        this.IIIIllIlIIIllIlllIlllllIl = (float)var2 / var4;
        this.IIIIllIIllIIIIllIllIIIlIl = (float)var3 / var4;
        this.s_();
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(llllIIIIlIlIllIIIllllIIll... var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList();
        this.lIIIIlIIllIIlIIlIIIlIIllI.addAll(Arrays.asList(var1));
        this.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIlIIllIIlIIlIIIlIIllI.size();
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(llllIIIIlIlIllIIIllllIIll... var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.addAll(Arrays.asList(var1));
        this.s_();
    }

    public void IlllIIIlIlllIllIlIIlllIlI(llllIIIIlIlIllIIIllllIIll... var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.removeAll(Arrays.asList(var1));
        this.s_();
    }

    protected void IIIIllIlIIIllIlllIlllllIl(llllIIIIlIlIllIIIllllIIll... var1) {
        this.lIIIIIIIIIlIllIIllIlIIlIl = new ArrayList();
        this.lIIIIIIIIIlIllIIllIlIIlIl.addAll(Arrays.asList(var1));
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
        float var4 = this.IIIIllIIllIIIIllIllIIIlIl();
        GL11.glPushMatrix();
        GL11.glScalef(var4, var4, var4);
        this.lIIIIlIIllIIlIIlIIIlIIllI((float)var1 / var4, (float)var2 / var4);
        GL11.glPopMatrix();
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
        float var4 = this.IIIIllIIllIIIIllIllIIIlIl();
        this.lIIIIlIIllIIlIIlIIIlIIllI(var1 / var4, var2 / var4, var3);
    }

    protected void lIIIIIIIIIlIllIIllIlIIlIl(int var1, int var2, int var3) {
        float var4 = this.IIIIllIIllIIIIllIllIIIlIl();
        this.lIIIIIIIIIlIllIIllIlIIlIl((float)var1 / var4, (float)var2 / var4, var3);
    }

    public abstract void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2);

    protected abstract void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3);

    public abstract void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, int var3);

    public float IIIIllIIllIIIIllIllIIIlIl() {
        float var1;
        switch(this.IlIlIIIlllIIIlIlllIlIllIl.IIIIllIIllIIIIllIllIIIlIl()) {
            case 1:
                var1 = 0.5F;
                break;
            case 3:
                var1 = 1.5F;
                break;
            case 4:
                var1 = 2.0F;
                break;
            default:
                var1 = 1.0F;
        }

        return 1.0F / var1;
    }

    public float IlIlIIIlllIIIlIlllIlIllIl() {
        return this.IIIIllIlIIIllIlllIlllllIl;
    }

    public float IIIllIllIlIlllllllIlIlIII() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    protected void IllIIIIIIIlIlIllllIIllIII() {
        this.lIIIIlIIllIIlIIlIIIlIIllI.forEach(llllIIIIlIlIllIIIllllIIll::lIIIIIIIIIlIllIIllIlIIlIl);
    }

    protected void lIIIIllIIlIlIllIIIlIllIlI() {
        this.lIIIIlIIllIIlIIlIIIlIIllI.forEach(llllIIIIlIlIllIIIllllIIll::lIIIIlIIllIIlIIlIIIlIIllI);
    }

    protected void lIIIIIIIIIlIllIIllIlIIlIl(char var1, int var2) {
        Iterator var3 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

        while(var3.hasNext()) {
            llllIIIIlIlIllIIIllllIIll var4 = (llllIIIIlIlIllIIIllllIIll)var3.next();
            var4.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        }

    }

    protected void IlllIllIlIIIIlIIlIIllIIIl() {
        this.lIIIIlIIllIIlIIlIIIlIIllI.forEach(llllIIIIlIlIllIIIllllIIll::IlllIIIlIlllIllIlIIlllIlI);
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, llllIIIIlIlIllIIIllllIIll... var3) {
        List<llllIIIIlIlIllIIIllllIIll> var4 = Arrays.asList(var3);
        Iterator var5 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

        while(var5.hasNext()) {
            llllIIIIlIlIllIIIllllIIll var6 = (llllIIIIlIlIllIIIllllIIll)var5.next();
            if (!var4.contains(var6)) {
                var6.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, this.lIIIIlIIllIIlIIlIIIlIIllI(var6, var1, var2));
            }
        }

    }

    protected void IlllIIIlIlllIllIlIIlllIlI(float var1, float var2, int var3) {
        Iterator var4 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

        while(var4.hasNext()) {
            llllIIIIlIlIllIIIllllIIll var5 = (llllIIIIlIlIllIIIllllIIll)var4.next();
            if (var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && var5.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, this.lIIIIlIIllIIlIIlIIIlIIllI(var5, var1, var2))) {
                break;
            }
        }

    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3, llllIIIIlIlIllIIIllllIIll... var4) {
        List var5 = Arrays.asList(var4);
        llllIIIIlIlIllIIIllllIIll var6 = null;
        boolean var7 = false;
        Iterator var8 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

        llllIIIIlIlIllIIIllllIIll var9;
        while(var8.hasNext()) {
            var9 = (llllIIIIlIlIllIIIllllIIll)var8.next();
            if (!var5.contains(var9) && var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                if (!this.lIIIIIIIIIlIllIIllIlIIlIl.contains(var9)) {
                    var6 = var9;
                }

                if (var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, this.lIIIIlIIllIIlIIlIIIlIIllI(var9, var1, var2, var4))) {
                    var7 = true;
                    break;
                }
            }
        }

        if (!var7) {
            if (var6 != null) {
                this.lIIIIlIIllIIlIIlIIIlIIllI.add(this.lIIIIlIIllIIlIIlIIIlIIllI.remove(this.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(var6)));
            }

            var8 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

            while(var8.hasNext()) {
                var9 = (llllIIIIlIlIllIIIllllIIll)var8.next();
                if (var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3)) {
                    break;
                }
            }
        }

    }

    protected boolean lIIIIlIIllIIlIIlIIIlIIllI(llllIIIIlIlIllIIIllllIIll var1, float var2, float var3, llllIIIIlIlIllIIIllllIIll... var4) {
        List var5 = Arrays.asList(var4);
        boolean var6 = true;

        for(int var7 = this.lIIIIlIIllIIlIIlIIIlIIllI.size() - 1; var7 >= 0; --var7) {
            llllIIIIlIlIllIIIllllIIll var8 = (llllIIIIlIlIllIIIllllIIll)this.lIIIIlIIllIIlIIlIIIlIIllI.get(var7);
            if (var8 == var1) {
                break;
            }

            if (!var5.contains(var8) && var8.lIIIIlIIllIIlIIlIIIlIIllI(var2, var3)) {
                var6 = false;
                break;
            }
        }

        return var6;
    }

    public List IlIlllIIIIllIllllIllIIlIl() {
        return this.lIIIIlIIllIIlIIlIIIlIIllI;
    }

    public llIIllIIIllIIlIlIIIIIIIII llIIlllIIIIlllIllIlIlllIl() {
        return this.IlIlIIIlllIIIlIlllIlIllIl;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl = var1;
    }
}
