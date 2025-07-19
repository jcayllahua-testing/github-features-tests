package com.test.testfeaturesfromgithub.business;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public class BusinessClass {

    public void deeplyNestedMethod(List<Map<String, Object>> data) {
        if (data != null) {  // Level 1
            for (Map<String, Object> item : data) {  // Level 2
                if (item.containsKey("status")) {  // Level 3
                    if ("ACTIVE".equals(item.get("status"))) {  // Level 4 - BAD: Exceeds 3 levels
                        System.out.println("Active item found");
                    }
                }
            }
        }
    }

    public void anotherDeeplyNestedMethod(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {  // Level 1
            for (int j = 0; j < matrix[i].length; j++) {  // Level 2
                if (matrix[i][j] > 0) {  // Level 3
                    while (matrix[i][j] > 10) {  // Level 4 - BAD: Exceeds 3 levels
                        matrix[i][j] = matrix[i][j] / 2;
                    }
                }
            }
        }
    }

    public void extremelyNestedMethod(String input) {
        if (input != null) {  // Level 1
            if (input.length() > 0) {  // Level 2
                for (char c : input.toCharArray()) {  // Level 3
                    if (Character.isLetter(c)) {  // Level 4 - BAD
                        if (Character.isUpperCase(c)) {  // Level 5 - BAD
                            System.out.println("Upper case letter: " + c);
                        }
                    }
                }
            }
        }
    }
}
