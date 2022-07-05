package example07;

import java.util.Arrays;

public class WildCardEx {
	
	//?�� ��� ��ü�� �� �ްڴٴ� ��
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}
	
	//Student�̰ų� Student�� ��ӹ޴� Ŭ����(���� Ÿ���� ����)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}
	
	//WorkerŬ�����̰ų� ����Ŭ�����鸸 ���� �� �ִ�.(���� Ÿ���� ����)
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}
	
	//�ͻ����! �ͽ������ ����Ÿ������ ���۴� ����Ÿ�� ����!

	public static void main(String[] args) {
//		registerCourse(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourse(new Course<Student>("�л� ����", 10));
//		registerCourse(new Course<Worker>("������ ����", 8));
//		registerCourse(new Course<HighStudent>("����л� ����", 7));
//		
//		System.out.println();
//		
//		//registerCourseStudent(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourseStudent(new Course<Student>("�л� ����", 10));
//		//registerCourseStudent(new Course<Worker>("������ ����", 8));
//		registerCourseStudent(new Course<HighStudent>("����л� ����", 7));
//		
//		System.out.println();
//		
//		registerCourseWorker(new Course<Person>("�Ϲ��� ����", 5));
//		//registerCourseWorker(new Course<Student>("�л� ����", 10));
//		registerCourseWorker(new Course<Worker>("������ ����", 8));
//		//registerCourseWorker(new Course<HighStudent>("����л� ����", 7));
//		
//		System.out.println();
		
		//���� Course������ �ؼ� Ȯ���ϴ� ����
		Course<Person> perCourse = new Course<Person>("�Ϲ��� ����", 3);
		perCourse.add(new Person("�Ϲ���1"));
		perCourse.add(new Person("�Ϲ���2"));
		perCourse.add(new Person("�Ϲ���3"));
		//perCourse.add(new Person("����л�")); 3�� ���� arrayindex out of bounds exception
		
		registerCourse(perCourse);
		//registerCourseStudent(perCourse); ����Ÿ��
		registerCourseWorker(perCourse);
		
		Course<Student> sCourse = new Course<Student>("�л� ����", 3);
		perCourse.add(new Student("ȫ�浿"));
		perCourse.add(new Student("�迬��"));
		perCourse.add(new Student("��â��"));
		
		registerCourse(sCourse);
		registerCourseStudent(sCourse);
		//registerCourseWorker(sCourse); �ƹ� ���谡 ���� Ŭ����
		
		Course<Worker> wCourse = new Course<Worker>("������ ����", 3);
		perCourse.add(new Worker("��븮"));
		perCourse.add(new Worker("�ڰ���"));
		perCourse.add(new Worker("������"));
		
		registerCourse(wCourse);
		//registerCourseStudent(wCourse); �ƹ� ���谡 ���� Ŭ����
		registerCourseWorker(wCourse);

	}

}
