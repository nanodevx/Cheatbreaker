

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class IIlllllIIlIIlIlIIlIIlIlII extends lIIllIIllllllIIlllIlllIIl {
    final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private final IIIlIllIlllIlIllIllllllll IllIIIIIIIlIlIllllIIllIII;
    private final IIIlIllIlllIlIllIllllllll lIIIIllIIlIlIllIIIlIllIlI;
    private final IlIIlIIllIllIIIIIlllIIlll IlllIllIlIIIIlIIlIIllIIIl;
    private final IlIIlIIllIllIIIIIlllIIlll IlIlllIIIIllIllllIllIIlIl;
    private final lllIIllllIIlIlIlIlIIIlIII llIIlllIIIIlllIllIlIlllIl;
    private List<IlIIlIllIllllIIlIllllIlII> lIIlIlIllIIlIIIlIIIlllIII = new ArrayList<>();

    public IIlllllIIlIIlIlIIlIIlIlII(List var1) {
        super(var1);
        this.IllIIIIIIIlIlIllllIIllIII = new IIIlIllIlllIlIllIllllllll(cb.lIIlIlIllIIlIIIlIIIlllIII, "Filter", 805306367, 1879048191);
        this.lIIIIllIIlIlIllIIIlIllIlI = new IIIlIllIlllIlIllIllllllll(cb.lIIlIlIllIIlIIIlIIIlllIII, "Username", 805306367, 1879048191);
        this.IlllIllIlIIIIlIIlIIllIIIl = new IlIIlIIllIllIIIIIlllIIlll("ADD");
        this.IlIlllIIIIllIllllIllIIlIl = new IlIIlIIllIllIIIIIlllIIlll("");
        this.llIIlllIIIIlllIllIlIlllIl = new lllIIllllIIlIlIlIlIIIlIII(this);
    }

    public void lIIIIllIIlIlIllIIIlIllIlI() {
        this.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, this.IlllIIIlIlllIllIlIIlllIlI, this.IIIIllIlIIIllIlllIlllllIl);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, float var3, float var4) {
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4);
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1 + var3 - (float)4, var2, (float)4, var4);
        boolean var5 = true;
        int var6 = 0;
        Iterator var7 = this.IIIllIllIlIlllllllIlIlIII.iterator();

        while(var7.hasNext()) {
            IlIIlIllIllllIIlIllllIlII var8 = (IlIIlIllIllllIIlIllllIlII)var7.next();
            if (this.lIIIIlIIllIIlIIlIIIlIIllI(var8)) {
                var8.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 + (float)14 + (float)(var6 * 22), var3, (float)22);
                ++var6;
            }
        }

        float var9 = (float)(14 + this.IIIllIllIlIlllllllIlIlIII.size() * 22 + 30);
        if (var9 < var4) {
            var9 = var4;
        }

        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, var2, var3, (float)13);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, var2 + var9 - (float)13, var3 - (float)35, (float)13);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var3 - (float)35, var2 + var9 - (float)13, (float)35, (float)13);
        this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, var2 + var9 - (float)26, var3, (float)13);
        this.llIIlllIIIIlllIllIlIlllIl.IIIIllIIllIIIIllIllIIIlIl(var9);
    }

    private boolean lIIIIlIIllIIlIIlIIIlIIllI(IlIIlIllIllllIIlIllllIlII var1) {
        return this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI().equals("") || IlIllllIIlIIllIlIlllllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1.IllIIIIIIIlIlIllllIIllIII().lIIIIlIIllIIlIIlIIIlIIllI()).toLowerCase().startsWith(this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI().toLowerCase());
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, boolean var3) {
        if (!this.lIIlIlIllIIlIIIlIIIlllIII.isEmpty()) {
            this.IIIllIllIlIlllllllIlIlIII.removeAll(this.lIIlIlIllIIlIIIlIIIlllIII);
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lllIIIIIlIllIlIIIllllllII().lIIIIllIIlIlIllIIIlIllIlI();
            this.lIIlIlIllIIlIIIlIIIlllIII.clear();
        }

        float var10002;
        float var10003;
        if (!cb.lIllIllIlIIllIllIlIlIIlIl().IlllIllIlIIIIlIIlIIllIIIl()) {
            var10002 = this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI / 2.0F;
            var10003 = this.lIIIIIIIIIlIllIIllIlIIlIl + (float)10;
            cb.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl("Connection lost", var10002, var10003, -1);
            var10002 = this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI / 2.0F;
            var10003 = this.lIIIIIIIIIlIllIIllIlIIlIl + (float)22;
            cb.lIIlIlIllIIlIIIlIIIlllIII.lIIIIIIIIIlIllIIllIlIIlIl("Please try again later.", var10002, var10003, -1);
        } else {
            GL11.glPushMatrix();
            GL11.glEnable(3089);
            IlllllIllIIIllIIIllIllIII var4 = IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll();
            this.llIIlllIIIIlllIllIlIlllIl.IlllIIIlIlllIllIlIIlllIlI(var1, var2, var3);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((int)this.lIIIIlIIllIIlIIlIIIlIIllI, (int)this.lIIIIIIIIIlIllIIllIlIIlIl, (int)(this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI), (int)(this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl), (float)((int)((float)var4.llIIlllIIIIlllIllIlIlllIl().IIIIllIIllIIIIllIllIIIlIl() * var4.IIIIllIIllIIIIllIllIIIlIl())), (int)var4.IIIllIllIlIlllllllIlIlIII());
            ImmutableList var5 = ImmutableList.copyOf(this.IIIllIllIlIlllllllIlIlIII);
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
                IlIIlIllIllllIIlIllllIlII var7 = (IlIIlIllIllllIIlIllllIlII)var6.next();
                if (this.lIIIIlIIllIIlIIlIIIlIIllI(var7)) {
                    var7.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3);
                }
            }

            if (var5.isEmpty()) {
                var10002 = this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI / 2.0F;
                var10003 = this.lIIIIIIIIIlIllIIllIlIIlIl + (float)30;
                cb.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl("No friend requests", var10002, var10003, -1);
            }

            this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), true);
            this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
            this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
            this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI((cb.lIIlIIllIIIIIlIllIIIIllII() ? "Disable" : "Enable") + " incoming friend requests", var1, var2, true);
            GL11.glDisable(3089);
            GL11.glPopMatrix();
            this.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3);
        }

    }

    public void IlllIIIlIlllIllIlIIlllIlI() {
        this.llIIlllIIIIlllIllIlIlllIl.IlllIIIlIlllIllIlIIlllIlI();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI();
        this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI();
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI();
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl();
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(char var1, int var2) {
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        if (this.lIIIIllIIlIlIllIIIlIllIlI.lllIIIIIlIllIlIIIllllllII() && var2 == 28) {
            this.lIIlIlIllIIlIIIlIIIlllIII();
        }

        this.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, this.IlllIIIlIlllIllIlIIlllIlI, this.IIIIllIlIIIllIlllIlllllIl);
    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3, boolean var4) {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
        if (this.IllIIIIIIIlIlIllllIIllIII.lllIIIIIlIllIlIIIllllllII() && var3 == 1 && this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI().equals("")) {
            this.lIIIIllIIlIlIllIIIlIllIlI();
        }

        if (!var4) {
            return false;
        } else {
            this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4);
            if (this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII())) {
                this.lIIlIlIllIIlIIIlIIIlllIII();
            }

            if (this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII())) {
                cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIIlIlIIIllIlIIlIllIIlIl(!cb.lIIlIIllIIIIIlIllIIIIllII()));
                cb.lIIIIIIIIIlIllIIllIlIIlIl(!cb.lIIlIIllIIIIIlIllIIIIllII());
                return false;
            } else {
                boolean var5 = false;
                Iterator var6 = this.IIIllIllIlIlllllllIlIlIII.iterator();

                while(var6.hasNext()) {
                    IlIIlIllIllllIIlIllllIlII var7 = (IlIIlIllIllllIIlIllllIlII)var6.next();
                    if (this.lIIIIlIIllIIlIIlIIIlIIllI(var7)) {
                        if (var5) {
                            break;
                        }

                        var5 = var7.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
                    }
                }

                return var5;
            }
        }
    }

    private void lIIlIlIllIIlIIIlIIIlllIII() {
        if (!this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIllIIlIlIllIIIlIllIlI().isEmpty()) {
            this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            String var1 = this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIllIIlIlIllIIIlIllIlI();
            if (var1.matches("([a-zA-Z0-9_]+)") && var1.length() <= 16) {
                cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new llIlIlIIlIlllIIlIlllIIIII("", this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIllIIlIlIllIIIlIllIlI()));
                this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("");
            } else {
                llIIllllIlIlIllIlIllIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "Error!", "Incorrect username.");
            }
        }

    }

    public boolean lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, int var3, boolean var4) {
        if (!var4) {
            return false;
        } else {
            this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            this.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
            boolean var5 = false;
            Iterator var6 = this.IIIllIllIlIlllllllIlIlIII.iterator();

            while(var6.hasNext()) {
                IlIIlIllIllllIIlIllllIlII var7 = (IlIIlIllIllllIIlIllllIlII)var6.next();
                if (this.lIIIIlIIllIIlIIlIIIlIIllI(var7)) {
                    if (var5) {
                        break;
                    }

                    var5 = var7.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2 - this.llIIlllIIIIlllIllIlIlllIl.IllIIIIIIIlIlIllllIIllIII(), var3, var4);
                }
            }

            return var5;
        }
    }

    public IlIIlIIllIllIIIIIlllIIlll IlllIllIlIIIIlIIlIIllIIIl() {
        return this.IlllIllIlIIIIlIIlIIllIIIl;
    }

    public IlIIlIIllIllIIIIIlllIIlll IlIlllIIIIllIllllIllIIlIl() {
        return this.IlIlllIIIIllIllllIllIIlIl;
    }

    public List<IlIIlIllIllllIIlIllllIlII> llIIlllIIIIlllIllIlIlllIl() {
        return this.lIIlIlIllIIlIIIlIIIlllIII;
    }
}
