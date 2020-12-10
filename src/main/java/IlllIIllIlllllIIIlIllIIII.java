import java.awt.Color;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class IlllIIllIlllllIIIlIllIIII extends llllIIIIlIlIllIIIllllIIll {
   private final lIIllIIIIllIIlllIIIIlllII IIIllIllIlIlllllllIlIlIII;
   private final lIlIlIIIlIIllllllllIIlllI IllIIIIIIIlIlIllllIIllIII;
   private final IIIIIlIllIllIlIIllIIlIllI lIIIIllIIlIlIllIIIlIllIlI;
   private static final IIllIIlIllIIlllIlIllIIIlI garbageIcon = new IIllIIlIllIIlllIlIllIIIlI("client/icons/garbage-26.png");
   private static final IIllIIlIllIIlllIlIllIIIlI ownerIcon = new IIllIIlIllIIlllIlIllIIIlI("client/logo_26.png");
   private static final IIllIIlIllIIlllIlIllIIIlI leadDevIcon = new IIllIIlIllIIlllIlIllIIIlI("client/icons/leadDev_logo_26.png");
   private static final IIllIIlIllIIlllIlIllIIIlI devIcon = new IIllIIlIllIIlllIlIllIIIlI("client/icons/dev_logo_26.png");

   public IlllIIllIlllllIIIlIllIIII(lIIllIIIIllIIlllIIIIlllII var1) {
      this.IIIllIllIlIlllllllIlIlIII = var1;
      this.IllIIIIIIIlIlIllllIIllIII = new lIlIlIIIlIIllllllllIIlllI(1500L);
      this.lIIIIllIIlIlIllIIIlIllIlI = new IIIIIlIllIllIlIIllIIlIllI(200L);
      this.IllIIIIIIIlIlIllllIIllIII.IlllIIIlIlllIllIlIIlllIlI();
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, boolean var3) {
      if (var3 && this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, -13750738);
      }

      GL11.glPushMatrix();
      IllIIlIIIllllIIIIllIlIlIl var4 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIllIIIIlllIlIIIIIlI();
      if (var4.IIIIllIlIIIllIlllIlllllIl().containsKey(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI())) {
         List var5 = var4.IIIIllIlIIIllIlllIlllllIl().get(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());
         if (var5 != null && var5.size() > 0) {
            if (!this.IllIIIIIIIlIlIllllIIllIII.IIIIllIlIIIllIlllIlllllIl()) {
               this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl();
            }

            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, (new Color(0.20185566F * 4.409091F, 0.45F * 1.2F, 0.044696968F * 1.1186441F, 0.8933333F * 0.7276119F * (0.315F * 0.4888889F + this.IllIIIIIIIlIlIllllIIllIII.IllIIIIIIIlIlIllllIIllIII()))).getRGB());
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl(var5.size() + "", this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - (float)15, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)6, -1);
         } else if (this.IllIIIIIIIlIlIllllIIllIII.IIIIllIlIIIllIlllIlllllIl() && this.IllIIIIIIIlIlIllllIIllIII.IIIIllIIllIIIIllIllIIIlIl()) {
            this.IllIIIIIIIlIlIllllIIllIII.IlIlIIIlllIIIlIlllIlIllIl();
         }
      }

      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl - 0.09090909F * 5.5F, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl, -1357572843);
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 9.9F * 0.050505053F, -1357572843);
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)4, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)3, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)20, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)19, this.IIIllIllIlIlllllllIlIlIII.IIIllIllIlIlllllllIlIlIII() ? lIIllIIIIllIIlllIIIIlllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIllIIlIlIllIIIlIllIlI()) : -13158601);
      
      if /* owner */ (this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl().startsWith(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII.toString())) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(ownerIcon, 7.7777777F * 0.8357143F, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)24, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4);
         lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F, -1);
         lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)11, -5460820);
      } else if /* lead dev */ (this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl().startsWith(IlIllllIIlIIllIlIlllllIlI.llIlIIIlIIIIlIlllIlIIIIll.toString())) {
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(leadDevIcon, 7.7777777F * 0.8357143F, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)24, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4);
          lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F, -1);
          lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)11, -5460820);
      } else if /* dev */ (this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl().startsWith(IlIllllIIlIIllIlIlllllIlI.IlllIllIlIIIIlIIlIIllIIIl.toString())) {
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(devIcon, 7.7777777F * 0.8357143F, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)24, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4);
          lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F, -1);
          lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)40, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)11, -5460820);
      } else {
    	  lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)24, this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F, -1);
    	  lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)24, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)11, -5460820);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      IIllIIlIllIIlllIlIllIIIlI var9 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl()), this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(var9, (float)7, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)5, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4);
      boolean var6 = var3 && this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && var1 > this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - (float)20;
      float var7 = this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var6);
      float var8 = this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - 53.8125F * 0.3809524F * var7;
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var8, this.lIIIIIIIIIlIllIIllIlIIlIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, -52429);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.4470588F * 0.6219512F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(garbageIcon, var8 + (float)4, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)5, (float)12, (float)12);
      GL11.glPopMatrix();
   }

   public boolean lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3, boolean var4) {
      if (!var4) {
         return false;
      } else {
         boolean var5 = this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && var1 > this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - (float)20 && var4;
         if (var5 && this.lIIIIllIIlIlIllIIIlIllIlI.IIIIllIIllIIIIllIllIIIlIl()) { // TODO: Fix Array Error here.
            /*this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IlIlIIIlIIIlIIllIlIlIIIll(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI()));
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IIIlIIllllIIllllllIlIIIll().IlllIllIlIIIIlIIlIIllIIIl().add(this);
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().remove(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());*/
            return true;
         } else if (!var5 && this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());
            return true;
         } else {
            return super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4);
         }
      }
   }

   public lIIllIIIIllIIlllIIIIlllII IllIIIIIIIlIlIllllIIllIII() {
      return this.IIIllIllIlIlllllllIlIlIII;
   }
}
