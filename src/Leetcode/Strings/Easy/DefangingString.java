package Leetcode.Strings.Easy;

public class DefangingString {
    public static void main(String[] args) {
       String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
      return address.replace(".","[.]");
    }
}
