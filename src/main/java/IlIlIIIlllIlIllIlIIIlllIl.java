import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class IlIlIIIlllIlIllIlIIIlllIl extends IlIIlllIlIIIlIIIlIlIlIlIl {
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
   private float IllIIIIIIIlIlIllllIIllIII = (float)-1;
   private float lIIIIllIIlIlIllIIIlIllIlI;
   private boolean IlllIllIlIIIIlIIlIIllIIIl = false;

   public IlIlIIIlllIlIllIlIIIlllIl(lIIlIlllIIIIlIIIllIlIIIII var1, float var2) {
      super(var2);
      this.lIIIIlIIllIIlIIlIIIlIIllI = var1;
      this.IIIllIllIlIlllllllIlIlIII = 14;
      this.IllIIIIIIIlIlIllllIIllIII = Float.parseFloat("" + var1.IIIIllIlIIIllIlllIlllllIl());
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      short var4 = 170;
      boolean var5 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + 170) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 170 + var4 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      if (var3 == 0 && var5) {
         this.IlllIllIlIIIIlIIlIIllIIIl = true;
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
      short var4 = 148;
      cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
      if (this.IlllIllIlIIIIlIIlIIllIIIl && !Mouse.isButtonDown(0)) {
         this.IlllIllIlIIIIlIIlIIllIIIl = false;
      }

      String var5 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + "";
      float var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + 154);
      float var10003 = (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var5, var10002, var10003, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
      boolean var6 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + 172) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 172 + var4 - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)(this.IIIIllIlIIIllIlllIlllllIl + 174), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 6), (double)(this.IIIIllIlIIIllIlllIlllllIl + 170 + var4 - 4), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 8), 1.0D, var6 ? -1895825408 : 1862270976);
      double var7 = (double)(var4 - 18);
      float var9 = Float.parseFloat("" + this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl());
      float var10 = Float.parseFloat("" + this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIIIlIlllIllIlIIlllIlI());
      if (this.IlllIllIlIIIIlIIlIIllIIIl) {
         this.lIIIIllIIlIlIllIIIlIllIlI = (float)Math.round(((double)var9 + (double)((float)var1 - (float)(this.IIIIllIlIIIllIlllIlllllIl + 180) * this.lIIIIIIIIIlIllIIllIlIIlIl) * ((double)(var10 - var9) / (var7 * (double)this.lIIIIIIIIIlIllIIllIlIIlIl))) * (double)100) / (float)100;
         if (this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl().equals(llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl)) {
            this.lIIIIllIIlIlIllIIIlIllIlI = (float)Math.round(this.lIIIIllIIlIlIllIIIlIllIlI);
         }

         if (this.lIIIIllIIlIlIllIIIlIllIlI < var9) {
            this.lIIIIllIIlIlIllIIIlIllIlI = var9;
         } else if (this.lIIIIllIIlIlIllIIIlIllIlI > var10) {
            this.lIIIIllIIlIlIllIIIlIllIlI = var10;
         }

         switch(llIIlllIlIIlIIIIIlIllllll.lIIIIlIIllIIlIIlIIIlIIllI[this.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl().ordinal()]) {
         case 1:
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Integer.parseInt((int)this.lIIIIllIIlIlIllIIIlIllIlI + ""));
            break;
         case 2:
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIllIIlIlIllIIIlIllIlI);
            break;
         case 3:
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(Double.parseDouble(this.lIIIIllIIlIlIllIIIlIllIlI + ""));
         }

         if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl) {
         }

         cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
      }

      float var11 = Float.parseFloat(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + "");
      if (var11 < this.IllIIIIIIIlIlIllllIIllIII) {
         var11 = this.IllIIIIIIIlIlIllllIIllIII - var11;
      } else {
         var11 -= this.IllIIIIIIIlIlIllllIIllIII;
      }

      float var12 = ((var10 - var9) / (float)20 + var11 * (float)8) / (float)(lIIIllIllIllIlllIlIIlIlII.IIIlIIlIlIIIlllIIlIllllll + 1);
      if ((double)var12 < 43.5D * 2.2988505747126437E-6D) {
         var12 = 1.9523809F * 5.121951E-5F;
      }

      float var13 = Float.parseFloat(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() + "");
      if (this.IllIIIIIIIlIlIllllIIllIII < var13) {
         if (this.IllIIIIIIIlIlIllllIIllIII + var12 <= var13) {
            this.IllIIIIIIIlIlIllllIIllIII += var12;
         } else {
            this.IllIIIIIIIlIlIllllIIllIII = var13;
         }
      } else if (this.IllIIIIIIIlIlIllllIIllIII > var13) {
         if (this.IllIIIIIIIlIlIllllIIllIII - var12 >= var13) {
            this.IllIIIIIIIlIlIllllIIllIII -= var12;
         } else {
            this.IllIIIIIIIlIlIllllIIllIII = var13;
         }
      }

      double var14 = (double)((float)100 * ((this.IllIIIIIIIlIlIllllIIllIII - var9) / (var10 - var9)));
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)(this.IIIIllIlIIIllIlllIlllllIl + 174), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 6), (double)(this.IIIIllIlIIIllIlllIlllllIl + 180) + var7 * var14 / (double)100, (double)(this.IIIIllIIllIIIIllIllIIIlIl + 8), (double)4, -12418828);
      GL11.glColor4f(0.5714286F * 0.4375F, 0.45849055F * 0.9814815F, 1.0F, 1.0F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)this.IIIIllIlIIIllIlllIlllllIl + 543.75F * 0.33333334F) + var7 * var14 / (double)100, (double)((float)this.IIIIllIIllIIIIllIllIIIlIl + 0.6666667F * 10.875F), 2.531249981140718D * 1.7777777910232544D);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)this.IIIIllIlIIIllIlllIlllllIl + 0.8804348F * 205.8642F) + var7 * var14 / (double)100, (double)((float)this.IIIIllIIllIIIIllIllIIIlIl + 0.13043478F * 55.583332F), 2.639325754971479D * 1.0229885578155518D);
   }
}
