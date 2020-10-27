import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

class Main {
    public static void main(String[] args) throws Exception {
      for (int i = 0; i < 10000; i++) {
        try {
          String ping = String.format("%04d", i);
          String s = "ED1nf3uLW4Hkwr1aGw+NpN5sgcRMPCFuk0XgtW181m4o6d0Ml3D/j6h1NSyOh4dbcGsbK6rcZOUyzHxWVb4QkA";
          byte abyte1[] = Base64.getDecoder().decode(s);
          byte iv[] = new byte[16];
          System.arraycopy(abyte1, 0, iv, 0, 16);
          IvParameterSpec ivp = new IvParameterSpec(iv);
          int z = abyte1.length - 16;
          byte abyte0[] = new byte[z];
          System.arraycopy(abyte1, 16, abyte0, 0, z);
          Object obj = MessageDigest.getInstance("MD5");
          ((MessageDigest) (obj)).update(ping.getBytes("UTF-8"));
          byte key[] = new byte[16];
          System.arraycopy(((MessageDigest) (obj)).digest(), 0, key, 0, 16);
          SecretKeySpec keys = new SecretKeySpec(key, "AES");
          obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
          ((Cipher) (obj)).init(2, keys, ivp);
          s = new String(((Cipher) (obj)).doFinal(abyte0));
          System.out.println(s);
        } catch (Exception e) {
          
        }
      }
      
    }
}