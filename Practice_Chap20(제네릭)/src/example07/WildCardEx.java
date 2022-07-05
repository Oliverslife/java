package example07;

import java.util.Arrays;

public class WildCardEx {
	
	//?�� ��� ��ü�� �� �ްڴٴ� ��
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}
	
	//Student�̰ų� Student�� ��ӹ޴� Ŭ����(����Ŭ�����鸸 ���� �� �ִ�.)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}
	
	//WorkerŬ�����̰ų� ����Ŭ�����鸸 ���� �� �ִ�.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));		
	}

	public static void main(String[] args) {
		registerCourse(new Course<Person>("�Ϲ��� ����", 5));
		registerCourse(new Course<Student>("�л� ����", 10));
		registerCourse(new Course<Worker>("������ ����", 8));
		registerCourse(new Course<HighStudent>("����л� ����", 7));
		
		System.out.println();
		
		//registerCourseStudent(new Course<Person>("�Ϲ��� ����", 5));
		registerCourseStudent(new Course<Student>("�л� ����", 10));
		//registerCourseStudent(new Course<Worker>("������ ����", 8));
		registerCourseStudent(new Course<HighStudent>("����л� ����", 7));
		
		System.out.println();
		
		registerCourseWorker(new Course<Person>("�Ϲ��� ����", 5));
		//registerCourseWorker(new Course<Student>("�л� ����", 10));
		registerCourseWorker(new Course<Worker>("������ ����", 8));
		//registerCourseWorker(new Course<HighStudent>("����л� ����", 7));

	}

}
