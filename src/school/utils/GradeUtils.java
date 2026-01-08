package school.utils;

public class GradeUtils{
    public static boolean isValidGradeValue(int value){
        if (value >= 1 && value <=5){
            return true;
        }else{
            return false;
        }
    }

    public static  String getGradeDescription(int value){
        switch (value) {
            case 5: return "Excellent";
            case 4: return "Good";
            case 3: return "Satisfactory";
            case 2: return "Poor";
            case 1: return "Very Poor";
            default: return "Unknown";
        }
    }
}