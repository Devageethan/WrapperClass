package wrapperclass;

public class Conversion {
				public static void main(String[] args) {
					String s="100";
					int i=Integer.parseInt(s);
					System.out.println(s);
					System.out.println(i);
					byte b=Byte.parseByte(s);
					System.out.println(b);
					short t=Short.parseShort(s);
					System.out.println(t);
					boolean a=Boolean.parseBoolean(s);
					System.out.println(a);
					double d=Double.parseDouble(s);
					System.out.println(d);
				}
}
