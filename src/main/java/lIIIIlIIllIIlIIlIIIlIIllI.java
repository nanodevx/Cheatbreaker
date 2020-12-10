import com.cheatbreaker.client.network.messages.Message;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.RichPresence.Builder;
import com.offlinecheatbreaker.client.data.FriendTypingData;
import net.minecraft.client.main.Main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.Mixer.Info;

// Client Class
@SuppressWarnings({"rawtypes", "unused", "unchecked"})
public class lIIIIlIIllIIlIIlIIIlIIllI {
	private String helloPersonDecompilingOfflineCheatBreaker_dot_com;
	private String dontDoPls;
   private List IIIIIIlIlIlIllllllIlllIlI = new ArrayList();
   public List lIIIIlIIllIIlIIlIIIlIIllI = new ArrayList();
   public List<IlIIlIIlIIlllIlIIIlIllIIl> lIIIIIIIIIlIllIIllIlIIlIl = new ArrayList();
   public List IlllIIIlIlllIllIlIIlllIlI = new ArrayList();
   public IlIIlIIlIIlllIlIIIlIllIIl IIIIllIlIIIllIlllIlllllIl;
   private static lIIIIlIIllIIlIIlIIIlIIllI IllIllIIIlIIlllIIIllIllII;
   public lllIlIllIlIlllllllIIIIllI IIIIllIIllIIIIllIllIIIlIl;
   private static String llIlIIIllIIIIlllIlIIIIIlI = "?";
   private static String lIllIlIlllIIlIIllIIlIIlII = "?";
   private static String IIIlIIlIlIIIlllIIlIllllll = "?";
   public static double reach;
   public static long lastHit;
   private boolean IllIlIIIIlllIIllIIlllIIlI;
   private boolean IllIlIlIllllIlIIllllIIlll = true;
   private List IllIIlIIlllllIllIIIlllIII = new ArrayList();
   private lIIlllIIlllIlIllIIlIIIIll lIlIlIllIIIIIIIIllllIIllI;
   private List<IlIlIIIlllIIIlIlllIlIllIl> IlllIIlllIIIIllIIllllIlIl;
   private List<IlIlIIIlllIIIlIlllIlIllIl> IllllIllllIlIIIlIIIllllll;
   private llllIIllIIlIIllIIIllIlIlI IlIIlIIIIlIIIIllllIIlIllI;
   private IIIIllIlIlIIIlIlIIllllllI lIIlIIllIIIIIlIllIIIIllII;
   private IIlIIllIlllIllllIlIllllII lIIlllIIlIlllllllllIIIIIl;
   private lIIlIlIllIIlIIIlIIIlllIII lIllIllIlIIllIllIlIlIIlIl;
   private final IllIIlIIIllllIIIIllIlIlIl IllIIlllIllIlIllIlIIIIIII;
   private final IllIIIIIIIlIlIllllIIllIII IlIlIIIlllllIIIlIlIlIllII;
   private final long IIlIIllIIIllllIIlllIllIIl;
   private final IIIIIlIIIlllIIlIIllllIlll lllIlIIllllIIIIlIllIlIIII;
   private final IlIIIIlIlIllIIlIIIIllllll lIIIIlllIIlIlllllIlIllIII;
   private static List lIIIlllIlIlllIIIIIIIIIlII = new ArrayList();
   public static long IlIlIIIlllIIIlIlllIlIllIl;
   private IPCClient IIIIlIIIlllllllllIlllIlll;
   public String IlIllllIIIlIllllIIIIIllII; // private -> public Server Address Module.
   private lIlIlIllIlIlIIIIllIlllIll IlIIIIllIIIIIlllIIlIIlllI;
   public lIlIllIlIlIIIllllIlIllIll IIIllIllIlIlllllllIlIlIII;
   public lIlIllIlIlIIIllllIlIllIll IllIIIIIIIlIlIllllIIllIII;
   public lIlIllIlIlIIIllllIlIllIll lIIIIllIIlIlIllIIIlIllIlI;
   public lIlIllIlIlIIIllllIlIllIll IlllIllIlIIIIlIIlIIllIIIl;
   public lIlIllIlIlIIIllllIlIllIll IlIlllIIIIllIllllIllIIlIl;
   public lIlIllIlIlIIIllllIlIllIll llIIlllIIIIlllIllIlIlllIl;
   public lIlIllIlIlIIIllllIlIllIll lIIlIlIllIIlIIIlIIIlllIII;
   public lIlIllIlIlIIIllllIlIllIll IIIlllIIIllIllIlIIIIIIlII;
   public lIlIllIlIlIIIllllIlIllIll llIlIIIlIIIIlIlllIlIIIIll;
   public lIlIllIlIlIIIllllIlIllIll IIIlIIllllIIllllllIlIIIll;
   public lIlIllIlIlIIIllllIlIllIll lllIIIIIlIllIlIIIllllllII;
   private static final IIllIIlIllIIlllIlIllIIIlI llIlIlIllIlIIlIlllIllIIlI = new IIllIIlIllIIlllIlIllIIIlI("client/font/Play-Bold.ttf");
   private static final IIllIIlIllIIlllIlIllIIIlI llIlIlIlllIlllllIIIllIIll = new IIllIIlIllIIlllIlIllIIIlI("client/font/Roboto-Regular.ttf");
   private static final IIllIIlIllIIlllIlIllIIIlI IIllIlIllIlIllIIlIllIlIII = new IIllIIlIllIIlllIlIllIIIlI("client/font/Roboto-Bold.ttf");
   private final IIllIIlIllIIlllIlIllIIIlI lIlIllIlIlIIIllllIlIllIll;
   private static final IIllIIlIllIIlllIlIllIIIlI IlIIlIIlIllIIIIllIIllIlIl = new IIllIIlIllIIlllIlIllIIIlI("client/font/Ubuntu-M.ttf");
   private final Map llllIIIIlIlIllIIIllllIIll;
   public static byte[] lIIIIIllllIIIIlIlIIIIlIlI = new byte[]{86, 79, 84, 69, 32, 84, 82, 85, 77, 80, 32, 50, 48, 50, 48, 33};
   public static AudioFormat universalAudioFormat;
   private final List<String> playersTypingToUser = new ArrayList<>();
   private final List<FriendTypingData> friendsTypingInComingData = new ArrayList<>();
   private final List<FriendTypingData> friendsOutGoingData = new ArrayList<>();
   private int nextReconnectTime;

