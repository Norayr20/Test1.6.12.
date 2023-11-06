public class PrintTextPerRole {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };

        String[] textLines = {
                "Городничий: Я прошу заметить, что не все из нас могут быть виновными.",
                "Аммос Федорович: Все могут быть виновными.",
                "Городничий: Но не все из нас могут быть виновными.",
                "Артемий Филиппович: Я согласен с городничим.",
                "Лука Лукич: И я согласен с городничим."
        };

        String result = printTextPerRole(roles, textLines);
        System.out.println(result);
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            String role = roles[i];
            result.append(role).append(":\n");

            for (int j = 0; j < textLines.length; j++) {
                String textLine = textLines[j];

                if (textLine.startsWith(role + ":")) {
                    result.append(j + 1).append(")").append(textLine.substring(role.length() + 1)).append("\n");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
