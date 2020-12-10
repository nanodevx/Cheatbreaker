import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class lllIllIllIlIllIlIIllllIIl extends IlIIlllIlIIIlIIIlIlIlIlIl {
   protected double IllIIIIIIIlIlIllllIIllIII = 0.0D;
   public int lIIIIllIIlIlIllIIIlIllIlI = 0;
   protected int IlllIllIlIIIIlIIlIIllIIIl = 0;
   public int IlIlllIIIIllIllllIllIIlIl;
   protected int llIIlllIIIIlllIllIlIlllIl;
   public boolean lIIlIlIllIIlIIIlIIIlllIII = false;
   private boolean lIIIIlIIllIIlIIlIIIlIIllI = false;
   private float IIIlllIIIllIllIlIIIIIIlII;

   public lllIllIllIlIllIlIIllllIIl(float var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.IlIlllIIIIllIllllIllIIlIl = var2;
      this.llIIlllIIIIlllIllIlIlllIl = var3;
      this.IIIIllIlIIIllIlllIlllllIl = var2;
      this.IIIIllIIllIIIIllIllIIIlIl = var3;
      this.IlIlIIIlllIIIlIlllIlIllIl = var4;
      this.IIIllIllIlIlllllllIlIlIII = var5;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(int var1, int var2) {
      if (this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         double var3 = (double)Math.round(this.IllIIIIIIIlIlIllllIIllIII / (double)25);
         this.IllIIIIIIIlIlIllllIIllIII -= var3;
         if (this.IllIIIIIIIlIlIllllIIllIII != 0.0D) {
            this.lIIIIllIIlIlIllIIIlIllIlI = (int)((double)this.lIIIIllIIlIlIllIIIlIllIlI + var3);
         }
      } else {
         this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
      }

      if (this.lIIlIlIllIIlIIIlIIIlllIII) {
         if (this.lIIIIllIIlIlIllIIIlIllIlI < -this.IlllIllIlIIIIlIIlIIllIIIl + this.IIIllIllIlIlllllllIlIlIII) {
            this.lIIIIllIIlIlIllIIIlIllIlI = -this.IlllIllIlIIIIlIIlIIllIIIl + this.IIIllIllIlIlllllllIlIlIII;
            this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
         }

         if (this.lIIIIllIIlIlIllIIIlIllIlI > 0) {
            this.lIIIIllIIlIlIllIIIlIllIlI = 0;
            this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
         }
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)this.lIIIIllIIlIlIllIIIlIllIlI, 0.0F);
   }

   public void IlllIIIlIlllIllIlIIlllIlI(int var1, int var2) {
      this.lIIlIlIllIIlIIIlIIIlllIII = true;
      GL11.glPopMatrix();
      boolean var3 = this.IlllIllIlIIIIlIIlIIllIIIl > this.IIIllIllIlIlllllllIlIlIII;
      if (this.lIIIIlIIllIIlIIlIIIlIIllI && (!Mouse.isButtonDown(0) || !this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2))) {
         this.lIIIIlIIllIIlIIlIIIlIIllI = false;
      }

      double var4 = (double)(this.IIIllIllIlIlllllllIlIlIII - 10);
      double var6 = (double)this.IlllIllIlIIIIlIIlIIllIIIl;
      double var8 = var4 / var6 * (double)100;
      double var10 = var4 / (double)100 * var8;
      double var12 = (double)this.lIIIIllIIlIlIllIIIlIllIlI / (double)100 * var8;
      if (var3) {
         int var14 = this.IIIllIllIlIlllllllIlIlIII;
         boolean var15 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 9) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 3) * this.lIIIIIIIIIlIllIIllIlIIlIl && (double)var2 > ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl && (double)var2 < ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 8) + var10 - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl;
         boolean var16 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 9) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 3) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + 11) * this.lIIIIIIIIIlIllIIllIlIIlIl && (double)var2 < ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 6) + var4 - (double)3) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl;
         if (Mouse.isButtonDown(0) && !this.lIIIIlIIllIIlIIlIIIlIIllI && var16) {
            this.lIIIIlIIllIIlIIlIIIlIIllI = true;
         }

         if (this.lIIIIlIIllIIlIIlIIIlIIllI) {
            if ((float)this.lIIIIllIIlIlIllIIIlIllIlI != this.IIIlllIIIllIllIlIIIIIIlII && (double)this.IIIlllIIIllIllIlIIIIIIlII != var10 / (double)2 && (double)this.IIIlllIIIllIllIlIIIIIIlII != var10 / (double)2 + (double)(-this.IlllIllIlIIIIlIIlIIllIIIl) + (double)var14) {
               if ((double)var2 > ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) + var10 - var10 / (double)4 - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl) {
                  this.lIIIIllIIlIlIllIIIlIllIlI = (int)((double)this.lIIIIllIIlIlIllIIIlIllIlI - var6 / (double)7);
               } else if ((double)var2 < ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) + var10 / (double)4 - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl) {
                  this.lIIIIllIIlIlIllIIIlIllIlI = (int)((double)this.lIIIIllIIlIlIllIIIlIllIlI + var6 / (double)7);
               }

               this.IIIlllIIIllIllIlIIIIIIlII = (float)this.lIIIIllIIlIlIllIIIlIllIlI;
            } else if ((double)var2 > ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) + var10 - var10 / (double)4 - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl || (double)var2 < ((double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) + var10 / (double)4 - var12) * (double)this.lIIIIIIIIIlIllIIllIlIIlIl) {
               this.IIIlllIIIllIllIlIIIIIIlII = 1.0F;
            }
         }

         if (this.lIIIIllIIlIlIllIIIlIllIlI < -this.IlllIllIlIIIIlIIlIIllIIIl + var14) {
            this.lIIIIllIIlIlIllIIIlIllIlI = -this.IlllIllIlIIIIlIIlIIllIIIl + var14;
            this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
         }

         if (this.lIIIIllIIlIlIllIIIlIllIlI > 0) {
            this.lIIIIllIIlIlIllIIIlIllIlI = 0;
            this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
         }

         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 6), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 11), (double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 4), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 6) + var4 - (double)3, (double)2, var16 && !var15 ? 1862270976 : 1056964608);
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 7), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 11) - var12, (double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 3), (double)(this.IIIIllIIllIIIIllIllIIIlIl + 8) + var10 - var12, (double)4, !var15 && !this.lIIIIlIIllIIlIIlIIIlIIllI ? -12418828 : -16629505);
      }

      if (!var3 && this.lIIIIllIIlIlIllIIIlIllIlI != 0) {
         this.lIIIIllIIlIlIllIIIlIllIlI = 0;
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1) {
      if (var1 != 0 && this.IlllIllIlIIIIlIIlIIllIIIl >= this.IIIllIllIlIlllllllIlIlIII) {
         this.IllIIIIIIIlIlIllllIIllIII += (double)(var1 / 2);
      }

   }

   public abstract boolean lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1);

   public abstract void lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1);
}
