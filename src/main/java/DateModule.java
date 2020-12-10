import org.lwjgl.opengl.GL11;

import java.util.Calendar;

public class DateModule extends IlIIIIlllIIIlIIllllIIIlll {
    private final lIIlIlllIIIIlIIIllIlIIIII showBackground;
    private lIIlIlllIIIIlIIIllIlIIIII textColor;
    private lIIlIlllIIIIlIIIllIlIIIII backgroundColor;
    private lIIlIlllIIIIlIIIllIlIIIII showMonth;
    private lIIlIlllIIIIlIIIllIlIIIII showDayOfMonth;

    public DateModule() {
        super("Date");
        this.lIIIIIIIIIlIllIIllIlIIlIl(IIlIIlIIIIIlIlIIlIIlIIlII.IllIIIIIIIlIlIllllIIllIII);
        this.lIIIIIIIIIlIllIIllIlIIlIl(0.0F, 0.0F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(false);
        this.showBackground = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show Background")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.showMonth = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show month")).lIIIIIIIIIlIllIIllIlIIlIl(true);
        this.showDayOfMonth = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Show day of the month")).lIIIIIIIIIlIllIIllIlIIlIl(false);
        this.textColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Text Color")).lIIIIIIIIIlIllIIllIlIIlIl(-1).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.backgroundColor = (new lIIlIlllIIIIlIIIllIlIIIII(this, "Background Color")).lIIIIIIIIIlIllIIllIlIIlIl(1862270976).lIIIIlIIllIIlIIlIIIlIIllI(-2147483648, 2147483647);
        this.lIIIIlIIllIIlIIlIIIlIIllI("[09/21/1999]", 1.5F);
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, this::lIIIIlIIllIIlIIlIIIlIIllI);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(Object var1) {
        if (this.IIIlllIIIllIllIlIIIIIIlII()) {
            GL11.glPushMatrix();
            lIllIllIlIIllIllIlIlIIlIl renderEvent = (lIllIllIlIIllIllIlIlIIlIl) var1;
            this.lIIIIlIIllIIlIIlIIIlIIllI(renderEvent.lIIIIlIIllIIlIIlIIIlIIllI());
            StringBuilder dateFormatBuilder = new StringBuilder();
            Calendar calendar = Calendar.getInstance();
            int amount = 0;

            if ((Boolean) this.showMonth.IIIIllIlIIIllIlllIlllllIl()) {
                dateFormatBuilder.append(calendar.get(Calendar.MONTH) + 1 + "/");
                amount += 3;
            }

            if ((Boolean) this.showDayOfMonth.IIIIllIlIIIllIlllIlllllIl()) {
                dateFormatBuilder.append(calendar.get(Calendar.DAY_OF_MONTH) + "/");
                amount += 3;
            }

            dateFormatBuilder.append(calendar.get(Calendar.YEAR));

            String date = "";

            if ((Boolean) this.showBackground.IIIIllIlIIIllIlllIlllllIl()) {
                this.IlllIIIlIlllIllIlIIlllIlI((float)58 + amount, (float)18);
                IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, (float)58 + amount, (float)13, this.backgroundColor.lIIIIlIIllIIlIIlIIIlIIllI());
                date = dateFormatBuilder.toString();
                this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(date, (int)(this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(date) / 2)), 3, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI());
            } else {
                date = "[" + dateFormatBuilder.toString() + "]";
                this.IlllIIIlIlllIllIlIIlllIlI((float)this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(date, this.llIlIIIllIIIIlllIlIIIIIlI / 2.0F - (float)(this.IIIIIIlIlIlIllllllIlllIlI.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(date) / 2) - 1.0F, 0.0F, this.textColor.lIIIIlIIllIIlIIlIIIlIIllI(), true), (float)18);
            }
            GL11.glPopMatrix();
        }
    }
}
