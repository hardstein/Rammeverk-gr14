package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyText {

    private int dummyTextWords;
    final List<String> words = new ArrayList<>();
    String FILLER_TEXT = "Delichon is a genus of birds in the swallow family containing four species named as house martins. These are chunky, bull-headed and short-tailed birds, blackish-blue above, with a white rump and white or grey underparts. They have feathering on their toes and tarsi. They breed in Europe, Asia and the mountains of North Africa. The common (example pictured), Siberian and Asian house martins all migrate south in winter, while the Nepal house martin is resident in the Himalayas. House martins nest in colonies on cliffs or buildings. Both parents build the lined mud nest, incubate the three or four white eggs of a typical clutch and feed the chicks. Aerial hunters of small insects, they may be caught by fast birds of prey and may carry fleas or other parasites. None of the species are considered threatened, although common house martin numbers have declined in parts of Europe due to poor weather, poisoning by pesticides and nest-site competition with house sparrows.";

    StringBuilder stringBuilder = new StringBuilder();

    public DummyText(int dummyTextWords) {
        this.dummyTextWords = dummyTextWords;
    }

    public int getDummyTextWords() {
        return dummyTextWords;
    }

    public void setDummyTextWords(int dummyTextWords) {
        this.dummyTextWords = dummyTextWords;
    }

    public String createDummyText() {
        String[] textSplit = new String[0];
        String appendedText = null;
        Random random = new Random();

        words.add(FILLER_TEXT);

        for (String text : words) {
            textSplit = text.split("[,.{} ():+]");
        }

        stringBuilder.append(" ");
        for (int i = 0; i < getDummyTextWords(); i++) {
            int randNumb = random.nextInt(textSplit.length);
            appendedText = String.valueOf(stringBuilder.append(textSplit[randNumb]));
            stringBuilder.append(" ");
        }

        int i = 0;
        assert appendedText != null;
        if (appendedText.contains(" ")) {
            appendedText = appendedText.replaceAll(" +", " ");  // Replace double-space with single
        }
        String lower = appendedText.toLowerCase();
        char firstLetter = appendedText.charAt(i);
        String firstLetterString = Character.toString(firstLetter);

        if (firstLetterString.equals(" ")) {
            String spaceRemove = lower.substring(1); // Removes space if it's the first char.
            char newfirstLetter = spaceRemove.charAt(i);
            firstLetterString = Character.toString(newfirstLetter);
            String firstUpper = firstLetterString.toUpperCase();
//            System.out.println(firstUpper + ny.substring(1) + ".");

            return firstUpper + spaceRemove.substring(1) + ".";
        } else {
            String firstUpper = firstLetterString.toUpperCase();
//            System.out.println(firstUpper + lower.substring(1) + ".");
            return firstUpper + lower.substring(1) + ".";
        }
    }

//    public static void main(String[] args) {
//        DummyText dummy = new DummyText(5);
//        System.out.println(dummy.createDummyText());
//    }
}
