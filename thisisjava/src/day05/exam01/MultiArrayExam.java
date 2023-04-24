package day05.exam01;

public class MultiArrayExam {

	public static void main(String[] args) {
		//각반의 학생수가 3명으로 동일할 경우 정수저장을 위한 2차원 배열
		int[][] mathScores = new int[2][3];
		mathScores[0][0] =80;
		mathScores[0][1] =84;
		mathScores[0][2] =87;
		mathScores[1][0] =82;
		mathScores[1][1] =83;
		mathScores[1][2] =89;
		
		int[][] engScores = {
				{80,84,87},
				{82,83,89}
		};
//		engScores[1][1]
		int mathSum = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				mathSum += mathScores[i][j];
			}
		}
		System.out.println("수학점수의 합은 : " + mathSum);
		
		int[][] engScore = {
				{80,84,87},
				{82,83,}
		};
		System.out.println("engScore의 배열길이는 : "+engScore.length);
		System.out.println("engScore[0]의 배열길이는 : "+engScore[0].length);
		System.out.println("engScore의[1] 배열길이는 : "+engScore[1].length);

	}

}
