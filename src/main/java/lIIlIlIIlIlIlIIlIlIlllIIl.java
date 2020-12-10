import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// CheatBreaker Mod Menu.
@SuppressWarnings({"rawtypes", "unused", "unchecked", "static-access"})
public class lIIlIlIIlIlIlIIlIlIlllIIl extends llIIlIllIllllIlIllIlIlIII {
   private String helloPersonDecompilingOfflineCheatBreaker;
   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   public static lIIlIlIIlIlIlIIlIlIlllIIl lIIIIlIIllIIlIIlIIIlIIllI;
   private final IIllIIlIllIIlllIlIllIIIlI lIllIlIlllIIlIIllIIlIIlII = new IIllIIlIllIIlllIlIllIIIlI("client/icons/cog-64.png");
   private final IIllIIlIllIIlllIlIllIIIlI IIIlIIlIlIIIlllIIlIllllll = new IIllIIlIllIIlllIlIllIIIlI("client/icons/delete-64.png");
   private final IIllIIlIllIIlllIlIllIIIlI IllIlIIIIlllIIllIIlllIIlI = new IIllIIlIllIIlllIlIllIIIlI("client/logo_full_white.png");
   private final List<lIlIlIIIIllIlllIlIIlllIlI> IllIlIlIllllIlIIllllIIlll = new ArrayList();
   private final List<lllIllIllIlIllIlIIllllIIl> IllIIlIIlllllIllIIIlllIII = new ArrayList();
   private final List<llllIIIIIlIlIlIlIllIIIIII> lIlIlIllIIIIIIIIllllIIllI = new ArrayList();
   private List<IlIIIIlllIIIlIIllllIIIlll> IlllIIlllIIIIllIIllllIlIl;
   private llllIIIIIlIlIlIlIllIIIIII IllllIllllIlIIIlIIIllllll;
   public llllIIIIIlIlIlIlIllIIIIII lIIIIIIIIIlIllIIllIlIIlIl;
   @Deprecated
   protected lllIllIllIlIllIlIIllllIIl IlllIIIlIlllIllIlIIlllIlI;
   @Deprecated
   protected lllIllIllIlIllIlIIllllIIl IIIIllIlIIIllIlllIlllllIl;
   public lllIllIllIlIllIlIIllllIIl IIIIllIIllIIIIllIllIIIlIl;
   public lllIllIllIlIllIlIIllllIIl IlIlIIIlllIIIlIlllIlIllIl;
   protected lllIllIllIlIllIlIIllllIIl IIIllIllIlIlllllllIlIlIII;
   protected lllIllIllIlIllIlIIllllIIl IllIIIIIIIlIlIllllIIllIII;
   protected lllIllIllIlIllIlIIllllIIl lIIIIllIIlIlIllIIIlIllIlI = null;
   public lllIllIllIlIllIlIIllllIIl IlllIllIlIIIIlIIlIIllIIIl = null;
   private static IlIIIIlllIIIlIIllllIIIlll IllIIlllIllIlIllIlIIIIIII;
   private boolean IlIlIIIlllllIIIlIlIlIllII = false;
   private boolean hideText = false;
   private float IIlIIllIIIllllIIlllIllIIl;
   private float lllIlIIllllIIIIlIllIlIIII;
   private List lIIIIlllIIlIlllllIlIllIII;
   private List lIIIlllIlIlllIIIIIIIIIlII;
   private int IIIIlIIIlllllllllIlllIlll;
   private int IlIllllIIIlIllllIIIIIllII;
   private boolean IlIIIIllIIIIIlllIIlIIlllI = false;
   private IlIIllIIIlllIIIIlIIIIlIll llIlIlIllIlIIlIlllIllIIlI;
   public static boolean IlIlllIIIIllIllllIllIIlIl = false;
   private int llIlIlIlllIlllllIIIllIIll;
   private int IIllIlIllIlIllIIlIllIlIII = 0;

   public void t_() {
      Keyboard.enableRepeatEvents(false);
      this.lllIIIIIlIllIlIIIllllllII.IIIIIIlIlIlIllllllIlllIlI.IlllIIIlIlllIllIlIIlllIlI();
   }

   public void s_() {
      this.IllIllIIIlIIlllIIIllIllII();
      Keyboard.enableRepeatEvents(true);
      this.IlllIIlllIIIIllIIllllIlIl = new ArrayList();
      this.IlllIIlllIIIIllIIllllIlIl.addAll(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIlIIllIIlIIlIIIlIIllI);
      this.lIIIIlllIIlIlllllIlIllIII = new ArrayList();
      this.lIIIlllIlIlllIIIIIIIIIlII = new ArrayList();
      this.llIlIlIlllIlllllIIIllIIll = 0;
      lIIIIlIIllIIlIIlIIIlIIllI = this;
      IllIIlllIllIlIllIlIIIIIII = null;
      IlIlllIIIIllIllllIllIIlIl = false;
      this.lIIIIllIIlIlIllIIIlIllIlI = null;
      this.IlllIllIlIIIIlIIlIIllIIIl = null;
      this.llIlIlIllIlIIlIlllIllIIlI = null;
      /* Make square area -1 */
      this.IIIIlIIIlllllllllIlllIlll = -1;
      this.IlIllllIIIlIllllIIIIIllII = -1;
      IlIlllIIIIllIllllIllIIlIl = false;
      float var1 = 1.0F / cb.IlllIllIlIIIIlIIlIIllIIIl();
      int var2 = (int)((float)this.lIIIIIllllIIIIlIlIIIIlIlI / var1);
      int var3 = (int)((float)this.IIIIIIlIlIlIllllllIlllIlI / var1);
      this.IllIIlIIlllllIllIIIlllIII.clear();
      this.lIlIlIllIIIIIIIIllllIIllI.clear();
      List var4 = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIlIIllIIlIIlIIIlIIllI;
      List var5 = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl;
      this.IllIIlIIlllllIllIIIlllIII.add(this.IIIllIllIlIlllllllIlIlIII = new llllIIlIlIllIllllIIIIllll(var1, var2 / 2 - 565, var3 / 2 + 14, 370, var3 / 2 - 35));
      this.IllIIlIIlllllIllIIIlllIII.add(this.IllIIIIIIIlIlIllllIIllIII = new lIlIIllIIIlllIIllIIlIIllI(var5, var1, var2 / 2 + 195, var3 / 2 + 14, 370, var3 / 2 - 35));
      this.IllIIlIIlllllIllIIIlllIII.add(this.IIIIllIIllIIIIllIllIIIlIl = new lIlIIllIIIlllIIllIIlIIllI(var4, var1, var2 / 2 + 195, var3 / 2 + 14, 370, var3 / 2 - 35));
      this.IllIIlIIlllllIllIIIlllIII.add(this.IlIlIIIlllIIIlIlllIlIllIl = new IIlIlIlllIllIIlIllIIlIIlI(var1, var2 / 2 - 565, var3 / 2 + 14, 370, var3 / 2 - 35));
      this.IllllIllllIlIIIlIIIllllll = new llllIIIIIlIlIlIlIllIIIIII(null, "eye-64.png", 4, var3 - 32, 28, 28, -12418828, var1);
      this.lIIIIIIIIIlIllIIllIlIIlIl = new llllIIIIIlIlIlIlIllIIIIII(null, "?", 36, var3 - 32, 28, 28, -12418828, var1);
      if (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll())
         this.lIlIlIllIIIIIIIIllllIIllI.add(new llllIIIIIlIlIlIlIllIIIIII(this.IllIIIIIIIlIlIllllIIllIII, "Staff Mods", var2 / 2 - 50, var3 / 2 - 44, 100, 20, -9442858, var1));
      this.lIlIlIllIIIIIIIIllllIIllI.add(new llllIIIIIlIlIlIlIllIIIIII(this.IIIllIllIlIlllllllIlIlIII, "Mods", var2 / 2 - 50, var3 / 2 - 19, 100, 28, -13916106, var1));
      this.lIlIlIllIIIIIIIIllllIIllI.add(new llllIIIIIlIlIlIlIllIIIIII(this.IIIIllIIllIIIIllIllIIIlIl, "cog-64.png", var2 / 2 + 54, var3 / 2 - 19, 28, 28, -12418828, var1));
      this.lIlIlIllIIIIIIIIllllIIllI.add(new llllIIIIIlIlIlIlIllIIIIII(this.IlIlIIIlllIIIlIlllIlIllIl, "profiles-64.png", var2 / 2 - 82, var3 / 2 - 19, 28, 28, -12418828, var1));
      IlIlllIIIIllIllllIllIIlIl = false;
      this.lIIIIllIIlIlIllIIIlIllIlI = null;
      this.IIllIlIllIlIllIIlIllIlIII = 5;
   }

