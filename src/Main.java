public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordChecker wrdChecker = new WordChecker(text);
        System.out.printf("Слово \"amet\" найдено: %b\n", wrdChecker.hasWord("amet"));
        System.out.printf("Слово \"eiusmod\" найдено: %b\n", wrdChecker.hasWord("eiusmod"));

        System.out.printf("Слово \"Test\" найдено: %b\n", wrdChecker.hasWord("Test"));
        System.out.printf("Слово \"Fast\" найдено: %b\n", wrdChecker.hasWord("Fast"));
    }
}