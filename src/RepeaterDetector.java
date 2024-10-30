public class RepeaterDetector implements PatternDetector {
    private int index;
    private String sequence;

    public RepeaterDetector(char letter, int times) {
        for (int i = 0; i < times; i++) {
            sequence += letter;
        }
    }

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        index = analyzer.findSimpleSequence(sequence);
        return index;
    }

    @Override
    public String labelString() {
        return "Genius Detector detects if a Martian repeats his words. A word repeater has “GGGGG” anywhere in its genome. ";
    }

    @Override
    public String additionalInfo() {
        return "Pattern 'GGGGG' detected at index" + index;
    }
}
