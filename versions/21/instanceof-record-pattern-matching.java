public class InstanceofRecordPatternMatchingExample {
    public static void main(String[] args) {
        Object o = new MyRecord("value");
        if (o instanceof MyRecord(String value)) {  // Record pattern matching
            System.out.println(value);
        }
    }

    record MyRecord(String value) {}
}