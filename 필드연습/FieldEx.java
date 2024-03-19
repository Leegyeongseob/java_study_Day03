package 필드연습;
// 필드란? 클래스 내부에 선언된 변수를 의미 합니다. 즉, 클래스로 생성된 각각의 객체마다 별도의 값을 저장하는 용도
// 인스턴스 필드를 의미(객체가 생성될 때 마다 생성됨)
// 접근제한자를 가짐 (private, default(키워드 아님, 접근제한자를 지정하지 않으면 default), protected, public)
// 데이터 타입 : 어떤 타입의 데이터를 저장할지 지정
// static 키워드를 사용하면 클래스 변수(필드)하고 하며, 객체 생성시 생성되지 않고 클래스 생성시 단 한번만 생성
// 필드의 값을 읽고 쓰기 위해서 게터와 세터를 만들어 주는 것이 일반적인 문법(스프링부트에서 롬복 사용으로 대체 가능)

public class FieldEx {
    public static void main(String[] args) {
        int localVal = 30; // 지역 변수, stack 영역에 생성됨, { }범위 내에서만 생존 함, 초기화 되지 않음
        FiledClass filed1 = new FiledClass(); // 인스턴스(객체) 생성
        FiledClass filed2 = new FiledClass(); // 두번째 인스턴스 생성

        // 인스턴스 필드에서 값 대입 (참조 변수로 접근), 객체 생성 개수 만큼 생성 됨
        filed1.instanceVar = 1000;
        filed2.instanceVar = 2000;

        // 클래스 변수 : 클래스 생성 시 생성되고 클래스 이름 접근
        FiledClass.classVar = 3000;

        System.out.println("지역 변수 : " + localVal);
        System.out.println("인스턴스 필드 : " + filed1.instanceVar);
        System.out.println("인스턴스 필드 : " + filed2.instanceVar);
        System.out.println("클래스 필드 : " + FiledClass.classVar);


    }
}

class FiledClass {
    int instanceVar = 20; // 인스턴스 변수(필드), 객체 생성 시 생성 됨, 힙 영역에 할당 됨
    static int classVar = 10; // 클래스 변수(필드), 클래스 생성 시 생성 됨, 메소드(static)영역에 할당 됨
}
