import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.lwjgl.input.Keyboard;

public class lIlIIllIIIlllIIllIIlIIllI extends lllIllIllIlIllIlIIllllIIl {
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
   private final int lllIIIIIlIllIlIIIllllllII;
   protected final List<IlIIlllIlIIIlIIIlIlIlIlIl> lIIIIlIIllIIlIIlIIIlIIllI;
   private boolean lIIIIIllllIIIIlIlIIIIlIlI = false;
   private IllIIIIllllllIlllllIlIlll IIIIIIlIlIlIllllllIlllIlI;
   public lllIllIllIlIllIlIIllllIIl IIIlllIIIllIllIlIIIIIIlII;
   public boolean llIlIIIlIIIIlIlllIlIIIIll = false;
   public IlIIIIlllIIIlIIllllIIIlll IIIlIIllllIIllllllIlIIIll = null;
   private llllIIIIIlIlIlIlIllIIIIII IllIllIIIlIIlllIIIllIllII = null;
   private llllIIIIIlIlIlIlIllIIIIII IlIIlIIIIlIIIIllllIIlIllI = null;
   private Map lIIlIIllIIIIIlIllIIIIllII;
   private List<IlIIlllIlIIIlIIIlIlIlIlIl> lIIlllIIlIlllllllllIIIIIl;
   private float stopDeobfingMeBro;

