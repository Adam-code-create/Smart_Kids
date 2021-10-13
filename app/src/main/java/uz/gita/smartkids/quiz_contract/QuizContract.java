package uz.gita.smartkids.quiz_contract;

import java.util.ArrayList;

import uz.gita.smartkids.data.QuestionData;

public interface QuizContract {

    //Ma'lumotlarga bog'liq interface
    interface Model {
        ArrayList<QuestionData> getQuestions ();
        QuestionData getQuestionByIndex (int index);
        ArrayList<QuestionData> getQuestionsByGroup( int index);

    }

    // Ma'lumotlarni yuklash va korsatishga bog'liq interface
    interface  View {

        void setQuestion(QuestionData data);

        void updateSelection (int index, boolean isCheked);

        void showMessage (String text);

        void finishTest (int correctAnswer, int wrongAnswer);

        int getQuestionGroup();


        void home();
    }


    //user tomonidan bajariladigan amallarga bog`liq interface
    interface Presenter {
        void selectVariant (int index);

        void nextBtn ();


        void homeBtn();
    }


}
