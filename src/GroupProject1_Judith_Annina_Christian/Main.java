package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Dark", new String[]{"Math", "Biology", "Physics"});
        Teacher t2 = new Teacher("Mrs. Golightly",new String[]{"English", "Art", "Geography"});
        Teacher t3 = new Teacher("Mr. Just",new String[]{"PhyEdu", "Math", "Physics"});
        Teacher t4 = new Teacher("Mr. Happy", new String[]{"PhyEdu", "Geography", "English"});
        Teacher t5 = new Teacher("Mr. Gloriuous", new String[]{"Art", "Biology", "Geography"});
        Teacher t6 = new Teacher("Mr. Brilliant", new String[]{"English", "Math", "Art"});
        Teacher t7 = new Teacher("Mrs. Absolute", new String[]{"PhyEdu", "Georgraphy", "Math"});
        Teacher t8 = new Teacher("Mrs. Lord", new String[]{"Art", "PhyEdu", "Physics"});
        Teacher t9 = new Teacher("Mrs. King", new String[]{"English", "Biology", "Physics"});
        Teacher t10 = new Teacher("Mrs. Allknows",new String[]{"PhyEdu", "Geography", "English"} );
        Teacher t11 = new Teacher("Mrs. Onpoint", new String[]{"Biology", "Georgraphy", "Art"});
        Teacher t12 = new Teacher("Mrs. Strong", new String[]{"Physics", "PhyEdu", "Math"});
        Teacher t13 = new Teacher("Mr. Nothappy", new String[]{"Biology", "Math", "Physics"});
        Teacher t14 = new Teacher("Mr. Sure", new String[]{"Art", "Biology", "Math"});

        String[] subjects = {"Math", "English", "Biology", "Geography", "Physics", "Art", "PhyEdu"};

        HashMap<String, Integer> pointsSt1 = new HashMap<>();
        pointsSt1.put("Math",78);
        pointsSt1.put("English",78);
        pointsSt1.put("Biology",78);
        pointsSt1.put("Geography",78);
        pointsSt1.put("Physics",78);
        pointsSt1.put("Art",78);
        pointsSt1.put("PhyEdu",78);

        Student st1 = new Student("Benni", 7, subjects, "benniParents@email.com", "Ada Cool", "Adam Cool");


    }
}
