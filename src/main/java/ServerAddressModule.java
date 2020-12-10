import org.lwjgl.opengl.GL11;

import java.util.Date;

public class ServerAddressModule extends IlIIIIlllIIIlIIllllIIIlll {
    private final lIIlIlllIIIIlIIIllIlIIIII showBackground;
    private lIIlIlllIIIIlIIIllIlIIIII colorSettingsLabel;
    private lIIlIlllIIIIlIIIllIlIIIII textColor;
    private lIIlIlllIIIIlIIIllIlIIIII backgroundColor;


    public ServerAddressModule() {
        super("Server Address");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII);
        this.lIIIIIIIIIlIllIIllIlIIlIl(0.0F, 0.0F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        this.showBackground = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show Background")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.colorSettingsLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Color Settings");
        this.textColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Text Color")).lIIIIIIIIIlIllIIllIlIIlIl(-1).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.backgroundColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Background Color")).lIIIIIIIIIlIllIIllIlIIlIl(1862270976).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.lIIIIlIIllIIlIIlIIIlIIllI("[goldenpvp.net]", 1.0f);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(Object var1) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl renderEvent = (lIllIllIlIIllIllIlIlIIlIl) var1;
            this.lIIIIlIIllIIlIIlIIIlIIllI(renderEvent.lIIIIlIIllIIlIIlIIIlIIllI());
            String var2;
            if (cb.IlIllllIIIlIllllIIIIIllII == null)
                var2 = "Singleplayer";
            else
                var2 = cb.IlIllllIIIlIllllIIIIIllII;

            if ((Boolean) this.showBackground.IIIIllIlIIIllIlllIlllllIl()) {
                this.IlllIIIlIlllIllIlIIlllIlI((float)56 + var2.length(), (float)18);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)56 + var2.length(), (float)13, this.backgroundColor.lIIIIlIIllIIlIIlIIIlIIllI());
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var2, (int)(this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2)), 3, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI());
            } else {
                var2 = "[" + var2 + "]";
                this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            }
            GL11.glPopMatrix();
        }
    }
}