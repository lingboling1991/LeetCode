package NEW.reverse_bits;

public class Solution {
	// you need treat n as an unsigned value
	public static int reverseBits(int n) {

		char[] r = new char[32];
		for (int i = 0; i < 32; i++) {
			r[i] = '0';
		}
		int j = 0;
		
		char[] x = Integer.toBinaryString(n).toCharArray();//intת������Stringתchar[]�����ת�����֮��nǰ�����Щ0�ᱻɾ��
		for (int i = x.length - 1; i >= 0; i--) {
			r[j] = x[i];
			j++;
		}

		String y = new String(r);//char[]תString
		return Integer.parseUnsignedInt(y, 2);//ʮ����Stringת������int

	}

	public static void main(String arg[]) {
		System.out.println(reverseBits(43261596));
		System.out.println(Integer.toBinaryString(15065253));
	}
}
