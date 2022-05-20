package com.appleyk.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetFieldsByReflect {

	public static void main(String[] args) {
		try {
			// 呼叫類別
			Class ca = Class.forName("com.appleyk.reflict.Animal");
			// 初始化
			Constructor constructor = ca.getConstructor(String.class, int.class);
			Field[] fields = ca.getFields();
			for (Field field : fields) {
				int mo = field.getModifiers();
				String priv = Modifier.toString(mo);
				Class<?> type = field.getType();
				System.out.println(priv + " " + type.getName() + " " + field.getName() + ";");
			}

		} catch (Exception e) {

		}
	}

}
