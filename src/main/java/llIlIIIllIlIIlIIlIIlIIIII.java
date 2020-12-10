import io.netty.util.concurrent.GenericFutureListener;

public class llIlIIIllIlIIlIIlIIlIIIII implements IIllllIIlIlIlIlllIIIllIIl
{
    private final llllIlIlllllIIlIIllllIIII lIIIIlIIllIIlIIlIIIlIIllI;
    private final lIIIllIIllllIIIlllIlIlIll lIIIIIIIIIlIllIIllIlIIlIl;

    public llIlIIIllIlIIlIIlIIlIIIII(final llllIlIlllllIIlIIllllIIII liiiIlIIllIIlIIlIIIlIIllI, final lIIIllIIllllIIIlllIlIlIll liiiiiiiiIlIllIIllIlIIlIl) {
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.lIIIIIIIIIlIllIIllIlIIlIl = liiiiiiiiIlIllIIllIlIIlIl;
    }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lllllIlIIIlIlIllIlIIlIIIl lllllIlIIIlIlIllIlIIlIIIl) {
        switch (IlIlIIIIlIIIIIIIIlllIIlll.lIIIIlIIllIIlIIlIIIlIIllI[lllllIlIIIlIlIllIlIIlIIIl.IlllIIIlIlllIllIlIIlllIlI().ordinal()]) {
            case 1: {
                this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIIIlIIIIllIIlllIII.IIIIllIlIIIllIlllIlllllIl);
                if (lllllIlIIIlIlIllIlIIlIIIl.IIIIllIlIIIllIlllIlllllIl() > 5) {
                    final lIlIIllIIlIIIIIlIllIllllI var1 = new lIlIIllIIlIIIIIlIllIllllI("Outdated server! I'm still on 1.7.10");
                    this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIllIlllIIIIlIIIlIlll(var1), new GenericFutureListener[0]);
                    this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var1);
                    break;
                }
                if (lllllIlIIIlIlIllIlIIlIIIl.IIIIllIlIIIllIlllIlllllIl() < 5) {
                    final lIlIIllIIlIIIIIlIllIllllI var2 = new lIlIIllIIlIIIIIlIllIllllI("Outdated client! Please use 1.7.10");
                    this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new IIllIIllIlllIIIIlIIIlIlll(var2), new GenericFutureListener[0]);
                    this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(var2);
                    break;
                }
                this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new llIIlIIIIlIllIlIllIllIIlI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl));
                break;
            }
            case 2: {
                this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(lIlIlllIIIlIIIIllIIlllIII.IlllIIIlIlllIllIlIIlllIlI);
                this.lIIIIIIIIIlIllIIllIlIIlIl.lIIIIlIIllIIlIIlIIIlIIllI(new lIllIIIlIlIIlIlIIlIIIIIlI(this.lIIIIlIIllIIlIIlIIIlIIllI, this.lIIIIIIIIIlIllIIllIlIIlIl));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + lllllIlIIIlIlIllIlIIlIIIl.IlllIIIlIlllIllIlIIlllIlI());
            }
        }
    }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final IllIllIIlIIlIlllIIllIIIlI illIllIIlIIlIlllIIllIIIlI) {
    }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final lIlIlllIIIlIIIIllIIlllIII lIlIlllIIIlIIIIllIIlllIII, final lIlIlllIIIlIIIIllIIlllIII obj) {
        if (obj != lIlIlllIIIlIIIIllIIlllIII.IIIIllIlIIIllIlllIlllllIl && obj != lIlIlllIIIlIIIIllIIlllIII.IlllIIIlIlllIllIlIIlllIlI) {
            throw new UnsupportedOperationException("Invalid state " + obj);
        }
    }

    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI() {
    }
}