   public String lIIIIlIIllIIlIIlIIIlIIllI() {
      return "CB-Client";
   }

   public String lIIIIIIIIIlIllIIllIlIIlIl() {
      return "CB-Binary";
   }

   public lIIIIlIIllIIlIIlIIIlIIllI() {
      this.IlIIIIllIIIIIlllIIlIIlllI = lIlIlIllIlIlIIIIllIlllIll.lIIIIlIIllIIlIIlIIIlIIllI;
      this.lIlIllIlIlIIIllllIlIllIll = new IIllIIlIllIIlllIlIllIIIlI("client/font/Play-Regular.ttf");
      this.llllIIIIlIlIllIIIllllIIll = new HashMap();
      this.IIlIIllIIIllllIIlllIllIIl = System.currentTimeMillis();
      System.out.println("[CB] Starting CheatBreaker setup");
      Info[] mixers = AudioSystem.getMixerInfo();
      Info[] var2 = mixers;
      int var3 = mixers.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Info info = var2[var4];
         Mixer mixer = AudioSystem.getMixer(info);

         try {
            javax.sound.sampled.DataLine.Info tdlLineInfo = new javax.sound.sampled.DataLine.Info(TargetDataLine.class, universalAudioFormat);
            TargetDataLine tdl = (TargetDataLine) mixer.getLine(tdlLineInfo);
            if (info != null) {
               Message.g(new String[]{info.getDescription()}, new String[]{info.getName()});
            }
         } catch (Exception ignored) { }
      }

