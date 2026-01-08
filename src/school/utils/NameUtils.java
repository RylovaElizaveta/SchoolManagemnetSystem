package school.utils;

public class NameUtils{
    public static  String formatFullName(String raw){
        // Убираем лишние пробелы
        String clean = raw.trim().replaceAll("\\s+", " ");
    
    // Разбиваем на слова
        String[] words = clean.split(" ");
        String result = "";
    
    // Обрабатываем каждое слово
        for (String word : words) {
            if (word.isEmpty()) continue;
        
        // Делаем первую букву заглавной, остальные - маленькими
            word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        
            result += word + " ";
        }
    
        return result.trim();
    }

    public static String getShortName(String fullName){
        String[] words = formatFullName(fullName).split(" ");
        String result = "";
    
        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.charAt(0) + ".";
            }
        }
    
        return result;
    }

    public static boolean isValidName(String name){
       if (name.length() < 3 || name.length() > 50) {
            return false;
        }
        
        // Проверка допустимых символов: буквы, цифры, пробелы, дефисы
        return name.matches("^[a-zA-Zа-яА-Я\\s\\-]+$");
    }
}