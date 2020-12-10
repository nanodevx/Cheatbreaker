import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import com.offlinecheatbreaker.client.data.FriendTypingData;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class lIlIIIlIIIlllllllllllIlIl extends IIlIlIIlIIIlIlllllIIlIIlI {
    final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    private lIIllIIIIllIIlllIIIIlllII IIIllIllIlIlllllllIlIlIII;
    private final IIIlIllIlllIlIllIllllllll IllIIIIIIIlIlIllllIIllIII;
    private final IlIIlIIllIllIIIIIlllIIlll lIIIIllIIlIlIllIIIlIllIlI;
    private final lllIIllllIIlIlIlIlIIIlIII IlllIllIlIIIIlIIlIIllIIIl;
    private final lllIIllllIIlIlIlIlIIIlIII IlIlllIIIIllIllllIllIIlIl;
    private final IlIIlIIllIllIIIIIlllIIlll llIIlllIIIIlllIllIlIlllIl;
    private final IlIIlIIllIllIIIIIlllIIlll lIIlIlIllIIlIIIlIIIlllIII;
    private long startedTyping = -1L;
    private boolean needToSendTyping = true;

    public lIlIIIlIIIlllllllllllIlIl(lIIllIIIIllIIlllIIIIlllII var1) {
        this.IIIllIllIlIlllllllIlIlIII = var1;
        this.IllIIIIIIIlIlIllllIIllIII = new IIIlIllIlllIlIllIllllllll(cb.lIIlIlIllIIlIIIlIIIlllIII, "Message", 805306367, 1879048191);
        this.IllIIIIIIIlIlIllllIIllIII.IlIlIIIlllIIIlIlllIlIllIl(256);
        this.lIIIIllIIlIlIllIIIlIllIlI = new IlIIlIIllIllIIIIIlllIIlll("SEND");
        this.IlllIllIlIIIIlIIlIIllIIIl = new lllIIllllIIlIlIlIlIIIlIII(this);
        this.IlIlllIIIIllIllllIllIIlIl = new lllIIllllIIlIlIlIlIIIlIII(this);
        this.llIIlllIIIIlllIllIlIlllIl = new IlIIlIIllIllIIIIIlllIIlll("Aliases");
        this.lIIlIlIllIIlIIIlIIIlllIII = new IlIIlIIllIllIIIIIlllIIlll("X");
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, float var3, float var4) {
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4);
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1 + (float)26, var2 + var4 - (float)15, var3 - (float)62, (float)13);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1 + var3 - (float)37, var2 + var4 - (float)15, (float)35, (float)13);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1 + var3 - (float)6, var2 + (float)22, (float)4, var4 - (float)39);
        this.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1 + 2.0F, var2 + 2.0F, 0.0F, var4 - (float)4);
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1 + var3 - (float)54, var2 + 2.0F, (float)40, (float)16);
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1 + var3 - (float)12, var2 + 2.0F, (float)10, (float)16);
    }

    public static String lIIIIlIIllIIlIIlIIIlIIllI(byte[] var0) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec var1 = new SecretKeySpec(lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIllllIIIIlIlIIIIlIlI, "AES");
        Cipher var2 = Cipher.getInstance("AES");
        var2.init(2, var1);
        return new String(var2.doFinal(var0));
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, boolean var3) {
        this.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)23, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, 0.074324325F * 6.7272725F, -16777216, -14869219);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIIIIIIlIllIIllIlIIlIl(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)23, this.lIIIIIIIIIlIllIIllIlIIlIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, 0.7132353F * 0.7010309F, -16777216, -15395563);
        GL11.glPushMatrix();
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)25, this.lIIIIIIIIIlIllIIllIlIIlIl - 1.9285715F * 0.25925925F, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl, -1357572843);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)25, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 0.25F * 2.0F, -1357572843);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)27, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)3, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)43, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)19, this.IIIllIllIlIlllllllIlIlIII.IIIllIllIlIlllllllIlIlIII() ? lIIllIIIIllIIlllIIIIlllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIllIIlIlIllIIIlIllIlI()) : -13158601);
        if (cb.getFriendsTypingInComingData().stream().anyMatch(friendTypingData -> friendTypingData.getPlayerId().equals(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI()))) {
            // a friend is typing, and we must be on their page! show reality.
            String text = "is typing...";
            int offsetWidth = cb.lllIIIIIlIllIlIIIllllllII.lIIIIIIIIIlIllIIllIlIIlIl(text) + cb.IIIlIIllllIIllllllIlIIIll.lIIIIIIIIIlIllIIllIlIIlIl(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl()) + 4;
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + 22, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl, this.lIIIIlIIllIIlIIlIIIlIIllI + offsetWidth, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 12, -16777216);
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + 23, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 1, this.lIIIIlIIllIIlIIlIIIlIIllI + offsetWidth + 1, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 11, -14869219);
            cb.IIIlIIllllIIllllllIlIIIll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + 25, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 2, -5460820);
            cb.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(text, this.lIIIIlIIllIIlIIlIIIlIIllI + 25 + cb.IIIlIIllllIIllllllIlIIIll.lIIIIIIIIIlIllIIllIlIIlIl(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl()) + 2, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl + 2, -5460820);
        }
        cb.IIIlllIIIllIllIlIIIIIIlII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)52, this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F, -1);
        cb.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.lIIIIlIIllIIlIIlIIIlIIllI(), this.lIIIIlIIllIIlIIlIIIlIIllI + (float)52, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)11, -5460820);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        IIllIIlIllIIlllIlIllIIIlI var4 = cb.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIllIllIlIlllllllIlIlIII.IIIIllIlIIIllIlllIlllllIl()), this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(var4, (float)7, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)28, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)27, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)22, this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - 2.0F, this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl - (float)17, -1356783327);
        this.IlIlllIIIIllIllllIllIIlIl.IlllIIIlIlllIllIlIIlllIlI(var1, var2, var3);
        GL11.glPushMatrix();
        GL11.glEnable(3089);
        IlllllIllIIIllIIIllIllIII var5 = IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll();
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(0, (int)(this.lIIIIIIIIIlIllIIllIlIIlIl + 2.0F), (int)var5.IlIlIIIlllIIIlIlllIlIllIl(), (int)(this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl - 2.0F), (float)((int)((float)var5.llIIlllIIIIlllIllIlIlllIl().IIIIllIIllIIIIllIllIIIlIl() * var5.IIIIllIIllIIIIllIllIIIlIl())), (int)var5.IIIllIllIlIlllllllIlIlIII());
        int var7 = 0;
        Iterator var8 = this.IlIlIIIlllIIIlIlllIlIllIl.llIlIIIllIIIIlllIlIIIIIlI().lIIIIlIIllIIlIIlIIIlIIllI().values().iterator();
        this.testTyping();
        while(true) {
            lIIllIIIIllIIlllIIIIlllII var9;
            do {
                if (!var8.hasNext()) {
                    this.IlIlllIIIIllIllllIllIIlIl.IIIIllIIllIIIIllIllIIIlIl((float)var7);
                    GL11.glDisable(3089);
                    GL11.glPopMatrix();
                    this.IlIlllIIIIllIllllIllIIlIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3);
                    this.IlllIllIlIIIIlIIlIIllIIIl.IIIIllIIllIIIIllIllIIIlIl(var1, var2, var3);

                    try {
                        if (cb.llIlIIIllIIIIlllIlIIIIIlI().IlllIIIlIlllIllIlIIlllIlI().containsKey(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI())) {
                            GL11.glPushMatrix();
                            GL11.glEnable(3089);
                            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI((int)(this.lIIIIlIIllIIlIIlIIIlIIllI + 2.0F), (int)(this.lIIIIIIIIIlIllIIllIlIIlIl + (float)22), (int)(this.lIIIIlIIllIIlIIlIIIlIIllI + this.IlllIIIlIlllIllIlIIlllIlI - 2.0F), (int)(this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl - (float)17), (float)((int)((float)var5.llIIlllIIIIlllIllIlIlllIl().IIIIllIIllIIIIllIllIIIlIl() * var5.IIIIllIIllIIIIllIllIIIlIl())), (int)var5.IIIllIllIlIlllllllIlIlIII());
                            List var19 = cb.llIlIIIllIIIIlllIlIIIIIlI().IlllIIIlIlllIllIlIIlllIlI().get(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI());
                            int var20 = 0;

                            for(int var21 = var19.size() - 1; var21 >= 0; --var21) {
                                String var22 = (String)var19.get(var21);
                                String[] var23 = cb.lIIlIlIllIIlIIIlIIIlllIII.lIIIIIIIIIlIllIIllIlIIlIl(var22, this.IlllIIIlIlllIllIlIIlllIlI - (float)25).split("\n");
                                var20 += var23.length * 10;
                                int var24 = 0;
                                String[] var14 = var23;
                                int var15 = var23.length;

                                for(int var16 = 0; var16 < var15; ++var16) {
                                    String var17 = var14[var16];
                                    float var10002 = this.lIIIIlIIllIIlIIlIIIlIIllI + (float)31;
                                    float var10003 = this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl - (float)19 - (float)var20 + (float)(var24 * 10);
                                    cb.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(var17, var10002, var10003, -1);
                                    ++var24;
                                }
                            }

                            this.IlllIllIlIIIIlIIlIIllIIIl.IIIIllIIllIIIIllIllIIIlIl((float)(var20 + 4));
                            GL11.glDisable(3089);
                            GL11.glPopMatrix();
                        }
                    } catch (Exception var18) {
                        var18.printStackTrace();
                    }

                    this.IlllIllIlIIIIlIIlIIllIIIl.IIIIllIlIIIllIlllIlllllIl(var1, var2, var3);
                    GL11.glPopMatrix();
                    this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
                    this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
                    this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
                    this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
                    return;
                }

                var9 = (lIIllIIIIllIIlllIIIIlllII)var8.next();
            } while(var9 != this.IIIllIllIlIlllllllIlIlIII && !this.IlIlIIIlllIIIlIlllIlIllIl.llIlIIIllIIIIlllIlIIIIIlI().IlllIIIlIlllIllIlIIlllIlI().containsKey(var9.IlllIIIlIlllIllIlIIlllIlI()) && !var9.IIIllIllIlIlllllllIlIlIII());

            float var10 = this.lIIIIIIIIIlIllIIllIlIIlIl + (float)3 + (float)var7;
            boolean var11 = var1 > this.lIIIIlIIllIIlIIlIIIlIIllI && var1 < this.lIIIIlIIllIIlIIlIIIlIIllI + (float)25 && var2 > var10 - this.IlIlllIIIIllIllllIllIIlIl.IllIIIIIIIlIlIllllIIllIII() && var2 < var10 + (float)16 - this.IlIlllIIIIllIllllIllIIlIl.IllIIIIIIIlIlIllllIIllIII() && var2 > this.lIIIIIIIIIlIllIIllIlIIlIl && var2 < this.lIIIIIIIIIlIllIIllIlIIlIl + this.IIIIllIlIIIllIlllIlllllIl;
            IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI + (float)3, var10, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)19, var10 + (float)16, var9.IIIllIllIlIlllllllIlIlIII() ? lIIllIIIIllIIlllIIIIlllII.lIIIIlIIllIIlIIlIIIlIIllI(var9.lIIIIllIIlIlIllIIIlIllIlI()) : -13158601);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var11 ? 1.0F : 0.6016854F * 1.4126984F);
            IIllIIlIllIIlllIlIllIIIlI var12 = cb.lIIIIlIIllIIlIIlIIIlIIllI(IlIllllIIlIIllIlIlllllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var9.IIIIllIlIIIllIlllIlllllIl()), var9.IlllIIIlIlllIllIlIIlllIlI());
            lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(var12, (float)7, this.lIIIIlIIllIIlIIlIIIlIIllI + (float)4, this.lIIIIIIIIIlIllIIllIlIIlIl + (float)4 + (float)var7);
            if (var11) {
                float var13 = (float)this.IlIlIIIlllIIIlIlllIlIllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(IlIllllIIlIIllIlIlllllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var9.IIIIllIlIIIllIlllIlllllIl()));
                lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.lIIIIlIIllIIlIIlIIIlIIllI - (float)10 - var13, var10 + 2.0F, this.lIIIIlIIllIIlIIlIIIlIIllI - 2.0F, var10 + (float)14, (double)6, -1895825408);
                this.IlIlIIIlllIIIlIlllIlIllIl.llIlIIIlIIIIlIlllIlIIIIll.lIIIIlIIllIIlIIlIIIlIIllI(var9.IIIIllIlIIIllIlllIlllllIl(), this.lIIIIlIIllIIlIIlIIIlIIllI - (float)6 - var13, var10 + (float)4, -1);
                if (Mouse.isButtonDown(0) && this.IIIllIllIlIlllllllIlIlIII != var9) {
                    this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                    this.IIIllIllIlIlllllllIlIlIII = var9;
                }
            }

            var7 += 18;
        }
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI();
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI();
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI();
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI();
    }

    public void lIIIIIIIIIlIllIIllIlIIlIl() {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl();
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl();
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl();
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl();
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIIIIIIlIllIIllIlIIlIl();
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(char var1, int var2) {
        if (this.IllIIIIIIIlIlIllllIIllIII.lllIIIIIlIllIlIIIllllllII() && !this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI().equals("") && var2 == 28) {
            this.IlIlllIIIIllIllllIllIIlIl();
            FriendTypingData data = cb.getFriendsOutGoingData().stream().filter(friendTypingData -> friendTypingData.getPlayerId().equals(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI())).findFirst().orElse(null);
            if (data != null) { // We stopped typing to this player since we hit "enter".
                this.stopTyping(data);
            }
        } else if (this.IllIIIIIIIlIlIllllIIllIII.lllIIIIIlIllIlIIIllllllII()) {
            if (cb.getFriendsOutGoingData().stream().noneMatch(friendTypingData -> friendTypingData.getPlayerId().equals(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI()))) {
                // data doesn't exist make new data and send!
                cb.getFriendsOutGoingData().add(new FriendTypingData(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), false));
                cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new CBPacketFriendTypingStatus(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), true));
            } else {
                FriendTypingData data = cb.getFriendsOutGoingData().stream().filter(friendTypingData -> friendTypingData.getPlayerId().equals(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI())).findFirst().orElse(null);

                if (data != null) {
                    if (!data.hasTypingExpired()) { // we haven't expired, change the time.
                        data.setStartedTypingTime(System.currentTimeMillis());
                    } else {
                        cb.getFriendsOutGoingData().remove(data);
                        cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new CBPacketFriendTypingStatus(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), false));
                        cb.getFriendsOutGoingData().add(new FriendTypingData(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), false)); // send new data.
                        cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new CBPacketFriendTypingStatus(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), true));
                    }
                }
            }
        }

        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
        this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3) {
        if (!this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && this.IllIIIIIIIlIlIllllIIllIII.lllIIIIIlIllIlIIIllllllII()) {
            this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl(false);
        }

        return false;
    }

    public boolean lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3, boolean var4) {
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4);
        if (!var4) {
            return false;
        } else {
            if (!this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI().equals("") && this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                this.IlIlllIIIIllIllllIllIIlIl();
            }

            this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, true);
            this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, true);
            this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, true);
            if (!this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && this.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2) && var2 < this.lIIIIIIIIIlIllIIllIlIIlIl + (float)22) {
                this.IlllIIIlIlllIllIlIIlllIlI(var1, var2);
            }

            if (this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().IlllIIIlIlllIllIlIIlllIlI(this);

                for (FriendTypingData data : cb.getFriendsOutGoingData()) {
                    cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new CBPacketFriendTypingStatus(data.getPlayerId(), false));
                }

                return true;
            } else if (this.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
                this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                lIlllllIlIllllIIIllllllII var5;
                IlllllIllIIIllIIIllIllIII.llIlIIIlIIIIlIlllIlIIIIll().lIIIIIIIIIlIllIIllIlIIlIl(var5 = new lIlllllIlIllllIIIllllllII(this.IIIllIllIlIlllllllIlIlIII));
                var5.lIIIIlIIllIIlIIlIIIlIIllI((float)60, (float)30, (float)140, (float)30);
                return true;
            } else {
                return false;
            }
        }
    }

    public void IlllIIIlIlllIllIlIIlllIlI() {
        this.IlllIllIlIIIIlIIlIIllIIIl.IlllIIIlIlllIllIlIIlllIlI();
        this.IlIlllIIIIllIllllIllIIlIl.IlllIIIlIlllIllIlIIlllIlI();
    }

    private void IlIlllIIIIllIllllIllIIlIl() {
        String var1 = this.IllIIIIIIIlIlIllllIIllIII.lIIIIllIIlIlIllIIIlIllIlI();
        cb.llIlIIIllIIIIlllIlIIIIIlI().IlllIIIlIlllIllIlIIlllIlI(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), var1);
        cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI((IllllIllIllIIIIIIlIllIIll)(new IlIIlIIllIIIlIllIllllIIlI(this.IIIllIllIlIlllllllIlIlIII.IlllIIIlIlllIllIlIIlllIlI(), var1)));
        this.IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI("");
        this.IIIIllIIllIIIIllIllIIIlIl.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
    }

    public boolean lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, int var3, boolean var4) {
        if (!var4) {
            return false;
        } else {
            this.IllIIIIIIIlIlIllllIIllIII.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, true);
            this.lIIIIllIIlIlIllIIIlIllIlI.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, true);
            this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, true);
            this.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, true);
            this.lIIlIlIllIIlIIIlIIIlllIII.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, var3, true);
            return false;
        }
    }

    /**
     * Remove data and send that the player stopped typing.
     *
     * @param data - FriendTypingData instance.
     */
    public void stopTyping(FriendTypingData data) {
        cb.getFriendsOutGoingData().remove(data);
        cb.lIllIllIlIIllIllIlIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(new CBPacketFriendTypingStatus(data.getPlayerId(), false));
    }

    /**
     * Make a whole list stop typing.
     *
     * @param dataList - List of "FriendTypingData"
     */
    public void stopTyping(List<FriendTypingData> dataList) {
        dataList.forEach(data -> {
            this.stopTyping(data);
        });
    }

    /**
     * Test if any data has expired to remove.
     */
    public void testTyping() {
        Iterator<FriendTypingData> iterator = cb.getFriendsOutGoingData().iterator();
        List<FriendTypingData> friendStoppedTypingTo = new ArrayList<>();

        while (iterator.hasNext()) {
            FriendTypingData data = iterator.next();

            if (data.hasTypingExpired()) {
                friendStoppedTypingTo.add(data);
            }
        }

        this.stopTyping(friendStoppedTypingTo);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIIllIIIIllIIlllIIIIlllII var1) {
        this.IIIllIllIlIlllllllIlIlIII = var1;
    }

    public lIIllIIIIllIIlllIIIIlllII lIIIIllIIlIlIllIIIlIllIlI() {
        return this.IIIllIllIlIlllllllIlIlIII;
    }

    public IIIlIllIlllIlIllIllllllll IlllIllIlIIIIlIIlIIllIIIl() {
        return this.IllIIIIIIIlIlIllllIIllIII;
    }
}
