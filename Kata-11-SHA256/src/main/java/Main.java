import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        byteToHex("Hello World!");
            System.out.println(byteToHex("Hello World!").equals("7f83b1657ff1fc53b92dc18148a1d65dfc2d4b1fa3d677284addd200126d9069"));  
    }

    public static String byteToHex(String text)  {
        try {
            MessageDigest digest  = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(text.getBytes("UTF-8"));
            StringBuffer hexString = new  StringBuffer();
            for(int i = 0; i< hash.length; i++){
                String hex = Integer.toHexString(255 & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            System.out.println(hexString);
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    } 
}
