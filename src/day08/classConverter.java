package day08;

public class classConverter {

	public static void main(String[] args) {
		
	/*        ת��
    String -> char[]  st.toCharArray()                                   Arrays.toString(chs)
    String -> byte[]  st.getBytes()                                      Arrays.toString(bys)
    String -> int  string�޷�ֱ��ת��Ϊint����  Integer.parseInt(st)             Integer.toString(int) || intobj.toString()
    
    String -> char st.toCharArray()    Character.toString(ch) || charobj.toString()
    String -> byte st.getBytes()       Byte.toString(by)||byobj.toString()

    *
    *
    */
//	String st = "ABCDEF";
//	byte[] bys = st.getBytes();
//	System.out.println(Arrays.toString(bys));
//	
//	char[] chs = st.toCharArray();
//	System.out.println(Arrays.toString(chs));
	
//	����QQ����
//	1 ����QQ���룺�ı���ʽ���ַ���
//	2 ���м���XXXX
//	3 �������Ҫ�����true
//	QQҪ��
//	A QQ�ĳ��� 5-15
//	B QQ������ĸ����Ϊ0
//	C QQӦ���������
	
	/*char ch = '0';
	System.out.println(Character.toString(ch));
	
	Character chst = new Character('0');
	System.out.println(chst.getClass());*/
	
	String st = "125";
	Integer in = new Integer(Integer.parseInt(st));
	System.out.println(in.getClass());
//	Byte byobj = new Byte(by);
//	System.out.println(byobj.toString());
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("���������QQ����:");
//	String st = sc.nextLine();
//	
/*		byte[] bys = st.getBytes();
	System.out.println(Arrays.toString(bys));
	
	if(bys.length >=5 && bys.length <=15){
		if(bys[0] != 48){
			for(int i=0;i<bys.length;i++){
				if(bys[i] >=48 && bys[i] <=57){
					
				}else{
					System.out.println("QQ�����������ֲ���0-9֮��");
					break;
				}
			}
			System.out.println("true");
			
		}else{
			System.out.println("QQ����ĸ����Ϊ0");
		}
	}else{
		System.out.println("QQ���Ȳ�����Ҫ��");
	}*/
	
}
}
