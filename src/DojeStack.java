import java.util.Arrays;
import java.util.EmptyStackException;

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

    private void resize()
    {
        //외부에서 resize메서드를 따로 호출하는 일은 없기때문에 private으로 선언한다.
        int now_capacity = stack.length-1;
        if(now_capacity == top)
        {
            int new_capacity = stack.length * 2;
            stack = Arrays.copyOf(stack, new_capacity);
            return;
        }
        else if (now_capacity/2 > top)
        {
            int new_capacity = stack.length / 2;
            //절반을 취한것 vs 최소 크기 중에 더 큰 값을 취한다.
            stack = Arrays.copyOf(stack, Math.max(new_capacity,DEFALT_CAPACITY));
            return;
        }
    }
    public T push(T value)
    {
        //top값이 초기에 -1이기에 선위연산을 이용해서 먼저 증가하게 한 이후에 value값을 넣어준다.
        stack[++top] = value;
        //이후 배열의 크기를 resize시켜준다.
        resize();
        return value;
    }
    public T pop()
    {
        //배열에 요소가 없는데 제거하려고 하는경우 예외처리
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        T value = stack[top];
        stack[top--] = null;
        resize();
        return value;
    }
}
