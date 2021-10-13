package uz.gita.smartkids.data;

public class QuestionData {
    private String question;
    private String varA;
    private String varB;
    private String varC;
    private String varD;
    private String answer;

    public QuestionData(String question, String varA, String varB, String varC, String varD, String answer) {
        this.question = question;
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
        this.varD = varD;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }
    public String getVariantByIndex (int index){
        if (index==0) return varA;
        if (index==1) return varB;
        if (index==2) return varC;
        if (index==3) return varD;
        throw new IllegalArgumentException("Xato argument berildi");
    }


    public String getAnswer() {
        return answer;
    }
}
