package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ReadTxt r = new ReadTxt();
		r.start();
		r.join();
		for (String string : r.titleMap.values()) {
			System.out.println(string);
		}
		
		System.out.println(r.textMap.get(0));
		
		
	}
	
	

}

class ReadTxt extends Thread{

	HashMap<Integer,StringBuilder> textMap = new HashMap<>();
	HashMap<Integer,String> titleMap = new HashMap<>();
	@Override
	public void run() {
		File file = new File("resource/秦时明月小说全集.txt");
		//System.out.print(file.exists());
		Reader read = null;
		try {
			read = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(read);
		String line = null;
		long length = file.length();
		int count = 0;
		long currentLength = 0;
		
		
		
		Pattern p = Pattern.compile("(^\\s*第)(.{1,9})[章节卷集部篇回](\\s*)(.*)");
		Matcher m = null;
		try {
			while(null != (line = bf.readLine())) {
				currentLength += line.getBytes().length;
				System.out.println("已读取"+ ((float)currentLength/(float)length)*100 +"%");
				
				m = p.matcher(line);
				if(m.matches()) {
					
					titleMap.put(++count, count+":"+line);
					textMap.put(count,new StringBuilder().append(line+"\n"));
					
				}else if(count != 0){
					textMap.put(count, textMap.get(count).append(line+"\n"));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
