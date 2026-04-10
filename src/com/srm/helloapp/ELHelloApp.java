package com.srm.helloapp;

public class ELHelloApp {
    public static void main(String[] args) {
        if (args.length==0) {
        		System.out.println("Hello ,World");
        }
        else {
        	StringBuilder names=new StringBuilder();
        	for(String name:args) {
        		names.append(name);
        	System.out.println("Hello "+ names.toString() +"!");
        	}
        }
    }
}

