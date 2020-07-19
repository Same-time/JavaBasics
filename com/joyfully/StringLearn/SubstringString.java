package com.joyfully.StringLearn;
/*
字符串的截取方法：

public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)，包含左边，不包含右边。
 */
public class SubstringString {
	public static void main(String[] args) {
		String str1 = "abcdefghijk";
		//从指定下标截取到末尾
		System.out.println(str1.substring(3));
		//截取区间内的字符串 [begin,end)
		System.out.println(str1.substring(2, 5));
	}
}
