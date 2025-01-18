public class DojeStack<T> {
    private int top; // 스택의 최상단 인덱스
    private T[] stack; // 스택 데이터를 저장할 배열
    private static final int DEFALT_CAPACITY = 6; // 스택 용량

    // 생성자: 초기 용량 설정
    @SuppressWarnings("unchecked") // 배열을 제네릭으로 캐스팅할 때 경고 제거
    public DojeStack() {
        this.stack = (T[]) new Object[DEFALT_CAPACITY]; // 제네릭 배열 생성
        this.top = -1; // 초기화
    }

    public boolean isEmpty() {
        //배열이 비어있는경우에 true를 반환해줌
        if(this.top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull() {
        //배열이 꽉 차있는경우 true를 반환해줌
        if(this.top == stack.length -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
