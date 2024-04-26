# Pattern Matching For `switch`

## `switch` and `null`

```
public class SwithAndNullExample {
    public static void main(String[] args) {
        String s = null;
        print(s);

        s = "not";
        print(s);

        s = "a normal string";
        print(s);
    }

    static void print(String s) {
        String value = switch (s) {
            case null -> "null";
            case String str when str.equals("not") -> "not null";
            default -> s;
        };

        System.out.println("s is " + value);
    }
}
```