import java.io.*;
import net.minecraft.client.main.*;
import java.util.*;

public class Start
{
    public static lIIIIlIIllIIlIIlIIIlIIllI cb;
    
    public static void main(final String[] args) {
        try {
            final File file = new File(new File(System.getenv("APPDATA")), ".minecraft");
            System.loadLibrary("graphics-hook64");
            //System.loadLibrary("Game-AntiCheat-Research");
            Main.main(concat(new String[] { "--version", "CheatBreaker", "--accessToken", "0", "--assetIndex", "1.7.10", "--userProperties", "{}", "--gameDir", file.getAbsolutePath(), "--assetsDir", new File(file, "assets").getAbsolutePath() }, args));
        }
        catch (Exception e) {
             e.printStackTrace();
        }
    }
    
    private static <T> T[] concat(final T[] first, final T[] second) {
        final T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
