public class lllIIlIIllIllIIllIIlIIIIl extends IlIIlllIlIIIlIIIlIlIlIlIl
{
    private lIIlIlllIIIIlIIIllIlIIIII lIIIIlIIllIIlIIlIIIlIIllI;
	   final lIIIIlIIllIIlIIlIIIlIIllI cb = lIIIllllIIllIIIIIlIIlIIlI.cb;
    
    public lllIIlIIllIllIIllIIlIIIIl(final lIIlIlllIIIIlIIIllIlIIIII liiiIlIIllIIlIIlIIIlIIllI, final float n) {
        super(n);
        this.lIIIIlIIllIIlIIlIIIlIIllI = liiiIlIIllIIlIIlIIIlIIllI;
        this.IIIllIllIlIlllllllIlIlIII = 12;
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final float n3) {
        IIIIllIlIlIIIlIlIIllllllI cbSettings = cb.IlIlIIIlllIIIlIlllIlIllIl();
    	cb.IIIIllIlIIIllIlllIlllllIl().lIIIIllIIlIlIllIIIlIllIlI.lIIIIlIIllIIlIIlIIIlIIllI(((String) this.lIIIIlIIllIIlIIlIIIlIIllI.IIIIllIlIIIllIlllIlllllIl()).toUpperCase(), (float)(this.IIIIllIlIIIllIlllIlllllIl + 2), (float)(this.IIIIllIIllIIIIllIllIIIlIl + 2), (cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? -1 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.mainTextColor.lIIIIlIIllIIlIIlIIIlIIllI() : 1862270976);
        IlIIIlIIlIIllIllllIlIlIll.lIIIIlIIllIIlIIlIIIlIIllI((float)(this.IIIIllIlIIIllIlllIlllllIl + 2), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII - 1), (float)(this.IIIIllIlIIIllIlllIlllllIl + this.IlIlIIIlllIIIlIlllIlIllIl / 2 - 20), (float)(this.IIIIllIIllIIIIllIllIIIlIl + this.IIIllIllIlIlllllllIlIlIII), (cb.IlIlIIIlllIIIlIlllIlIllIl().darkMode.IIIIllIlIIIllIlllIlllllIl()).equals("Dark") ? 0xff272727 : cbSettings.darkMode.IIIIllIlIIIllIlllIlllllIl().equals("Custom UI") ? cbSettings.labelColorTellinqIsCool.lIIIIlIIllIIlIIlIIIlIIllI() : 523185967);
    }
    
    @Override
    public void lIIIIlIIllIIlIIlIIIlIIllI(final int n, final int n2, final int n3) {
    }

    public lIIlIlllIIIIlIIIllIlIIIII getModSetting() {
        return this.lIIIIlIIllIIlIIlIIIlIIllI;
    }
}
