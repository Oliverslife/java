package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {

	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override
	public int hashCode() {
		//하위호환을 위해서는 아래와 같이 작성을 하면 된다.(구버전)
		//return this.age + this.name.hashCode() + Arrays.toString(this.arr).hashCode();
		
		//신규개발할 때, 아래와 같이 작성을 하면 해쉬코드 얻기가 상당히 수월하다.(신버전)
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr));
	}
	
}
