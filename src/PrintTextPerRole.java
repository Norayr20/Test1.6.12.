import java.util.HashMap;

public class PrintTextPerRole {
    public static void main(String[] args) {
        String[] roles = {"Городничи", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
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
