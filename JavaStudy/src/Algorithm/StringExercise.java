package Algorithm;

class StringExercise{
    String getMiddle(String word){
    	char[] c = word.toCharArray();
    	if (word.length()%2 == 0) {
    		return  String.valueOf(c[(word.length()/2)-1])+String.valueOf(c[(word.length()/2)]);
    	} else {
    		return String.valueOf(c[(word.length()/2)]);
    	}
    	    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}