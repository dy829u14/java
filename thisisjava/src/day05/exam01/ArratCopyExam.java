package day05.exam01;

public class ArratCopyExam {

	public static void main(String[] args) {
		int[] oldIntArray = {10,20,30};
		int[] newIntArray = new int[3];
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		int[] newIntArray2 = oldIntArray;
		oldIntArray[0] = 100;
		for(int i =0; i<newIntArray2.length;i++) {
			System.out.println(newIntArray2[i]);
		}
		for(int i =0; i<newIntArray.length;i++) {
			System.out.println(newIntArray2[i]);
		}
		
		//String 배열
		String[] oldstrArray = {"java","array","copy"};
		String[] newstrArray1 = oldstrArray;
		oldstrArray[2] = "copycopy";
		System.out.println(newstrArray1[2]);
		String[] newstrArray2 = new String[5];
		//{null,null,null,null,null}
		for(int i=0; i<oldstrArray.length; i++) {
			//newstrArray2[0] = "java"
			//newstrArray2[1] = "array"
			//newstrArray2[2] = "copy"
			newstrArray2[i] = oldstrArray[i];
		}
		for(int i=0; i<newstrArray2.length; i++) {
			System.out.println(newstrArray2[i]);
		}
		
		int[] oldnums = {10,20,30};
		int[] newnums = new int[5];
		System.arraycopy(oldnums, 1, newnums, 1, 2);
//		for(int i=0; i<newnums.length; i++) {
//			System.out.println(newnums[i] + " ");
//		}
		for(int i : newnums) {
			System.out.println(i+" ");
		}
		String[] str2 = {"a","b","c","d","e"};
		for(String s: str2) {
			System.out.println(s);
		}
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int i: scores) {
			sum += i;
		}
		System.out.println("합계는 : " + sum);

	}

}