   public void IlllIIIlIlllIllIlIIlllIlI() {
      float var1 = 1.0F / cb.IlllIllIlIIIIlIIlIIllIIIl();
      int var2 = (int)((float)this.lIIIIIllllIIIIlIlIIIIlIlI / var1);
      int var10000 = (int)((float)this.IIIIIIlIlIlIllllllIlllIlI / var1);
      this.lIIIIlIIllIIlIIlIIIlIIllI(var2);
      if (!this.IllIlIlIllllIlIIllllIIlll.isEmpty()) {
         boolean var4 = Keyboard.isKeyDown(203);
         boolean var5 = Keyboard.isKeyDown(205);
         boolean var6 = Keyboard.isKeyDown(200);
         boolean var7 = Keyboard.isKeyDown(208);
         if (var4 || var5 || var6 || var7) {
            ++this.llIlIlIlllIlllllIIIllIIll;
            if (this.llIlIlIlllIlllllIIIllIIll > 10) {

               for (lIlIlIIIIllIlllIlIIlllIlI selectedModule : this.IllIlIlIllllIlIIllllIIlll) {
                  IlIIIIlllIIIlIIllllIIIlll module = selectedModule.lIIIIlIIllIIlIIlIIIlIIllI;
                  if (module != null) {
                     if (var4) {
                        module.lIIIIlIIllIIlIIlIIIlIIllI((float) ((int) module.IlllIllIlIIIIlIIlIIllIIIl() - 1), (float) ((int) module.IlIlllIIIIllIllllIllIIlIl()));
                     } else if (var5) {
                        module.lIIIIlIIllIIlIIlIIIlIIllI((float) ((int) module.IlllIllIlIIIIlIIlIIllIIIl() + 1), (float) ((int) module.IlIlllIIIIllIllllIllIIlIl()));
                     } else if (var6) {
                        module.lIIIIlIIllIIlIIlIIIlIIllI((float) ((int) module.IlllIllIlIIIIlIIlIIllIIIl()), (float) ((int) module.IlIlllIIIIllIllllIllIIlIl() - 1));
                     } else if (var7) {
                        module.lIIIIlIIllIIlIIlIIIlIIllI((float) ((int) module.IlllIllIlIIIIlIIlIIllIIIl()), (float) ((int) module.IlIlllIIIIllIllllIllIIlIl() + 1));
                     }
                  }
               }
            }
         }
      }

      if ((boolean) cb.IlIlIIIlllIIIlIlllIlIllIl().cbTextAndLogo.IIIIllIlIIIllIlllIlllllIl()) {
	      float var11 = this.IIllIlIllIlIllIIlIllIlIII > 30 ? 2.0F + (float)this.IIllIlIllIlIllIIlIllIlIII / 2.0F : (float) 4;
	      if ((float)this.IIllIlIllIlIllIIlIllIlIII + var11 >= (float)255) {
	         this.IIllIlIllIlIllIIlIllIlIII = 255;
	      } else {
	         this.IIllIlIllIlIllIIlIllIlIII = (int)((float)this.IIllIlIllIlIllIIlIllIlIII + var11);
	      }
      } else {
	      float var11 = this.IIllIlIllIlIllIIlIllIlIII < 30 ? 2.0F + (float)this.IIllIlIllIlIllIIlIllIlIII / 2.0F : (float) 22;
	      if ((float) this.IIllIlIllIlIllIIlIllIlIII <= (float) 5) {
	    	  this.IIllIlIllIlIllIIlIllIlIII = 5;
	      } else {
	    	  this.IIllIlIllIlIllIIlIllIlIII = (int) ((float) this.IIllIlIllIlIllIIlIllIlIII - var11);
	      }
      }
   }

