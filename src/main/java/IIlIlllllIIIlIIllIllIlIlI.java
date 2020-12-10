import java.io.File;
import java.util.Collections;
import org.lwjgl.opengl.GL11;

public class IIlIlllllIIIlIIllIllIlIlI extends IlIIlllIlIIIlIIIlIlIlIlIl {
   private final int IllIIIIIIIlIlIllllIIllIII;
   public final IlIIlIIlIIlllIlIIIlIllIIl lIIIIlIIllIIlIIlIIIlIIllI;
   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private final lllIllIllIlIllIlIIllllIIl lIIIIllIIlIlIllIIIlIllIlI;
   private int IlllIllIlIIIIlIIlIIllIIIl = 0;
   private final IIllIIlIllIIlllIlIllIIIlI IlIlllIIIIllIllllIllIIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/delete-64.png");
   private final IIllIIlIllIIlllIlIllIIIlI llIIlllIIIIlllIllIlIlllIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/checkmark-64.png");
   private IIllIIlIllIIlllIlIllIIIlI lIIlIlIllIIlIIIlIIIlllIII = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");
   private IIllIIlIllIIlllIlIllIIIlI IIIlllIIIllIllIlIIIIIIlII = new IIllIIlIllIIlllIlIllIIIlI("client/icons/pencil-64.png");

