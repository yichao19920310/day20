/**  
 * @Title: test.java  
 * @Package com.example.demo  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月26日  
 * @version V1.0  
 */  
package com.example.demo;

import java.util.HashMap;

/**  
 * @ClassName: test  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月26日  
 *    
 */
public class test {

	/**  
	 * @Title: main  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param args    参数  
	 * @return void    返回类型  
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
