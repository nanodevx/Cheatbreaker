import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class IIIlllIllIlIIllIIllIlIlll extends lIIIlIlIIllIIlllIIIlIIllI {
    private final List<llIlIlIllIlIIlIlllIllIIlI> IIIIllIlIIIllIlllIlllllIl = new ArrayList();
    private IIllIIlIllIIlllIlIllIIIlI IIIIllIIllIIIIllIllIIIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/left.png");
    private IIllIIlIllIIlllIlIllIIIlI IlIlIIIlllIIIlIlllIlIllIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");
    private final lIIIllIIIIlIIllIIIIIIIlll IIIllIllIlIlllllllIlIlIII = new lIIIllIIIIlIIllIIIIIIIlll("BACK");
    private int IllIIIIIIIlIlIllllIIllIII = 0;
    private boolean connected;
    private long connectTime;

    public IIIlllIllIlIIllIIllIlIlll() {
        Iterator var1 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlIIllllIIllllllIlIIIll().iterator();

        while (var1.hasNext()) {
            IlIlIIIlllIIIlIlllIlIllIl o = (IlIlIIIlllIIIlIlllIlIllIl) var1.next();
            this.IIIIllIlIIIllIlllIlllllIl.add(new llIlIlIllIlIIlIlllIllIIlI(o, 1.0F));
        }
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2) {
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.checkRerun();

        if (!lIIIllllIIllIIIIIlIIlIIlI.cb.lIllIllIlIIllIllIlIlIIlIl().IlllIllIlIIIIlIIlIIllIIIl()) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlllIIIllIllIlIIIIIIlII.IlllIIIlIlllIllIlIIlllIlI("Unable to connect to the server.", this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F - 10.0F, -1);
            // OCB - Reconnect time.
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlllIIIllIllIlIIIIIIlII.IlllIIIlIlllIllIlIIlllIlI("Please try again in " + lIIIllllIIllIIIIIlIIlIIlI.cb.getNextReconnectTime() + (lIIIllllIIllIIIIIlIIlIIlI.cb.getNextReconnectTime() == 1 ? " second" : " seconds") + ".", this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 4.0F, -1);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 30.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 28.0F, 60.0F, 12.0F);
            connected = false;
            connectTime = -1;
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        } else {
            lIIIllllIIllIIIIIlIIlIIlI.cb.setNextReconnectTime(30);
            connected = true;
            if (connectTime == -1) connectTime = System.currentTimeMillis();
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 80.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F - 78.0F, this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 80.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 100.0F, 788529152);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 30.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 105.0F, 60.0F, 12.0F);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
            if (this.IIIIllIlIIIllIlllIlllllIl.isEmpty()) {
                lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlllIIIllIllIlIIIIIIlII.lIIIIIIIIIlIllIIllIlIIlIl("You don't own any cosmetics.", this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 4.0F, -6381922);
            } else {
                lIIIllllIIllIIIIIlIIlIIlI.cb.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl("Cosmetics (" + this.IIIIllIlIIIllIlllIlllllIl.size() + ")", this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F - 90.0F, -1);
                int var7 = 0;
                float var8 = 0.0F;
                Iterator var9 = this.IIIIllIlIIIllIlllIlllllIl.iterator();

                while (var9.hasNext()) {
                    llIlIlIllIlIIlIlllIllIIlI var10 = (llIlIlIllIlIIlIlllIllIIlI) var9.next();
                    ++var7;
                    if (var7 - 1 >= this.IllIIIIIIIlIlIllllIIllIII * 5 && var7 - 1 < (this.IllIIIIIIIlIlIllllIIllIII + 1) * 5) {
                        var10.lIIIIlIIllIIlIIlIIIlIIllI((int) this.IlIlIIIlllIIIlIlllIlIllIl() / 2 - 76, (int) (this.IIIllIllIlIlllllllIlIlIII() / 2.0F - 72.0F + var8), 152, var10.lIIIIlIIllIIlIIlIIIlIIllI());
                        var10.lIIIIlIIllIIlIIlIIIlIIllI((int) var1, (int) var2, 1.0F);
                        var8 += (float) var10.lIIIIlIIllIIlIIlIIIlIIllI();
                    }
                }

                if (this.IIIIllIlIIIllIlllIlllllIl.size() > 5) {
                    boolean var11 = var1 > this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 40.0F && var1 < this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 1.0F && var2 > this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 80.0F && var2 < this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 100.0F;
                    GL11.glColor4f(0.0F, 0.0F, 0.0F, var11 ? 0.45F : 0.25F);
                    lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIIllIIIIllIllIIIlIl, 4.0F, this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 10.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 84.0F);
                    boolean var12 = var1 > this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 1.0F && var1 < this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 40.0F && var2 > this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 80.0F && var2 < this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 100.0F;
                    GL11.glColor4f(0.0F, 0.0F, 0.0F, var12 ? 0.45F : 0.25F);
                    lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl, 4.0F, this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 10.0F, this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 84.0F);
                }
            }
        }
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3) {
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
        if (this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(new IlIlIIIIIllIlIlIIllIlIIIl());
        } else {
            if (this.IIIIllIlIIIllIlllIlllllIl.size() > 5) {
                boolean var4 = var1 > this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 40.0F && var1 < this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 1.0F && var2 > this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 80.0F && var2 < this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 100.0F;
                boolean var5 = var1 > this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 1.0F && var1 < this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F + 40.0F && var2 > this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 80.0F && var2 < this.IIIllIllIlIlllllllIlIlIII() / 2.0F + 100.0F;
                if (this.IllIIIIIIIlIlIllllIIllIII > 0 && var4) {
                    --this.IllIIIIIIIlIlIllllIIllIII;
                    lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                } else if (var5 && (float) (this.IllIIIIIIIlIlIllllIIllIII + 1) < (float) this.IIIIllIlIIIllIlllIlllllIl.size() / 5.0F) {
                    ++this.IllIIIIIIIlIlIllllIIllIII;
                    lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                }
            }

            int var7 = 0;
            Iterator var8 = this.IIIIllIlIIIllIlllIlllllIl.iterator();

            while (var8.hasNext()) {
                llIlIlIllIlIIlIlllIllIIlI var6 = (llIlIlIllIlIIlIlllIllIIlI) var8.next();
                ++var7;
                if (var7 - 1 >= this.IllIIIIIIIlIlIllllIIllIII * 5 && var7 - 1 < (this.IllIIIIIIIlIlIllllIIllIII + 1) * 5) {
                    var6.lIIIIlIIllIIlIIlIIIlIIllI((int) var1, (int) var2, var3);
                }
            }
        }
    }

    public void checkRerun() {
        if (lIIIllllIIllIIIIIlIIlIIlI.cb.getNextReconnectTime() == 25 && connectTime + 6500L > System.currentTimeMillis()) {
            Iterator var1 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIlIIllllIIllllllIlIIIll().iterator();

            while (var1.hasNext()) {
                IlIlIIIlllIIIlIlllIlIllIl o = (IlIlIIIlllIIIlIlllIlIllIl) var1.next();
                this.IIIIllIlIIIllIlllIlllllIl.add(new llIlIlIllIlIIlIlllIllIIlI(o, 1.0F));
            }
        }
    }
}
