import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class lIIlllIIllIlllllIlIlllIIl implements IllIllllllIlllIIIlllIIlII {
    private static final Logger lIIIIlIIllIIlIIlIIIlIIllI = LogManager.getLogger();
    private static final ThreadPoolExecutor lIIIIIIIIIlIllIIllIlIIlIl = new ScheduledThreadPoolExecutor(5, (new ThreadFactoryBuilder()).setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private final IlllIlIllIllllllllllIlIlI IlllIIIlIlllIllIlIIlllIlI;
    private final lIIIllIllIllIlllIlIIlIlII IIIIllIlIIIllIlllIlllllIl;
    private final llIlllIlIIIllllIlllIIlIII IIIIllIIllIIIIllIllIIIlIl;
    private long IlIlIIIlllIIIlIlllIlIllIl;
    private String IIIllIllIlIlllllllIlIlIII;
    private lllIIIlllIIlllIlIlllIlIlI IllIIIIIIIlIlIllllIIllIII;
    private IIllIIlIllIIlllIlIllIIIlI lIIIIllIIlIlIllIIIlIllIlI;
    private IIllIIlIllIIlllIlIllIIIlI IlllIllIlIIIIlIIlIIllIIIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/star-64.png");
    private IIllIIlIllIIlllIlIllIIIlI IlIlllIIIIllIllllIllIIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/icons/cb.png");

    protected lIIlllIIllIlllllIlIlllIIl(IlllIlIllIllllllllllIlIlI var1, llIlllIlIIIllllIlllIIlIII var2) {
        this.IlllIIIlIlllIllIlIIlllIlI = var1;
        this.IIIIllIIllIIIIllIllIIIlIl = var2;
        this.IIIIllIlIIIllIlllIlllllIl = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
        this.lIIIIllIIlIlIllIIIlIllIlI = new IIllIIlIllIIlllIlIllIIIlI("servers/" + var2.lIIIIIIIIIlIllIIllIlIIlIl + "/icon");
        this.IllIIIIIIIlIlIllllIIllIII = (lllIIIlllIIlllIlIlllIlIlI)this.IIIIllIlIIIllIlllIlllllIl.llIlIlIllIlIIlIlllIllIIlI().lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIllIIlIlIllIIIlIllIlI);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3, int var4, int var5, lIllIIlIIIIlIIllllIllllll var6, int var7, int var8, boolean var9) {
        if (!this.IIIIllIIllIIIIllIllIIIlIl.IlllIllIlIIIIlIIlIIllIIIl) {
            this.IIIIllIIllIIIIllIllIIIlIl.IlllIllIlIIIIlIIlIIllIIIl = true;
            this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII = -2L;
            this.IIIIllIIllIIIIllIllIIIlIl.IlIlIIIlllIIIlIlllIlIllIl = "";
            this.IIIIllIIllIIIIllIllIIIlIl.IlllIIIlIlllIllIlIIlllIlI = "";
            lIIIIIIIIIlIllIIllIlIIlIl.submit(new lllIIlIlIlIlllIlIlIIIlllI(this));
        }

        GL11.glColor4f(1.0F, 0.40909088F * 2.2F, 0.0F, 1.0F);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IlllIllIlIIIIlIIlIIllIIIl, (float)5, (float)(var2 - 17), (float)(var3 + (this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI() ? 4 : this.IIIIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl.toLowerCase().contains("goldenpvp.net") ? 4 : 12)));
        GL11.glColor4f(11.5F * 0.073913045F, 0.2857143F * 2.975F, 3.0F * 0.28333333F, 1.0F);
        // System.out.println("i=" + this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI);
        if (this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI() || this.IIIIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl.toLowerCase().contains("goldenpvp.net")) {
            float var10 = (float)16;
            float var11 = (float)8;
            float var12 = 0.0F;
            float var13 = 0.0F;
            float var14 = (float)(var2 - 20);
            float var15 = (float)(var3 + 20);
            GL11.glEnable(3042);
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlllIIIIllIllllIllIIlIl);
            GL11.glBegin(7);
            GL11.glTexCoord2d((double)(var12 / (float)5), (double)(var13 / (float)5));
            GL11.glVertex2d((double)var14, (double)var15);
            GL11.glTexCoord2d((double)(var12 / (float)5), (double)((var13 + (float)5) / (float)5));
            GL11.glVertex2d((double)var14, (double)(var15 + var11));
            GL11.glTexCoord2d((double)((var12 + (float)5) / (float)5), (double)((var13 + (float)5) / (float)5));
            GL11.glVertex2d((double)(var14 + var10), (double)(var15 + var11));
            GL11.glTexCoord2d((double)((var12 + (float)5) / (float)5), (double)(var13 / (float)5));
            GL11.glVertex2d((double)(var14 + var10), (double)var15);
            GL11.glEnd();
            GL11.glDisable(3042);
        }

        boolean var22 = this.IIIIllIIllIIIIllIllIIIlIl.IllIIIIIIIlIlIllllIIllIII > 5;
        boolean var23 = this.IIIIllIIllIIIIllIllIIIlIl.IllIIIIIIIlIlIllllIIllIII < 5;
        boolean var24 = (var22 || var23) && this.IIIIllIIllIIIIllIllIIIlIl.IllIIIIIIIlIlIllllIIllIII != -1332;
        this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI, var2 + 32 + 3, var3 + 1, 16777215);
        List var25 = this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.IlllIIIlIlllIllIlIIlllIlI(this.IIIIllIIllIIIIllIllIIIlIl.IlIlIIIlllIIIlIlllIlIllIl, var4 - 32 - 2);

        for(int var26 = 0; var26 < Math.min(var25.size(), 2); ++var26) {
            this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl((String)var25.get(var26), var2 + 32 + 3, var3 + 12 + this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI * var26, 8421504);
        }

        String var27 = var24 ? IlIllllIIlIIllIlIlllllIlI.IIIIllIIllIIIIllIllIIIlIl + this.IIIIllIIllIIIIllIllIIIlIl.lIIIIllIIlIlIllIIIlIllIlI : this.IIIIllIIllIIIIllIllIIIlIl.IlllIIIlIlllIllIlIIlllIlI;
        int var28 = this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var27);
        this.IIIIllIlIIIllIlllIlllllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var27, var2 + var4 - var28 - 15 - 2, var3 + 1, 8421504);
        byte var16 = 0;
        String var17 = null;
        int var18;
        String var19;
        if (var24) {
            var18 = 5;
            var19 = var22 ? "Client out of date!" : "Server out of date!";
            var17 = this.IIIIllIIllIIIIllIllIIIlIl.IlIlllIIIIllIllllIllIIlIl;
        } else if (this.IIIIllIIllIIIIllIllIIIlIl.IlllIllIlIIIIlIIlIIllIIIl && this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII != -2L) {
            if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 0L) {
                var18 = 5;
            } else if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 150L) {
                var18 = 0;
            } else if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 300L) {
                var18 = 1;
            } else if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 600L) {
                var18 = 2;
            } else if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 1000L) {
                var18 = 3;
            } else {
                var18 = 4;
            }

            if (this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII < 0L) {
                var19 = "(no connection)";
            } else {
                var19 = this.IIIIllIIllIIIIllIllIIIlIl.IIIllIllIlIlllllllIlIlIII + "ms";
                var17 = this.IIIIllIIllIIIIllIllIIIlIl.IlIlllIIIIllIllllIllIIlIl;
            }
        } else {
            var16 = 1;
            var18 = (int)(lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII() / 100L + (long)(var1 * 2) & 7L);
            if (var18 > 4) {
                var18 = 8 - var18;
            }

            var19 = "Pinging...";
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.IIIIllIlIIIllIlllIlllllIl.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(IlIIIlIIlIIllIllllIlIlIll.IIIlllIIIllIllIlIIIIIIlII);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var2 + var4 - 15, var3, (float)(var16 * 10), (float)(176 + var18 * 8), 10, 8, (float)256, (float)256);
        if (this.IIIIllIIllIIIIllIllIIIlIl.IIIIllIlIIIllIlllIlllllIl() != null && !this.IIIIllIIllIIIIllIllIIIlIl.IIIIllIlIIIllIlllIlllllIl().equals(this.IIIllIllIlIlllllllIlIlIII)) {
            this.IIIllIllIlIlllllllIlIlIII = this.IIIIllIIllIIIIllIllIIIlIl.IIIIllIlIIIllIlllIlllllIl();
            this.lIIIIIIIIIlIllIIllIlIIlIl();
            this.IlllIIIlIlllIllIlIIlllIlI.lIIIIllIIlIlIllIIIlIllIlI().lIIIIIIIIIlIllIIllIlIIlIl();
        }

        if (this.IllIIIIIIIlIlIllllIIllIII != null) {
            this.IIIIllIlIIIllIlllIlllllIl.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIllIIlIlIllIIIlIllIlI);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, var3, 0.0F, 0.0F, 32, 32, (float)32, (float)32);
        }

        int var20 = var7 - var2;
        int var21 = var8 - var3;
        if (var20 >= var4 - 15 && var20 <= var4 - 5 && var21 >= 0 && var21 <= 8) {
            this.IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var19);
        } else if (var20 >= var4 - var28 - 15 - 2 && var20 <= var4 - 15 - 2 && var21 >= 0 && var21 <= 8) {
            this.IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var17);
        }

    }

    private void lIIIIIIIIIlIllIIllIlIIlIl() {
        if (this.IIIIllIIllIIIIllIllIIIlIl.IIIIllIlIIIllIlllIlllllIl() == null) {
            this.IIIIllIlIIIllIlllIlllllIl.llIlIlIllIlIIlIlllIllIIlI().IlllIIIlIlllIllIlIIlllIlI(this.lIIIIllIIlIlIllIIIlIllIlI);
            this.IllIIIIIIIlIlIllllIIllIII = null;
        } else {
            ByteBuf var1 = Unpooled.copiedBuffer((CharSequence)this.IIIIllIIllIIIIllIllIIIlIl.IIIIllIlIIIllIlllIlllllIl(), Charsets.UTF_8);
            ByteBuf var2 = Base64.decode(var1);

            BufferedImage var3;
            label80: {
                try {
                    var3 = ImageIO.read(new ByteBufInputStream(var2));
                    Validate.validState(var3.getWidth() == 64, "Must be 64 pixels wide");
                    Validate.validState(var3.getHeight() == 64, "Must be 64 pixels high");
                    break label80;
                } catch (Exception var8) {
                    lIIIIlIIllIIlIIlIIIlIIllI.error((String)("Invalid icon for server " + this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI + " (" + this.IIIIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl + ")"), (Throwable)var8);
                    this.IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI((String)null);
                } finally {
                    var1.release();
                    var2.release();
                }

                return;
            }

            if (this.IllIIIIIIIlIlIllllIIllIII == null) {
                this.IllIIIIIIIlIlIllllIIllIII = new lllIIIlllIIlllIlIlllIlIlI(var3.getWidth(), var3.getHeight());
                this.IIIIllIlIIIllIlllIlllllIl.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI((IIllIIlIllIIlllIlIllIIIlI)this.lIIIIllIIlIlIllIIIlIllIlI, (llllIIlIllllllIlllIlIIIll)this.IllIIIIIIIlIlIllllIIllIII);
            }

            var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), this.IllIIIIIIIlIlIllllIIllIII.IIIIllIlIIIllIlllIlllllIl(), 0, var3.getWidth());
            this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl();
        }

    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1);
        if (lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII() - this.IlIlIIIlllIIIlIlllIlIllIl < 250L) {
            this.IlllIIIlIlllIllIlIIlllIlI.IIIllIllIlIlllllllIlIlIII();
        }

        this.IlIlIIIlllIIIlIlllIlIllIl = lIIIllIllIllIlllIlIIlIlII.lIIIIlllIIlIlllllIlIllIII();
        return false;
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(int var1, int var2, int var3, int var4, int var5, int var6) {
    }

    public llIlllIlIIIllllIlllIIlIII lIIIIlIIllIIlIIlIIIlIIllI() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    // $FF: synthetic method
    static llIlllIlIIIllllIlllIIlIII lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIllIlllllIlIlllIIl var0) {
        return var0.IIIIllIIllIIIIllIllIIIlIl;
    }

    // $FF: synthetic method
    static IlllIlIllIllllllllllIlIlI lIIIIIIIIIlIllIIllIlIIlIl(lIIlllIIllIlllllIlIlllIIl var0) {
        return var0.IlllIIIlIlllIllIlIIlllIlI;
    }
}
