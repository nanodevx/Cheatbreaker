import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class llllIIlIlIllIllllIIIIllll extends lllIllIllIlIllIlIIllllIIl {
   private List lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList();
   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;

   public llllIIlIlIllIllllIIIIllll(float var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      Iterator var6 = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIlIIllIIlIIlIIIlIIllI.iterator();

      while(var6.hasNext()) {
         IlIIIIlllIIIlIIllllIIIlll var7 = (IlIIIIlllIIIlIIllllIIIlll)var6.next();
         if (var7 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IlIlllIIIIllIllllIllIIlIl) {
            IIIllllIlIIlIIIlIlIlllIII var8 = new IIIllllIlIIlIIIlIlIlllIII(this, var7, var1);
            this.lIIIIlIIllIIlIIlIIIlIIllI.add(var8);
         }
      }

   }

   public boolean lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1) {
      return false;
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1) {
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)this.IIIIllIlIIIllIlllIlllllIl, (double)this.IIIIllIIllIIIIllIllIIIlIl, (double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (double)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + 2), (double)8, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -657931);
      this.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2);
      int var4 = 0;
      int var5 = 0;
      Iterator var6 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

      while(var6.hasNext()) {
         IIIllllIlIIlIIIlIlIlllIII var7 = (IIIllllIlIIlIIIlIlIlllIII)var6.next();
         var7.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
         var7.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4 + var4 * 120, this.IIIIllIIllIIIIllIllIIIlIl + 4 + var5 * 112, 116, 108);
         var7.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
         ++var4;
         if (var4 == 3) {
            ++var5;
            var4 = 0;
         }
      }

      this.IlllIllIlIIIIlIIlIIllIIIl = 4 + var5 * 112 + 112;
      this.IlllIIIlIlllIllIlIIlllIlI(var1, var2);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      Iterator var4 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

      while(var4.hasNext()) {
         IIIllllIlIIlIIIlIlIlllIII var5 = (IIIllllIlIIlIIIlIlIlllIII)var4.next();
         if (var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
         }
      }

   }
}
