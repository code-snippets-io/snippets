import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
                                
public class AutomationApplication {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("java", "python", null, "c#");
                                        
        List<String> result = myList.stream().filter(Objects::nonNull).collect(Collectors.toList());
                                
        result.forEach(System.out::println);
    }
}
