import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import io.netty.buffer.Unpooled;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Map.Entry;
import org.lwjgl.input.Keyboard;

public class IIlIIllIlllIllllIlIllllII implements llllIIlIIllIIIlllIlIIIllI {
    final lIIIIlIIllIIlIIlIIIlIIllI lIIIIlIIllIIlIIlIIIlIIllI;
    private boolean lIIIIIIIIIlIllIIllIlIIlIl;
    private boolean IlllIIIlIlllIllIlIIlllIlI;
    private boolean IIIIllIlIIIllIlllIlllllIl;
    private boolean IIIIllIIllIIIIllIllIIIlIl;
    private List<llIIIlllllIIllIlllIlIlIll> IlIlIIIlllIIIlIlllIlIllIl;
    private llIIIlllllIIllIlllIlIlIll IIIllIllIlIlllllllIlIlIII;
    private boolean IllIIIIIIIlIlIllllIIllIII;
    private List<UUID> lIIIIllIIlIlIllIIIlIllIlI;
    private List<UUID> IlllIllIlIIIIlIIlIIllIIIl;
    private String IlIlllIIIIllIllllIllIIlIl;
    private Map<UUID, List<String>> llIIlllIIIIlllIllIlIlllIl;

    public IIlIIllIlllIllllIlIllllII() {
        this.lIIIIlIIllIIlIIlIIIlIIllI = lIIIllllIIllIIIIIlIIlIIlI.cb;
        this.lIIIIIIIIIlIllIIllIlIIlIl = false;
        this.IlllIIIlIlllIllIlIIlllIlI = false;
        this.IIIIllIIllIIIIllIllIIIlIl = false;
        this.lIIIIllIIlIlIllIIIlIllIlI = new ArrayList();
        this.IlllIllIlIIIIlIIlIIllIIIl = new ArrayList();
        this.IlIlllIIIIllIllllIllIIlIl = "";
        this.llIIlllIIIIlllIllIlIlllIl = new HashMap();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlIIllIIIIIlIllIIIIllII var1) {
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIIIIlIllIlIIIllllllII customPayload) {
        try {
            if (customPayload.lIIIIIIIIIlIllIIllIlIIlIl().equals("REGISTER")) {
                String payload = new String(customPayload.lIIIIlIIllIIlIIlIIIlIIllI(), Charsets.UTF_8);
                this.lIIIIIIIIIlIllIIllIlIIlIl = payload.contains(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI());
                this.IlllIIIlIlllIllIlIIlllIlI = payload.contains(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIIIIIIlIllIIllIlIIlIl());
                lIlIllllllllIlIIIllIIllII wrapper = new lIlIllllllllIlIIIllIIllII(Unpooled.buffer());
                wrapper.writeBytes(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI().getBytes(Charsets.UTF_8));
                if (lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIllIlIIllIllIlIlIIlIl() != null && this.lIIIIIIIIIlIllIIllIlIIlIl) {
                    lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new lIIlIlllIlIllIlIlIllllIlI("REGISTER", wrapper));
                }

                this.IlIlllIIIIllIllllIllIIlIl();
            } else if (customPayload.lIIIIIIIIIlIllIIllIlIIlIl().equals(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI())) {
                llIlIIIlIIlIlllIIlIIIIIll packet = llIlIIIlIIlIlllIIlIIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(this, customPayload.lIIIIlIIllIIlIIlIIIlIIllI());
                if (packet != null) {
                    packet.lIIIIlIIllIIlIIlIIIlIIllI(this);
                }

                if (this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().IIIllIllIlIlllllllIlIlIII) {
                    lIlIIllIIlIIIIIlIllIllllI debugPrefix = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "[C" + IlIllllIIlIIllIlIlllllIlI.IIIlIIllllIIllllllIlIIIll + "B" + IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "] " + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII);
                    lIlIIllIIlIIIIIlIllIllllI debugMessage = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.IllIIIIIIIlIlIllllIIllIII + "Received: " + IlIllllIIlIIllIlIlllllIlI.IIIlIIllllIIllllllIlIIIll + packet.getClass().getSimpleName());
                    debugMessage.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIIIlIIlIIlIlIlIIIIIIlII(llIlIllIllllllIlllllllIII.lIIIIlIIllIIlIIlIIIlIIllI, new lIlIIllIIlIIIIIlIllIllllI((new Gson()).toJson(packet))));
                    debugPrefix.lIIIIlIIllIIlIIlIIIlIIllI(debugMessage);
                    lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(debugPrefix);
                }
            }
        } catch (Exception | AssertionError var5) {
            var5.printStackTrace();
        }

    }

    private void IlIlllIIIIllIllllIllIIlIl() {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI().IIIllIllIlIlllllllIlIlIII().lIIIIlIIllIIlIIlIIIlIIllI().removeIf((var0) -> {
            return ((lIIllIllIlIllIIIlIlllllIl)var0).IIIIllIlIIIllIlllIlllllIl;
        });
        this.IIIIllIIllIIIIllIllIIIlIl = false;
        this.IIIIllIlIIIllIlllIlllllIl = false;
        this.IlIlIIIlllIIIlIlllIlIllIl = null;
        this.IIIllIllIlIlllllllIlIlIII = null;
        this.IllIIIIIIIlIlIllllIIllIII = false;
        this.IlIlllIIIIllIllllIllIIlIl = "";
        this.IlllIllIlIIIIlIIlIIllIIIl.clear();
        this.llIIlllIIIIlllIllIlIlllIl = new HashMap();
        Iterator var1 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl.iterator();

        while(var1.hasNext()) {
            IlIIIIlllIIIlIIllllIIIlll var2 = (IlIIIIlllIIIlIIllllIIIlll)var1.next();
            ((lIllIlIlIIlIllIllllIllIIl)var2).lIIlllIIlIlllllllllIIIIIl();
        }

        this.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIIIlIIllIIlIIlIIIlIIllI();
        IIIIIlllIllIIIIllIllIIIII.lIIIIlIIllIIlIIlIIIlIIllI = llIllllIIIIIlIllIlIIIllIl.IlllIIIlIlllIllIlIIlllIlI;
        lIIlIlIllllllIllllIIllllI.lIIIIIIIIIlIllIIllIlIIlIl = llIllllIIIIIlIllIlIIIllIl.lIIIIlIIllIIlIIlIIIlIIllI;
        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI().clear();
        IIIlIllIIllllIIIllllIllll.IIIllIllIlIlllllllIlIlIII().clear();
        lIlIIIIIIlIllIlIllIlIlIlI var3 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        if (lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIlllIIIIllIllllIllIIlIl != null && var3.IIIllIllIlIlllllllIlIlIII() != null) {
            var3.IIIllIllIlIlllllllIlIlIII().lIIIIlIIllIIlIIlIIIlIIllI().removeIf((var0) -> {
                return ((lIIllIllIlIllIIIlIlllllIl)var0).IlIlIIIlllIIIlIlllIlIllIl;
            });
            ((lIlIIIllIlIIIlIlIlIIllIlI)var3.IIIllIllIlIlllllllIlIlIII()).IlIlllIIIIllIllllIllIIlIl().removeIf((var0) -> {
                return ((lIIllIllIlIllIIIlIlllllIl)var0).IlIlIIIlllIIIlIlllIlIllIl;
            });
            if (((lIlIIIllIlIIIlIlIlIIllIlI)var3.IIIllIllIlIlllllllIlIlIII()).llIIlllIIIIlllIllIlIlllIl() != null) {
                ((lIlIIIllIlIIIlIlIlIIllIlI)var3.IIIllIllIlIlllllllIlIlIII()).llIIlllIIIIlllIllIlIlllIl().lIIIIlIIllIIlIIlIIIlIIllI.removeIf((var0) -> {
                    return ((lIIllIllIlIllIIIlIlllllIl)var0).IlIlIIIlllIIIlIlllIlIllIl;
                });
                IllllIIlIllIIIlIlllIlIIIl.llIlIlIlllIlllllIIIllIIll.lIIIIIIIIIlIllIIllIlIIlIl();
                var3.IIIllIllIlIlllllllIlIlIII().IIIllIllIlIlllllllIlIlIII();
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll().lIIIIlIIllIIlIIlIIIlIIllI().clear();
        IIIlllIllIIllIllIlIIIllII.lIIIIlIIllIIlIIlIIIlIIllI((Map)null);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIlIIIlIIlIlllIIlIIIIIll var1) {
        if (var1 != null && this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().IIIllIllIlIlllllllIlIlIII) {
            lIlIIllIIlIIIIIlIllIllllI var2 = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "[C" + IlIllllIIlIIllIlIlllllIlI.IIIlIIllllIIllllllIlIIIll + "B" + IlIllllIIlIIllIlIlllllIlI.lIIlIlIllIIlIIIlIIIlllIII + "] " + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII);
            lIlIIllIIlIIIIIlIllIllllI var3 = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.IllIIIIIIIlIlIllllIIllIII + "Sent: " + IlIllllIIlIIllIlIlllllIlI.IIIlIIllllIIllllllIlIIIll + var1.getClass().getSimpleName());
            var3.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new IIIIIlIIlIIlIlIlIIIIIIlII(llIlIllIllllllIlllllllIII.lIIIIlIIllIIlIIlIIIlIIllI, new lIlIIllIIlIIIIIlIllIllllI((new Gson()).toJson(var1))));
            var2.lIIIIlIIllIIlIIlIIIlIIllI(var3);
            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var2);
        }

        lIIlIlllIlIllIlIlIllllIlI var4 = new lIIlIlllIlIllIlIlIllllIlI(this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(), llIlIIIlIIlIlllIIlIIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var1));
        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIlllIIIIllIllllIllIIlIl.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var4);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIIllllIIIIlIlIIIIlIlI var1) {
        this.lIIIIIIIIIlIllIIllIlIIlIl = false;
        this.IlllIIIlIlllIllIlIIlllIlI = false;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIllllIIIlllIIIllIIIIllll var1) {
        int var2 = var1.IIIIllIIllIIIIllIllIIIlIl();
        int var3 = var1.IlIlIIIlllIIIlIlllIlIllIl();
        int var4 = var1.IIIllIllIlIlllllllIlIlIII();
        lIlIIIIIIlIllIlIllIlIlIlI var5 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        if (!var5.IIIllIllIlIlllllllIlIlIII().lIIIIlIIllIIlIIlIIIlIIllI().stream().anyMatch((var1x) -> {
            return ((lIIllIllIlIllIIIlIlllllIl)var1x).lIIIIlIIllIIlIIlIIIlIIllI.equals(var1.lIIIIIIIIIlIllIIllIlIIlIl()) && ((lIIllIllIlIllIIIlIlllllIl)var1x).IIIIllIIllIIIIllIllIIIlIl.equals(var1.IlllIIIlIlllIllIlIIlllIlI());
        })) {
            Color var6 = new Color(var1.IIIIllIlIIIllIlllIlllllIl());
            float var7 = (float)var6.getRed() / 255.0F;
            float var8 = (float)var6.getGreen() / 255.0F;
            float var9 = (float)var6.getBlue() / 255.0F;
            TreeSet var10 = new TreeSet();
            var10.add(-1);
            var10.add(0);
            var10.add(1);
            System.out.println("Received waypoint (" + var1.lIIIIIIIIIlIllIIllIlIIlIl() + ")[x" + var2 + ",y" + var3 + ",z" + var4 + "][r" + var7 + ",g" + var8 + ",b" + var9 + "]");
            lIIllIllIlIllIIIlIlllllIl var11 = new lIIllIllIlIllIIIlIlllllIl(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var2, var4, var3, true, var7, var8, var9, "", var5.IIIllIllIlIlllllllIlIlIII().IlllIIIlIlllIllIlIIlllIlI(), var10, true, true);
            var11.lIIlIlIllIIlIIIlIIIlllIII = var1.IllIIIIIIIlIlIllllIIllIII();
            var11.IIIIllIIllIIIIllIllIIIlIl = var1.IlllIIIlIlllIllIlIIlllIlI();
            var11.IlIlIIIlllIIIlIlllIlIllIl = true;
            var5.IIIllIllIlIlllllllIlIlIII().lIIIIIIIIIlIllIIllIlIIlIl(var11);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIlIIlIlIIlIIIllllllIII var1) {
        try {
            String var2 = var1.lIIIIIIIIIlIllIIllIlIIlIl();
            lIlIIIIIIlIllIlIllIlIlIlI var3 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().IIIIllIlIIIllIlllIlllllIl.lIIIIlIIllIIlIIlIIIlIIllI();
            var3.IIIllIllIlIlllllllIlIlIII().lIIIIlIIllIIlIIlIIIlIIllI().removeIf((var2x) -> {
                return ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIIllIIIIllIllIIIlIl.equals(var1.IlllIIIlIlllIllIlIIlllIlI()) && ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIlIIIllIlllIlllllIl && ((lIIllIllIlIllIIIlIlllllIl)var2x).lIIIIlIIllIIlIIlIIIlIIllI.equalsIgnoreCase(var2);
            });
            ((lIlIIIllIlIIIlIlIlIIllIlI)var3.IIIllIllIlIlllllllIlIlIII()).IlIlllIIIIllIllllIllIIlIl().removeIf((var2x) -> {
                return ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIIllIIIIllIllIIIlIl.equals(var1.IlllIIIlIlllIllIlIIlllIlI()) && ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIlIIIllIlllIlllllIl && ((lIIllIllIlIllIIIlIlllllIl)var2x).lIIIIlIIllIIlIIlIIIlIIllI.equalsIgnoreCase(var2);
            });
            ((lIlIIIllIlIIIlIlIlIIllIlI)var3.IIIllIllIlIlllllllIlIlIII()).llIIlllIIIIlllIllIlIlllIl().lIIIIlIIllIIlIIlIIIlIIllI.removeIf((var2x) -> {
                return ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIIllIIIIllIllIIIlIl.equals(var1.IlllIIIlIlllIllIlIIlllIlI()) && ((lIIllIllIlIllIIIlIlllllIl)var2x).IIIIllIlIIIllIlllIlllllIl && ((lIIllIllIlIllIIIlIlllllIl)var2x).lIIIIlIIllIIlIIlIIIlIIllI.equalsIgnoreCase(var2);
            });
            IllllIIlIllIIIlIlllIlIIIl.llIlIlIlllIlllllIIIllIIll.lIIIIIIIIIlIllIIllIlIIlIl();
            var3.IIIllIllIlIlllllllIlIlIII().IIIllIllIlIlllllllIlIlIII();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllllIIIIllIIllIIlIIIIlll var1) {
        lIIIlIlIIIlIlIlllIlIlllII.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIIllIllIIllllIIIlIlllI var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIIlIIIIlllIlllIlllllIlI var1) {
        Iterator var2 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl.iterator();

        while(var2.hasNext()) {
            IlIIIIlllIIIlIIllllIIIlll var3 = (IlIIIIlllIIIlIIllllIIIlll)var2.next();
            if (var3.IIIllIllIlIlllllllIlIlIII().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl().replaceAll("_", "").toLowerCase())) {
                var3.IIIIllIlIIIllIlllIlllllIl(var1.IlllIIIlIlllIllIlIIlllIlI());
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIlIllllllIlIllllllIlIlll var1) {
        if (var1.lIIIIIIIIIlIllIIllIlIIlIl() != null) {
            IIIlllIllIIllIllIlIIIllII.lIIIIlIIllIIlIIlIIIlIIllI(new HashMap());
            Iterator var2 = var1.lIIIIIIIIIlIllIIllIlIIlIl().entrySet().iterator();

            while(var2.hasNext()) {
                Entry var3 = (Entry)var2.next();
                IIIlllIllIIllIllIlIIIllII.lIllIllIlIIllIllIlIlIIlIl().put(((UUID)var3.getKey()).toString(), var3.getValue());
            }
        } else {
            IIIlllIllIIllIllIlIIIllII.lIIIIlIIllIIlIIlIIIlIIllI((Map)null);
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIlIlIIIlIIlIIIlllllIIlI var1) {
        Map var2 = var1.IIIIllIlIIIllIlllIlllllIl();
        UUID var3 = var1.lIIIIIIIIIlIllIIllIlIIlIl();
        long var4 = var1.IlllIIIlIlllIllIlIIlllIlI();
        if ((Boolean)this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().llIlIIIllIIIIlllIlIIIIIlI.IIIIllIlIIIllIlllIlllllIl() && var2 != null && !var2.isEmpty() && (var2.size() != 1 || !var2.containsKey(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIlllIIIIllIllllIllIIlIl.llllIIllIIlllllIlIlIIllll()))) {
            int var6 = 0;

            for(Iterator var7 = var2.entrySet().iterator(); var7.hasNext(); ++var6) {
                Entry var8 = (Entry)var7.next();
                IlIlllIlIlIIllllIlllIlIII var9 = this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI(((UUID)var8.getKey()).toString());
                if (var9 == null) {
                    this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI().add(var9 = new IlIlllIlIlIIllllIlllIlIII(((UUID)var8.getKey()).toString(), var3 != null && var3.equals(var8.getKey())));
                    Random var10 = new Random();
                    if (var6 < this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIIIIIIlIllIIllIlIIlIl().length) {
                        var9.lIIIIlIIllIIlIIlIIIlIIllI(new Color(this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIIIIIIlIllIIllIlIIlIl()[var6]));
                    } else {
                        float var11 = var10.nextFloat();
                        float var12 = var10.nextFloat();
                        float var13 = var10.nextFloat() / 2.0F;
                        var9.lIIIIlIIllIIlIIlIIIlIIllI(new Color(var11, var12, var13));
                    }
                }

                try {
                    double var17 = (Double)((Map)var8.getValue()).get("x");
                    double var18 = (Double)((Map)var8.getValue()).get("y") + 2.0D;
                    double var14 = (Double)((Map)var8.getValue()).get("z");
                    var9.lIIIIlIIllIIlIIlIIIlIIllI(var17, var18, var14, var4);
                } catch (Exception var16) {
                    var16.printStackTrace();
                }
            }

            this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI().removeIf((var1x) -> {
                return !var2.containsKey(UUID.fromString(((IlIlllIlIlIIllllIlllIlIII)var1x).IlllIIIlIlllIllIlIIlllIlI()));
            });
        } else {
            this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlIIllIIIIIlIllIIIIllII.lIIIIlIIllIIlIIlIIIlIIllI().clear();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIlIlllllIIllIIlIIIlIIIl var1) {
        if (var1.IlllIIIlIlllIllIlIIlllIlI() == null) {
            this.llIIlllIIIIlllIllIlIlllIl.remove(var1.lIIIIIIIIIlIllIIllIlIIlIl());
        } else {
            Collections.reverse(var1.IlllIIIlIlllIllIlIIlllIlI());
            this.llIIlllIIIIlllIllIlIlllIl.put(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI());
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllllllIIlllIlIllIIIlIIlI var1) {
        IIIlIllIIllllIIIllllIllll var2;
        IIIlIllIIllllIIIllllIllll.IIIllIllIlIlllllllIlIlIII().add(var2 = new IIIlIllIIllllIIIllllIllll(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl()));
        var2.lIIIIlIIllIIlIIlIIIlIIllI((String[]) var1.IlIlIIIlllIIIlIlllIlIllIl().toArray(new String[0]));
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIlIIllIIllIlIIlIIlIIIl var1) {
        IIIlIllIIllllIIIllllIllll.IIIllIllIlIlllllllIlIlIII().stream().filter((var1x) -> {
            return ((IIIlIllIIllllIIIllllIllll)var1x).lIIIIIIIIIlIllIIllIlIIlIl().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl());
        }).forEach((var1x) -> {
            ((IIIlIllIIllllIIIllllIllll)var1x).lIIIIlIIllIIlIIlIIIlIIllI((String[])((String[])var1.IlllIIIlIlllIllIlIIlllIlI().toArray(new String[0])));
        });
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIllIlIllIllIIlIIlIlll var1) {
        IIIlIllIIllllIIIllllIllll.IIIllIllIlIlllllllIlIlIII().removeIf((var1x) -> {
            return ((IIIlIllIIllllIIIllllIllll)var1x).lIIIIIIIIIlIllIIllIlIIlIl().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl());
        });
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIlIlIlIIIIllllIllIIIIll var1) {
        IIIlIIIIllIIIlIIIIIlllllI var2 = IIIlIIIIllIIIlIIIIIlllllI.lIIIIIIIIIlIllIIllIlIIlIl;
        if (var1.lIIIIIIIIIlIllIIllIlIIlIl().toLowerCase().equals("subtitle")) {
            var2 = IIIlIIIIllIIIlIIIIIlllllI.lIIIIlIIllIIlIIlIIIlIIllI;
        }

        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIlIIlIlIIIlllIIlIllllll().lIIIIlIIllIIlIIlIIIlIIllI().add(new llllIlIIIIIllIIlIlllIllll(var1.IlllIIIlIlllIllIlIIlllIlI(), var2, var1.IIIllIllIlIlllllllIlIlIII(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl()));
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllllIllllIllIIlIIIIlllIl var1) {
        switch(var1.lIIIIIIIIIlIllIIllIlIIlIl().ordinal()) {
            case 0:
                this.lIIIIlIIllIIlIIlIIIlIIllI("Voice is: " + (var1.IIIIllIIllIIIIllIllIIIlIl() ? "enabled" : "disabled"));
                this.IIIIllIIllIIIIllIllIIIlIl = var1.IIIIllIIllIIIIllIllIIIlIl();
                break;
            case 1:
                String value = var1.IlIlIIIlllIIIlIlllIlIllIl();
                byte var4 = -1;
                switch(value.hashCode()) {
                    case -1732662873:
                        if (value.equals("NEUTRAL")) {
                            var4 = 0;
                        }
                        break;
                    case 624825065:
                        if (value.equals("FORCED_OFF")) {
                            var4 = 1;
                        }
                }

                switch(var4) {
                    case 0:
                        IIIIIlllIllIIIIllIllIIIII.lIIIIlIIllIIlIIlIIIlIIllI = llIllllIIIIIlIllIlIIIllIl.lIIIIlIIllIIlIIlIIIlIIllI;
                        return;
                    case 1:
                        IIIIIlllIllIIIIllIllIIIII.lIIIIlIIllIIlIIlIIIlIIllI = llIllllIIIIIlIllIlIIIllIl.IlllIIIlIlllIllIlIIlllIlI;
                        return;
                    default:
                        return;
                }
            case 2:
                this.IIIIllIlIIIllIlllIlllllIl = var1.IIIIllIIllIIIIllIllIIIlIl();
                break;
            case 3:
                this.IllIIIIIIIlIlIllllIIllIII = var1.IIIIllIIllIIIIllIllIIIlIl();
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lllIIIIIIlllIIllIIlIlIIll var1) {
        System.out.println("PACKET");
        this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIIllIIIIllIllIIIlIl().lIIlllIIlIlllllllllIIIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llIllllllllIIIIlllIIIllll var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI("Voice Channel Received: " + var1.IlllIIIlIlllIllIlIIlllIlI());
        this.lIIIIlIIllIIlIIlIIIlIIllI("Channel has " + var1.IIIIllIlIIIllIlllIlllllIl().size() + " members");
        if (!this.lIIIIIIIIIlIllIIllIlIIlIl(var1.lIIIIIIIIIlIllIIllIlIIlIl())) {
            if (this.IlIlIIIlllIIIlIlllIlIllIl == null) {
                this.IlIlIIIlllIIIlIlllIlIllIl = new ArrayList();
            }

            llIIIlllllIIllIlllIlIlIll var2;
            this.IlIlIIIlllIIIlIlllIlIllIl.add(var2 = new llIIIlllllIIllIlllIlIlIll(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI()));
            ArrayList var3 = new ArrayList();
            Iterator var4 = var1.IIIIllIlIIIllIlllIlllllIl().entrySet().iterator();

            Entry var5;
            while(var4.hasNext()) {
                var5 = (Entry)var4.next();
                this.lIIIIlIIllIIlIIlIIIlIIllI("Added member [" + var5.getValue() + "]");
                llIlIlIlIlIlIllIIIIlIIIII var6 = var2.lIIIIlIIllIIlIIlIIIlIIllI((UUID)var5.getKey(), (String)var5.getValue());
                if (var6 != null) {
                    var3.add(var6);
                }
            }

            this.lIIIIlIIllIIlIIlIIIlIIllI((List)var3);
            var4 = var1.IIIIllIIllIIIIllIllIIIlIl().entrySet().iterator();

            while(var4.hasNext()) {
                var5 = (Entry)var4.next();
                this.lIIIIlIIllIIlIIlIIIlIIllI("Added listener [" + var5.getValue() + "]");
                var2.lIIIIIIIIIlIllIIllIlIIlIl((UUID)var5.getKey(), (String)var5.getValue());
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIIllIlIlllIllIIllllIlIl var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI("Channel Update: " + var1.IIIIllIIllIIIIllIllIIIlIl() + " (" + var1.lIIIIIIIIIlIllIIllIlIIlIl() + ")");
        if (this.IlIlIIIlllIIIlIlllIlIllIl != null) {
            llIIIlllllIIllIlllIlIlIll var2 = this.IlllIIIlIlllIllIlIIlllIlI(var1.IlllIIIlIlllIllIlIIlllIlI());
            if (var2 == null) {
                this.lIIIIlIIllIIlIIlIIIlIIllI(var1.IlllIIIlIlllIllIlIIlllIlI().toString());
            } else {
                lIlIIllIIlIIIIIlIllIllllI var4;
                switch(var1.lIIIIIIIIIlIllIIllIlIIlIl()) {
                    case 0:
                        llIlIlIlIlIlIllIIIIlIIIII var3 = var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
                        if (var3 != null) {
                            this.lIIIIlIIllIIlIIlIIIlIIllI((List)ImmutableList.of(var3));
                        }
                        break;
                    case 1:
                        var2.lIIIIlIIllIIlIIlIIIlIIllI(var1.IIIIllIlIIIllIlllIlllllIl());
                        break;
                    case 2:
                        if (!var1.IIIIllIlIIIllIlllIlllllIl().toString().equals(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
                            if (this.IIIllIllIlIlllllllIlIlIII == var2) {
                                var4 = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + var1.IIIIllIIllIIIIllIllIIIlIl() + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + " joined " + var2.lIIIIIIIIIlIllIIllIlIIlIl() + " channel. Press '" + Keyboard.getKeyName(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().lIIIIIIIIIlIllIIllIlIIlIl.lIIIIllIIlIlIllIIIlIllIlI()) + "'!" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII);
                                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var4);
                            }
                        } else {
                            this.IIIllIllIlIlllllllIlIlIII = var2;
                            Iterator var6 = this.IlIlIIIlllIIIlIlllIlIllIl.iterator();

                            while(var6.hasNext()) {
                                llIIIlllllIIllIlllIlIlIll var5 = (llIIIlllllIIllIlllIlIlIll)var6.next();
                                var5.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIlIIIllIlllIlllllIl());
                            }

                            var4 = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + "Joined " + var2.lIIIIIIIIIlIllIIllIlIIlIl() + " channel. Press '" + Keyboard.getKeyName(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().IlllIIIlIlllIllIlIIlllIlI.lIIIIllIIlIlIllIIIlIllIlI()) + "' to talk!" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII);
                            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var4);
                        }

                        var2.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl());
                        break;
                    case 3:
                        if (this.IIIllIllIlIlllllllIlIlIII == var2 && !var1.IIIIllIlIIIllIlllIlllllIl().toString().equals(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
                            var4 = new lIlIIllIIlIIIIIlIllIllllI(IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + var1.IIIIllIIllIIIIllIllIIIlIl() + IlIllllIIlIIllIlIlllllIlI.llIIlllIIIIlllIllIlIlllIl + " left " + var2.lIIIIIIIIIlIllIIllIlIIlIl() + " channel. Press '" + Keyboard.getKeyName(this.lIIIIlIIllIIlIIlIIIlIIllI.IlIlIIIlllIIIlIlllIlIllIl().lIIIIIIIIIlIllIIllIlIIlIl.lIIIIllIIlIlIllIIIlIllIlI()) + "'!" + IlIllllIIlIIllIlIlllllIlI.lIIlIIllIIIIIlIllIIIIllII);
                            lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIIlIIIIlIIIIllllIIlIllI.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(var4);
                        }

                        var2.lIIIIIIIIIlIllIIllIlIIlIl(var1.IIIIllIlIIIllIlllIlllllIl());
                }
            }
        }

    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(List var1) {
        Iterator var2 = var1.iterator();

        while(var2.hasNext()) {
            llIlIlIlIlIlIllIIIIlIIIII var3 = (llIlIlIlIlIlIllIIIIlIIIII)var2.next();
            if (var3 != null && this.lIIIIllIIlIlIllIIIlIllIlI.contains(var3.lIIIIlIIllIIlIIlIIIlIIllI()) && !this.IlllIllIlIIIIlIIlIIllIIIl.contains(var3.lIIIIlIIllIIlIIlIIIlIIllI())) {
                this.IlllIllIlIIIIlIIlIIllIIIl.add(var3.lIIIIlIIllIIlIIlIIIlIIllI());
                this.lIIIIlIIllIIlIIlIIIlIIllI((llIlIIIlIIlIlllIIlIIIIIll)(new lIIlIlIIIIIIlIllIIIlIlIII(var3.lIIIIlIIllIIlIIlIIIlIIllI())));
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIIIllIIIlIlIIIlIIllIlI var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI("Deleted channel: " + var1.lIIIIIIIIIlIllIIllIlIIlIl().toString());
        if (this.IlIlIIIlllIIIlIlllIlIllIl != null) {
            this.IlIlIIIlllIIIlIlllIlIllIl.removeIf((var1x) -> {
                return var1x.lIIIIlIIllIIlIIlIIIlIIllI().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl());
            });
        }

        if (this.IIIllIllIlIlllllllIlIlIII != null && this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI().equals(var1.lIIIIIIIIIlIllIIllIlIIlIl())) {
            this.IIIllIllIlIlllllllIlIlIII = null;
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIlIIllIllIlllIlllllIII var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI("World Update: " + var1.lIIIIIIIIIlIllIIllIlIIlIl());
        this.IlIlllIIIIllIllllIllIIlIl = var1.lIIIIIIIIIlIllIIllIlIIlIl();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IlIIlIlIIlIIlIIlIIlllllII var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI("Retrieved " + var1.lIIIIIIIIIlIllIIllIlIIlIl());
        this.lIIIIlIIllIIlIIlIIIlIIllI.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllllIllIIlIIlllllllllIIl var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII(), var1.IllIIIIIIIlIlIllllIIllIII(), var1.lIIIIllIIlIlIllIIIlIllIlI(), var1.IlllIllIlIIIIlIIlIIllIIIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IIIIllIlIIIllIlllIlllllIl());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIIIlIIlllIllIIllIIIIlIlI var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl(), var1.IlllIIIlIlllIllIlIIlllIlI(), var1.IIIIllIlIIIllIlllIlllllIl(), var1.IIIIllIIllIIIIllIllIIIlIl(), var1.IlIlIIIlllIIIlIlllIlIllIl(), var1.IIIllIllIlIlllllllIlIlIII());
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(llllllIIllIIlllllllIIlIlI var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIIIIIIlIllIIllIlIIlIl());
    }

    private boolean lIIIIIIIIIlIllIIllIlIIlIl(UUID var1) {
        return this.IlllIIIlIlllIllIlIIlllIlI(var1) != null;
    }

    private llIIIlllllIIllIlllIlIlIll IlllIIIlIlllIllIlIIlllIlI(UUID var1) {
        if (this.IlIlIIIlllIIIlIlllIlIllIl == null) {
            return null;
        } else {
            Iterator var2 = this.IlIlIIIlllIIIlIlllIlIllIl.iterator();

            while(var2.hasNext()) {
                llIIIlllllIIllIlllIlIlIll var3 = (llIIIlllllIIllIlllIlIlIll)var2.next();
                if (var3.lIIIIlIIllIIlIIlIIIlIIllI().equals(var1)) {
                    return var3;
                }
            }

            return null;
        }
    }

    public llIlIlIlIlIlIllIIIIlIIIII lIIIIlIIllIIlIIlIIIlIIllI(UUID var1) {
        if (this.IlIlIIIlllIIIlIlllIlIllIl != null && this.IIIllIllIlIlllllllIlIlIII != null) {
            Iterator var2 = this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI().iterator();

            while(var2.hasNext()) {
                llIlIlIlIlIlIllIIIIlIIIII var3 = (llIlIlIlIlIlIllIIIIlIIIII)var2.next();
                if (var3.lIIIIlIIllIIlIIlIIIlIIllI().equals(var1)) {
                    return var3;
                }
            }

            return null;
        } else {
            return null;
        }
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(String var1) {
        System.out.println("\u001b[31m[CheatBreaker]\u001b[0m " + var1);
    }

    public boolean lIIIIIIIIIlIllIIllIlIIlIl() {
        return this.IlllIIIlIlllIllIlIIlllIlI;
    }

    public boolean IlllIIIlIlllIllIlIIlllIlI() {
        return this.IIIIllIlIIIllIlllIlllllIl;
    }

    public boolean IIIIllIlIIIllIlllIlllllIl() {
        return this.IIIIllIIllIIIIllIllIIIlIl;
    }

    public List<llIIIlllllIIllIlllIlIlIll> IIIIllIIllIIIIllIllIIIlIl() {
        return this.IlIlIIIlllIIIlIlllIlIllIl;
    }

    public llIIIlllllIIllIlllIlIlIll IlIlIIIlllIIIlIlllIlIllIl() {
        return this.IIIllIllIlIlllllllIlIlIII;
    }

    public boolean IIIllIllIlIlllllllIlIlIII() {
        return this.IllIIIIIIIlIlIllllIIllIII;
    }

    public List<UUID> IllIIIIIIIlIlIllllIIllIII() {
        return this.lIIIIllIIlIlIllIIIlIllIlI;
    }

    public String lIIIIllIIlIlIllIIIlIllIlI() {
        return this.IlIlllIIIIllIllllIllIIlIl;
    }

    public Map<UUID, List<String>> IlllIllIlIIIIlIIlIIllIIIl() {
        return this.llIIlllIIIIlllIllIlIlllIl;
    }
}
