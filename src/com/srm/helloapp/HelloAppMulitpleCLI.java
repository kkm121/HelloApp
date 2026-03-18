package com.srm.helloapp;

public class HelloAppMulitpleCLI {
	public static void main(String[] args) {
		String names;
		StringBuilder name = new StringBuilder();
		if (args.length == 0) {
	        names = "World"; 
		}else {
			for (int i=0;i<args.length;i++) {
				name.append(args[i]);
				if (i < args.length - 1) {
					name.append(", ");
				}
			}
			names=name.toString();
		}
		System.out.println("Hello ,"+names);
	}
}
