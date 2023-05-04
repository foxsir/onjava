package base.object;

public class ObjectQuote {
  public ObjectQuote() {
    String[] ss = new String['Z' - 'A' + 1];
    for (int i = 'a'; i <= 'z'; i ++) {
      String letter = String.valueOf((char) i);
      ss[i - 'a'] = letter;
    }

    String[] SS = new String['Z' - 'A' + 1];

    for (int i = 'A'; i <= 'Z'; i ++) {
      String letter = String.valueOf((char) i);
      SS[i - 'A'] = letter;
    }
    System.out.println(String.join(" . ", ss));
    System.out.println(String.join(" . ", SS));
  }
}
