import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<List<String>> skillList = Arrays.asList(
                Arrays.asList("java","spring","springboot"),
                Arrays.asList("cpp","html","css"),
                Arrays.asList("sql","postgres","node")
        );
        List<String> allSkills = new ArrayList<>();
        List<String> skillWithS = new ArrayList<>();
        for(List<String> innerList : skillList) {
            for(String skill : innerList) {
                allSkills.add(skill);
                if(skill.startsWith("s")) {
                    skillWithS.add(skill);
                }
            }
        }
        List<String> all = skillList.stream().flatMap(List :: stream).collect(Collectors.toList());
        List<String> st = allSkills.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());

        //System.out.println(allSkills);
        //System.out.println(skillWithS);
        System.out.println(st);
    }
}
