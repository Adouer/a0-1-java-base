package com.learn.a03_oop.a01_encapsulation;
/**
 * 枚举类
 * @author adouer
 *
 */
public class EnumPerson {

	private String gender;
	
	public static final EnumPerson MALE = new EnumPerson("男");
	public static final EnumPerson FEMALE = new EnumPerson("女");
	
	/**
	 * 构造方法私有化
	 * @param gender
	 */
	private EnumPerson(String gender) {
		super();
		this.gender = gender;
	}
	/**
	 * 对外提供初始化方法
	 * @param type（1表示男，其他表示女）
	 * @return
	 */
	public static EnumPerson getInstance(Integer type) {
		if(type == 1) {
			return MALE;
		} else {
			return FEMALE;
		}
	}
	
	@Override
	public String toString() {
		return "EnumPerson [gender=" + gender + "]";
	}

	public static void main(String[] args) {
		EnumPerson instance = getInstance(1);
		System.out.println(instance);
		EnumPerson instance2 = getInstance(2);
		System.out.println(instance2);
		
	}
}
