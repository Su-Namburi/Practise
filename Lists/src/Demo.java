import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
//        for(List<String> innerList : skillList) {
//            for(String skill : innerList) {
//                allSkills.add(skill);
//                if(skill.startsWith("s")) {
//                    skillWithS.add(skill);
//                }
//            }
//        }
        allSkills = skillList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(allSkills);
        skillWithS = allSkills.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(skillWithS);
        List<String> upper = allSkills.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);

        Collections.sort(allSkills,Collections.reverseOrder());
        System.out.println(allSkills);
    }
}
