
package day01;

import java.util.Arrays;

public class DeveloperProfile {

    public static void main(String[] args) {

        String name = "Syed Ali Awsaf";
        String profession = "Software Developer";
        String location = "Virginia, USA";
        String degree = "B.Sc. in Computer Science and Engineering";

        //Integer
        byte age = 26;
        short graduationYear = 2025;
        int employeeId = 1001;
        long totalCodingHours = 2500L;

        // 3. Floating
        float codingSkillPercentage = 85.5f;
        double cgpa = 3.42;

        // 4. Character
        char grade = 'A';

        // 5. Boolean
        boolean currentlyLearningJava = true;
        boolean openToWork = true;

        // 6. Array
        String[] programmingLanguages = {
                "Java", "Python", "C++", "JavaScript"
        };

        int[] projectCounts = {3, 5, 2};

        // 7. Object
        DeveloperProfile developer = new DeveloperProfile();


        System.out.println("       DEVELOPER PROFILE");


        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Location: " + location);
        System.out.println("Degree: " + degree);

        System.out.println("----------------------------------");
        System.out.println("PERSONAL DETAILS");
        System.out.println("Age: " + age);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Total Coding Hours: " + totalCodingHours);
        System.out.println("----------------------------------");

        System.out.println("ACADEMIC DETAILS");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Coding Skill: " + codingSkillPercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("----------------------------------");

        System.out.println("CAREER STATUS");
        System.out.println("Learning Java: " + currentlyLearningJava);
        System.out.println("Open to Work: " + openToWork);
        System.out.println("----------------------------------");

        System.out.println("TECHNICAL SKILLS");
        System.out.println("----------------------------------");

        System.out.println("Programming Languages: "
                + Arrays.toString(programmingLanguages));
        System.out.println("Project Counts: "
                + Arrays.toString(projectCounts));

        System.out.println("OBJECT INFORMATION");
        System.out.println("----------------------------------");

        System.out.println("Developer Object: " + developer);


        System.out.println("       PROFILE COMPLETED");
        System.out.println("==================================");
    }
}
