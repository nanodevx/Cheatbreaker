import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.lwjgl.opengl.GL11;

// TODO: More Settings.
public class ClockModule extends IlIIIIlllIIIlIIllllIIIlll {
    private final lIIlIlllIIIIlIIIllIlIIIII showBackground;
    private lIIlIlllIIIIlIIIllIlIIIII colorSettingsLabel;
    private lIIlIlllIIIIlIIIllIlIIIII textColor;
    private lIIlIlllIIIIlIIIllIlIIIII backgroundColor;
    private lIIlIlllIIIIlIIIllIlIIIII clockSettingsLabel;
    private lIIlIlllIIIIlIIIllIlIIIII showSeconds;
    private lIIlIlllIIIIlIIIllIlIIIII amPmMarker;

    public ClockModule() {
        super("Clock");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII);
        this.setNew(true);
        this.lIIIIIIIIIlIllIIllIlIIlIl(0.0F, 0.0F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        this.showBackground = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show Background")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.clockSettingsLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Clock Settings");
        this.amPmMarker = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Am/pm marker")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.showSeconds = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show seconds")).lIIIIIIIIIlIllIIllIlIIlIl(false);
        this.colorSettingsLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Color Settings");
        this.textColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Text Color")).lIIIIIIIIIlIllIIllIlIIlIl(-1).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.backgroundColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Background Color")).lIIIIIIIIIlIllIIllIlIIlIl(1862270976).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/icons/mods/clock.png"), 46, 43);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(Object var1) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl renderEvent = (lIllIllIlIIllIllIlIlIIlIl) var1;
            this.lIIIIlIIllIIlIIlIIIlIIllI(renderEvent.lIIIIlIIllIIlIIlIIIlIIllI());
            StringBuilder dateFormatBuilder = new StringBuilder();
            int amount = 0;
            dateFormatBuilder.append("hh:mm");
            if ((Boolean) this.showSeconds.IIIIllIlIIIllIlllIlllllIl()) {
                dateFormatBuilder.append(":ss");
                amount += 3;
            }
            if ((Boolean) this.amPmMarker.IIIIllIlIIIllIlllIlllllIl()) {
                dateFormatBuilder.append(" a");
                amount += 2;
            }

            String var2;
            DateFormat pattern = new SimpleDateFormat(dateFormatBuilder.toString());

            if ((Boolean) this.showBackground.IIIIllIlIIIllIlllIlllllIl()) {
                this.IlllIIIlIlllIllIlIIlllIlI((float)56 + amount, (float)18);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)56 + amount, (float)13, this.backgroundColor.lIIIIlIIllIIlIIlIIIlIIllI());
                var2 = pattern.format(new Date());
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var2, (int)(this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2)), 3, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI());
            } else {
                var2 = "[" + pattern.format(new Date()) + "]";
                this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            }
            GL11.glPopMatrix();
        }
    }
}
