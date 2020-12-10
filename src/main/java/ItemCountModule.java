import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import com.cheatbreaker.client.network.messages.Message;
import org.lwjgl.opengl.GL11;

public class ItemCountModule extends IlIIIIlllIIIlIIllllIIIlll {
    private final lIIlIlllIIIIlIIIllIlIIIII showBackground;
    private lIIlIlllIIIIlIIIllIlIIIII itemCounterSettingsLabel;
    private lIIlIlllIIIIlIIIllIlIIIII mode;
    private lIIlIlllIIIIlIIIllIlIIIII healthOne;
    private lIIlIlllIIIIlIIIllIlIIIII colorSettingsLabel;
    private lIIlIlllIIIIlIIIllIlIIIII textColor;
    private lIIlIlllIIIIlIIIllIlIIIII backgroundColor;

    public ItemCountModule() {
        super("Item Counter");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII);
        this.lIIIIIIIIIlIllIIllIlIIlIl(0.0F, 0.0F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        this.showBackground = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show Background")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.itemCounterSettingsLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Item Counter Settings");
        //this.mode = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Mode")).lIIIIIIIIIlIllIIllIlIIlIl("Potion").lIIIIlIIllIIlIIlIIIlIIllI((Object[]) (new String[]{"Potion", "Soup"}));
        this.colorSettingsLabel = (new lIIlIlllIIIIlIIIllIlIIIII(this, "label")).lIIIIIIIIIlIllIIllIlIIlIl("Color Settings");
        this.textColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Text Color")).lIIIIIIIIIlIllIIllIlIIlIl(-1).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.backgroundColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Background Color")).lIIIIIIIIIlIllIIllIlIIlIl(1862270976).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("client/icons/mods/potion.png"), 46, 43);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(Object var1) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl renderEvent = (lIllIllIlIIllIllIlIlIIlIl) var1;
            this.lIIIIlIIllIIlIIlIIIlIIllI(renderEvent.lIIIIlIIllIIlIIlIIIlIIllI());
            String var2;
            lllIIlIlllIIlIIIIllIIlIlI player = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIlllIIIIllIllllIllIIlIl;
            StringBuilder countBuilder = new StringBuilder();

            //if (this.mode.IIIIllIlIIIllIlllIlllllIl().equals("Potion")) {
                countBuilder.append(getItemFromPlayersInventory(16421));
            // getItemFromPlayersInventory(16453); Health one.
            //} else {
            //countBuilder.append()
           // }

            if ((Boolean) this.showBackground.IIIIllIlIIIllIlllIlllllIl()) {
                this.IlllIIIlIlllIllIlIIlllIlI((float)56, (float)18);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)56, (float)13, this.backgroundColor.lIIIIlIIllIIlIIlIIIlIIllI());
                var2 = countBuilder.toString() + " Pots";
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var2, (int)(this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2)), 3, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI());
            } else {
                var2 = "[" + countBuilder.toString() + " Pots" + "]";
                this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var2) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            }
            GL11.glPopMatrix();
        }
    }

    private int getItemFromPlayersInventory(lIllIIIIlIIlIllIIIlIlIlll player, lIIlllIIIlIllllllIlIlIIII item) {
        int c = 0;
        for(int i1 = 0; i1 < player.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI.length; i1++) {
            if(player.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI[i1] != null && item.equals(player.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI[i1].lIIIIlIIllIIlIIlIIIlIIllI())) {
                c += player.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI[i1].lIIIIIIIIIlIllIIllIlIIlIl;
            }
        }
        return c;
    }

    private int getItemFromPlayersInventory(int id) {
        return (int) Arrays.stream(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlIlllIIIIllIllllIllIIlIl.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI).filter(item -> item != null).filter(item -> item.lIIIIlIIllIIlIIlIIIlIIllI() instanceof lIIIIlIIIlIllIlllIIIIIIII).filter(item -> item.IlllIllIlIIIIlIIlIIllIIIl() == id).count();
    }
}