   public IIlIlllllIIIlIIllIllIlIlI(lllIllIllIlIllIlIIllllIIl var1, int var2, IlIIlIIlIIlllIlIIIlIllIIl var3, float var4) {
      super(var4);
      this.lIIIIllIIlIlIllIIIlIllIlI = var1;
      this.IllIIIIIIIlIlIllllIIllIII = var2;
      this.lIIIIlIIllIIlIIlIIIlIIllI = var3;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      boolean var4 = var1 > this.IIIIllIlIIIllIlllIlllllIl + 12 && this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
      byte var5 = 75;
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 1), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
      float var6;
      if (var4) {
         if (this.IlllIllIlIIIIlIIlIIllIIIl < var5) {
            var6 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
            this.IlllIllIlIIIIlIIlIIllIIIl = (int)((float)this.IlllIllIlIIIIlIIlIIllIIIl + var6);
            if (this.IlllIllIlIIIIlIIlIIllIIIl > var5) {
               this.IlllIllIlIIIIlIIlIIllIIIl = var5;
            }
         }
      } else if (this.IlllIllIlIIIIlIIlIIllIIIl > 0) {
         var6 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)790);
         if ((float)this.IlllIllIlIIIIlIIlIIllIIIl - var6 < 0.0F) {
            this.IlllIllIlIIIIlIIlIIllIIIl = 0;
         } else {
            this.IlllIllIlIIIIlIIlIIllIIIl = (int)((float)this.IlllIllIlIIIIlIIlIIllIIIl - var6);
         }
      }

      if (this.IlllIllIlIIIIlIIlIIllIIIl > 0) {
         var6 = (float)this.IlllIllIlIIIIlIIlIIllIIIl / (float)var5 * (float)100;
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 12), (float)((int)((float)this.IIIIllIIllIIIIllIllIIIlIl + ((float)this.IIIllIllIlIlllllllIlIlIII - (float)this.IIIllIllIlIlllllllIlIlIII * var6 / (float)100))), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - (this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl() ? 0 : 30)), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), this.IllIIIIIIIlIlIllllIIllIII);
      }

      boolean var12 = (float)var1 > (float)this.IIIIllIlIIIllIlllIlllllIl * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 >= (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 <= (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var7 = (float)var1 > (float)this.IIIIllIlIIIllIlllIlllllIl * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.1919192F * 1.8236842F);
      float var8 = 6.571429F * 0.38043478F;
      boolean var9;
      boolean var10;
      if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl()) {
         var9 = false;
         var10 = false;
         IIlIlIlllIllIIlIllIIlIIlI var11 = (IIlIlIlllIllIIlIllIIlIIlI)this.lIIIIllIIlIlIllIIIlIllIlI;
         if (var11.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) != 0 && var11.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) > 1) {
            var9 = true;
            GL11.glPushMatrix();
            if (var12) {
               GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.14444444F * 4.5F);
            }

            GL11.glTranslatef((float)(this.IIIIllIlIIIllIlllIlllllIl + 6) - var8, (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)7, 0.0F);
            GL11.glRotatef((float)-90, 0.0F, 0.0F, 1.0F);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIlIlIllIIlIIIlIIIlllIII, var8, (float)-1, 0.0F);
            GL11.glPopMatrix();
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0952381F * 0.3195652F);
         }

         if (var11.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) != var11.lIIIIlIIllIIlIIlIIIlIIllI.size() - 1) {
            var10 = true;
            GL11.glPushMatrix();
            if (var7) {
               GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.2112676F * 0.5366279F);
            }

            GL11.glTranslatef((float)(this.IIIIllIlIIIllIlllIlllllIl + 6) + var8, (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)7, 0.0F);
            GL11.glRotatef((float)90, 0.0F, 0.0F, 1.0F);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIlIlIllIIlIIIlIIIlllIII, var8, 2.0F, 0.0F);
            GL11.glPopMatrix();
         }

         if (!var9 && !var10) {
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIlIlIllIIlIIIlIIIlllIII, 1.173913F * 2.1296296F, (float)(this.IIIIllIlIIIllIlllIlllllIl + 4), (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)6);
         }
      } else {
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIlIlIllIIlIIIlIIIlllIII, 6.6666665F * 0.375F, (float)(this.IIIIllIlIIIllIlllIlllllIl + 4), (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)6);
      }

      if (cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl == this.lIIIIlIIllIIlIIlIIIlIIllI) {
    	  cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().toUpperCase(), (float)this.IIIIllIlIIIllIlllIlllllIl + (float)16, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -818991313);
      } else {
    	  cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().toUpperCase(), (float)this.IIIIllIlIIIllIlllIlllllIl + (float)16, (float)this.IIIIllIIllIIIIllIllIIIlIl + 3.9545455F * 0.88505745F, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -818991313);
      }

      if (cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl == this.lIIIIlIIllIIlIIlIIIlIIllI) {
    	  cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(" (Active)", (float)this.IIIIllIlIIIllIlllIlllllIl + (float)17 + (float)cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().toUpperCase()), (float)this.IIIIllIIllIIIIllIllIIIlIl + (float)4, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : 1865363247);
      }

      if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl()) {
         var9 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 30) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 13) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
         if(cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark")) {
        	 GL11.glColor4f(var9 ? 0.0F : 1.0F, var9 ? 0.0F : 1.0F, var9 ? 0.48876402F * 1.0229886F : 1.0F, 1.0F);
         } else {
        	 GL11.glColor4f(var9 ? 0.0F : 1.1707317F * 0.21354167F, var9 ? 0.0F : 0.101648346F * 2.4594595F, var9 ? 0.48876402F * 1.0229886F : 0.5647059F * 0.4427083F, 0.5675676F * 1.145238F);
         }
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlllIIIllIllIlIIIIIIlII, (float)5, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 26), (float)this.IIIIllIIllIIIIllIllIIIlIl + 5.1916666F * 0.6741573F);
         var10 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 17) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
         if(cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark")) {
        	 GL11.glColor4f(var10 ? 1.4181818F * 0.5641026F : 1.0F, var10 ? 0.0F : 1.0F, var10 ? 0.0F : 1.0F, 1F);
         } else {
        	 GL11.glColor4f(var10 ? 1.4181818F * 0.5641026F : 0.96875F * 0.2580645F, var10 ? 0.0F : 0.17553192F * 1.4242424F, var10 ? 0.0F : 15.250001F * 0.016393442F, 0.44444445F * 1.4625F);
         }
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlllIIIIllIllllIllIIlIl, (float)5, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 13), (float)this.IIIIllIIllIIIIllIllIIIlIl + 0.7653061F * 4.5733333F);
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      boolean var4 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 17) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 2) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var5 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 30) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 13) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var6 = (float)var1 > (float)this.IIIIllIlIIIllIlllIlllllIl * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 >= (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 <= (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var7 = (float)var1 > (float)this.IIIIllIlIIIllIlllIlllllIl * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + 12) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      IIlIlIlllIllIIlIllIIlIIlI var8 = (IIlIlIlllIllIIlIllIIlIIlI)this.lIIIIllIIlIlIllIIIlIllIlI;
      if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl() && (var6 || var7)) {
         if (var6 && ((IIlIlIlllIllIIlIllIIlIIlI)this.lIIIIllIIlIlIllIIIlIllIlI).lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) != 0 && ((IIlIlIlllIllIIlIllIIlIIlI)this.lIIIIllIIlIlIllIIIlIllIlI).lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) > 1) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI = var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) - 1;
            ((IIlIlllllIIIlIIllIllIlIlI)var8.lIIIIlIIllIIlIIlIIIlIIllI.get(var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) - 1)).lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI = var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this);
            Collections.swap(var8.lIIIIlIIllIIlIIlIIIlIIllI, var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this), var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) - 1);
         }

         if (var7 && var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) != var8.lIIIIlIIllIIlIIlIIIlIIllI.size() - 1) {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI = var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) + 1;
            ((IIlIlllllIIIlIIllIllIlIlI)var8.lIIIIlIIllIIlIIlIIIlIIllI.get(var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) + 1)).lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI = var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this);
            Collections.swap(var8.lIIIIlIIllIIlIIlIIIlIIllI, var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this), var8.lIIIIlIIllIIlIIlIIIlIIllI.indexOf(this) + 1);
         }
      } else if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl() && var4) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         if (cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl == this.lIIIIlIIllIIlIIlIIIlIIllI) {
        	 cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl = (IlIIlIIlIIlllIlIIIlIllIIl)cb.IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.get(0);
        	 cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI());
        	 cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
         }

         if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl()) {
            File var10 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles");
            File var9;
            if (!var10.exists() && !var10.mkdirs()) {
               var9 = null;
            } else {
               var9 = new File(var10 + File.separator + this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().toLowerCase() + ".cfg");
            }

            if (var9.exists() && var9.delete()) {
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.removeIf((var1x) -> {
                  return var1x == this.lIIIIlIIllIIlIIlIIIlIIllI;
               });
               var8.lIIIIlIIllIIlIIlIIIlIIllI.removeIf((var1x) -> {
                  return var1x == this;
               });
            }
         }
      } else if (!this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl() && var5) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(new llIIIlIlIIlIlIIlIllIllIll(this.lIIIIlIIllIIlIIlIIIlIIllI, lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI, (IIlIlIlllIllIIlIllIIlIIlI)this.lIIIIllIIlIlIllIIIlIllIlI, this.IllIIIIIIIlIlIllllIIllIII, this.lIIIIIIIIIlIllIIllIlIIlIl));
      } else if (cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl != this.lIIIIlIIllIIlIIlIIIlIIllI) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI());
         cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl = this.lIIIIlIIllIIlIIlIIIlIIllI;
         cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI());
         cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
      }

   }
}
