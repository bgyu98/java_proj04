package chapter02.bytecode;

class A {		//A.class
}
class B {		//B.class
}
class C {		//C.class
	class D {	//C$D.class
	}
}
public class ByteCode {		//ByteCode.class
	public static void main(String[] args) {
	//하나의 Java 소스파일에서 여러개의 클래스 생성시 컴파일 파일 출력.
	//public class는 하나만 와야 한다.
	//public class의 파일이름이 java 파일 이름으로 지정 되어야 한다.

	}

}
