package wrapperclass;

public class ConversionString {
				public static void main(String[] args) {
					int i=123;
					long l=23445l;
					double d=3452;
					float f=34f; 
					char ch='a';
					boolean b=false;
					//conversion
					String s=String.valueOf(ch);
					String s1=String.valueOf(b);
					String s2=String.valueOf(f);
					String s3=String.valueOf(d);
					String s4=String.valueOf(i);
					String s5=String.valueOf(l);
					System.out.println(s);
				}
}
