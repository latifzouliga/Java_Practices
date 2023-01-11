package randomPackage.officeHours;

import java.util.*;

public class MapPractices {
    public static void main(String[] args) {

        Map<String,Object> emp1 = new HashMap<>();
        emp1.put("EmpID",123);
        emp1.put("EmpName","John");
        emp1.put("JobTitle","SDET");
        emp1.put("Salary",100_000.00);

        System.out.println("emp1 = " + emp1);

        List<String> keys = new ArrayList<>();
        keys.addAll(Arrays.asList("EmpID","EmpName","JobTitle","Salary"));

        List<Object> emp2Data = new ArrayList<>();
        emp2Data.addAll(Arrays.asList(124,"Mike","Dev",125_000.00));

        List<Object> emp3Data = new ArrayList<>();
        emp3Data.addAll(Arrays.asList(125,"Irina","QA",110_000.00));

        Map<String,Object> emp2 = new HashMap<>();
        Map<String,Object> emp3 = new HashMap<>();

        for (int i = 0; i < keys.size() ; i++) {
            emp2.put(keys.get(i), emp2Data.get(i));
            emp3.put(keys.get(i), emp3Data.get(i));
        }

      List<Map<String,Object>> companyX = new ArrayList<>();
        companyX.add(emp1);
        companyX.add(emp2);
        companyX.add(emp3);

        System.out.println("companyX = " + companyX);

    // Task: Get me the person who has the highest salary
        /*
        Algorithm:
        1. Iterate inside companyX list for each employee
        2. using "Salary" key, get each employees salary and compare
         */
        
        double maxSalary = Double.MIN_VALUE;
        String empWhoMakesMaxSalary = "";

        for (Map<String, Object> eachEmployee : companyX) {
            double eachSalary = (double) eachEmployee.get("Salary");
            if(eachSalary > maxSalary){
                maxSalary = eachSalary;
                empWhoMakesMaxSalary = (String) eachEmployee.get("EmpName");
            }
        }


        System.out.println("maxSalary = " + maxSalary);
        System.out.println("empWhoMakesMaxSalary = " + empWhoMakesMaxSalary);
        




    }




}