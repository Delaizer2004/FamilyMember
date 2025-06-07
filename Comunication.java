
import java.util.*;

class FamilyMember {
    private String name;
    private int age;
    private String profession;
    private String englishLevel;
    private Map<String, String> relationships;

    public FamilyMember(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.englishLevel = "A1"; 
        this.relationships = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void addRelationship(String familyMember, String relationship) {
        relationships.put(familyMember, relationship);
    }

    public void displayInfo() {
        System.out.println(name + " (" + age + " років, " + profession + ") - Рівень англійської: " + englishLevel);
    }

    public void speak(FamilyMember toWhom) {
        String relationship = relationships.getOrDefault(toWhom.getName(), "Родич");
        System.out.println(name + " до " + toWhom.getName() + ": " + generateUniqueDialogue(toWhom, relationship));
    }

    private String generateUniqueDialogue(FamilyMember toWhom, String relationship) {
        
        switch (name) {
            case "Батько":
                return fatherDialogue(toWhom, relationship);
            case "Мати":
                return motherDialogue(toWhom, relationship);
            case "Перша донька":
                return firstDaughterDialogue(toWhom, relationship);
            case "Друга донька":
                return secondDaughterDialogue(toWhom, relationship);
            case "Перший син":
                return firstSonDialogue(toWhom, relationship);
            case "Другий син":
                return secondSonDialogue(toWhom, relationship);
            case "Третій син":
                return thirdSonDialogue(toWhom, relationship);
            case "Перша бабуся":
                return firstGrandmotherDialogue(toWhom, relationship);
            case "Друга бабуся":
                return secondGrandmotherDialogue(toWhom, relationship);
            case "Перший дідусь":
                return firstGrandfatherDialogue(toWhom, relationship);
            case "Другий дідусь":
                return secondGrandfatherDialogue(toWhom, relationship);
            default:
                return "Hi! It's nice to have you as my " + relationship + ".";
        }
    }


    private String fatherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, my wife! You are an amazing " + relationship + "." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                case "A2" -> "Hello, dear! I appreciate you as my " + relationship + "." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                case "B1" -> "Good day, sweetheart! Our bond as " + relationship + " is special." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                case "B2" -> "Hi, love! I admire all you do as my " + relationship + "." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                case "C1" -> "Hello, my darling! You inspire me every day as my " + relationship + "." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                case "C2" -> "Good day, my dear! I cherish every moment we share as " + relationship + "." + "How was your day, my dear?" +
                "I love spending time with you." +
                "You always know how to make me smile." +
                "I'm so grateful for everything you do." +
                "You are the heart of our family." +
                "I appreciate how hard you work every day." +
                "You make our house feel like a home." +
                "I can't imagine life without you." +
                "You are an amazing mother and partner.";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, my sweet daughter! You are the best " + relationship + "." + "How was school today?\n" +
                        "You’ve been working hard, I’m proud of you.\n" +
                        "I love how you always try your best.\n" +
                        "I can’t wait to hear about your day.\n" +
                        "Let’s spend some time together this evening.\n" +
                        "I hope you’re feeling happy and confident.\n" +
                        "You always brighten my day.\n" +
                        "You are such a wonderful.";
                case "A2" -> "Hello, dear! I am proud of you as my " + relationship + "." + "How was school today?\n" +
                "You’ve been working hard, I’m proud of you.\n" +
                "I love how you always try your best.\n" +
                "I can’t wait to hear about your day.\n" +
                "Let’s spend some time together this evening.\n" +
                "I hope you’re feeling happy and confident.\n" +
                "You always brighten my day.\n" +
                "You are such a wonderful.";
                case "B1" -> "Good day, daughter! You bring joy to my life as my " + relationship + "." + "How was school today?\n" +
                "You’ve been working hard, I’m proud of you.\n" +
                "I love how you always try your best.\n" +
                "I can’t wait to hear about your day.\n" +
                "Let’s spend some time together this evening.\n" +
                "I hope you’re feeling happy and confident.\n" +
                "You always brighten my day.\n" +
                "You are such a wonderful.";
                case "B2" -> "Hi, my precious! Your achievements as my " + relationship + " make me happy." + "How was school today?\n" +
                "You’ve been working hard, I’m proud of you.\n" +
                "I love how you always try your best.\n" +
                "I can’t wait to hear about your day.\n" +
                "Let’s spend some time together this evening.\n" +
                "I hope you’re feeling happy and confident.\n" +
                "You always brighten my day.\n" +
                "You are such a wonderful.";
                case "C1" -> "Hello, my lovely daughter! I am amazed by your growth as my " + relationship + "." + "How was school today?\n" +
                "You’ve been working hard, I’m proud of you.\n" +
                "I love how you always try your best.\n" +
                "I can’t wait to hear about your day.\n" +
                "Let’s spend some time together this evening.\n" +
                "I hope you’re feeling happy and confident.\n" +
                "You always brighten my day.\n" +
                "You are such a wonderful.";
                case "C2" -> "Good day, dear! Seeing you thrive as my " + relationship + " is my biggest reward." + "How was school today?\n" +
                "You’ve been working hard, I’m proud of you.\n" +
                "I love how you always try your best.\n" +
                "I can’t wait to hear about your day.\n" +
                "Let’s spend some time together this evening.\n" +
                "I hope you’re feeling happy and confident.\n" +
                "You always brighten my day.\n" +
                "You are such a wonderful.";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, my dear daughter! You are a fantastic " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                case "A2" -> "Hello, sweetie! I feel lucky to have you as my " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                case "B1" -> "Good day, my girl! You are a star as my " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                case "B2" -> "Hi, my shining star! Your love as my " + relationship + " brightens my days." + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                case "C1" -> "Hello, my dear daughter! Your kindness as my " + relationship + " inspires me." + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                case "C2" -> "Good day, dear! You are a blessing to me as my " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I love seeing you learn new things every day.\n" +
                        "You bring so much joy into our lives.\n" +
                        "I can’t wait to hear all about your day.\n" +
                        "You always make everything seem so much fun.\n" +
                        "Let’s spend some time together tonight.\n" +
                        "I’m so proud of everything you do.\n" +
                        "You’re doing an amazing job!";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, son! You are an awesome " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                case "A2" -> "Hello, my dear boy! I am so happy to have you as my " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                case "B1" -> "Good day, son! Your hard work as my " + relationship + " makes me proud." + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                case "B2" -> "Hi, my dear boy! You are a shining example of strength as my " + relationship + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                case "C1" -> "Hello, son! Your dedication as my " + relationship + " inspires me deeply." + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                case "C2" -> "Good day, son! Seeing your growth as my " + relationship + " is a true blessing." + ".\n" +
                        "How was school today?\n" +
                        "I’m proud of all the effort you put into your work.\n" +
                        "Let’s do something fun together this weekend.\n" +
                        "You make me smile every day.\n" +
                        "I hope you had a great day.\n" +
                        "Keep up the good work!\n" +
                        "What’s your plan for the evening?\n" +
                        "I’m here if you need anything.";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, my younger son! You are my pride as my " + relationship + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                case "A2" -> "Hello, boy! I see great potential in you as my " + relationship + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                case "B1" -> "Good day, dear! Your efforts as my " + relationship + " amaze me." + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                case "B2" -> "Hi, my boy! You are growing into an incredible " + relationship + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                case "C1" -> "Hello, dear son! You inspire me every day as my " + relationship + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                case "C2" -> "Good day, son! I am grateful to see your journey as my " + relationship + ".\n" +
                        "How was your day at school?\n" +
                        "I’m proud of you for all the hard work you’re putting in.\n" +
                        "Let’s do something fun together soon.\n" +
                        "You make me proud every day.\n" +
                        "What did you learn today?\n" +
                        "Keep working hard, you’re doing great!\n" +
                        "I hope you had a good time with your friends.\n" +
                        "I’m always here to help you.";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, my dear grandma! You are the best " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "A2" -> "Hello, grandma! I appreciate you as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "B1" -> "Good day, grandma! You brighten my life as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " makes me proud." + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "C1" -> "Hello, grandma! Your love and care as my " + relationship + " inspire me." + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "C2" -> "Good day, grandma! I cherish every moment with you as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, dear grandma! You are such a wonderful " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "A2" -> "Hello, grandma! I am so lucky to have you as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "B1" -> "Good day, grandma! You bring warmth to my heart as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "B2" -> "Hi, grandma! Your kindness as my " + relationship + " is unmatched." + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "C1" -> "Hello, grandma! You fill my life with joy as my " + relationship + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                case "C2" -> "Good day, grandma! Your wisdom and love as my " + relationship + " are precious." + ".\n" +
                "I hope you’re feeling well.\n" +
                "I’m so happy we can spend time together.\n" +
                "How did your day go?\n" +
                "I’m thinking of bringing the kids over this weekend.\n" +
                "We all miss you.\n" +
                "I hope you’re not feeling too tired.\n" +
                "Please take care of yourself.\n" +
                "Let me know if you need anything.\n" +
                "I love you!";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You are the best " + relationship + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "A2" -> "Hello, grandpa! I am lucky to have you as my " + relationship + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "B1" -> "Good day, grandpa! Your strength as my " + relationship + " is inspiring." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "B2" -> "Hi, grandpa! Your experiences as my " + relationship + " are invaluable." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "C1" -> "Hello, grandpa! Your wisdom and humor as my " + relationship + " guide me." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "C2" -> "Good day, grandpa! Your presence as my " + relationship + " is a gift." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "A2" -> "Hello, grandpa! You make my life brighter as my " + relationship + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "B1" -> "Good day, grandpa! Your wisdom as my " + relationship + " guides me." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " brings me peace." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "C1" -> "Hello, grandpa! Your strength and love as my " + relationship + " inspire me." + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                case "C2" -> "Good day, grandpa! You are a source of wisdom and joy as my " + relationship + ".\n" + "I hope you’re doing well.\n" +
                    "How was your day?\n" +
                    "I’m planning to visit you soon.\n" +
                    "The kids are doing fine, they miss you.\n" +
                    "Take care, dad.\n" +
                    "I hope you’re not too tired.\n" +
                    "If you need anything, let me know.\n" +
                    "I love you!";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String motherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Батько" -> switch (englishLevel) {
                case "A1" -> "Hi, my husband! You're my rock as my " + relationship + ".";
                case "A2" -> "Hello, love! I appreciate you as my " + relationship + ".";
                case "B1" -> "Good day, my dear! Our connection as my " + relationship + " is unbreakable.";
                case "B2" -> "Hi, darling! You make every day better as my " + relationship + ".";
                case "C1" -> "Hello, my love! Your presence as my " + relationship + " brings me peace.";
                case "C2" -> "Good day, my dear! Every moment with you as my " + relationship + " is a gift.";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, my sweet daughter! You're the best " + relationship + ".";
                case "A2" -> "Hello, dear! I'm proud of you as my " + relationship + ".";
                case "B1" -> "Good day, daughter! You make me proud as my " + relationship + ".";
                case "B2" -> "Hi, my precious! Watching you grow as my " + relationship + " fills me with joy.";
                case "C1" -> "Hello, my lovely daughter! You're truly amazing as my " + relationship + ".";
                case "C2" -> "Good day, dear! Seeing you succeed as my " + relationship + " makes me so proud.";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, my dear daughter! You're an incredible " + relationship + ".";
                case "A2" -> "Hello, sweetie! You're a star as my " + relationship + ".";
                case "B1" -> "Good day, daughter! Your hard work as my " + relationship + " inspires me.";
                case "B2" -> "Hi, my shining star! You brighten my days as my " + relationship + ".";
                case "C1" -> "Hello, my dear daughter! Your love as my " + relationship + " lifts me up.";
                case "C2" -> "Good day, dear! Watching you flourish as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, son! You're an awesome " + relationship + ".";
                case "A2" -> "Hello, dear! I'm so proud of you as my " + relationship + ".";
                case "B1" -> "Good day, son! Your efforts as my " + relationship + " make me proud.";
                case "B2" -> "Hi, my boy! You're an amazing " + relationship + ".";
                case "C1" -> "Hello, son! You're an inspiration to me as my " + relationship + ".";
                case "C2" -> "Good day, son! You're growing into an outstanding " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, my son! You're my pride as my " + relationship + ".";
                case "A2" -> "Hello, boy! I see great things in you as my " + relationship + ".";
                case "B1" -> "Good day, son! Your efforts as my " + relationship + " amaze me.";
                case "B2" -> "Hi, my boy! You're growing into a remarkable " + relationship + ".";
                case "C1" -> "Hello, son! Your dedication as my " + relationship + " inspires me every day.";
                case "C2" -> "Good day, son! I'm grateful to see you flourish as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandma! I appreciate you as my " + relationship + ".";
                case "B1" -> "Good day, grandma! You make everything better as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a gift.";
                case "C1" -> "Hello, grandma! Your care as my " + relationship + " is an inspiration.";
                case "C2" -> "Good day, grandma! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're wonderful as my " + relationship + ".";
                case "A2" -> "Hello, grandma! I feel lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your warmth as my " + relationship + " makes my day.";
                case "B2" -> "Hi, grandma! Your kindness as my " + relationship + " means everything.";
                case "C1" -> "Hello, grandma! Your love as my " + relationship + " fills me with joy.";
                case "C2" -> "Good day, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire you as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom as my " + relationship + " is inspiring.";
                case "B2" -> "Hi, grandpa! Your stories as my " + relationship + " are priceless.";
                case "C1" -> "Hello, grandpa! Your experience as my " + relationship + " guides me.";
                case "C2" -> "Good day, grandpa! Your presence as my " + relationship + " is a blessing.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! You bring so much joy as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom as my " + relationship + " guides me every day.";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " brings me peace.";
                case "C1" -> "Hello, grandpa! Your strength and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandpa! You are a source of joy and wisdom as my " + relationship + ".";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String firstSonDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, my mom! You are the best " + relationship + ".";
                case "A2" -> "Hello, dear mom! I am proud of you as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love as my " + relationship + " fills my heart.";
                case "B2" -> "Hi, my wonderful mom! I admire everything you do as my " + relationship + ".";
                case "C1" -> "Hello, mom! You inspire me every day as my " + relationship + ".";
                case "C2" -> "Good day, my dear mom! I cherish every moment we share as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are an amazing " + relationship + ".";
                case "A2" -> "Hello, my dear sister! I appreciate you as my " + relationship + ".";
                case "B1" -> "Good day, sis! You brighten my life as my " + relationship + ".";
                case "B2" -> "Hi, my precious sister! Your love as my " + relationship + " fills me with joy.";
                case "C1" -> "Hello, dear sister! I admire your strength and kindness as my " + relationship + ".";
                case "C2" -> "Good day, my beloved sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, my sweet sister! You are the best " + relationship + ".";
                case "A2" -> "Hello, my sweet sister! I feel blessed to have you as my " + relationship + ".";
                case "B1" -> "Good day, sis! Your energy as my " + relationship + " lights up my world.";
                case "B2" -> "Hi, my shining star! I admire your strength and kindness as my " + relationship + ".";
                case "C1" -> "Hello, dear sister! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, my wonderful sister! I am so proud of you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, my awesome brother! You are my hero as my " + relationship + ".";
                case "A2" -> "Hello, dear brother! I am proud to have you as my " + relationship + ".";
                case "B1" -> "Good day, my brother! Your strength and courage as my " + relationship + " inspire me.";
                case "B2" -> "Hi, my strong brother! I admire your determination as my " + relationship + ".";
                case "C1" -> "Hello, my brother! Your dedication and kindness as my " + relationship + " motivate me.";
                case "C2" -> "Good day, my amazing brother! Watching you grow as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, my little brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, my dear brother! I am proud to have you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your energy and joy as my " + relationship + " brighten my days.";
                case "B2" -> "Hi, my bright star! You bring so much joy as my " + relationship + ".";
                case "C1" -> "Hello, dear brother! I admire your growth and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, my brother! Your kindness and strength as my " + relationship + " inspire me.";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are the best " + relationship + ".";
                case "A2" -> "Hello, grandma! I appreciate you as my " + relationship + ".";
                case "B1" -> "Good day, grandma! You bring warmth to my heart as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your love and wisdom as my " + relationship + " brighten my life.";
                case "C1" -> "Hello, grandma! Your kindness and care as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, grandma! I treasure every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, dear grandma! I feel lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, grandma! You make my world brighter as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your love as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! You inspire me every day with your love and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, grandma! You are the heart of our family as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You are the best " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire you as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your strength and wisdom as my " + relationship + " inspire me.";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " guides me through life.";
                case "C1" -> "Hello, grandpa! I treasure your stories and lessons as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your presence as my " + relationship + " fills me with gratitude.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I am lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom as my " + relationship + " guides me.";
                case "B2" -> "Hi, grandpa! Your love and experiences as my " + relationship + " enrich my life.";
                case "C1" -> "Hello, grandpa! Your wisdom and strength as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, grandpa! Your support and love as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String secondSonDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my best " + relationship + ".";
                case "A2" -> "Hello, dear mom! I love you as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your support as my " + relationship + " means a lot to me.";
                case "B2" -> "Hi, mom! Your kindness as my " + relationship + " inspires me.";
                case "C1" -> "Hello, mom! Your strength and love as my " + relationship + " help me grow.";
                case "C2" -> "Good day, mom! I am so grateful for everything you do as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I admire you as my " + relationship + ".";
                case "B1" -> "Good day, sis! Your energy as my " + relationship + " fills my heart.";
                case "B2" -> "Hi, sister! I appreciate everything you do as my " + relationship + ".";
                case "C1" -> "Hello, dear sister! I look up to you as my " + relationship + ".";
                case "C2" -> "Good day, my precious sister! You bring joy and wisdom to my life as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are awesome as my " + relationship + ".";
                case "A2" -> "Hello, dear sister! I am lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your love and care as my " + relationship + " brighten my day.";
                case "B2" -> "Hi, sister! Your laughter and love as my " + relationship + " bring joy to my life.";
                case "C1" -> "Hello, sister! I admire how you always make me smile as my " + relationship + ".";
                case "C2" -> "Good day, sister! Your wisdom and warmth as my " + relationship + " guide me every day.";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my role model as my " + relationship + ".";
                case "A2" -> "Hello, dear brother! I am proud to have you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your hard work as my " + relationship + " pushes me to do better.";
                case "B2" -> "Hi, brother! Your strength and support as my " + relationship + " help me grow.";
                case "C1" -> "Hello, brother! I admire your dedication and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, brother! Watching you succeed as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, little brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, dear brother! I appreciate you as my " + relationship + ".";
                case "B1" -> "Good day, brother! You are always there for me as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your energy and optimism as my " + relationship + " make me happy.";
                case "C1" -> "Hello, dear brother! I admire your creativity and courage as my " + relationship + ".";
                case "C2" -> "Good day, little brother! You always make me proud as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, grandma! I admire you as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "B2" -> "Hi, grandma! Your love as my " + relationship + " gives me strength.";
                case "C1" -> "Hello, grandma! Your wisdom and kindness as my " + relationship + " inspire me daily.";
                case "C2" -> "Good day, grandma! Your presence in my life as my " + relationship + " fills me with gratitude.";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, dear grandma! You make my life better as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your kindness as my " + relationship + " warms my heart.";
                case "B2" -> "Hi, grandma! Your love and care as my " + relationship + " inspire me.";
                case "C1" -> "Hello, grandma! Your strength and warmth as my " + relationship + " motivate me every day.";
                case "C2" -> "Good day, grandma! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You are my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire you as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom and experience as my " + relationship + " guide me.";
                case "B2" -> "Hi, grandpa! Your stories and love as my " + relationship + " inspire me.";
                case "C1" -> "Hello, grandpa! Your life lessons as my " + relationship + " shape my way of thinking.";
                case "C2" -> "Good day, grandpa! Your presence as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandpa! I am so happy to have you as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom as my " + relationship + " is invaluable.";
                case "B2" -> "Hi, grandpa! Your experiences as my " + relationship + " enrich my life.";
                case "C1" -> "Hello, grandpa! Your strength and kindness as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandpa! I am grateful for every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }
    
    private String thirdSonDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, dear mom! I appreciate everything you do for me as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and care as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! Your guidance and support as my " + relationship + " help me grow.";
                case "C1" -> "Hello, mom! Your wisdom and strength as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I am so thankful for your endless love as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my sweet " + relationship + ".";
                case "A2" -> "Hello, sister! Your kindness as my " + relationship + " always brightens my day.";
                case "B1" -> "Good day, sis! Your support as my " + relationship + " is truly invaluable.";
                case "B2" -> "Hi, sister! Your laughter as my " + relationship + " fills my life with joy.";
                case "C1" -> "Hello, sister! Your wisdom and care as my " + relationship + " guide me through tough times.";
                case "C2" -> "Good day, sister! You are my constant source of strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are amazing as my " + relationship + ".";
                case "A2" -> "Hello, sister! You bring so much happiness to my life as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kindness as my " + relationship + " makes everything brighter.";
                case "B2" -> "Hi, sister! Your support as my " + relationship + " is a gift every day.";
                case "C1" -> "Hello, sister! I admire your strength and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, sister! Your love and warmth as my " + relationship + " make life so much better.";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're the best " + relationship + ".";
                case "A2" -> "Hello, brother! I look up to you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your strength as my " + relationship + " is inspiring.";
                case "B2" -> "Hi, brother! Your loyalty and support as my " + relationship + " motivate me to do better.";
                case "C1" -> "Hello, brother! I value your advice and encouragement as my " + relationship + ".";
                case "C2" -> "Good day, brother! Watching you grow as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! I’m lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your energy as my " + relationship + " fills me with joy.";
                case "B2" -> "Hi, brother! Your enthusiasm as my " + relationship + " always lifts my spirits.";
                case "C1" -> "Hello, brother! I admire your positivity and humor as my " + relationship + ".";
                case "C2" -> "Good day, brother! You brighten every day with your smile and love as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandma! I love you so much as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your wisdom and love as my " + relationship + " are truly invaluable.";
                case "B2" -> "Hi, grandma! Your presence as my " + relationship + " makes me feel safe and loved.";
                case "C1" -> "Hello, grandma! I look up to you as my " + relationship + " for your strength and grace.";
                case "C2" -> "Good day, grandma! Your warmth as my " + relationship + " fills my heart with peace.";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandma! You make my life so much better as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your love as my " + relationship + " brings so much light into my life.";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " guides me through life.";
                case "C1" -> "Hello, grandma! I am grateful for everything you teach me as my " + relationship + ".";
                case "C2" -> "Good day, grandma! You inspire me with your strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire you so much as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your stories as my " + relationship + " teach me so much.";
                case "B2" -> "Hi, grandpa! Your life lessons as my " + relationship + " shape the person I am today.";
                case "C1" -> "Hello, grandpa! I admire your life experience and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your strength and courage as my " + relationship + " are truly inspiring.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your love and advice as my " + relationship + " mean the world to me.";
                case "B1" -> "Good day, grandpa! Your presence as my " + relationship + " brings me peace and joy.";
                case "B2" -> "Hi, grandpa! Your experiences as my " + relationship + " are always a source of inspiration.";
                case "C1" -> "Hello, grandpa! Your wisdom and kindness as my " + relationship + " guide me every day.";
                case "C2" -> "Good day, grandpa! Your legacy as my " + relationship + " makes me proud of where I come from.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }    

    private String firstDaughterDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, dear mom! I appreciate everything you do for me as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and care as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! Your guidance and support as my " + relationship + " help me grow.";
                case "C1" -> "Hello, mom! Your wisdom and strength as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I am so thankful for your endless love as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're the best " + relationship + ".";
                case "A2" -> "Hello, brother! I look up to you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your strength as my " + relationship + " is inspiring.";
                case "B2" -> "Hi, brother! Your loyalty and support as my " + relationship + " motivate me to do better.";
                case "C1" -> "Hello, brother! I value your advice and encouragement as my " + relationship + ".";
                case "C2" -> "Good day, brother! Watching you grow as my " + relationship + " fills me with pride.";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! I’m lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your energy as my " + relationship + " fills me with joy.";
                case "B2" -> "Hi, brother! Your enthusiasm as my " + relationship + " always lifts my spirits.";
                case "C1" -> "Hello, brother! I admire your positivity and humor as my " + relationship + ".";
                case "C2" -> "Good day, brother! You brighten every day with your smile and love as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my sweet " + relationship + ".";
                case "A2" -> "Hello, sister! Your kindness as my " + relationship + " always brightens my day.";
                case "B1" -> "Good day, sis! Your support as my " + relationship + " is truly invaluable.";
                case "B2" -> "Hi, sister! Your laughter as my " + relationship + " fills my life with joy.";
                case "C1" -> "Hello, sister! Your wisdom and care as my " + relationship + " guide me through tough times.";
                case "C2" -> "Good day, sister! You are my constant source of strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are amazing as my " + relationship + ".";
                case "A2" -> "Hello, sister! You bring so much happiness to my life as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kindness as my " + relationship + " makes everything brighter.";
                case "B2" -> "Hi, sister! Your support as my " + relationship + " is a gift every day.";
                case "C1" -> "Hello, sister! I admire your strength and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, sister! Your love and warmth as my " + relationship + " make life so much better.";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandma! I love you so much as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your wisdom and love as my " + relationship + " are truly invaluable.";
                case "B2" -> "Hi, grandma! Your presence as my " + relationship + " makes me feel safe and loved.";
                case "C1" -> "Hello, grandma! I look up to you as my " + relationship + " for your strength and grace.";
                case "C2" -> "Good day, grandma! Your warmth as my " + relationship + " fills my heart with peace.";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're the best " + relationship + ".";
                case "A2" -> "Hello, grandma! You make my life so much better as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your love as my " + relationship + " brings so much light into my life.";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " guides me through life.";
                case "C1" -> "Hello, grandma! I am grateful for everything you teach me as my " + relationship + ".";
                case "C2" -> "Good day, grandma! You inspire me with your strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire you so much as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your stories as my " + relationship + " teach me so much.";
                case "B2" -> "Hi, grandpa! Your life lessons as my " + relationship + " shape the person I am today.";
                case "C1" -> "Hello, grandpa! I admire your life experience and wisdom as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your strength and courage as my " + relationship + " are truly inspiring.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your love and advice as my " + relationship + " mean the world to me.";
                case "B1" -> "Good day, grandpa! Your presence as my " + relationship + " brings me peace and joy.";
                case "B2" -> "Hi, grandpa! Your experiences as my " + relationship + " are always a source of inspiration.";
                case "C1" -> "Hello, grandpa! Your wisdom and kindness as my " + relationship + " guide me every day.";
                case "C2" -> "Good day, grandpa! Your legacy as my " + relationship + " makes me proud of where I come from.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String secondDaughterDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my wonderful " + relationship + ".";
                case "A2" -> "Hello, mom! I am so grateful for everything you do as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and support as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! I appreciate your guidance and care as my " + relationship + ".";
                case "C1" -> "Hello, mom! Your strength and wisdom as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my great " + relationship + ".";
                case "A2" -> "Hello, brother! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your support as my " + relationship + " helps me through tough times.";
                case "B2" -> "Hi, brother! Your care and attention as my " + relationship + " motivate me to keep going.";
                case "C1" -> "Hello, brother! I look up to you as my " + relationship + " for your wisdom and kindness.";
                case "C2" -> "Good day, brother! I am grateful for your presence and strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, brother! Your energy as my " + relationship + " is contagious.";
                case "B1" -> "Good day, brother! Your presence as my " + relationship + " always cheers me up.";
                case "B2" -> "Hi, brother! Your positive attitude as my " + relationship + " is so uplifting.";
                case "C1" -> "Hello, brother! I admire your determination as my " + relationship + ".";
                case "C2" -> "Good day, brother! You are a true inspiration as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! Your humor as my " + relationship + " makes every day brighter.";
                case "B1" -> "Good day, brother! I love how you always cheer me up as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your fun personality as my " + relationship + " makes everything more exciting.";
                case "C1" -> "Hello, brother! Your sense of humor as my " + relationship + " is one of my favorite things.";
                case "C2" -> "Good day, brother! You bring so much joy as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I feel so lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kind heart as my " + relationship + " always inspires me.";
                case "B2" -> "Hi, sister! I admire your strength and grace as my " + relationship + ".";
                case "C1" -> "Hello, sister! You are my role model as my " + relationship + ".";
                case "C2" -> "Good day, sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You're my precious " + relationship + ".";
                case "A2" -> "Hello, grandma! Your love as my " + relationship + " is irreplaceable.";
                case "B1" -> "Good day, grandma! I always feel comforted by your presence as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! Your experiences as my " + relationship + " are full of valuable lessons.";
                case "C2" -> "Good day, grandma! I appreciate all the love you give as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandma! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your presence as my " + relationship + " makes everything better.";
                case "B2" -> "Hi, grandma! I love hearing your stories as my " + relationship + ".";
                case "C1" -> "Hello, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandma! I’m lucky to have you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire your strength as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your guidance as my " + relationship + " helps me a lot.";
                case "B2" -> "Hi, grandpa! Your experience as my " + relationship + " always provides valuable lessons.";
                case "C1" -> "Hello, grandpa! Your stories as my " + relationship + " are full of wisdom.";
                case "C2" -> "Good day, grandpa! Your influence as my " + relationship + " shapes who I am.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're amazing as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your advice as my " + relationship + " is priceless.";
                case "B1" -> "Good day, grandpa! I always learn something new from you as my " + relationship + ".";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " gives me confidence.";
                case "C1" -> "Hello, grandpa! I admire your patience and understanding as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your knowledge and life experience as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String firstGrandmotherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my wonderful " + relationship + ".";
                case "A2" -> "Hello, mom! I am so grateful for everything you do as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and support as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! I appreciate your guidance and care as my " + relationship + ".";
                case "C1" -> "Hello, mom! Your strength and wisdom as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my great " + relationship + ".";
                case "A2" -> "Hello, brother! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your support as my " + relationship + " helps me through tough times.";
                case "B2" -> "Hi, brother! Your care and attention as my " + relationship + " motivate me to keep going.";
                case "C1" -> "Hello, brother! I look up to you as my " + relationship + " for your wisdom and kindness.";
                case "C2" -> "Good day, brother! I am grateful for your presence and strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, brother! Your energy as my " + relationship + " is contagious.";
                case "B1" -> "Good day, brother! Your presence as my " + relationship + " always cheers me up.";
                case "B2" -> "Hi, brother! Your positive attitude as my " + relationship + " is so uplifting.";
                case "C1" -> "Hello, brother! I admire your determination as my " + relationship + ".";
                case "C2" -> "Good day, brother! You are a true inspiration as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! Your humor as my " + relationship + " makes every day brighter.";
                case "B1" -> "Good day, brother! I love how you always cheer me up as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your fun personality as my " + relationship + " makes everything more exciting.";
                case "C1" -> "Hello, brother! Your sense of humor as my " + relationship + " is one of my favorite things.";
                case "C2" -> "Good day, brother! You bring so much joy as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I feel so lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kind heart as my " + relationship + " always inspires me.";
                case "B2" -> "Hi, sister! I admire your strength and grace as my " + relationship + ".";
                case "C1" -> "Hello, sister! You are my role model as my " + relationship + ".";
                case "C2" -> "Good day, sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my precious " + relationship + ".";
                case "A2" -> "Hello, grandma! Your love as my " + relationship + " is irreplaceable.";
                case "B1" -> "Good day, grandma! I always feel comforted by your presence as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! Your experiences as my " + relationship + " are full of valuable lessons.";
                case "C2" -> "Good day, grandma! I appreciate all the love you give as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandma! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your presence as my " + relationship + " makes everything better.";
                case "B2" -> "Hi, grandma! I love hearing your stories as my " + relationship + ".";
                case "C1" -> "Hello, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandma! I’m lucky to have you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire your strength as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your guidance as my " + relationship + " helps me a lot.";
                case "B2" -> "Hi, grandpa! Your experience as my " + relationship + " always provides valuable lessons.";
                case "C1" -> "Hello, grandpa! Your stories as my " + relationship + " are full of wisdom.";
                case "C2" -> "Good day, grandpa! Your influence as my " + relationship + " shapes who I am.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're amazing as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your advice as my " + relationship + " is priceless.";
                case "B1" -> "Good day, grandpa! I always learn something new from you as my " + relationship + ".";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " gives me confidence.";
                case "C1" -> "Hello, grandpa! I admire your patience and understanding as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your knowledge and life experience as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String secondGrandmotherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my wonderful " + relationship + ".";
                case "A2" -> "Hello, mom! I am so grateful for everything you do as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and support as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! I appreciate your guidance and care as my " + relationship + ".";
                case "C1" -> "Hello, mom! Your strength and wisdom as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my great " + relationship + ".";
                case "A2" -> "Hello, brother! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your support as my " + relationship + " helps me through tough times.";
                case "B2" -> "Hi, brother! Your care and attention as my " + relationship + " motivate me to keep going.";
                case "C1" -> "Hello, brother! I look up to you as my " + relationship + " for your wisdom and kindness.";
                case "C2" -> "Good day, brother! I am grateful for your presence and strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, brother! Your energy as my " + relationship + " is contagious.";
                case "B1" -> "Good day, brother! Your presence as my " + relationship + " always cheers me up.";
                case "B2" -> "Hi, brother! Your positive attitude as my " + relationship + " is so uplifting.";
                case "C1" -> "Hello, brother! I admire your determination as my " + relationship + ".";
                case "C2" -> "Good day, brother! You are a true inspiration as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! Your humor as my " + relationship + " makes every day brighter.";
                case "B1" -> "Good day, brother! I love how you always cheer me up as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your fun personality as my " + relationship + " makes everything more exciting.";
                case "C1" -> "Hello, brother! Your sense of humor as my " + relationship + " is one of my favorite things.";
                case "C2" -> "Good day, brother! You bring so much joy as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I feel so lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kind heart as my " + relationship + " always inspires me.";
                case "B2" -> "Hi, sister! I admire your strength and grace as my " + relationship + ".";
                case "C1" -> "Hello, sister! You are my role model as my " + relationship + ".";
                case "C2" -> "Good day, sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my precious " + relationship + ".";
                case "A2" -> "Hello, grandma! Your love as my " + relationship + " is irreplaceable.";
                case "B1" -> "Good day, grandma! I always feel comforted by your presence as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! Your experiences as my " + relationship + " are full of valuable lessons.";
                case "C2" -> "Good day, grandma! I appreciate all the love you give as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandma! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your presence as my " + relationship + " makes everything better.";
                case "B2" -> "Hi, grandma! I love hearing your stories as my " + relationship + ".";
                case "C1" -> "Hello, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandma! I’m lucky to have you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! I admire your strength as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your guidance as my " + relationship + " helps me a lot.";
                case "B2" -> "Hi, grandpa! Your experience as my " + relationship + " always provides valuable lessons.";
                case "C1" -> "Hello, grandpa! Your stories as my " + relationship + " are full of wisdom.";
                case "C2" -> "Good day, grandpa! Your influence as my " + relationship + " shapes who I am.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You're amazing as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your advice as my " + relationship + " is priceless.";
                case "B1" -> "Good day, grandpa! I always learn something new from you as my " + relationship + ".";
                case "B2" -> "Hi, grandpa! Your love as my " + relationship + " gives me confidence.";
                case "C1" -> "Hello, grandpa! I admire your patience and understanding as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your knowledge and life experience as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String firstGrandfatherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my wonderful " + relationship + ".";
                case "A2" -> "Hello, mom! I am so grateful for everything you do as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and support as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! I appreciate your guidance and care as my " + relationship + ".";
                case "C1" -> "Hello, mom! Your strength and wisdom as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my great " + relationship + ".";
                case "A2" -> "Hello, brother! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your support as my " + relationship + " helps me through tough times.";
                case "B2" -> "Hi, brother! Your care and attention as my " + relationship + " motivate me to keep going.";
                case "C1" -> "Hello, brother! I look up to you as my " + relationship + " for your wisdom and kindness.";
                case "C2" -> "Good day, brother! I am grateful for your presence and strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, brother! Your energy as my " + relationship + " is contagious.";
                case "B1" -> "Good day, brother! Your presence as my " + relationship + " always cheers me up.";
                case "B2" -> "Hi, brother! Your positive attitude as my " + relationship + " is so uplifting.";
                case "C1" -> "Hello, brother! I admire your determination as my " + relationship + ".";
                case "C2" -> "Good day, brother! You are a true inspiration as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! Your humor as my " + relationship + " makes every day brighter.";
                case "B1" -> "Good day, brother! I love how you always cheer me up as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your fun personality as my " + relationship + " makes everything more exciting.";
                case "C1" -> "Hello, brother! Your sense of humor as my " + relationship + " is one of my favorite things.";
                case "C2" -> "Good day, brother! You bring so much joy as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I feel so lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kind heart as my " + relationship + " always inspires me.";
                case "B2" -> "Hi, sister! I admire your strength and grace as my " + relationship + ".";
                case "C1" -> "Hello, sister! You are my role model as my " + relationship + ".";
                case "C2" -> "Good day, sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my precious " + relationship + ".";
                case "A2" -> "Hello, grandma! Your love as my " + relationship + " is irreplaceable.";
                case "B1" -> "Good day, grandma! I always feel comforted by your presence as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! Your experiences as my " + relationship + " are full of valuable lessons.";
                case "C2" -> "Good day, grandma! I appreciate all the love you give as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandma! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your presence as my " + relationship + " makes everything better.";
                case "B2" -> "Hi, grandma! I love hearing your stories as my " + relationship + ".";
                case "C1" -> "Hello, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandma! I’m lucky to have you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You’re my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! You’re so strong and wise as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom and experience as my " + relationship + " guide me through life.";
                case "B2" -> "Hi, grandpa! Your strength and love as my " + relationship + " inspire me every day.";
                case "C1" -> "Hello, grandpa! I admire your perspective as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your life lessons as my " + relationship + " have shaped who I am.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You’re amazing as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your advice as my " + relationship + " is always so helpful.";
                case "B1" -> "Good day, grandpa! I always learn so much from you as my " + relationship + ".";
                case "B2" -> "Hi, grandpa! Your humor and wisdom as my " + relationship + " always brighten my day.";
                case "C1" -> "Hello, grandpa! Your insights as my " + relationship + " always help me grow.";
                case "C2" -> "Good day, grandpa! Your experiences as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }

    private String secondGrandfatherDialogue(FamilyMember toWhom, String relationship) {
        return switch (toWhom.getName()) {
            case "Мати" -> switch (englishLevel) {
                case "A1" -> "Hi, mom! You are my wonderful " + relationship + ".";
                case "A2" -> "Hello, mom! I am so grateful for everything you do as my " + relationship + ".";
                case "B1" -> "Good day, mom! Your love and support as my " + relationship + " mean the world to me.";
                case "B2" -> "Hi, mom! I appreciate your guidance and care as my " + relationship + ".";
                case "C1" -> "Hello, mom! Your strength and wisdom as my " + relationship + " inspire me every day.";
                case "C2" -> "Good day, mom! I cherish every moment with you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are my great " + relationship + ".";
                case "A2" -> "Hello, brother! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, brother! Your support as my " + relationship + " helps me through tough times.";
                case "B2" -> "Hi, brother! Your care and attention as my " + relationship + " motivate me to keep going.";
                case "C1" -> "Hello, brother! I look up to you as my " + relationship + " for your wisdom and kindness.";
                case "C2" -> "Good day, brother! I am grateful for your presence and strength as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Другий син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You are the best " + relationship + ".";
                case "A2" -> "Hello, brother! Your energy as my " + relationship + " is contagious.";
                case "B1" -> "Good day, brother! Your presence as my " + relationship + " always cheers me up.";
                case "B2" -> "Hi, brother! Your positive attitude as my " + relationship + " is so uplifting.";
                case "C1" -> "Hello, brother! I admire your determination as my " + relationship + ".";
                case "C2" -> "Good day, brother! You are a true inspiration as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Третій син" -> switch (englishLevel) {
                case "A1" -> "Hi, brother! You're awesome as my " + relationship + ".";
                case "A2" -> "Hello, brother! Your humor as my " + relationship + " makes every day brighter.";
                case "B1" -> "Good day, brother! I love how you always cheer me up as my " + relationship + ".";
                case "B2" -> "Hi, brother! Your fun personality as my " + relationship + " makes everything more exciting.";
                case "C1" -> "Hello, brother! Your sense of humor as my " + relationship + " is one of my favorite things.";
                case "C2" -> "Good day, brother! You bring so much joy as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша донька" -> switch (englishLevel) {
                case "A1" -> "Hi, sister! You are my lovely " + relationship + ".";
                case "A2" -> "Hello, sister! I feel so lucky to have you as my " + relationship + ".";
                case "B1" -> "Good day, sister! Your kind heart as my " + relationship + " always inspires me.";
                case "B2" -> "Hi, sister! I admire your strength and grace as my " + relationship + ".";
                case "C1" -> "Hello, sister! You are my role model as my " + relationship + ".";
                case "C2" -> "Good day, sister! You make my life so much better as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перша бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my precious " + relationship + ".";
                case "A2" -> "Hello, grandma! Your love as my " + relationship + " is irreplaceable.";
                case "B1" -> "Good day, grandma! I always feel comforted by your presence as my " + relationship + ".";
                case "B2" -> "Hi, grandma! Your wisdom as my " + relationship + " is a treasure.";
                case "C1" -> "Hello, grandma! Your experiences as my " + relationship + " are full of valuable lessons.";
                case "C2" -> "Good day, grandma! I appreciate all the love you give as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Друга бабуся" -> switch (englishLevel) {
                case "A1" -> "Hi, grandma! You are my favorite " + relationship + ".";
                case "A2" -> "Hello, grandma! You always make me smile as my " + relationship + ".";
                case "B1" -> "Good day, grandma! Your presence as my " + relationship + " makes everything better.";
                case "B2" -> "Hi, grandma! I love hearing your stories as my " + relationship + ".";
                case "C1" -> "Hello, grandma! Your wisdom and love as my " + relationship + " inspire me.";
                case "C2" -> "Good day, grandma! I’m lucky to have you as my " + relationship + ".";
                default -> "Hi!";
            };
            case "Перший дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You’re my hero as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! You’re so strong and wise as my " + relationship + ".";
                case "B1" -> "Good day, grandpa! Your wisdom and experience as my " + relationship + " guide me through life.";
                case "B2" -> "Hi, grandpa! Your strength and love as my " + relationship + " inspire me every day.";
                case "C1" -> "Hello, grandpa! I admire your perspective as my " + relationship + ".";
                case "C2" -> "Good day, grandpa! Your life lessons as my " + relationship + " have shaped who I am.";
                default -> "Hi!";
            };
            case "Другий дідусь" -> switch (englishLevel) {
                case "A1" -> "Hi, grandpa! You’re amazing as my " + relationship + ".";
                case "A2" -> "Hello, grandpa! Your advice as my " + relationship + " is always so helpful.";
                case "B1" -> "Good day, grandpa! I always learn so much from you as my " + relationship + ".";
                case "B2" -> "Hi, grandpa! Your humor and wisdom as my " + relationship + " always brighten my day.";
                case "C1" -> "Hello, grandpa! Your insights as my " + relationship + " always help me grow.";
                case "C2" -> "Good day, grandpa! Your experiences as my " + relationship + " are invaluable.";
                default -> "Hi!";
            };
            default -> "Hello!";
        };
    }
    
    
}

public class Comunication {
    public static void main(String[] args) {
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Батько", 50, "Лікар"));
        family.add(new FamilyMember("Мати", 50, "Вчитель"));
        family.add(new FamilyMember("Перший син", 23, "Будівельник"));
        family.add(new FamilyMember("Другий син", 13, "Школяр"));
        family.add(new FamilyMember("Третій син", 3, "Малюк"));
        family.add(new FamilyMember("Перша донька", 18, "Програміст-дизайнер"));
        family.add(new FamilyMember("Друга донька", 8, "Школярка"));
        family.add(new FamilyMember("Перша бабуся", 70, "Пенсіонерка"));
        family.add(new FamilyMember("Друга бабуся", 70, "Пенсіонерка"));
        family.add(new FamilyMember("Перший дідусь", 70, "Пенсіонер"));
        family.add(new FamilyMember("Другий дідусь", 70, "Пенсіонер"));

        // Додаємо взаємовідносини для кожного члена родини
        family.get(0).addRelationship("Мати", "Дружина");
        family.get(0).addRelationship("Перший син", "Син");
        family.get(0).addRelationship("Другий син", "Син");
        family.get(0).addRelationship("Третій син", "Син");
        family.get(0).addRelationship("Перша донька", "Донька");
        family.get(0).addRelationship("Друга донька", "Донечка");
        family.get(0).addRelationship("Перша бабуся", "Мати");
        family.get(0).addRelationship("Друга бабуся", "Теща");
        family.get(0).addRelationship("Перший дідусь", "Батько");
        family.get(0).addRelationship("Другий дідусь", "Тесть");

        family.get(1).addRelationship("Батько", "Чоловік");
        family.get(1).addRelationship("Перший син", "Син");
        family.get(1).addRelationship("Другий син", "Син");
        family.get(1).addRelationship("Третій син", "Син");
        family.get(1).addRelationship("Перша донька", "Донька");
        family.get(1).addRelationship("Друга донька", "Донечка");
        family.get(1).addRelationship("Перша бабуся", "Теща");
        family.get(1).addRelationship("Друга бабуся", "Мати");
        family.get(1).addRelationship("Перший дідусь", "Тесть");
        family.get(1).addRelationship("Другий дідусь", "Батько");

        family.get(2).addRelationship("Батько", "Батько");
        family.get(2).addRelationship("Мати", "Мати");
        family.get(2).addRelationship("Другий син", "Молодший брат");
        family.get(2).addRelationship("Третій син", "Брат малаюк");
        family.get(2).addRelationship("Перша донька", "Сестра забіяка");
        family.get(2).addRelationship("Друга донька", "Молодша сестричка");
        family.get(2).addRelationship("Перша бабуся", "Бабуся");
        family.get(2).addRelationship("Друга бабуся", "Бабуся");
        family.get(2).addRelationship("Перший дідусь", "Дідусь");
        family.get(2).addRelationship("Другий дідусь", "Дідусь");

        family.get(3).addRelationship("Батько", "Батько");
        family.get(3).addRelationship("Мати", "Мати");
        family.get(3).addRelationship("Перший син", "Старший брат");
        family.get(3).addRelationship("Третій син", "Брат малаюк");
        family.get(3).addRelationship("Перша донька", "Старша сестричка");
        family.get(3).addRelationship("Друга донька", "Молодша сестричка");
        family.get(3).addRelationship("Перша бабуся", "Бабуся");
        family.get(3).addRelationship("Друга бабуся", "Бабуся");
        family.get(3).addRelationship("Перший дідусь", "Дідусь");
        family.get(3).addRelationship("Другий дідусь", "Дідусь");

        family.get(4).addRelationship("Батько", "Батько");
        family.get(4).addRelationship("Мати", "Мати");
        family.get(4).addRelationship("Перший син", "Старший брат");
        family.get(4).addRelationship("Другий син", "Любимий братик");
        family.get(4).addRelationship("Перша донька", "Старша сестричка");
        family.get(4).addRelationship("Друга донька", "Старша сестричка");
        family.get(4).addRelationship("Перша бабуся", "Бабуся");
        family.get(4).addRelationship("Друга бабуся", "Бабуся");
        family.get(4).addRelationship("Перший дідусь", "Дідусь");
        family.get(4).addRelationship("Другий дідусь", "Дідусь");

        // Симуляція навчання
        System.out.println("Сім'я починає відвідувати курси англійської мови...\n");
        for (FamilyMember member : family) {
            simulateLearning(member);
        }

        // Відображення результатів
        System.out.println("\nРезультати навчання:\n");
        for (FamilyMember member : family) {
            member.displayInfo();
        }

        // Діалоги
        System.out.println("\nДіалоги між членами сім'ї:\n");
        for (FamilyMember member : family) {
            System.out.println("\n===================================================\n");
            for (FamilyMember other : family) {
                if (!member.equals(other)) {
                    member.speak(other); 
                }
            }
        }

    }

    private static void simulateLearning(FamilyMember member) {
        String[] levels = {"A1", "A2", "B1", "B2", "C1", "C2"};
        Random random = new Random();
        int newLevelIndex = random.nextInt(levels.length);
        member.setEnglishLevel(levels[newLevelIndex]);
    }
}