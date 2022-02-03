package spring.di.entity;

public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public int total() {
		
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

}