   public lIlIIllIIIlllIIllIIlIIllI(List var1, float var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.lIIIIIllllIIIIlIlIIIIlIlI = var1 == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl;
      this.lllIIIIIlIllIlIIIllllllII = -12418828;
      this.IIIIIIlIlIlIllllllIlllIlI = new IllIIIIllllllIlllllIlIlll(this, this.lllIIIIIlIllIlIIIllllllII, var2);
      this.lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList<>();
      this.stopDeobfingMeBro = var2;
      Iterator var7 = var1.iterator();

      while(true) {
         IlIIIIlllIIIlIIllllIIIlll var8;
         do {
            if (!var7.hasNext()) {
               this.IllIllIIIlIIlllIIIllIllII = new llllIIIIIlIlIlIlIllIIIIII(null, "arrow-64.png", this.IIIIllIlIIIllIlllIlllllIl + 2, this.IIIIllIIllIIIIllIllIIIlIl + 4, 28, 28, -12418828, var2);
               this.IIIlIIllllIIllllllIlIIIll = null;
               this.lIIlIIllIIIIIlIllIIIIllII = new HashMap();
               var7 = var1.iterator();

               while(true) {
                  do {
                     do {
                        if (!var7.hasNext()) {
                           this.lIIlllIIlIlllllllllIIIIIl = new ArrayList();
                           var7 = cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IlIlIIIlllIIIlIlllIlIllIl.iterator();

                           while(true) {
                              while(var7.hasNext()) {
                                 lIIlIlllIIIIlIIIllIlIIIII var13 = (lIIlIlllIIIIlIIIllIlIIIII)var7.next();
                                 switch(lIIIlIIIIIIlIIlIIlIIlIIlI.lIIIIlIIllIIlIIlIIIlIIllI[var13.IlllIllIlIIIIlIIlIIllIIIl().ordinal()]) {
                                 case 1:
                                    if (var13 != cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIlIIllIIIllllIIlllIllIIl) {
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new IllIlIIIIlIlllIlllllllIIl(var13, var2));
                                    }
                                    break;
                                 case 2:
                                 case 3:
                                 case 4:
                                    if (var13.IlllIllIlIIIIlIIlIIllIIIl().equals(llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl) && var13.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("color")) {
                                       if (var13.IlIlIIIlllIIIlIlllIlIllIl().equals("Background color") && !cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI")) continue;
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new IIlllllIIlIlIIlIIlllIIIII(var13, var2));
                                    } else if (var13.IlIlIIIlllIIIlIlllIlIllIl().equals("World Time")) {
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new IIllllIIIIllIIlIllIIIIIlI(var13, var2));
                                    } else {
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new IlIlIIIlllIlIllIlIIIlllIl(var13, var2));
                                    }
                                    break;
                                 case 5:
                                    if (var13 != cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIlIIllIIIllllIIlllIllIIl) {
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new IIllIllIlIIlllllIlIIIlIll(var13, var2));
                                    }
                                    break;
                                 case 6:
                                    if (var13.IlIlIIIlllIIIlIlllIlIllIl().equalsIgnoreCase("label")) {
                                       if (var13.IIIIllIlIIIllIlllIlllllIl().equals("Theme Settings") && !cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI")) continue;
                                       this.lIIlllIIlIlllllllllIIIIIl.add(new lllIIlIIllIllIIllIIlIIIIl(var13, var2));
                                       if (cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl().equals(var13.IIIIllIlIIIllIlllIlllllIl())) {
                                          this.lIIlllIIlIlllllllllIIIIIl.add(new lIlIlIlIIlIlllIIIIIIllllI(var2));
                                       }
                                    }
                                 }
                              }

                              int var12 = 25;

                              IlIIlllIlIIIlIIIlIlIlIlIl var15;
                              for(Iterator var14 = this.lIIlllIIlIlllllllllIIIIIl.iterator(); var14.hasNext(); var12 += var15.lIIIIlIIllIIlIIlIIIlIIllI()) {
                                 var15 = (IlIIlllIlIIIlIIIlIlIlIlIl)var14.next();
                              }

                              int var10006 = this.IIIIllIlIIIllIlllIlllllIl + var5 - 120;
                              int var10007 = this.IIIIllIIllIIIIllIllIIIlIl + var12 + 4;
                              this.IlIIlIIIIlIIIIllllIIlIllI = new llllIIIIIlIlIlIlIllIIIIII(cb.IIIIllIlIIIllIlllIlllllIl().IlllIllIlIIIIlIIlIIllIIIl, (lllIllIllIlIllIlIIllllIIl)null, "Apply to all text", var10006, var10007, 110, 28, -12418828, var2);
                              return;
                           }
                        }

                        var8 = (IlIIIIlllIIIlIIllllIIIlll)var7.next();
                     } while(var8.IIIIllIlIIIllIlllIlllllIl() && !var8.IIIIllIIllIIIIllIllIIIlIl());
                  } while(var8 == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl);

                  ArrayList var9 = new ArrayList();
                  Iterator var10 = var8.llIIlllIIIIlllIllIlIlllIl().iterator();

                  while(true) {
                     while(var10.hasNext()) {
                        lIIlIlllIIIIlIIIllIlIIIII var11 = (lIIlIlllIIIIlIIIllIlIIIII)var10.next();
                        switch(lIIIlIIIIIIlIIlIIlIIlIIlI.lIIIIlIIllIIlIIlIIIlIIllI[var11.IlllIllIlIIIIlIIlIIllIIIl().ordinal()]) {
                        case 1:
                           var9.add(new IllIlIIIIlIlllIlllllllIIl(var11, var2));
                           break;
                        case 2:
                        case 3:
                        case 4:
                           if (var8.IIIIllIlIIIllIlllIlllllIl() && var11 == ((lIllIlIlIIlIllIllllIllIIl)var8).lIIIIlIIllIIlIIlIIIlIIllI() || var8.IIIIllIlIIIllIlllIlllllIl() && var11 == var8.IllIlIIIIlllIIllIIlllIIlI) {
                              break;
                           }

                           if (var11.IlllIllIlIIIIlIIlIIllIIIl().equals(llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl) && var11.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("color")) {
                              var9.add(new IIlllllIIlIlIIlIIlllIIIII(var11, var2));
                              break;
                           }

                           // OCB - Don't show scale in Motion Blur
                           if (var8.IIIllIllIlIlllllllIlIlIII().equals("Motion Blur") && var11.IlIlIIIlllIIIlIlllIlIllIl().equals("Scale")) break;


                           var9.add(new IlIlIIIlllIlIllIlIIIlllIl(var11, var2));
                           break;
                        case 5:
                           var9.add(new IIllIllIlIIlllllIlIIIlIll(var11, var2));
                           break;
                        case 6:
                           if (var11.IlIlIIIlllIIIlIlllIlIllIl().equalsIgnoreCase("label")) {
                              var9.add(new lllIIlIIllIllIIllIIlIIIIl(var11, var2));
                           }
                        }
                     }

                     if (var8.IIIIllIlIIIllIlllIlllllIl()) {
                        var9.add(new IlIllIIllIIIIIllIlIIIIIIl(((lIllIlIlIIlIllIllllIllIIl)var8).lIIIIlIIllIIlIIlIIIlIIllI(), var2));
                        if (var8 == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII) {
                           var9.add(new llllIIllIIlllllIlIlIIllll(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl(), "Blocks", var2));
                        }
                     }

                     this.lIIlIIllIIIIIlIllIIIIllII.put(var8, var9);
                     break;
                  }
               }
            }

