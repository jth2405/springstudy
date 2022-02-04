package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	@Autowired
	@Qualifier("exam1")
	private Exam exam;
	
	public GridExamConsole() {
		System.out.println("construcotr");
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	
	@Override
	public void print() {	
		System.out.println("������������������������������������������");
		System.out.println("��  total  ��   avg   ��");
		System.out.println("������������������������������������������");
		System.out.printf("��   %3d   ��  %3.2f   ��\n",exam.total(),exam.avg());
		System.out.println("������������������������������������������");
	}

	
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
