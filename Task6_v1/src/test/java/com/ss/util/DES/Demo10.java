package com.ss.util.DES;

import java.io.File;
/*
	需求1，列出指定目录中所有的子孙文件与子孙目录名，只需要列出名称即可。

	需求2，列出指定目录中所有的子孙文件与子孙目录名，要求名称前面要有相应数量的空格：
		第一级前面有0个，第二级前面有1个，第三级前面有2个...，以此类推。

	需求3，列出指定目录中所有的子孙文件与子孙目录名，要求要是树状结构，效果如下所示：
		|--src
		|   |--cn
		|   |   |--itcast
		|   |   |   |--a_helloworld
		|   |   |   |   |--HelloWorld.java
		|   |   |   |--b_for
		|   |   |   |   |--ForTest.java
		|   |   |   |--c_api
		|   |   |   |   |--Student.java
		|--bin
		|   |--cn
		|   |   |--itcast
		|   |   |   |--i_exception
		|   |   |   |   |--ExceptionTest.class
		|   |   |   |--h_linecount
		|   |   |   |   |--LineCounter3.class
		|   |   |   |   |--LineCounter2.class
		|   |   |   |   |--LineCounter.class
		|--lib
		|   |--commons-io.jar
需求4：删除一个非空文件夹

*/
public class Demo10 {

   static int i= 0;
	public static void main(String[] args) {
		File file = new File("E:\\JAVA初级视频");
		Test3(file,"|--");
	}

	//需求3：
	public static void Test3(File dir,String space){
		File[] files = dir.listFiles();
		i++;
		for(File file:files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				Test3(file,"|   "+space);
			}
		}

	}

	//删除一个非空文件
	public static void Test2(File dir){
		File[] files = dir.listFiles();
		for(File file:files){
			if(file.isFile()){
				System.out.println("删除了"+file.getName());
				file.delete();
			}else if(file.isDirectory()){
				Test2(file);
			}
		}
		System.out.println("删除了"+dir.getName());
		dir.delete();
	}
	//将一个文件里的所有文件和文件夹名打印出来(包括其子孙文件)
	public static void Test1(File dir){
		File[] files = dir.listFiles();
		for(File file:files){
			if(file.isFile()){
				System.out.println("文件名："+file.getName());
			}else if(file.isDirectory()){
				System.out.println("文件夹名："+file.getName());
				Test1(file);
			}
		}

	}
}
