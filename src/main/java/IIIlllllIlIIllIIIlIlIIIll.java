//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

public class IIIlllllIlIIllIIIlIlIIIll implements IllIllllIIlIllIlIlllllIII {
    private static final Logger lIllIllIlIIllIllIlIlIIlIl = LogManager.getLogger();
    private static final IIllIIlIllIIlllIlIllIIIlI llIlIIIllIIIIlllIlIIIIIlI = new IIllIIlIllIIlllIlIllIIIlI("textures/environment/rain.png");
    private static final IIllIIlIllIIlllIlIllIIIlI lIllIlIlllIIlIIllIIlIIlII = new IIllIIlIllIIlllIlIllIIIlI("textures/environment/snow.png");
    public static boolean lIIIIlIIllIIlIIlIIIlIIllI;
    public static int lIIIIIIIIIlIllIIllIlIIlIl;
    private static int IIIlIIlIlIIIlllIIlIllllll = "7Hqvhj".length() * "raXIoG4y".length() * 2;
    private lIIIllIllIllIlllIlIIlIlII IllIlIIIIlllIIllIIlllIIlI;
    private float IllIlIlIllllIlIIllllIIlll;
    public IIllIIIIllllIIIIlllIlIlII IlllIIIlIlllIllIlIIlllIlI;
    private final lIlIlIlIIlIIIIIlIllIlIlII IllIIlIIlllllIllIIIlllIII;
    private int lIlIlIllIIIIIIIIllllIIllI;
    private lIIllIlIIlIIllIIlIIIIIllI IlllIIlllIIIIllIIllllIlIl;
    private llllIIllllIllIlllllIIlIlI IllllIllllIlIIIlIIIllllll = new llllIIllllIllIlllllIIlIlI();
    private llllIIllllIllIlllllIIlIlI IllIIlllIllIlIllIlIIIIIII = new llllIIllllIllIlllllIIlIlI();
    private llllIIllllIllIlllllIIlIlI IlIlIIIlllllIIIlIlIlIllII = new llllIIllllIllIlllllIIlIlI();
    private llllIIllllIllIlllllIIlIlI IIlIIllIIIllllIIlllIllIIl = new llllIIllllIllIlllllIIlIlI();
    private llllIIllllIllIlllllIIlIlI lllIlIIllllIIIIlIllIlIIII = new llllIIllllIllIlllllIIlIlI();
    private llllIIllllIllIlllllIIlIlI lIIIIlllIIlIlllllIlIllIII = new llllIIllllIllIlllllIIlIlI();
    private float lIIIlllIlIlllIIIIIIIIIlII = 4.0F;
    private float IIIIlIIIlllllllllIlllIlll = 4.0F;
    private float IlIllllIIIlIllllIIIIIllII;
    private float IlIIIIllIIIIIlllIIlIIlllI;
    private float llIlIlIllIlIIlIlllIllIIlI;
    private float llIlIlIlllIlllllIIIllIIll;
    private float IIllIlIllIlIllIIlIllIlIII;
    private float lIlIllIlIlIIIllllIlIllIll;
    private float IlIIlIIlIllIIIIllIIllIlIl;
    private float llllIIIIlIlIllIIIllllIIll;
    private float IIlIlIIlIIIlIlllllIIlIIlI;
    private float lIIIlllIIIlIIIIIlIIIIIIII;
    private float lIIlIIIIIIIIllIIllIIlllIl;
    private float IllllllIllllIIlllIllllllI;
    private float lIlIlIIIlIIllllllllIIlllI;
    private float IlIlllIllIlIllIlllIlllIll = 0.0F;
    private final lllIIIlllIIlllIlIlllIlIlI llIIIllIIllllIlIlIlIlIIll;
    private final int[] IIIIIlIllIllIlIIllIIlIllI;
    private final IIllIIlIllIIlllIlIllIIIlI lIIllIIllllllIIlllIlllIIl;
    private float lllIIllllIIlIlIlIlIIIlIII;
    private float IlIIllIlIlIIIllIllIIlIIII;
    private float IlIlllIIIIlIllIlllIlIIIll;
    private float IIIlIllIlllIlIllIllllllll;
    private float IllllllllIlIIIIIIIIllIIII;
    private boolean lIIlIlIIlIlIlIIlIlIlllIIl;
    private final llIllIllIllIIIIlIlllllIlI IllIIIlIIlIllIllIIllllIIl;
    public lllllIIIIIllIIlIIIIllllII IIIIllIlIIIllIlllIlllllIl;
    private static final IIllIIlIllIIlllIlIllIIIlI[] IIlIlllIllIlIlIIIIIlllIll = new IIllIIlIllIIlllIlIllIIIlI[]{new IIllIIlIllIIlllIlIllIIIlI("shaders/post/notch.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/fxaa.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/art.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/bumpy.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/blobs2.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/pencil.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/color_convolve.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/deconverge.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/flip.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/invert.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/ntsc.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/outline.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/phosphor.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/scan_pincushion.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/sobel.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/bits.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/desaturate.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/green.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/blur.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/wobble.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/blobs.json"), new IIllIIlIllIIlllIlIllIIIlI("shaders/post/antialias.json")};
    private static final IIllIIlIllIIlllIlIllIIIlI IlIIllIIIlllIIIIlIIIIlIll = new IIllIIlIllIIlllIlIllIIIlI("shaders/post/animblur.json");
    private static final IIllIIlIllIIlllIlIllIIIlI lIIIIIIlIIllllllIIIlIlIIl = new IIllIIlIllIIlllIlIllIIIlI("shaders/post/motionblur.json");
    public static final int IIIIllIIllIIIIllIllIIIlIl;
    private int llIIIlIlIIlIlIIlIllIllIll;
    private double IlIIlllIlIIIlIIIlIlIlIlIl;
    private double IIIlllllIIlIlIIIllllllIII;
    private double lIlIlIIIIllIlllIlIIlllIlI;
    private long IIllllIllllIIIlIIllllIlll;
    private long llllIIIIIlIlIlIlIllIIIIII;
    private boolean IllIIIIllllllIlllllIlIlll;
    float IlIlIIIlllIIIlIlllIlIllIl;
    float IIIllIllIlIlllllllIlIlIII;
    float IllIIIIIIIlIlIllllIIllIII;
    float lIIIIllIIlIlIllIIIlIllIlI;
    private Random IIIllllIlIIlIIIlIlIlllIII;
    private int IIlIlllllIIIlIIllIllIlIlI;
    float[] IlllIllIlIIIIlIIlIIllIIIl;
    float[] IlIlllIIIIllIllllIllIIlIl;
    FloatBuffer llIIlllIIIIlllIllIlIlllIl;
    float lIIlIlIllIIlIIIlIIIlllIII;
    float IIIlllIIIllIllIlIIIIIIlII;
    float llIlIIIlIIIIlIlllIlIIIIll;
    private float IlIllIllIllIllIllllIIIlII;
    private float lllIllIllIlIllIlIIllllIIl;
    public int IIIlIIllllIIllllllIlIIIll;
    private boolean IIIIIIIllIllllIIlIIlllIII = false;
    private IIIIIIllIlIIIIlIlllIllllI IIIIlIllIIIIIIlIIIIIlllll = null;
    private boolean llllIIlIlIllIllllIIIIllll = false;
    public boolean lllIIIIIlIllIlIIIllllllII = false;
    private long IIlIlIlllIllIIlIllIIlIIlI = 0L;
    private int lIlIIllIIIlllIIllIIlIIllI = 0;
    private int lIIIlIIIIIIlIIlIIlIIlIIlI = 0;
    private int lIlIlIlIIlIlllIIIIIIllllI = 0;
    private float llllIIllIIlllllIlIlIIllll = 0.0F;
    private float IllIlIIIIlIlllIlllllllIIl = 0.0F;
    public long[] lIIIIIllllIIIIlIlIIIIlIlI = new long[512];
    public long[] IIIIIIlIlIlIllllllIlllIlI = new long[512];
    public long[] IllIllIIIlIIlllIIIllIllII = new long[512];
    public long[] IlIIlIIIIlIIIIllllIIlIllI = new long[512];
    public int lIIlIIllIIIIIlIllIIIIllII = 0;
    public long lIIlllIIlIlllllllllIIIIIl = -1L;
    private boolean IIlllllIIlIlIIlIIlllIIIII = false;
    private boolean IllIlIlllIIlIIIIIlIIIIIll = false;
    private long llllIlIlIlllllIllIIllIIIl = 0L;

