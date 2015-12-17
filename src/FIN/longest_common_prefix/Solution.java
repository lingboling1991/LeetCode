package FIN.longest_common_prefix;

public class Solution {
	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) {
			return "";//���ӿ����ǿյ�[]
		} else {

			String result = strs[0];
			char[] t = new char[9999];

			for (int i = 0; i < strs.length; i++) {
				char[] res = result.toCharArray();
				char[] tmp = strs[i].toCharArray();
				int length = 0;

				if (result.equals(strs[i])) {
					continue;
				} else {
					length = res.length <= tmp.length ? res.length : tmp.length;

					for (int j = 0; j < length; j++) {
						if (res[j] == tmp[j]) {
							t[j] = res[j];
						} else {
							break;//����Ҫ�������жϣ���Ȼ���ܻ���["aca","cba"]�����������г���
						}
					}
					result = String.valueOf(t);
					t = new char[t.length];
				}
			}
			return result.trim();
		}
	}

	public static void main(String args[]) {
		String[] arg = { "aca", "cba" };
		String result = longestCommonPrefix(arg);
		System.out.println(result);
	}
}
