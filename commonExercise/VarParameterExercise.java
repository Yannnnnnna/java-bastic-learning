public class VarParameterExercise {
//编写一个main 方法
public static void main(String[] args) {
		Grade grade = new Grade();
		
		
		System.out.println(grade.std("小明", 85, 95));

	}
}
class Grade{
	
		public String std(String name, double... score){
			
			int sum = 0;
			for(int i = 0; i < score.length; i++){
				sum += score[i];
				
			}
			return (name + " " + sum);
		}

	
}