    public IIIlllllIlIIllIIIlIlIIIll(lIIIllIllIllIlllIlIIlIlII var1, llIllIllIllIIIIlIlllllIlI var2) {
        this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
        this.IlIIlllIlIIIlIIIlIlIlIlIl = 1.0D;
        this.IIllllIllllIIIlIIllllIlll = lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII();
        this.IIIllllIlIIlIIIlIlIlllIII = new Random();
        this.llIIlllIIIIlllIllIlIlllIl = llIIllIIlIIlIIIIIIIIIIIll.IIIIllIIllIIIIllIllIIIlIl(16);
        this.IllIlIIIIlllIIllIIlllIIlI = var1;
        this.IllIIIlIIlIllIllIIllllIIl = var2;
        this.IllIIlIIlllllIllIIIlllIII = new lIlIlIlIIlIIIIIlIllIlIlII(var1.llIlIlIllIlIIlIlllIllIIlI());
        this.IlllIIIlIlllIllIlIIlllIlI = new IIllIIIIllllIIIIlllIlIlII(var1);
        this.llIIIllIIllllIlIlIlIlIIll = new lllIIIlllIIlllIlIlllIlIlI(16, 16);
        this.lIIllIIllllllIIlllIlllIIl = var1.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI("lightMap", this.llIIIllIIllllIlIlIlIlIIll);
        this.IIIIIlIllIllIlIIllIIlIllI = this.llIIIllIIllllIlIlIlIlIIll.IIIIllIlIIIllIlllIlllllIl();
        this.IIIIllIlIIIllIlllIlllllIl = null;
    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI() {
        return IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII && this.IIIIllIlIIIllIlllIlllllIl != null;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        if (this.IIIIllIlIIIllIlllIlllllIl != null) {
            this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        }

        this.IIIIllIlIIIllIlllIlllllIl = null;
        this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
    }

    public void IlllIIIlIlllIllIlIIlllIlI() {
        if (this.IIIIllIlIIIllIlllIlllllIl != null) {
            this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        }

        this.IIIIllIlIIIllIlllIlllllIl = null;
        this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
    }

    public void IIIIllIlIIIllIlllIlllllIl() {
        if (IIlIlIIIlIllIlllllllIlllI.IIIllIllIlIlllllllIlIlIII() && IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII) {
            if (this.IIIIllIlIIIllIlllIlllllIl != null) {
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            this.llIIIlIlIIlIlIIlIllIllIll = (this.llIIIlIlIIlIlIIlIllIllIll + 1) % (IIlIlllIllIlIlIIIIIlllIll.length + 1);
            if (this.llIIIlIlIIlIlIIlIllIllIll != IIIIllIIllIIIIllIllIIIlIl) {
                try {
                    lIllIllIlIIllIllIlIlIIlIl.info("Selecting effect " + IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll]);
                    this.IIIIllIlIIIllIlllIlllllIl = new lllllIIIIIllIIlIIIIllllII(this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI(), this.IllIIIlIIlIllIllIIllllIIl, this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(), IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll]);
                    this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
                } catch (IOException var2) {
                    lIllIllIlIIllIllIlIlIIlIl.warn("Failed to load shader: " + IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll], var2);
                    this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
                } catch (JsonSyntaxException var3) {
                    lIllIllIlIIllIllIlIlIIlIl.warn("Failed to load shader: " + IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll], var3);
                    this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
                }
            } else {
                this.IIIIllIlIIIllIlllIlllllIl = null;
                lIllIllIlIIllIllIlIlIIlIl.info("No effect selected");
            }
        }

    }

    public void IIIIllIIllIIIIllIllIIIlIl() {
        if (IIlIlIIIlIllIlllllllIlllI.IIIllIllIlIlllllllIlIlIII() && IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII) {
            if (this.IIIIllIlIIIllIlllIlllllIl != null) {
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            try {
                this.IIIIllIlIIIllIlllIlllllIl = new lllllIIIIIllIIlIIIIllllII(this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI(), this.IllIIIlIIlIllIllIIllllIIl, this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(), IlIIllIIIlllIIIIlIIIIlIll);
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
            } catch (Exception var2) {
            }
        }

    }

    public void IlIlIIIlllIIIlIlllIlIllIl() {
        if (IIlIlIIIlIllIlllllllIlllI.IIIllIllIlIlllllllIlIlIII() && IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII) {
            if (this.IIIIllIlIIIllIlllIlllllIl != null) {
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            try {
                this.IIIIllIlIIIllIlllIlllllIl = new lllllIIIIIllIIlIIIIllllII(this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI(), this.IllIIIlIIlIllIllIIllllIIl, this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(), lIIIIIIlIIllllllIIIlIlIIl);
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
            } catch (Exception var2) {
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIllIllIllIIIIlIlllllIlI var1) {
        if (this.IIIIllIlIIIllIlllIlllllIl != null) {
            this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        }

        if (this.llIIIlIlIIlIlIIlIllIllIll != IIIIllIIllIIIIllIllIIIlIl) {
            try {
                this.IIIIllIlIIIllIlllIlllllIl = new lllllIIIIIllIIlIIIIllllII(this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI(), var1, this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(), IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll]);
                this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
            } catch (IOException var3) {
                lIllIllIlIIllIllIlIlIIlIl.warn("Failed to load shader: " + IIlIlllIllIlIlIIIIIlllIll[this.llIIIlIlIIlIlIIlIllIllIll], var3);
                this.llIIIlIlIIlIlIIlIllIllIll = IIIIllIIllIIIIllIllIIIlIl;
            }
        }

    }

    public void IIIllIllIlIlllllllIlIlIII() {
        if (IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII && lIIIIlllIIllllIllIlIlIllI.lIIIIIIIIIlIllIIllIlIIlIl() == null) {
            lIIIIlllIIllllIllIlIlIllI.lIIIIlIIllIIlIIlIIIlIIllI();
        }

        this.IlIlllIIIIllIllllIllIIlIl();
        this.llIIlllIIIIlllIllIlIlllIl();
        this.IlIllIllIllIllIllllIIIlII = this.lllIllIllIlIllIlIIllllIIl;
        this.IIIIlIIIlllllllllIlllIlll = this.lIIIlllIlIlllIIIIIIIIIlII;
        this.IlIIIIllIIIIIlllIIlIIlllI = this.IlIllllIIIlIllllIIIIIllII;
        this.llIlIlIlllIlllllIIIllIIll = this.llIlIlIllIlIIlIlllIllIIlI;
        this.lIIlIIIIIIIIllIIllIIlllIl = this.lIIIlllIIIlIIIIIlIIIIIIII;
        this.lIlIlIIIlIIllllllllIIlllI = this.IllllllIllllIIlllIllllllI;
        float var1;
        float var2;
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lllIIlIlIllIIlIllIIIIIlII) {
            var1 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI * 2.2222223F * 0.27F + 0.2F;
            var2 = var1 * var1 * var1 * 8.0F;
            this.IlIIlIIlIllIIIIllIIllIlIl = this.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIllIlIllIlIllIIlIllIlIII, 0.05F * var2);
            this.llllIIIIlIlIllIIIllllIIll = this.IllIIlllIllIlIllIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(this.lIlIllIlIlIIIllllIlIllIll, 0.05F * var2);
            this.IIlIlIIlIIIlIlllllIIlIIlI = 0.0F;
            this.IIllIlIllIlIllIIlIllIlIII = 0.0F;
            this.lIlIllIlIlIIIllllIlIllIll = 0.0F;
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl == null) {
            this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl = this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl;
        }

        var1 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.llIIlllIIIIlllIllIlIlllIl(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IllIlIlIllllIlIIllllIIlll));
        var2 = (float)this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIIIlIlllIllIlIIlllIlI / 16.0F;
        float var3 = var1 * (1.0F - var2) + var2;
        this.lllIllIllIlIllIlIIllllIIl += (var3 - this.lllIllIllIlIllIlIIllllIIl) * 0.11395349F * 0.877551F;
        ++this.lIlIlIllIIIIIIIIllllIIllI;
        this.IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIlIlIllIIlIIIlIIIlllIII();
        this.IllllllllIlIIIIIIIIllIIII = this.IIIlIllIlllIlIllIllllllll;
        if (llIIIllIIllIIIllIlllIlllI.IIIIllIlIIIllIlllIlllllIl) {
            this.IIIlIllIlllIlIllIllllllll += 0.05F;
            if (this.IIIlIllIlllIlIllIllllllll > 1.0F) {
                this.IIIlIllIlllIlIllIllllllll = 1.0F;
            }

            llIIIllIIllIIIllIlllIlllI.IIIIllIlIIIllIlllIlllllIl = false;
        } else if (this.IIIlIllIlllIlIllIllllllll > 0.0F) {
            this.IIIlIllIlllIlIllIllllllll -= 0.0125F;
        }

    }

    public lllllIIIIIllIIlIIIIllllII IllIIIIIIIlIlIllllIIllIII() {
        return this.IIIIllIlIIIllIlllIlllllIl;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2) {
        if (IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII && this.IIIIllIlIIIllIlllIlllllIl != null) {
            this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1) {
        if (this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl != null && this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI != null) {
            this.IllIlIIIIlllIIllIIlllIIlI.lIIlIlIllIIlIIIlIIIlllIII = null;
            double var2 = (double)this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllIIIlIlllIlIllIl.IIIIllIlIIIllIlllIlllllIl();
            this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var2, var1);
            double var4 = var2;
            lIllIIIIlllllIIlIllIIIIII var6 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IIIlllIIIllIllIlIIIIIIlII(var1);
            if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllIIIlIlllIlIllIl.lIIIIllIIlIlIllIIIlIllIlI()) {
                var2 = (double)(IIIlIIlIlIIIlllIIlIllllll >> 4);
                var4 = (double)(IIIlIIlIlIIIlllIIlIllllll >> 4);
            } else {
                if (var2 > (double)(IIIlIIlIlIIIlllIIlIllllll >> 5)) {
                    var4 = (double)(IIIlIIlIlIIIlllIIlIllllll >> 5);
                }

                var2 = var4;
            }

            if (this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl != null) {
                var4 = this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl.IlIlIIIlllIIIlIlllIlIllIl.IIIIllIlIIIllIlllIlllllIl(var6);
            }

            // Reach hehe
            //var2 = 3.5d;
            //var4 = 3.5d;

            lIllIIIIlllllIIlIllIIIIII var7 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.llIIlllIIIIlllIllIlIlllIl(var1);
            lIllIIIIlllllIIlIllIIIIII var8 = var6.IlllIIIlIlllIllIlIIlllIlI(var7.lIIIIlIIllIIlIIlIIIlIIllI * var2, var7.lIIIIIIIIIlIllIIllIlIIlIl * var2, var7.IlllIIIlIlllIllIlIIlllIlI * var2);
            this.IlllIIlllIIIIllIIllllIlIl = null;
            lIllIIIIlllllIIlIllIIIIII var9 = null;
            float var10 = 1.0F;
            List var11 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl, this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.lllIlIIllllIIIIlIllIlIIII.lIIIIlIIllIIlIIlIIIlIIllI(var7.lIIIIlIIllIIlIIlIIIlIIllI * var2, var7.lIIIIIIIIIlIllIIllIlIIlIl * var2, var7.IlllIIIlIlllIllIlIIlllIlI * var2).lIIIIIIIIIlIllIIllIlIIlIl((double)var10, (double)var10, (double)var10));
            double var12 = var4;

            for(int var14 = 0; var14 < var11.size(); ++var14) {
                lIIllIlIIlIIllIIlIIIIIllI var15 = (lIIllIlIIlIIllIIlIIIIIllI)var11.get(var14);
                if (var15.IIIIIlIllIllIlIIllIIlIllI()) {
                    float var16 = var15.IlIIllIIIlllIIIIlIIIIlIll();
                    IlIllIIlIlIllIlIllllllllI var17 = var15.lllIlIIllllIIIIlIllIlIIII.lIIIIIIIIIlIllIIllIlIIlIl((double)var16, (double)var16, (double)var16);
                    lIlIIlllIIIIIllIIIlIllIII var18 = var17.lIIIIlIIllIIlIIlIIIlIIllI(var6, var8);
                    if (var17.lIIIIlIIllIIlIIlIIIlIIllI(var6)) {
                        if (0.0D < var12 || var12 == 0.0D) {
                            this.IlllIIlllIIIIllIIllllIlIl = var15;
                            var9 = var18 == null ? var6 : var18.IlIlIIIlllIIIlIlllIlIllIl;
                            var12 = 0.0D;
                        }
                    } else if (var18 != null) {
                        double var19 = var6.IIIIllIlIIIllIlllIlllllIl(var18.IlIlIIIlllIIIlIlllIlIllIl);
                        if (var19 < var12 || var12 == 0.0D) {
                            boolean var21 = false;
                            if (var15 == this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IlIIlIIIIlIIIIllllIIlIllI && !var21) {
                                if (var12 == 0.0D) {
                                    this.IlllIIlllIIIIllIIllllIlIl = var15;
                                    var9 = var18.IlIlIIIlllIIIlIlllIlIllIl;
                                }
                            } else {
                                this.IlllIIlllIIIIllIIllllIlIl = var15;
                                var9 = var18.IlIlIIIlllIIIlIlllIlIllIl;
                                var12 = var19;
                            }
                        }
                    }
                }
            }

            if (this.IlllIIlllIIIIllIIllllIlIl != null && (var12 < var4 || this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl == null)) {
                this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl = new lIlIIlllIIIIIllIIIlIllIII(this.IlllIIlllIIIIllIIllllIlIl, var9);
                if (this.IlllIIlllIIIIllIIllllIlIl instanceof IIIlIlllIlIllIIlIIIIIIllI || this.IlllIIlllIIIIllIIllllIlIl instanceof IllIIIIIllIlIlIIlllIIIIII) {
                    this.IllIlIIIIlllIIllIIlllIIlI.lIIlIlIllIIlIIIlIIIlllIII = this.IlllIIlllIIIIllIIllllIlIl;
                }
            }
        }

    }

    private void IlIlllIIIIllIllllIllIIlIl() {
        if (this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl instanceof IllIllIllIllllIllllIlIlll) {
            IllIllIllIllllIllllIlIlll var1 = (IllIllIllIllllIllllIlIlll)this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
            this.IlIlllIIIIlIllIlllIlIIIll = var1.IllIIlIIlllllIllIIIlllIII();
        } else {
            this.IlIlllIIIIlIllIlllIlIIIll = this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.IllIIlIIlllllIllIIIlllIII();
        }

        this.IlIIllIlIlIIIllIllIIlIIII = this.lllIIllllIIlIlIlIlIIIlIII;
        this.lllIIllllIIlIlIlIlIIIlIII += (this.IlIlllIIIIlIllIlllIlIIIll - this.lllIIllllIIlIlIlIlIIIlIII) * 0.18023255F * 2.7741935F;
        if (this.lllIIllllIIlIlIlIlIIIlIII > 1.5F) {
            this.lllIIllllIIlIlIlIlIIIlIII = 1.5F;
        }

        if (this.lllIIllllIIlIlIlIlIIIlIII < 0.1F) {
            this.lllIIllllIIlIlIlIlIIIlIII = 0.1F;
        }

    }

    private float lIIIIlIIllIIlIIlIIIlIIllI(float var1, boolean var2) {
        if (this.IIIlIIllllIIllllllIlIIIll > 0) {
            return 90.0F;
        } else {
            IIIlIlllIlIllIIlIIIIIIllI var3 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
            float var4 = 70.0F;
            if (var2) {
                var4 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIlllIllIIllIllIlIIIllII;
                if (lIIIllIIIllIlllllIIlIllII.IlIIlIllIllllIIlIllllIlII()) {
                    var4 *= this.IlIIllIlIlIIIllIllIIlIIII + (this.lllIIllllIIlIlIlIlIIIlIII - this.IlIIllIlIlIIIllIllIIlIIII) * var1;
                }
            }

            boolean var5 = false;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII == null) {
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIlIlllIIlIIIIIlIIIIIll.lIIIIllIIlIlIllIIIlIllIlI() < 0) {
                    var5 = Mouse.isButtonDown(this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIlIlllIIlIIIIIlIIIIIll.lIIIIllIIlIlIllIIIlIllIlI() + 100);
                } else {
                    var5 = Keyboard.isKeyDown(this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIlIlllIIlIIIIIlIIIIIll.lIIIIllIIlIlIllIIIlIllIlI());
                }
            }

            if (var5) {
                if (!lIIIllIIIllIlllllIIlIllII.lIIIIllIIlIlIllIIIlIllIlI) {
                    lIIIllIIIllIlllllIIlIllII.lIIIIllIIlIlIllIIIlIllIlI = true;
                    this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lllIIlIlIllIIlIllIIIIIlII = true;
                }

                if (lIIIllIIIllIlllllIIlIllII.lIIIIllIIlIlIllIIIlIllIlI) {
                    var4 /= 4.0F;
                }
            } else if (lIIIllIIIllIlllllIIlIllII.lIIIIllIIlIlIllIIIlIllIlI) {
                lIIIllIIIllIlllllIIlIllII.lIIIIllIIlIlIllIIIlIllIlI = false;
                this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lllIIlIlIllIIlIllIIIIIlII = false;
                this.IllllIllllIlIIIlIIIllllll = new llllIIllllIllIlllllIIlIlI();
                this.IllIIlllIllIlIllIlIIIIIII = new llllIIllllIllIlllllIIlIlI();
            }

            if (var3.lIIIlIlIIIlIlIlllIlIlllII() <= 0.0F) {
                float var6 = (float)var3.IIlllllIIlIlIIlIIlllIIIII + var1;
                var4 /= (1.0F - 500.0F / (var6 + 500.0F)) * 2.0F + 1.0F;
            }

            IIlllllllIlllIIllllIIlIll var7 = IlIIIllIlIlIIIlIIlIIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI, var3, var1);
            if (var7.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.IllIIIIIIIlIlIllllIIllIII) {
                var4 = var4 * 60.0F / 70.0F;
            }

            return var4 + this.lIIlIIIIIIIIllIIllIIlllIl + (this.lIIIlllIIIlIIIIIlIIIIIIII - this.lIIlIIIIIIIIllIIllIIlllIl) * var1;
        }
    }

    private void IIIIllIIllIIIIllIllIIIlIl(float var1) {
        IIIlIlllIlIllIIlIIIIIIllI var2 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        float var3 = (float)var2.lIlIlIlIIlIlllIIIIIIllllI - var1;
        float var4;
        if (var2.lIIIlIlIIIlIlIlllIlIlllII() <= 0.0F) {
            var4 = (float)var2.IIlllllIIlIlIIlIIlllIIIII + var1;
            GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
        }

        if (var3 >= 0.0F) {
            var3 /= (float)var2.llllIIllIIlllllIlIlIIllll;
            var3 = lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var3 * var3 * var3 * var3 * 4.611111F * 0.6813093F);
            var4 = var2.IllIlIIIIlIlllIlllllllIIl;
            GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
        }

    }

    private void IlIlIIIlllIIIlIlllIlIllIl(float var1) {
        if (this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl instanceof lIllIIIIlIIlIllIIIlIlIlll) {
            lIllIIIIlIIlIllIIIlIlIlll var2 = (lIllIIIIlIIlIllIIIlIlIlll)this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
            float var3 = var2.lIIIlllIIIlIIIIIlIIIIIIII - var2.IIlIlIIlIIIlIlllllIIlIIlI;
            float var4 = -(var2.lIIIlllIIIlIIIIIlIIIIIIII + var3 * var1);
            float var5 = var2.IllIIIIIIlIlIlllllllIIllI + (var2.IlIIlllIIlIlIIIlIlllllIll - var2.IllIIIIIIlIlIlllllllIIllI) * var1;
            float var6 = var2.lIllIllIllllllIllIlllIlIl + (var2.IlIllIIllIIIIIllIlIIIIIIl - var2.lIllIllIllllllIllIlllIlIl) * var1;
            GL11.glTranslatef(lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var4 * 1.9911504F * 1.5777777F) * var5 * 0.02840909F * 17.6F, -Math.abs(lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var4 * 7.5398226F * 0.41666666F) * var5), 0.0F);
            GL11.glRotatef(lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var4 * 1.25F * 2.5132742F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var4 * 0.8680717F * 3.6190476F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
        }

    }

    private void IIIllIllIlIlllllllIlIlIII(float var1) {
        llllIIIllllllIlllIIlIIlll var2 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().IlIIlIIIIlIIIIllllIIlIllI;
        IIIlIlllIlIllIIlIIIIIIllI var3 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        float var4 = var3.lIlIllIlIlIIIllllIlIllIll - 1.62F;
        double var5 = var3.lIllIllIlIIllIllIlIlIIlIl + (var3.IIIlIIlIlIIIlllIIlIllllll - var3.lIllIllIlIIllIllIlIlIIlIl) * (double)var1;
        double var7 = var3.llIlIIIllIIIIlllIlIIIIIlI + (var3.IllIlIIIIlllIIllIIlllIIlI - var3.llIlIIIllIIIIlllIlIIIIIlI) * (double)var1 - (double)var4;
        double var9 = var3.lIllIlIlllIIlIIllIIlIIlII + (var3.IllIlIlIllllIlIIllllIIlll - var3.lIllIlIlllIIlIIllIIlIIlII) * (double)var1;
        GL11.glRotatef(this.lIlIlIIIlIIllllllllIIlllI + (this.IllllllIllllIIlllIllllllI - this.lIlIlIIIlIIllllllllIIlllI) * var1, 0.0F, 0.0F, 1.0F);
        if (var3.llllIlIIIIIllIIlIlllIllll()) {
            var4 = (float)((double)var4 + 1.0D);
            GL11.glTranslatef(0.0F, 0.3F, 0.0F);
            if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
                IIlllllllIlllIIllllIIlIll var11 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.a_(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IllIlIlIllllIlIIllllIIlll));
                if (var11 == IllllllIllIIlllIllIIlIIll.IllIlIlIllllIlIIllllIIlll) {
                    int var12 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var3.IllIlIlIllllIlIIllllIIlll));
                    int var13 = var12 & 3;
                    GL11.glRotatef((float)(var13 * 90), 0.0F, 1.0F, 0.0F);
                }

                GL11.glRotatef(var2.IlllIIIlIlllIllIlIIlllIlI + (var2.lIIIIIIIIIlIllIIllIlIIlIl - var2.IlllIIIlIlllIllIlIIlllIlI) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
                GL11.glRotatef(var2.IIIIllIIllIIIIllIllIIIlIl + (var2.IIIIllIlIIIllIlllIlllllIl - var2.IIIIllIIllIIIIllIllIIIlIl) * var1, -1.0F, 0.0F, 0.0F);
            }
        } else if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI > 0) {
            double var28 = (double)(this.IIIIlIIIlllllllllIlllIlll + (this.lIIIlllIlIlllIIIIIIIIIlII - this.IIIIlIIIlllllllllIlllIlll) * var1);
            float var29;
            float var14;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
                var29 = this.IlIIIIllIIIIIlllIIlIIlllI + (this.IlIllllIIIlIllllIIIIIllII - this.IlIIIIllIIIIIlllIIlIIlllI) * var1;
                var14 = this.llIlIlIlllIlllllIIIllIIll + (this.llIlIlIllIlIIlIlllIllIIlI - this.llIlIlIlllIlllllIIIllIIll) * var1;
                GL11.glTranslatef(0.0F, 0.0F, (float)(-var28));
                GL11.glRotatef(var14, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var29, 0.0F, 1.0F, 0.0F);
            } else {
                var29 = var2.lIIIIIIIIIlIllIIllIlIIlIl;
                var14 = var2.IIIIllIlIIIllIlllIlllllIl;
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 2) {
                    var14 += 180.0F;
                }

                double var15 = (double)(-lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var29 / 180.0F * 1.4545455F * 2.1598449F) * lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var14 / 180.0F * 15.315265F * 0.20512821F)) * var28;
                double var17 = (double)(lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var29 / 180.0F * 1.6923077F * 1.8563957F) * lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var14 / 180.0F * 0.97590363F * 3.219163F)) * var28;
                double var19 = (double)(-lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var14 / 180.0F * 2.8235295F * 1.1126474F)) * var28;

                for(int var21 = 0; var21 < 8; ++var21) {
                    float var22 = (float)((var21 & 1) * 2 - 1);
                    float var23 = (float)((var21 >> 1 & 1) * 2 - 1);
                    float var24 = (float)((var21 >> 2 & 1) * 2 - 1);
                    var22 *= 0.1F;
                    var23 *= 0.1F;
                    var24 *= 0.1F;
                    lIlIIlllIIIIIllIIIlIllIII var25 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var5 + (double)var22, var7 + (double)var23, var9 + (double)var24), lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var5 - var15 + (double)var22 + (double)var24, var7 - var19 + (double)var23, var9 - var17 + (double)var24));
                    if (var25 != null) {
                        double var26 = var25.IlIlIIIlllIIIlIlllIlIllIl.IIIIllIlIIIllIlllIlllllIl(lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var5, var7, var9));
                        if (var26 < var28) {
                            var28 = var26;
                        }
                    }
                }

                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 2) {
                    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                }

                GL11.glRotatef(var2.IIIIllIlIIIllIlllIlllllIl - var14, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var2.lIIIIIIIIIlIllIIllIlIIlIl - var29, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.0F, 0.0F, (float)(-var28));
                GL11.glRotatef(var29 - var2.lIIIIIIIIIlIllIIllIlIIlIl, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var14 - var2.IIIIllIlIIIllIlllIlllllIl, 1.0F, 0.0F, 0.0F);
            }
        } else {
            GL11.glTranslatef(0.0F, 0.0F, -0.1F);
        }

        if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
            GL11.glRotatef(var2.IIIIllIIllIIIIllIllIIIlIl + (var2.IIIIllIlIIIllIlllIlllllIl - var2.IIIIllIIllIIIIllIllIIIlIl) * var1, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.IlllIIIlIlllIllIlIIlllIlI + (var2.lIIIIIIIIIlIllIIllIlIIlIl - var2.IlllIIIlIlllIllIlIIlllIlI) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
        }

        GL11.glTranslatef(0.0F, var4, 0.0F);
        var5 = var3.lIllIllIlIIllIllIlIlIIlIl + (var3.IIIlIIlIlIIIlllIIlIllllll - var3.lIllIllIlIIllIllIlIlIIlIl) * (double)var1;
        var7 = var3.llIlIIIllIIIIlllIlIIIIIlI + (var3.IllIlIIIIlllIIllIIlllIIlI - var3.llIlIIIllIIIIlllIlIIIIIlI) * (double)var1 - (double)var4;
        var9 = var3.lIllIlIlllIIlIIllIIlIIlII + (var3.IllIlIlIllllIlIIllllIIlll - var3.lIllIlIlllIIlIIllIIlIIlII) * (double)var1;
        this.lIIlIlIIlIlIlIIlIlIlllIIl = this.IllIlIIIIlllIIllIIlllIIlI.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var5, var7, var9, var1);
    }

    private void IllIIIIIIIlIlIllllIIllIII(float var1) {
        IIIlIlllIlIllIIlIIIIIIllI var2 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        float var3 = var2.lIlIllIlIlIIIllllIlIllIll - 1.62F;
        double var4 = var2.lIllIllIlIIllIllIlIlIIlIl + (var2.IIIlIIlIlIIIlllIIlIllllll - var2.lIllIllIlIIllIllIlIlIIlIl) * (double)var1;
        double var6 = var2.llIlIIIllIIIIlllIlIIIIIlI + (var2.IllIlIIIIlllIIllIIlllIIlI - var2.llIlIIIllIIIIlllIlIIIIIlI) * (double)var1 - (double)var3;
        double var8 = var2.lIllIlIlllIIlIIllIIlIIlII + (var2.IllIlIlIllllIlIIllllIIlll - var2.lIllIlIlllIIlIIllIIlIIlII) * (double)var1;
        GL11.glRotatef(this.lIlIlIIIlIIllllllllIIlllI + (this.IllllllIllllIIlllIllllllI - this.lIlIlIIIlIIllllllllIIlllI) * var1, 0.0F, 0.0F, 1.0F);
        if (var2.llllIlIIIIIllIIlIlllIllll()) {
            var3 = (float)((double)var3 + 1.0D);
            GL11.glTranslatef(0.0F, 0.3F, 0.0F);
            if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
                IIlllllllIlllIIllllIIlIll var10 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.a_(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll));
                if (var10 == IllllllIllIIlllIllIIlIIll.IllIlIlIllllIlIIllllIIlll) {
                    int var11 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.IlllIIIlIlllIllIlIIlllIlI(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll));
                    int var12 = var11 & 3;
                    GL11.glRotatef((float)(var12 * 90), 0.0F, 1.0F, 0.0F);
                }

                GL11.glRotatef(var2.IlIlIIIlllllIIIlIlIlIllII + (var2.IllllIllllIlIIIlIIIllllll - var2.IlIlIIIlllllIIIlIlIlIllII) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
                GL11.glRotatef(var2.IIlIIllIIIllllIIlllIllIIl + (var2.IllIIlllIllIlIllIlIIIIIII - var2.IIlIIllIIIllllIIlllIllIIl) * var1, -1.0F, 0.0F, 0.0F);
            }
        } else if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI > 0) {
            double var27 = (double)(this.IIIIlIIIlllllllllIlllIlll + (this.lIIIlllIlIlllIIIIIIIIIlII - this.IIIIlIIIlllllllllIlllIlll) * var1);
            float var28;
            float var13;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
                var28 = this.IlIIIIllIIIIIlllIIlIIlllI + (this.IlIllllIIIlIllllIIIIIllII - this.IlIIIIllIIIIIlllIIlIIlllI) * var1;
                var13 = this.llIlIlIlllIlllllIIIllIIll + (this.llIlIlIllIlIIlIlllIllIIlI - this.llIlIlIlllIlllllIIIllIIll) * var1;
                GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
                GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
            } else {
                var28 = var2.IllllIllllIlIIIlIIIllllll;
                var13 = var2.IllIIlllIllIlIllIlIIIIIII;
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 2) {
                    var13 += 180.0F;
                }

                double var14 = (double)(-lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var28 / 180.0F * 1.6857327F * 1.8636364F) * lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var13 / 180.0F * 3.0F * 1.0471976F)) * var27;
                double var16 = (double)(lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var28 / 180.0F * 8.6393795F * 0.36363637F) * lIlIlllIllIlIllIIIlllIlII.lIIIIIIIIIlIllIIllIlIIlIl(var13 / 180.0F * 4.1887903F * 0.75F)) * var27;
                double var18 = (double)(-lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var13 / 180.0F * 1.3559322F * 2.3169246F)) * var27;

                for(int var20 = 0; var20 < 8; ++var20) {
                    float var21 = (float)((var20 & 1) * 2 - 1);
                    float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
                    float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
                    var21 *= 0.1F;
                    var22 *= 0.1F;
                    var23 *= 0.1F;
                    lIlIIlllIIIIIllIIIlIllIII var24 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
                    if (var24 != null) {
                        double var25 = var24.IlIlIIIlllIIIlIlllIlIllIl.IIIIllIlIIIllIlllIlllllIl(lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var4, var6, var8));
                        if (var25 < var27) {
                            var27 = var25;
                        }
                    }
                }

                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 2) {
                    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                }

                GL11.glRotatef(var2.IllIIlllIllIlIllIlIIIIIII - var13, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(var2.IllllIllllIlIIIlIIIllllll - var28, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
                GL11.glRotatef(var28 - var2.IllllIllllIlIIIlIIIllllll, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var13 - var2.IllIIlllIllIlIllIlIIIIIII, 1.0F, 0.0F, 0.0F);
            }
        } else {
            GL11.glTranslatef(0.0F, 0.0F, -0.1F);
        }

        if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIIIlIIllIIIIllllIlIlIlI) {
            GL11.glRotatef(var2.IIlIIllIIIllllIIlllIllIIl + (var2.IllIIlllIllIlIllIlIIIIIII - var2.IIlIIllIIIllllIIlllIllIIl) * var1, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.IlIlIIIlllllIIIlIlIlIllII + (var2.IllllIllllIlIIIlIIIllllll - var2.IlIlIIIlllllIIIlIlIlIllII) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
        }

        GL11.glTranslatef(0.0F, var3, 0.0F);
        var4 = var2.lIllIllIlIIllIllIlIlIIlIl + (var2.IIIlIIlIlIIIlllIIlIllllll - var2.lIllIllIlIIllIllIlIlIIlIl) * (double)var1;
        var6 = var2.llIlIIIllIIIIlllIlIIIIIlI + (var2.IllIlIIIIlllIIllIIlllIIlI - var2.llIlIIIllIIIIlllIlIIIIIlI) * (double)var1 - (double)var3;
        var8 = var2.lIllIlIlllIIlIIllIIlIIlII + (var2.IllIlIlIllllIlIIllllIIlll - var2.lIllIlIlllIIlIIllIIlIIlII) * (double)var1;
        this.lIIlIlIIlIlIlIIlIlIlllIIl = this.IllIlIIIIlllIIllIIlllIIlI.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var4, var6, var8, var1);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(float var1, int var2, boolean var3) {
        this.IllIlIlIllllIlIIllllIIlll = (float)(this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIIIlIlllIllIlIIlllIlI * 16);
        if (lIIIllIIIllIlllllIIlIllII.llIlIIIlIIIIlIlllIlIIIIll()) {
            this.IllIlIlIllllIlIIllllIIlll *= 0.95F;
        }

        if (lIIIllIIIllIlllllIIlIllII.IIIlIIllllIIllllllIlIIIll()) {
            this.IllIlIlIllllIlIIllllIIlll *= 0.83F;
        }

        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float var4 = 0.07F;
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var4, 0.0F, 0.0F);
        }

        float var5 = this.IllIlIlIllllIlIIllllIIlll * 2.0F;
        if (var5 < 128.0F) {
            var5 = 128.0F;
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIllllIIIIlIlIIIIlIlI.lIIIIllIIlIlIllIIIlIllIlI == 1) {
            var5 = 256.0F;
        }

        if (this.IlIIlllIlIIIlIIIlIlIlIlIl != 1.0D) {
            GL11.glTranslatef((float)this.IIIlllllIIlIlIIIllllllIII, (float)(-this.lIlIlIIIIllIlllIlIIlllIlI), 0.0F);
            GL11.glScaled(this.IlIIlllIlIIIlIIIlIlIlIlIl, this.IlIIlllIlIIIlIIIlIlIlIlIl, 1.0D);
        }

        Project.gluPerspective(this.lIIIIlIIllIIlIIlIIIlIIllI(var1, true), (float)this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII / (float)this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII, 0.05F, var5);
        float var6;
        if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI()) {
            var6 = 0.6666667F;
            GL11.glScalef(1.0F, var6, 1.0F);
        }

        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 2.3333333F * 0.042857144F, 0.0F, 0.0F);
        }

        this.IIIIllIIllIIIIllIllIIIlIl(var1);
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIlIIIllIlllIlllllIl) {
            this.IlIlIIIlllIIIlIlllIlIllIl(var1);
        }

        var6 = this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.lIIlIlIllIIlIIIlIIIlllIII + (this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.llIIlllIIIIlllIllIlIlllIl - this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.lIIlIlIllIIlIIIlIIIlllIII) * var1;
        if (var6 > 0.0F) {
            byte var7 = 20;
            if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.IlIlllIIIIllIllllIllIIlIl)) {
                var7 = 7;
            }

            float var8 = 5.0F / (var6 * var6 + 5.0F) - var6 * 0.168F * 0.23809524F;
            var8 *= var8;
            GL11.glRotatef(((float)this.lIlIlIllIIIIIIIIllllIIllI + var1) * (float)var7, 0.0F, 1.0F, 1.0F);
            GL11.glScalef(1.0F / var8, 1.0F, 1.0F);
            GL11.glRotatef(-((float)this.lIlIlIllIIIIIIIIllllIIllI + var1) * (float)var7, 0.0F, 1.0F, 1.0F);
        }

        if (var3) {
            this.IIIllIllIlIlllllllIlIlIII(var1);
        } else {
            this.IllIIIIIIIlIlIllllIIllIII(var1);
        }

        if (this.IIIlIIllllIIllllllIlIIIll > 0) {
            int var9 = this.IIIlIIllllIIllllllIlIIIll - 1;
            if (var9 == 1) {
                GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var9 == 2) {
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var9 == 3) {
                GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var9 == 4) {
                GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var9 == 5) {
                GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }
        }

    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(float var1, int var2) {
        if (this.IIIlIIllllIIllllllIlIIIll <= 0) {
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            float var3 = 0.07F;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
                GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
            }

            if (this.IlIIlllIlIIIlIIIlIlIlIlIl != 1.0D) {
                GL11.glTranslatef((float)this.IIIlllllIIlIlIIIllllllIII, (float)(-this.lIlIlIIIIllIlllIlIIlllIlI), 0.0F);
                GL11.glScaled(this.IlIIlllIlIIIlIIIlIlIlIlIl, this.IlIIlllIlIIIlIIIlIlIlIlIl, 1.0D);
            }

            Project.gluPerspective(this.lIIIIlIIllIIlIIlIIIlIIllI(var1, false), (float)this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII / (float)this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII, 0.05F, this.IllIlIlIllllIlIIllllIIlll * 2.0F);
            if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI()) {
                float var4 = 0.6666667F;
                GL11.glScalef(1.0F, var4, 1.0F);
            }

            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
                GL11.glTranslatef((float)(var2 * 2 - 1) * 0.45294118F * 0.22077923F, 0.0F, 0.0F);
            }

            GL11.glPushMatrix();
            this.IIIIllIIllIIIIllIllIIIlIl(var1);
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIlIIIllIlllIlllllIl) {
                this.IlIlIIIlllIIIlIlllIlIllIl(var1);
            }

            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 0 && !this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.llllIlIIIIIllIIlIlllIllll() && !this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl && !this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllIIIlIlllIlIllIl.lIIIIlIIllIIlIIlIIIlIIllI()) {
                this.lIIIIIIIIIlIllIIllIlIIlIl((double)var1);
                this.IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1);
                this.lIIIIlIIllIIlIIlIIIlIIllI((double)var1);
            }

            GL11.glPopMatrix();
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 0 && !this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.llllIlIIIIIllIIlIlllIllll()) {
                this.IlllIIIlIlllIllIlIIlllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1);
                this.IIIIllIIllIIIIllIllIIIlIl(var1);
            }

            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIlIIIllIlllIlllllIl) {
                this.IlIlIIIlllIIIlIlllIlIllIl(var1);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(double var1) {
        IIlIlIIIlIllIlllllllIlllI.IlllIllIlIIIIlIIlIIllIIIl(IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI);
        GL11.glDisable(3553);
        IIlIlIIIlIllIlllllllIlllI.IlllIllIlIIIIlIIlIIllIIIl(IIlIlIIIlIllIlllllllIlllI.lIIIIIIIIIlIllIIllIlIIlIl);
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(double var1) {
        IIlIlIIIlIllIlllllllIlllI.IlllIllIlIIIIlIIlIIllIIIl(IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI);
        GL11.glMatrixMode(5890);
        GL11.glLoadIdentity();
        float var3 = 0.00390625F;
        GL11.glScalef(var3, var3, var3);
        GL11.glTranslatef(8.0F, 8.0F, 8.0F);
        GL11.glMatrixMode(5888);
        this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(this.lIIllIIllllllIIlllIlllIIl);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 10496);
        GL11.glTexParameteri(3553, 10243, 10496);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(3553);
        IIlIlIIIlIllIlllllllIlllI.IlllIllIlIIIIlIIlIIllIIIl(IIlIlIIIlIllIlllllllIlllI.lIIIIIIIIIlIllIIllIlIIlIl);
    }

    private void llIIlllIIIIlllIllIlIlllIl() {
        this.IIIllIllIlIlllllllIlIlIII = (float)((double)this.IIIllIllIlIlllllllIlIlIII + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.lIIIIllIIlIlIllIIIlIllIlI = (float)((double)this.lIIIIllIIlIlIllIIIlIllIlI + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.IIIllIllIlIlllllllIlIlIII = (float)((double)this.IIIllIllIlIlllllllIlIlIII * 0.9593406631108456D * 0.938144326210022D);
        this.lIIIIllIIlIlIllIIIlIllIlI = (float)((double)this.lIIIIllIIlIlIllIIIlIllIlI * 0.8289473268133802D * 1.085714340209961D);
        this.IlIlIIIlllIIIlIlllIlIllIl += (this.IIIllIllIlIlllllllIlIlIII - this.IlIlIIIlllIIIlIlllIlIllIl) * 1.0F;
        this.IllIIIIIIIlIlIllllIIllIII += (this.lIIIIllIIlIlIllIIIlIllIlI - this.IllIIIIIIIlIlIllllIIllIII) * 1.0F;
        this.IllIIIIllllllIlllllIlIlll = true;
    }

    private void lIIIIllIIlIlIllIIIlIllIlI(float var1) {
        lIIIlIllIIIlIIIIllIllIIIl var2 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI;
        if (var2 != null) {
            if (lIIIllIllIIIIIlIIIIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.IlIlIIIlllIIIlIlllIlIllIl, this.IIIIIlIllIllIlIIllIIlIllI, this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.lIIIIIllllIIIIlIlIIIIlIlI))) {
                this.llIIIllIIllllIlIlIlIlIIll.lIIIIIIIIIlIllIIllIlIIlIl();
                this.IllIIIIllllllIlllllIlIlll = false;
                return;
            }

            for(int var3 = 0; var3 < 256; ++var3) {
                float var4 = var2.lIIIIIIIIIlIllIIllIlIIlIl(1.0F) * 12.349999F * 0.07692308F + 0.05F;
                float var5 = var2.lIIIIIllllIIIIlIlIIIIlIlI.IllIIIIIIIlIlIllllIIllIII[var3 / 16] * var4;
                float var6 = var2.lIIIIIllllIIIIlIlIIIIlIlI.IllIIIIIIIlIlIllllIIllIII[var3 % 16] * (this.IlIlIIIlllIIIlIlllIlIllIl * 8.555555F * 0.0116883125F + 1.5F);
                if (var2.llIlIIIlIIIIlIlllIlIIIIll > 0) {
                    var5 = var2.lIIIIIllllIIIIlIlIIIIlIlI.IllIIIIIIIlIlIllllIIllIII[var3 / 16];
                }

                float var7 = var5 * (var2.lIIIIIIIIIlIllIIllIlIIlIl(1.0F) * 0.20689656F * 3.1416664F + 0.35F);
                float var8 = var5 * (var2.lIIIIIIIIIlIllIIllIlIIlIl(1.0F) * 1.56F * 0.41666666F + 0.35F);
                float var9 = var6 * ((var6 * 2.862069F * 0.20963857F + 0.4F) * 0.5733333F * 1.0465117F + 0.4F);
                float var10 = var6 * (var6 * var6 * 0.56666666F * 1.0588236F + 0.4F);
                float var11 = var7 + var6;
                float var12 = var8 + var9;
                float var13 = var5 + var10;
                var11 = var11 * 1.0933334F * 0.8780487F + 0.03F;
                var12 = var12 * 3.28F * 0.29268292F + 0.03F;
                var13 = var13 * 3.25F * 0.29538462F + 0.03F;
                float var14;
                if (this.IIIlIllIlllIlIllIllllllll > 0.0F) {
                    var14 = this.IllllllllIlIIIIIIIIllIIII + (this.IIIlIllIlllIlIllIllllllll - this.IllllllllIlIIIIIIIIllIIII) * var1;
                    var11 = var11 * (1.0F - var14) + var11 * 0.6034483F * 1.16F * var14;
                    var12 = var12 * (1.0F - var14) + var12 * 0.09152543F * 6.5555553F * var14;
                    var13 = var13 * (1.0F - var14) + var13 * 1.2878788F * 0.4658824F * var14;
                }

                if (var2.lIIIIIllllIIIIlIlIIIIlIlI.lIIIIllIIlIlIllIIIlIllIlI == 1) {
                    var11 = 0.22F + var6 * 11.75F * 0.06382979F;
                    var12 = 0.28F + var9 * 0.21875F * 3.4285715F;
                    var13 = 0.25F + var10 * 1.1774193F * 0.6369863F;
                }

                float var15;
                if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.lIIIIIllllIIIIlIlIIIIlIlI)) {
                    var14 = this.lIIIIlIIllIIlIIlIIIlIIllI((lIllIIIIlIIlIllIIIlIlIlll)this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl, var1);
                    var15 = 1.0F / var11;
                    if (var15 > 1.0F / var12) {
                        var15 = 1.0F / var12;
                    }

                    if (var15 > 1.0F / var13) {
                        var15 = 1.0F / var13;
                    }

                    var11 = var11 * (1.0F - var14) + var11 * var15 * var14;
                    var12 = var12 * (1.0F - var14) + var12 * var15 * var14;
                    var13 = var13 * (1.0F - var14) + var13 * var15 * var14;
                }

                if (var11 > 1.0F) {
                    var11 = 1.0F;
                }

                if (var12 > 1.0F) {
                    var12 = 1.0F;
                }

                if (var13 > 1.0F) {
                    var13 = 1.0F;
                }

                var14 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
                var15 = 1.0F - var11;
                float var16 = 1.0F - var12;
                float var17 = 1.0F - var13;
                var15 = 1.0F - var15 * var15 * var15 * var15;
                var16 = 1.0F - var16 * var16 * var16 * var16;
                var17 = 1.0F - var17 * var17 * var17 * var17;
                var11 = var11 * (1.0F - var14) + var15 * var14;
                var12 = var12 * (1.0F - var14) + var16 * var14;
                var13 = var13 * (1.0F - var14) + var17 * var14;
                var11 = var11 * 0.37818182F * 2.5384614F + 0.03F;
                var12 = var12 * 2.166857F * 0.443038F + 0.03F;
                var13 = var13 * 0.45913044F * 2.090909F + 0.03F;
                if (var11 > 1.0F) {
                    var11 = 1.0F;
                }

                if (var12 > 1.0F) {
                    var12 = 1.0F;
                }

                if (var13 > 1.0F) {
                    var13 = 1.0F;
                }

                if (var11 < 0.0F) {
                    var11 = 0.0F;
                }

                if (var12 < 0.0F) {
                    var12 = 0.0F;
                }

                if (var13 < 0.0F) {
                    var13 = 0.0F;
                }

                short var18 = 255;
                int var19 = (int)(var11 * 255.0F);
                int var20 = (int)(var12 * 255.0F);
                int var21 = (int)(var13 * 255.0F);
                this.IIIIIlIllIllIlIIllIIlIllI[var3] = var18 << 24 | var19 << 16 | var20 << 8 | var21;
            }

            this.llIIIllIIllllIlIlIlIlIIll.lIIIIIIIIIlIllIIllIlIIlIl();
            this.IllIIIIllllllIlllllIlIlll = false;
        }

    }

    private float lIIIIlIIllIIlIIlIIIlIIllI(lIllIIIIlIIlIllIIIlIlIlll var1, float var2) {
        int var3 = var1.lIIIIIIIIIlIllIIllIlIIlIl(IIIlIlIIIIIIIlllllIlIllIl.lIIIIIllllIIIIlIlIIIIlIlI).lIIIIIIIIIlIllIIllIlIIlIl();
        return var3 > 200 ? 1.0F : 0.7F + lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(((float)var3 - var2) * 3.3991003F * 0.92424244F * 2.2F * 0.09090909F) * 1.35F * 0.22222222F;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1) {
        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI("lightTex");
        if (!this.IIIIIIIllIllllIIlIIlllIII) {
            lllIIlIlIlIlllIIIIIIIIIIl.IlllIIIlIlllIllIlIIlllIlI();
            IIlllIlIlllIllIIIlllIIlIl.IlllIIIlIlllIllIlIIlllIlI();
            lllIIIIIllllIIIIllIIIllll var2 = new lllIIIIIllllIIIIllIIIllll(this.IllIlIIIIlllIIllIIlllIIlI);
            this.IlllIIIlIlllIllIlIIlllIlI = var2;
            lIlIlIlIIlllIIIIIIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl = var2;
            if (lIIIllIIIllIlllllIIlIllII.lIlllllIlIllllIIIllllllII() == 64 && lIIIllIIIllIlllllIIlIllII.lIlIIIlIIIlllllllllllIlIl() == 32) {
                lIIIllIIIllIlllllIIlIllII.lIIIIlIIllIIlIIlIIIlIIllI(true);
            }

            this.IIIIIIIllIllllIIlIIlllIII = true;
        }

        lIIIllIIIllIlllllIIlIllII.lIIlIIIllIIlllIlllIlIIlll();
        lIIIlIllIIIlIIIIllIllIIIl var15 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI;
        if (var15 != null) {
            if (lIIIllIIIllIlllllIIlIllII.IlIllIIllIIIIIllIlIIIIIIl() != null) {
                String var3 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
                String var4 = var3 + " " + lIIIllIIIllIlllllIIlIllII.IlIllIIllIIIIIllIlIIIIIIl();
                lIlIIllIIlIIIIIlIllIllllI var5 = new lIlIIllIIlIIIIIlIllIllllI("A new §eOptiFine§f version is available: §e" + var4 + "§f");
                this.IllIlIIIIlllIIllIIlllIIlI.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var5);
                lIIIllIIIllIlllllIIlIllII.IlIlIIIlllIIIlIlllIlIllIl((String)null);
            }

            if (lIIIllIIIllIlllllIIlIllII.IIllllllIlIIIIlllIlIlIlll()) {
                lIIIllIIIllIlllllIIlIllII.lIIIIlIIllIIlIIlIIIlIIllI(false);
                lIlIIllIIlIIIIIlIllIllllI var16 = new lIlIIllIIlIIIIIlIllIllllI(IllIIIIlIlIllIIllIIllIIlI.lIIIIlIIllIIlIIlIIIlIIllI("You can install §e64-bit Java§f to increase performance", new Object[0]));
                this.IllIlIIIIlllIIllIIlllIIlI.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var16);
            }
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII instanceof llIIIIIIllllIIIIlllIlllIl) {
            this.lIIIIlIIllIIlIIlIIIlIIllI((llIIIIIIllllIIIIlllIlllIl)this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII);
        }

        if (this.IIIIlIllIIIIIIlIIIIIlllll != var15) {
            lIIllIllllIllIIIIlIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIlIllIIIIIIlIIIIIlllll, var15);
            lIIIllIIIllIlllllIIlIllII.IllIIIIIIIlIlIllllIIllIII();
            this.IIlIlIlllIllIIlIllIIlIIlI = 0L;
            this.lIlIIllIIIlllIIllIIlIIllI = 0;
            this.IIIIlIllIIIIIIlIIIIIlllll = var15;
        }

        lllIIIIIIIIIllIlllIlIllll.IlIlIIIlllIIIlIlllIlIllIl = lIIIllIIIllIlllllIIlIllII.IlllIIlllIIIIllIIllllIlIl() || lIIIllIIIllIlllllIIlIllII.IlIlllIIIIlIllIlllIlIIIll();
        IllllllIllIIlllIllIIlIIll.IllIllIIIlIIlllIIIllIllII.lIIIIIIIIIlIllIIllIlIIlIl(lIIIllIIIllIlllllIIlIllII.lIlIlIllIIIIIIIIllllIIllI());
        if (this.IllIIIIllllllIlllllIlIlll) {
            this.lIIIIllIIlIlIllIIIlIllIlI(var1);
        }

        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIIIIIIlIllIIllIlIIlIl();
        boolean var17 = Display.isActive();
        if (var17 || !this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIlIIIIIllIlIlIIllIlIIIl || this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIIIlIIllIlIlIllIIIIll && Mouse.isButtonDown(1)) {
            this.IIllllIllllIIIlIIllllIlll = lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII();
        } else if (lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII() - this.IIllllIllllIIIlIIllllIlll > 500L) {
            this.IllIlIIIIlllIIllIIlllIIlI.IIIlIIllllIIllllllIlIIIll();
        }

        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI("mouse");
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIlIlIllIIIIIIIIllllIIllI && var17) {
            this.IllIlIIIIlllIIllIIlllIIlI.llIlIIIllIIIIlllIlIIIIIlI.IlllIIIlIlllIllIlIIlllIlI();
            float var18 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI * 10.0F * 0.060000002F + 0.2F;
            float var20 = var18 * var18 * var18 * 8.0F;
            float var6 = (float)this.IllIlIIIIlllIIllIIlllIIlI.llIlIIIllIIIIlllIlIIIIIlI.lIIIIlIIllIIlIIlIIIlIIllI * var20;
            float var7 = (float)this.IllIlIIIIlllIIllIIlllIIlI.llIlIIIllIIIIlllIlIIIIIlI.lIIIIIIIIIlIllIIllIlIIlIl * var20;
            byte var8 = 1;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIIIIIIlIllIIllIlIIlIl) {
                var8 = -1;
            }

            llllIIIllllllIlllIIlIIlll var9 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().IlIIlIIIIlIIIIllllIIlIllI;
            float var10;
            if (!var9.lIIIIlIIllIIlIIlIIIlIIllI) {
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lllIIlIlIllIIlIllIIIIIlII) {
                    this.IIllIlIllIlIllIIlIllIlIII += var6;
                    this.lIlIllIlIlIIIllllIlIllIll += var7;
                    var10 = var1 - this.IIlIlIIlIIIlIlllllIIlIIlI;
                    this.IIlIlIIlIIIlIlllllIIlIIlI = var1;
                    var6 = this.IlIIlIIlIllIIIIllIIllIlIl * var10;
                    var7 = this.llllIIIIlIlIllIIIllllIIll * var10;
                    this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.IIIllIllIlIlllllllIlIlIII(var6, var7 * (float)var8);
                } else {
                    this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl.IIIllIllIlIlllllllIlIlIII(var6, var7 * (float)var8);
                }
            } else if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lllIIlIlIllIIlIllIIIIIlII) {
                this.IIllIlIllIlIllIIlIllIlIII += var6;
                this.lIlIllIlIlIIIllllIlIllIll += var7;
                var10 = var1 - this.IIlIlIIlIIIlIlllllIIlIIlI;
                this.IIlIlIIlIIIlIlllllIIlIIlI = var1;
                var6 = this.IlIIlIIlIllIIIIllIIllIlIl * var10;
                var7 = this.llllIIIIlIlIllIIIllllIIll * var10;
                var9.lIIIIlIIllIIlIIlIIIlIIllI(var6, var7 * (float)var8);
            } else {
                var9.lIIIIlIIllIIlIIlIIIlIIllI(var6, var7 * (float)var8);
            }
        }

        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIIIIIIlIllIIllIlIIlIl();
        if (!this.IllIlIIIIlllIIllIIlllIIlI.lIIlIIllIIIIIlIllIIIIllII) {
            lIIIIlIIllIIlIIlIIIlIIllI = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl;
            llIIllIIIllIIlIlIIIIIIIII var19 = new llIIllIIIllIIlIlIIIIIIIII(this.IllIlIIIIlllIIllIIlllIIlI, this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
            int var21 = var19.lIIIIlIIllIIlIIlIIIlIIllI();
            int var22 = var19.lIIIIIIIIIlIllIIllIlIIlIl();
            int var23 = Mouse.getX() * var21 / this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII;
            int var25 = var22 - Mouse.getY() * var22 / this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII - 1;
            int var24 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIIIlIlIllllIIllIII;
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI != null) {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI("level");
                if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl()) {
                    this.lIIIIlIIllIIlIIlIIIlIIllI(var1, this.llllIIIIIlIlIlIlIllIIIIII + (long)(1000000000 / var24));
                } else {
                    this.lIIIIlIIllIIlIIlIIIlIIllI(var1, 0L);
                }

                if (IIlIlIIIlIllIlllllllIlllI.lIIlIIllIIIIIlIllIIIIllII) {
                    if (this.IIIIllIlIIIllIlllIlllllIl != null) {
                        GL11.glMatrixMode(5890);
                        GL11.glPushMatrix();
                        GL11.glLoadIdentity();
                        this.IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1);
                        GL11.glPopMatrix();
                    }

                    this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(true);
                }

                this.llllIIIIIlIlIlIlIllIIIIII = System.nanoTime();
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("gui");
                if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl || this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII != null) {
                    GL11.glAlphaFunc(516, 0.1F);
                    boolean var26 = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIllIIlIlIllIIIlIllIlI;
                    if (!lIIIllIIIllIlllllIIlIllII.IllIIIlIIlIllIllIIllllIIl()) {
                        this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIllIIlIlIllIIIlIllIlI = false;
                    }

                    this.IllIlIIIIlllIIllIIlllIIlI.IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI(var1, this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII != null, var23, var25);
                    this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIIIllIIlIlIllIIIlIllIlI = var26;
                    if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllllIllllIlIIIlIIIllllll && !this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llllIIllIIlIIllIIIllIlIlI) {
                        lIIIllIIIllIlllllIIlIllII.IlllllIllIIIllIIIllIllIII();
                    }
                }

                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIIIIIIlIllIIllIlIIlIl();
            } else {
                GL11.glViewport(0, 0, this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
                GL11.glMatrixMode(5889);
                GL11.glLoadIdentity();
                GL11.glMatrixMode(5888);
                GL11.glLoadIdentity();
                this.lIIIIllIIlIlIllIIIlIllIlI();
                this.llllIIIIIlIlIlIlIllIIIIII = System.nanoTime();
            }

            if (this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII != null) {
                GL11.glClear(256);

                try {
                    this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(var23, var25, var1);
                    IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IIIlllIIIllIllIlIIIIIIlII();
                } catch (Throwable var2020) {
                    IIIIllIIllIlIIIllllllIlIl var12 = IIIIllIIllIlIIIllllllIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var2020, "Rendering screen");
                    lIlIllIIIIIlllIlllIIIllIl var13 = var12.lIIIIlIIllIIlIIlIIIlIIllI("Screen render details");
                    var13.lIIIIlIIllIIlIIlIIIlIIllI("Screen name", new llIIlIlIlllllIlIIlIIllIlI(this));
                    var13.lIIIIlIIllIIlIIlIIIlIIllI("Mouse location", new llIIlllllIlllIlIIllIlllll(this, var23, var25));
                    var13.lIIIIlIIllIIlIIlIIIlIIllI("Screen size", new IIIIlllIlllllllIllllIIlII(this, var19));
                    throw new lIIlllIIIIIIIIlIIllIIllII(var12);
                }
            }
        }

        this.llIlIIIlIIIIlIlllIlIIIIll();
        this.IIIlllIIIllIllIlIIIIIIlII();
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llllIIllIIlIIllIIIllIlIlI != this.IIlllllIIlIlIIlIIlllIIIII) {
            this.IllIlIlllIIlIIIIIlIIIIIll = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llIllllIIIIIlIllIlIIIllIl;
            this.IIlllllIIlIlIIlIIlllIIIII = this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llllIIllIIlIIllIIIllIlIlI;
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llllIIllIIlIIllIIIllIlIlI) {
            this.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI, this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IIIIllIlIIIllIlllIlllllIl);
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIIlllIIIIllIIllllIlIl) {
            this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.llIllllIIIIIlIllIlIIIllIl = true;
        }

    }

    public void IlllIIIlIlllIllIlIIlllIlI(float var1) {
        this.lIIIIllIIlIlIllIIIlIllIlI();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, long var2) {
        float var4 = (float)(Integer)lIIIllllIIllIIIIIlIIlIIlI.cb.IlIlIIIlllIIIlIlllIlIllIl().lIIlIIllIIIIIlIllIIIIllII.IIIIllIlIIIllIlllIlllllIl();
        if (var4 == 100.0F || !(Boolean)lIIIllllIIllIIIIIlIIlIIlI.cb.IlIlIIIlllIIIlIlllIlIllIl().IlIIlIIIIlIIIIllllIIlIllI.IIIIllIlIIIllIlllIlllllIl()) {
            this.IlIlllIllIlIllIlllIlllIll = 0.0F;
        }

        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIlIIllIIlIIlIIIlIIllI("lightTex");
        if (this.IllIIIIllllllIlllllIlIlll) {
            this.lIIIIllIIlIlIllIIIlIllIlI(var1);
        }

        GL11.glEnable(2884);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        if (this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl == null) {
            this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl = this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl;
        }

        boolean var5 = lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().IlIIlIIIIlIIIIllllIIlIllI.lIIIIlIIllIIlIIlIIIlIIllI;
        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("pick");
        this.lIIIIlIIllIIlIIlIIIlIIllI(var1);
        IIIlIlllIlIllIIlIIIIIIllI var6 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        lIIIIllIlIIllIlIIIlllIlIl var7 = this.IllIlIIIIlllIIllIIlllIIlI.IlllIllIlIIIIlIIlIIllIIIl;
        lllIllIIIIIlIIlIlIIlIIIIl var8 = this.IllIlIIIIlllIIllIIlllIIlI.IIIlllIIIllIllIlIIIIIIlII;
        double var9 = var6.lIlIlIIIlIIllllllllIIlllI + (var6.IIIlIIlIlIIIlllIIlIllllll - var6.lIlIlIIIlIIllllllllIIlllI) * (double)var1;
        double var11 = var6.IlIlllIllIlIllIlllIlllIll + (var6.IllIlIIIIlllIIllIIlllIIlI - var6.IlIlllIllIlIllIlllIlllIll) * (double)var1;
        double var13 = var6.llIIIllIIllllIlIlIlIlIIll + (var6.IllIlIlIllllIlIIllllIIlll - var6.llIIIllIIllllIlIlIlIlIIll) * (double)var1;
        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("center");

        for(int var15 = 0; var15 < 2; ++var15) {
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
                lIIIIIIIIIlIllIIllIlIIlIl = var15;
                if (lIIIIIIIIIlIllIIllIlIIlIl == 0) {
                    GL11.glColorMask(false, true, true, false);
                } else {
                    GL11.glColorMask(true, false, false, false);
                }
            }

            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("clear");
            GL11.glViewport(0, 0, this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
            this.IlllIllIlIIIIlIIlIIllIIIl(var1);
            GL11.glClear(16640);
            GL11.glEnable(2884);
            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("camera");
            this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var15, var5);
            IlIIIllIlIlIIIlIIlIIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl, this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlIllIllllIIIlIIIllIIIllI == 2);
            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("frustrum");
            IlllIIIlIIlIIIIllllIllllI.lIIIIlIIllIIlIIlIIIlIIllI();
            if (!lIIIllIIIllIlllllIIlIllII.IllllllllIlIIIIIIIIllIIII() && !lIIIllIIIllIlllllIIlIllII.lIIlIlIIlIlIlIIlIlIlllIIl() && !lIIIllIIIllIlllllIIlIllII.IIlIlllIllIlIlIIIIIlllIll()) {
                GL11.glDisable(3042);
            } else {
                this.lIIIIlIIllIIlIIlIIIlIIllI(-1, var1);
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("sky");
                var7.lIIIIlIIllIIlIIlIIIlIIllI(var1);
            }

            GL11.glEnable(2912);
            this.lIIIIlIIllIIlIIlIIIlIIllI(1, var1);
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIllIlIIIIlIIlIIllIIIl != 0) {
                GL11.glShadeModel(7425);
            }

            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("culling");
            lIIIlIIIIlIlIIlIIlIIlIIll var16 = new lIIIlIIIIlIlIIlIIlIIlIIll();
            var16.lIIIIlIIllIIlIIlIIIlIIllI(var9, var11, var13);
            this.IllIlIIIIlllIIllIIlllIIlI.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var16, var1);
            if (var15 == 0) {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("updatechunks");
                if (this.IlIlllIllIlIllIlllIlllIll == 0.0F) {
                    while(!this.IllIlIIIIlllIIllIIlllIIlI.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var6, false) && var2 != 0L) {
                        long var17 = var2 - System.nanoTime();
                        if (var17 < 0L || var17 > 1000000000L) {
                            break;
                        }
                    }
                }

                ++this.IlIlllIllIlIllIlllIlllIll;
                if (this.IlIlllIllIlIllIlllIlllIll >= 100.0F / var4) {
                    this.IlIlllIllIlIllIlllIlllIll = 0.0F;
                }
            }

            if (var6.IllIlIIIIlllIIllIIlllIIlI < 128.0D) {
                this.lIIIIlIIllIIlIIlIIIlIIllI(var7, var1);
            }

            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("prepareterrain");
            this.lIIIIlIIllIIlIIlIIIlIIllI(0, var1);
            GL11.glEnable(2912);
            this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(llllIlIllIlIllIlIIIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI);
            llIlIlllllIIllIIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI();
            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("terrain");
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            var7.lIIIIlIIllIIlIIlIIIlIIllI(var6, 0, (double)var1);
            GL11.glShadeModel(7424);
            GL11.glAlphaFunc(516, 0.1F);
            lIllIIIIlIIlIllIIIlIlIlll var19;
            if (this.IIIlIIllllIIllllllIlIIIll == 0) {
                GL11.glMatrixMode(5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                llIlIlllllIIllIIIIllIllII.lIIIIIIIIIlIllIIllIlIIlIl();
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("entities");
                var7.lIIIIlIIllIIlIIlIIIlIIllI(var6, var16, var1);
                llIlIlllllIIllIIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI();
                this.lIIIIlIIllIIlIIlIIIlIIllI((double)var1);
                GL11.glMatrixMode(5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl != null && var6.lIIIIlIIllIIlIIlIIIlIIllI(llIIlIlIIllllIIIIIIIIIIlI.IllIIIIIIIlIlIllllIIllIII) && var6 instanceof lIllIIIIlIIlIllIIIlIlIlll && !this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl) {
                    var19 = (lIllIIIIlIIlIllIIIlIlIlll)var6;
                    GL11.glDisable(3008);
                    this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("outline");
                    if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl) {
                        var7.lIIIIlIIllIIlIIlIIIlIIllI(var19, this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl, 0, var1);
                    }

                    GL11.glEnable(3008);
                }
            }

            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            if (this.IlIIlllIlIIIlIIIlIlIlIlIl == 1.0D && var6 instanceof lIllIIIIlIIlIllIIIlIlIlll && !this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl && this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl != null && !var6.lIIIIlIIllIIlIIlIIIlIIllI(llIIlIlIIllllIIIIIIIIIIlI.IllIIIIIIIlIlIllllIIllIII)) {
                var19 = (lIllIIIIlIIlIllIIIlIlIlll)var6;
                GL11.glDisable(3008);
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("outline");
                if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IllIIIIIllllIlllIIlIIllIl) {
                    var7.lIIIIlIIllIIlIIlIIIlIIllI(var19, this.IllIlIIIIlllIIllIIlllIIlI.lIIlllIIlIlllllllllIIIIIl, 0, var1);
                }

                GL11.glEnable(3008);
            }

            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("destroyProgress");
            GL11.glEnable(3042);
            IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 1, 1, 0);
            var7.lIIIIlIIllIIlIIlIIIlIIllI(lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl, var6, var1);
            GL11.glDisable(3042);
            if (this.IIIlIIllllIIllllllIlIIIll == 0) {
                this.lIIIIIIIIIlIllIIllIlIIlIl((double)var1);
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("litParticles");
                var8.lIIIIIIIIIlIllIIllIlIIlIl(var6, var1);
                llIlIlllllIIllIIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI();
                this.lIIIIlIIllIIlIIlIIIlIIllI(0, var1);
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("particles");
                var8.lIIIIlIIllIIlIIlIIIlIIllI(var6, var1);
                this.lIIIIlIIllIIlIIlIIIlIIllI((double)var1);
            }

            GL11.glDepthMask(false);
            GL11.glEnable(2884);
            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("weather");
            this.IIIIllIlIIIllIlllIlllllIl(var1);
            GL11.glDepthMask(true);
            lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIIIlIlIlIllllllIlllIlI().lIIIIlIIllIIlIIlIIIlIIllI(new IIIlIIlIlIIIlllIIlIllllll(var1));
            GL11.glDisable(3042);
            GL11.glEnable(2884);
            IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 771, 1, 0);
            GL11.glAlphaFunc(516, 0.1F);
            this.lIIIIlIIllIIlIIlIIIlIIllI(0, var1);
            GL11.glEnable(3042);
            GL11.glDepthMask(false);
            this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(llllIlIllIlIllIlIIIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI);
            IIlllllIlIIlIIIlIIllllIII.IlllIIIlIlllIllIlIIlllIlI();
            if (lIIIllIIIllIlllllIIlIllII.lIllIlIlllIIlIIllIIlIIlII()) {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("water");
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIllIlIIIIlIIlIIllIIIl != 0) {
                    GL11.glShadeModel(7425);
                }

                GL11.glEnable(3042);
                IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 771, 1, 0);
                if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
                    if (lIIIIIIIIIlIllIIllIlIIlIl == 0) {
                        GL11.glColorMask(false, true, true, true);
                    } else {
                        GL11.glColorMask(true, false, false, true);
                    }

                    var7.lIIIIIIIIIlIllIIllIlIIlIl(1, (double)var1);
                } else {
                    var7.lIIIIIIIIIlIllIIllIlIIlIl(1, (double)var1);
                }

                GL11.glDisable(3042);
                GL11.glShadeModel(7424);
            } else {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("water");
                var7.lIIIIIIIIIlIllIIllIlIIlIl(1, (double)var1);
            }

            if (lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIIIIllllIIIIlIlIIIIlIlI.IlIlIIIlllIIIlIlllIlIllIl()) {
                lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIIIIllllIIIIlIlIIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI.rewind();
                GL11.glGetFloat(2982, lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIIIIllllIIIIlIlIIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI);
                lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIIIIllllIIIIlIlIIIIlIlI.lIIIIIIIIIlIllIIllIlIIlIl.rewind();
                GL11.glGetFloat(2983, lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIIIIllllIIIIlIlIIIIlIlI.lIIIIIIIIIlIllIIllIlIIlIl);
            }

            if (lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.IlllIIIlIlllIllIlIIlllIlI()) {
                lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI.rewind();
                GL11.glGetFloat(2982, lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI);
                lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIIIIIIlIllIIllIlIIlIl.rewind();
                GL11.glGetFloat(2983, lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIIIIIIlIllIIllIlIIlIl);
            }

            IIlllllIlIIlIIIlIIllllIII.IIIIllIlIIIllIlllIlllllIl();
            GL11.glDepthMask(true);
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            GL11.glDisable(2912);
            if (var6.IllIlIIIIlllIIllIIlllIIlI >= 128.0D + (double)(this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIIlllIIlIlllllllllIIIIIl * 128.0F)) {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("aboveClouds");
                this.lIIIIlIIllIIlIIlIIIlIIllI(var7, var1);
            }

            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("hand");
            if (this.IlIIlllIlIIIlIIIlIlIlIlIl == 1.0D) {
                GL11.glClear(256);
                this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var15);
            }

            if (!this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
                this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIIIIIIlIllIIllIlIIlIl();
                return;
            }
        }

        GL11.glColorMask(true, true, true, false);
        this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.lIIIIIIIIIlIllIIllIlIIlIl();
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIllIlIIllIlIIIlllIlIl var1, float var2) {
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl()) {
            this.IllIlIIIIlllIIllIIlllIIlI.IllllIllllIlIIIlIIIllllll.IlllIIIlIlllIllIlIIlllIlI("clouds");
            GL11.glPushMatrix();
            this.lIIIIlIIllIIlIIlIIIlIIllI(0, var2);
            GL11.glEnable(2912);
            var1.lIIIIIIIIIlIllIIllIlIIlIl(var2);
            GL11.glDisable(2912);
            this.lIIIIlIIllIIlIIlIIIlIIllI(1, var2);
            GL11.glPopMatrix();
        }

    }

    private void lIIlIlIllIIlIIIlIIIlllIII() {
        float var1 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.IlllIllIlIIIIlIIlIIllIIIl(1.0F);
        if (!lIIIllIIIllIlllllIIlIllII.llIlIIIllIIIIlllIlIIIIIlI()) {
            var1 /= 2.0F;
        }

        if (var1 != 0.0F && lIIIllIIIllIlllllIIlIllII.lIlIllIlIlIIIllllIlIllIll()) {
            this.IIIllllIlIIlIIIlIlIlllIII.setSeed((long)this.lIlIlIllIIIIIIIIllllIIllI * 312987231L);
            IIIlIlllIlIllIIlIIIIIIllI var2 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
            lIIIlIllIIIlIIIIllIllIIIl var3 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI;
            int var4 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll);
            int var5 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI);
            int var6 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll);
            byte var7 = 10;
            double var8 = 0.0D;
            double var10 = 0.0D;
            double var12 = 0.0D;
            int var14 = 0;
            int var15 = (int)(100.0F * var1 * var1);
            if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIllIlllIIllIllllIllIIlll == 1) {
                var15 >>= 1;
            } else if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIllIlllIIllIllllIllIIlll == 2) {
                var15 = 0;
            }

            for(int var16 = 0; var16 < var15; ++var16) {
                int var17 = var4 + this.IIIllllIlIIlIIIlIlIlllIII.nextInt(var7) - this.IIIllllIlIIlIIIlIlIlllIII.nextInt(var7);
                int var18 = var6 + this.IIIllllIlIIlIIIlIlIlllIII.nextInt(var7) - this.IIIllllIlIIlIIIlIlIlllIII.nextInt(var7);
                int var19 = var3.IllIIIIIIIlIlIllllIIllIII(var17, var18);
                IIlllllllIlllIIllllIIlIll var20 = var3.a_(var17, var19 - 1, var18);
                IIlIIlIIllIIllIlIIIIIIIlI var21 = var3.a_(var17, var18);
                if (var19 <= var5 + var7 && var19 >= var5 - var7 && var21.IIIIllIIllIIIIllIllIIIlIl() && var21.lIIIIlIIllIIlIIlIIIlIIllI(var17, var19, var18) >= 0.15F) {
                    float var22 = this.IIIllllIlIIlIIIlIlIlllIII.nextFloat();
                    float var23 = this.IIIllllIlIIlIIIlIlIlllIII.nextFloat();
                    if (var20.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.lIIIIllIIlIlIllIIIlIllIlI) {
                        this.IllIlIIIIlllIIllIIlllIIlI.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(new IllIIIIlllllIllIIIIIIIIIl(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - var20.IllIllIIIlIIlllIIIllIllII(), (double)((float)var18 + var23), 0.0D, 0.0D, 0.0D));
                    } else if (var20.IlIlIIIlllIIIlIlllIlIllIl() != llIIlIlIIllllIIIIIIIIIIlI.lIIIIlIIllIIlIIlIIIlIIllI) {
                        ++var14;
                        if (this.IIIllllIlIIlIIIlIlIlllIII.nextInt(var14) == 0) {
                            var8 = (double)((float)var17 + var22);
                            var10 = (double)((float)var19 + 0.1F) - var20.IllIllIIIlIIlllIIIllIllII();
                            var12 = (double)((float)var18 + var23);
                        }

                        IIlllIlIIllIlllIIllIIIlII var24 = new IIlllIlIIllIlllIIllIIIlII(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - var20.IllIllIIIlIIlllIIIllIllII(), (double)((float)var18 + var23));
                        lIIIllIllIIIIIlIIIIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var24, var3);
                        this.IllIlIIIIlllIIllIIlllIIlI.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(var24);
                    }
                }
            }

            if (var14 > 0 && this.IIIllllIlIIlIIIlIlIlllIII.nextInt(3) < this.IIlIlllllIIIlIIllIllIlIlI++) {
                this.IIlIlllllIIIlIIllIllIlIlI = 0;
                if (var10 > var2.IllIlIIIIlllIIllIIlllIIlI + 1.0D && var3.IllIIIIIIIlIlIllllIIllIII(lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IIIlIIlIlIIIlllIIlIllllll), lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIlIllllIlIIllllIIlll)) > lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var2.IllIlIIIIlllIIllIIlllIIlI)) {
                    this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F, false);
                } else {
                    this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F, false);
                }
            }
        }

    }

    protected void IIIIllIlIIIllIlllIlllllIl(float var1) {
        float var2 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.IlllIllIlIIIIlIIlIIllIIIl(var1);
        if (var2 > 0.0F) {
            this.lIIIIIIIIIlIllIIllIlIIlIl((double)var1);
            if (this.IlllIllIlIIIIlIIlIIllIIIl == null) {
                this.IlllIllIlIIIIlIIlIIllIIIl = new float[1024];
                this.IlIlllIIIIllIllllIllIIlIl = new float[1024];

                for(int var3 = 0; var3 < 32; ++var3) {
                    for(int var4 = 0; var4 < 32; ++var4) {
                        float var5 = (float)(var4 - 16);
                        float var6 = (float)(var3 - 16);
                        float var7 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var5 * var5 + var6 * var6);
                        this.IlllIllIlIIIIlIIlIIllIIIl[var3 << 5 | var4] = -var6 / var7;
                        this.IlIlllIIIIllIllllIllIIlIl[var3 << 5 | var4] = var5 / var7;
                    }
                }
            }

            if (lIIIllIIIllIlllllIIlIllII.IIIlIIlIlIIIlllIIlIllllll()) {
                return;
            }

            IIIlIlllIlIllIIlIIIIIIllI var41 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
            lIIIlIllIIIlIIIIllIllIIIl var42 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI;
            int var43 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var41.IIIlIIlIlIIIlllIIlIllllll);
            int var44 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var41.IllIlIIIIlllIIllIIlllIIlI);
            int var45 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var41.IllIlIlIllllIlIIllllIIlll);
            lIllIIlIIIIlIIllllIllllll var8 = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
            GL11.glDisable(2884);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            GL11.glEnable(3042);
            IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 771, 1, 0);
            GL11.glAlphaFunc(516, 0.1F);
            double var9 = var41.lIlIlIIIlIIllllllllIIlllI + (var41.IIIlIIlIlIIIlllIIlIllllll - var41.lIlIlIIIlIIllllllllIIlllI) * (double)var1;
            double var11 = var41.IlIlllIllIlIllIlllIlllIll + (var41.IllIlIIIIlllIIllIIlllIIlI - var41.IlIlllIllIlIllIlllIlllIll) * (double)var1;
            double var13 = var41.llIIIllIIllllIlIlIlIlIIll + (var41.IllIlIlIllllIlIIllllIIlll - var41.llIIIllIIllllIlIlIlIlIIll) * (double)var1;
            int var15 = lIlIlllIllIlIllIIIlllIlII.IlllIIIlIlllIllIlIIlllIlI(var11);
            byte var16 = 5;
            if (lIIIllIIIllIlllllIIlIllII.llIlIIIllIIIIlllIlIIIIIlI()) {
                var16 = 10;
            }

            boolean var17 = false;
            byte var18 = -1;
            float var19 = (float)this.lIlIlIllIIIIIIIIllllIIllI + var1;
            if (lIIIllIIIllIlllllIIlIllII.llIlIIIllIIIIlllIlIIIIIlI()) {
                var16 = 10;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var17 = false;

            for(int var20 = var45 - var16; var20 <= var45 + var16; ++var20) {
                for(int var21 = var43 - var16; var21 <= var43 + var16; ++var21) {
                    int var22 = (var20 - var45 + 16) * 32 + var21 - var43 + 16;
                    float var23 = this.IlllIllIlIIIIlIIlIIllIIIl[var22] * 0.4871795F * 1.0263158F;
                    float var24 = this.IlIlllIIIIllIllllIllIIlIl[var22] * 1.5F * 0.33333334F;
                    IIlIIlIIllIIllIlIIIIIIIlI var25 = var42.a_(var21, var20);
                    if (var25.IIIIllIIllIIIIllIllIIIlIl() || var25.IIIIllIlIIIllIlllIlllllIl()) {
                        int var26 = var42.IllIIIIIIIlIlIllllIIllIII(var21, var20);
                        int var27 = var44 - var16;
                        int var28 = var44 + var16;
                        if (var27 < var26) {
                            var27 = var26;
                        }

                        if (var28 < var26) {
                            var28 = var26;
                        }

                        float var29 = 1.0F;
                        int var30 = var26;
                        if (var26 < var15) {
                            var30 = var15;
                        }

                        if (var27 != var28) {
                            this.IIIllllIlIIlIIIlIlIlllIII.setSeed((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                            float var31 = var25.lIIIIlIIllIIlIIlIIIlIIllI(var21, var27, var20);
                            float var32;
                            double var33;
                            if (var42.lIIIIllIIlIlIllIIIlIllIlI().lIIIIlIIllIIlIIlIIIlIIllI(var31, var26) >= 0.15F) {
                                if (var18 != 0) {
                                    if (var18 >= 0) {
                                        var8.lIIIIlIIllIIlIIlIIIlIIllI();
                                    }

                                    var18 = 0;
                                    this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(llIlIIIllIIIIlllIlIIIIIlI);
                                    var8.lIIIIIIIIIlIllIIllIlIIlIl();
                                }

                                var32 = ((float)(this.lIlIlIllIIIIIIIIllllIIllI + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31) + var1) / 32.0F * (3.0F + this.IIIllllIlIIlIIIlIlIlllIII.nextFloat());
                                double var35 = (double)((float)var21 + 0.5F) - var41.IIIlIIlIlIIIlllIIlIllllll;
                                var33 = (double)((float)var20 + 0.5F) - var41.IllIlIlIllllIlIIllllIIlll;
                                float var37 = lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var35 * var35 + var33 * var33) / (float)var16;
                                float var38 = 1.0F;
                                var8.lIIIIIIIIIlIllIIllIlIIlIl(var42.lIIIIlIIllIIlIIlIIIlIIllI(var21, var30, var20, 0));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI(var38, var38, var38, ((1.0F - var37 * var37) * 0.028985508F * 17.25F + 0.5F) * var2);
                                var8.lIIIIIIIIIlIllIIllIlIIlIl(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                                var8.lIIIIIIIIIlIllIIllIlIIlIl(0.0D, 0.0D, 0.0D);
                            } else {
                                if (var18 != 1) {
                                    if (var18 >= 0) {
                                        var8.lIIIIlIIllIIlIIlIIIlIIllI();
                                    }

                                    var18 = 1;
                                    this.IllIlIIIIlllIIllIIlllIIlI.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(lIllIlIlllIIlIIllIIlIIlII);
                                    var8.lIIIIIIIIIlIllIIllIlIIlIl();
                                }

                                var32 = ((float)(this.lIlIlIllIIIIIIIIllllIIllI & 511) + var1) / 512.0F;
                                float var46 = this.IIIllllIlIIlIIIlIlIlllIII.nextFloat() + var19 * 7.0F * 0.0014285714F * (float)this.IIIllllIlIIlIIIlIlIlllIII.nextGaussian();
                                float var36 = this.IIIllllIlIIlIIIlIlIlllIII.nextFloat() + var19 * (float)this.IIIllllIlIIlIIIlIlIlllIII.nextGaussian() * 4.0909092E-4F * 2.4444444F;
                                var33 = (double)((float)var21 + 0.5F) - var41.IIIlIIlIlIIIlllIIlIllllll;
                                double var47 = (double)((float)var20 + 0.5F) - var41.IllIlIlIllllIlIIllllIIlll;
                                float var39 = lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var33 * var33 + var47 * var47) / (float)var16;
                                float var40 = 1.0F;
                                var8.lIIIIIIIIIlIllIIllIlIIlIl((var42.lIIIIlIIllIIlIIlIIIlIIllI(var21, var30, var20, 0) * 3 + 15728880) / 4);
                                var8.lIIIIlIIllIIlIIlIIIlIIllI(var40, var40, var40, ((1.0F - var39 * var39) * 0.37349397F * 0.8032259F + 0.5F) * var2);
                                var8.lIIIIIIIIIlIllIIllIlIIlIl(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var36));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var36));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var36));
                                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var36));
                                var8.lIIIIIIIIIlIllIIllIlIIlIl(0.0D, 0.0D, 0.0D);
                            }
                        }
                    }
                }
            }

            if (var18 >= 0) {
                var8.lIIIIlIIllIIlIIlIIIlIIllI();
            }

            GL11.glEnable(2884);
            GL11.glDisable(3042);
            GL11.glAlphaFunc(516, 0.1F);
            this.lIIIIlIIllIIlIIlIIIlIIllI((double)var1);
        }

    }

    public void lIIIIllIIlIlIllIIIlIllIlI() {
        llIIllIIIllIIlIlIIIIIIIII var1 = new llIIllIIIllIIlIlIIIIIIIII(this.IllIlIIIIlllIIllIIlllIIlI, this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII);
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), 0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
    }

    private void IlllIllIlIIIIlIIlIIllIIIl(float var1) {
        lIIIlIllIIIlIIIIllIllIIIl var2 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI;
        IIIlIlllIlIllIIlIIIIIIllI var3 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        float var4 = 0.25F + 0.75F * (float)this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIIIlIlllIllIlIIlllIlI / 16.0F;
        var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
        lIllIIIIlllllIIlIllIIIIII var5 = var2.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl, var1);
        var5 = lIIIllIllIIIIIlIIIIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var5, var2, this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl, var1);
        float var6 = (float)var5.lIIIIlIIllIIlIIlIIIlIIllI;
        float var7 = (float)var5.lIIIIIIIIIlIllIIllIlIIlIl;
        float var8 = (float)var5.IlllIIIlIlllIllIlIIlllIlI;
        lIllIIIIlllllIIlIllIIIIII var9 = var2.IlIlIIIlllIIIlIlllIlIllIl(var1);
        var9 = lIIIllIllIIIIIlIIIIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(var9, var2, var1);
        this.lIIlIlIllIIlIIIlIIIlllIII = (float)var9.lIIIIlIIllIIlIIlIIIlIIllI;
        this.IIIlllIIIllIllIlIIIIIIlII = (float)var9.lIIIIIIIIIlIllIIllIlIIlIl;
        this.llIlIIIlIIIIlIlllIlIIIIll = (float)var9.IlllIIIlIlllIllIlIIlllIlI;
        float var10;
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IlllIIIlIlllIllIlIIlllIlI >= 4) {
            lIllIIIIlllllIIlIllIIIIII var11 = lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIIllIlIIIllIlllIlllllIl(var1)) > 0.0F ? lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(-1.0D, 0.0D, 0.0D) : lIllIIIIlllllIIlIllIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(1.0D, 0.0D, 0.0D);
            var10 = (float)var3.llIIlllIIIIlllIllIlIlllIl(var1).lIIIIIIIIIlIllIIllIlIIlIl(var11);
            if (var10 < 0.0F) {
                var10 = 0.0F;
            }

            if (var10 > 0.0F) {
                float[] var12 = var2.lIIIIIllllIIIIlIlIIIIlIlI.lIIIIlIIllIIlIIlIIIlIIllI(var2.IlllIIIlIlllIllIlIIlllIlI(var1), var1);
                if (var12 != null) {
                    var10 *= var12[3];
                    this.lIIlIlIllIIlIIIlIIIlllIII = this.lIIlIlIllIIlIIIlIIIlllIII * (1.0F - var10) + var12[0] * var10;
                    this.IIIlllIIIllIllIlIIIIIIlII = this.IIIlllIIIllIllIlIIIIIIlII * (1.0F - var10) + var12[1] * var10;
                    this.llIlIIIlIIIIlIlllIlIIIIll = this.llIlIIIlIIIIlIlllIlIIIIll * (1.0F - var10) + var12[2] * var10;
                }
            }
        }

        this.lIIlIlIllIIlIIIlIIIlllIII += (var6 - this.lIIlIlIllIIlIIIlIIIlllIII) * var4;
        this.IIIlllIIIllIllIlIIIIIIlII += (var7 - this.IIIlllIIIllIllIlIIIIIIlII) * var4;
        this.llIlIIIlIIIIlIlllIlIIIIll += (var8 - this.llIlIIIlIIIIlIlllIlIIIIll) * var4;
        float var23 = var2.IlllIllIlIIIIlIIlIIllIIIl(var1);
        float var24;
        if (var23 > 0.0F) {
            var10 = 1.0F - var23 * 0.54761904F * 0.9130435F;
            var24 = 1.0F - var23 * 1.6470588F * 0.24285714F;
            this.lIIlIlIllIIlIIIlIIIlllIII *= var10;
            this.IIIlllIIIllIllIlIIIIIIlII *= var10;
            this.llIlIIIlIIIIlIlllIlIIIIll *= var24;
        }

        var10 = var2.IllIIIIIIIlIlIllllIIllIII(var1);
        if (var10 > 0.0F) {
            var24 = 1.0F - var10 * 4.0454545F * 0.123595506F;
            this.lIIlIlIllIIlIIIlIIIlllIII *= var24;
            this.IIIlllIIIllIllIlIIIIIIlII *= var24;
            this.llIlIIIlIIIIlIlllIlIIIIll *= var24;
        }

        IIlllllllIlllIIllllIIlIll var13 = IlIIIllIlIlIIIlIIlIIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI, var3, var1);
        float var14;
        lIllIIIIlllllIIlIllIIIIII var15;
        if (this.lIIlIlIIlIlIlIIlIlIlllIIl) {
            var15 = var2.IIIIllIIllIIIIllIllIIIlIl(var1);
            this.lIIlIlIllIIlIIIlIIIlllIII = (float)var15.lIIIIlIIllIIlIIlIIIlIIllI;
            this.IIIlllIIIllIllIlIIIIIIlII = (float)var15.lIIIIIIIIIlIllIIllIlIIlIl;
            this.llIlIIIlIIIIlIlllIlIIIIll = (float)var15.IlllIIIlIlllIllIlIIlllIlI;
        } else if (var13.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.IllIIIIIIIlIlIllllIIllIII) {
            var14 = (float)lIIlllIlIllIIIIIlIlllIIII.lIIIIIIIIIlIllIIllIlIIlIl(var3) * 0.53968257F * 0.3705882F;
            this.lIIlIlIllIIlIIIlIIIlllIII = 0.02F + var14;
            this.IIIlllIIIllIllIlIIIIIIlII = 0.02F + var14;
            this.llIlIIIlIIIIlIlllIlIIIIll = 0.2F + var14;
            var15 = lIIIllIllIIIIIlIIIIIIIIII.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI, this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IIIlIIlIlIIIlllIIlIllllll, this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IllIlIIIIlllIIllIIlllIIlI + 1.0D, this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl.IllIlIlIllllIlIIllllIIlll);
            if (var15 != null) {
                this.lIIlIlIllIIlIIIlIIIlllIII = (float)var15.lIIIIlIIllIIlIIlIIIlIIllI;
                this.IIIlllIIIllIllIlIIIIIIlII = (float)var15.lIIIIIIIIIlIllIIllIlIIlIl;
                this.llIlIIIlIIIIlIlllIlIIIIll = (float)var15.IlllIIIlIlllIllIlIIlllIlI;
            }
        } else if (var13.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.lIIIIllIIlIlIllIIIlIllIlI) {
            this.lIIlIlIllIIlIIIlIIIlllIII = 0.6F;
            this.IIIlllIIIllIllIlIIIIIIlII = 0.1F;
            this.llIlIIIlIIIIlIlllIlIIIIll = 0.0F;
        }

        var14 = this.IlIllIllIllIllIllllIIIlII + (this.lllIllIllIlIllIlIIllllIIl - this.IlIllIllIllIllIllllIIIlII) * var1;
        this.lIIlIlIllIIlIIIlIIIlllIII *= var14;
        this.IIIlllIIIllIllIlIIIIIIlII *= var14;
        this.llIlIIIlIIIIlIlllIlIIIIll *= var14;
        double var16 = var2.lIIIIIllllIIIIlIlIIIIlIlI.IlIlllIIIIllIllllIllIIlIl();
        if (!lIIIllIIIllIlllllIIlIllII.IIlIlIIlIIIlIlllllIIlIIlI()) {
            var16 = 1.0D;
        }

        double var18 = (var3.IlIlllIllIlIllIlllIlllIll + (var3.IllIlIIIIlllIIllIIlllIIlI - var3.IlIlllIllIlIllIlllIlllIll) * (double)var1) * var16;
        if (var3.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.lllIIIIIlIllIlIIIllllllII)) {
            int var20 = var3.lIIIIIIIIIlIllIIllIlIIlIl(IIIlIlIIIIIIIlllllIlIllIl.lllIIIIIlIllIlIIIllllllII).lIIIIIIIIIlIllIIllIlIIlIl();
            if (var20 < 20) {
                var18 *= (double)(1.0F - (float)var20 / 20.0F);
            } else {
                var18 = 0.0D;
            }
        }

        if (var18 < 1.0D) {
            if (var18 < 0.0D) {
                var18 = 0.0D;
            }

            var18 *= var18;
            this.lIIlIlIllIIlIIIlIIIlllIII = (float)((double)this.lIIlIlIllIIlIIIlIIIlllIII * var18);
            this.IIIlllIIIllIllIlIIIIIIlII = (float)((double)this.IIIlllIIIllIllIlIIIIIIlII * var18);
            this.llIlIIIlIIIIlIlllIlIIIIll = (float)((double)this.llIlIIIlIIIIlIlllIlIIIIll * var18);
        }

        float var25;
        if (this.IIIlIllIlllIlIllIllllllll > 0.0F) {
            var25 = this.IllllllllIlIIIIIIIIllIIII + (this.IIIlIllIlllIlIllIllllllll - this.IllllllllIlIIIIIIIIllIIII) * var1;
            this.lIIlIlIllIIlIIIlIIIlllIII = this.lIIlIlIllIIlIIIlIIIlllIII * (1.0F - var25) + this.lIIlIlIllIIlIIIlIIIlllIII * 0.65F * 1.0769231F * var25;
            this.IIIlllIIIllIllIlIIIIIIlII = this.IIIlllIIIllIllIlIIIIIIlII * (1.0F - var25) + this.IIIlllIIIllIllIlIIIIIIlII * 1.1714287F * 0.5121951F * var25;
            this.llIlIIIlIIIIlIlllIlIIIIll = this.llIlIIIlIIIIlIlllIlIIIIll * (1.0F - var25) + this.llIlIIIlIIIIlIlllIlIIIIll * 1.4489796F * 0.41408452F * var25;
        }

        float var21;
        if (var3.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.lIIIIIllllIIIIlIlIIIIlIlI)) {
            var25 = this.lIIIIlIIllIIlIIlIIIlIIllI((lIllIIIIlIIlIllIIIlIlIlll)this.IllIlIIIIlllIIllIIlllIIlI.IlIlllIIIIllIllllIllIIlIl, var1);
            var21 = 1.0F / this.lIIlIlIllIIlIIIlIIIlllIII;
            if (var21 > 1.0F / this.IIIlllIIIllIllIlIIIIIIlII) {
                var21 = 1.0F / this.IIIlllIIIllIllIlIIIIIIlII;
            }

            if (var21 > 1.0F / this.llIlIIIlIIIIlIlllIlIIIIll) {
                var21 = 1.0F / this.llIlIIIlIIIIlIlllIlIIIIll;
            }

            this.lIIlIlIllIIlIIIlIIIlllIII = this.lIIlIlIllIIlIIIlIIIlllIII * (1.0F - var25) + this.lIIlIlIllIIlIIIlIIIlllIII * var21 * var25;
            this.IIIlllIIIllIllIlIIIIIIlII = this.IIIlllIIIllIllIlIIIIIIlII * (1.0F - var25) + this.IIIlllIIIllIllIlIIIIIIlII * var21 * var25;
            this.llIlIIIlIIIIlIlllIlIIIIll = this.llIlIIIlIIIIlIlllIlIIIIll * (1.0F - var25) + this.llIlIIIlIIIIlIlllIlIIIIll * var21 * var25;
        }

        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.IIIIllIIllIIIIllIllIIIlIl) {
            var25 = (this.lIIlIlIllIIlIIIlIIIlllIII * 30.0F + this.IIIlllIIIllIllIlIIIIIIlII * 59.0F + this.llIlIIIlIIIIlIlllIlIIIIll * 11.0F) / 100.0F;
            var21 = (this.lIIlIlIllIIlIIIlIIIlllIII * 30.0F + this.IIIlllIIIllIllIlIIIIIIlII * 70.0F) / 100.0F;
            float var22 = (this.lIIlIlIllIIlIIIlIIIlllIII * 30.0F + this.llIlIIIlIIIIlIlllIlIIIIll * 70.0F) / 100.0F;
            this.lIIlIlIllIIlIIIlIIIlllIII = var25;
            this.IIIlllIIIllIllIlIIIIIIlII = var21;
            this.llIlIIIlIIIIlIlllIlIIIIll = var22;
        }

        GL11.glClearColor(this.lIIlIlIllIIlIIIlIIIlllIII, this.IIIlllIIIllIllIlIIIIIIlII, this.llIlIIIlIIIIlIlllIlIIIIll, 0.0F);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(int var1, float var2) {
        IIIlIlllIlIllIIlIIIIIIllI var3 = this.IllIlIIIIlllIIllIIlllIIlI.llIIlllIIIIlllIllIlIlllIl;
        boolean var4 = false;
        this.lllIIIIIlIllIlIIIllllllII = false;
        if (var3 instanceof lIllIIIIlIIlIllIIIlIlIlll) {
            var4 = ((lIllIIIIlIIlIllIIIlIlIlll)var3).IlllIIIllIlIlIIIllIIIlIlI.IIIIllIlIIIllIlllIlllllIl;
        }

        if (var1 == 999) {
            GL11.glFog(2918, this.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, 0.0F, 1.0F));
            GL11.glFogi(2917, 9729);
            GL11.glFogf(2915, 0.0F);
            GL11.glFogf(2916, 8.0F);
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi(34138, 34139);
            }

            GL11.glFogf(2915, 0.0F);
        } else {
            GL11.glFog(2918, this.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIlIlIllIIlIIIlIIIlllIII, this.IIIlllIIIllIllIlIIIIIIlII, this.llIlIIIlIIIIlIlllIlIIIIll, 1.0F));
            GL11.glNormal3f(0.0F, -1.0F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            IIlllllllIlllIIllllIIlIll var5 = IlIIIllIlIlIIIlIIlIIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI, var3, var2);
            float var6;
            if (var3.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.lllIIIIIlIllIlIIIllllllII)) {
                var6 = 5.0F;
                int var7 = var3.lIIIIIIIIIlIllIIllIlIIlIl(IIIlIlIIIIIIIlllllIlIllIl.lllIIIIIlIllIlIIIllllllII).lIIIIIIIIIlIllIIllIlIIlIl();
                if (var7 < 20) {
                    var6 = 5.0F + (this.IllIlIlIllllIlIIllllIIlll - 5.0F) * (1.0F - (float)var7 / 20.0F);
                }

                GL11.glFogi(2917, 9729);
                if (var1 < 0) {
                    GL11.glFogf(2915, 0.0F);
                    GL11.glFogf(2916, var6 * 8.25F * 0.0969697F);
                } else {
                    GL11.glFogf(2915, var6 * 1.5F * 0.16666667F);
                    GL11.glFogf(2916, var6);
                }

                if (lIIIllIIIllIlllllIIlIllII.llIlIIIlIIIIlIlllIlIIIIll()) {
                    GL11.glFogi(34138, 34139);
                }
            } else if (this.lIIlIlIIlIlIlIIlIlIlllIIl) {
                GL11.glFogi(2917, 2048);
                GL11.glFogf(2914, 0.1F);
            } else if (var5.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.IllIIIIIIIlIlIllllIIllIII) {
                GL11.glFogi(2917, 2048);
                if (var3.lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlIIIIIIIlllllIlIllIl.llIlIIIlIIIIlIlllIlIIIIll)) {
                    GL11.glFogf(2914, 0.05F);
                } else {
                    GL11.glFogf(2914, 0.1F - (float)lIIlllIlIllIIIIIlIlllIIII.lIIIIIIIIIlIllIIllIlIIlIl(var3) * 0.089999996F * 0.33333334F);
                }

                if (lIIIllIIIllIlllllIIlIllII.IlIIlllIlIIIlIIIlIlIlIlIl()) {
                    GL11.glFogf(2914, 0.02F);
                }
            } else if (var5.IlIlIIIlllIIIlIlllIlIllIl() == llIIlIlIIllllIIIIIIIIIIlI.lIIIIllIIlIlIllIIIlIllIlI) {
                GL11.glFogi(2917, 2048);
                GL11.glFogf(2914, 2.0F);
            } else {
                var6 = this.IllIlIlIllllIlIIllllIIlll;
                this.lllIIIIIlIllIlIIIllllllII = true;
                if (lIIIllIIIllIlllllIIlIllII.IIlIlIIlIIIlIlllllIIlIIlI() && this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIllllIIIIlIlIIIIlIlI.IlllIllIlIIIIlIIlIIllIIIl() && !var4) {
                    double var10 = (double)((var3.lIIIIlIIllIIlIIlIIIlIIllI(var2) & 15728640) >> 20) / 16.0D + (var3.IlIlllIllIlIllIlllIlllIll + (var3.IllIlIIIIlllIIllIIlllIIlI - var3.IlIlllIllIlIllIlllIlllIll) * (double)var2 + 4.0D) / 32.0D;
                    if (var10 < 1.0D) {
                        if (var10 < 0.0D) {
                            var10 = 0.0D;
                        }

                        var10 *= var10;
                        float var9 = 100.0F * (float)var10;
                        if (var9 < 5.0F) {
                            var9 = 5.0F;
                        }

                        if (var6 > var9) {
                            var6 = var9;
                        }
                    }
                }

                GL11.glFogi(2917, 9729);
                if (var1 < 0) {
                    GL11.glFogf(2915, 0.0F);
                    GL11.glFogf(2916, var6);
                } else {
                    GL11.glFogf(2915, var6 * lIIIllIIIllIlllllIIlIllII.lIIIIIllllIIIIlIlIIIIlIlI());
                    GL11.glFogf(2916, var6);
                }

                if (GLContext.getCapabilities().GL_NV_fog_distance) {
                    if (lIIIllIIIllIlllllIIlIllII.llIlIIIlIIIIlIlllIlIIIIll()) {
                        GL11.glFogi(34138, 34139);
                    }

                    if (lIIIllIIIllIlllllIIlIllII.IIIlIIllllIIllllllIlIIIll()) {
                        GL11.glFogi(34138, 34140);
                    }
                }

                if (this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIllllIIIIlIlIIIIlIlI.lIIIIIIIIIlIllIIllIlIIlIl((int)var3.IIIlIIlIlIIIlllIIlIllllll, (int)var3.IllIlIlIllllIlIIllllIIlll)) {
                    var6 = this.IllIlIlIllllIlIIllllIIlll;
                    GL11.glFogf(2915, var6 * 2.45F * 0.020408163F);
                    GL11.glFogf(2916, var6);
                }
            }

            GL11.glEnable(2903);
            GL11.glColorMaterial(1028, 4608);
        }

    }

    private FloatBuffer lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, float var3, float var4) {
        this.llIIlllIIIIlllIllIlIlllIl.clear();
        this.llIIlllIIIIlllIllIlIlllIl.put(var1).put(var2).put(var3).put(var4);
        this.llIIlllIIIIlllIllIlIlllIl.flip();
        return this.llIIlllIIIIlllIllIlIlllIl;
    }

    public lIlIlIlIIlIIIIIlIllIlIlII IlllIllIlIIIIlIIlIIllIIIl() {
        return this.IllIIlIIlllllIllIIIlllIII;
    }

    private void IIIlllIIIllIllIlIIIIIIlII() {
        this.lIlIlIlIIlIlllIIIIIIllllI = 0;
        if (!lIIIllIIIllIlllllIIlIllII.IIIlllIllIlIIllIIllIlIlll()) {
            this.IIlIlIlllIllIIlIllIIlIIlI = 0L;
            this.lIlIIllIIIlllIIllIIlIIllI = 0;
        } else if (this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllllIIIlIlIlIllII() != null) {
            IIlllIIIlllllIIllIllIllll var1 = this.IllIlIIIIlllIIllIIlllIIlI.IlIlIIIlllllIIIlIlIlIllII();
            boolean var2 = this.IllIlIIIIlllIIllIIlllIIlI.IIlIlIIlIIIlIlllllIIlIIlI();
            if (!var2 && !(this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII instanceof lIIllllIlllIlllllIIlIIIIl)) {
                if (this.lIIIlIIIIIIlIIlIIlIIlIIlI > 0) {
                    lIIIllIIIllIlllllIIlIllII.lIIIIlIIllIIlIIlIIIlIIllI((long)this.lIIIlIIIIIIlIIlIIlIIlIIlI);
                    this.lIlIlIlIIlIlllIIIIIIllllI = this.lIIIlIIIIIIlIIlIIlIIlIIlI;
                }

                long var3 = System.nanoTime() / 1000000L;
                if (this.IIlIlIlllIllIIlIllIIlIIlI != 0L && this.lIlIIllIIIlllIIllIIlIIllI != 0) {
                    long var5 = var3 - this.IIlIlIlllIllIIlIllIIlIIlI;
                    if (var5 < 0L) {
                        this.IIlIlIlllIllIIlIllIIlIIlI = var3;
                        var5 = 0L;
                    }

                    if (var5 >= 50L) {
                        this.IIlIlIlllIllIIlIllIIlIIlI = var3;
                        int var7 = var1.IIIIIlIllIllIlIIllIIlIllI();
                        int var8 = var7 - this.lIlIIllIIIlllIIllIIlIIllI;
                        if (var8 < 0) {
                            this.lIlIIllIIIlllIIllIIlIIllI = var7;
                            var8 = 0;
                        }

                        if (var8 < 1 && this.lIIIlIIIIIIlIIlIIlIIlIIlI < 100) {
                            this.lIIIlIIIIIIlIIlIIlIIlIIlI += 2;
                        }

                        if (var8 > 1 && this.lIIIlIIIIIIlIIlIIlIIlIIlI > 0) {
                            --this.lIIIlIIIIIIlIIlIIlIIlIIlI;
                        }

                        this.lIlIIllIIIlllIIllIIlIIllI = var7;
                    }
                } else {
                    this.IIlIlIlllIllIIlIllIIlIIlI = var3;
                    this.lIlIIllIIIlllIIllIIlIIllI = var1.IIIIIlIllIllIlIIllIIlIllI();
                    this.IllIlIIIIlIlllIlllllllIIl = 1.0F;
                    this.llllIIllIIlllllIlIlIIllll = 50.0F;
                }
            } else {
                if (this.IllIlIIIIlllIIllIIlllIIlI.lllIIIIIlIllIlIIIllllllII instanceof lIIllllIlllIlllllIIlIIIIl) {
                    lIIIllIIIllIlllllIIlIllII.lIIIIlIIllIIlIIlIIIlIIllI(20L);
                }

                this.IIlIlIlllIllIIlIllIIlIIlI = 0L;
                this.lIlIIllIIIlllIIllIIlIIllI = 0;
            }
        }

    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(long var1, long var3) {
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIllIllIlIIllIllIlIlIIlIl.lIlIlIllIIIIIIIIllllIIllI || this.IllIlIlllIIlIIIIIlIIIIIll) {
            if (this.lIIlllIIlIlllllllllIIIIIl == -1L) {
                this.lIIlllIIlIlllllllllIIIIIl = System.nanoTime();
            }

            long var5 = System.nanoTime();
            int var7 = this.lIIlIIllIIIIIlIllIIIIllII & this.lIIIIIllllIIIIlIlIIIIlIlI.length - 1;
            this.IIIIIIlIlIlIllllllIlllIlI[var7] = var1;
            this.IllIllIIIlIIlllIIIllIllII[var7] = var3;
            this.IlIIlIIIIlIIIIllllIIlIllI[var7] = (long)this.lIlIlIlIIlIlllIIIIIIllllI;
            this.lIIIIIllllIIIIlIlIIIIlIlI[var7] = var5 - this.lIIlllIIlIlllllllllIIIIIl;
            ++this.lIIlIIllIIIIIlIllIIIIllII;
            this.lIIlllIIlIlllllllllIIIIIl = var5;
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glEnable(2903);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, (double)this.IllIlIIIIlllIIllIIlllIIlI.IIIllIllIlIlllllllIlIlIII, (double)this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII, 0.0D, 1000.0D, 3000.0D);
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
            GL11.glLineWidth(1.0F);
            GL11.glDisable(3553);
            lIllIIlIIIIlIIllllIllllll var8 = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
            var8.lIIIIlIIllIIlIIlIIIlIIllI(1);

            for(int var9 = 0; var9 < this.lIIIIIllllIIIIlIlIIIIlIlI.length; ++var9) {
                int var10 = (var9 - this.lIIlIIllIIIIIlIllIIIIllII & this.lIIIIIllllIIIIlIlIIIIlIlI.length - 1) * 255 / this.lIIIIIllllIIIIlIlIIIIlIlI.length;
                long var11 = this.lIIIIIllllIIIIlIlIIIIlIlI[var9] / 200000L;
                float var13 = (float)this.IllIlIIIIlllIIllIIlllIIlI.IllIIIIIIIlIlIllllIIllIII;
                var8.IlllIIIlIlllIllIlIIlllIlI(-16777216 + var10 * 256);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 - (float)var11 + 0.5F), 0.0D);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
                var13 -= (float)var11;
                long var14 = this.IIIIIIlIlIlIllllllIlllIlI[var9] / 200000L;
                var8.IlllIIIlIlllIllIlIIlllIlI(-16777216 + var10 * 65536 + var10 * 256 + var10 * 1);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + (float)var14 + 0.5F), 0.0D);
                var13 += (float)var14;
                long var16 = this.IllIllIIIlIIlllIIIllIllII[var9] / 200000L;
                var8.IlllIIIlIlllIllIlIIlllIlI(-16777216 + var10 * 65536);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
                var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + (float)var16 + 0.5F), 0.0D);
                var13 += (float)var16;
                long var18 = this.IlIIlIIIIlIIIIllllIIlIllI[var9];
                if (var18 > 0L) {
                    long var20 = var18 * 1000000L / 200000L;
                    var8.IlllIIIlIlllIllIlIIlllIlI(-16777216 + var10 * 1);
                    var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + 0.5F), 0.0D);
                    var8.lIIIIlIIllIIlIIlIIIlIIllI((double)((float)var9 + 0.5F), (double)(var13 + (float)var20 + 0.5F), 0.0D);
                }
            }

            var8.lIIIIlIIllIIlIIlIIIlIIllI();
            GL11.glMatrixMode(5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL11.glEnable(3553);
        }

    }

    private void llIlIIIlIIIIlIlllIlIIIIll() {
        if (this.IllIlIIIIlllIIllIIlllIIlI.lIIIIllIIlIlIllIIIlIllIlI != null) {
            long var1 = System.currentTimeMillis();
            if (var1 > this.llllIlIlIlllllIllIIllIIIl + 10000L) {
                this.llllIlIlIlllllIllIIllIIIl = var1;
                int var3 = GL11.glGetError();
                if (var3 != 0) {
                    String var4 = GLU.gluErrorString(var3);
                    lIlIIllIIlIIIIIlIllIllllI var5 = new lIlIIllIIlIIIIIlIllIllllI("§eOpenGL Error§f: " + var3 + " (" + var4 + ")");
                    this.IllIlIIIIlllIIllIIlllIIlI.IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var5);
                }
            }
        }

    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(llIIIIIIllllIIIIlllIlllIl var1) {
        try {
            String var2 = null;
            Calendar var3 = Calendar.getInstance();
            var3.setTime(new Date());
            int var4 = var3.get(5);
            int var5 = var3.get(2) + 1;
            if (var4 == 8 && var5 == 4) {
                var2 = "Happy birthday, OptiFine!";
            }

            if (var4 == 14 && var5 == 8) {
                var2 = "Happy birthday, sp614x!";
            }

            if (var2 == null) {
                return;
            }

            Field[] var6 = llIIIIIIllllIIIIlllIlllIl.class.getDeclaredFields();

            for(int var7 = 0; var7 < var6.length; ++var7) {
                if (var6[var7].getType() == String.class) {
                    var6[var7].setAccessible(true);
                    var6[var7].set(var1, var2);
                    break;
                }
            }
        } catch (Throwable var8) {
        }

    }

    static {
        IIIIllIIllIIIIllIllIIIlIl = IIlIlllIllIlIlIIIIIlllIll.length;
    }
}
