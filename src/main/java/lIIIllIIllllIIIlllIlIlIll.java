import com.cheatbreaker.client.network.messages.Message;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ScheduledFuture;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class lIIIllIIllllIIIlllIlIlIll extends SimpleChannelInboundHandler {
    private static final Logger IlllIllIlIIIIlIIlIIllIIIl = LogManager.getLogger();
    public static final Marker lIIIIlIIllIIlIIlIIIlIIllI = MarkerManager.getMarker("NETWORK");
    public static final Marker lIIIIIIIIIlIllIIllIlIIlIl;
    public static final Marker IlllIIIlIlllIllIlIIlllIlI;
    public static final AttributeKey IIIIllIlIIIllIlllIlllllIl;
    public static final AttributeKey IIIIllIIllIIIIllIllIIIlIl;
    public static final AttributeKey IlIlIIIlllIIIlIlllIlIllIl;
    public static final NioEventLoopGroup IIIllIllIlIlllllllIlIlIII;
    public static final IllIlIIIlllIIlIlIIllllIIl IllIIIIIIIlIlIllllIIllIII;
    private final boolean IlIlllIIIIllIllllIllIIlIl;
    private final Queue llIIlllIIIIlllIllIlIlllIl = Queues.newConcurrentLinkedQueue();
    private final Queue lIIlIlIllIIlIIIlIIIlllIII = Queues.newConcurrentLinkedQueue();
    private Channel IIIlllIIIllIllIlIIIIIIlII;
    private SocketAddress llIlIIIlIIIIlIlllIlIIIIll;
    private lIlIIIlIlIllIlIlIIIlIlIII IIIlIIllllIIllllllIlIIIll;
    private lIlIlllIIIlIIIIllIIlllIII lllIIIIIlIllIlIIIllllllII;
    private IllIllIIlIIlIlllIIllIIIlI lIIIIIllllIIIIlIlIIIIlIlI;
    private boolean IIIIIIlIlIlIllllllIlllIlI;
    private IIlIlIIIIllIIIllIlIIIllll IllIllIIIlIIlllIIIllIllII;
    private ScheduledFuture IlIIlIIIIlIIIIllllIIlIllI;
    // rbuh - no use see commit `https://github.com/Offline-Cheatbreaker/Client-1.7.10/commit/be7a5a7631d1fcb047bea4cb6ed4a4bf09b99dfd#commitcomment-44847075`
    // for more information
    //public Set lIIIIllIIlIlIllIIIlIllIlI = ImmutableSet.of("7471b8e8-27c2-4354-a7d2-bd6a82dc00a0", "f11c7e0b-85e6-4b4b-afbf-e6cda9f531e5", "6c430f5f-2742-4b73-8850-b19bc561902a", "1d8fdd3d-4099-4eda-a06c-66ebca67970a", "401202a3-0102-4ed8-979a-e5d4832c8a9b", "ef1d2c32-a234-4fd8-b116-299221c1ec92", new String[0]);

    public lIIIllIIllllIIIlllIlIlIll(boolean var1) {
        this.IlIlllIIIIllIllllIllIIlIl = var1;
    }

    public void channelActive(ChannelHandlerContext channelActive) throws Exception {
        super.channelActive(channelActive);
        this.IIIlllIIIllIllIlIIIIIIlII = channelActive.channel();
        this.llIlIIIlIIIIlIlllIlIIIIll = this.IIIlllIIIllIllIlIIIIIIlII.remoteAddress();
        this.lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIIIlIIIIllIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI);
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIIIlIIIIllIIlllIII connectionState) {
        this.lllIIIIIlIllIlIIIllllllII = (lIlIlllIIIlIIIIllIIlllIII)this.IIIlllIIIllIllIlIIIIIIlII.attr(IIIIllIlIIIllIlllIlllllIl).getAndSet(connectionState);
        this.IIIlllIIIllIllIlIIIIIIlII.attr(IIIIllIIllIIIIllIllIIIlIl).set(connectionState.lIIIIlIIllIIlIIlIIIlIIllI(this.IlIlllIIIIllIllllIllIIlIl));
        this.IIIlllIIIllIllIlIIIIIIlII.attr(IlIlIIIlllIIIlIlllIlIllIl).set(connectionState.lIIIIIIIIIlIllIIllIlIIlIl(this.IlIlllIIIIllIllllIllIIlIl));
        this.IIIlllIIIllIllIlIIIIIIlII.config().setAutoRead(true);
        IlllIllIlIIIIlIIlIIllIIIl.debug("Enabled auto read");
    }

    public void channelInactive(ChannelHandlerContext channelInactive) {
        this.lIIIIlIIllIIlIIlIIIlIIllI((IllIllIIlIIlIlllIIllIIIlI)(new IIIlIlIIIlllllIIlllIIIlIl("disconnect.endOfStream", new Object[0])));
    }

    public void exceptionCaught(ChannelHandlerContext context, Throwable throwable) {
        IIIlIlIIIlllllIIlllIIIlIl var3;

        if (throwable instanceof TimeoutException) {
            var3 = new IIIlIlIIIlllllIIlllIIIlIl("disconnect.timeout", new Object[0]);
        } else {
            var3 = new IIIlIlIIIlllllIIlllIIIlIl("disconnect.genericReason", new Object[]{"Internal Exception: " + throwable});
        }

        this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
    }

    protected void lIIIIlIIllIIlIIlIIIlIIllI(ChannelHandlerContext context, IIllIlllIIlllllIlllIIIlIl packet) {
        if (this.IIIlllIIIllIllIlIIIIIIlII.isOpen()) {
            try {
                if (packet instanceof IllIlIllIlIIIIllIIllIlIlI && !lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IllllIllllIlIIIlIIIllllll() && lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI()) {
                    try {
                        byte[] var3 = Message.b;
                        if (var3 != null && var3.length > 0) {
                            this.IIIlllIIIllIllIlIIIIIIlII.writeAndFlush(new lIIlIlllIlIllIlIlIllllIlI(lIIIllllIIllIIIIIlIIlIIlI.cb.lIIIIIIIIIlIllIIllIlIIlIl(), var3));
                        }
                    } catch (UnsatisfiedLinkError var4) {
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
            }

            if (packet.lIIIIlIIllIIlIIlIIIlIIllI()) {
                packet.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll);
            } else {
                this.llIIlllIIIIlllIllIlIlllIl.add(packet);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(lIlIIIlIlIllIlIlIIIlIlIII netHandler) {
        Validate.notNull(netHandler, "packetListener", new Object[0]);
        IlllIllIlIIIIlIIlIIllIIIl.debug("Set listener of {} to {}", new Object[]{this, netHandler});
        this.IIIlIIllllIIllllllIlIIIll = netHandler;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IIllIlllIIlllllIlllIIIlIl packet, GenericFutureListener... futureListeners) {
        if (this.IIIlllIIIllIllIlIIIIIIlII != null && this.IIIlllIIIllIllIlIIIIIIlII.isOpen()) {
            this.lIIIIllIIlIlIllIIIlIllIlI();
            this.lIIIIIIIIIlIllIIllIlIIlIl(packet, futureListeners);
        } else {
            this.lIIlIlIllIIlIIIlIIIlllIII.add(new lIIIllIIllllIIIlllIlIlIll.lllIlIllIllIllIIIIIlIIIlI(packet, futureListeners));
        }

    }

    private void lIIIIIIIIIlIllIIllIlIIlIl(IIllIlllIIlllllIlllIIIlIl packet, GenericFutureListener[] futureListeners) {
        lIlIlllIIIlIIIIllIIlllIII var3 = lIlIlllIIIlIIIIllIIlllIII.lIIIIlIIllIIlIIlIIIlIIllI(packet);
        lIlIlllIIIlIIIIllIIlllIII var4 = (lIlIlllIIIlIIIIllIIlllIII)this.IIIlllIIIllIllIlIIIIIIlII.attr(IIIIllIlIIIllIlllIlllllIl).get();
        if (var4 != var3) {
            IlllIllIlIIIIlIIlIIllIIIl.debug("Disabled auto read");
            this.IIIlllIIIllIllIlIIIIIIlII.config().setAutoRead(false);
        }

        if (this.IIIlllIIIllIllIlIIIIIIlII.eventLoop().inEventLoop()) {
            if (var3 != var4) {
                this.lIIIIlIIllIIlIIlIIIlIIllI(var3);
            }

            this.IIIlllIIIllIllIlIIIIIIlII.writeAndFlush(packet).addListeners(futureListeners).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.IIIlllIIIllIllIlIIIIIIlII.eventLoop().execute(new IlIlIIIlIlIIllIIllIlIIlII(this, var3, var4, packet, futureListeners));
        }

    }

    private void lIIIIllIIlIlIllIIIlIllIlI() {
        if (this.IIIlllIIIllIllIlIIIIIIlII != null && this.IIIlllIIIllIllIlIIIIIIlII.isOpen()) {
            while(!this.lIIlIlIllIIlIIIlIIIlllIII.isEmpty()) {
                lIIIllIIllllIIIlllIlIlIll.lllIlIllIllIllIIIIIlIIIlI var1 = (lIIIllIIllllIIIlllIlIlIll.lllIlIllIllIllIIIIIlIIIlI)this.lIIlIlIllIIlIIIlIIIlllIII.poll();
                this.lIIIIIIIIIlIllIIllIlIIlIl(var1.lIIIIlIIllIIlIIlIIIlIIllI, var1.lIIIIIIIIIlIllIIllIlIIlIl);
            }
        }

    }

    public void lIIIIlIIllIIlIIlIIIlIIllI() {
        this.lIIIIllIIlIlIllIIIlIllIlI();
        lIlIlllIIIlIIIIllIIlllIII var1 = (lIlIlllIIIlIIIIllIIlllIII)this.IIIlllIIIllIllIlIIIIIIlII.attr(IIIIllIlIIIllIlllIlllllIl).get();
        if (this.lllIIIIIlIllIlIIIllllllII != var1) {
            if (this.lllIIIIIlIllIlIIIllllllII != null) {
                this.IIIlIIllllIIllllllIlIIIll.lIIIIlIIllIIlIIlIIIlIIllI(this.lllIIIIIlIllIlIIIllllllII, var1);
            }

            this.lllIIIIIlIllIlIIIllllllII = var1;
        }

        if (this.IIIlIIllllIIllllllIlIIIll != null) {
            for(int var2 = 1000; !this.llIIlllIIIIlllIllIlIlllIl.isEmpty() && var2 >= 0; --var2) {
                IIllIlllIIlllllIlllIIIlIl var3 = (IIllIlllIIlllllIlllIIIlIl)this.llIIlllIIIIlllIllIlIlllIl.poll();
                var3.lIIIIlIIllIIlIIlIIIlIIllI(this.IIIlIIllllIIllllllIlIIIll);
            }

            this.IIIlIIllllIIllllllIlIIIll.lIIIIlIIllIIlIIlIIIlIIllI();
        }

        this.IIIlllIIIllIllIlIIIIIIlII.flush();
    }

    public SocketAddress lIIIIIIIIIlIllIIllIlIIlIl() {
        return this.llIlIIIlIIIIlIlllIlIIIIll;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(IllIllIIlIIlIlllIIllIIIlI var1) {
        if (this.IIIlllIIIllIllIlIIIIIIlII.isOpen()) {
            if (this.IlIIlIIIIlIIIIllllIIlIllI != null) {
                this.IlIIlIIIIlIIIIllllIIlIllI.cancel(false);
            }

            this.IIIlllIIIllIllIlIIIIIIlII.close();
            this.lIIIIIllllIIIIlIlIIIIlIlI = var1;
        }

    }

    public boolean IlllIIIlIlllIllIlIIlllIlI() {
        return this.IIIlllIIIllIllIlIIIIIIlII instanceof LocalChannel || this.IIIlllIIIllIllIlIIIIIIlII instanceof LocalServerChannel;
    }

    public static lIIIllIIllllIIIlllIlIlIll lIIIIlIIllIIlIIlIIIlIIllI(InetAddress var0, int var1) {
        lIIIllIIllllIIIlllIlIlIll var2 = new lIIIllIIllllIIIlllIlIlIll(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group(IIIllIllIlIlllllllIlIlIII)).handler(new IllIlIIIIIlIIlIllIIIlIIIl(var2))).channel(NioSocketChannel.class)).connect(var0, var1).syncUninterruptibly();
        return var2;
    }

    public static lIIIllIIllllIIIlllIlIlIll lIIIIlIIllIIlIIlIIIlIIllI(SocketAddress var0) {
        lIIIllIIllllIIIlllIlIlIll var1 = new lIIIllIIllllIIIlllIlIlIll(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group(IIIllIllIlIlllllllIlIlIII)).handler(new IIllllIIlIlIIllIlIIllllII(var1))).channel(LocalChannel.class)).connect(var0).syncUninterruptibly();
        return var1;
    }

    public void lIIIIlIIllIIlIIlIIIlIIllI(SecretKey secretKey) {
        this.IIIlllIIIllIllIlIIIIIIlII.pipeline().addBefore("splitter", "decrypt", new IllIIIlIIIlIIIIIIllllIIII(IIlIlIIIIIlIllIllllllIIlI.lIIIIlIIllIIlIIlIIIlIIllI(2, secretKey)));
        this.IIIlllIIIllIllIlIIIIIIlII.pipeline().addBefore("prepender", "encrypt", new lIlIIIllllIIlIlIlIllIllII(IIlIlIIIIIlIllIllllllIIlI.lIIIIlIIllIIlIIlIIIlIIllI(1, secretKey)));
        // rbuh - no use see commit `https://github.com/Offline-Cheatbreaker/Client-1.7.10/commit/be7a5a7631d1fcb047bea4cb6ed4a4bf09b99dfd#commitcomment-44847075` for more information.
        /*if (lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIIIlIlllIllIlIIlllIlI.lIIIIlIIllIIlIIlIIIlIIllI()) {
            String uuid = lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IIIIlIIIlllllllllIlllIlll().lIIIIIIIIIlIllIIllIlIIlIl();
            if (!this.lIIIIllIIlIlIllIIIlIllIlI.contains(uuid)) {
                try {
                    MessageDigest digest = MessageDigest.getInstance("SHA-512");
                    digest.update(secretKey.getEncoded());
                    digest.update(IIIlllllIlIIllIIIlIlIIIll.class.getName().getBytes());
                    digest.update(lIlllllllllIlIllIIIIIIIlI.class.getName().getBytes());
                    digest.update(uuid.getBytes());
                    digest.update(lIIIllIllIllIlllIlIIlIlII.IllIlIIIIlllIIllIIlllIIlI().IlllIIIlIlllIllIlIIlllIlI.lIIIIIIIIIlIllIIllIlIIlIl.getBytes());
                    this.IIIlllIIIllIllIlIIIIIIlII.writeAndFlush(new lIIlIlllIlIllIlIlIllllIlI("CB|INIT", digest.digest()));
                    System.out.println("Sent CB|INIT");
                } catch (NoSuchAlgorithmException var4) {
                }
            }

            this.IllIllIIIlIIlllIIIllIllII = new IIlIlIIIIllIIIllIlIIIllll(secretKey);
            this.IIIlllIIIllIllIlIIIIIIlII.pipeline().addBefore("encoder", "cb-checksum-out", this.IllIllIIIlIIlllIIIllIllII);
            IllIIllIIIlIlllIlIlIIlIII checksumInput = new IllIIllIIIlIlllIlIlIIlIII(secretKey);
            this.IIIlllIIIllIllIlIIIIIIlII.pipeline().addAfter("splitter", "cb-checksum-in", checksumInput);
            this.IIIlllIIIllIllIlIIIIIIlII.pipeline().addAfter("decoder", "cb-checksum-verify", new IlIlIIIlIlIllIIIIIllllIIl(checksumInput));
            this.IlIIlIIIIlIIIIllllIIlIllI = this.IIIlllIIIllIllIlIIIIIIlII.eventLoop().scheduleAtFixedRate(() -> {
                ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream outputStream = new DataOutputStream(arrayOutputStream);

                try {
                    outputStream.writeInt((int)this.IllIllIIIlIIlllIIIllIllII.lIIIIlIIllIIlIIlIIIlIIllI());
                } catch (IOException var4) {
                }

                this.IIIlllIIIllIllIlIIIIIIlII.writeAndFlush(new lIIlIlllIlIllIlIlIllllIlI("CB|PING", arrayOutputStream.toByteArray()));
            }, 1L, 5L, TimeUnit.SECONDS);
        }*/

        this.IIIIIIlIlIlIllllllIlllIlI = true;
    }

    public boolean IIIIllIlIIIllIlllIlllllIl() {
        return this.IIIlllIIIllIllIlIIIIIIlII != null && this.IIIlllIIIllIllIlIIIIIIlII.isOpen();
    }

    public lIlIIIlIlIllIlIlIIIlIlIII IIIIllIIllIIIIllIllIIIlIl() {
        return this.IIIlIIllllIIllllllIlIIIll;
    }

    public IllIllIIlIIlIlllIIllIIIlI IlIlIIIlllIIIlIlllIlIllIl() {
        return this.lIIIIIllllIIIIlIlIIIIlIlI;
    }

    public void IIIllIllIlIlllllllIlIlIII() {
        this.IIIlllIIIllIllIlIIIIIIlII.config().setAutoRead(false);
    }

    protected void channelRead0(ChannelHandlerContext var1, Object var2) {
        this.lIIIIlIIllIIlIIlIIIlIIllI(var1, (IIllIlllIIlllllIlllIIIlIl)var2);
    }

    public Channel IllIIIIIIIlIlIllllIIllIII() {
        return this.IIIlllIIIllIllIlIIIIIIlII;
    }

    static Channel lIIIIlIIllIIlIIlIIIlIIllI(lIIIllIIllllIIIlllIlIlIll var0) {
        return var0.IIIlllIIIllIllIlIIIIIIlII;
    }

    static {
        lIIIIIIIIIlIllIIllIlIIlIl = MarkerManager.getMarker("NETWORK_PACKETS", lIIIIlIIllIIlIIlIIIlIIllI);
        IlllIIIlIlllIllIlIIlllIlI = MarkerManager.getMarker("NETWORK_STAT", lIIIIlIIllIIlIIlIIIlIIllI);
        IIIIllIlIIIllIlllIlllllIl = new AttributeKey("protocol");
        IIIIllIIllIIIIllIllIIIlIl = new AttributeKey("receivable_packets");
        IlIlIIIlllIIIlIlllIlIllIl = new AttributeKey("sendable_packets");
        IIIllIllIlIlllllllIlIlIII = new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO #%d").setDaemon(true).build());
        IllIIIIIIIlIlIllllIIllIII = new IllIlIIIlllIIlIlIIllllIIl();
    }

    static class lllIlIllIllIllIIIIIlIIIlI {
        private final IIllIlllIIlllllIlllIIIlIl lIIIIlIIllIIlIIlIIIlIIllI;
        private final GenericFutureListener[] lIIIIIIIIIlIllIIllIlIIlIl;

        public lllIlIllIllIllIIIIIlIIIlI(IIllIlllIIlllllIlllIIIlIl var1, GenericFutureListener... var2) {
            this.lIIIIlIIllIIlIIlIIIlIIllI = var1;
            this.lIIIIIIIIIlIllIIllIlIIlIl = var2;
        }
    }
}
