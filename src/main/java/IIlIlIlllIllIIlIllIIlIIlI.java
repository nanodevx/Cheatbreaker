import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class IIlIlIlllIllIIlIllIIlIIlI extends lllIllIllIlIllIlIIllllIIl {
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private final int IIIlllIIIllIllIlIIIIIIlII = -12418828;
   public final List<IIlIlllllIIIlIIllIllIlIlI> lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList();
   private final IIllIIlIllIIlllIlIllIIIlI llIlIIIlIIIIlIlllIlIIIIll = new IIllIIlIllIIlllIlIllIIIlI("client/icons/plus-64.png");

   public IIlIlIlllIllIIlIllIIlIIlI(float var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.lIIIIIIIIIlIllIIllIlIIlIl();
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl, this.IIIIllIIllIIIIllIllIIIlIl, this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl, this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + 2, (double)8, cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -657931);
      this.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2);
      this.IlllIllIlIIIIlIIlIIllIIIl = 15;

      for(int var4 = 0; var4 < this.lIIIIlIIllIIlIIlIIIlIIllI.size(); ++var4) {
         IIlIlllllIIIlIIllIllIlIlI var5 = this.lIIIIlIIllIIlIIlIIIlIIllI.get(var4);
         var5.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + 4 + var4 * 18, this.IlIlIIIlllIIIlIlllIlIllIl - 12, 18);
         var5.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
         var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
         this.IlllIllIlIIIIlIIlIIllIIIl += var5.lIIIIlIIllIIlIIlIIIlIIllI();
      }

      boolean var6 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 6) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl - 10 + this.lIIIIllIIlIlIllIIIlIllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl + 3 + this.lIIIIllIIlIlIllIIIlIllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      GL11.glColor4f(var6 ? 0.0F : 0.22590362F * 1.1066667F, var6 ? 1.4117647F * 0.56666666F : 1.3333334F * 0.1875F, var6 ? 0.0F : 0.14423077F * 1.7333333F, 1.7058823F * 0.38103446F);
      if(((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark")) {
    	  GL11.glColor4f(var6 ? 0.0F : 1.0F, var6 ? 1.4117647F * 0.56666666F : 1.0F, var6 ? 0.0F : 1.0F, 1.0F);
      } else {
    	  GL11.glColor4f(var6 ? 0.0F : 0.22590362F * 1.1066667F, var6 ? 1.4117647F * 0.56666666F : 1.3333334F * 0.1875F, var6 ? 0.0F : 0.14423077F * 1.7333333F, 1.7058823F * 0.38103446F);
      }
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.llIlIIIlIIIIlIlllIlIIIIll, 3.4435484F * 1.0163934F, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 15), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl) - 0.6506024F * 9.990741F);
      String var7 = (var6 ? "(COPIES CURRENT PROFILE) " : "") + "ADD NEW PROFILE";
      cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var7, (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 17 - cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var7)), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl) - 64.28571F * 0.11666667F, var6 ? 2130738944 : ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : 2130706432);
      this.IlllIllIlIIIIlIIlIIllIIIl += 10;
      this.IlllIIIlIlllIllIlIIlllIlI(var1, var2);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      Iterator var4 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

      while(var4.hasNext()) {
         IIlIlllllIIIlIIllIllIlIlI var5 = (IIlIlllllIIIlIIllIllIlIlI)var4.next();
         if (var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
            return;
         }
      }

      boolean var6 = (float)var1 > (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 92) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var1 < (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 6) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 > (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl - 20 + this.lIIIIllIIlIlIllIIIlIllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl && (float)var2 < (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl - 7 + this.lIIIIllIIlIlIllIIIlIllIlI) * this.lIIIIIIIIIlIllIIllIlIIlIl;
      if (var6) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(new llIIIlIlIIlIlIIlIllIllIll(lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI, this, this.IIIlllIIIllIllIlIIIIIIlII, this.lIIIIIIIIIlIllIIllIlIIlIl));
      }

   }

   public boolean lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1) {
      return true;
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1) {
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl() {
      (new Thread(() -> {
         this.lIIIIlIIllIIlIIlIIIlIIllI.clear();
         File var1 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles");
         if (var1.exists()) {
            File[] var2 = var1.listFiles();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               File var5 = var2[var4];
               if (var5.getName().endsWith(".cfg")) {
                  IlIIlIIlIIlllIlIIIlIllIIl var6 = null;
                  Iterator var7 = cb.IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.iterator();

                  while(var7.hasNext()) {
                     IlIIlIIlIIlllIlIIIlIllIIl var8 = (IlIIlIIlIIlllIlIIIlIllIIl)var7.next();
                     if (var5.getName().equals(var8.lIIIIlIIllIIlIIlIIIlIIllI() + ".cfg")) {
                        var6 = var8;
                     }
                  }

                  if (var6 == null) {
                	  cb.IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.add(new IlIIlIIlIIlllIlIIIlIllIIl(var5.getName().replace(".cfg", ""), false));
                  }
               }
            }
         }

         Iterator var9 = cb.IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.iterator();

         while(var9.hasNext()) {
            IlIIlIIlIIlllIlIIIlIllIIl var10 = (IlIIlIIlIIlllIlIIIlIllIIl)var9.next();
            this.lIIIIlIIllIIlIIlIIIlIIllI.add(new IIlIlllllIIIlIIllIllIlIlI(this, this.IIIlllIIIllIllIlIIIIIIlII, var10, this.lIIIIIIIIIlIllIIllIlIIlIl));
         }

         this.lIIIIlIIllIIlIIlIIIlIIllI.sort((var0, var1x) -> {
            if (var0.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().toLowerCase().equalsIgnoreCase("default")) {
               return 0;
            } else {
               return var0.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI < var1x.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI ? -1 : 1;
            }
         });
      })).start();
   }
}
