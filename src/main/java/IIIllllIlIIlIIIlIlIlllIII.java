import java.util.Iterator;
import java.util.Objects;
import org.lwjgl.opengl.GL11;

public class IIIllllIlIIlIIIlIlIlllIII extends IlIIlllIlIIIlIIIlIlIlIlIl {
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private IlIIIIlllIIIlIIllllIIIlll lIIIIlIIllIIlIIlIIIlIIllI;
   private llllIIIIIlIlIlIlIllIIIIII IllIIIIIIIlIlIllllIIllIII;
   private llllIIIIIlIlIlIlIllIIIIII lIIIIllIIlIlIllIIIlIllIlI;
   private llllIIIIIlIlIlIlIllIIIIII IlllIllIlIIIIlIIlIIllIIIl;
   private lllIllIllIlIllIlIIllllIIl IlIlllIIIIllIllllIllIIlIl;

   public IIIllllIlIIlIIIlIlIlllIII(lllIllIllIlIllIlIIllllIIl var1, IlIIIIlllIIIlIIllllIIIlll var2, float var3) {
      super(var3);
      this.lIIIIlIIllIIlIIlIIIlIIllI = var2;
      this.IlIlllIIIIllIllllIllIIlIl = var1;
      lIlIllIlIlIIIllllIlIllIll var4 = cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl;
      lIlIllIlIlIIIllllIlIllIll var5 = cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII;
      this.IllIIIIIIIlIlIllllIIllIII = new llllIIIIIlIlIlIlIllIIIIII(var4, (lllIllIllIlIllIlIIllllIIl)null, "Options", this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 20, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 6, -12418828, var3);
      this.lIIIIllIIlIlIllIIIlIllIlI = new llllIIIIIlIlIlIlIllIIIIII(var5, (lllIllIllIlIllIlIIllllIIl)null, var2.llIlIIIlIIIIlIlllIlIIIIll() == null ? (var2.IIIlllIIIllIllIlIIIIIIlII() ? "Disable" : "Enable") : (var2.IIIlllIIIllIllIlIIIIIIlII() ? "Hide from HUD" : "Add to HUD"), this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 2, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 24, var2.IIIlllIIIllIllIlIIIIIIlII() ? -5756117 : -13916106, var3);
      this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var2 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl && var2 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IlIlllIIIIllIllllIllIIlIl);
      this.IlllIllIlIIIIlIIlIIllIIIl = new llllIIIIIlIlIlIlIllIIIIII(var5, (lllIllIllIlIllIlIIllllIIl)null, var2.IlIlIIIlllIIIlIlllIlIllIl() ? "Disable" : "Enable", this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2 + 2, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 24, var2.IlIlIIIlllIIIlIlllIlIllIl() ? -5756117 : -13916106, var3);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      if (this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl()) {
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)this.IIIIllIIllIIIIllIllIIIlIl, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), -13916106);
      } else {
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIllIlIIIllIlllIlllllIl, (float)this.IIIIllIIllIIIIllIllIIIlIl, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : -1347374928);
      }

      lIlIllIlIlIIIllllIlIllIll var4 = cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl;
      GL11.glPushMatrix();
      byte var5 = 0;
      byte var6 = 0;
      String var7;
      int godLol;
      float var8;
      int var17;
      float var10002;
      if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIllIllIlIlllllllIlIlIII) {
         var5 = -10;
         var7 = "329/329";
         var8 = (float)lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var7);
         var10002 = (float)((int)((float)(this.IIIIllIlIIIllIlllIlllllIl + 1 + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - var8 / 2.0F));
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var7, var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 18), -1);
      } else if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IlIlIIIlllIIIlIlllIlIllIl) {
         var6 = -30;
         var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + 8 + this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 20);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI("Speed II", var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 36), -1);
         var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + 8 + this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 20);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI("0:42", var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 26), -1);
      } else if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIllIIlIlIllIIIlIllIlI) {
         IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 20), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 44), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 20), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 6), 1862270976);
         var17 = this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2;
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI("Score", var17, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 40, -1);
         var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + 24);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI("Steve", var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 28), -1);
         var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + 24);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI("Alex", var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 18), -1);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "0", this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 26, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 18, -1);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "1", this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 26, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 28, -1);
      }

      if (this.lIIIIlIIllIIlIIlIIIlIIllI == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IlllIllIlIIIIlIIlIIllIIIl) {
         llIlllIIllIlllIlIlIlIIIll var14 = new llIlllIIllIlllIlIlIlIIIll("EnderPearl", 368, 9000L);
         var10002 = (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 18);
         var14.lIIIIlIIllIIlIIlIIIlIIllI(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI, var10002, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 26 - 18), -1);
      } else if ((this.lIIIIlIIllIIlIIlIIIlIIllI.lllIIIIIlIllIlIIIllllllII() == null || this.lIIIIlIIllIIlIIlIIIlIIllI.lllIIIIIlIllIlIIIllllllII() == IlIllIllllIIIlIIIllIIIllI.lIIIIlIIllIIlIIlIIIlIIllI) && this.lIIIIlIIllIIlIIlIIIlIIllI != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIllIIlIlIllIIIlIllIlI) {
         var7 = "";
         if (this.lIIIIlIIllIIlIIlIIIlIIllI.lllIIIIIlIllIlIIIllllllII() == null) {
            var8 = 2.0F;
            String[] var9 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIllIllIlIlllllllIlIlIII().split(" ");
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               String var12 = var9[var11];
               String var13 = var12.substring(0, 1);
               var7 = var7 + (Objects.equals(var7, "") ? var13 : var13.toLowerCase());
            }
         } else {
            var8 = this.lIIIIlIIllIIlIIlIIIlIIllI.lIIlIIllIIIIIlIllIIIIllII();
            var7 = this.lIIIIlIIllIIlIIlIIIlIIllI.IlIIlIIIIlIIIIllllIIlIllI();
         }
         GL11.glScalef(var8, var8, var8);
         float var16 = (float)lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var7) * var8;
         if (this.lIIIIlIIllIIlIIlIIIlIIllI.lllIIIIIlIllIlIIIllllllII() == null) {
            var17 = (int)(((float)(this.IIIIllIlIIIllIlllIlllllIl + 1 + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - var16 / 2.0F) / var8);
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var7, var17, (int)((float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 32) / var8), -13750738);
         } else {
            var10002 = (float)((int)(((float)(this.IIIIllIlIIIllIlllIlllllIl + 1 + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - var16 / 2.0F) / var8));
            float var10003 = (float)((int)((float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 32) / var8));
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var7, var10002, var10003, -1);
         }
      } else if (this.lIIIIlIIllIIlIIlIIIlIIllI.lllIIIIIlIllIlIIIllllllII() == IlIllIllllIIIlIIIllIIIllI.lIIIIIIIIIlIllIIllIlIIlIl) {
         float var15 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIIIlIlIlIllllllIlllIlI();
         var8 = this.lIIIIlIIllIIlIIlIIIlIIllI.IllIllIIIlIIlllIIIllIllII();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIllllIIIIlIlIIIIlIlI(), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - var15 / 2.0F + (float)var6, (float)(this.IIIIllIIllIIIIllIllIIIlIl + var5 + this.IIIllIllIlIlllllllIlIlIII / 2 - 26) - var8 / 2.0F, var15, var8);
      }

      GL11.glPopMatrix();
      var4.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIllIllIlIlllllllIlIlIII(), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - 1.0681819F * 0.46808508F, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 4 + 1), 1593835520);
      var4.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIllIllIlIlllllllIlIlIII(), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2) - 1.125F * 1.3333334F, (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII / 2 - 4), -1);
      this.IlllIllIlIIIIlIIlIIllIIIl.IllIIIIIIIlIlIllllIIllIII = this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Disable" : "Enable";
      this.IlllIllIlIIIIlIIlIIllIIIl.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
      this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? -5756117 : -13916106;
      this.lIIIIllIIlIlIllIIIlIllIlI.IllIIIIIIIlIlIllllIIllIII = this.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() == null ? (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Disable" : "Enable") : (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Hide from HUD" : "Add to HUD");
      this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? -5756117 : -13916106;
      this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 20, this.IlIlIIIlllIIIlIlllIlIllIl - 8, 16);
      this.IllIIIIIIIlIlIllllIIllIII.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
      this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38, this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll ? this.IlIlIIIlllIIIlIlllIlIllIl - 8 : this.IlIlIIIlllIIIlIlllIlIllIl / 2 + 2, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 24 - (this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38));
      this.lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI = this.IlllIIIlIlllIllIlIIlllIlI;
      this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      if (!this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll) {
         this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2 + 8, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38, this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 12, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 24 - (this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 38));
         this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      if (this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         ((lIlIIllIIIlllIIllIIlIIllI)lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl).llIlIIIlIIIIlIlllIlIIIIll = false;
         ((lIlIIllIIIlllIIllIIlIIllI)lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl).IIIlllIIIllIllIlIIIIIIlII = this.IlIlllIIIIllIllllIllIIlIl;
         ((lIlIIllIIIlllIIllIIlIIllI)lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl).IIIlIIllllIIllllllIlIIIll = this.lIIIIlIIllIIlIIlIIIlIIllI;
         lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl = lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl;
      } else if (!this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll && this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(!this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl());
         this.IlllIllIlIIIIlIIlIIllIIIl.IllIIIIIIIlIlIllllIIllIII = this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Disable" : "Enable";
         this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? -5756117 : -13916106;
         if (this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl()) {
            this.lIIIIIIIIIlIllIIllIlIIlIl();
            this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(true);
         }
      } else if (this.lIIIIllIIlIlIllIIIlIllIlI.IlllIllIlIIIIlIIlIIllIIIl && this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         if (!this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl()) {
            this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl(true);
            this.lIIIIIIIIIlIllIIllIlIIlIl();
            if (this.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() == null) {
               this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(true);
            } else {
               lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlllllIIlIlIIIllllllIII(lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIlIIllIIlIIlIIIlIIllI));
            }
         } else {
            this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl(!this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII());
            if (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII()) {
               this.lIIIIIIIIIlIllIIllIlIIlIl();
               if (this.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() == null) {
                  this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(true);
               } else {
                  lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlllllIIlIlIIIllllllIII(lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIlIIllIIlIIlIIIlIIllI));
               }
            } else if (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl()) {
               this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(false);
            }
         }

         this.lIIIIllIIlIlIllIIIlIllIlI.IllIIIIIIIlIlIllllIIllIII = this.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() == null ? (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Disable" : "Enable") : (this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? "Hide from HUD" : "Add to HUD");
         this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII() && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() ? -5756117 : -13916106;
      }

   }

   private void lIIIIIIIIIlIllIIllIlIIlIl() {
      if (this.lIIIIlIIllIIlIIlIIIlIIllI != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().llIIlllIIIIlllIllIlIlllIl) {
         Iterator var1 = this.lIIIIlIIllIIlIIlIIIlIIllI.llIIlllIIIIlllIllIlIlllIl().iterator();

         while(var1.hasNext()) {
            lIIlIlllIIIIlIIIllIlIIIII var2 = (lIIlIlllIIIIlIIIllIlIIIII)var1.next();
            if (var2.IlllIllIlIIIIlIIlIIllIIIl() == llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl && var2.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("color") && !var2.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("background") && !var2.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("pressed")) {
               lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
               var2.lIIIIIIIIIlIllIIllIlIIlIl(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIllIlIllIlIllIIlIllIlIII.IIIIllIlIIIllIlllIlllllIl());
            }
         }

      }
   }
}
