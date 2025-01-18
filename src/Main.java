public class Main {
    static public void main(String[] args) {


        // Stack 생성
        DojeStack<String> stack = new DojeStack<>();
        // 데이터 추가 (push)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        // 최상단 데이터 조회 (peek)
        System.out.println("Top element: " + stack.peek()); // Cherry

        // 데이터 추출 (pop)
        System.out.println("Popped element: " + stack.pop()); // Cherry

        // 스택 상태 출력
        System.out.println("Stack: " + stack); // [Apple, Banana]
        // 특정 요소 검색 (search)
        System.out.println("Position of 'Apple': " + stack.search("Apple")); // 2
    }
}
