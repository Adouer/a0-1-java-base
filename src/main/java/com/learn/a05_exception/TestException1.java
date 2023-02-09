package com.learn.a05_exception;

public class TestException1 {
	static class Abc {
		void method() {
			
		}
	}
	 static class Def extends Abc {
		@Override
		void method(){
			throw new RuntimeException("运行时异常");
		}
	}
	 
	 public static void main(String[] args) {
		  new Def().method();
	}
}
