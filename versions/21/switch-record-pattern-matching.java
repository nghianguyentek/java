public class SwitchRecordPatternMatchingExample {
    public static void main(String[] args) {
        MyRecord<MyInterface> o = new MyRecord<>(new MyClass());
        switch (o) {
            case MyRecord<MyInterface>(MyClass myClass) -> System.out.println(myClass.value());
            default -> throw new IllegalArgumentException("Unsupported");
        }

        o = new MyRecord<>(new MyOtherRecord("another value"));
        switch (o) {
            case MyRecord<MyInterface>(MyClass myClass) -> System.out.println(myClass.value());
            case MyRecord<MyInterface>(MyOtherRecord(String value)) -> System.out.println(value);
            default -> throw new IllegalArgumentException("Unsupported");
        }
    }

    interface MyInterface {
        String value();
    }

    static class MyClass implements MyInterface {
        public String value() { return "value"; }
    }
    record MyRecord<T extends MyInterface>(T value) {}

    record MyOtherRecord(String value) implements MyInterface {}
}