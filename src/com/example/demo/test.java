/**  
 * @Title: test.java  
 * @Package com.example.demo  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��26��  
 * @version V1.0  
 */  
package com.example.demo;

import java.util.HashMap;

/**  
 * @ClassName: test  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��26��  
 *    
 */
public class test {

	/**  
	 * @Title: main  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @param args    ����  
	 * @return void    ��������  
	 * @throws  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, Integer> h = new HashMap <>();
		int i = 1;
		int j = 2;
		h.put(i, j);
		System.out.println(h.get(i));
		j = 3;
		System.out.println(h.get(i));
		i = 2;
		System.out.println(h.get(i));
	}

}
