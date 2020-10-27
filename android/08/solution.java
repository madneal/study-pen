import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

class Main {
  public static void main(String[] args) throws Exception {
    for (int i = 0; i < 10000; i++) {
      try {
        String pin = String.format("%04d", i);
        String key = "<=== P3nt3st3rL4b ===>";
        String s = "G38zckAufW4B9A6sywz28kzgW8CCx1UWugLUTjKlo/kwV1CVesmr0tPX/JZOW0aik0TlkrcAIZZ/G0BigUtmeg==";
        byte abyte1[] = Base64.getDecoder().decode(s);
        byte iv[] = new byte[16];
        System.arraycopy(abyte1, 0, iv, 0, 16);
        IvParameterSpec ivp = new IvParameterSpec(iv);
        int z = abyte1.length - 16;
        byte abytes0[] = new byte[z];
        System.arraycopy(abyte1, 16, abytes0, 0, z);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(key.getBytes("UTF-8"));
        messageDigest.update(pin.getBytes("UTF-8"));
        byte key1[] = new byte[16];
        System.arraycopy(messageDigest.digest(), 0, key1,0, 16);
        SecretKeySpec keys = new SecretKeySpec(key1, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, keys, ivp);
        String clear = new String(cipher.doFinal(abytes0));
        System.out.println(clear);

      } catch (Exception e) {

      }
    }

  }
}