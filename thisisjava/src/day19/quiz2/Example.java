package day19.quiz2;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		//최대값 얻기
//		int max = maxOrMin(new Operator() {
//			
//			@Override
//			public int apply(int x, int y) {
//				int re = 0;
//				for(int i = 0;i<scores.length; i++) {
//					if (re < scores[i]) {
//						re = scores[i];
//					}
//				}
//				return re;
//			}
//		});
		int max =maxOrMin((x,y)->{
			return x>y ? x : y;
		});
		System.out.println(max);
		
		//최소값 얻기
		int min = maxOrMin((x,y)->{
			return x<y ? x : y;
		});
		System.out.println(min);
	}
}
