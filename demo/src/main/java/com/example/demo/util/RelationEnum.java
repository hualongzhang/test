package com.example.demo.util;



/**
 * @author zhanghualong
 * 枚举类的一般使用方法
 */
public enum RelationEnum {

	Q("Q","配偶或直系亲属"),O("O","其他联系人"),D("D","从业证明人");
	
	private String key;
	private String value;
	
	private RelationEnum(String key,String value){
		this.key=key;
		this.value=value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static String getValueByKey(String key){
		for(RelationEnum o : RelationEnum.values()){
			if(o.getKey().equals(key)){
				return o.value;
			}
		}
		return "";
	}
	
	public static String getKeyByValue(String value){
		for(RelationEnum o : RelationEnum.values()){
			if(o.getValue().equals(value)){
				return o.key;
			}
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(RelationEnum.getValueByKey("Q"));
	}
}
