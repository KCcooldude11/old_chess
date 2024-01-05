import java.util.*;
import java.io.File;

class QuizQuestion {
    private String question;
    private String answer;
    public QuizQuestion(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }

}
public class Quiz {
    public static void main(String[] args) {
        List<QuizQuestion> questions = loadQuestionsFromFile("questions.txt");
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for(QuizQuestion quizQuestion : questions){
            System.out.println(quizQuestion.getQuestion());
            String userAnswer = getUserInput();

            if(userAnswer.equalsIgnoreCase(quizQuestion.getAnswer())){
                System.out.println("Correct!\n");
                score++;
            }
            else{
                System.out.println("Incorrect. The correct answer is: " + quizQuestion.getAnswer() + "\n");
            }
        }
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.size());
    }
    private static List<QuizQuestion> loadQuestionsFromFile(String filename){
        List<QuizQuestion> questions = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    questions.add(new QuizQuestion(parts[0], parts[1]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return questions;
    }
    private static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }
}


