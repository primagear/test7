# test7
Different class type convert


package day08;

public class classConverter {

	public static void main(String[] args) {
		
	/*        转换
    String -> char[]  st.toCharArray()                                   Arrays.toString(chs)
    String -> byte[]  st.getBytes()                                      Arrays.toString(bys)
    String -> int  string无法直接转换为int数组  Integer.parseInt(st)       Integer.toString(int) || intobj.toString()
    
    String -> char st.toCharArray()                                      Character.toString(ch) || charobj.toString()
    String -> byte st.getBytes()                                         Byte.toString(by)||byobj.toString()

    *
    *
    */
//	String st = "ABCDEF";
//	byte[] bys = st.getBytes();
//	System.out.println(Arrays.toString(bys));
//	
//	char[] chs = st.toCharArray();
//	System.out.println(Arrays.toString(chs));
	
//	检验QQ号码
//	1 输入QQ号码：文本格式，字符串
//	2 进行检验XXXX
//	3 如果符合要求，输出true
//	QQ要求
//	A QQ的长度 5-15
//	B QQ的首字母不能为0
//	C QQ应是数字组成
	
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
//	System.out.println("请输入你的QQ号码:");
//	String st = sc.nextLine();
//	
/*		byte[] bys = st.getBytes();
	System.out.println(Arrays.toString(bys));
	
	if(bys.length >=5 && bys.length <=15){
		if(bys[0] != 48){
			for(int i=0;i<bys.length;i++){
				if(bys[i] >=48 && bys[i] <=57){
					
				}else{
					System.out.println("QQ号码中有数字不在0-9之间");
					break;
				}
			}
			System.out.println("true");
			
		}else{
			System.out.println("QQ首字母不能为0");
		}
	}else{
		System.out.println("QQ长度不满足要求");
	}*/
	
}
}
