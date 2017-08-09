package com.fupengpeng.entity;



/**
 * 
 * Title: NutritionFacts
 * Description: ������ģʽ��ʹ��
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ObjectBuilder
 * @author fupengpeng
 * @date 2017��8��9�� ����3:48:03
 */
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder {
		
		private final int servingSize;
		private final int servings;
		
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize,int servings){
			this.servings = servings;
			this.servingSize = servingSize;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
		
	}
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	
}
