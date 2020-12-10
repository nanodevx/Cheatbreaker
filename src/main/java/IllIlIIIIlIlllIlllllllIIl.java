import org.lwjgl.opengl.GL11;

public class IllIlIIIIlIlllIlllllllIIl extends IlIIlllIlIIIlIIIlIlIlIlIl {
   private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private IIllIIlIllIIlllIlIllIIIlI IllIIIIIIIlIlIllllIIllIII = new IIllIIlIllIIlllIlIllIIIlI("client/icons/left.png");
   private IIllIIlIllIIlllIlIllIIIlI lIIIIllIIlIlIllIIIlIllIlI = new IIllIIlIllIIlllIlIllIIIlI("client/icons/right.png");
   private int IlllIllIlIIIIlIIlIIllIIIl = 0;
   private float IlIlllIIIIllIllllIllIIlIl = 0.0F;
   private String llIIlllIIIIlllIllIlIlllIl;

   public IllIlIIIIlIlllIlllllllIIl(lIIlIlllIIIIlIIIllIlIIIII var1, float var2) {
      super(var2);
      this.lIIIIlIIllIIlIIlIIIlIIllI = var1;
      this.IIIllIllIlIlllllllIlIlIII = 12;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
      boolean var4 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 10) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var5 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 10), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : !var5 && !var4 ? -1895825408 : -1090519040);
      if (this.IlllIllIlIIIIlIIlIIllIIIl == 0) {
    	  cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() ? "ON" : "OFF", (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
      } else {
         boolean var6 = this.IlllIllIlIIIIlIIlIIllIIIl == 1;
         float var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) - (var6 ? -this.IlIlllIIIIllIllllIllIIlIl : this.IlIlllIIIIllIllllIllIIlIl);
         cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(this.llIIlllIIIIlllIllIlIlllIl, var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
         if (var6) {
        	 cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() ? "ON" : "OFF", (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 98) + this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
         } else {
        	 cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl((Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() ? "ON" : "OFF", (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 2) - this.IlIlllIIIIllIllllIllIIlIl, (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : -1895825408);
         }

         if (this.IlIlllIIIIllIllllIllIIlIl >= (float)50) {
            this.IlllIllIlIIIIlIIlIIllIIIl = 0;
            this.IlIlllIIIIllIllllIllIIlIl = 0.0F;
         } else {
            float var7 = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI((float)50 + this.IlIlllIIIIllIllllIllIIlIl * (float)15);
            if (this.IlIlllIIIIllIllllIllIIlIl + var7 >= (float)50) {
               this.IlIlllIIIIllIllllIllIIlIl = (float)50;
            } else {
               this.IlIlllIIIIllIllllIllIIlIl += var7;
            }
         }

         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 130), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 72), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -723724);
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 22), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl + 4), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 12), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -723724);
      }

      GL11.glColor4f(
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F,
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F, 
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F, 
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? var5 ? (0.82580644f * 0.86875f) : (1.0F) : var5 ? 0.74000007F * 1.081081F : 0.288F * 1.5625F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIIIIIIIlIlIllllIIllIII, (float)4, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 82), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3));
      GL11.glColor4f(((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F,
    		  (cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F,
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 1.0F : 0.0F, 
    		  ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? var4 ? (0.82580644f * 0.86875f) : (1.0F) : var4 ? 0.4244898F * 1.8846154F : 0.64285713F * 0.7F);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIllIIlIlIllIIIlIllIlI, (float)4, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 22), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 3));
   }

   @SuppressWarnings("static-access")
public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      boolean var4 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 10) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      boolean var5 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 48) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + 10 + this.IlllIIIlIlllIllIlIIlllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      if ((var5 || var4) && this.IlllIllIlIIIIlIIlIIllIIIl == 0) {
         if (var5) {
            this.IlllIllIlIIIIlIIlIIllIIIl = 1;
         } else {
            this.IlllIllIlIIIIlIIlIIllIIIl = 2;
         }

         this.IlIlllIIIIllIllllIllIIlIl = 0.0F;
         this.llIIlllIIIIlllIllIlIlllIl = (Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl() ? "ON" : "OFF";
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl(!(Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl());
         if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI) {
        	 cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
         } else if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().llIlIIIllIIIIlllIlIIIIIlI && !(Boolean)cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().llIlIIIllIIIIlllIlIIIIIlI.IIIIllIlIIIllIlllIlllllIl()) {
        	 cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI(false);
         }
      }

   }
}