   private float lIIIIlIIllIIlIIlIIIlIIllI(Rectangle var1, Rectangle var2) {
      float var3 = (float)Math.max(Math.abs(var1.x - var2.x) - var2.width / 2, 0);
      float var4 = (float)Math.max(Math.abs(var1.y - var2.y) - var2.height / 2, 0);
      return var3 * var3 + var4 * var4;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      this.lIIlllIIlIlllllllllIIIIIl();
      llIIllIIIllIIlIlIIIIIIIII var4 = new llIIllIIIllIIlIlIIIIIIIII(this.lllIIIIIlIllIlIIIllllllII, this.lllIIIIIlIllIlIIIllllllII.IIIllIllIlIlllllllIlIlIII, this.lllIIIIIlIllIlIIIllllllII.IllIIIIIIIlIlIllllIIllIII);
      float var5 = 1.0F / cb.IlllIllIlIIIIlIIlIIllIIIl();
      Iterator var7;
      float var21;
      float var22;
      if (IllIIlllIllIlIllIlIIIIIII != null) {
         if (!Mouse.isButtonDown(1)) {
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)2, 0.0D, 2.916666637692187D * 0.8571428656578064D, (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -15599126);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)this.lIIIIIllllIIIIlIlIIIIlIlI - 5.0F * 0.5F), 0.0D, (double)(this.lIIIIIllllIIIIlIlIIIIlIlI - 2), (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -15599126);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (double)2, (double)this.lIIIIIllllIIIIlIlIIIIlIlI, 1.1547619104385376D * 2.164948442965692D, 0.0D, -15599126);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (double)((float)this.IIIIIIlIlIlIllllllIlllIlI - 1.3529412F * 2.5869565F), (double)this.lIIIIIllllIIIIlIlIIIIlIlI, (double)(this.IIIIIIlIlIlIllllllIlllIlI - 3), 0.0D, -15599126);
         }

         this.IlllIIlllIIIIllIIllllIlIl.sort((var2x, var3x) -> {
            if (var2x != IllIIlllIllIlIllIlIIIIIII && var3x != IllIIlllIllIlIllIlIIIIIII && var2x.llIlIIIlIIIIlIlllIlIIIIll() != null && var3x.llIlIIIlIIIIlIlllIlIIIIll() != null) {
               float[] var4x = var2x.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float[] var50 = var3x.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float[] var6 = IllIIlllIllIlIllIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               Rectangle var70 = new Rectangle((int)(var4x[0] * (Float)var2x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var4x[1] * (Float)var2x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var2x.llIlIIIllIIIIlllIlIIIIIlI * (Float)var2x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var2x.lIllIlIlllIIlIIllIIlIIlII * (Float)var2x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
               Rectangle var8 = new Rectangle((int)(var50[0] * (Float)var3x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var50[1] * (Float)var3x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var3x.llIlIIIllIIIIlllIlIIIIIlI * (Float)var3x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var3x.lIllIlIlllIIlIIllIIlIIlII * (Float)var3x.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
               Rectangle var9 = new Rectangle((int)(var6[0] * (Float)IllIIlllIllIlIllIlIIIIIII.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(var6[1] * (Float)IllIIlllIllIlIllIlIIIIIII.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(IllIIlllIllIlIllIlIIIIIII.llIlIIIllIIIIlllIlIIIIIlI * (Float)IllIIlllIllIlIllIlIIIIIII.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (int)(IllIIlllIllIlIllIlIIIIIII.lIllIlIlllIIlIIllIIlIIlII * (Float)IllIIlllIllIlIllIlIIIIIII.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));

               try {
                  return this.lIIIIlIIllIIlIIlIIIlIIllI(var70, var9) > this.lIIIIlIIllIIlIIlIIIlIIllI(var8, var9) ? -1 : 1;
               } catch (Exception var11) {
                  return 0;
               }
            } else {
               return 0;
            }
         });
         lIlIlIIIIllIlllIlIIlllIlI var6 = this.lIIIIlIIllIIlIIlIIIlIIllI(IllIIlllIllIlIllIlIIIIIII);
         if (var6 != null) {
            this.IllIlIlIllllIlIIllllIIlll.remove(var6);
            this.IllIlIlIllllIlIIllllIIlll.add(var6);
         }

         var7 = this.IllIlIlIllllIlIIllllIIlll.iterator();

         label289:
         while(true) {
            lIlIlIIIIllIlllIlIIlllIlI var8;
            do {
               do {
                  do {
                     do {
                        if (!var7.hasNext()) {
                           break label289;
                        }

                        var8 = (lIlIlIIIIllIlllIlIIlllIlI)var7.next();
                        this.lIIIIlIIllIIlIIlIIIlIIllI(var8, var1, var2, var4);
                     } while(!(Boolean)cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIlIllIIIIIIIIllllIIllI.IIIIllIlIIIllIlllIlllllIl());
                  } while(!this.IlIlIIIlllllIIIlIlIlIllII);
               } while(Mouse.isButtonDown(1));
            } while(var8.lIIIIlIIllIIlIIlIIIlIIllI != IllIIlllIllIlIllIlIIIIIII);

            Iterator var9 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

            while(true) {
               IlIIIIlllIIIlIIllllIIIlll var10;
               do {
                  do {
                     do {
                        do {
                           if (!var9.hasNext()) {
                              continue label289;
                           }

                           var10 = (IlIIIIlllIIIlIIllllIIIlll)var9.next();
                        } while(this.lIIIIlIIllIIlIIlIIIlIIllI(var10) != null);
                     } while(var10.llIlIIIlIIIIlIlllIlIIIIll() == null);
                  } while(!var10.IlIlIIIlllIIIlIlllIlIllIl());
               } while(var10.IIIllIllIlIlllllllIlIlIII().contains("Zans") && cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI().lIIIIIIIIIlIllIIllIlIIlIl().IIIIllIlIIIllIlllIlllllIl);

               float var11 = (float)18;
               if (var10.llIlIIIllIIIIlllIlIIIIIlI < var11) {
                  var10.llIlIIIllIIIIlllIlIIIIIlI = (float)((int)var11);
               }

               if (var10.lIllIlIlllIIlIIllIIlIIlII < (float)18) {
                  var10.lIllIlIlllIIlIIllIIlIIlII = (float)18;
               }

               if (var8.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI < var11) {
                  var8.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI = (float)((int)var11);
               }

               if (var8.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII < (float)18) {
                  var8.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII = (float)18;
               }

               boolean var12 = true;
               boolean var13 = true;
               float[] var14 = var10.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float[] var15 = var8.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float var16 = var14[0] * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var15[0] * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var17 = (var14[0] + var10.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var15[0] + var8.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var18 = (var14[0] + var10.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var15[0] * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var19 = var14[0] * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var15[0] + var8.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var20 = var14[1] * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var15[1] * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               var21 = (var14[1] + var10.lIllIlIlllIIlIIllIIlIIlII) * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var15[1] + var8.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII) * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               var22 = (var14[1] + var10.lIllIlIlllIIlIIllIIlIIlII) * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var15[1] * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var23 = var14[1] * (Float)var10.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var15[1] + var8.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII) * (Float)var8.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               byte var24 = 2;
               if (var16 >= (float)(-var24) && var16 <= (float)var24) {
                  var12 = false;
                  this.IlllIIIlIlllIllIlIIlllIlI(var16);
               }

               if (var17 >= (float)(-var24) && var17 <= (float)var24 && var12) {
                  var12 = false;
                  this.IlllIIIlIlllIllIlIIlllIlI(var17);
               }

               if (var19 >= (float)(-var24) && var19 <= (float)var24 && var12) {
                  var12 = false;
                  this.IlllIIIlIlllIllIlIIlllIlI(var19);
               }

               if (var18 >= (float)(-var24) && var18 <= (float)var24 && var12) {
                  this.IlllIIIlIlllIllIlIIlllIlI(var18);
               }

               if (var20 >= (float)(-var24) && var20 <= (float)var24) {
                  var13 = false;
                  this.IIIIllIlIIIllIlllIlllllIl(var20);
               }

               if (var21 >= (float)(-var24) && var21 <= (float)var24 && var13) {
                  var13 = false;
                  this.IIIIllIlIIIllIlllIlllllIl(var21);
               }

               if (var23 >= (float)(-var24) && var23 <= (float)var24 && var13) {
                  var13 = false;
                  this.IIIIllIlIIIllIlllIlllllIl(var23);
               }

               if (var22 >= (float)(-var24) && var22 <= (float)var24 && var13) {
                  this.IIIIllIlIIIllIlllIlllllIl(var22);
               }
            }
         }
      } else if (this.llIlIlIllIlIIlIlllIllIIlI != null) {
         float var26 = 1.0F;
         int var25;
         switch(IllIIIlIIlIllIllIIllllIIl.lIIIIlIIllIIlIIlIIIlIIllI[this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI.ordinal()]) {
         case 1:
            var25 = var2 - this.llIlIlIllIlIIlIlllIllIIlI.IIIllIllIlIlllllllIlIlIII + (var1 - this.llIlIlIllIlIIlIlllIllIIlI.IllIIIIIIIlIlIllllIIllIII);
            var26 = this.llIlIlIllIlIIlIlllIllIIlI.IIIIllIlIIIllIlllIlllllIl - (float)var25 / (float)115;
            break;
         case 2:
            var25 = var2 - this.llIlIlIllIlIIlIlllIllIIlI.IIIllIllIlIlllllllIlIlIII + (var1 - this.llIlIlIllIlIIlIlllIllIIlI.IllIIIIIIIlIlIllllIIllIII);
            var26 = this.llIlIlIllIlIIlIlllIllIIlI.IIIIllIlIIIllIlllIlllllIl + (float)var25 / (float)115;
            break;
         case 3:
            var25 = var1 - this.llIlIlIllIlIIlIlllIllIIlI.IllIIIIIIIlIlIllllIIllIII - (var2 - this.llIlIlIllIlIIlIlllIllIIlI.IIIllIllIlIlllllllIlIlIII);
            var26 = this.llIlIlIllIlIIlIlllIllIIlI.IIIIllIlIIIllIlllIlllllIl - (float)var25 / (float)115;
            break;
         case 4:
            var25 = var1 - this.llIlIlIllIlIIlIlllIllIIlI.IllIIIIIIIlIlIllllIIllIII - (var2 - this.llIlIlIllIlIIlIlllIllIIlI.IIIllIllIlIlllllllIlIlIII);
            var26 = this.llIlIlIllIlIIlIlllIllIIlI.IIIIllIlIIIllIlllIlllllIl + (float)var25 / (float)115;
         }

         if (var26 >= 1.0421053F * 0.47979796F && var26 <= 1.8962264F * 0.7910448F) {
            this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl((float)((double)Math.round((double)var26 * (double)100) / (double)100));
         }
      }

      this.lIIIIlIIllIIlIIlIIIlIIllI(var4);
      boolean var27 = true;
      var7 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

      while(var7.hasNext()) {
         IlIIIIlllIIIlIIllllIIIlll var28 = (IlIIIIlllIIIlIIllllIIIlll)var7.next();
         boolean var30 = this.lIIIIlIIllIIlIIlIIIlIIllI(var5, var28, var4, var1, var2, var27);
         if (!var30) {
            var27 = false;
         }
      }

      GL11.glPushMatrix();
      GL11.glScalef(var5, var5, var5);
      int var31 = (int)((float)this.lIIIIIllllIIIIlIlIIIIlIlI / var5);
      int var29 = (int)((float)this.IIIIIIlIlIlIllllllIlllIlI / var5);
      this.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      float var32 = (float)(this.IIllIlIllIlIllIIlIllIlIII * 8) / (float)255;
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var32);
      int var33 = 16777215;
      if (var32 / (float)4 > 0.0F && var32 / (float)4 < 1.0F) {
         var33 = (new Color(1.0F, 1.0F, 1.0F, var32 / (float)4)).getRGB();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, var32);
      if (var32 > 1.0F) {
         GL11.glTranslatef(-((float)(this.IIllIlIllIlIllIIlIllIlIII * 2) - (float)32) / (float)12 - 1.0F, 0.0F, 0.0F);
      }

      if ((boolean) cb.IlIlIIIlllIIIlIlllIlIllIl().cbTextAndLogo.IIIIllIlIIIllIlllIlllllIl()) {
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/logo_white.png"), (float)(var31 / 2 - 14), (float)(var29 / 2 - 47 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), (float)28, (float)15);
	      if (var32 > 2.0F) {
	    	  cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI("| CHEAT", (float)(var31 / 2 + 18), (float)(var29 / 2 - 45 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), var33);
	    	  cb.IIIIllIlIIIllIlllIlllllIl().llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI("BREAKER", (float)(var31 / 2 + 53), (float)(var29 / 2 - 45 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), var33);
	      }
      } else {
    	  if (this.IIllIlIllIlIllIIlIllIlIII > 5) {
	          lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/logo_white.png"), (float)(var31 / 2 - 14), (float)(var29 / 2 - 47 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), (float)28, (float)15);
		      if (var32 > 2.0F) {
		    	  cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI("| CHEAT", (float)(var31 / 2 + 18), (float)(var29 / 2 - 45 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), var33);
		    	  cb.IIIIllIlIIIllIlllIlllllIl().llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI("BREAKER", (float)(var31 / 2 + 53), (float)(var29 / 2 - 45 - (cb.IIIIllIlIIIllIlllIlllllIl().llIlIIIlIIIIlIlllIlIIIIll() ? 22 : 0)), var33);
		      }
    	  }
      }

      GL11.glPopMatrix();
      Iterator var34 = this.lIlIlIllIIIIIIIIllllIIllI.iterator();

      while(var34.hasNext()) {
         llllIIIIIlIlIlIlIllIIIIII var35 = (llllIIIIIlIlIlIlIllIIIIII)var34.next();
         var35.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      }

      if (IllIIlllIllIlIllIlIIIIIII == null) {
         GL11.glPushMatrix();
         GL11.glEnable(3089);
         lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(var31 / 2 - 185, var29 / 2 + 15, var31 / 2 + 185, var29 - 20, (float)var4.IIIIllIIllIIIIllIllIIIlIl() * var5, var29);
         var34 = this.IllIIlIIlllllIllIIIlllIII.iterator();

         label230:
         while(true) {
            lllIllIllIlIllIlIIllllIIl var36;
            do {
               if (!var34.hasNext()) {
                  GL11.glDisable(3089);
                  GL11.glPopMatrix();
                  break label230;
               }

               var36 = (lllIllIllIlIllIlIIllllIIl)var34.next();
            } while(var36 != this.lIIIIllIIlIlIllIIIlIllIlI && var36 != this.IlllIllIlIIIIlIIlIIllIIIl);

            var36.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
         }
      }

      GL11.glPopMatrix();
      if (this.IIIIlIIIlllllllllIlllIlll != -1) {
         if (Mouse.isButtonDown(0)) {
            if (this.IIIIlIIIlllllllllIlllIlll != var1 && this.IlIllllIIIlIllllIIIIIllII != var2) {
               IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
               int mainColor =  cbSettings.mainColor.lIIIIlIIllIIlIIlIIIlIIllI();
               int r = mainColor >> 16 & 255;
               int g = mainColor >> 8 & 255;
               int b = mainColor & 255;
               lIIIIlIIllIIlIIlIIIlIIllI((float)var1, (float)this.IlIllllIIIlIllllIIIIIllII, (float)var1 + 1.1538461F * 0.43333334F, (float)var2, cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? new Color(r, g, b, 175).getRGB() : -1358888961);
               lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIlIIIlllllllllIlllIlll - 0.4329897F * 1.1547619F, (float)var2, (float)var1 + 18.2F * 0.027472526F, (float)var2 + 0.121212125F * 4.125F, cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? new Color(r, g, b, 175).getRGB() : -1358888961);
               lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIlIIIlllllllllIlllIlll - 0.8666667F * 0.5769231F, (float)this.IlIllllIIIlIllllIIIIIllII, (float)this.IIIIlIIIlllllllllIlllIlll, (float)var2, cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? new Color(r, g, b, 175).getRGB() : -1358888961);
               lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIlIIIlllllllllIlllIlll - 0.557971F * 0.8961039F, (float)this.IlIllllIIIlIllllIIIIIllII - 0.3611111F * 1.3846154F, (float)var1 + 1.2692307F * 0.3939394F, (float)this.IlIllllIIIlIllllIIIIIllII, cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? new Color(r, g, b, 175).getRGB() : -1358888961);
               lIIIIlIIllIIlIIlIIIlIIllI((float)this.IIIIlIIIlllllllllIlllIlll, (float)this.IlIllllIIIlIllllIIIIIllII, (float)var1, (float)var2, cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? new Color(r, g, b, 30).getRGB() : 520159231);
            }
         } else {
            this.IllIlIlIllllIlIIllllIIlll.clear();
            var34 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

            label215:
            while(true) {
               IlIIIIlllIIIlIIllllIIIlll var37;
               do {
                  do {
                     do {
                        if (!var34.hasNext()) {
                           this.IIIIlIIIlllllllllIlllIlll = -1;
                           this.IlIllllIIIlIllllIIIIIllII = -1;
                           break label215;
                        }

                        var37 = (IlIIIIlllIIIlIIllllIIIlll)var34.next();
                     } while(var37.llIlIIIlIIIIlIlllIlIIIIll() == null);
                  } while(!var37.IlIlIIIlllIIIlIlllIlIllIl());
               } while(var37.IIIllIllIlIlllllllIlIlIII().contains("Zans") && cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI().lIIIIIIIIIlIllIIllIlIIlIl().IIIIllIlIIIllIlllIlllllIl);

               float[] var38 = var37.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float var10000 = var5 / (Float)var37.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               Rectangle var39 = new Rectangle((int)(var38[0] * (Float)var37.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 2.0F), (int)(var38[1] * (Float)var37.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 2.0F), (int)(var37.llIlIIIllIIIIlllIlIIIIIlI * (Float)var37.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)4), (int)(var37.lIllIlIlllIIlIIllIIlIIlII * (Float)var37.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)4));
               int var40 = Math.min(this.IIIIlIIIlllllllllIlllIlll, var1);
               int var41 = Math.min(this.IlIllllIIIlIllllIIIIIllII, var2);
               int var42 = Math.max(this.IIIIlIIIlllllllllIlllIlll, var1) - var40;
               int var43 = Math.max(this.IlIllllIIIlIllllIIIIIllII, var2) - var41;
               Rectangle var44 = new Rectangle(var40, var41, var42, var43);
               if (var39.intersects(var44)) {
                  var21 = (float)var1 - var37.IlllIllIlIIIIlIIlIIllIIIl();
                  var22 = (float)var2 - var37.IlIlllIIIIllIllllIllIIlIl();
                  this.IllIlIlIllllIlIIllllIIlll.add(new lIlIlIIIIllIlllIlIIlllIlI(var37, var21, var22));
               }
            }
         }
      }

      if (this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && (this.lIIIIllIIlIlIllIIIlIllIlI == null || !this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2))) {
         this.lIIIIIIIIIlIllIIllIlIIlIl(var5);
      }

   }

   private void lIIIIIIIIIlIllIIllIlIIlIl(float var1) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)4, (float)this.IIIIIIlIlIlIllllllIlllIlI - (float)185 * var1, 0.0F);
      GL11.glScalef(var1, var1, var1);
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)240, (float)140, -1895825408);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("Shortcuts & Movement", (float)4, 2.0F, -1);
      IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)4, (float)12, (float)234, 2.5815217F * 4.8421054F, 1342177279);
      byte var2 = 16;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Mouse1", 6, var2);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| " + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + "HOLD" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + " Add mods to selected region", (float)80, (float)var2, -1);
      int var3 = var2 + 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Mouse1", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| " + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + "HOLD" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + " Select & drag mods", (float)80, (float)var3, -1);
      var3 += 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Mouse2", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| " + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + "CLICK" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + " Reset mod to closest position", (float)80, (float)var3, -1);
      var3 += 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Mouse2", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| " + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + "HOLD" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII + " Don't lock mods while dragging", (float)80, (float)var3, -1);
      var3 += 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("CTRL", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("+", (float)30, (float)var3, -1);
      this.lIIIIlIIllIIlIIlIIIlIIllI("Mouse1", 36, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| Toggle (multiple) mod selection", (float)80, (float)var3, -1);
      var3 += 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("CTRL", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("+", (float)30, (float)var3, -1);
      this.lIIIIlIIllIIlIIlIIIlIIllI("Z", 36, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| Undo mod movements", (float)80, (float)var3, -1);
      var3 += 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("CTRL", 6, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("+", (float)30, (float)var3, -1);
      this.lIIIIlIIllIIlIIlIIIlIIllI("Y", 36, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| Redo mod movements", (float)80, (float)var3, -1);
      var2 = 112;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Up", 31, var2);
      var3 = var2 + 12;
      this.lIIIIlIIllIIlIIlIIIlIIllI("Left", 6, var3);
      this.lIIIIlIIllIIlIIlIIIlIIllI("Down", 26, var3);
      this.lIIIIlIIllIIlIIlIIIlIIllI("Right", 51, var3);
      cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI("| Move selected mod with precision", (float)80, (float)var3, -1);
      GL11.glPopMatrix();
   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(String var1, int var2, int var3) {
      lIlIllIlIlIIIllllIlIllIll var4 = cb.IIIIllIlIIIllIlllIlllllIl().lIIlIlIllIIlIIIlIIIlllIII;
      float var5 = (float)var4.lIIIIIIIIIlIllIIllIlIIlIl(var1);
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(var2, var3, ((float)var2 + var5 + (float)4), (var3 + 10), (double)2, -1073741825);
      var4.lIIIIlIIllIIlIIlIIIlIIllI(var1, (float)(var2 + 2), (float)var3, -16777216);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      llIIllIIIllIIlIlIIIIIIIII var4 = new llIIllIIIllIIlIlIIIIIIIII(this.lllIIIIIlIllIlIIIllllllII, this.lllIIIIIlIllIlIIIllllllII.IIIllIllIlIlllllllIlIlIII, this.lllIIIIIlIllIlIIIllllllII.IllIIIIIIIlIlIllllIIllIII);
      if (this.lIIIIllIIlIlIllIIIlIllIlI != null && this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
      } else {
         boolean var8;
         if (IllIIlllIllIlIllIlIIIIIII == null || !this.IlIlIIIlllllIIIlIlIlIllII) {
            IlIIIIlllIIIlIIllllIIIlll var5 = this.lIIIIlIIllIIlIIlIIIlIIllI(var4, var1, var2);
            if (var5 != null) {
               float[] var19 = var5.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               boolean var20 = !var5.llIIlllIIIIlllIllIlIlllIl().isEmpty() && (float)var1 >= var19[0] * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 <= (var19[0] + (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 >= (var19[1] + var5.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var19[1] + var5.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               var8 = (float)var1 > (var19[0] + var5.llIlIIIllIIIIlllIlIIIIIlI - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 < (var19[0] + var5.llIlIIIllIIIIlllIlIIIIIlI + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 > (var19[1] + var5.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var19[1] + var5.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               if (var20) {
                  lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                  ((lIlIIllIIIlllIIllIIlIIllI)this.IIIIllIIllIIIIllIllIIIlIl).llIlIIIlIIIIlIlllIlIIIIll = false;
                  ((lIlIIllIIIlllIIllIIlIIllI)this.IIIIllIIllIIIIllIllIIIlIl).IIIlIIllllIIllllllIlIIIll = var5;
                  this.IlllIllIlIIIIlIIlIIllIIIl = this.IIIIllIIllIIIIllIllIIIlIl;
               } else if (var8) {
                  lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                  var5.lIIIIlIIllIIlIIlIIIlIIllI(false);
               }

               return;
            }
         }

         Iterator var16 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

         label261:
         while(true) {
            IlIIIIlllIIIlIIllllIIIlll var6;
            boolean var9;
            boolean var10;
            boolean var11;
            boolean var12;
            do {
               do {
                  do {
                     do {
                        do {
                           if (!var16.hasNext()) {
                              if (IllIIlllIllIlIllIlIIIIIII == null) {
                                 if (this.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                                    lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                                    this.IlIIIIllIIIIIlllIIlIIlllI = !this.IlIIIIllIIIIIlllIIlIIlllI;
                                    this.hideText = !this.hideText;
                                 }

                                 this.IlllIIIlIlllIllIlIIlllIlI(var1, var2, var3);
                                 this.lIIIIlIIllIIlIIlIIIlIIllI(var4, var1, var2, var3);
                              }

                              var16 = this.lIlIlIllIIIIIIIIllllIIllI.iterator();

                              while(var16.hasNext()) {
                                 llllIIIIIlIlIlIlIllIIIIII var18 = (llllIIIIIlIlIlIlIllIIIIII)var16.next();
                                 if (var18.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                                    return;
                                 }
                              }

                              boolean var17 = this.lIIIIIIIIIlIllIIllIlIIlIl(var4, var1, var2);
                              if (var17) {
                                 return;
                              }

                              if (!this.IllIlIlIllllIlIIllllIIlll.isEmpty()) {
                                 this.IllIlIlIllllIlIIllllIIlll.clear();
                                 lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                              }

                              this.IIIIlIIIlllllllllIlllIlll = var1;
                              this.IlIllllIIIlIllllIIIIIllII = var2;
                              break label261;
                           }

                           var6 = (IlIIIIlllIIIlIIllllIIIlll)var16.next();
                        } while(var6.llIlIIIlIIIIlIlllIlIIIIll() == null);
                     } while(!var6.IlIlIIIlllIIIlIlllIlIllIl());
                  } while(var6 == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl);

                  float[] var7 = var6.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
                  var8 = (float)var1 > var7[0] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 < (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 > var7[1] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  var9 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var6 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.lIIIIIIIIIlIllIIllIlIIlIl || !var8 && (float)var1 >= (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 <= (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 >= (var7[1] - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var7[1] + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  var10 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var6 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.IlllIIIlIlllIllIlIIlllIlI || !var8 && (float)var1 >= (var7[0] - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 <= (var7[0] + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 >= (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  var11 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var6 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.lIIIIlIIllIIlIIlIIIlIIllI || !var8 && (float)var1 >= (var7[0] - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 <= (var7[0] + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 >= (var7[1] - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var7[1] + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  var12 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var6 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.IIIIllIlIIIllIlllIlllllIl || !var8 && (float)var1 >= (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var1 <= (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 >= (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII - (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII + (float)5) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               } while(this.IIIIlIIIlllllllllIlllIlll != -1);
            } while(!var9 && !var10 && !var11 && !var12);

            lIIIIIIlIIllllllIIIlIlIIl var13;
            IIlIIlIIIIIlIlIIlIIlIIlII var14;
            if (var9) {
               var13 = lIIIIIIlIIllllllIIIlIlIIl.lIIIIIIIIIlIllIIllIlIIlIl;
               var14 = IIlIIlIIIIIlIlIIlIIlIIlII.IlllIIIlIlllIllIlIIlllIlI;
            } else if (var10) {
               var13 = lIIIIIIlIIllllllIIIlIlIIl.IlllIIIlIlllIllIlIIlllIlI;
               var14 = IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII;
            } else if (var11) {
               var13 = lIIIIIIlIIllllllIIIlIlIIl.lIIIIlIIllIIlIIlIIIlIIllI;
               var14 = IIlIIlIIIIIlIlIIlIIlIIlII.IlllIllIlIIIIlIIlIIllIIIl;
            } else {
               var13 = lIIIIIIlIIllllllIIIlIlIIl.IIIIllIlIIIllIlllIlllllIl;
               var14 = IIlIIlIIIIIlIlIIlIIlIIlII.lIIIIlIIllIIlIIlIIIlIIllI;
            }

            if (!this.lIIIIIIIIIlIllIIllIlIIlIl(var4, var1, var2)) {
               if (var3 == 0) {
                  this.lIIIIlllIIlIlllllIlIllIII.add(new IIlIlllIllIlIlIIIIIlllIll(this, this.IllIlIlIllllIlIIllllIIlll));
                  this.llIlIlIllIlIIlIlllIllIIlI = new IlIIllIIIlllIIIIlIIIIlIll(this, var6, var13, var1, var2);
                  this.lIIIIlIIllIIlIIlIIIlIIllI(var6, var14, var1, var2, var4);
               } else if (var3 == 1) {
                  IIlIIlIIIIIlIlIIlIIlIIlII var15 = var6.llIlIIIlIIIIlIlllIlIIIIll();
                  this.lIIIIlIIllIIlIIlIIIlIIllI(var6, var14, var1, var2, var4);
                  var6.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(1.0F);
                  this.lIIIIlIIllIIlIIlIIIlIIllI(var6, var15, var1, var2, var4);
               }

               return;
            }
         }
      }

      if (!this.IllIlIlIllllIlIIllllIIlll.isEmpty()) {
         this.llIlIlIlllIlllllIIIllIIll = 0;
      }

   }

   public void a_() {
      super.a_();
      int var1 = Mouse.getEventDWheel();
      if (this.lIIIIllIIlIlIllIIIlIllIlI != null) {
         this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1);
      }

   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1, IIlIIlIIIIIlIlIIlIIlIIlII var2, int var3, int var4, llIIllIIIllIIlIlIIIIIIIII var5) {
      if (var2 != var1.llIlIIIlIIIIlIlllIlIIIIll()) {
         float[] var6 = var1.lIIIIlIIllIIlIIlIIIlIIllI(var5, true);
         var1.lIIIIlIIllIIlIIlIIIlIIllI(var2);
         float[] var7 = var1.lIIIIlIIllIIlIIlIIIlIIllI(var5, false);
         var1.lIIIIlIIllIIlIIlIIIlIIllI(var6[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var7[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl(), var6[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var7[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl());
      }

   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(int var1, int var2, int var3) {
      llIIllIIIllIIlIlIIIIIIIII var4 = new llIIllIIIllIIlIlIIIIIIIII(this.lllIIIIIlIllIlIIIllllllII, this.lllIIIIIlIllIlIIIllllllII.IIIllIllIlIlllllllIlIlIII, this.lllIIIIIlIllIlIIIllllllII.IllIIIIIIIlIlIllllIIllIII);
      if (this.llIlIlIllIlIIlIlllIllIIlI != null && var3 == 0) {
         this.lIIIIlIIllIIlIIlIIIlIIllI(this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI, this.llIlIlIllIlIIlIlllIllIIlI.IlllIllIlIIIIlIIlIIllIIIl, var1, var2, var4);
         this.llIlIlIllIlIIlIlllIllIIlI = null;
      }

      if (IllIIlllIllIlIllIlIIIIIII != null && var3 == 0) {
         if (this.IlIlIIIlllllIIIlIlIlIllII) {
            Iterator var5 = this.IllIlIlIllllIlIIllllIIlll.iterator();

            while(var5.hasNext()) {
               lIlIlIIIIllIlllIlIIlllIlI var6 = (lIlIlIIIIllIlllIlIIlllIlI)var5.next();
               IIlIIlIIIIIlIlIIlIIlIIlII var7 = IllIlIlllIIllIlIIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI((float)var1, (float)var2, var4);
               if (var7 != IIlIIlIIIIIlIlIIlIIlIIlII.IIIIllIIllIIIIllIllIIIlIl && var7 != var6.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() && this.IlIlIIIlllllIIIlIlIlIllII) {
                  this.lIIIIlIIllIIlIIlIIIlIIllI(var6.lIIIIlIIllIIlIIlIIIlIIllI, var7, var1, var2, var4);
                  var6.lIIIIIIIIIlIllIIllIlIIlIl = (float)var1 - var6.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl();
                  var6.IlllIIIlIlllIllIlIIlllIlI = (float)var2 - var6.lIIIIlIIllIIlIIlIIIlIIllI.IlIlllIIIIllIllllIllIIlIl();
               }
            }

            if (this.lIIIIlIIllIIlIIlIIIlIIllI(IllIIlllIllIlIllIlIIIIIII) == null) {
               float[] var8 = IllIIlllIllIlIllIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var4, true);
               float var9 = (float)var1 - IllIIlllIllIlIllIlIIIIIII.IlllIllIlIIIIlIIlIIllIIIl();
               float var10 = (float)var2 - IllIIlllIllIlIllIlIIIIIII.IlIlllIIIIllIllllIllIIlIl();
               this.IllIlIlIllllIlIIllllIIlll.add(new lIlIlIIIIllIlllIlIIlllIlI(IllIIlllIllIlIllIlIIIIIII, var9, var10));
            }

            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            IllIIlllIllIlIllIlIIIIIII = null;
         } else {
            IllIIlllIllIlIllIlIIIIIII = null;
         }
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(char var1, int var2) {
      if (var2 == 1) {
    	  cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
      }

      super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
      IlIIIIlllIIIlIIllllIIIlll var6;
      float var7;
      float var8;
      IIlIIlIIIIIlIlIIlIIlIIlII var9;
      Float var10;
      int var11;
      IIlIlllIllIlIlIIIIIlllIll var12;
      int var13;
      if (var2 == 44 && llIlIIIllIIIIlllIlIIIIIlI()) {
         if (!this.lIIIIlllIIlIlllllIlIllIII.isEmpty()) {
            var11 = this.lIIIIlllIIlIlllllIlIllIII.size() - 1;
            var12 = (IIlIlllIllIlIlIIIIIlllIll)this.lIIIIlllIIlIlllllIlIllIII.get(this.lIIIIlllIIlIlllllIlIllIII.size() - 1);

            for(var13 = 0; var13 < var12.lIIIIlIIllIIlIIlIIIlIIllI.size(); ++var13) {
               var6 = (IlIIIIlllIIIlIIllllIIIlll)var12.lIIIIlIIllIIlIIlIIIlIIllI.get(var13);
               var7 = (Float)var12.IlllIIIlIlllIllIlIIlllIlI.get(var13);
               var8 = (Float)var12.IIIIllIlIIIllIlllIlllllIl.get(var13);
               var9 = (IIlIIlIIIIIlIlIIlIIlIIlII)var12.lIIIIIIIIIlIllIIllIlIIlIl.get(var13);
               var10 = (Float)var12.IIIIllIIllIIIIllIllIIIlIl.get(var13);
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var9);
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var7, var8);
               var6.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(var10);
            }

            if (this.lIIIlllIlIlllIIIIIIIIIlII.size() > 50) {
               this.lIIIlllIlIlllIIIIIIIIIlII.remove(0);
            }

            this.lIIIlllIlIlllIIIIIIIIIlII.add(var12);
            this.lIIIIlllIIlIlllllIlIllIII.remove(var11);
         }
      } else if (var2 == 21 && llIlIIIllIIIIlllIlIIIIIlI()) {
         if (!this.lIIIlllIlIlllIIIIIIIIIlII.isEmpty()) {
            var11 = this.lIIIlllIlIlllIIIIIIIIIlII.size() - 1;
            var12 = (IIlIlllIllIlIlIIIIIlllIll)this.lIIIlllIlIlllIIIIIIIIIlII.get(this.lIIIlllIlIlllIIIIIIIIIlII.size() - 1);

            for(var13 = 0; var13 < var12.lIIIIlIIllIIlIIlIIIlIIllI.size(); ++var13) {
               var6 = (IlIIIIlllIIIlIIllllIIIlll)var12.lIIIIlIIllIIlIIlIIIlIIllI.get(var13);
               var7 = (Float)var12.IlllIIIlIlllIllIlIIlllIlI.get(var13);
               var8 = (Float)var12.IIIIllIlIIIllIlllIlllllIl.get(var13);
               var9 = (IIlIIlIIIIIlIlIIlIIlIIlII)var12.lIIIIIIIIIlIllIIllIlIIlIl.get(var13);
               var10 = (Float)var12.IIIIllIIllIIIIllIllIIIlIl.get(var13);
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var9);
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var7, var8);
               var6.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(var10);
            }

            if (this.lIIIlllIlIlllIIIIIIIIIlII.size() > 50) {
               this.lIIIlllIlIlllIIIIIIIIIlII.remove(0);
            }

            this.lIIIIlllIIlIlllllIlIllIII.add(var12);
            this.lIIIlllIlIlllIIIIIIIIIlII.remove(var11);
         }
      } else {
         this.llIlIlIlllIlllllIIIllIIll = 0;
         Iterator var3 = this.IllIlIlIllllIlIIllllIIlll.iterator();

         while(var3.hasNext()) {
            lIlIlIIIIllIlllIlIIlllIlI var4 = (lIlIlIIIIllIlllIlIIlllIlI)var3.next();
            IlIIIIlllIIIlIIllllIIIlll var5 = var4.lIIIIlIIllIIlIIlIIIlIIllI;
            if (var5 != null) {
               switch(var2) {
               case 200:
                  var5.lIIIIlIIllIIlIIlIIIlIIllI(var5.IlllIllIlIIIIlIIlIIllIIIl(), var5.IlIlllIIIIllIllllIllIIlIl() - 1.0F);
               case 201:
               case 202:
               case 204:
               case 206:
               case 207:
               default:
                  break;
               case 203:
                  var5.lIIIIlIIllIIlIIlIIIlIIllI(var5.IlllIllIlIIIIlIIlIIllIIIl() - 1.0F, var5.IlIlllIIIIllIllllIllIIlIl());
                  break;
               case 205:
                  var5.lIIIIlIIllIIlIIlIIIlIIllI(var5.IlllIllIlIIIIlIIlIIllIIIl() + 1.0F, var5.IlIlllIIIIllIllllIllIIlIl());
                  break;
               case 208:
                  var5.lIIIIlIIllIIlIIlIIIlIIllI(var5.IlllIllIlIIIIlIIlIIllIIIl(), var5.IlIlllIIIIllIllllIllIIlIl() + 1.0F);
               }
            }
         }
      }

   }

   private void IlllIIIlIlllIllIlIIlllIlI(float var1) {
      Iterator var2 = this.IllIlIlIllllIlIIllllIIlll.iterator();

      while(var2.hasNext()) {
         lIlIlIIIIllIlllIlIIlllIlI var3 = (lIlIlIIIIllIlllIlIIlllIlI)var2.next();
         var3.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var3.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl() + var1, var3.lIIIIlIIllIIlIIlIIIlIIllI.IlIlllIIIIllIllllIllIIlIl());
      }

   }

   private void IIIIllIlIIIllIlllIlllllIl(float var1) {
      Iterator var2 = this.IllIlIlIllllIlIIllllIIlll.iterator();

      while(var2.hasNext()) {
         lIlIlIIIIllIlllIlIIlllIlI var3 = (lIlIlIIIIllIlllIlIIlllIlI)var2.next();
         var3.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var3.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl(), var3.lIIIIlIIllIIlIIlIIIlIIllI.IlIlllIIIIllIllllIllIIlIl() + var1);
      }

   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1, int var2, int var3, int var4) {
      Iterator var5 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

      while(var5.hasNext()) {
         IlIIIIlllIIIlIIllllIIIlll var6 = (IlIIIIlllIIIlIIllllIIIlll)var5.next();
         if (var6.llIlIIIlIIIIlIlllIlIIIIll() != null && var6.IlIlIIIlllIIIlIlllIlIllIl() && (!var6.IIIllIllIlIlllllllIlIlIII().contains("Zans") || !cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI().lIIIIIIIIIlIllIIllIlIIlIl().IIIIllIlIIIllIlllIlllllIl)) {
            float var7 = var6.llIlIIIllIIIIlllIlIIIIIlI;
            float var8 = var6.lIllIlIlllIIlIIllIIlIIlII;
            float var9 = (float)18;
            if (var7 < var9) {
               var6.llIlIIIllIIIIlllIlIIIIIlI = var9;
            }

            if (var8 < (float)18) {
               var6.lIllIlIlllIIlIIllIIlIIlII = (float)18;
            }

            float[] var10 = var6.lIIIIlIIllIIlIIlIIIlIIllI(var1, true);
            boolean var11 = (float)var2 > var10[0] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var10[0] + var6.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 > var10[1] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 < (var10[1] + var6.lIllIlIlllIIlIIllIIlIIlII) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            if (var11) {
               boolean var12 = !var6.llIIlllIIIIlllIllIlIlllIl().isEmpty() && (float)var2 >= var10[0] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var10[0] + (float)10) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 >= (var10[1] + var6.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 <= (var10[1] + var6.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               boolean var13 = (float)var2 > (var10[0] + var6.llIlIIIllIIIIlllIlIIIIIlI - (float)10) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var10[0] + var6.llIlIIIllIIIIlllIlIIIIIlI + 2.0F) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 > (var10[1] + var6.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 < (var10[1] + var6.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               if (var4 == 0 && !var12 && !var13 && var6 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl) {
                  boolean var14 = true;
                  if (this.lIIIIlIIllIIlIIlIIIlIIllI(var6) != null) {
                     this.lIIIIIIIIIlIllIIllIlIIlIl(var6);
                     var14 = false;
                  }

                  float var15 = (float)var2 - var6.IlllIllIlIIIIlIIlIIllIIIl() * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  float var16 = (float)var3 - var6.IlIlllIIIIllIllllIllIIlIl() * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
                  this.IIlIIllIIIllllIIlllIllIIl = (float)var2;
                  this.lllIlIIllllIIIIlIllIlIIII = (float)var3;
                  this.IlIlIIIlllllIIIlIlIlIllII = false;
                  IllIIlllIllIlIllIlIIIIIII = var6;
                  if (this.lIIIIlIIllIIlIIlIIIlIIllI(var6) == null) {
                     if (!llIlIIIllIIIIlllIlIIIIIlI() && var14) {
                        this.IllIlIlIllllIlIIllllIIlll.clear();
                     }

                     if (var14 || !llIlIIIllIIIIlllIlIIIIIlI()) {
                        this.IllIlIlIllllIlIIllllIIlll.add(new lIlIlIIIIllIlllIlIIlllIlI(var6, var15, var16));
                     }
                  }

                  this.IlllIIIlIlllIllIlIIlllIlI(var1, var2, var3);
               }

               if (var4 != 0 || this.lIIIIllIIlIlIllIIIlIllIlI != null && this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var2, var3)) {
                  if (var4 == 1) {
                     lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                     float[] var17 = IllIlIlllIIllIlIIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var6.llIlIIIlIIIIlIlllIlIIIIll());
                     var6.lIIIIlIIllIIlIIlIIIlIIllI(var17[0], var17[1]);
                  }
               } else if (var12) {
                  lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                  ((lIlIIllIIIlllIIllIIlIIllI)this.IIIIllIIllIIIIllIllIIIlIl).llIlIIIlIIIIlIlllIlIIIIll = false;
                  ((lIlIIllIIIlllIIllIIlIIllI)this.IIIIllIIllIIIIllIllIIIlIl).IIIlIIllllIIllllllIlIIIll = var6;
                  this.IlllIllIlIIIIlIIlIIllIIIl = this.IIIIllIIllIIIIllIllIIIlIl;
               } else if (var13) {
                  lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                  var6.lIIIIlIIllIIlIIlIIIlIIllI(false);
               }

               if (var6 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl) {
                  break;
               }
            }
         }
      }

   }

   private void IlllIIIlIlllIllIlIIlllIlI(int var1, int var2, int var3) {
      Iterator var4 = this.lIlIlIllIIIIIIIIllllIIllI.iterator();

      while(true) {
         while(true) {
            llllIIIIIlIlIlIlIllIIIIII var5;
            do {
               do {
                  do {
                     if (!var4.hasNext()) {
                        return;
                     }

                     var5 = (llllIIIIIlIlIlIlIllIIIIII)var4.next();
                  } while(var3 != 0);
               } while(!var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2));
            } while(IlIlllIIIIllIllllIllIIlIl);

            if (var5.lIIIIllIIlIlIllIIIlIllIlI != null && this.lIIIIllIIlIlIllIIIlIllIlI != var5.lIIIIllIIlIlIllIIIlIllIlI && this.IlllIllIlIIIIlIIlIIllIIIl == null) {
               lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
               this.IlllIllIlIIIIlIIlIIllIIIl = var5.lIIIIllIIlIlIllIIIlIllIlI;
            } else if (var5.lIIIIllIIlIlIllIIIlIllIlI != null && this.IlllIllIlIIIIlIIlIIllIIIl == null) {
               lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
               IlIlllIIIIllIllllIllIIlIl = true;
            }
         }
      }
   }

   private IlIIIIlllIIIlIIllllIIIlll lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1, int var2, int var3) {
      Iterator var4 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

      IlIIIIlllIIIlIIllllIIIlll var5;
      boolean var7;
      boolean var8;
      do {
         do {
            if (!var4.hasNext()) {
               return null;
            }

            var5 = (IlIIIIlllIIIlIIllllIIIlll)var4.next();
         } while(var5.llIlIIIlIIIIlIlllIlIIIIll() == null);

         float[] var6 = var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, true);
         var7 = !var5.llIIlllIIIIlllIllIlIlllIl().isEmpty() && (float)var2 >= var6[0] * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 <= (var6[0] + (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 >= (var6[1] + var5.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 <= (var6[1] + var5.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
         var8 = (float)var2 > (var6[0] + var5.llIlIIIllIIIIlllIlIIIIIlI - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var6[0] + var5.llIlIIIllIIIIlllIlIIIIIlI + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 > (var6[1] + var5.lIllIlIlllIIlIIllIIlIIlII - (float)10) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 < (var6[1] + var5.lIllIlIlllIIlIIllIIlIIlII + 2.0F) * (Float)var5.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
      } while(!var8 && !var7);

      return var5;
   }

   private boolean lIIIIIIIIIlIllIIllIlIIlIl(llIIllIIIllIIlIlIIIIIIIII var1, int var2, int var3) {
      boolean var4 = false;
      Iterator var5 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

      while(true) {
         IlIIIIlllIIIlIIllllIIIlll var6;
         do {
            if (!var5.hasNext()) {
               return var4;
            }

            var6 = (IlIIIIlllIIIlIIllllIIIlll)var5.next();
         } while(var6.llIlIIIlIIIIlIlllIlIIIIll() == null);

         float[] var7 = var6.lIIIIlIIllIIlIIlIIIlIIllI(var1, true);
         boolean var8 = (float)var2 > var7[0] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var2 < (var7[0] + var6.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 > var7[1] * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var3 < (var7[1] + var6.lIllIlIlllIIlIIllIIlIIlII) * (Float)var6.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
         var4 = var4 || var8;
      }
   }

   private boolean lIIIIlIIllIIlIIlIIIlIIllI(float var1, IlIIIIlllIIIlIIllllIIIlll var2, llIIllIIIllIIlIlIIIIIIIII var3, int var4, int var5, boolean var6) {
      if (var2.llIlIIIlIIIIlIlllIlIIIIll() != null && var2.IlIlIIIlllIIIlIlllIlIllIl() && var2 != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl && (var2.IIIlIIlIlIIIlllIIlIllllll || var2.IIIlllIIIllIllIlIIIIIIlII())) {
         boolean var7 = false;
         float var8 = (float)18;
         if (var2.llIlIIIllIIIIlllIlIIIIIlI < var8) {
            var2.llIlIIIllIIIIlllIlIIIIIlI = (float)((int)var8);
         }

         if (var2.lIllIlIlllIIlIIllIIlIIlII < (float)18) {
            var2.lIllIlIlllIIlIIllIIlIIlII = (float)18;
         }

         GL11.glPushMatrix();
         float[] var9 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var3, true);
         var2.lIIIIlIIllIIlIIlIIIlIIllI(var3);
         boolean var10 = this.IIIIlIIIlllllllllIlllIlll != -1;
         if (var10) {
            Rectangle var11 = new Rectangle((int)(var9[0] * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 2.0F), (int)(var9[1] * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 2.0F), (int)(var2.llIlIIIllIIIIlllIlIIIIIlI * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)4), (int)(var2.lIllIlIlllIIlIIllIIlIIlII * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)4));
            int var12 = Math.min(this.IIIIlIIIlllllllllIlllIlll, var4);
            int var13 = Math.min(this.IlIllllIIIlIllllIIIIIllII, var5);
            int var14 = Math.max(this.IIIIlIIIlllllllllIlllIlll, var4) - var12;
            int var15 = Math.max(this.IlIllllIIIlIllllIIIIIllII, var5) - var13;
            Rectangle var16 = new Rectangle(var12, var13, var14, var15);
            var10 = var11.intersects(var16);
         }

         float[] var19 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var3, true);
         boolean var20 = (float)var4 > var19[0] * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 < (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 > var19[1] * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 < (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
         if (!this.IlIIIIllIIIIIlllIIlIIlllI) {
            if (this.lIIIIlIIllIIlIIlIIIlIIllI(var2) == null && !var10) {
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, var2.llIlIIIllIIIIlllIlIIIIIlI, var2.lIllIlIlllIIlIIllIIlIIlII, 1.2179487F * 0.41052634F, 1879048191, 452984831);
            } else {
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, var2.llIlIIIllIIIIlllIlIIIIIlI, var2.lIllIlIlllIIlIIllIIlIIlII, 2.064516F * 0.2421875F, -1627324417, 452984831);
            }
         }

         boolean var23;
         if (!this.IlIIIIllIIIIIlllIIlIIlllI && var20) {
            boolean var21 = !var2.llIIlllIIIIlllIllIlIlllIl().isEmpty() && (float)var4 >= (var19[0] + 2.0F) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 <= (var19[0] + (float)10) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 >= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - (float)8) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 <= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - 2.0F) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            var23 = (float)var4 > (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI - (float)10) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 < (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI - 2.0F) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 > (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - (float)8) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 < (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - 2.0F) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            if (!var2.llIIlllIIIIlllIllIlIlllIl().isEmpty()) {
               GL11.glColor4f(1.0F, 1.0F, 1.0F, var21 ? 1.0F : 0.20895523F * 2.8714287F);
               lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIllIlIlllIIlIIllIIlIIlII, (float)3, 2.0F, var2.lIllIlIlllIIlIIllIIlIIlII - 2.162162F * 3.4687502F);
            }

            GL11.glColor4f(1.2952381F * 0.61764705F, 0.4181818F * 0.47826087F, 0.09268292F * 2.1578948F, var23 ? 1.0F : 2.025F * 0.2962963F);
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIlIlIIIlllIIlIllllll, (float)3, var2.llIlIIIllIIIIlllIlIIIIIlI - (float)8, var2.lIllIlIlllIIlIIllIIlIIlII - 0.2972973F * 25.227272F);
         }

         GL11.glPushMatrix();
         float var22 = var1 / (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
         GL11.glScalef(var22, var22, var22);
         if (var6) {
            var23 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var2 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.lIIIIIIIIIlIllIIllIlIIlIl || !var20 && (float)var4 >= (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 <= (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 >= (var19[1] - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 <= (var19[1] + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            boolean var24 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var2 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.IlllIIIlIlllIllIlIIlllIlI || !var20 && (float)var4 >= (var19[0] - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 <= (var19[0] + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 >= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 <= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            boolean var26 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var2 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.lIIIIlIIllIIlIIlIIIlIIllI || !var20 && (float)var4 >= (var19[0] - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 <= (var19[0] + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 >= (var19[1] - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 <= (var19[1] + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            boolean var17 = this.llIlIlIllIlIIlIlllIllIIlI != null && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI == var2 && this.llIlIlIllIlIIlIlllIllIIlI.lIIIIllIIlIlIllIIIlIllIlI == lIIIIIIlIIllllllIIIlIlIIl.IIIIllIlIIIllIlllIlllllIl || !var20 && (float)var4 >= (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var4 <= (var19[0] + var2.llIlIIIllIIIIlllIlIIIIIlI + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 >= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII - (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() && (float)var5 <= (var19[1] + var2.lIllIlIlllIIlIIllIIlIIlII + (float)5) * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
            GL11.glPushMatrix();
            float var18 = (float)4;
            if (this.IIIIlIIIlllllllllIlllIlll == -1 && var26) {
               GL11.glTranslatef(0.0F, 0.0F, 0.0F);
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(-var18 / 2.0F, -var18 / 2.0F, var18 / 2.0F, var18 / 2.0F, -16711936);
            }

            if (this.IIIIlIIIlllllllllIlllIlll == -1 && var23) {
               GL11.glTranslatef(var2.llIlIIIllIIIIlllIlIIIIIlI / var22, 0.0F, 0.0F);
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(-var18 / 2.0F, -var18 / 2.0F, var18 / 2.0F, var18 / 2.0F, -16711936);
            }

            if (this.IIIIlIIIlllllllllIlllIlll == -1 && var17) {
               GL11.glTranslatef(var2.llIlIIIllIIIIlllIlIIIIIlI / var22, var2.lIllIlIlllIIlIIllIIlIIlII / var22, 0.0F);
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(-var18 / 2.0F, -var18 / 2.0F, var18 / 2.0F, var18 / 2.0F, -16711936);
            }

            if (this.IIIIlIIIlllllllllIlllIlll == -1 && var24) {
               GL11.glTranslatef(0.0F, var2.lIllIlIlllIIlIIllIIlIIlII / var22, 0.0F);
               IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(-var18 / 2.0F, -var18 / 2.0F, var18 / 2.0F, var18 / 2.0F, -16711936);
            }

            GL11.glPopMatrix();
            var7 = this.IIIIlIIIlllllllllIlllIlll == -1 && (var26 || var23 || var24 || var17);
         }

         var23 = var9[1] - (float)cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI() - (float)6 < 0.0F;
         float var25 = var23 ? var2.lIllIlIlllIIlIIllIIlIIlII * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() / var1 : (float)(-cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI() - 4);
         float var27;
         
         if (!this.hideText) { // hide "mod name" text whenever hiding boxes.
	         switch(IllIIIlIIlIllIllIIllllIIl.lIIIIIIIIIlIllIIllIlIIlIl[var2.IIIlIIllllIIllllllIlIIIll().ordinal()]) {
		         case 1:
		            var27 = 0.0F;
		            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIllIllIlIlllllllIlIlIII(), (double)var27, (double)var25, -1);
		            break;
		         case 2:
		            var27 = var2.llIlIIIllIIIIlllIlIIIIIlI * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() / var1 / 2.0F;
		            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI(var2.IIIllIllIlIlllllllIlIlIII(), var27, var25, -1);
		            break;
		         case 3:
		            var27 = var2.llIlIIIllIIIIlllIlIIIIIlI * (Float)var2.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() / var1 - (float)cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var2.IIIllIllIlIlllllllIlIlIII());
		            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIllIllIlIlllllllIlIlIII(), (double)var27, (double)var25, -1);
	         }
         }

         GL11.glPopMatrix();
         GL11.glPopMatrix();
         return !var7;
      } else {
         return true;
      }
   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIIllIIlIlIIIIIIIII var1) {
      if (!Mouse.isButtonDown(1) && IllIIlllIllIlIllIlIIIIIII != null) {
         List var2 = this.IllIlIlIllllIlIIllllIIlll;
         Iterator var3 = this.IllIlIlIllllIlIIllllIIlll.iterator();

         label137:
         while(true) {
            lIlIlIIIIllIlllIlIIlllIlI var4;
            do {
               do {
                  if (!var3.hasNext()) {
                     return;
                  }

                  var4 = (lIlIlIIIIllIlllIlIIlllIlI)var3.next();
               } while(var4.lIIIIlIIllIIlIIlIIIlIIllI != IllIIlllIllIlIllIlIIIIIII);
            } while(!(Boolean)cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().lIlIlIllIIIIIIIIllllIIllI.IIIIllIlIIIllIlllIlllllIl());

            Object var5 = null;
            Iterator var6 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

            while(true) {
               IlIIIIlllIIIlIIllllIIIlll var7;
               do {
                  do {
                     do {
                        do {
                           do {
                              do {
                                 if (!var6.hasNext()) {
                                    continue label137;
                                 }

                                 var7 = (IlIIIIlllIIIlIIllllIIIlll)var6.next();
                              } while(this.lIIIIlIIllIIlIIlIIIlIIllI(var7) != null);
                           } while(var7.llIlIIIlIIIIlIlllIlIIIIll() == null);
                        } while(!var7.IlIlIIIlllIIIlIlllIlIllIl());
                     } while(var7 == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl);
                  } while(!var7.IIIlIIlIlIIIlllIIlIllllll && !var7.IIIlllIIIllIllIlIIIIIIlII());
               } while(var5 != null && var5 != var7);

               float var8 = (float)18;
               if (var7.llIlIIIllIIIIlllIlIIIIIlI < var8) {
                  var7.llIlIIIllIIIIlllIlIIIIIlI = (float)((int)var8);
               }

               if (var7.lIllIlIlllIIlIIllIIlIIlII < (float)18) {
                  var7.lIllIlIlllIIlIIllIIlIIlII = (float)18;
               }

               if (var4.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI < var8) {
                  var4.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI = (float)((int)var8);
               }

               if (var4.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII < (float)18) {
                  var4.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII = (float)18;
               }

               float[] var9 = var7.lIIIIlIIllIIlIIlIIIlIIllI(var1, true);
               float[] var10 = var4.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var1, true);
               boolean var11 = false;
               float var12 = var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var10[0] * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var13 = (var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var10[0] + var4.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var14 = (var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var10[0] * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var15 = var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var10[0] + var4.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var16 = var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var10[1] * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var17 = (var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var10[1] + var4.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII) * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var18 = (var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - var10[1] * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               float var19 = var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (var10[1] + var4.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII) * (Float)var4.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl();
               byte var20 = 2;
               if (var12 >= (float)(-var20) && var12 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 0.6666667F * 0.75F), 0.0D, (double)(var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -3596854);
               }

               if (var13 >= (float)(-var20) && var13 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(((var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), 0.0D, (double)((var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 1.7272727F * 0.28947368F), (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -3596854);
               }

               if (var15 >= (float)(-var20) && var15 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), 0.0D, (double)(var9[0] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 0.29775283F * 1.6792452F), (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -3596854);
               }

               if (var14 >= (float)(-var20) && var14 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(((var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), 0.0D, (double)((var9[0] + var7.llIlIIIllIIIIlllIlIIIIIlI) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 1.5238096F * 0.328125F), (double)this.IIIIIIlIlIlIllllllIlllIlI, 0.0D, -3596854);
               }

               if (var16 >= (float)(-var20) && var16 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (double)this.lIIIIIllllIIIIlIlIIIIlIlI, (double)(var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 0.3888889F * 1.2857143F), 0.0D, -3596854);
               }

               if (var17 >= (float)(-var20) && var17 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, ((var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (double)this.lIIIIIllllIIIIlIlIIIIlIlI, (double)((var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 0.51724136F * 0.9666667F), 0.0D, -3596854);
               }

               if (var19 >= (float)(-var20) && var19 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), (double)this.lIIIIIllllIIIIlIlIIIIlIlI, (double)(var9[1] * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + 0.16666667F * 3.0F), 0.0D, -3596854);
               }

               if (var18 >= (float)(-var20) && var18 <= (float)var20) {
                  var11 = true;
                  lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, ((var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - 0.5810811F * 0.8604651F), (double)this.lIIIIIllllIIIIlIlIIIIlIlI, (double)((var9[1] + var7.lIllIlIlllIIlIIllIIlIIlII) * (Float)var7.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()), 0.0D, -3596854);
               }

               if (var11) {
                  GL11.glPushMatrix();
                  var7.lIIIIlIIllIIlIIlIIIlIIllI(var1);
                  IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, var7.llIlIIIllIIIIlllIlIIIIIlI, var7.lIllIlIlllIIlIIllIIlIIlII, 0.01923077F * 26.0F, 0, 449387978);
                  GL11.glPopMatrix();
               }
            }
         }
      }
   }

   private float lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1, float var2, float[] var3, int var4) {
      float var5 = var2;
      float var6 = 2.0F;
      if (var2 + var3[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() < var6) {
         var5 = -var3[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + var6;
      } else if (var2 + var3[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)var4 > (float)this.lIIIIIllllIIIIlIlIIIIlIlI - var6) {
         var5 = (float)this.lIIIIIllllIIIIlIlIIIIlIlI - var3[0] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (float)var4 - var6;
      }

      return var5;
   }

   private float lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1, float var2, float[] var3, int var4) {
      float var5 = var2;
      float var6 = 2.0F;
      if (var2 + var3[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() < var6) {
         var5 = -var3[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + var6;
      } else if (var2 + var3[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() + (float)var4 > (float)this.IIIIIIlIlIlIllllllIlllIlI - var6) {
         var5 = (float)this.IIIIIIlIlIlIllllllIlllIlI - var3[1] * (Float)var1.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl() - (float)var4 - var6;
      }

      return var5;
   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(lIlIlIIIIllIlllIlIIlllIlI var1, int var2, int var3, llIIllIIIllIIlIlIIIIIIIII var4) {
      if (var1.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() != null && var1.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl() && var1.lIIIIlIIllIIlIIlIIIlIIllI != cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl && (var1.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll || var1.lIIIIlIIllIIlIIlIIIlIIllI.IIIlllIIIllIllIlIIIIIIlII())) {
         float var5 = (float)var2 - var1.lIIIIIIIIIlIllIIllIlIIlIl;
         float var6 = (float)var3 - var1.IlllIIIlIlllIllIlIIlllIlI;
         if (!this.IlIlIIIlllllIIIlIlIlIllII && var1.lIIIIlIIllIIlIIlIIIlIIllI == IllIIlllIllIlIllIlIIIIIII && ((float)var2 != this.IIlIIllIIIllllIIlllIllIIl || (float)var3 != this.lllIlIIllllIIIIlIllIlIIII)) {
            if (this.lIIIIlllIIlIlllllIlIllIII.size() > 50) {
               this.lIIIIlllIIlIlllllIlIllIII.remove(0);
            }

            this.lIIIIlllIIlIlllllIlIllIII.add(new IIlIlllIllIlIlIIIIIlllIll(this, this.IllIlIlIllllIlIIllllIIlll));
            cb.IIIIllIlIIIllIlllIlllllIl().IIIlllIIIllIllIlIIIIIIlII();
            this.IlIlIIIlllllIIIlIlIlIllII = true;
         }

         float[] var7 = var1.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var4, false);
         if (!Mouse.isButtonDown(1) && this.IlIlIIIlllllIIIlIlIlIllII && var1.lIIIIlIIllIIlIIlIIIlIIllI == IllIIlllIllIlIllIlIIIIIII) {
            float var8 = var5;
            float var9 = var6;
            var5 = this.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIlIIllIIlIIlIIIlIIllI, var5, var7, (int)(var1.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI * (Float)var1.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
            var6 = this.lIIIIIIIIIlIllIIllIlIIlIl(var1.lIIIIlIIllIIlIIlIIIlIIllI, var6, var7, (int)(var1.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII * (Float)var1.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
            float var10 = var8 - var5;
            float var11 = var9 - var6;
            Iterator var12 = this.IllIlIlIllllIlIIllllIIlll.iterator();

            while(var12.hasNext()) {
               lIlIlIIIIllIlllIlIIlllIlI var13 = (lIlIlIIIIllIlllIlIIlllIlI)var12.next();
               if (var13 != var1) {
                  var7 = var13.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var4, false);
                  float var14 = this.lIIIIlIIllIIlIIlIIIlIIllI(var13.lIIIIlIIllIIlIIlIIIlIIllI, var13.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl() - var10, var7, (int)(var13.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIllIIIIlllIlIIIIIlI * (Float)var13.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
                  float var15 = this.lIIIIIIIIIlIllIIllIlIIlIl(var13.lIIIIlIIllIIlIIlIIIlIIllI, var13.lIIIIlIIllIIlIIlIIIlIIllI.IlIlllIIIIllIllllIllIIlIl() - var11, var7, (int)(var13.lIIIIlIIllIIlIIlIIIlIIllI.lIllIlIlllIIlIIllIIlIIlII * (Float)var13.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI.IIIIllIlIIIllIlllIlllllIl()));
                  var13.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var14, var15);
               }
            }
         }

         if (this.IlIlIIIlllllIIIlIlIlIllII) {
            var1.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var5, var6);
         }

      }
   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(int var1) {
      if (IlIlllIIIIllIllllIllIIlIl) {
         if (this.lIIIIllIIlIlIllIIIlIllIlI != null) {
            this.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIllIIlIlIllIIIlIllIlI, true, var1);
         }
      } else if (this.IlllIllIlIIIIlIIlIIllIIIl != null) {
         if (this.lIIIIllIIlIlIllIIIlIllIlI != null) {
            this.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIllIIlIlIllIIIlIllIlI, true, var1);
         }

         this.lIIIIlIIllIIlIIlIIIlIIllI(this.IlllIllIlIIIIlIIlIIllIIIl, false, var1);
      }

   }

   private void lIIIIlIIllIIlIIlIIIlIIllI(lllIllIllIlIllIlIIllllIIl var1, boolean var2, int var3) {
      if (var2) {
         var1.IIIIllIlIIIllIlllIlllllIl = var1.IlIlllIIIIllIllllIllIIlIl;
         IlIlllIIIIllIllllIllIIlIl = false;
         this.lIIIIllIIlIlIllIIIlIllIlI = null;
      } else {
         var1.IIIIllIlIIIllIlllIlllllIl = var3 / 2 - 185;
         this.IlllIllIlIIIIlIIlIIllIIIl = null;
         this.lIIIIllIIlIlIllIIIlIllIlI = var1;
      }

   }

   public static float lIIIIlIIllIIlIIlIIIlIIllI(float var0) {
      float var1 = var0 / (float)(lIIIllIllIllIlllIlIIlIlII.IIIlIIlIlIIIlllIIlIllllll + 1);
      return var1 < 1.0F ? 1.0F : var1;
   }

   private lIlIlIIIIllIlllIlIIlllIlI lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1) {
      Iterator var2 = this.IllIlIlIllllIlIIllllIIlll.iterator();

      lIlIlIIIIllIlllIlIIlllIlI var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (lIlIlIIIIllIlllIlIIlllIlI)var2.next();
      } while(var1 != var3.lIIIIlIIllIIlIIlIIIlIIllI);

      return var3;
   }

   private void IlllIIIlIlllIllIlIIlllIlI(llIIllIIIllIIlIlIIIIIIIII var1, int var2, int var3) {
      Iterator var4 = this.IllIlIlIllllIlIIllllIIlll.iterator();

      while(var4.hasNext()) {
         lIlIlIIIIllIlllIlIIlllIlI var5 = (lIlIlIIIIllIlllIlIIlllIlI)var4.next();
         if (var5.lIIIIlIIllIIlIIlIIIlIIllI != null && var5.lIIIIlIIllIIlIIlIIIlIIllI.llIlIIIlIIIIlIlllIlIIIIll() != null) {
            var5.lIIIIIIIIIlIllIIllIlIIlIl = (float)var2 - var5.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl();
            var5.IlllIIIlIlllIllIlIIlllIlI = (float)var3 - var5.lIIIIlIIllIIlIIlIIIlIIllI.IlIlllIIIIllIllllIllIIlIl();
         }
      }

   }

   private void lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1) {
      this.IllIlIlIllllIlIIllllIIlll.removeIf((var1x) -> {
         return var1x.lIIIIlIIllIIlIIlIIIlIIllI == var1;
      });
   }
}
