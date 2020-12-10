import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.lwjgl.opengl.GL11;

public class llIIIlllllIlllIIllIlIIlII extends IlIIIIlllIIIlIIllllIIIlll {
    private String holaKiddo = "Kiddo stop decompiling...";
    private final List<Long> lIIIIlIIllIIlIIlIIIlIIllI;
    private final List<Long> rightClicks;
    private final lIIlIlllIIIIlIIIllIlIIIII showBackground;
    private lIIlIlllIIIIlIIIllIlIIIII clickLabel;
    private lIIlIlllIIIIlIIIllIlIIIII rightClick;
    private lIIlIlllIIIIlIIIllIlIIIII leftClick;
    private lIIlIlllIIIIlIIIllIlIIIII colorLabel;
    private lIIlIlllIIIIlIIIllIlIIIII textColor;
    private lIIlIlllIIIIlIIIllIlIIIII backgroundColor;



    public llIIIlllllIlllIIllIlIIlII() {
        super("CPS");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII);
        this.lIIIIIIIIIlIllIIllIlIIlIl(0.0F, 0.0F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        this.lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList();
        this.rightClicks = new ArrayList<>();
        this.showBackground = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show Background")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.clickLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Clicking settings");
        this.leftClick = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Left click counter")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.rightClick = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Right click counter")).lIIIIIIIIIlIllIIllIlIIlIl(false);
        this.colorLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Color settings");
        this.textColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Text Color")).lIIIIIIIIIlIllIIllIlIIlIl(-1).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.backgroundColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Background Color")).lIIIIIIIIIlIllIIllIlIIlIl(1862270976).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.lIIIIlIIllIIlIIlIIIlIIllI("[9 CPS]", 1.1030303F * 1.2692307F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
        this.lIIIIlIIllIIlIIlIIIlIIllI(IllIlIlIllllIlIIllllIIlll.class, this::tickEvent);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIlIlllllllllIIIIIl.class, this::clickEvent);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(Object event) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl var1 = (lIllIllIlIIllIllIlIlIIlIl) event;
            this.lIIIIlIIllIIlIIlIIIlIIllI(var1.lIIIIlIIllIIlIIlIIIlIIllI());
            StringBuilder cps = new StringBuilder();

            if ((Boolean) this.leftClick.IIIIllIlIIIllIlllIlllllIl() && (Boolean) this.rightClick.IIIIllIlIIIllIlllIlllllIl()
                    || (Boolean) this.leftClick.IIIIllIlIIIllIlllIlllllIl() && !((Boolean) this.rightClick.IIIIllIlIIIllIlllIlllllIl()))
            cps.append(this.lIIIIlIIllIIlIIlIIIlIIllI.size() + " ");

            int amount = 0;

            if ((Boolean) this.rightClick.IIIIllIlIIIllIlllIlllllIl() && (Boolean) this.leftClick.IIIIllIlIIIllIlllIlllllIl()) {
                cps.append(StringEscapeUtils.unescapeJava("\u2758") + " " + this.rightClicks.size() + " ");
                amount += 3;
            } else if ((Boolean) this.rightClick.IIIIllIlIIIllIlllIlllllIl()) {
                cps.append(this.rightClicks.size() + " ");
            }

            if (cps.length() == 0) { // we haven't been provided anything...
                this.leftClick.lIIIIlIIllIIlIIlIIIlIIllI((Object) true, false);
                cps.append(this.lIIIIlIIllIIlIIlIIIlIIllI.size() + " ");
            }


            cps.append("CPS");

            String var2;
            if ((Boolean)this.showBackground.IIIIllIlIIIllIlllIlllllIl()) {
                this.IlllIIIlIlllIllIlIIlllIlI((float) 56 + (amount >= 3 ? amount + 1.0f : 0), (float)18);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)56 + (amount >= 3 ? amount + 1.0f : 0), (float)13, this.backgroundColor.lIIIIlIIllIIlIIlIIIlIIllI());
                var2 = cps.toString();
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var2, (int)(this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2)), 3, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI());
                //this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            } else {
                var2 = "[" + cps.toString() +  "]";
                this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            }
            GL11.glPopMatrix();
        }
    }

    private void tickEvent(Object var1) {
        this.lIIIIlIIllIIlIIlIIIlIIllI.removeIf((var0) -> var0 < System.currentTimeMillis() - 1000L);
        this.rightClicks.removeIf((var0) -> var0 < System.currentTimeMillis() - 1000L);
    }

    private void clickEvent(Object event) {
        lIIlllIIlIlllllllllIIIIIl var1 = (lIIlllIIlIlllllllllIIIIIl) event;
        if (var1.lIIIIlIIllIIlIIlIIIlIIllI() == 0) {
            this.lIIIIlIIllIIlIIlIIIlIIllI.add(System.currentTimeMillis());
        } else if (var1.lIIIIlIIllIIlIIlIIIlIIllI() == 1) {
            this.rightClicks.add(System.currentTimeMillis());
        }

    }
}