      this.lllIlIIllllIIIIlIllIlIIII();
      System.out.println("\n[CB] Created default configuration presets");
      IllIllIIIlIIlllIIIllIllII = this;
      lIIIllllIIllIIIIIlIIlIIlI.cb = this;
      this.lIIlIIllIIIIIlIllIIIIllII = new IIIIllIlIlIIIlIlIIllllllI();
      System.out.println("[CB] Created settings");
      this.lIllIllIlIIllIllIlIlIIlIl = new lIIlIlIllIIlIIIlIIIlllIII();
      System.out.println("[CB] Created EventBus");
      this.IlIIlIIIIlIIIIllllIIlIllI = new llllIIllIIlIIllIIIllIlIlI(this.lIllIllIlIIllIllIlIlIIlIl);
      System.out.println("[CB] Created Mod Manager");
      this.lIIlllIIlIlllllllllIIIIIl = new IIlIIllIlllIllllIlIllllII();
      System.out.println("[CB] Created Network Manager");
      this.IlIlIIIlllllIIIlIlIlIllII = new IllIIIIIIIlIlIllllIIllIII();
      System.out.println("[CB] Created Dash Manager");
      this.IllIIlllIllIlIllIlIIIIIII = new IllIIlIIIllllIIIIllIlIlIl();
      this.lllIlIIllllIIIIlIllIlIIII = new IIIIIlIIIlllIIlIIllllIlll();
      this.lIIIIlllIIlIlllllIlIllIII = new IlIIIIlIlIllIIlIIIIllllll();
      System.out.println("[CB] Created Friend Manager");
      lIIlIlIllIIlIIIlIIIlllIII eventBus = this.lIllIllIlIIllIllIlIlIIlIl;
      IIlIIllIlllIllllIlIllllII networkManager = this.lIIlllIIlIlllllllllIIIIIl;
      eventBus.lIIIIlIIllIIlIIlIIIlIIllI(lIIIIIllllIIIIlIlIIIIlIlI.class, (obj) -> networkManager.lIIIIlIIllIIlIIlIIIlIIllI((lIIIIIllllIIIIlIlIIIIlIlI)obj));
      eventBus.lIIIIlIIllIIlIIlIIIlIIllI(lllIIIIIlIllIlIIIllllllII.class, (obj) -> networkManager.lIIIIlIIllIIlIIlIIIlIIllI((lllIIIIIlIllIlIIIllllllII)obj));
      eventBus.lIIIIlIIllIIlIIlIIIlIIllI(lIIlIIllIIIIIlIllIIIIllII.class, (obj) -> networkManager.lIIIIlIIllIIlIIlIIIlIIllI((lIIlIIllIIIIIlIllIIIIllII)obj));
      IIIIIlIIIlllIIlIIllllIlll etc = this.lllIlIIllllIIIIlIllIlIIII;
      eventBus.lIIIIlIIllIIlIIlIIIlIIllI(lIllIllIlIIllIllIlIlIIlIl.class, (obj) -> etc.lIIIIlIIllIIlIIlIIIlIIllI((lIllIllIlIIllIllIlIlIIlIl)obj));
      eventBus.lIIIIlIIllIIlIIlIIIlIIllI(IllIlIlIllllIlIIllllIIlll.class, (obj) -> etc.lIIIIlIIllIIlIIlIIIlIIllI((IllIlIlIllllIlIIllllIIlll)obj));
      System.out.println("[CB] Registered network events");
   }

   public void IlllIIIlIlllIllIlIIlllIlI() {
      this.lIIIlllIlIlllIIIIIIIIIlII();
      System.out.println("[CB] Loaded all fonts");
      this.lIIIIlllIIlIlllllIlIllIII();
      System.out.println("[CB] Loaded " + this.lIIIIIIIIIlIllIIllIlIIlIl.size() + " custom profiles");
      this.IlIlIIIlllllIIIlIlIlIllII();
      System.out.println("[CB] Loaded client properties");
      this.IIlIIllIIIllllIIlllIllIIl();
      System.out.println("[CB] Loaded mojang session status entries");
      this.IIIIllIIllIIIIllIllIIIlIl = new lllIlIllIlIlllllllIIIIllI();
      this.IIIIllIIllIIIIllIllIIIlIl.lIIIIIIIIIlIllIIllIlIIlIl();
      System.out.println("[CB] Loaded configuration");
      System.out.println("[CB] Loaded Overlay Gui");
      IlllllIllIIIllIIIllIllIII.lIIIIlIIllIIlIIlIIIlIIllI(new IlllllIllIIIllIIIllIllIII());

      try {
         System.out.println("[CB] Connecting to player assets server");
         this.IllIIIIIIIlIlIllllIIllIII();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
      lllIIlIlIllIIlIllIIIIIlII sessionPinger = new lllIIlIlIllIIlIllIIIIIlII();
      scheduler.scheduleAtFixedRate(sessionPinger, 0L, this.lIIlIIllIIIIIlIllIIIIllII.lIIlIlIllIIlIIIlIIIlllIII, TimeUnit.SECONDS);
      System.out.println("[CB] Scheduled session server status updates");
      this.IlllIIlllIIIIllIIllllIlIl = new ArrayList();
      this.IllllIllllIlIIIlIIIllllll = new ArrayList();
      this.IIIIllIIllIIIIllIllIIIlIl().IllIIIIIIIlIlIllllIIllIII.lIIIIlIIllIIlIIlIIIlIIllI();
      System.out.println("[CB] Finished startup in " + (System.currentTimeMillis() - this.IIlIIllIIIllllIIlllIllIIl) + "ms!");
      lIIIllllIIllIIIIIlIIlIIlI.cb = this;
      (new Thread(() -> {
         try {
            while(true) {
               try {
                  if (this.lIlIlIllIIIIIIIIllllIIllI != null) {
                     this.lIlIlIllIIIIIIIIllllIIllI.lIIIIlIIllIIlIIlIIIlIIllI(new lIIllIlllIIlllIllIIlllllI());
                  }
               } catch (Exception ignored) { }
               this.nextReconnectTime = 30;
               Thread.sleep(30000L);
            }
         } catch (InterruptedException ignored) { }
      })).start();

      (new Thread(() -> {
         try {
            while(this.nextReconnectTime != -1) { // we should never get -1...
               this.nextReconnectTime--;
               Thread.sleep(1000L);
            }
         } catch (InterruptedException ex) {}
      })).start();
      String os = System.getProperty("os.name").toLowerCase();
      if (os.contains("win")) {
         this.connectDiscordIPC();
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(String server) {
      if (this.IlIllllIIIlIllllIIIIIllII.toLowerCase().endsWith("goldenpvp.net")) {
         this.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIlIIIlllllllllIlllIlll, server, this.IlIllllIIIlIllllIIIIIllII, "cb_goldenpvpnetwork", "GoldenPvP Network");
      } else if (this.IlIllllIIIlIllllIIIIIllII.toLowerCase().endsWith("goldenpvpnetwork.net")) {
         this.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIlIIIlllllllllIlllIlll, server, this.IlIllllIIIlIllllIIIIIllII, "cb_goldenpvpnetwork", "GoldenPvP Network");
      } else {
         this.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIIlIIIlllllllllIlllIlll, server, this.IlIllllIIIlIllllIIIIIllII, "cb_small", "CheatBreaker");
      }

   }

   public void connectDiscordIPC() {
      try {
         this.IIIIlIIIlllllllllIlllIlll = new IPCClient(642785476436164628L);
         this.IIIIlIIIlllllllllIlllIlll.setListener(new lIIIIlIIllIIlIIlIIIlIIllI.ClientListener(this));
         this.IIIIlIIIlllllllllIlllIlll.connect();
      } catch (Exception ignored) { }
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(IPCClient client, String state, String server, String largeImage, String serverName) {
      try {
         if (client != null) {
            boolean menus = server == null || server.equals("");
            String details = !menus ? "Playing " + serverName : "In Menus";
            Builder var8 = new Builder();
            var8.setState(state).setDetails(details).setStartTimestamp(OffsetDateTime.now()).setLargeImage(largeImage, serverName).setSmallImage("cb_small", "CheatBreaker");
            client.sendRichPresence(var8.build());
         }
      } catch (Exception var9) {
      }

   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(String server, String ip, int port) {
      try {
         this.IlIllllIIIlIllllIIIIIllII = server;
         this.lIIIIlIIllIIlIIlIIIlIIllI(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI());
      } catch (UnsatisfiedLinkError | Exception var5) {
      }

      if (!server.equals(ip + ":" + port)) {
         this.lIlIlIllIIIIIIIIllllIIllI.lIIIIIIIIIlIllIIllIlIIlIl(server);
      } else {
         this.lIlIlIllIIIIIIIIllllIIllI.lIIIIIIIIIlIllIIllIlIIlIl("server");
      }

   }

   public static lIIIIlIIllIIlIIlIIIlIIllI IIIIllIlIIIllIlllIlllllIl() {
      return IllIllIIIlIIlllIIIllIllII;
   }

   public llllIIllIIlIIllIIIllIlIlI IIIIllIIllIIIIllIllIIIlIl() {
      return this.IlIIlIIIIlIIIIllllIIlIllI;
   }

   public IIIIllIlIlIIIlIlIIllllllI IlIlIIIlllIIIlIlllIlIllIl() {
      return this.lIIlIIllIIIIIlIllIIIIllII;
   }

   public String IIIllIllIlIlllllllIlIlIII() {
      String status;
      switch(this.IlIIIIllIIIIIlllIIlIIlllI.ordinal()) {
      case 1:
         status = "Away";
         break;
      case 2:
         status = "Busy";
         break;
      case 3:
         status = "Hidden";
         break;
      case 4:
      default:
         status = "Online";
      }

      return status;
   }

   public void IllIIIIIIIlIlIllllIIllIII() throws URISyntaxException {
      lIIIllIllIllIlllIlIIlIlII mc = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
      HashMap data = new HashMap();
      data.put("username", mc.IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI());
      data.put("playerId", mc.IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl());
      data.put("version", "1.7.10");
      data.put("gitCommit", IIIlIIlIlIIIlllIIlIllllll);
      data.put("authentication", "shon put key here lol");
      if (this.IlIllllIIIlIllllIIIIIllII != null) {
         data.put("server", this.IlIllllIIIlIllllIIIIIllII);
      }

      // TODO: dev only
      String[] address = new String[] {"ws://assets.offlinecheatbreaker.com", "ws://localhost:83"};

      this.lIlIlIllIIIIIIIIllllIIllI = new lIIlllIIlllIlIllIIlIIIIll(new URI(address[0]), data);
      this.lIlIlIllIIIIIIIIllllIIllI.IllIllIIIlIIlllIIIllIllII();
   }

   private void IlIlIIIlllllIIIlIlIlIllII() {
      try {
         IIllIIlIllIIlllIlIllIIIlI var1 = new IIllIIlIllIIlllIlIllIIIlI("client/properties/app.properties");
         Properties var2 = new Properties();
         InputStream var3 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIlIlllIlllllIIIllIIll().lIIIIlIIllIIlIIlIIIlIIllI(var1).lIIIIlIIllIIlIIlIIIlIIllI();
         if (var3 == null) {
            return;
         }

         var2.load(var3);
         var3.close();
         llIlIIIllIIIIlllIlIIIIIlI = var2.getProperty("git.commit.id.abbrev");
         IIIlIIlIlIIIlllIIlIllllll = var2.getProperty("git.commit.id");
         lIllIlIlllIIlIIllIIlIIlII = var2.getProperty("git.branch");
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   private void IIlIIllIIIllllIIlllIllIIl() {
      this.IlllIIIlIlllIllIlIIlllIlI.add(new IlIIIlIIllIIIIllllIlIlIlI("Session", "sessionserver.mojang.com"));
      this.IlllIIIlIlllIllIlIIlllIlI.add(new IlIIIlIIllIIIIllllIlIlIlI("Login", "authserver.mojang.com"));
   }

   private void lllIlIIllllIIIIlIllIlIIII() {
      File profiles = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles");
      if (profiles.exists() || profiles.mkdirs()) {
         Iterator var2 = this.IIIIIIlIlIlIllllllIlllIlI.iterator();

         while(var2.hasNext()) {
            IIllIIlIllIIlllIlIllIIIlI var3 = (IIllIIlIllIIlllIlIllIIIlI)var2.next();
            String var4 = var3.lIIIIlIIllIIlIIlIIIlIIllI().replaceAll("([a-zA-Z0-9/]+)/", "");
            File var5 = new File(profiles, var4);
            if (!var5.exists()) {
               try {
                  InputStream var6 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().llIlIlIlllIlllllIIIllIIll().lIIIIlIIllIIlIIlIIIlIIllI(var3).lIIIIlIIllIIlIIlIIIlIIllI();
                  Files.copy(var6, var5.toPath(), new CopyOption[0]);
                  var6.close();
               } catch (IOException var7) {
                  var7.printStackTrace();
               }
            }
         }
      }

   }

   public IIlIIllIlllIllllIlIllllII lIIIIllIIlIlIllIIIlIllIlI() {
      return this.lIIlllIIlIlllllllllIIIIIl;
   }

   public static float IlllIllIlIIIIlIIlIIllIIIl() {
      switch(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIllIlIIllIllIlIlIIlIl.IIlIIlIlIlIlllIIlIIlIIlII) {
      case 0:
         return 2.0F;
      case 1:
         return 0.5F;
      case 2:
         return 1.0F;
      case 3:
         return 1.5F;
      default:
         return 1.0F;
      }
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(String var1) {
      this.lIIIIlIIllIIlIIlIIIlIIllI(var1, 1.0F);
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(String var1, float var2) {
      if (!(Boolean)this.lIIlIIllIIIIIlIllIIIIllII.IllIllIIIlIIlllIIIllIllII.IIIIllIlIIIllIlllIlllllIl()) {
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIIIlllIIIlIIIIIlIIIIIIII().lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2);
      }

   }

   private void lIIIIlllIIlIlllllIlIllIII() {
      this.lIIIIIIIIIlIllIIllIlIIlIl.add(new IlIIlIIlIIlllIlIIIlIllIIl("default", true));
      File var1 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client" + File.separator + "profiles");
      if (var1.exists()) {
         File[] var2 = var1.listFiles();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            File var5 = var2[var4];
            if (var5.getName().endsWith(".cfg")) {
               this.lIIIIIIIIIlIllIIllIlIIlIl.add(new IlIIlIIlIIlllIlIIIlIllIIl(var5.getName().replace(".cfg", ""), false));
            }
         }
      }

   }

   private void lIIIlllIlIlllIIIIIIIIIlII() {
      this.IIIllIllIlIlllllllIlIlIII = new lIlIllIlIlIIIllllIlIllIll(llIlIlIllIlIIlIlllIllIIlI, 22.0F);
      this.IllIIIIIIIlIlIllllIIllIII = new lIlIllIlIlIIIllllIlIllIll(this.lIlIllIlIlIIIllllIlIllIll, 22.0F);
      this.llIIlllIIIIlllIllIlIlllIl = new lIlIllIlIlIIIllllIlIllIll(this.lIlIllIlIlIIIllllIlIllIll, 18.0F);
      this.lIIlIlIllIIlIIIlIIIlllIII = new lIlIllIlIlIIIllllIlIllIll(this.lIlIllIlIlIIIllllIlIllIll, 14.0F);
      this.lllIIIIIlIllIlIIIllllllII = new lIlIllIlIlIIIllllIlIllIll(this.lIlIllIlIlIIIllllIlIllIll, 12.0F);
      this.IIIlllIIIllIllIlIIIIIIlII = new lIlIllIlIlIIIllllIlIllIll(this.lIlIllIlIlIIIllllIlIllIll, 16.0F);
      this.IlllIllIlIIIIlIIlIIllIIIl = new lIlIllIlIlIIIllllIlIllIll(llIlIlIllIlIIlIlllIllIIlI, 18.0F);
      this.lIIIIllIIlIlIllIIIlIllIlI = new lIlIllIlIlIIIllllIlIllIll(IlIIlIIlIllIIIIllIIllIlIl, 16.0F);
      this.llIlIIIlIIIIlIlllIlIIIIll = new lIlIllIlIlIIIllllIlIllIll(llIlIlIlllIlllllIIIllIIll, 13.0F);
      this.IIIlIIllllIIllllllIlIIIll = new lIlIllIlIlIIIllllIlIllIll(IIllIlIllIlIllIIlIllIlIII, 14.0F);
      this.IlIlllIIIIllIllllIllIIlIl = new lIlIllIlIlIIIllllIlIllIll(llIlIlIlllIlllllIIIllIIll, 24.0F);
   }

   public static String IlIlllIIIIllIllllIllIIlIl() {
      return llIlIIIllIIIIlllIlIIIIIlI;
   }

   public static String llIIlllIIIIlllIllIlIlllIl() {
      return lIllIlIlllIIlIIllIIlIIlII;
   }

   public static String lIIlIlIllIIlIIIlIIIlllIII() {
      return IIIlIIlIlIIIlllIIlIllllll;
   }

   public int getNextReconnectTime() {
      return nextReconnectTime;
   }

   public void setNextReconnectTime(int nextReconnectTime) {
      this.nextReconnectTime = nextReconnectTime;
   }

   private String IIIIllIIllIIIIllIllIIIlIl(String var1) {
      File var2 = new File(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().lIllIlIlllIIlIIllIIlIIlII + File.separator + "config" + File.separator + "client");
      File var3 = new File(var2 + File.separator + "profiles");
      if (var3.exists() || var3.mkdirs()) {
         File var4 = new File(var3 + File.separator + var1 + ".cfg");
         if (var4.exists()) {
            return this.IIIIllIIllIIIIllIllIIIlIl(var1 + "1");
         }
      }

      return var1;
   }

   public void IIIlllIIIllIllIlIIIIIIlII() {
      if (this.IIIIllIlIIIllIlllIlllllIl == this.lIIIIIIIIIlIllIIllIlIIlIl.get(0)) {
         IlIIlIIlIIlllIlIIIlIllIIl defaultProfile = new IlIIlIIlIIlllIlIIIlIllIIl(this.IIIIllIIllIIIIllIllIIIlIl("Profile 1"), false);
         IIIIllIlIIIllIlllIlllllIl().IIIIllIlIIIllIlllIlllllIl = defaultProfile;
         IIIIllIlIIIllIlllIlllllIl().lIIIIIIIIIlIllIIllIlIIlIl.add(defaultProfile);
         IIIIllIlIIIllIlllIlllllIl().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI();
         lIIIllIllIllIlllIlIIlIlII var2 = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI();
         if (var2.lllIIIIIlIllIlIIIllllllII instanceof lIIlIlIIlIlIlIIlIlIlllIIl) {
            IIlIlIlllIllIIlIllIIlIIlI var3 = (IIlIlIlllIllIIlIllIIlIIlI)((lIIlIlIIlIlIlIIlIlIlllIIl)var2.lllIIIIIlIllIlIIIllllllII).IlIlIIIlllIIIlIlllIlIllIl;
            var3.lIIIIIIIIIlIllIIllIlIIlIl();
         }
      }

   }

   public boolean llIlIIIlIIIIlIlllIlIIIIll() {
      Iterator var1 = this.IIIIllIIllIIIIllIllIIIlIl().lIIIIIIIIIlIllIIllIlIIlIl.iterator();
      if (!var1.hasNext()) {
         return false;
      } else {
         for(IlIIIIlllIIIlIIllllIIIlll var2 = (IlIIIIlllIIIlIIllllIIIlll)var1.next(); !var2.IIIIllIIllIIIIllIllIIIlIl(); var2 = (IlIIIIlllIIIlIIllllIIIlll)var1.next()) {
            if (!var1.hasNext()) {
               return false;
            }
         }

         return true;
      }
   }

   public List IIIlIIllllIIllllllIlIIIll() {
      List var1 = new ArrayList();
      Iterator var2 = this.IlllIIlllIIIIllIIllllIlIl.iterator();

      IlIlIIIlllIIIlIlllIlIllIl var3;
      while(var2.hasNext()) {
         var3 = (IlIlIIIlllIIIlIlllIlIllIl)var2.next();
         if (var3.IIIIllIlIIIllIlllIlllllIl().equals(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
            var1.add(var3);
         }
      }

      var2 = this.IllllIllllIlIIIlIIIllllll.iterator();

      while(var2.hasNext()) {
         var3 = (IlIlIIIlllIIIlIlllIlIllIl)var2.next();
         if (var3.IIIIllIlIIIllIlllIlllllIl().equals(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl())) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public void IlllIIIlIlllIllIlIIlllIlI(String uuid) {
      this.IllllIllllIlIIIlIIIllllll.removeIf((cape) -> {
         return cape.IIIIllIlIIIllIlllIlllllIl().equals(uuid);
      });
      this.IlllIIlllIIIIllIIllllIlIl.removeIf((wings) -> {
         return wings.IIIIllIlIIIllIlllIlllllIl().equals(uuid);
      });
   }

   public List<IlIlIIIlllIIIlIlllIlIllIl> lllIIIIIlIllIlIIIllllllII() {
      return this.IlllIIlllIIIIllIIllllIlIl;
   }

   public List<IlIlIIIlllIIIlIlllIlIllIl> lIIIIIllllIIIIlIlIIIIlIlI() {
      return this.IllllIllllIlIIIlIIIllllll;
   }

   public IlIlIIIlllIIIlIlllIlIllIl lIIIIlIIllIIlIIlIIIlIIllI(UUID uuid) {
      Iterator capes = this.IllllIllllIlIIIlIIIllllll.iterator();
      if (!capes.hasNext()) {
         return null;
      } else {
         IlIlIIIlllIIIlIlllIlIllIl cape;
         for(cape = (IlIlIIIlllIIIlIlllIlIllIl)capes.next(); !cape.IlIlIIIlllIIIlIlllIlIllIl() || !uuid.toString().equals(cape.IIIIllIlIIIllIlllIlllllIl()); cape = (IlIlIIIlllIIIlIlllIlIllIl)capes.next()) {
            if (!capes.hasNext()) {
               return null;
            }
         }

         return cape;
      }
   }

   public IlIlIIIlllIIIlIlllIlIllIl lIIIIIIIIIlIllIIllIlIIlIl(UUID uuid) {
      Iterator wings = this.IlllIIlllIIIIllIIllllIlIl.iterator();
      if (!wings.hasNext()) {
         return null;
      } else {
         IlIlIIIlllIIIlIlllIlIllIl activeWings;
         for(activeWings = (IlIlIIIlllIIIlIlllIlIllIl)wings.next(); !activeWings.IlIlIIIlllIIIlIlllIlIllIl() || !uuid.toString().equals(activeWings.IIIIllIlIIIllIlllIlllllIl()); activeWings = (IlIlIIIlllIIIlIlllIlIllIl)wings.next()) {
            if (!wings.hasNext()) {
               return null;
            }
         }

         return activeWings;
      }
   }

   public lIIlIlIllIIlIIIlIIIlllIII IIIIIIlIlIlIllllllIlllIlI() {
      return this.lIllIllIlIIllIllIlIlIIlIl;
   }

   public IIllIIlIllIIlllIlIllIIIlI lIIIIlIIllIIlIIlIIIlIIllI(String var1, String var2) {
      IIllIIlIllIIlllIlIllIIIlI var3 = (IIllIIlIllIIlllIlIllIIIlI)this.llllIIIIlIlIllIIIllllIIll.getOrDefault(var1, new IIllIIlIllIIlllIlIllIIIlI("client/heads/" + var1 + ".png"));
      if (!this.llllIIIIlIlIllIIIllllIIll.containsKey(var1)) {
         IIlIlIllIIllllllIIIllIllI var4 = new IIlIlIllIIllllllIIIllIllI(null, "https://minotar.net/avatar/" + var1 + "/32.png", new IIllIIlIllIIlllIlIllIIIlI("client/defaults/steve.png"), null);
         lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIllIIllIIIIllIllIIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var3, var4);
         this.llllIIIIlIlIllIIIllllIIll.put(var1, var3);
      }

      return var3;
   }

   public static String[] IllIllIIIlIIlllIIIllIllII() {
      String[] microphones = new String[lIIIlllIlIlllIIIIIIIIIlII.size()];
      int index = 0;

      for(Iterator iterator = lIIIlllIlIlllIIIIIIIIIlII.iterator(); iterator.hasNext(); ++index) {
         IIIIllIIllIIIIllIllIIIlIl microphone = (IIIIllIIllIIIIllIllIIIlIl)iterator.next();
         microphones[index] = microphone.lIIIIIIIIIlIllIIllIlIIlIl();
      }

      return microphones;
   }

   public static String IIIIllIlIIIllIlllIlllllIl(String var0) {
      Iterator var1 = lIIIlllIlIlllIIIIIIIIIlII.iterator();
      if (!var1.hasNext()) {
         return var0;
      } else {
         IIIIllIIllIIIIllIllIIIlIl var2;
         for(var2 = (IIIIllIIllIIIIllIllIIIlIl)var1.next(); !var2.lIIIIIIIIIlIllIIllIlIIlIl().equals(var0); var2 = (IIIIllIIllIIIIllIllIIIlIl)var1.next()) {
            if (!var1.hasNext()) {
               return var0;
            }
         }

         return var2.lIIIIlIIllIIlIIlIIIlIIllI();
      }
   }

   public boolean IlIIlIIIIlIIIIllllIIlIllI() {
      return this.IllIlIIIIlllIIllIIlllIIlI;
   }

   public boolean lIIlIIllIIIIIlIllIIIIllII() {
      return this.IllIlIlIllllIlIIllllIIlll;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(boolean var1) {
      this.IllIlIIIIlllIIllIIlllIIlI = var1;
   }

   public void lIIIIIIIIIlIllIIllIlIIlIl(boolean var1) {
      this.IllIlIlIllllIlIIllllIIlll = var1;
   }

   public List lIIlllIIlIlllllllllIIIIIl() {
      return this.IllIIlIIlllllIllIIIlllIII;
   }

   public lIIlllIIlllIlIllIIlIIIIll lIllIllIlIIllIllIlIlIIlIl() {
      return this.lIlIlIllIIIIIIIIllllIIllI;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(lIIlllIIlllIlIllIIlIIIIll var1) {
      this.lIlIlIllIIIIIIIIllllIIllI = var1;
   }

   public IllIIlIIIllllIIIIllIlIlIl llIlIIIllIIIIlllIlIIIIIlI() {
      return this.IllIIlllIllIlIllIlIIIIIII;
   }

   public IllIIIIIIIlIlIllllIIllIII lIllIlIlllIIlIIllIIlIIlII() {
      return this.IlIlIIIlllllIIIlIlIlIllII;
   }

   public IIIIIlIIIlllIIlIIllllIlll IIIlIIlIlIIIlllIIlIllllll() {
      return this.lllIlIIllllIIIIlIllIlIIII;
   }

   public IlIIIIlIlIllIIlIIIIllllll IllIlIIIIlllIIllIIlllIIlI() {
      return this.lIIIIlllIIlIlllllIlIllIII;
   }

   public static List IllIlIlIllllIlIIllllIIlll() {
      return lIIIlllIlIlllIIIIIIIIIlII;
   }

   public lIlIlIllIlIlIIIIllIlllIll IllIIlIIlllllIllIIIlllIII() {
      return this.IlIIIIllIIIIIlllIIlIIlllI;
   }

   public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIlIllIlIlIIIIllIlllIll var1) {
      this.IlIIIIllIIIIIlllIIlIIlllI = var1;
   }

   public static IIllIIlIllIIlllIlIllIIIlI lIlIlIllIIIIIIIIllllIIllI() {
      return llIlIlIllIlIIlIlllIllIIlI;
   }

   public static IIllIIlIllIIlllIlIllIIIlI IlllIIlllIIIIllIIllllIlIl() {
      return llIlIlIlllIlllllIIIllIIll;
   }

   public static IIllIIlIllIIlllIlIllIIIlI IllllIllllIlIIIlIIIllllll() {
      return IlIIlIIlIllIIIIllIIllIlIl;
   }

   public List<FriendTypingData> getFriendsOutGoingData() {
      return friendsOutGoingData;
   }

   public List<FriendTypingData> getFriendsTypingInComingData() {
      return friendsTypingInComingData;
   }

   static void lIIIIlIIllIIlIIlIIIlIIllI(lIIIIlIIllIIlIIlIIIlIIllI var0, IPCClient var1, String var2, String var3, String var4, String var5) {
      var0.lIIIIlIIllIIlIIlIIIlIIllI(var1, var2, var3, var4, var5);
   }

   public List<String> getPlayersTypingToUser() {
      return playersTypingToUser;
   }

   private static class ClientListener implements IPCListener
   {
       private lIIIIlIIllIIlIIlIIIlIIllI cb;
       
       public ClientListener(final lIIIIlIIllIIlIIlIIIlIIllI cb) {
           this.cb = cb;
       }
       
       public void onReady(final IPCClient client) {
           this.cb.lIIIIlIIllIIlIIlIIIlIIllI(client, lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().IlllIIIlIlllIllIlIIlllIlI(), "", "logo", "CheatBreaker");
       }
   }

}
