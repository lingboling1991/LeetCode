package util;

/**
 * Created by Administrator on 2016/1/6.
 */
public class add_binary {
	public String addBinary(String a, String b) {
		String[] aa = a.split("");
		String[] bb = b.split("");
		String[] res = new String[Math.max(aa.length, bb.length) + 1];

		int i = aa.length - 1;
		int j = bb.length - 1;
		int k = res.length - 1;

		boolean flag = false;

		while (i >= 0 && j >= 0) {
			int curAA = Integer.valueOf(aa[i]);
			int curBB = Integer.valueOf(bb[j]);
			if (flag) {
				flag = false;
				if ((curAA & curBB) == 1) {
					flag = true;
				}
				res[k] = String.valueOf(curAA | curBB);
			} else {
				if ((curAA & curBB) == 1) {
					flag = true;
					res[k] = "0";
				} else {
					res[k] = String.valueOf(curAA | curBB);
				}
			}
			k--;
			i--;
			j--;
		}
		
		if (i<0){
			for (int l = 0; l < ; l++) {
				
			}
		}

		return "d";
	}

	public static void main(String[] args) {
		String a = "asf";
		String[] b = a.split("");
		System.out.println("ddd");
	}
}
