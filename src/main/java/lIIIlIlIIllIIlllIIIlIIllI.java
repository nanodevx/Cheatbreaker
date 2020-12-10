import com.google.gson.*;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class lIIIlIlIIllIIlllIIIlIIllI extends lIIIlllIIIlIIIIIlIIIIIIII {
    lIIIIlIIllIIlIIlIIIlIIllI cheatbreaker;
    private final IIllIIlIllIIlllIlIllIIIlI IIIIllIlIIIllIlllIlllllIl;
    private lllIIIlllIIlllIlIlllIlIlI IIIIllIIllIIIIllIllIIIlIl;
    private IIllIIlIllIIlllIlIllIIIlI IlIlIIIlllIIIlIlllIlIllIl;
    private static int IIIllIllIlIlllllllIlIlIII = 4100;
    private final lIIlIIIllIIlllIlllIlIIlll quitButton;
    private final lIIlIIIllIIlllIlllIlIIlll languageButton;
    private final llllIIllllllIlIIlIlIIIllI IlllIllIlIIIIlIIlIIllIIIl;
    private final lllIllIlIllIlIllIIIIIIlll optionsButton;
    private final lllIllIlIllIlIllIIIIIIlll changelogButton;
    private final lllIllIlIllIlIllIIIIIIlll cosmeticsButton;
    private final lllIllIlIllIlIllIIIIIIlll discordButton;
    private final IllllllIllllIIlllIllllllI IllIlIIIIlllIIllIIlllIIlI;
    private final IIllIIlIllIIlllIlIllIIIlI[] IllIlIlIllllIlIIllllIIlll;
    private final File IllIIlIIlllllIllIIIlllIII;
    private final List lIlIlIllIIIIIIIIllllIIllI;
    private float IlllIIlllIIIIllIIllllIlIl;
    String clientToken;

    public lIIIlIlIIllIIlllIIIlIIllI() {
        this.cheatbreaker = lIIIllllIIllIIIIIlIIlIIlI.cb;
        this.IIIIllIlIIIllIlllIlllllIl = new IIllIIlIllIIlllIlIllIIIlI("client/logo_42.png");
        this.IllIlIlIllllIlIIllllIIlll = new IIllIIlIllIIlllIlIllIIIlI[] {
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/0.png"),
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/1.png"),
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/2.png"),
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/3.png"),
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/4.png"),
                new IIllIIlIllIIlllIlIllIIIlI("client/panorama/5.png")
        };
        this.clientToken = "";
        this.IllIIlIIlllllIllIIIlllIII = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "launcher_accounts.json");
        this.lIlIlIllIIIIIIIIllllIIllI = new ArrayList();
        this.optionsButton = new lllIllIlIllIlIllIIIIIIlll("OPTIONS");
        this.cosmeticsButton = new lllIllIlIllIlIllIIIIIIlll("COSMETICS");
        this.changelogButton = new lllIllIlIllIlIllIIIIIIlll("CHANGELOG");
        this.discordButton = new lllIllIlIllIlIllIIIIIIlll("DISCORD");
        this.IllIlIIIIlllIIllIIlllIIlI = new IllllllIllllIIlllIllllllI(251658240, -16777216);
        this.quitButton = new lIIlIIIllIIlllIlllIlIIlll(new IIllIIlIllIIlllIlIllIIIlI("client/icons/delete-64.png"));
        this.languageButton = new lIIlIIIllIIlllIlllIlIIlll(6.0F, new IIllIIlIllIIlllIlIllIIIlI("client/icons/globe-24.png"));
        this.IlllIIlllIIIIllIIllllIlIl = (float)lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI());
        String var10004 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI();
        this.IlllIllIlIIIIlIIlIIllIIIl = new llllIIllllllIlIIlIlIIIllI(this, var10004, lIIIllllIIllIIIIIlIIlIIlI.cb.IIIIllIlIIIllIlllIlllllIl().lIIIIlIIllIIlIIlIIIlIIllI(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI(), lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl()));
        this.llIlIIIlIIIIlIlllIlIIIIll();
    }

    private void llIlIIIlIIIIlIlllIlIIIIll() {
        lIIIllIllIllIlllIlIIlIlII var1 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
        ArrayList var2 = new ArrayList();
        String clientToken;
        if (this.IllIIlIIlllllIllIIIlllIII.exists()) {
            try {
                FileReader launcherProfiles = new FileReader(this.IllIIlIIlllllIllIIIlllIII);
                JsonParser parser = new JsonParser();
                JsonElement elements = parser.parse(launcherProfiles);
                Iterator iterator = elements.getAsJsonObject().entrySet().iterator();

                label96:
                while(true) {
                    Entry entry;
                    if (!iterator.hasNext())
                        break label96;
                    entry = (Entry) iterator.next();
                    HashMap var11;
                    label94:
                    for(Iterator var9 = ((JsonElement)entry.getValue()).getAsJsonObject().entrySet().iterator(); var9.hasNext(); var2.add(var11)) {
                        Entry var10 = (Entry)var9.next();
                        var11 = new HashMap();
                        Iterator var12 = ((JsonElement)var10.getValue()).getAsJsonObject().entrySet().iterator();

                        while(true) {
                            while(true) {
                                if (!var12.hasNext()) {
                                    continue label94;
                                }

                                Entry var13 = (Entry)var12.next();
                                if (((String)var13.getKey()).equalsIgnoreCase("minecraftProfile")) {
                                    Iterator var14 = ((JsonElement)var13.getValue()).getAsJsonObject().entrySet().iterator();

                                    while(var14.hasNext()) {
                                        Object o1 = var14.next();
                                        Entry var15 = (Entry)o1;
                                        if (var15.getKey().equals("id")) var11.put("uuid", var15.getValue());
                                        if (var15.getKey().equals("name")) {
                                            var11.put("displayName", var15.getValue());
                                            System.out.println("Saved " + var15.getValue() + " to accounts.");
                                        }
                                        /*Iterator var17 = ((JsonElement)var15.getValue()).getAsJsonObject().entrySet().iterator();


                                        while(var17.hasNext()) {
                                            Object o = var17.next();
                                            Entry var18 = (Entry)o;
                                            if (var18.getValue() != null) {
                                                var11.put("displayName", ((JsonElement)var18.getValue()).getAsString());
                                            }
                                        }*/
                                    }
                                } else if (((String)var13.getKey()).equalsIgnoreCase("username") || ((String)var13.getKey()).equalsIgnoreCase("name") || ((String)var13.getKey()).equalsIgnoreCase("id") || ((String)var13.getKey()).equalsIgnoreCase("accessToken")) {
                                    if (((String)var13.getKey()).equalsIgnoreCase("accessToken")) {
                                        var11.put((String)var13.getKey(), ((JsonElement)var13.getValue()).getAsString());
                                    } else {
                                        var11.put((String)var13.getKey(), ((JsonElement)var13.getValue()).getAsString());
                                    }
                                }
                            }
                        }
                    }
                    while (iterator.hasNext()) {
                        Object o1 = iterator.next();
                        Entry var15 = (Entry)o1;

                        if (var15.getKey().equals("mojangClientToken")) {
                            JsonPrimitive clientTokenPrim = (JsonPrimitive) var15.getValue();
                            this.clientToken = clientTokenPrim.getAsString(); // clientToken
                        }
                    }
                }
            } catch (Exception var20) {
            }
        }

        this.lIlIlIllIIIIIIIIllllIIllI.clear();
        this.IlllIIlllIIIIllIIllllIlIl = (float)lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI());
        Iterator var21 = var2.iterator();

        while(var21.hasNext()) {
            Object aVar2 = var21.next();
            Map var20 = (Map)aVar2;
            JsonPrimitive displayNamePrim = (JsonPrimitive) var20.get("displayName");
            String usernamePrim = (String) var20.get("username");
            String accessTokenPrim = (String) var20.get("accessToken");
            JsonPrimitive uuidTokenPrim = (JsonPrimitive) var20.get("uuid");
            clientToken = displayNamePrim.getAsString();
            IllIIIllIlIIlIllIIIllllIl var22;
            this.lIlIlIllIIIIIIIIllllIIllI.add(var22 = new IllIIIllIlIIlIllIIIllllIl(usernamePrim, this.clientToken, accessTokenPrim, displayNamePrim.getAsString(), uuidTokenPrim.getAsString()));
            float var23 = (float)lIIIllllIIllIIIIIlIIlIIlI.cb.llIlIIIlIIIIlIlllIlIIIIll.lIIIIIIIIIlIllIIllIlIIlIl(var22.IIIIllIlIIIllIlllIlllllIl());
            if (var23 > this.IlllIIlllIIIIllIIllllIlIl) {
                this.IlllIIlllIIIIllIIllllIlIl = var23;
            }

             if (var1 != null && var1.IIIIlIIIlllllllllIlllIlll() != null && var1.IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI() != null && clientToken.equalsIgnoreCase(var1.IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI())) {
                this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var22.IIIIllIlIIIllIlllIlllllIl());
                this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIlIIllIIlIIlIIIlIIllI(var22.IIIIllIlIIIllIlllIlllllIl(), var22.IIIIllIlIIIllIlllIlllllIl()));
                this.lIIlIlIllIIlIIIlIIIlllIII();
            }
        }

    }

    public void a_() {
        super.a_();
        if (this.IlllIllIlIIIIlIIlIIllIIIl != null) {
            this.IlllIllIlIIIIlIIlIIllIIIl.IlllIIIlIlllIllIlIIlllIlI();
        }

    }

    public void IlllIIIlIlllIllIlIIlllIlI() {
        super.IlllIIIlIlllIllIlIIlllIlI();
        ++IIIllIllIlIlllllllIlIlIII;
    }

    public void s_() {
        super.s_();
        this.IIIIllIIllIIIIllIllIIIlIl = new lllIIIlllIIlllIlIlllIlIlI(256, 256);
        this.IlIlIIIlllIIIlIlllIlIllIl = this.lllIIIIIlIllIlIIIllllllII.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI("background", this.IIIIllIIllIIIIllIllIIIlIl);
        this.optionsButton.lIIIIlIIllIIlIIlIIIlIIllI(124.0F, 6.0F, 42.0F, 20.0F);
        this.cosmeticsButton.lIIIIlIIllIIlIIlIIIlIIllI(167.0F, 6.0F, 48.0F, 20.0F);
        this.discordButton.lIIIIlIIllIIlIIlIIIlIIllI(220.0F, 6.0F, 54.0F, 20.0F);
        this.quitButton.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() - 30.0F, 7.0F, 23.0F, 17.0F);
        this.languageButton.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() / 2.0F - 13.0F, this.IIIllIllIlIlllllllIlIlIII() - 17.0F, 26.0F, 18.0F);
        this.lIIlIlIllIIlIIIlIIIlllIII();
    }

    public void lIIlIlIllIIlIIIlIIIlllIII() {
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl() - 35.0F - this.IlllIllIlIIIIlIIlIIllIIIl.IIIIllIIllIIIIllIllIIIlIl(this.IlllIIlllIIIIllIIllllIlIl), 7.0F, this.IlllIllIlIIIIlIIlIIllIIIl.IIIIllIIllIIIIllIllIIIlIl(this.IlllIIlllIIIIllIIllllIlIl), 17.0F);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(int var1, int var2, float var3) {
        GL11.glDisable(3008);
        this.lIIIIIIIIIlIllIIllIlIIlIl(var1, var2, 1.0F);
        GL11.glEnable(3008);
        super.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2) {
        lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, this.IlIlIIIlllIIIlIlllIlIllIl(), this.IIIllIllIlIlllllllIlIlIII(), 1610612735, 805306367);
        lIIIIlIIllIIlIIlIIIlIIllI(0.0F, 0.0F, this.IlIlIIIlllIIIlIlllIlIllIl(), 160.0F, -553648128, 0);
        boolean var3 = var1 < this.optionsButton.IIIIllIlIIIllIlllIlllllIl() && var2 < 30.0F;
        Color var4 = this.IllIlIIIIlllIIllIIlllIIlI.lIIIIIIIIIlIllIIllIlIIlIl(var3);
        this.cheatbreaker.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI("CheatBreaker", 37.0F, 9.0F, var4.getRGB());
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        lIlIIIlllIllllIlllIIIIlll.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIllIlIIIllIlllIlllllIl, 10.0F, 8.0F, 6.0F);
        this.cheatbreaker.IlIlllIIIIllIllllIllIIlIl.lIIIIlIIllIIlIIlIIIlIIllI("CheatBreaker", 36.0F, 8.0F, -1);
        String var5 = "CheatBreaker Dev (" + this.cheatbreaker.IlIlllIIIIllIllllIllIIlIl() + "/" + this.cheatbreaker.llIIlllIIIIlllIllIlIlllIl() + ")";
        this.cheatbreaker.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var5, 5.0D, (double)(this.IIIllIllIlIlllllllIlIlIII() - 14.0F), -1879048193);
        String var6 = "Copyright Mojang AB. Do not distribute!";
        this.cheatbreaker.llIIlllIIIIlllIllIlIlllIl.lIIIIlIIllIIlIIlIIIlIIllI(var6, (double)(this.IlIlIIIlllIIIlIlllIlIllIl() - (float)lIIIllllIIllIIIIIlIIlIIlI.cb.llIIlllIIIIlllIllIlIlllIl.lIIIIIIIIIlIllIIllIlIIlIl(var6) - 5.0F), (double)(this.IIIllIllIlIlllllllIlIlIII() - 14.0F), -1879048193);
        this.quitButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        this.languageButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        this.optionsButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        this.cosmeticsButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
        this.discordButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, true);
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(float var1, float var2, int var3) {
        this.quitButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, true);
        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, true);
        if (this.quitButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            this.lllIIIIIlIllIlIIIllllllII.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lllIIIIIlIllIlIIIllllllII.lIIlIlIllIIlIIIlIIIlllIII();
        } else if (this.optionsButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            this.lllIIIIIlIllIlIIIllllllII.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(new IllIIlIIllIIlIIIIlllIlIlI(this, this.lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl));
        } else if (this.languageButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            this.lllIIIIIlIllIlIIIllllllII.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(new lIlIlllllllIIlIIIIIlllIIl(this, this.lllIIIIIlIllIlIIIllllllII.lIllIllIlIIllIllIlIlIIlIl, this.lllIIIIIlIllIlIIIllllllII.lIlIllIlIlIIIllllIlIllIll()));
        } else if (this.cosmeticsButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            this.lllIIIIIlIllIlIIIllllllII.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
            this.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(new IIIlllIllIlIIllIIllIlIlll());
        } else if (this.discordButton.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2)) {
            try {
                this.openTab(new URL("https://discord.gg/DDNkWbf2d3").toURI());
            } catch (URISyntaxException | MalformedURLException ignored) {}
        } else {
            boolean var4 = var1 < this.optionsButton.IIIIllIlIIIllIlllIlllllIl() && var2 < 30.0F;
            if (var4 && !(this.lllIIIIIlIllIlIIIllllllII.lllIIIIIlIllIlIIIllllllII instanceof IlIlIIIIIllIlIlIIllIlIIIl)) {
                this.lllIIIIIlIllIlIIIllllllII.lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                this.lllIIIIIlIllIlIIIllllllII.lIIIIlIIllIIlIIlIIIlIIllI(new IlIlIIIIIllIlIlIIllIlIIIl());
            }
        }

    }

    public void lIIIIIIIIIlIllIIllIlIIlIl(float var1, float var2, int var3) {
    }

    private void openTab(final URI uri) {
        try {
            final Class<?> var2 = Class.forName("java.awt.Desktop");
            final Object var3 = var2.getMethod("getDesktop", (Class<?>[]) new Class[0]).invoke(null, new Object[0]);
            var2.getMethod("browse", URI.class).invoke(var3, uri);
        } catch (Throwable ignored) {}
    }

    private void lIIIIIIIIIlIllIIllIlIIlIl(int var1, int var2, float var3) {
        this.lllIIIIIlIllIlIIIllllllII.lIIIIIIIIIlIllIIllIlIIlIl().IIIIllIIllIIIIllIllIIIlIl();
        GL11.glViewport(0, 0, 256, 256);
        this.IlllIIIlIlllIllIlIIlllIlI(var1, var2, var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
        this.lllIIIIIlIllIlIIIllllllII.lIIIIIIIIIlIllIIllIlIIlIl().lIIIIlIIllIIlIIlIIIlIIllI(true);
        GL11.glViewport(0, 0, this.lllIIIIIlIllIlIIIllllllII.IIIllIllIlIlllllllIlIlIII, this.lllIIIIIlIllIlIIIllllllII.IllIIIIIIIlIlIllllIIllIII);
        lIllIIlIIIIlIIllllIllllll var4 = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
        var4.lIIIIIIIIIlIllIIllIlIIlIl();
        float var5 = this.lIIIIIllllIIIIlIlIIIIlIlI > this.IIIIIIlIlIlIllllllIlllIlI ? 120.0F / (float)this.lIIIIIllllIIIIlIlIIIIlIlI : 120.0F / (float)this.IIIIIIlIlIlIllllllIlllIlI;
        float var6 = (float)this.IIIIIIlIlIlIllllllIlllIlI * var5 / 256.0F;
        float var7 = (float)this.lIIIIIllllIIIIlIlIIIIlIlI * var5 / 256.0F;
        var4.lIIIIlIIllIIlIIlIIIlIIllI(1.0F, 1.0F, 1.0F, 1.0F);
        float var8 = (float)this.lIIIIIllllIIIIlIlIIIIlIlI;
        float var9 = (float)this.IIIIIIlIlIlIllllllIlllIlI;
        var4.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (double)var9, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.5F - var6), (double)(0.5F + var7));
        var4.lIIIIlIIllIIlIIlIIIlIIllI((double)var8, (double)var9, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.5F - var6), (double)(0.5F - var7));
        var4.lIIIIlIIllIIlIIlIIIlIIllI((double)var8, 0.0D, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.5F + var6), (double)(0.5F - var7));
        var4.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, 0.0D, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.5F + var6), (double)(0.5F + var7));
        var4.lIIIIlIIllIIlIIlIIIlIIllI();
    }

    private void IlllIIIlIlllIllIlIIlllIlI(int var1, int var2, float var3) {
        lIllIIlIIIIlIIllllIllllll var4 = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glDisable(2884);
        GL11.glDepthMask(false);
        IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 771, 1, 0);
        byte var5 = 8;

        for(int var6 = 0; var6 < var5 * var5; ++var6) {
            GL11.glPushMatrix();
            float var7 = ((float)(var6 % var5) / (float)var5 - 0.5F) / 64.0F;
            float var8 = ((float)(var6 / var5) / (float)var5 - 0.5F) / 64.0F;
            float var9 = 0.0F;
            GL11.glTranslatef(var7, var8, var9);
            GL11.glRotatef(lIlIlllIllIlIllIIIlllIlII.lIIIIlIIllIIlIIlIIIlIIllI(((float)IIIllIllIlIlllllllIlIlIII + var3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-((float)IIIllIllIlIlllllllIlIlIII + var3) * 0.39240506F * 0.2548387F, 0.0F, 1.0F, 0.0F);

            for(int var10 = 0; var10 < 6; ++var10) {
                GL11.glPushMatrix();
                if (var10 == 1) {
                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                }

                if (var10 == 2) {
                    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                }

                if (var10 == 3) {
                    GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
                }

                if (var10 == 4) {
                    GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                }

                if (var10 == 5) {
                    GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                }

                this.lllIIIIIlIllIlIIIllllllII.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(this.IllIlIlIllllIlIIllllIIlll[var10]);
                var4.lIIIIIIIIIlIllIIllIlIIlIl();
                var4.lIIIIlIIllIIlIIlIIIlIIllI(16777215, 255 / (var6 + 1));
                float var11 = 0.0F;
                var4.lIIIIlIIllIIlIIlIIIlIIllI(-1.0D, -1.0D, 1.0D, (double)(0.0F + var11), (double)(0.0F + var11));
                var4.lIIIIlIIllIIlIIlIIIlIIllI(1.0D, -1.0D, 1.0D, (double)(1.0F - var11), (double)(0.0F + var11));
                var4.lIIIIlIIllIIlIIlIIIlIIllI(1.0D, 1.0D, 1.0D, (double)(1.0F - var11), (double)(1.0F - var11));
                var4.lIIIIlIIllIIlIIlIIIlIIllI(-1.0D, 1.0D, 1.0D, (double)(0.0F + var11), (double)(1.0F - var11));
                var4.lIIIIlIIllIIlIIlIIIlIIllI();
                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, false);
        }

        var4.lIIIIIIIIIlIllIIllIlIIlIl(0.0D, 0.0D, 0.0D);
        GL11.glColorMask(true, true, true, true);
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glEnable(2884);
        GL11.glEnable(2929);
    }

    private void lIIIIlIIllIIlIIlIIIlIIllI(float var1) {
        this.lllIIIIIlIllIlIIIllllllII.llIlIlIllIlIIlIlllIllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlIIIlllIIIlIlllIlIllIl);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
        GL11.glEnable(3042);
        IIlIlIIIlIllIlllllllIlllI.IlllIIIlIlllIllIlIIlllIlI(770, 771, 1, 0);
        GL11.glColorMask(true, true, true, false);
        lIllIIlIIIIlIIllllIllllll var2 = lIllIIlIIIIlIIllllIllllll.IIIIllIIllIIIIllIllIIIlIl;
        var2.lIIIIIIIIIlIllIIllIlIIlIl();
        GL11.glDisable(3008);
        byte var3 = 3;

        for(int var4 = 0; var4 < var3; ++var4) {
            var2.lIIIIlIIllIIlIIlIIIlIIllI(1.0F, 1.0F, 1.0F, 1.0F / (float)(var4 + 1));
            float var5 = (float)this.lIIIIIllllIIIIlIlIIIIlIlI;
            float var6 = (float)this.IIIIIIlIlIlIllllllIlllIlI;
            float var7 = (float)(var4 - var3 / 2) / 256.0F;
            var2.lIIIIlIIllIIlIIlIIIlIIllI((double)var5, (double)var6, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.0F + var7), 1.0D);
            var2.lIIIIlIIllIIlIIlIIIlIIllI((double)var5, 0.0D, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(1.0F + var7), 1.0D);
            var2.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, 0.0D, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(1.0F + var7), 0.0D);
            var2.lIIIIlIIllIIlIIlIIIlIIllI(0.0D, (double)var6, (double)llIlIIIlIIIIlIlllIlIIIIll, (double)(0.0F + var7), 0.0D);
        }

        var2.lIIIIlIIllIIlIIlIIIlIIllI();
        GL11.glEnable(3008);
        GL11.glColorMask(true, true, true, true);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(String var1) {
        try {
            IllIIIllIlIIlIllIIIllllIl var2 = null;
            Iterator var3 = this.lIlIlIllIIIIIIIIllllIIllI.iterator();

            while(var3.hasNext()) {
                Object aLIlIlIllIIIIIIIIllllIIllI = var3.next();
                IllIIIllIlIIlIllIIIllllIl var4 = (IllIIIllIlIIlIllIIIllllIl)aLIlIlIllIIIIIIIIllllIIllI;
                if (var4.IIIIllIlIIIllIlllIlllllIl().equals(var1)) {
                    var2 = var4;
                }
            }

            if (var2 != null) {
                if (var2.IIIIllIIllIIIIllIllIIIlIl().equalsIgnoreCase(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
                    return;
                }

                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIlIIllIIlIIlIIIlIIllI(lllIlIIIIllIIIlIlIllllIll.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIlIllIIlllIlIllIIIlI("gui.button.press"), 1.0F));
                var3 = lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIlIIllIIlIIlIIIlIIllI.iterator();

                while(var3.hasNext()) {
                    lIIIlIIIIlIlIlllIIIllIlII session = (lIIIlIIIIlIlIlllIIIllIlII)var3.next();
                    if (session.IIIIllIIllIIIIllIllIIIlIl().getId().toString().replaceAll("-", "").equalsIgnoreCase(var2.IIIIllIIllIIIIllIllIIIlIl().replaceAll("-", ""))) {
                        lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(session);
                        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIIllIlIIIllIlllIlllllIl());
                        this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var2.IlIlIIIlllIIIlIlllIlIllIl());
                        this.lIIlIlIllIIlIIIlIIIlllIII();
                        return;
                    }
                }

                YggdrasilAuthenticationService var26 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, this.clientToken);
                YggdrasilUserAuthentication var28 = (YggdrasilUserAuthentication)var26.createUserAuthentication(Agent.MINECRAFT);
                HashMap var5 = new HashMap();
                var5.put("uuid", var2.IIIIllIIllIIIIllIllIIIlIl());
                var5.put("displayName", var2.IIIIllIlIIIllIlllIlllllIl());
                var5.put("username", var2.lIIIIIIIIIlIllIIllIlIIlIl());
                var5.put("accessToken", var2.IlllIIIlIlllIllIlIIlllIlI());
                var28.loadFromStorage(var5);

                lIIIlIIIIlIlIlllIIIllIlII session;
                try {
                    var28.logIn();
                    session = new lIIIlIIIIlIlIlllIIIllIlII(var28.getSelectedProfile().getName(), var28.getSelectedProfile().getId().toString(), var28.getAuthenticatedToken(), "mojang");
                } catch (AuthenticationException var22) {
                    var22.printStackTrace();
                    return;
                }

                System.out.println("Updated accessToken and logged user in.");
                this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var2.IIIIllIlIIIllIlllIlllllIl());
                this.IlllIllIlIIIIlIIlIIllIIIl.lIIIIlIIllIIlIIlIIIlIIllI(var2.IlIlIIIlllIIIlIlllIlIllIl());
                this.lIIlIlIllIIlIIIlIIIlllIII();
                lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIlIIllIIlIIlIIIlIIllI.add(session);
                lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIIlIIllIIlIIlIIIlIIllI(session);
                lIIIllllIIllIIIIIlIIlIIlI.cb.lIllIllIlIIllIllIlIlIIlIl().IlllIIIlIlllIllIlIIlllIlI();
            }
        } catch (Exception var24) {
            var24.printStackTrace();
        }

    }

    public List IIIlllIIIllIllIlIIIIIIlII() {
        return this.lIlIlIllIIIIIIIIllllIIllI;
    }
}
