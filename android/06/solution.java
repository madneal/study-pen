import data.Foo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class Main {
    public static void main(String[] args) throws Exception {
      System.out.println(a("ygiG2VpgnW6z2ocCPEVaYhDwBs3UxZENbgh1iQJ6NhpBqHsczQsDh1rD3WjejQ7JH1o+lvBdtxhG64qyLQyHSg", "__pentesterlab__".getBytes()));
    }
  public static String a(String paramString, byte[] paramArrayOfByte) {
    try {
      byte[] arrayOfByte2 = Base64.getDecoder().decode(new String(paramString).getBytes("UTF-8"));
      byte[] arrayOfByte1 = new byte[arrayOfByte2.length];
      byte[] arrayOfByte3 = new byte[16];
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte3.length);
      IvParameterSpec ivParameterSpec = new IvParameterSpec(arrayOfByte3);
      int i = arrayOfByte2.length - 16;
      arrayOfByte3 = new byte[i];
      System.arraycopy(arrayOfByte2, 16, arrayOfByte3, 0, i);
      SecretKeySpec secretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(2, secretKeySpec, ivParameterSpec);
      return new String(cipher.doFinal(arrayOfByte3));
    } catch (Exception ex) {
      return "";
    } 
  }
}