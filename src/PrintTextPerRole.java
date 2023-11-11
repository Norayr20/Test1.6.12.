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
        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            result.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    result.append((i + 1) + ") " + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
