import java.util.*;
public class QuizGmae {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Welcome to Quiz Application");
		System.out.println("Enter the name:");
		 String Name =sc.next();
		 System.out.println("Enter the mobilenumber:");
		 int mobileno=sc.nextInt();
		System.out.println("Enter the email id :");
		String email=sc.next();
		System.out.println("Are you ready to take the quiz?(y/n)");
		String Ready=sc.next();
		if(!Ready.equalsIgnoreCase("y")) {
			System.out.println("Game terminated.Thank you for coming!");
			System.exit(0);
		//return;
		}
		
		//rules
		System.out.println("\nRules");
		System.out.println("1.There are 10 questions and each question has a 10 pionts");
		System.out.println("2.Each question has 4 options.");
		System.out.println("3.You have 2 lifelines.");
		System.out.println("4.A wrong answers ends the game.");
		System.out.println("5.Correct answer earn points.");
		System.out.println("6.Remember the Lifeline can be used only one time.\n");
		//variables
		int score=0;
		int lifeline=2;
		//1st Questions
		//Scanner sc = new Scanner(System.in);
			System.out.println("Question 1:What is the capital of France?");
			System.out.println("a)Berlin  .");
			System.out.println("b)Madrid .");
			System.out.println("c)pairs .");
			System.out.println("d)Rome .");
			System.out.println("Do you want to use Lifeline?(y/n):");
			String Lifeline1=sc.next();
			if(Lifeline1.equalsIgnoreCase("y")) {
				if(lifeline>0) {
					lifeline--;
					System.out.println("Lifeline used! Hint: The answer is 'c'.");
				}
				else{
					System.out.println("No lifeline left.");
				}
			}
			System.out.println("Enter your answer(a/b/c/d):");
			String answer1=sc.next();
			if(answer1.equalsIgnoreCase("c")) {
				System.out.println("Corrcet!:your score 10\n");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
			return;
				
				
			}
			//2nd Question
			System.out.println("Question 2:What is the largest planet in our solar system?");
			System.out.println("a)Earth .");
			System.out.println("b)Jupiter .");
			System.out.println("c)Saturn .");
			System.out.println("d)Mars .");
			System.out.println("Do you want to use a lifeline?(y/n):");
			String Lifeline2=sc.next();
			if(Lifeline2.equalsIgnoreCase("y")) {
				if(lifeline>0) {
					lifeline--;
					System.out.println("Lifeline used! Hint: The answer is 'b'.");
				}
				else{
					System.out.println("No lifeline left.");
				}
			System.out.println("Enter your answer(a/b/c/d):");
			String answer2=sc.next();
			if(answer2.equalsIgnoreCase("b")) {
				System.out.println("Corrcet!:your score 10\n");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
			}
			//3rd Question
					System.out.println("Question 3:Who is the father of genetics?");
					System.out.println("a)Charles Darwin  .");
					System.out.println("b)Gergor Mendel  .");
					System.out.println("c)Galileo Galilei  .");
					System.out.println("d)Isaac Netwon .");
					System.out.print("Do you want to use a lifeline?(y/n):");
					String Lifeline3=sc.next();
					if(Lifeline3.equalsIgnoreCase("y")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'b'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer3=sc.next();
					if(answer3.equalsIgnoreCase("b")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
					//4th Question
					System.out.println("Question 4:who was the president of the united States?");
					System.out.println("a)Thomas Jafferson  .");
					System.out.println("b)George Washington  .");
					System.out.println("c)Abraham Lincon  .");
					System.out.println("d)Franklin .");
					System.out.println("Do you want to use a lifeline?(y/n):");
					String Lifeline4=sc.next();
					if(Lifeline4.equalsIgnoreCase("y")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'b'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer4=sc.next();
					if(answer4.equalsIgnoreCase("b")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
					//5th Question
					System.out.println("Question 5:who composed Symphony no.9?");
					System.out.println("a)Wolfgang.");
					System.out.println("b)Johann  .");
					System.out.println("c)Pyotr llyich  .");
					System.out.println("d)Ludwing .");
					System.out.println("Do you want to use a lifeline?(y/n):");
					String Lifeline5=sc.next();
					if(Lifeline5.equalsIgnoreCase("y")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'd'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer5=sc.next();
					if(answer5.equalsIgnoreCase("d")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
					//6th Question
					System.out.println("Question 6:What is the world's largest desert?");
					System.out.println("a)Sahara Desert  .");
					System.out.println("b)Gobi Desert .");
					System.out.println("c)Mojava Desert  .");
					System.out.println("d)Atacama Desert .");
					System.out.println("Do you want to use a lifeline?(y/n):");
					String Lifeline6=sc.next();
					if(Lifeline6.equalsIgnoreCase("y")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'a'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer6=sc.next();
					if(answer6.equalsIgnoreCase("a")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
					//7th Question
					System.out.println("Question 7:Who Co-founder Microsoft ?");
					System.out.println("a)Billgates And Steve  .");
					System.out.println("b)Billgates And paul  .");
					System.out.println("c)Markzuckerberg And ElonMusk  .");
					System.out.println("d)Larrgpage And SergeyBrin .");
					System.out.println("Do you want to use a lifeline?(y/n):");
					String Lifeline7=sc.next();
					if(Lifeline7.equalsIgnoreCase("yes")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'b'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer7=sc.next();
					if(answer7.equalsIgnoreCase("b")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
					//8th Question
					System.out.println("Question 8:Which river is the longest in south America?");
					System.out.println("a)Amazon .");
					System.out.println("b)Parana .");
					System.out.println("c)Sao Francisco .");
					System.out.println("d)Magdalena .");
					System.out.println("Do you want to use a lifeline?(y/n):");
					String Lifeline8=sc.next();
					if(Lifeline8.equalsIgnoreCase("y")) {
						if(lifeline>0) {
							lifeline--;
							System.out.println("Lifeline used! Hint: The answer is 'a'.");
						}
						else{
							System.out.println("No lifeline left.");
						}
					System.out.println("Enter your answer(a/b/c/d):");
					String answer8=sc.next();
					if(answer8.equalsIgnoreCase("a")) {
						System.out.println("Corrcet!:your score 10\n");
						score+=10;
					}else {
						System.out.println("Wrong answer.Game over!");
						System.out.println("You total score:"+score);
						return;
					}
						//9th Question
						System.out.println("Question 9:Which ancient civilization built the Graet pyramid of Gize?");
						System.out.println("a)Romans .");
						System.out.println("b)Egyptians .");
						System.out.println("c)Greeks .");
						System.out.println("d)Mesopotamians .");
						System.out.println("Do you want to use a lifeline?(y/n):");
						String Lifeline9=sc.next();
						if(Lifeline9.equalsIgnoreCase("y")) {
							if(lifeline>0) {
								lifeline--;
								System.out.println("Lifeline used! Hint: The answer is 'b'.");
							}
							else{
								System.out.println("No lifeline left.");
							}
						System.out.println("Enter your answer(a/b/c/d):");
						String answer9=sc.next();
						if(answer9.equalsIgnoreCase("b")) {
							System.out.println("Corrcet!:your score 10\n");
							score+=10;
						}else {
							System.out.println("Wrong answer.Game over!");
							System.out.println("You total score:"+score);
							return;
						}
						//10th Question
						System.out.println("Question 10:What does CPU stand form ?");
						System.out.println("a)Computer pragramming unit .");
						System.out.println("b)Central Processing Unit .");
						System.out.println("c)Cybernetic Processing Unit  .");
						System.out.println("d)Central power Unit .");
						System.out.println("Do you want to use a lifeline?(y/n):");
						String Lifeline10=sc.next();
						if(Lifeline10.equalsIgnoreCase("y")) {
							if(lifeline>0) {
								lifeline--;
								System.out.println("Lifeline used! Hint: The answer is 'b'.");
							}
							else{
								System.out.println("No lifeline left.");
							}
						System.out.println("Enter your answer(a/b/c/d):");
						String answer10=sc.next();
						if(answer10.equalsIgnoreCase("b")) {
							System.out.println("Corrcet!:your score 10\n");
							score+=10;
						}else {
							System.out.println("Wrong answer.Game over!");
							System.out.println("You total score:"+score);
							return;
						}
					
			System.out.println("\n Congratulations!You completed the questions of quiz");
			
			System.out.println("Your total score:"+score);
						}
						}
					}
					}
					}
					}
					}
					}
			}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Input is valid");
		}
	}
}