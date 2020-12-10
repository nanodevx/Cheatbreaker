import org.lwjgl.opengl.GL11;

public class IlIllIIIIIlIlllIIIIlllIIl extends IlIIIIlllIIIlIIllllIIIlll {
    public IlIllIIIIIlIlllIIIIlllIIl() {
        super("Boss Bar");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IIIIllIlIIIllIlllIlllllIl);
        this.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/icons/mods/boss_bar.png"), 78, 4);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIlIlllIIlIIllIIlIIlII.class, this::fakeRender);
        this.lIIIIIIIIIlIllIIllIlIIlIl(true);
    }

    public void fakeRender(Object event) {
        GL11.glPushMatrix();
        lIllIlIlllIIlIIllIIlIIlII var1 = (lIllIlIlllIIlIIllIIlIIlII) event;
        this.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIlIIllIIlIIlIIIlIIllI());
        if (llIIIllIIllIIIllIlllIlllI.IlllIIIlIlllIllIlIIlllIlI == null || llIIIllIIllIIIllIlllIlllI.lIIIIIIIIIlIllIIllIlIIlIl <= 0) {
            this.IIIIIIlIlIlIllllllIlllIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(IlIIIlIIlIIllIllllIlIlIll.IIIlllIIIllIllIlIIIIIIlII);
            lIlIIIIlllIlIIllIIIlllIll var2 = this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll;
            short var5 = 182;
            byte var6 = 0;
            float var7 = 1.0F;
            int var8 = (int)(var7 * (float)(var5 + 1));
            byte var9 = 13;
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var9, 0, 74, var5, 5);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var9, 0, 74, var5, 5);
            if (var8 > 0) {
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var9, 0, 79, var8, 5);
            }

            String var10 = "Wither";
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var10, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(var2.lIIIIlIIllIIlIIlIIIlIIllI(var10) / 2), (float)(var9 - 10), 16777215);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.IIIIIIlIlIlIllllllIlllIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(IlIIIlIIlIIllIllllIlIlIll.IIIlllIIIllIllIlIIIIIIlII);
            this.IlllIIIlIlllIllIlIIlllIlI((float)182, (float)20);
        }

        GL11.glPopMatrix();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(Object event) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl var1 = (lIllIllIlIIllIllIlIlIIlIl)event;
            this.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIlIIllIIlIIlIIIlIIllI());
            if (llIIIllIIllIIIllIlllIlllI.IlllIIIlIlllIllIlIIlllIlI != null && llIIIllIIllIIIllIlllIlllI.lIIIIIIIIIlIllIIllIlIIlIl > 0) {
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(IlIIIlIIlIIllIllllIlIlIll.IIIlllIIIllIllIlIIIIIIlII);
                --llIIIllIIllIIIllIlllIlllI.lIIIIIIIIIlIllIIllIlIIlIl;
                lIlIIIIlllIlIIllIIIlllIll var2 = this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll;
                llIIllIIIllIIlIlIIIIIIIII var3 = new llIIllIIIllIIlIlIIIIIIIII(this.IIIIIIlIlIlIllllllIlllIlI, this.IIIIIIlIlIlIllllllIlllIlI.IIIllIllIlIlllllllIlIlIII, this.IIIIIIlIlIlIllllllIlllIlI.IllIIIIIIIlIlIllllIIllIII);
                short var5 = 182;
                byte var6 = 0;
                int var7 = (int)(llIIIllIIllIIIllIlllIlllI.lIIIIlIIllIIlIIlIIIlIIllI * (float)(var5 + 1));
                byte var8 = 12;
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var8, 0, 74, var5, 5);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var8, 0, 74, var5, 5);
                if (var7 > 0) {
                    IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var6, var8, 0, 79, var7, 5);
                }

                String var9 = llIIIllIIllIIIllIlllIlllI.IlllIIIlIlllIllIlIIlllIlI;
                var2.lIIIIlIIllIIlIIlIIIlIIllI(var9, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(var2.lIIIIlIIllIIlIIlIIIlIIllI(var9) / 2), (float)(var8 - 10), 16777215);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.IlllIIIlIlllIllIlIIlllIlI((float)182, (float)20);
            }

            GL11.glPopMatrix();
        }
    }
}
