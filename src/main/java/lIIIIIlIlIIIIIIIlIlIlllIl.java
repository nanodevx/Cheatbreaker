//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lIIIIIlIlIIIIIIIlIlIlllIl implements lIIlIIlIIIIIIIlllIIIlIIll {
    private static final Logger IIIIllIlIIIllIlllIlllllIl = LogManager.getLogger();
    private final lIIIllIIllllIIIlllIlIlIll IIIIllIIllIIIIllIllIIIlIl;
    private lIIIllIllIllIlllIlIIlIlII IlIlIIIlllIIIlIlllIlIllIl;
    private lIIIlIllIIIlIIIIllIllIIIl IIIllIllIlIlllllllIlIlIII;
    private boolean IllIIIIIIIlIlIllllIIllIII;
    public IlIllIIIllIlIlIIlIIlIllIl lIIIIlIIllIIlIIlIIIlIIllI = new IlIllIIIllIlIlIIlIIlIllIl((IIIlIIIllIIIlIlllIlIIIlII)null);
    private Map lIIIIllIIlIlIllIIIlIllIlI = new HashMap();
    public List lIIIIIIIIIlIllIIllIlIIlIl = new ArrayList();
    public int IlllIIIlIlllIllIlIIlllIlI = 20;
    private llIIlIllIllllIlIllIlIlIII IlllIllIlIIIIlIIlIIllIIIl;
    private boolean IlIlllIIIIllIllllIllIIlIl = false;
    private Random llIIlllIIIIlllIllIlIlllIl = new Random();
    private static int lIIlIlIllIIlIIIlIIIlllIII = "PD0QEiMBp7MMnE/Xsy15Y".length() * "SxsSzIMRVwhI4lWHAxrwyAAs".length() * "FBCXhDkD".length() - 32;

    public lIIIIIlIlIIIIIIIlIlIlllIl(lIIIllIllIllIlllIlIIlIlII var1, llIIlIllIllllIlIllIlIlIII var2, lIIIllIIllllIIIlllIlIlIll var3) {
        this.IlIlIIIlllIIIlIlllIlIllIl = var1;
        this.IlllIllIlIIIIlIIlIIllIIIl = var2;
        this.IIIIllIIllIIIIllIllIIIlIl = var3;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        this.IIIllIllIlIlllllllIlIlIII = null;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI() {
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIlIllIlIIIIllIIllIlIlI var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlIIIlllIIIlIlllIlIllIl = new lIlIllIIllIIIIlllIlIlllIl(this.IlIlIIIlllIIIlIlllIlIllIl, this);
        this.IIIllIllIlIlllllllIlIlIII = new lIIIlIllIIIlIIIIllIllIIIl(this, new lIIIlIlllllIIlIIlIlIIlllI(0L, var1.IIIIllIIllIIIIllIllIIIlIl(), false, var1.IIIIllIlIIIllIlllIlllllIl(), var1.lIIIIllIIlIlIllIIIlIllIlI()), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), this.IlIlIIIlllIIIlIlllIlIllIl.IllllIllllIlIIIlIIIllllll);
        this.IIIllIllIlIlllllllIlIlIII.IllIlIlIllllIlIIllllIIlll = true;
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIIIIIllIllllIIlIIlllIII = var1.IlIlIIIlllIIIlIlllIlIllIl();
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new lIIllllIlllIlllllIIlIIIIl(this));
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        this.IlllIIIlIlllIllIlIIlllIlI = var1.IllIIIIIIIlIlIllllIIllIII();
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
        this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl.IIIIllIlIIIllIlllIlllllIl();
        this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new lIIlIlllIlIllIlIlIllllIlI("MC|Brand", lllIlIIIIlIlIlIllIlIlIIll.lIIIIlIIllIIlIIlIIIlIIllI().getBytes(Charsets.UTF_8)), new GenericFutureListener[0]);
        llIlllIlIIIllllIlllIIlIII var2 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIIIlIlllIllIlIIlllIlI;
        if (var2 != null) {
            lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIlIIllIIlIIlIIIlIIllI(var2.lIIIIIIIIIlIllIIllIlIIlIl, var2.IIIIllIlIIIllIlllIlllllIl, var2.IIIIllIIllIIIIllIllIIIlIl);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIIIIlIIlIIIIllIIIlIIII var1) {
        double var2 = (double)var1.IIIIllIlIIIllIlllIlllllIl() / 32.0D;
        double var4 = (double)var1.IIIIllIIllIIIIllIllIIIlIl() / 32.0D;
        double var6 = (double)var1.IlIlIIIlllIIIlIlllIlIllIl() / 32.0D;
        Object var8 = null;
        if (var1.llIIlllIIIIlllIllIlIlllIl() == 10) {
            var8 = lllIllIIIllllIlIlllllllll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, var1.lIIlIlIllIIlIIIlIIIlllIII());
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 90) {
            lIIllIlIIlIIllIIlIIIIIllI var9 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIlIlIllIIlIIIlIIIlllIII());
            if (var9 instanceof lIllIIIIlIIlIllIIIlIlIlll) {
                var8 = new IIIIllllIIlIIIIIlIllllIII(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (lIllIIIIlIIlIllIIIlIlIlll)var9);
            }

            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 60) {
            var8 = new IlIIlIIlllIlIlIlIIlIIlIIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 61) {
            var8 = new IlIIlIlllllIlllIllIllIlII(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 71) {
            var8 = new IllIIIIIllIlIlIIlllIIIIII(this.IIIllIllIlIlllllllIlIlIII, (int)var2, (int)var4, (int)var6, var1.lIIlIlIllIIlIIIlIIIlllIII());
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 77) {
            var8 = new IIIIIIIlIlIIIIIIlllllllIl(this.IIIllIllIlIlllllllIlIlIII, (int)var2, (int)var4, (int)var6);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 65) {
            var8 = new IllIlllIIIlIllIllIIlIIlIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 72) {
            var8 = new IlIIIIIIIIlIlIlIIIIllIlIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 76) {
            var8 = new IIlIlIllIIIlIIlIlllIlllII(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (lIlIlIlIlIllllIlllIIIlIlI)null);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 63) {
            var8 = new lIlIIlIIIlllIIIllIlIIlIll(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (double)var1.IIIllIllIlIlllllllIlIlIII() / 8000.0D, (double)var1.IllIIIIIIIlIlIllllIIllIII() / 8000.0D, (double)var1.lIIIIllIIlIlIllIIIlIllIlI() / 8000.0D);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 64) {
            var8 = new lIlIlIIlllIIIIIIlIllIlIlI(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (double)var1.IIIllIllIlIlllllllIlIlIII() / 8000.0D, (double)var1.IllIIIIIIIlIlIllllIIllIII() / 8000.0D, (double)var1.lIIIIllIIlIlIllIIIlIllIlI() / 8000.0D);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 66) {
            var8 = new llllIIIlIIIIIlIlIlllIIlll(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (double)var1.IIIllIllIlIlllllllIlIlIII() / 8000.0D, (double)var1.IllIIIIIIIlIlIllllIIllIII() / 8000.0D, (double)var1.lIIIIllIIlIlIllIIIlIllIlI() / 8000.0D);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 62) {
            var8 = new IlIIIlIIIIllIIIllIIIIIIll(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 73) {
            var8 = new IIlIIlIIIIIllIlIlIlIIIIIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, var1.lIIlIlIllIIlIIIlIIIlllIII());
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 75) {
            var8 = new IlIlIIlIIIIIIlIIlIIlIIIll(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 1) {
            var8 = new IIlllIlIlIIIlIIIlIlIlIIIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 50) {
            var8 = new IIIllllIlllIllIIlllIlIIII(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, (IIIlIlllIlIllIIlIIIIIIllI)null);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 51) {
            var8 = new IIllIllIlllllIIlIIlIIlIIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 2) {
            var8 = new lllIIIIIlIllllIIIlllIllIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        } else if (var1.llIIlllIIIIlllIllIlIlllIl() == 70) {
            var8 = new IIIllllIllIlIllIlIIIIIIlI(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6, IIlllllllIlllIIllllIIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIlIlIllIIlIIIlIIIlllIII() & '\uffff'), var1.lIIlIlIllIIlIIIlIIIlllIII() >> 16);
            var1.IIIllIllIlIlllllllIlIlIII(0);
        }

        if (var8 != null) {
            ((lIIllIlIIlIIllIIlIIIIIllI)var8).lIlIlIIIIllIlllIlIIlllIlI = var1.IIIIllIlIIIllIlllIlllllIl();
            ((lIIllIlIIlIIllIIlIIIIIllI)var8).IIllllIllllIIIlIIllllIlll = var1.IIIIllIIllIIIIllIllIIIlIl();
            ((lIIllIlIIlIIllIIlIIIIIllI)var8).llllIIIIIlIlIlIlIllIIIIII = var1.IlIlIIIlllIIIlIlllIlIllIl();
            ((lIIllIlIIlIIllIIlIIIIIllI)var8).IllIIlllIllIlIllIlIIIIIII = (float)(var1.IlllIllIlIIIIlIIlIIllIIIl() * 360) / 256.0F;
            ((lIIllIlIIlIIllIIlIIIIIllI)var8).IllllIllllIlIIIlIIIllllll = (float)(var1.IlIlllIIIIllIllllIllIIlIl() * 360) / 256.0F;
            lIIllIlIIlIIllIIlIIIIIllI[] var12 = ((lIIllIlIIlIIllIIlIIIIIllI)var8).IIIIIIIllIllllIIlIIlllIII();
            if (var12 != null) {
                int var10 = var1.IlllIIIlIlllIllIlIIlllIlI() - ((lIIllIlIIlIIllIIlIIIIIllI)var8).lIIIIlllIIlIlllllIlIllIII();

                for(int var11 = 0; var11 < var12.length; ++var11) {
                    var12[var11].IIIIllIlIIIllIlllIlllllIl(var12[var11].lIIIIlllIIlIlllllIlIllIII() + var10);
                }
            }

            ((lIIllIlIIlIIllIIlIIIIIllI)var8).IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), (lIIllIlIIlIIllIIlIIIIIllI)var8);
            if (var1.lIIlIlIllIIlIIIlIIIlllIII() > 0) {
                if (var1.llIIlllIIIIlllIllIlIlllIl() == 60) {
                    lIIllIlIIlIIllIIlIIIIIllI var13 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIlIlIllIIlIIIlIIIlllIII());
                    if (var13 instanceof IIIlIlllIlIllIIlIIIIIIllI) {
                        IlIIlIIlllIlIlIlIIlIIlIIl var14 = (IlIIlIIlllIlIlIlIIlIIlIIl)var8;
                        var14.IlllIIIlIlllIllIlIIlllIlI = var13;
                    }
                }

                ((lIIllIlIIlIIllIIlIIIIIllI)var8).lIIIIllIIlIlIllIIIlIllIlI((double)var1.IIIllIllIlIlllllllIlIlIII() / 8000.0D, (double)var1.IllIIIIIIIlIlIllllIIllIII() / 8000.0D, (double)var1.lIIIIllIIlIlIllIIIlIllIlI() / 8000.0D);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIlIIIIlIllllIIllIIlllI var1) {
        IIIIlllIIIlllllIIlllIIIIl var2 = new IIIIlllIIIlllllIIlllIIIIl(this.IIIllIllIlIlllllllIlIlIII, (double)var1.IIIIllIlIIIllIlllIlllllIl(), (double)var1.IIIIllIIllIIIIllIllIIIlIl(), (double)var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII());
        var2.lIlIlIIIIllIlllIlIIlllIlI = var1.IIIIllIlIIIllIlllIlllllIl();
        var2.IIllllIllllIIIlIIllllIlll = var1.IIIIllIIllIIIIllIllIIIlIl();
        var2.llllIIIIIlIlIlIlIllIIIIII = var1.IlIlIIIlllIIIlIlllIlIllIl();
        var2.IllllIllllIlIIIlIIIllllll = 0.0F;
        var2.IllIIlllIllIlIllIlIIIIIII = 0.0F;
        var2.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var2);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllIlIlIIllIlIllIllllIIl var1) {
        double var2 = (double)var1.IIIIllIlIIIllIlllIlllllIl() / 32.0D;
        double var4 = (double)var1.IIIIllIIllIIIIllIllIIIlIl() / 32.0D;
        double var6 = (double)var1.IlIlIIIlllIIIlIlllIlIllIl() / 32.0D;
        lllIlIIIllIllIIIIlIlllIIl var8 = null;
        if (var1.IIIllIllIlIlllllllIlIlIII() == 1) {
            var8 = new lllIlIIIllIllIIIIlIlllIIl(this.IIIllIllIlIlllllllIlIlIII, var2, var4, var6);
        }

        if (var8 != null) {
            var8.lIlIlIIIIllIlllIlIIlllIlI = var1.IIIIllIlIIIllIlllIlllllIl();
            var8.IIllllIllllIIIlIIllllIlll = var1.IIIIllIIllIIIIllIllIIIlIl();
            var8.llllIIIIIlIlIlIlIllIIIIII = var1.IlIlIIIlllIIIlIlllIlIllIl();
            var8.IllllIllllIlIIIlIIIllllll = 0.0F;
            var8.IllIIlllIllIlIllIlIIIIIII = 0.0F;
            var8.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
            this.IIIllIllIlIlllllllIlIlIII.IlIlIIIlllIIIlIlllIlIllIl(var8);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIIlIIlIIlIIIIIlIIIlIII var1) {
        IIlIlIllIllIlllllIIIIllIl var2 = new IIlIlIllIllIlllllIIIIllIl(this.IIIllIllIlIlllllllIlIlIII, var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII());
        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var2);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlllllllllIlIllIIIIIIIlI var1) {
        lIIllIlIIlIIllIIlIIIIIllI entity = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (entity != null) {
            // Do Velocity HERE
            //entity.lIIIIllIIlIlIllIIIlIllIlI(0, (double)var1.IIIIllIIllIIIIllIllIIIlIl() / (double)(lIIlIlIllIIlIIIlIIIlllIII * 2), 0);
            entity.lIIIIllIIlIlIllIIIlIllIlI((double)var1.IIIIllIlIIIllIlllIlllllIl() / (double)(lIIlIlIllIIlIIIlIIIlllIII * 2), (double)var1.IIIIllIIllIIIIllIllIIIlIl() / (double)(lIIlIlIllIIlIIIlIIIlllIII * 2), (double)var1.IlIlIIIlllIIIlIlllIlIllIl() / (double)(lIIlIlIllIIlIIIlIIIlllIII * 2));
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllIIlllllllIIlIIlllIlII var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        if (var2 != null && var1.IlllIIIlIlllIllIlIIlllIlI() != null) {
            var2.lIIIlllIlIlllIIIIIIIIIlII().lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIlIllIIlIIIlIIIlIIIIll var1) {
        double var2 = (double)var1.IlIlIIIlllIIIlIlllIlIllIl() / 32.0D;
        double var4 = (double)var1.IIIllIllIlIlllllllIlIlIII() / 32.0D;
        double var6 = (double)var1.IllIIIIIIIlIlIllllIIllIII() / 32.0D;
        float var8 = (float)(var1.lIIIIllIIlIlIllIIIlIllIlI() * 360) / 256.0F;
        float var9 = (float)(var1.IlllIllIlIIIIlIIlIIllIIIl() * 360) / 256.0F;
        GameProfile var10 = var1.IIIIllIIllIIIIllIllIIIlIl();
        IIIlIllllIllIIlIlllIIllIl var11 = new IIIlIllllIllIIlIlllIIllIl(this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI, var1.IIIIllIIllIIIIllIllIIIlIl());
        var11.lIllIllIlIIllIllIlIlIIlIl = var11.lIlIlIIIlIIllllllllIIlllI = (double)(var11.lIlIlIIIIllIlllIlIIlllIlI = var1.IlIlIIIlllIIIlIlllIlIllIl());
        var11.llIlIIIllIIIIlllIlIIIIIlI = var11.IlIlllIllIlIllIlllIlllIll = (double)(var11.IIllllIllllIIIlIIllllIlll = var1.IIIllIllIlIlllllllIlIlIII());
        var11.lIllIlIlllIIlIIllIIlIIlII = var11.llIIIllIIllllIlIlIlIlIIll = (double)(var11.llllIIIIIlIlIlIlIllIIIIII = var1.IllIIIIIIIlIlIllllIIllIII());
        int var12 = var1.IlIlllIIIIllIllllIllIIlIl();
        if (var12 == 0) {
            var11.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI[var11.IIIlllIIIllIllIlIIIIIIlII.IlllIIIlIlllIllIlIIlllIlI] = null;
        } else {
            var11.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI[var11.IIIlllIIIllIllIlIIIIIIlII.IlllIIIlIlllIllIlIIlllIlI] = new lIlIlIlIlIllllIlllIIIlIlI(lIIlllIIIlIllllllIlIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(var12), 1, 0);
        }

        var11.lIIIIlIIllIIlIIlIIIlIIllI(var2, var4, var6, var8, var9);
        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var11);
        List var13 = var1.IlllIIIlIlllIllIlIIlllIlI();
        if (var13 != null) {
            var11.lIIIlllIlIlllIIIIIIIIIlII().lIIIIlIIllIIlIIlIIIlIIllI(var13);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllIIIlIIlIIlIlIIllIlIII var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (var2 != null) {
            var2.lIlIlIIIIllIlllIlIIlllIlI = var1.IIIIllIlIIIllIlllIlllllIl();
            var2.IIllllIllllIIIlIIllllIlll = var1.IIIIllIIllIIIIllIllIIIlIl();
            var2.llllIIIIIlIlIlIlIllIIIIII = var1.IlIlIIIlllIIIlIlllIlIllIl();
            double var3 = (double)var2.lIlIlIIIIllIlllIlIIlllIlI / 32.0D;
            double var5 = (double)var2.IIllllIllllIIIlIIllllIlll / 32.0D + 0.015625D;
            double var7 = (double)var2.llllIIIIIlIlIlIlIllIIIIII / 32.0D;
            float var9 = (float)(var1.IIIllIllIlIlllllllIlIlIII() * 360) / 256.0F;
            float var10 = (float)(var1.IllIIIIIIIlIlIllllIIllIII() * 360) / 256.0F;
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var3, var5, var7, var9, var10, 3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIlIlIllllllllllIIllIl var1) {
        if (var1.IlllIIIlIlllIllIlIIlllIlI() >= 0 && var1.IlllIIIlIlllIllIlIIlllIlI() < IllIlIIIIIIllIIIIIllIllIl.lIIIIIIIIIlIllIIllIlIIlIl()) {
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIlllIIIllIllIlIIIIIIlII.IlllIIIlIlllIllIlIIlllIlI = var1.IlllIIIlIlllIllIlIIlllIlI();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIIIIIlllIIlIlIIllIIlII var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = var1.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
        if (var2 != null) {
            var2.lIlIlIIIIllIlllIlIIlllIlI += var1.IlllIIIlIlllIllIlIIlllIlI();
            var2.IIllllIllllIIIlIIllllIlll += var1.IIIIllIlIIIllIlllIlllllIl();
            var2.llllIIIIIlIlIlIlIllIIIIII += var1.IIIIllIIllIIIIllIllIIIlIl();
            double var3 = (double)var2.lIlIlIIIIllIlllIlIIlllIlI / 32.0D;
            double var5 = (double)var2.IIllllIllllIIIlIIllllIlll / 32.0D;
            double var7 = (double)var2.llllIIIIIlIlIlIlIllIIIIII / 32.0D;
            float var9 = var1.IllIIIIIIIlIlIllllIIllIII() ? (float)(var1.IlIlIIIlllIIIlIlllIlIllIl() * 360) / 256.0F : var2.IllllIllllIlIIIlIIIllllll;
            float var10 = var1.IllIIIIIIIlIlIllllIIllIII() ? (float)(var1.IIIllIllIlIlllllllIlIlIII() * 360) / 256.0F : var2.IllIIlllIllIlIllIlIIIIIII;
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var3, var5, var7, var9, var10, 3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllllIIIIlIIlIlllllllIlIl var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = var1.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
        if (var2 != null) {
            float var3 = (float)(var1.IlllIIIlIlllIllIlIIlllIlI() * 360) / 256.0F;
            var2.IIIllIllIlIlllllllIlIlIII(var3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIIlIllIlllIlIIllIllIl var1) {
        for(int var2 = 0; var2 < var1.IlllIIIlIlllIllIlIIlllIlI().length; ++var2) {
            this.IIIllIllIlIlllllllIlIlIII.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI()[var2]);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIIllIIIllIIlIIIllIIlIII var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        double var3 = var1.IlllIIIlIlllIllIlIIlllIlI();
        double var5 = var1.IIIIllIlIIIllIlllIlllllIl();
        double var7 = var1.IIIIllIIllIIIIllIllIIIlIl();
        float var9 = var1.IlIlIIIlllIIIlIlllIlIllIl();
        float var10 = var1.IIIllIllIlIlllllllIlIlIII();
        var2.IIIIIlIllIllIlIIllIIlIllI = 0.0F;
        var2.IllIIlIIlllllIllIIIlllIII = var2.lIlIlIllIIIIIIIIllllIIllI = var2.IlllIIlllIIIIllIIllllIlIl = 0.0D;
        var2.lIIIIlIIllIIlIIlIIIlIIllI(var3, var5, var7, var9, var10);
        this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new IllIIIIIllllIlIlllllIIIIl(var2.IIIlIIlIlIIIlllIIlIllllll, var2.lllIlIIllllIIIIlIllIlIIII.lIIIIIIIIIlIllIIllIlIIlIl, var2.IllIlIIIIlllIIllIIlllIIlI, var2.IllIlIlIllllIlIIllllIIlll, var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII()), new GenericFutureListener[0]);
        if (!this.IllIIIIIIIlIlIllllIIllIII) {
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIllIllIlIIllIllIlIlIIlIl = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIlIIlIlIIIlllIIlIllllll;
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.llIlIIIllIIIIlllIlIIIIIlI = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IllIlIIIIlllIIllIIlllIIlI;
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIllIlIlllIIlIIllIIlIIlII = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IllIlIlIllllIlIIllllIIlll;
            this.IllIIIIIIIlIlIllllIIllIII = true;
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI((llIIlIllIllllIlIllIlIlIII)null);
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI = System.currentTimeMillis();
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new IIIIIIlIlIlIllllllIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIlllIIllllIIIIIIIIllllI var1) {
        int var2 = var1.IlllIIIlIlllIllIlIIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI * 16;
        int var3 = var1.IlllIIIlIlllIllIlIIlllIlI().lIIIIIIIIIlIllIIllIlIIlIl * 16;
        if (var1.IIIIllIlIIIllIlllIlllllIl() != null) {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.IIIIllIlIIIllIlllIlllllIl()));

            try {
                for(int var5 = 0; var5 < var1.IIIIllIIllIIIIllIllIIIlIl(); ++var5) {
                    short var6 = var4.readShort();
                    short var7 = var4.readShort();
                    int var8 = var7 >> 4 & 4095;
                    int var9 = var7 & 15;
                    int var10 = var6 >> 12 & 15;
                    int var11 = var6 >> 8 & 15;
                    int var12 = var6 & 255;
                    this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var10 + var2, var12, var11 + var3, IIlllllllIlllIIllllIIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var8), var9);
                }
            } catch (IOException var13) {
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIllIIlllllIIIIlIIl var1) {
        if (var1.lIIIIllIIlIlIllIIIlIllIlI()) {
            if (var1.IIIllIllIlIlllllllIlIlIII() == 0) {
                this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), false);
                return;
            }

            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), true);
        }

        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl() << 4, 0, var1.IlIlIIIlllIIIlIlllIlIllIl() << 4, (var1.IIIIllIIllIIIIllIllIIIlIl() << 4) + 15, 256, (var1.IlIlIIIlllIIIlIlllIlIllIl() << 4) + 15);
        lIlllllIIllIlIlIlllIIIIII var2 = this.IIIllIllIlIlllllllIlIlIII.IIIIllIIllIIIIllIllIIIlIl(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl());
        var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), var1.lIIIIllIIlIlIllIIIlIllIlI());
        this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(var1.IIIIllIIllIIIIllIllIIIlIl() << 4, 0, var1.IlIlIIIlllIIIlIlllIlIllIl() << 4, (var1.IIIIllIIllIIIIllIllIIIlIl() << 4) + 15, 256, (var1.IlIlIIIlllIIIlIlllIlIllIl() << 4) + 15);
        if (!var1.lIIIIllIIlIlIllIIIlIllIlI() || !(this.IIIllIllIlIlllllllIlIlIII.lIIIIIllllIIIIlIlIIIIlIlI instanceof llIIIIlIIIlIIIIlIIlllIIlI)) {
            var2.llIIlllIIIIlllIllIlIlllIl();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIllllIlIIIlIllIIlIlIl var1) {
        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIllIllIlIlllllllIlIlIII());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIlIllIIIllIIIIllIllIlII var1) {
        this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIllIIlIIlIlllIIllIIIlI var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI((lIIIlIllIIIlIIIIllIllIIIl)null);
        lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new lIIIIIllllIIIIlIlIIIIlIlI());
        if (this.IlllIllIlIIIIlIIlIIllIIIl != null) {
            if (this.IlllIllIlIIIIlIIlIIllIIIl instanceof IIIIIIIIIIIlIIIllllIllllI) {
                this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI((new IllllIllIllIlllIIlIIIIlll(((IIIIIIIIIIIlIIIllllIllllI)this.IlllIllIlIIIIlIIlIIllIIIl).IlIlIIIlllIIIlIlllIlIllIl(), "disconnect.lost", var1)).lIIIIIIIIIlIllIIllIlIIlIl());
            } else {
                this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new llIlllIlIlIIlIlIllIllIIlI(this.IlllIllIlIIIIlIIlIIllIIIl, "disconnect.lost", var1));
            }
        } else {
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new llIlllIlIlIIlIlIllIllIIlI(new IlllIlIllIllllllllllIlIlI(new llIIIIIIllllIIIIlllIlllIl()), "disconnect.lost", var1));
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllIlllIIlllllIlllIIIlIl var1) {
        this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, new GenericFutureListener[0]);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIllIlIIlIlIllllIlIIllll var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        Object var3 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        if (var3 == null) {
            var3 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        }

        if (var2 != null) {
            if (var2 instanceof IIIIlllIIIlllllIIlllIIIIl) {
                this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var2, "random.orb", 0.2F, ((this.llIIlllIIIIlllIllIlIlllIl.nextFloat() - this.llIIlllIIIIlllIllIlIlllIl.nextFloat()) * 0.6F * 1.1666666F + 1.0F) * 2.0F);
            } else {
                this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var2, "random.pop", 0.2F, ((this.llIIlllIIIIlllIllIlIlllIl.nextFloat() - this.llIIlllIIIIlllIllIlIlllIl.nextFloat()) * 2.375F * 0.29473683F + 1.0F) * 2.0F);
            }

            this.IlIlIIIlllIIIlIlllIlIllIl.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(new lIIIlIIlIllIlIIIlIIIIIlll(this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI, var2, (lIIllIlIIlIIllIIlIIIIIllI)var3, -0.5F));
            this.IIIllIllIlIlllllllIlIlIII.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIIlIIlIIIIlIIIIlllIlll var1) {
        lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new llIlIIIlIIIIlIlllIlIIIIll(var1));
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIllIlllIlIlIllIlIIlIl var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (var2 != null) {
            if (var1.IIIIllIlIIIllIlllIlllllIl() == 0) {
                IIIlIlllIlIllIIlIIIIIIllI var3 = (IIIlIlllIlIllIIlIIIIIIllI)var2;
                var3.IIIIIIlIlIlIllllllIlllIlI();
            } else if (var1.IIIIllIlIIIllIlllIlllllIl() == 1) {
                var2.IIIlllllIIlIlIIIllllllIII();
            } else if (var1.IIIIllIlIIIllIlllIlllllIl() == 2) {
                lIllIIIIlIIlIllIIIlIlIlll var4 = (lIllIIIIlIIlIllIIIlIlIlll)var2;
                var4.lIIIIlIIllIIlIIlIIIlIIllI(false, false, false);
            } else if (var1.IIIIllIlIIIllIlllIlllllIl() == 4) {
                this.IlIlIIIlllIIIlIlllIlIllIl.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(new IllIlIlIlIIlIlIIlllIIIIlI(this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI, var2));
            } else if (var1.IIIIllIlIIIllIlllIlllllIl() == 5) {
                IllIlIlIlIIlIlIIlllIIIIlI var5 = new IllIlIlIlIIlIlIIlllIIIIlI(this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI, var2, "magicCrit");
                this.IlIlIIIlllIIIlIlllIlIllIl.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(var5);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIlllllIIIIIlIIllIlllIll var1) {
        var1.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII).IlllIIIlIlllIllIlIIlllIlI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIllIlIlllIIIlllllIllI var1) {
        double var2 = (double)var1.IlIlIIIlllIIIlIlllIlIllIl() / 32.0D;
        double var4 = (double)var1.IIIllIllIlIlllllllIlIlIII() / 32.0D;
        double var6 = (double)var1.IllIIIIIIIlIlIllllIIllIII() / 32.0D;
        float var8 = (float)(var1.llIIlllIIIIlllIllIlIlllIl() * 360) / 256.0F;
        float var9 = (float)(var1.lIIlIlIllIIlIIIlIIIlllIII() * 360) / 256.0F;
        IIIlIlllIlIllIIlIIIIIIllI var10 = (IIIlIlllIlIllIIlIIIIIIllI)llIlllIlIllllIIIllIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl(), this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI);
        var10.lIlIlIIIIllIlllIlIIlllIlI = var1.IlIlIIIlllIIIlIlllIlIllIl();
        var10.IIllllIllllIIIlIIllllIlll = var1.IIIllIllIlIlllllllIlIlIII();
        var10.llllIIIIIlIlIlIlIllIIIIII = var1.IllIIIIIIIlIlIllllIIllIII();
        var10.IIIlllIllIlIIllIIllIlIlll = (float)(var1.IIIlllIIIllIllIlIIIIIIlII() * 360) / 256.0F;
        lIIllIlIIlIIllIIlIIIIIllI[] var11 = var10.IIIIIIIllIllllIIlIIlllIII();
        if (var11 != null) {
            int var12 = var1.IIIIllIlIIIllIlllIlllllIl() - var10.lIIIIlllIIlIlllllIlIllIII();

            for(int var13 = 0; var13 < var11.length; ++var13) {
                var11[var13].IIIIllIlIIIllIlllIlllllIl(var11[var13].lIIIIlllIIlIlllllIlIllIII() + var12);
            }
        }

        var10.IIIIllIlIIIllIlllIlllllIl(var1.IIIIllIlIIIllIlllIlllllIl());
        var10.lIIIIlIIllIIlIIlIIIlIIllI(var2, var4, var6, var8, var9);
        var10.IllIIlIIlllllIllIIIlllIII = (double)((float)var1.lIIIIllIIlIlIllIIIlIllIlI() / 8000.0F);
        var10.lIlIlIllIIIIIIIIllllIIllI = (double)((float)var1.IlllIllIlIIIIlIIlIIllIIIl() / 8000.0F);
        var10.IlllIIlllIIIIllIIllllIlIl = (double)((float)var1.IlIlllIIIIllIllllIllIIlIl() / 8000.0F);
        this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var10);
        List var14 = var1.IlllIIIlIlllIllIlIIlllIlI();
        if (var14 != null) {
            var10.lIIIlllIlIlllIIIIIIIIIlII().lIIIIlIIllIIlIIlIIIlIIllI(var14);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlllIllIIlIllIIlIlllIllII var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        if ((Integer)lIIIllllIIllIIIIIlIIlIIlI.cb.IlIlIIIlllIIIlIlllIlIllIl().IllIlIlIllllIlIIllllIIlll.IIIIllIlIIIllIlllIlllllIl() == -14490) {
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llllIIlllIIIIIIIIlllIllll var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new IlllIllllIIIIIlIlIlIIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl()), true);
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIllIlIlllIIlIIllIIlIIlII().lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllllIlIIlIIIlIIIIIlIlII var1) {
        Object var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        lIIllIlIIlIIllIIlIIIIIllI var3 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
        if (var1.IlllIIIlIlllIllIlIIlllIlI() == 0) {
            boolean var4 = false;
            if (var1.IIIIllIlIIIllIlllIlllllIl() == this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIIIIlllIIlIlllllIlIllIII()) {
                var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
                if (var3 instanceof IIlllIlIlIIIlIIIlIlIlIIIl) {
                    ((IIlllIlIlIIIlIIIlIlIlIIIl)var3).lIIIIlIIllIIlIIlIIIlIIllI(false);
                }

                var4 = ((lIIllIlIIlIIllIIlIIIIIllI)var2).IlIIlIIIIlIIIIllllIIlIllI == null && var3 != null;
            } else if (var3 instanceof IIlllIlIlIIIlIIIlIlIlIIIl) {
                ((IIlllIlIlIIIlIIIlIlIlIIIl)var3).lIIIIlIIllIIlIIlIIIlIIllI(true);
            }

            if (var2 == null) {
                return;
            }

            ((lIIllIlIIlIIllIIlIIIIIllI)var2).lIIIIlIIllIIlIIlIIIlIIllI(var3);
            if (var4) {
                IIIllIIIIlllIIlIIllIIlIIl var5 = this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl;
                this.IlIlIIIlllIIIlIlllIlIllIl.IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI(IllIIIIlIlIllIIllIIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI("mount.onboard", new Object[]{IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var5.llllllIIIIIlllllIllIlIllI.lIIIIllIIlIlIllIIIlIllIlI())}), false);
            }
        } else if (var1.IlllIIIlIlllIllIlIIlllIlI() == 1 && var2 != null && var2 instanceof IlllIIIllIlIIlIllIIlIlllI) {
            if (var3 != null) {
                ((IlllIIIllIlIIlIllIIlIlllI)var2).lIIIIIIIIIlIllIIllIlIIlIl(var3, false);
            } else {
                ((IlllIIIllIlIIlIllIIlIlllI)var2).lIIIIlIIllIIlIIlIIIlIIllI(false, false);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIIllIlIIlllIlIlIlIIIIIl var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = var1.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
        if (var2 != null) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIIIlIIIIllllIlIIllIllIl var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IllIIIIIllllIlllIIlIIllIl().lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IllIIIIIllllIlllIIlIIllIl().lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIIllIIIIllIllIIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIllIIIIIIllllIIll var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllllIIIIlIIlIIlllIIIlll var1) {
        if (var1.IlllIIIlIlllIllIlIIlllIlI() != this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIIIIIllIllllIIlIIlllIII) {
            this.IllIIIIIIIlIlIllllIIllIII = false;
            IlIIIIllIlIlIIIlIIIllIIlI var2 = this.IIIllIllIlIlllllllIlIlIII.IllIIlllIllIlIllIlIIIIIII();
            this.IIIllIllIlIlllllllIlIlIII = new lIIIlIllIIIlIIIIllIllIIIl(this, new lIIIlIlllllIIlIIlIlIIlllI(0L, var1.IIIIllIIllIIIIllIllIIIlIl(), false, this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIllIlIlllIIlIIllIIlIIlII().IllIllIIIlIIlllIIIllIllII(), var1.IlIlIIIlllIIIlIlllIlIllIl()), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), this.IlIlIIIlllIIIlIlllIlIllIl.IllllIllllIlIIIlIIIllllll);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var2);
            this.IIIllIllIlIlllllllIlIlIII.IllIlIlIllllIlIIllllIIlll = true;
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIIIIIllIllllIIlIIlllIII = var1.IlllIIIlIlllIllIlIIlllIlI();
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new lIIllllIlllIlllllIIlIIIIl(this));
        }

        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIlIlIIlIIllIIIIIlllll var1) {
        lIlIlIlllIlllIlIIlIllllll var2 = new lIlIlIlllIlllIlIIlIllllll(this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI, (lIIllIlIIlIIllIIlIIIIIllI)null, var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), var1.lIIIIllIIlIlIllIIIlIllIlI());
        var2.IllIIIIIIIlIlIllllIIllIII = var1.IlllIllIlIIIIlIIlIIllIIIl();
        var2.lIIIIlIIllIIlIIlIIIlIIllI(true);
        lllIIlIlllIIlIIIIllIIlIlI var10000 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        var10000.IllIIlIIlllllIllIIIlllIII += (double)var1.IlllIIIlIlllIllIlIIlllIlI();
        var10000 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        var10000.lIlIlIllIIIIIIIIllllIIllI += (double)var1.IIIIllIlIIIllIlllIlllllIl();
        var10000 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        var10000.IlllIIlllIIIIllIIllllIlIl += (double)var1.IIIIllIIllIIIIllIllIIIlIl();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIlllIIIlIIllIlllllIllI var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        switch(var1.IIIIllIlIIIllIlllIlllllIl()) {
            case 0:
                var2.lIIIIlIIllIIlIIlIIIlIIllI(new lllIIlIlIIlIlIIIllIllIlIl(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IlIlIIIlllIIIlIlllIlIllIl()));
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 1:
                var2.lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll));
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 2:
                IIlllIllIllllIIlIllIIIIIl var3 = new IIlllIllIllllIIlIllIIIIIl();
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var3.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.lIIIIlIIllIIlIIlIIIlIIllI(var3);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 3:
                IlIlIIlllIlIlllIllllllIII var4 = new IlIlIIlllIlIlllIllllllIII();
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var4.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.lIIIIlIIllIIlIIlIIIlIIllI(var4);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 4:
                var2.lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll), var1.IIIllIllIlIlllllllIlIlIII() ? var1.IIIIllIIllIIIIllIllIIIlIl() : null);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 5:
                llIllIIlIlIIllIlIIIlIlIII var5 = new llIllIIlIlIIllIlIIIlIlIII();
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var5.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.lIIIIlIIllIIlIIlIIIlIIllI(var5);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 6:
                var2.lIIIIlIIllIIlIIlIIIlIIllI(new lIllllIlllIllIllIllllIlll(var2), var1.IIIllIllIlIlllllllIlIlIII() ? var1.IIIIllIIllIIIIllIllIIIlIl() : null);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 7:
                lIllIlIlllIIIIIlIIllllIll var6 = new lIllIlIlllIIIIIlIIllllIll();
                var2.lIIIIlIIllIIlIIlIIIlIIllI(var6);
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var6.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 8:
                var2.lIIIIIIIIIlIllIIllIlIIlIl(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll));
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 9:
                llIlIllIIlIlIlIlllIIllllI var7 = new llIlIllIIlIlIlIlllIIllllI();
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var7.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.lIIIIlIIllIIlIIlIIIlIIllI(var7);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 10:
                IIIlIIllllllIlIIlIIlIIIll var8 = new IIIlIIllllllIlIIlIIlIIIll();
                if (var1.IIIllIllIlIlllllllIlIlIII()) {
                    var8.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl());
                }

                var2.lIIIIlIIllIIlIIlIIIlIIllI(var8);
                var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                break;
            case 11:
                lIIllIlIIlIIllIIlIIIIIllI var9 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IllIIIIIIIlIlIllllIIllIII());
                if (var9 != null && var9 instanceof lIlIIIIIlIIIIIIlIIIIIIlll) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI((lIlIIIIIlIIIIIIlIIIIIIlll)var9, new IlIIlIIIlIllIIllllllIllII(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IlIlIIIlllIIIlIlllIlIllIl()));
                    var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl = var1.IlllIIIlIlllIllIlIIlllIlI();
                }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIIIIIIIIIlllIIllllIlIll var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        if (var1.IlllIIIlIlllIllIlIIlllIlI() == -1) {
            var2.IIIlllIIIllIllIlIIIIIIlII.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIIllIIIIllIllIIIlIl());
        } else {
            boolean var3 = false;
            if (this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII instanceof IllIlllllIllIIIlIlIIlIlIl) {
                IllIlllllIllIIIlIlIIlIlIl var4 = (IllIlllllIllIIIlIlIIlIlIl)this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII;
                var3 = var4.IlIlIIIlllIIIlIlllIlIllIl() != IIllllIllIIllIIllIlIIIIII.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            if (var1.IlllIIIlIlllIllIlIIlllIlI() == 0 && var1.IIIIllIlIIIllIlllIlllllIl() >= 36 && var1.IIIIllIlIIIllIlllIlllllIl() < 45) {
                lIlIlIlIlIllllIlllIIIlIlI var5 = var2.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl()).lIIIIlIIllIIlIIlIIIlIIllI();
                if (var1.IIIIllIIllIIIIllIllIIIlIl() != null && (var5 == null || var5.lIIIIIIIIIlIllIIllIlIIlIl < var1.IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl)) {
                    var1.IIIIllIIllIIIIllIllIIIlIl().IlllIIIlIlllIllIlIIlllIlI = 5;
                }

                var2.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
            } else if (var1.IlllIIIlIlllIllIlIIlllIlI() == var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl && (var1.IlllIIIlIlllIllIlIIlllIlI() != 0 || !var3)) {
                var2.llIIIlllllIlllIIllIlIIlII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIIllIllllllIIIlllIllII var1) {
        IIIllIlIIIllIlIIIIlIlllII var2 = null;
        lllIIlIlllIIlIIIIllIIlIlI var3 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        if (var1.IlllIIIlIlllIllIlIIlllIlI() == 0) {
            var2 = var3.llIlIIIlIIIIlIlllIlIIIIll;
        } else if (var1.IlllIIIlIlllIllIlIIlllIlI() == var3.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl) {
            var2 = var3.llIIIlllllIlllIIllIlIIlII;
        }

        if (var2 != null && !var1.IIIIllIIllIIIIllIllIIIlIl()) {
            this.lIIIIlIIllIIlIIlIIIlIIllI((IIllIlllIIlllllIlllIIIlIl)(new llIIlllllllIllIIIIlIllIII(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), true)));
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllIlllIlIlIIIIlIIIIllIl var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        if (var1.IlllIIIlIlllIllIlIIlllIlI() == 0) {
            var2.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        } else if (var1.IlllIIIlIlllIllIlIIlllIlI() == var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl) {
            var2.llIIIlllllIlllIIllIlIIlII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllllllllIlllIIllllllllI var1) {
        IllIllIlIIlllIllIIllIlIIl var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
        if (var2 == null) {
            var2 = new llIllllIlllllllllIIlIlIII();
            ((IllIllIlIIlllIllIIllIlIIl)var2).lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII);
            ((IllIllIlIIlllIllIIllIlIIl)var2).lIIIIIIIIIlIllIIllIlIIlIl = var1.IlllIIIlIlllIllIlIIlllIlI();
            ((IllIllIlIIlllIllIIllIlIIl)var2).IlllIIIlIlllIllIlIIlllIlI = var1.IIIIllIlIIIllIlllIlllllIl();
            ((IllIllIlIIlllIllIIllIlIIl)var2).IIIIllIlIIIllIlllIlllllIl = var1.IIIIllIIllIIIIllIllIIIlIl();
        }

        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI((IllIllIlIIlllIllIIllIlIIl)var2);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIlIIllIlllIllIlIlIllII var1) {
        boolean var2 = false;
        if (this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.IIIIllIIllIIIIllIllIIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl())) {
            IllIllIlIIlllIllIIllIlIIl var3 = this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
            if (var3 instanceof llIllllIlllllllllIIlIlIII) {
                llIllllIlllllllllIIlIlIII var4 = (llIllllIlllllllllIIlIlIII)var3;
                if (var4.lIIIIlIIllIIlIIlIIIlIIllI()) {
                    for(int var5 = 0; var5 < 4; ++var5) {
                        var4.IllIIIIIIIlIlIllllIIllIII[var5] = var1.IlIlIIIlllIIIlIlllIlIllIl()[var5];
                    }

                    var4.lIllIllIlIIllIllIlIlIIlIl();
                }

                var2 = true;
            }
        }

        if (!var2 && this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl != null) {
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIIlIllIIIIIIIIllIlIIllI var1) {
        if (this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.IIIIllIIllIIIIllIllIIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl())) {
            IllIllIlIIlllIllIIllIlIIl var2 = this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
            if (var2 != null) {
                if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 1 && var2 instanceof llIIllllllllIllIIIllIIlIl) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
                } else if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 2 && var2 instanceof llIlIIlIlIllIlIlIIllIlIlI) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
                } else if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 3 && var2 instanceof lIllIlIlllIIIIIlIIllllIll) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
                } else if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 4 && var2 instanceof IIIllIIIIIIlIllIllllIlIII) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
                } else if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 5 && var2 instanceof lIlllIlIllIllIIIIIlIIlIIl) {
                    var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
                }
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIlllIIllllIIIllIlIlllIl var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        if (var2.llIIIlllllIlllIIllIlIIlII != null && var2.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl == var1.IlllIIIlIlllIllIlIIlllIlI()) {
            var2.llIIIlllllIlllIIllIlIIlII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIIlllllIllIIIIlIlIlllII var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        if (var2 != null) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllIIIlIlIIIIIllIlIIIIlI var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.lIIlIIllIIIIIlIllIIIIllII();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIllllIIIlIIIlIIIlllIll var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.IIIIllIlIIIllIlllIlllllIl(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIlIlIIIlIIllIlIIIIlllI var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llllIllIllllIlIIlIIIlIIII var1) {
        for(int var2 = 0; var2 < var1.IIIIllIlIIIllIlllIlllllIl(); ++var2) {
            int var3 = var1.lIIIIlIIllIIlIIlIIIlIIllI(var2);
            int var4 = var1.lIIIIIIIIIlIllIIllIlIIlIl(var2);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var3, var4, true);
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
            lIlllllIIllIlIlIlllIIIIII var5 = this.IIIllIllIlIlllllllIlIlIII.IIIIllIIllIIIIllIllIIIlIl(var3, var4);
            var5.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(var2), var1.IIIIllIIllIIIIllIllIIIlIl()[var2], var1.IlIlIIIlllIIIlIlllIlIllIl()[var2], true);
            this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
            if (!(this.IIIllIllIlIlllllllIlIlIII.lIIIIIllllIIIIlIlIIIIlIlI instanceof llIIIIlIIIlIIIIlIIlllIIlI)) {
                var5.llIIlllIIIIlllIllIlIlllIl();
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIIIIlllIlIlIlIIIIllllI var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        int var3 = var1.IlllIIIlIlllIllIlIIlllIlI();
        float var4 = var1.IIIIllIlIIIllIlllIlllllIl();
        int var5 = lIlIlllIllIlIllIIIlllIlII.IIIIllIlIIIllIlllIlllllIl(var4 + 0.5F);
        if (var3 >= 0 && var3 < llIIIIIlllIlIlIlIIIIllllI.lIIIIlIIllIIlIIlIIIlIIllI.length && llIIIIIlllIlIlIlIIIIllllI.lIIIIlIIllIIlIIlIIIlIIllI[var3] != null && var3 != 3) {
            var2.lIIIIIIIIIlIllIIllIlIIlIl(new IIIlIlIIIlllllIIlllIIIlIl(llIIIIIlllIlIlIlIIIIllllI.lIIIIlIIllIIlIIlIIIlIIllI[var3], new Object[0]));
        }

        if (var3 == 1) {
            this.IIIllIllIlIlllllllIlIlIII.lIllIlIlllIIlIIllIIlIIlII().lIIIIIIIIIlIllIIllIlIIlIl(true);
            this.IIIllIllIlIlllllllIlIlIII.IlIlllIIIIllIllllIllIIlIl(0.0F);
        } else if (var3 == 2) {
            this.IIIllIllIlIlllllllIlIlIII.lIllIlIlllIIlIIllIIlIIlII().lIIIIIIIIIlIllIIllIlIIlIl(false);
            this.IIIllIllIlIlllllllIlIlIII.IlIlllIIIIllIllllIllIIlIl(1.0F);
        } else if (var3 == 3) {
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(IllIIlIIlIlIIllllIIIlIlII.lIIIIlIIllIIlIIlIIIlIIllI(var5));
        } else if (var3 == 4) {
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new llllllIlllllIIIlIllllIIII());
        } else if (var3 == 5) {
            IIIllIIIIlllIIlIIllIIlIIl var6 = this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl;
            if (var4 == 0.0F) {
                this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new IIllllllIIIIllIllllIlIlIl());
            } else if (var4 == 101.0F) {
                this.IlIlIIIlllIIIlIlllIlIllIl.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlIlIIIlllllIIlllIIIlIl("demo.help.movement", new Object[]{IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.lIIIlIlIIIlIlIlllIlIlllII.lIIIIllIIlIlIllIIIlIllIlI()), IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.llIlIlIIIIIIIlllIIIllIlll.lIIIIllIIlIlIllIIIlIllIlI()), IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.IllIIIIIIlIlIlllllllIIllI.lIIIIllIIlIlIllIIIlIllIlI()), IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.IlIIlllIIlIlIIIlIlllllIll.lIIIIllIIlIlIllIIIlIllIlI())}));
            } else if (var4 == 102.0F) {
                this.IlIlIIIlllIIIlIlllIlIllIl.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlIlIIIlllllIIlllIIIlIl("demo.help.jump", new Object[]{IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.lIllIllIIlIlIIIIllIllllll.lIIIIllIIlIlIllIIIlIllIlI())}));
            } else if (var4 == 103.0F) {
                this.IlIlIIIlllIIIlIlllIlIllIl.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlIlIIIlllllIIlllIIIlIl("demo.help.inventory", new Object[]{IIIllIIIIlllIIlIIllIIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6.IlllIIllllllllIlIlIlllllI.lIIIIllIIlIlIllIIIlIllIlI())}));
            }
        } else if (var3 == 6) {
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIlIIlIlIIIlllIIlIllllll, var2.IllIlIIIIlllIIllIIlllIIlI + (double)var2.lIIlIlIllIIlIIIlIIIlllIII(), var2.IllIlIlIllllIlIIllllIIlll, "random.successful_hit", 0.18F, 0.45F, false);
        } else if (var3 == 7) {
            this.IIIllIllIlIlllllllIlIlIII.IlIlllIIIIllIllllIllIIlIl(var4);
        } else if (var3 == 8) {
            this.IIIllIllIlIlllllllIlIlIII.lIIIIllIIlIlIllIIIlIllIlI(var4);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIlIIllIlIIllIIllIIllII var1) {
        IIIlIIIIlIllIlIllIlllIlll var2 = IIllIllIlIIIIllllIllIlIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI);
        var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        this.IlIlIIIlllIIIlIlllIlIllIl.IIIIIIlIlIlIllllllIlllIlI.IlllIllIlIIIIlIIlIIllIIIl().lIIIIlIIllIIlIIlIIIlIIllI(var2);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIllIlllllIllIIIIllIlllI var1) {
        if (var1.IlllIIIlIlllIllIlIIlllIlI()) {
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), var1.IIIIllIIllIIIIllIllIIIlIl());
        } else {
            this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), var1.IIIIllIIllIIIIllIllIIIlIl());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIIIIIIlllIlIIllIIIllII var1) {
        boolean var2 = false;

        lIIIlIlIlIIlIIllIIIIIllll var3;
        int var4;
        for(Iterator var5 = var1.IlllIIIlIlllIllIlIIlllIlI().entrySet().iterator(); var5.hasNext(); this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIlIIlIlIIIlllIIlIllllll().lIIIIIIIIIlIllIIllIlIIlIl(this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl, var3, var4)) {
            Entry var6 = (Entry)var5.next();
            var3 = (lIIIlIlIlIIlIIllIIIIIllll)var6.getKey();
            var4 = (Integer)var6.getValue();
            if (var3.IIIIllIlIIIllIlllIlllllIl() && var4 > 0) {
                if (this.IlIlllIIIIllIllllIllIIlIl && this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IIIlIIlIlIIIlllIIlIllllll().lIIIIlIIllIIlIIlIIIlIIllI(var3) == 0) {
                    IIlllIllIlIIIIIlIlllllIIl var7 = (IIlllIllIlIIIIIlIlllllIIl)var3;
                    this.IlIlIIIlllIIIlIlllIlIllIl.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI(var7);
                    if (var3 == IIIllIllIIlIlIlIlIllllIIl.IlIlIIIlllIIIlIlllIlIllIl) {
                        this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl.IlllIIllIlllllIIIlIllIIII = false;
                        this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl.IlllIIIlIlllIllIlIIlllIlI();
                    }
                }

                var2 = true;
            }
        }

        if (!this.IlIlllIIIIllIllllIllIIlIl && !var2 && this.IlIlIIIlllIIIlIlllIlIllIl.lIllIllIlIIllIllIlIlIIlIl.IlllIIllIlllllIIIlIllIIII) {
            this.IlIlIIIlllIIIlIlllIlIllIl.IllIllIIIlIIlllIIIllIllII.lIIIIIIIIIlIllIIllIlIIlIl(IIIllIllIIlIlIlIlIllllIIl.IlIlIIIlllIIIlIlllIlIllIl);
        }

        this.IlIlllIIIIllIllllIllIIlIl = true;
        if (this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII instanceof IIIIlllIlIIIlIIlIllIlIlII) {
            ((IIIIlllIlIIIlIIlIllIlIlII)this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII).lIIIIIIIIIlIllIIllIlIIlIl();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIllIIllIlIIIlIIlllIIll var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        if (var2 instanceof IIIlIlllIlIllIIlIIIIIIllI) {
            llIlIlIIlIlIllllIIlIIIlIl var3 = new llIlIlIIlIlIllllIIlIIIlIl(var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IlIlIIIlllIIIlIlllIlIllIl());
            var3.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI());
            ((IIIlIlllIlIllIIlIIIIIIllI)var2).lIIIIlIIllIIlIIlIIIlIIllI(var3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIIlIIlIIlIllIlIIIIIlIl var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (var2 instanceof IIIlIlllIlIllIIlIIIIIIllI) {
            ((IIIlIlllIlIllIIlIIIIIIllI)var2).IIIlllIIIllIllIlIIIIIIlII(var1.IIIIllIlIIIllIlllIlllllIl());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIIlllllIlllIlIllIlIIlI var1) {
        llIIlIllllllIllIIIIlIlIIl var2 = (llIIlIllllllIllIIIIlIlIIl)this.lIIIIllIIlIlIllIIIlIllIlI.get(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (var2 == null && var1.IIIIllIlIIIllIlllIlllllIl()) {
            var2 = new llIIlIllllllIllIIIIlIlIIl(var1.IlllIIIlIlllIllIlIIlllIlI());
            this.lIIIIllIIlIlIllIIIlIllIlI.put(var1.IlllIIIlIlllIllIlIIlllIlI(), var2);
            this.lIIIIIIIIIlIllIIllIlIIlIl.add(var2);
        }

        if (var2 != null && !var1.IIIIllIlIIIllIlllIlllllIl()) {
            this.lIIIIllIIlIlIllIIIlIllIlI.remove(var1.IlllIIIlIlllIllIlIIlllIlI());
            this.lIIIIIIIIIlIllIIllIlIIlIl.remove(var2);
        }

        if (var2 != null && var1.IIIIllIlIIIllIlllIlllllIl()) {
            var2.lIIIIIIIIIlIllIIllIlIIlIl = var1.IIIIllIIllIIIIllIllIIIlIl();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIIIIlIIlIlllllIlll var1) {
        lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new IllIllIIIlIIlllIIIllIllII());
        this.lIIIIlIIllIIlIIlIIIlIIllI((IIllIlllIIlllllIlllIIIlIl)(new lIlIIIIlIIIIlIIIIllIIlllI(var1.IlllIIIlIlllIllIlIIlllIlI())));
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIIIlIIIIllIIlllIII var1, lIlIlllIIIlIIIIllIIlllIII var2) {
        throw new IllegalStateException("Unexpected protocol change!");
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIIIlIIIIllIIlllllI var1) {
        lllIIlIlllIIlIIIIllIIlIlI var2 = this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl;
        var2.IlllIIIllIlIlIIIllIIIlIlI.lIIIIIIIIIlIllIIllIlIIlIl = var1.IIIIllIlIIIllIlllIlllllIl();
        var2.IlllIIIllIlIlIIIllIIIlIlI.IIIIllIlIIIllIlllIlllllIl = var1.IlIlIIIlllIIIlIlllIlIllIl();
        var2.IlllIIIllIlIlIIIllIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI = var1.IlllIIIlIlllIllIlIIlllIlI();
        var2.IlllIIIllIlIlIIIllIIIlIlI.IlllIIIlIlllIllIlIIlllIlI = var1.IIIIllIIllIIIIllIllIIIlIl();
        var2.IlllIIIllIlIlIIIllIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIllIllIlIlllllllIlIlIII());
        var2.IlllIIIllIlIlIIIllIIIlIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1.IllIIIIIIIlIlIllllIIllIII());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIlllIIIllllllllllIIllI var1) {
        String[] var2 = var1.IlllIIIlIlllIllIlIIlllIlI();
        if (this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII instanceof lIlIllIIIllIIIIIIIIIlIlIl) {
            lIlIllIIIllIIIIIIIIIlIlIl var3 = (lIlIllIIIllIIIIIIIIIlIlIl)this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII;
            var3.lIIIIlIIllIIlIIlIIIlIIllI(var2);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlllIlIlIllIlllIlIlIlIIll var1) {
        this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), false);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIIIIllIIIIIIIIIIlIllIl var1) {
        if ("MC|TrList".equals(var1.IlllIIIlIlllIllIlIIlllIlI())) {
            ByteBuf var2 = Unpooled.wrappedBuffer(var1.IIIIllIlIIIllIlllIlllllIl());

            try {
                int var3 = var2.readInt();
                llIIlIllIllllIlIllIlIlIII var4 = this.IlIlIIIlllIIIlIlllIlIllIl.lllIIIIIlIllIlIIIllllllII;
                if (var4 != null && var4 instanceof IllllIIlIIlIIIllIlllllIII && var3 == this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.llIIIlllllIlllIIllIlIIlII.IIIIllIlIIIllIlllIlllllIl) {
                    lIIIIIIllIIllIlIlIIIIIllI var5 = ((IllllIIlIIlIIIllIlllllIII)var4).IlIlIIIlllIIIlIlllIlIllIl();
                    IllllllIIlIIIlllIllIllIII var6 = IllllllIIlIIIlllIllIllIII.lIIIIIIIIIlIllIIllIlIIlIl(new lIlIllllllllIlIIIllIIllII(var2));
                    var5.lIIIIlIIllIIlIIlIIIlIIllI(var6);
                }
            } catch (Exception var12) {
                IIIIllIlIIIllIlllIlllllIl.error("Couldn't load trade info", var12);
            } finally {
                var2.release();
            }
        } else if ("MC|Brand".equals(var1.IlllIIIlIlllIllIlIIlllIlI())) {
            this.IlIlIIIlllIIIlIlllIlIllIl.IlIlllIIIIllIllllIllIIlIl.IlllIIIlIlllIllIlIIlllIlI(new String(var1.IIIIllIlIIIllIlllIlllllIl(), Charsets.UTF_8));
        } else if ("MC|RPack".equals(var1.IlllIIIlIlllIllIlIIlllIlI())) {
            String var14 = new String(var1.IIIIllIlIIIllIlllIlllllIl(), Charsets.UTF_8);
            if (this.IlIlIIIlllIIIlIlllIlIllIl.IlllIIlllIIIIllIIllllIlIl() != null && this.IlIlIIIlllIIIlIlllIlIllIl.IlllIIlllIIIIllIIllllIlIl().IlllIIIlIlllIllIlIIlllIlI() == lIIIlIIIIIIlIIllllIIlIlII.lIIIIlIIllIIlIIlIIIlIIllI) {
                this.IlIlIIIlllIIIlIlllIlIllIl.IIllIlIllIlIllIIlIllIlIII().lIIIIlIIllIIlIIlIIIlIIllI(var14);
            } else if (this.IlIlIIIlllIIIlIlllIlIllIl.IlllIIlllIIIIllIIllllIlIl() == null || this.IlIlIIIlllIIIlIlllIlIllIl.IlllIIlllIIIIllIIllllIlIl().IlllIIIlIlllIllIlIIlllIlI() == lIIIlIIIIIIlIIllllIIlIlII.IlllIIIlIlllIllIlIIlllIlI) {
                this.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIlIIlIllIIIIIlIIIIlII(new lIlIlIIllIIIllllllllIIlll(this, var14), IllIIIIlIlIllIIllIIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI("multiplayer.texturePrompt.line1", new Object[0]), IllIIIIlIlIllIIllIIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI("multiplayer.texturePrompt.line2", new Object[0]), 0));
            }
        }

        try {
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new lllIIIIIlIllIlIIIllllllII(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl()));
        } catch (Exception var11) {
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llllIIlIllIlllIIlIIllIlll var1) {
        IlIIIIllIlIlIIIlIIIllIIlI var2 = this.IIIllIllIlIlllllllIlIlIII.IllIIlllIllIlIllIlIIIIIII();
        IIlIlIlIlIllIlIllIIllIIII var3;
        if (var1.IIIIllIIllIIIIllIllIIIlIl() == 0) {
            var3 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), IIIIlIIlIllIlllIIIlIlllll.lIIIIIIIIIlIllIIllIlIIlIl);
            var3.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        } else {
            var3 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
            if (var1.IIIIllIIllIIIIllIllIIIlIl() == 1) {
                var2.lIIIIIIIIIlIllIIllIlIIlIl(var3);
            } else if (var1.IIIIllIIllIIIIllIllIIIlIl() == 2) {
                var3.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIlIIIlIlIIlIlllIllIlIll var1) {
        IlIIIIllIlIlIIIlIIIllIIlI var2 = this.IIIllIllIlIlllllllIlIlIII.IllIIlllIllIlIllIlIIIIIII();
        IIlIlIlIlIllIlIllIIllIIII var3 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
        if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 0) {
            lIlIlIIllIIIlIlllllIlIIlI var4 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var3);
            var4.IlllIIIlIlllIllIlIIlllIlI(var1.IIIIllIIllIIIIllIllIIIlIl());
        } else if (var1.IlIlIIIlllIIIlIlllIlIllIl() == 1) {
            var2.lIIIIIIIIIlIllIIllIlIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlIIllIIllIIIllIIIIIIII var1) {
        IlIIIIllIlIlIIIlIIIllIIlI var2 = this.IIIllIllIlIlllllllIlIlIII.IllIIlllIllIlIllIlIIIIIII();
        if (var1.IIIIllIlIIIllIlllIlllllIl().length() == 0) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), (IIlIlIlIlIllIlIllIIllIIII)null);
        } else {
            IIlIlIlIlIllIlIllIIllIIII var3 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIllIlllIIllllIIIllllII var1) {
        IlIIIIllIlIlIIIlIIIllIIlI var2 = this.IIIllIllIlIlllllllIlIlIII.IllIIlllIllIlIllIlIIIIIII();
        lIIllllIllIIllIlIlllIllIl var3;
        if (var1.IllIIIIIIIlIlIllllIIllIII() == 0) {
            var3 = var2.IIIIllIIllIIIIllIllIIIlIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        } else {
            var3 = var2.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
        }

        if (var1.IllIIIIIIIlIlIllllIIllIII() == 0 || var1.IllIIIIIIIlIlIllllIIllIII() == 2) {
            var3.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
            var3.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIIllIIIIllIllIIIlIl());
            var3.IlllIIIlIlllIllIlIIlllIlI(var1.IlIlIIIlllIIIlIlllIlIllIl());
            var3.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIllIIlIlIllIIIlIllIlI());
        }

        Iterator var4;
        String var5;
        if (var1.IllIIIIIIIlIlIllllIIllIII() == 0 || var1.IllIIIIIIIlIlIllllIIllIII() == 3) {
            var4 = var1.IIIllIllIlIlllllllIlIlIII().iterator();

            while(var4.hasNext()) {
                var5 = (String)var4.next();
                var2.lIIIIlIIllIIlIIlIIIlIIllI(var5, var1.IlllIIIlIlllIllIlIIlllIlI());
            }
        }

        if (var1.IllIIIIIIIlIlIllllIIllIII() == 4) {
            var4 = var1.IIIllIllIlIlllllllIlIlIII().iterator();

            while(var4.hasNext()) {
                var5 = (String)var4.next();
                var2.lIIIIlIIllIIlIIlIIIlIIllI(var5, var3);
            }
        }

        if (var1.IllIIIIIIIlIlIllllIIllIII() == 1) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlllllIIlIIIIllIIIlIllIII var1) {
        if (var1.IlIlllIIIIllIllllIllIIlIl() == 0) {
            double var2 = (double)(var1.IlllIllIlIIIIlIIlIIllIIIl() * var1.IIIllIllIlIlllllllIlIlIII());
            double var4 = (double)(var1.IlllIllIlIIIIlIIlIIllIIIl() * var1.IllIIIIIIIlIlIllllIIllIII());
            double var6 = (double)(var1.IlllIllIlIIIIlIIlIIllIIIl() * var1.lIIIIllIIlIlIllIIIlIllIlI());
            this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var2, var4, var6);
        } else {
            for(int var15 = 0; var15 < var1.IlIlllIIIIllIllllIllIIlIl(); ++var15) {
                double var3 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.IIIllIllIlIlllllllIlIlIII();
                double var5 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.IllIIIIIIIlIlIllllIIllIII();
                double var7 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.lIIIIllIIlIlIllIIIlIllIlI();
                double var9 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.IlllIllIlIIIIlIIlIIllIIIl();
                double var11 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.IlllIllIlIIIIlIIlIIllIIIl();
                double var13 = this.llIIlllIIIIlllIllIlIlllIl.nextGaussian() * (double)var1.IlllIllIlIIIIlIIlIIllIIIl();
                this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl() + var3, var1.IIIIllIIllIIIIllIllIIIlIl() + var5, var1.IlIlIIIlllIIIlIlllIlIllIl() + var7, var9, var11, var13);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIllIIlIIlIllIllIIIIlIl var1) {
        lIIllIlIIlIIllIIlIIIIIllI var2 = this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI());
        if (var2 != null) {
            if (!(var2 instanceof IIIlIlllIlIllIIlIIIIIIllI)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var2 + ")");
            }

            IlIlIIlllIIllIIIllIIllIlI var3 = ((IIIlIlllIlIllIIlIIIIIIllI)var2).IlllIlIlllIlIlllIIlllIlIl();
            Iterator var4 = var1.IIIIllIlIIIllIlllIlllllIl().iterator();

            while(var4.hasNext()) {
                llllllIlIIIlIIIlIllllllII var5 = (llllllIlIIIlIIIlIllllllII)var4.next();
                IlIlIlllIIllIIllIllllllII var6 = var3.lIIIIlIIllIIlIIlIIIlIIllI(var5.lIIIIlIIllIIlIIlIIIlIIllI());
                if (var6 == null) {
                    var6 = var3.lIIIIIIIIIlIllIIllIlIIlIl(new IIlIllllllIlIlIlIllIllIlI(var5.lIIIIlIIllIIlIIlIIIlIIllI(), 0.0D, 2.2250738585072014E-308D, 1.7976931348623157E308D));
                }

                var6.lIIIIlIIllIIlIIlIIIlIIllI(var5.lIIIIIIIIIlIllIIllIlIIlIl());
                var6.IIIIllIlIIIllIlllIlllllIl();
                Iterator var7 = var5.IlllIIIlIlllIllIlIIlllIlI().iterator();

                while(var7.hasNext()) {
                    IllIIlIIllIlllIIIIIllllII var8 = (IllIIlIIllIlllIIIIIllllII)var7.next();
                    var6.lIIIIlIIllIIlIIlIIIlIIllI(var8);
                }
            }
        }

    }

    public lIIIllIIllllIIIlllIlIlIll IlllIIIlIlllIllIlIIlllIlI() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    static lIIIllIllIllIlllIlIIlIlII lIIIIlIIllIIlIIlIIIlIIllI(lIIIIIlIlIIIIIIIlIlIlllIl var0, lIIIllIllIllIlllIlIIlIlII var1) {
        return var0.IlIlIIIlllIIIlIlllIlIllIl = var1;
    }

    static lIIIllIllIllIlllIlIIlIlII lIIIIlIIllIIlIIlIIIlIIllI(lIIIIIlIlIIIIIIIlIlIlllIl var0) {
        return var0.IlIlIIIlllIIIlIlllIlIllIl;
    }
}
