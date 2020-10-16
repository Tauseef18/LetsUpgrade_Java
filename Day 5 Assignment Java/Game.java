package com.quizapplication2;

public class Game {

    Question[] questions = new Question[3];
    Player player = new Player();

    String questionsData[] = {"Who is the Captain of Indian Cricket Team ? ",
                                "Who has created React ? ",
    "Which is the first programming language ? "};
    String[] options1 = {"Rohit Sharma", "Rasmus Lerdorf", "Fortran"};
    String[] options2 = {"M S Dhoni", "James Gosling", "JavaScript"};
    String[] options3 = {"Virat Kohli", "Larry Wall", "Java"};
    String[] options4 = {"KL Rahul", "Jordan Walke", "C"};
    int[] answers = {3, 4, 1};


    public void inItGame(){

        for (int i=0; i<3; i++) {
            questions[i] = new Question();

            questions[i].question = questionsData[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }
    }


    public void play(){
        player.getDetails();
        for (int i=0; i<3; i++){
            boolean status = questions[i].askQuestion();

            if (status == true){
                player.score++;
            }else{
                player.score--;
            }

        }
        System.out.println(player.name + " your score is " + player.score);

    }
}
