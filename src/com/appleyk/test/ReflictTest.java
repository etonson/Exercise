package com.appleyk.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflictTest {

	public static void main(String[] args) {
		try {
			// 呼叫類別
			Class<?> ca = Class.forName("com.appleyk.reflict.Animal");
			// 初始化
			Constructor constructor = ca.getConstructor(String.class, int.class);
			// 建立實例
			Object object = constructor.newInstance("hehe", 11);
			// 呼叫方法
			Method fooMethod = ca.getMethod("sayName", String.class);

			String s = fooMethod.invoke(object, "six").toString();
			System.out.println(s);

		} catch (Exception e) {
			System.out.println("找不道");
		}
	}

}
