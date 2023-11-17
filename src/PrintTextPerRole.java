import java.util.HashMap;

public class PrintTextPerRole {
    public static void main(String[] args) {
        String[] roles = {"Городничи", "Лука Лукич", "Аммос Федорович"};
        String[] textLines = {
                "Городничи: Привет!",
                "Аммос Федорович: Привет, Городничи.",
                "Лука Лукич: Здравствуйте.",
                "Лука Лукич: Как дела?",
                "Городничи: Нормально. Как у вас?",
                "Аммос Федорович: Всё отлично."
        };
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        HashMap<String, StringBuilder> roleMap = new HashMap<>();

        for (String role : roles) {
            roleMap.put(role, new StringBuilder());
        }
        for (int i = 0; i < textLines.length; i++) {
            String line = textLines[i];
            for (String role : roles) {
                if (line.startsWith(role + ":")) {
                    StringBuilder roleText = roleMap.get(role);
                    roleText.append((i + 1) + ") " + line.substring(role.length() + 1) + "\n");
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role + ":\n" + roleMap.get(role) + "\n\n");
        }

        return result.toString();
    }
}
