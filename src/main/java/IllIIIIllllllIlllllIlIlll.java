import org.lwjgl.opengl.GL11;

public class IllIIIIllllllIlllllIlIlll extends IlIIlllIlIIIlIIIlIlIlIlIl {
   private final int lIIIIlIIllIIlIIlIIIlIIllI;
   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private final lllIllIllIlIllIlIIllllIIl IllIIIIIIIlIlIllllIIllIII;
   private int lIIIIllIIlIlIllIIIlIllIlI = 0;
   private IIllIIlIllIIlllIlIllIIIlI IlllIllIlIIIIlIIlIIllIIIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");

   public IllIIIIllllllIlllllIlIlll(lllIllIllIlIllIlIIllllIIl var1, int var2, float var3) {
      super(var3);
      this.IllIIIIIIIlIlIllllIIllIII = var1;
      this.lIIIIlIIllIIlIIlIIIlIIllI = var2;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      boolean var4 = this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
      byte var5 = 75;
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 1), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
      float var6 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
      if (var4) {
         if (this.lIIIIllIIlIlIllIIIlIllIlI < var5) {
            this.lIIIIllIIlIlIllIIIlIllIlI = (int)((float)this.lIIIIllIIlIlIllIIIlIllIlI + var6);
            if (this.lIIIIllIIlIlIllIIIlIllIlI > var5) {
               this.lIIIIllIIlIlIllIIIlIllIlI = var5;
            }
         }
      } else if (this.lIIIIllIIlIlIllIIIlIllIlI > 0) {
         if ((float)this.lIIIIllIIlIlIllIIIlIllIlI - var6 < 0.0F) {
            this.lIIIIllIIlIlIllIIIlIllIlI = 0;
         } else {
            this.lIIIIllIIlIlIllIIIlIllIlI = (int)((float)this.lIIIIllIIlIlIllIIIlIllIlI - var6);
         }
      }

      if (this.lIIIIllIIlIlIllIIIlIllIlI > 0) {
         float var7 = (float)this.lIIIIllIIlIlIllIIIlIllIlI / (float)var5 * (float)100;
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)((int)((float)this.IIIIllIIllIIIIllIllIIIlIl + ((float)this.IIIllIllIlIlllllllIlIlIII - (float)this.IIIllIllIlIlllllllIlIlIII * var7 / (float)100))), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), this.lIIIIlIIllIIlIIlIIIlIIllI);
      }

      GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.4666667F * 0.23863636F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlllIllIlIIIIlIIlIIllIIIl, 2.2F * 1.1363636F, (float)(this.IIIIllIlIIIllIlllIlllllIl + 6), (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)6);
      cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI("CheatBreaker Settings".toUpperCase(), (float)this.IIIIllIlIIIllIlllIlllllIl + (float)14, (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)3, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -818991313);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
   }
}