            var8 = (IlIIIIlllIIIlIIllllIIIlll)var7.next();
         } while(var8.IIIIllIlIIIllIlllIlllllIl() && !var8.IIIIllIIllIIIIllIllIIIlIl());

         this.lIIIIlIIllIIlIIlIIIlIIllI.add(new IIllllIllllIIIlIIllllIlll(this, this.lllIIIIIlIllIlIIIllllllII, var8, var2));
      }
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
      IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
      lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((double)this.IIIIllIlIIIllIlllIlllllIl, (double)this.IIIIllIIllIIIIllIllIIIlIl, (double)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl), (double)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII + 2), (double)8, ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff303030 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.backgroundColorBecauseTellinqIsGay.lIIIIlIIllIIlIIlIIIlIIllI() : -657931);
      this.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2);
      int var4;
      if (this.IIIlIIllllIIllllllIlIIIll == null && !this.llIlIIIlIIIIlIlllIlIIIIll) {
         this.IlllIllIlIIIIlIIlIIllIIIl = 52;
         if (!this.lIIIIIllllIIIIlIlIIIIlIlI) {
            this.IIIIIIlIlIlIllllllIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + 4, this.IlIlIIIlllIIIlIlllIlIllIl - 12, 18);
            this.IIIIIIlIlIlIllllllIlllIlI.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
            this.IIIIIIlIlIlIllllllIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
         }

         for(var4 = 0; var4 < this.lIIIIlIIllIIlIIlIIIlIIllI.size(); ++var4) {
            IIllllIllllIIIlIIllllIlll var9 = (IIllllIllllIIIlIIllllIlll)this.lIIIIlIIllIIlIIlIIIlIIllI.get(var4);
            var9.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 4, this.IIIIllIIllIIIIllIllIIIlIl + (this.lIIIIIllllIIIIlIlIIIIlIlI ? 4 : 24) + var4 * 20, this.IlIlIIIlllIIIlIlllIlIllIl - 12, 18);
            var9.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
            var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
            this.IlllIllIlIIIIlIIlIIllIIIl += var9.lIIIIlIIllIIlIIlIIIlIIllI();
         }
      } else {
         Iterator var5;
         IlIIlllIlIIIlIIIlIlIlIlIl var6;
         if (this.llIlIIIlIIIIlIlllIlIIIIll && !this.lIIIIIllllIIIIlIlIIIIlIlI) {
            if (!cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI")) {
               List<IlIIlllIlIIIlIIIlIlIlIlIl> labelList = this.lIIlllIIlIlllllllllIIIIIl.stream().filter(com -> com instanceof lllIIlIIllIllIIllIIlIIIIl).collect(Collectors.toList());
               List<IlIIlllIlIIIlIIIlIlIlIlIl> colorPickerList = this.lIIlllIIlIlllllllllIIIIIl.stream().filter(com -> com instanceof IIlllllIIlIlIIlIIlllIIIII).collect(Collectors.toList());

               for (IlIIlllIlIIIlIIIlIlIlIlIl component : labelList) {
                  if (component instanceof lllIIlIIllIllIIllIIlIIIIl) {
                     lllIIlIIllIllIIllIIlIIIIl labelComponent = (lllIIlIIllIllIIllIIlIIIIl) component;
                     if (labelComponent.getModSetting().IIIIllIlIIIllIlllIlllllIl().equals("Theme Settings")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     }
                  }
               }

               for (IlIIlllIlIIIlIIIlIlIlIlIl component : colorPickerList) {
                  if (component instanceof IIlllllIIlIlIIlIIlllIIIII) {
                     IIlllllIIlIlIIlIIlllIIIII colorPickerComponent = (IIlllllIIlIlIIlIIlllIIIII) component;
                     if (colorPickerComponent.getModSetting().IlIlIIIlllIIIlIlllIlIllIl().equals("Background color")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     } else if (colorPickerComponent.getModSetting().IlIlIIIlllIIIlIlllIlIllIl().equals("Button color")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     } else if (colorPickerComponent.getModSetting().IlIlIIIlllIIIlIlllIlIllIl().equals("Label color")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     } else if (colorPickerComponent.getModSetting().IlIlIIIlllIIIlIlllIlIllIl().equals("General color")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     } else if (colorPickerComponent.getModSetting().IlIlIIIlllIIIlIlllIlIllIl().equals("Main Text color")) {
                        this.lIIlllIIlIlllllllllIIIIIl.remove(component);
                     }
                  }
               }
            } else {
               boolean whyDeobfMeBro = false;

               for (IlIIlllIlIIIlIIIlIlIlIlIl component : this.lIIlllIIlIlllllllllIIIIIl) {
                  if (component instanceof lllIIlIIllIllIIllIIlIIIIl) {
                     lllIIlIIllIllIIllIIlIIIIl newComponent = (lllIIlIIllIllIIllIIlIIIIl) component;
                     if (newComponent.getModSetting().IIIIllIlIIIllIlllIlllllIl().equals("Theme Settings")) {
                        whyDeobfMeBro = true;
                        break;
                     }
                  }
               }

               if (!whyDeobfMeBro) {
                  this.lIIlllIIlIlllllllllIIIIIl.add(3, new lllIIlIIllIllIIllIIlIIIIl(cbSettings.colorModeSettings, this.stopDeobfingMeBro));
                  this.lIIlllIIlIlllllllllIIIIIl.add(4, new IIlllllIIlIlIIlIIlllIIIII(cbSettings.backgroundColorBecauseTellinqIsGay, this.stopDeobfingMeBro));
                  this.lIIlllIIlIlllllllllIIIIIl.add(5, new IIlllllIIlIlIIlIIlllIIIII(cbSettings.labelColorTellinqIsCool, this.stopDeobfingMeBro));
                  this.lIIlllIIlIlllllllllIIIIIl.add(6, new IIlllllIIlIlIIlIIlllIIIII(cbSettings.buttonColorTellinqIsFat, this.stopDeobfingMeBro));
                  this.lIIlllIIlIlllllllllIIIIIl.add(7, new IIlllllIIlIlIIlIIlllIIIII(cbSettings.mainColor, this.stopDeobfingMeBro));
                  this.lIIlllIIlIlllllllllIIIIIl.add(8, new IIlllllIIlIlIIlIIlllIIIII(cbSettings.mainTextColor, this.stopDeobfingMeBro));
               }
            }

            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 32), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), (float)(this.IIIIllIlIIIllIlllIlllllIl + 33), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 4), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff27272 : 791621423);
            this.IlllIllIlIIIIlIIlIIllIIIl = 25;
            this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 2, this.IIIIllIIllIIIIllIllIIIlIl + 2, 28, 28);
            this.IllIllIIIlIIlllIIIllIllII.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
            this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("CheatBreaker Settings".toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 6), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1358954496);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 17), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 6), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 18), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
            var4 = 0;


            for(var5 = this.lIIlllIIlIlllllllllIIIIIl.iterator(); var5.hasNext(); this.IlllIllIlIIIIlIIlIIllIIIl += 2 + var6.lIIIIlIIllIIlIIlIIIlIIllI()) {
               var6 = (IlIIlllIlIIIlIIIlIlIlIlIl)var5.next();
               var6.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 38, this.IIIIllIIllIIIIllIllIIIlIl + 22 + var4, this.IlIlIIIlllIIIlIlllIlIllIl - 40, var6.lIIIIlIIllIIlIIlIIIlIIllI());
               var6.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
               var4 += 2 + var6.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            this.IlIIlIIIIlIIIIllllIIlIllI.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
            this.IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 118, this.IIIIllIIllIIIIllIllIIIlIl + this.IlllIllIlIIIIlIIlIIllIIIl, 100, 20);
            this.IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
            this.IlllIllIlIIIIlIIlIIllIIIl += 24;
         } else {
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 32), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 4), (float)(this.IIIIllIlIIIllIlllIlllllIl + 33), (float)(this.IIIIllIIllIIIIllIllIIIlIl + (this.IIIllIllIlIlllllllIlIlIII > this.IlllIllIlIIIIlIIlIIllIIIl ? this.IIIllIllIlIlllllllIlIlIII : this.IlllIllIlIIIIlIIlIIllIIIl) - 4), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
            this.IlllIllIlIIIIlIIlIIllIIIl = 37;
            this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 2, this.IIIIllIIllIIIIllIllIIIlIl + 2, 28, 28);
            this.IllIllIIIlIIlllIIIllIllII.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
            this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
            cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((this.IIIlIIllllIIllllllIlIIIll.IIIllIllIlIlllllllIlIlIII() + " Settings").toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 6), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1358954496);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 17), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl - 12), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 18), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : 791621423);
            if (this.IIIlIIllllIIllllllIlIIIll == cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl) {
               try {
                  String var8 = Keyboard.getKeyName(cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI().lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlllIIlIlllllIlIllIII.lIIIIllIIlIlIllIIIlIllIlI());
                  cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(("PRESS '" + var8 + "' INGAME FOR ZAN'S MINIMAP OPTIONS.").toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 22), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
               } catch (Exception var7) {
            	   cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI("PRESS 'M' INGAME FOR ZAN'S MINIMAP OPTIONS.".toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 22), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
               }

               this.IlllIIIlIlllIllIlIIlllIlI(var1, var2);
               return;
            }

            if (this.IIIlIIllllIIllllllIlIIIll.llIIlllIIIIlllIllIlIlllIl().isEmpty()) {
            	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI((this.IIIlIIllllIIllllllIlIIIll.IIIllIllIlIlllllllIlIlIII().toUpperCase() + " DOES NOT HAVE ANY OPTIONS.").toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 38), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 22), ((String)cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : -1895825408);
            }

            var4 = 0;

            for(var5 = ((List)this.lIIlIIllIIIIIlIllIIIIllII.get(this.IIIlIIllllIIllllllIlIIIll)).iterator(); var5.hasNext(); this.IlllIllIlIIIIlIIlIIllIIIl += 2 + var6.lIIIIlIIllIIlIIlIIIlIIllI()) {
               var6 = (IlIIlllIlIIIlIIIlIlIlIlIl)var5.next();
               var6.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl + 38, this.IIIIllIIllIIIIllIllIIIlIl + 22 + var4, this.IlIlIIIlllIIIlIlllIlIllIl - 40, var6.lIIIIlIIllIIlIIlIIIlIIllI());
               var6.IlllIIIlIlllIllIlIIlllIlI = this.lIIIIllIIlIlIllIIIlIllIlI;
               var6.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
               var4 += 2 + var6.lIIIIlIIllIIlIIlIIIlIIllI();
            }
         }
      }

      this.IlllIIIlIlllIllIlIIlllIlI(var1, var2);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3) {
      Iterator var4;
      if (this.IIIlIIllllIIllllllIlIIIll == null && !this.llIlIIIlIIIIlIlllIlIIIIll) {
         if (!this.IIIIIIlIlIlIllllllIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) || this.lIIIIIllllIIIIlIlIIIIlIlI) {
            var4 = this.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

            while(var4.hasNext()) {
               IIllllIllllIIIlIIllllIlll var9 = (IIllllIllllIIIlIIllllIlll)var4.next();
               if (var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && this.lIIIIlIIllIIlIIlIIIlIIllI(var9.lIIIIlIIllIIlIIlIIIlIIllI)) {
                  var9.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
               }
            }
         } else {
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.llIlIIIlIIIIlIlllIlIIIIll = true;
            this.lIIIIllIIlIlIllIIIlIllIlI = 0;
            this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
            this.IlllIIIlIlllIllIlIIlllIlI = 0;
         }
      } else if (this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
         this.IIIlIIllllIIllllllIlIIIll = null;
         this.llIlIIIlIIIIlIlllIlIIIIll = false;
         if (this.IIIlllIIIllIllIlIIIIIIlII != null) {
            lIIlIlIIlIlIlIIlIlIlllIIl.lIIIIlIIllIIlIIlIIIlIIllI.IlllIllIlIIIIlIIlIIllIIIl = this.IIIlllIIIllIllIlIIIIIIlII;
         }
      } else {
         IlIIlllIlIIIlIIIlIlIlIlIl var5;
         if (this.IIIlIIllllIIllllllIlIIIll != null) {
        	 if (this.lIIlIIllIIIIIlIllIIIIllII.get(this.IIIlIIllllIIllllllIlIIIll) != null) { // prevent null
	            var4 = ((List)this.lIIlIIllIIIIIlIllIIIIllII.get(this.IIIlIIllllIIllllllIlIIIll)).iterator();
	            
		            while(var4.hasNext()) {
		               var5 = (IlIIlllIlIIIlIIIlIlIlIlIl)var4.next();
		               if (var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
		                  var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
		               }
		            }
	            }
         } else if (this.llIlIIIlIIIIlIlllIlIIIIll) {
            if (this.IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
               var4 = cb.IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl().lIIIIlIIllIIlIIlIIIlIIllI.iterator();

               while(var4.hasNext()) {
                  IlIIIIlllIIIlIIllllIIIlll var8 = (IlIIIIlllIIIlIIllllIIIlll)var4.next();
                  Iterator var6 = var8.llIIlllIIIIlllIllIlIlllIl().iterator();

                  while(var6.hasNext()) {
                     lIIlIlllIIIIlIIIllIlIIIII var7 = (lIIlIlllIIIIlIIIllIlIIIII)var6.next();
                     if (var7.IlllIllIlIIIIlIIlIIllIIIl() == llllllIIlIlIIlllIIIIlIllI.IIIIllIlIIIllIlllIlllllIl && var7.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("color") && !var7.IlIlIIIlllIIIlIlllIlIllIl().toLowerCase().contains("background")) {
                        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                        var7.lIIIIIIIIIlIllIIllIlIIlIl(cb.IIIIllIlIIIllIlllIlllllIl().IlIlIIIlllIIIlIlllIlIllIl().IIllIlIllIlIllIIlIllIlIII.IIIIllIlIIIllIlllIlllllIl());
                     }
                  }
               }
            } else {
               var4 = this.lIIlllIIlIlllllllllIIIIIl.iterator();

               while(var4.hasNext()) {
                  var5 = (IlIIlllIlIIIlIIIlIlIlIlIl)var4.next();
                  if (var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                     var5.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public boolean lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIlllIIIlIIllllIIIlll var1) {
      return !var1.llIIlllIIIIlllIllIlIlllIl().isEmpty() || var1.IIIllIllIlIlllllllIlIlIII().contains("Zans");
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(IlIIIIlllIIIlIIllllIIIlll var1) {
      lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
      this.lIIIIllIIlIlIllIIIlIllIlI = 0;
      this.IllIIIIIIIlIlIllllIIllIII = 0.0D;
      this.IlllIIIlIlllIllIlIIlllIlI = 0;
      this.IIIlIIllllIIllllllIlIIIll = var1;
      this.IIIlllIIIllIllIlIIIIIIlII = null;
   }
}
