package uz.gita.smartkids.quiz_presenter;
import uz.gita.smartkids.data.QuestionData;
import uz.gita.smartkids.quiz_contract.QuizContract;

public class QuizPresenter implements QuizContract.Presenter {
    private QuizContract.View view;
    private QuizContract.Model model;
    private int lastSelectedVariant = -1;
    private int currentQuestion;
    private int correctAnswer;
    private int wrongAnswer;
    private int sectionNumber;

    public QuizPresenter(QuizContract.View view, QuizContract.Model model) {
        this.view = view;
        this.model = model;
        nextQuestion();

    }

    @Override
    public void selectVariant(int index) {
        if (lastSelectedVariant != -1){
            view.updateSelection(lastSelectedVariant, false);
        }
        view.updateSelection(index, true);
        lastSelectedVariant = index;
    }

    @Override
    public void nextBtn() {
        checkVariant();
        if (isFinish()){
            view.finishTest(correctAnswer, wrongAnswer);
            return;
        }
        nextQuestion();

    }

    @Override
    public void homeBtn() {
        view.home();

    }

    private void checkVariant (){
        if (isFinish()) return;
        if (lastSelectedVariant!=-1){
            QuestionData data = model.getQuestionsByGroup(sectionNumber).get(currentQuestion);
            String answer = data.getAnswer();
            String originalAnswer = data.getVariantByIndex(lastSelectedVariant);
            if (originalAnswer.equals(answer)){
                correctAnswer++;
            }else wrongAnswer++;
            view.updateSelection(lastSelectedVariant, false);
            currentQuestion++;
            lastSelectedVariant =-1;
        } else view.showMessage("Please choose a variant");

    }
    private boolean isFinish (){

        return currentQuestion == 10;
    }
    private void nextQuestion (){
        sectionNumber = view.getQuestionGroup();
        if (isFinish()) return;
         currentQuestion = sectionNumber + currentQuestion;
        if (currentQuestion>=sectionNumber &&  currentQuestion< sectionNumber+10){
            QuestionData data = model.getQuestions().get(currentQuestion);
            view.setQuestion(data);
            currentQuestion = currentQuestion-sectionNumber;
        }

    }
}
